/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class j implements Runnable {
    private InputStream field_n;
    private int field_d;
    private boolean field_m;
    private int field_g;
    private byte[] field_a;
    private java.net.Socket field_c;
    static int field_j;
    private int field_f;
    private un field_b;
    static String field_h;
    private OutputStream field_e;
    private gb field_l;
    private boolean field_k;
    static int[] field_i;

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        Object var5 = null;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = CrazyCrystals.field_B;
                    if (!((j) this).field_k) {
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
                    if (!((j) this).field_m) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((j) this).field_m = false;
                    throw new IOException();
                }
                case 4: {
                    if (((j) this).field_a == null) {
                        statePc = 6;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 6: {
                    ((j) this).field_a = new byte[((j) this).field_d];
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (param1 >= 85) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    boolean discarded$3 = j.c((byte) -1);
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
                        statePc = 20;
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
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        ((j) this).field_a[((j) this).field_g] = param2[var6 + param0];
                        ((j) this).field_g = (((j) this).field_g + 1) % ((j) this).field_d;
                        if ((-100 + (((j) this).field_d + ((j) this).field_f)) % ((j) this).field_d == ((j) this).field_g) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        throw new IOException();
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 20;
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
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (null != ((j) this).field_l) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        ((j) this).field_l = ((j) this).field_b.a((Runnable) this, 2, 3);
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

    final static void a(ak param0, int param1, boolean param2) {
        md var3 = null;
        md stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        md stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        md stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        md stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        var3 = tp.field_f;
        if (param2) {
          return;
        } else {
          var3.d(8, param1);
          var3.a(true, 5);
          stackOut_1_0 = (md) var3;
          stackOut_1_1 = 1;
          stackIn_3_0 = stackOut_1_0;
          stackIn_3_1 = stackOut_1_1;
          ((md) (Object) stackIn_3_0).a(stackIn_3_1 != 0, 0);
          var3.c(-161478600, param0.field_g);
          var3.a(true, param0.field_h);
          stackOut_3_0 = (md) var3;
          stackOut_3_1 = 1;
          stackIn_5_0 = stackOut_3_0;
          stackIn_5_1 = stackOut_3_1;
          ((md) (Object) stackIn_5_0).a(stackIn_5_1 != 0, param0.field_j);
          return;
        }
    }

    final int b(int param0) throws IOException {
        if (param0 == 5) {
          if (((j) this).field_k) {
            return 0;
          } else {
            return ((j) this).field_n.read();
          }
        } else {
          ((j) this).field_m = true;
          if (((j) this).field_k) {
            return 0;
          } else {
            return ((j) this).field_n.read();
          }
        }
    }

    j(java.net.Socket param0, un param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(int param0) throws IOException {
        int var2 = 0;
        var2 = 0 % ((param0 - -23) / 37);
        if (!((j) this).field_k) {
          if (((j) this).field_m) {
            ((j) this).field_m = false;
            throw new IOException();
          } else {
            return;
          }
        } else {
          return;
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
                    var4 = CrazyCrystals.field_B;
                    if (((j) this).field_k) {
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
                        ((j) this).field_k = true;
                        this.notifyAll();
                        if (param0 == -118) {
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
                        ((j) this).field_g = -44;
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
                    if (null != ((j) this).field_l) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    ((j) this).field_l = null;
                    return;
                }
                case 12: {
                    if (((j) this).field_l.field_a != 0) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    fh.a(true, 1L);
                    statePc = 12;
                    continue stateLoop;
                }
                case 14: {
                    if (((j) this).field_l.field_a == 1) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    ((j) this).field_l = null;
                    return;
                }
                case 16: {
                    try {
                        ((Thread) ((j) this).field_l.field_b).join();
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 17: {
                    ((j) this).field_l = null;
                    return;
                }
                case 18: {
                    var2_ref = (InterruptedException) (Object) caughtException;
                    ((j) this).field_l = null;
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
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
                        var6 = CrazyCrystals.field_B;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3 = this;
                            if (((j) this).field_g == ((j) this).field_f) {
                                statePc = 3;
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
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (((j) this).field_k) {
                                statePc = 5;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 30;
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
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (((j) this).field_f <= ((j) this).field_g) {
                                statePc = 9;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var1_int = -((j) this).field_f + ((j) this).field_d;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            var1_int = ((j) this).field_g + -((j) this).field_f;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            var2 = ((j) this).field_f;
                            if (var1_int <= 0) {
                                statePc = 1;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            ((j) this).field_e.write(((j) this).field_a, var2, var1_int);
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
                            ((j) this).field_m = true;
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
                            ((j) this).field_f = (((j) this).field_f - -var1_int) % ((j) this).field_d;
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
                            if (((j) this).field_f != ((j) this).field_g) {
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
                            ((j) this).field_e.flush();
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
                            ((j) this).field_m = true;
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
                            if (((j) this).field_n == null) {
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
                            ((j) this).field_n.close();
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
                            if (null == ((j) this).field_e) {
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
                            ((j) this).field_e.close();
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
                            if (null != ((j) this).field_c) {
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
                            ((j) this).field_c.close();
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
                            ((j) this).field_a = null;
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
                        wp.a((Throwable) (Object) var1_ref, (String) null, 21862);
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

    protected final void finalize() {
        ((j) this).b((byte) -118);
    }

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
        int var5 = 0;
        int var6 = 0;
        var6 = CrazyCrystals.field_B;
        if (!((j) this).field_k) {
          L0: while (true) {
            if (param1 <= 0) {
              if (param2 == 2034) {
                return;
              } else {
                ((j) this).field_f = -31;
                return;
              }
            } else {
              var5 = ((j) this).field_n.read(param0, param3, param1);
              if (var5 <= 0) {
                throw new EOFException();
              } else {
                param3 = param3 + var5;
                param1 = param1 - var5;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        field_i = null;
        field_h = null;
        if (param0 == 45) {
            return;
        }
        field_h = null;
    }

    final int c(int param0) throws IOException {
        if (((j) this).field_k) {
            return 0;
        }
        if (param0 != 0) {
            return -14;
        }
        return ((j) this).field_n.available();
    }

    private j(java.net.Socket param0, un param1, int param2) throws IOException {
        ((j) this).field_f = 0;
        ((j) this).field_g = 0;
        ((j) this).field_k = false;
        ((j) this).field_m = false;
        ((j) this).field_b = param1;
        ((j) this).field_c = param0;
        ((j) this).field_c.setSoTimeout(30000);
        ((j) this).field_c.setTcpNoDelay(true);
        ((j) this).field_n = ((j) this).field_c.getInputStream();
        ((j) this).field_e = ((j) this).field_c.getOutputStream();
        ((j) this).field_d = param2;
    }

    final static boolean c(byte param0) {
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        ka.field_j = true;
        if (param0 != -23) {
          return false;
        } else {
          L0: {
            ee.field_e = lo.a((byte) 81) - -15000L;
            if (hp.field_s != 11) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
    }
}
