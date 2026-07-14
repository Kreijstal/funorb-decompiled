/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class rk implements Runnable {
    private qg field_b;
    private int field_j;
    private boolean field_n;
    private int field_i;
    private InputStream field_g;
    private pn field_e;
    static String[] field_k;
    private OutputStream field_o;
    private boolean field_m;
    private java.net.Socket field_h;
    static String field_a;
    static long field_l;
    static String[] field_f;
    private byte[] field_c;
    private int field_d;

    public static void a(boolean param0) {
        if (!param0) {
          field_f = null;
          field_a = null;
          field_k = null;
          field_f = null;
          return;
        } else {
          field_a = null;
          field_k = null;
          field_f = null;
          return;
        }
    }

    final void a(byte[] param0, boolean param1, int param2, int param3) throws IOException {
        int var5 = 0;
        int var6 = 0;
        var6 = DungeonAssault.field_K;
        if (((rk) this).field_m) {
          return;
        } else {
          if (param1) {
            ((rk) this).field_i = 17;
            L0: while (true) {
              if ((param2 ^ -1) < -1) {
                var5 = ((rk) this).field_g.read(param0, param3, param2);
                if (var5 <= 0) {
                  throw new EOFException();
                } else {
                  param2 = param2 - var5;
                  param3 = param3 + var5;
                  continue L0;
                }
              } else {
                return;
              }
            }
          } else {
            L1: while (true) {
              if ((param2 ^ -1) < -1) {
                var5 = ((rk) this).field_g.read(param0, param3, param2);
                if (var5 <= 0) {
                  throw new EOFException();
                } else {
                  param2 = param2 - var5;
                  param3 = param3 + var5;
                  continue L1;
                }
              } else {
                return;
              }
            }
          }
        }
    }

    protected final void finalize() {
        ((rk) this).c(-6624);
    }

    final int a(int param0) throws IOException {
        if (param0 != 0) {
            rk.a(false);
            if (!(!((rk) this).field_m)) {
                return 0;
            }
            return ((rk) this).field_g.available();
        }
        if (!(!((rk) this).field_m)) {
            return 0;
        }
        return ((rk) this).field_g.available();
    }

    final void b(int param0) throws IOException {
        int var2 = 0;
        var2 = 117 / ((param0 - -9) / 51);
        if (!((rk) this).field_m) {
          if (((rk) this).field_n) {
            ((rk) this).field_n = false;
            throw new IOException();
          } else {
            return;
          }
        } else {
          return;
        }
    }

    rk(java.net.Socket param0, qg param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void c(int param0) {
        Object var2 = null;
        InterruptedException var2_ref = null;
        Object var2_ref2 = null;
        Throwable var3 = null;
        int var4 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = DungeonAssault.field_K;
                    if (param0 == -6624) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    ((rk) this).field_o = null;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (!((rk) this).field_m) {
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
                    var2_ref2 = this;
                    // monitorenter this
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        ((rk) this).field_m = true;
                        this.notifyAll();
                        // monitorexit var2_ref2
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
                        // monitorexit var2_ref2
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
                    if (((rk) this).field_e != null) {
                        statePc = 11;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (((rk) this).field_e.field_c != 0) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    pj.a(param0 + 6624, 1L);
                    statePc = 11;
                    continue stateLoop;
                }
                case 13: {
                    if (1 == ((rk) this).field_e.field_c) {
                        statePc = 15;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 15: {
                    try {
                        ((Thread) ((rk) this).field_e.field_f).join();
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    var2_ref = (InterruptedException) (Object) caughtException;
                    statePc = 21;
                    continue stateLoop;
                }
                case 18: {
                    ((rk) this).field_e = null;
                    return;
                }
                case 19: {
                    ((rk) this).field_e = null;
                    return;
                }
                case 20: {
                    ((rk) this).field_e = null;
                    return;
                }
                case 21: {
                    ((rk) this).field_e = null;
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int a(byte param0) throws IOException {
        if (param0 == -108) {
          if (((rk) this).field_m) {
            return 0;
          } else {
            return ((rk) this).field_g.read();
          }
        } else {
          ((rk) this).field_g = null;
          if (((rk) this).field_m) {
            return 0;
          } else {
            return ((rk) this).field_g.read();
          }
        }
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
                        var6 = DungeonAssault.field_K;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3 = this;
                            if (((rk) this).field_i == ((rk) this).field_d) {
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
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 31;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (((rk) this).field_m) {
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
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 31;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 31;
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
                            statePc = 31;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var2 = ((rk) this).field_d;
                            if (((rk) this).field_d <= ((rk) this).field_i) {
                                statePc = 9;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 31;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var1_int = -((rk) this).field_d + ((rk) this).field_j;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 31;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            var1_int = ((rk) this).field_i - ((rk) this).field_d;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 31;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            if (-1 <= (var1_int ^ -1)) {
                                statePc = 1;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 31;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            ((rk) this).field_o.write(((rk) this).field_c, var2, var1_int);
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = (stateCaught_11 instanceof IOException ? 13 : 31);
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 31;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            var3_ref = (IOException) (Object) caughtException;
                            ((rk) this).field_n = true;
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
                            ((rk) this).field_d = (((rk) this).field_d + var1_int) % ((rk) this).field_j;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 31;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (((rk) this).field_i == ((rk) this).field_d) {
                                statePc = 17;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof IOException ? 19 : 31);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof IOException ? 19 : 31);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            ((rk) this).field_o.flush();
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof IOException ? 19 : 31);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
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
                            var3_ref = (IOException) (Object) caughtException;
                            ((rk) this).field_n = true;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 31;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (((rk) this).field_g == null) {
                                statePc = 22;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof IOException ? 28 : 31);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            ((rk) this).field_g.close();
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
                            if (null != ((rk) this).field_o) {
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
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof IOException ? 28 : 31);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            ((rk) this).field_o.close();
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof IOException ? 28 : 31);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            if (null == ((rk) this).field_h) {
                                statePc = 29;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof IOException ? 28 : 31);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            ((rk) this).field_h.close();
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof IOException ? 28 : 31);
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
                            ((rk) this).field_c = null;
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
                        sm.a((Throwable) (Object) var1_ref, 1, (String) null);
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

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, cn param8) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var9 = param8.field_w - (-param5 + -param2 + param6);
        var10 = param5 + (param8.field_w - (-param2 + -param0));
        var11 = param4 + param8.field_A - -(param8.field_v >> 760159105);
        if (param7 < 97) {
          return;
        } else {
          gf.a(var9, 0, var10, var11 - -param3);
          param8.b(-1 + param5, -1 + param4, param1);
          param8.b(param5 + -1, param4 - -1, param1);
          gf.b(rp.field_e);
          gf.a(1 + var9, 0, var10 + 1, param3 + var11);
          param8.b(1 + param5, param4 + -1, param1);
          param8.b(1 + param5, 1 + param4, param1);
          gf.b(rp.field_e);
          var9 = -param0 + (param5 + (param8.field_w - -param8.field_y) - param2);
          var10 = param8.field_y + param8.field_w - (-param5 + param2) + -param6;
          gf.a(var9, -param3 + var11, var10, 480);
          param8.b(-1 + param5, param4 - 1, param1);
          param8.b(param5 + -1, 1 + param4, param1);
          gf.b(rp.field_e);
          gf.a(var9 - -1, var11 + -param3, 1 + var10, 480);
          param8.b(1 + param5, param4 + -1, param1);
          param8.b(param5 - -1, 1 + param4, param1);
          gf.b(rp.field_e);
          return;
        }
    }

    final void b(byte[] param0, boolean param1, int param2, int param3) throws IOException {
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
                    var8 = DungeonAssault.field_K;
                    if (((rk) this).field_m) {
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
                    if (!((rk) this).field_n) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    ((rk) this).field_n = false;
                    throw new IOException();
                }
                case 5: {
                    if (null != ((rk) this).field_c) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    ((rk) this).field_c = new byte[((rk) this).field_j];
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    var5 = this;
                    // monitorenter this
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    try {
                        if (!param1) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var9 = null;
                        rk.a(-80, 100, -128, -38, -21, -28, 61, -115, (cn) null);
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
                        if (param3 <= var6) {
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
                        ((rk) this).field_c[((rk) this).field_i] = param0[param2 + var6];
                        ((rk) this).field_i = (((rk) this).field_i + 1) % ((rk) this).field_j;
                        if ((-100 + ((rk) this).field_j + ((rk) this).field_d) % ((rk) this).field_j == ((rk) this).field_i) {
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
                        if (null == ((rk) this).field_e) {
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
                        ((rk) this).field_e = ((rk) this).field_b.a(-21432, 3, (Runnable) this);
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

    private rk(java.net.Socket param0, qg param1, int param2) throws IOException {
        ((rk) this).field_i = 0;
        ((rk) this).field_n = false;
        ((rk) this).field_m = false;
        ((rk) this).field_d = 0;
        ((rk) this).field_b = param1;
        ((rk) this).field_h = param0;
        ((rk) this).field_h.setSoTimeout(30000);
        ((rk) this).field_h.setTcpNoDelay(true);
        ((rk) this).field_g = ((rk) this).field_h.getInputStream();
        ((rk) this).field_o = ((rk) this).field_h.getOutputStream();
        ((rk) this).field_j = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Snare";
        field_f = new String[]{"Toughness", "Any lethal blow becomes <col=FF0000>Defence -1</col>."};
        field_k = new String[]{null, "<%highlight>It's generally best to attack a player close to you in the table.</col> Players much higher than you are likely to be better defended, with more ferocious <%monsters> and devious <%traps>. Players far beneath you may be easier to assault, but the potential gains will be low."};
    }
}
