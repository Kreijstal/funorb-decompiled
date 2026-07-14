/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class wh implements Runnable {
    private int field_b;
    private java.net.Socket field_d;
    private boolean field_g;
    private tg field_f;
    private byte[] field_c;
    private boolean field_k;
    private OutputStream field_l;
    static int field_m;
    private int field_j;
    private InputStream field_e;
    private ql field_i;
    private int field_a;
    static mh field_h;

    final int e(int param0) throws IOException {
        if (param0 != 0) {
            ((wh) this).finalize();
        }
        if (((wh) this).field_k) {
            return 0;
        }
        return ((wh) this).field_e.read();
    }

    protected final void finalize() {
        ((wh) this).a((byte) 111);
    }

    final void a(byte[] param0, boolean param1, int param2, int param3) throws IOException {
        Object var5 = null;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = BrickABrac.field_J ? 1 : 0;
                    if (((wh) this).field_k) {
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
                    if (param1) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    return;
                }
                case 5: {
                    if (((wh) this).field_g) {
                        statePc = 7;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 7: {
                    ((wh) this).field_g = false;
                    throw new IOException();
                }
                case 8: {
                    if (((wh) this).field_c == null) {
                        statePc = 10;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 10: {
                    ((wh) this).field_c = new byte[((wh) this).field_a];
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    var5 = this;
                    // monitorenter this
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    try {
                        var6 = 0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var6 >= param2) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        ((wh) this).field_c[((wh) this).field_b] = param0[param3 + var6];
                        ((wh) this).field_b = (1 + ((wh) this).field_b) % ((wh) this).field_a;
                        if ((((wh) this).field_a + ((wh) this).field_j - 100) % ((wh) this).field_a != ((wh) this).field_b) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        throw new IOException();
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var6++;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (null != ((wh) this).field_i) {
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
                        ((wh) this).field_i = ((wh) this).field_f.a(3, (Runnable) this, (byte) -69);
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

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
        int var5 = 0;
        int var6 = BrickABrac.field_J ? 1 : 0;
        if (((wh) this).field_k) {
            return;
        }
        if (param0 != 25826) {
            return;
        }
        while (0 < param2) {
            var5 = ((wh) this).field_e.read(param1, param3, param2);
            if (-1 <= (var5 ^ -1)) {
                throw new EOFException();
            }
            param2 = param2 - var5;
            param3 = param3 + var5;
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
                        var6 = BrickABrac.field_J ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3 = this;
                            if (((wh) this).field_b != ((wh) this).field_j) {
                                statePc = 5;
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
                            if (!((wh) this).field_k) {
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
                            if (((wh) this).field_j <= ((wh) this).field_b) {
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
                            var1_int = ((wh) this).field_a - ((wh) this).field_j;
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
                            var1_int = -((wh) this).field_j + ((wh) this).field_b;
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
                            var2 = ((wh) this).field_j;
                            if ((var1_int ^ -1) < -1) {
                                statePc = 10;
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
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            ((wh) this).field_l.write(((wh) this).field_c, var2, var1_int);
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = (stateCaught_10 instanceof IOException ? 12 : 30);
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            var3_ref = (IOException) (Object) caughtException;
                            ((wh) this).field_g = true;
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
                            ((wh) this).field_j = (var1_int + ((wh) this).field_j) % ((wh) this).field_a;
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
                            if (((wh) this).field_j != ((wh) this).field_b) {
                                statePc = 1;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = (stateCaught_14 instanceof IOException ? 17 : 30);
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            ((wh) this).field_l.flush();
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof IOException ? 17 : 30);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            var3_ref = (IOException) (Object) caughtException;
                            ((wh) this).field_g = true;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (((wh) this).field_e != null) {
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
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof IOException ? 27 : 30);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            ((wh) this).field_e.close();
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
                            if (null == ((wh) this).field_l) {
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
                            ((wh) this).field_l.close();
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
                            if (null != ((wh) this).field_d) {
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
                            ((wh) this).field_d.close();
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
                            ((wh) this).field_c = null;
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
                        rk.a((String) null, (Throwable) (Object) var1_ref, 105);
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

    wh(java.net.Socket param0, tg param1) throws IOException {
        this(param0, param1, 5000);
    }

    public static void b(int param0) {
        if (param0 < 89) {
            return;
        }
        field_h = null;
    }

    final void a(byte param0) {
        int var4 = 0;
        var4 = BrickABrac.field_J ? 1 : 0;
        if (((wh) this).field_k) {
            return;
        }
        Object var2 = this;
        // monitorenter this
        ((wh) this).field_k = true;
        this.notifyAll();
        // monitorexit var2
        if (((wh) this).field_i != null) {
            while (((wh) this).field_i.field_f == 0) {
                wj.a(-127, 1L);
            }
            if (((wh) this).field_i.field_f == 1) {
                try {
                    if (false) throw (InterruptedException) null;
                    ((Thread) ((wh) this).field_i.field_e).join();
                } catch (InterruptedException interruptedException) {
                }
            }
        }
        ((wh) this).field_i = null;
        if (param0 < 110) {
            ((wh) this).a((byte) 56);
        }
    }

    final static void a(int param0) {
        if (param0 != 21862) {
            return;
        }
        if (nq.field_p) {
            lb.b(lb.field_i, lb.field_b, -lb.field_i + lb.field_f, -lb.field_b + lb.field_j);
            wd.field_w.a(true, false);
        }
    }

    final void c(int param0) throws IOException {
        if (!(!((wh) this).field_k)) {
            return;
        }
        if (param0 != -1) {
            ((wh) this).field_b = -17;
        }
        if (!(!((wh) this).field_g)) {
            ((wh) this).field_g = false;
            throw new IOException();
        }
    }

    final int d(int param0) throws IOException {
        if (!(!((wh) this).field_k)) {
            return 0;
        }
        if (param0 != 10434) {
            ((wh) this).finalize();
        }
        return ((wh) this).field_e.available();
    }

    private wh(java.net.Socket param0, tg param1, int param2) throws IOException {
        ((wh) this).field_g = false;
        ((wh) this).field_k = false;
        ((wh) this).field_j = 0;
        ((wh) this).field_b = 0;
        ((wh) this).field_f = param1;
        ((wh) this).field_d = param0;
        ((wh) this).field_d.setSoTimeout(30000);
        ((wh) this).field_d.setTcpNoDelay(true);
        ((wh) this).field_e = ((wh) this).field_d.getInputStream();
        ((wh) this).field_l = ((wh) this).field_d.getOutputStream();
        ((wh) this).field_a = param2;
    }

    static {
    }
}
