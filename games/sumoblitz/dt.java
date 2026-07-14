/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class dt implements Runnable {
    static ri field_n;
    private byte[] field_e;
    static jr field_p;
    private int field_c;
    private int field_j;
    private boolean field_b;
    private boolean field_l;
    private OutputStream field_k;
    static String[] field_i;
    static String field_h;
    private wi field_g;
    private int field_a;
    static boolean field_f;
    private java.net.Socket field_m;
    private jr field_o;
    private InputStream field_d;

    final int a(int param0) throws IOException {
        if (param0 >= -84) {
            ((dt) this).field_e = null;
        }
        if (((dt) this).field_l) {
            return 0;
        }
        return ((dt) this).field_d.read();
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
                        var6 = Sumoblitz.field_L ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3 = this;
                            if (((dt) this).field_a == ((dt) this).field_c) {
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
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (!((dt) this).field_l) {
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
                            statePc = 20;
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
                            if (((dt) this).field_c > ((dt) this).field_a) {
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
                            var1_int = -((dt) this).field_c + ((dt) this).field_a;
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
                            var1_int = -((dt) this).field_c + ((dt) this).field_j;
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
                            var2 = ((dt) this).field_c;
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
                            ((dt) this).field_k.write(((dt) this).field_e, var2, var1_int);
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
                            ((dt) this).field_b = true;
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
                            ((dt) this).field_c = (((dt) this).field_c - -var1_int) % ((dt) this).field_j;
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
                            if (((dt) this).field_a == ((dt) this).field_c) {
                                statePc = 17;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof IOException ? 19 : 32);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof IOException ? 19 : 32);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            ((dt) this).field_k.flush();
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof IOException ? 19 : 32);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
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
                            var3_ref = (IOException) (Object) caughtException;
                            ((dt) this).field_b = true;
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
                            if (null != ((dt) this).field_d) {
                                statePc = 22;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof IOException ? 29 : 32);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof IOException ? 29 : 32);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            ((dt) this).field_d.close();
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
                            if (null != ((dt) this).field_k) {
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
                            ((dt) this).field_k.close();
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
                            if (((dt) this).field_m == null) {
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
                            ((dt) this).field_m.close();
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
                            ((dt) this).field_e = null;
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
                        ms.a((String) null, (Throwable) (Object) var1_ref, 0);
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

    final void b(int param0) throws IOException {
        if (!(!((dt) this).field_l)) {
            return;
        }
        int var2 = -72 / ((36 - param0) / 42);
        if (!(!((dt) this).field_b)) {
            ((dt) this).field_b = false;
            throw new IOException();
        }
    }

    protected final void finalize() {
        ((dt) this).a((byte) -97);
    }

    final void a(byte param0) {
        int var4 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if (!(!((dt) this).field_l)) {
            return;
        }
        if (param0 >= -36) {
            ((dt) this).field_g = null;
        }
        Object var2 = this;
        // monitorenter this
        ((dt) this).field_l = true;
        this.notifyAll();
        // monitorexit var2
        if (((dt) this).field_o != null) {
            while (((dt) this).field_o.field_c == 0) {
                tg.a(1L, (byte) 113);
            }
            if (!(-2 != (((dt) this).field_o.field_c ^ -1))) {
                try {
                    if (false) throw (InterruptedException) null;
                    ((Thread) ((dt) this).field_o.field_d).join();
                } catch (InterruptedException interruptedException) {
                }
            }
        }
        ((dt) this).field_o = null;
    }

    final int c(int param0) throws IOException {
        if (param0 >= -22) {
            return 73;
        }
        if (((dt) this).field_l) {
            return 0;
        }
        return ((dt) this).field_d.available();
    }

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
                    var8 = Sumoblitz.field_L ? 1 : 0;
                    if (!((dt) this).field_l) {
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
                    if (((dt) this).field_b) {
                        statePc = 4;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 4: {
                    ((dt) this).field_b = false;
                    throw new IOException();
                }
                case 5: {
                    if (null != ((dt) this).field_e) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    ((dt) this).field_e = new byte[((dt) this).field_j];
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
                        if (param1 == -2) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        ((dt) this).field_m = null;
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
                        if (var6 >= param3) {
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
                        ((dt) this).field_e[((dt) this).field_a] = param2[var6 + param0];
                        ((dt) this).field_a = (((dt) this).field_a + 1) % ((dt) this).field_j;
                        if (((dt) this).field_a != (-100 + ((dt) this).field_c + ((dt) this).field_j) % ((dt) this).field_j) {
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
                        if (((dt) this).field_o != null) {
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
                        ((dt) this).field_o = ((dt) this).field_g.a(true, (Runnable) this, 3);
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

    dt(java.net.Socket param0, wi param1) throws IOException {
        this(param0, param1, 5000);
    }

    private dt(java.net.Socket param0, wi param1, int param2) throws IOException {
        ((dt) this).field_c = 0;
        ((dt) this).field_l = false;
        ((dt) this).field_b = false;
        ((dt) this).field_a = 0;
        ((dt) this).field_m = param0;
        ((dt) this).field_g = param1;
        ((dt) this).field_m.setSoTimeout(30000);
        ((dt) this).field_m.setTcpNoDelay(true);
        ((dt) this).field_d = ((dt) this).field_m.getInputStream();
        ((dt) this).field_k = ((dt) this).field_m.getOutputStream();
        ((dt) this).field_j = param2;
    }

    public static void d(int param0) {
        if (param0 <= 19) {
            dt.d(-53);
        }
        field_i = null;
        field_h = null;
        field_p = null;
        field_n = null;
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        int var5 = 0;
        int var6 = Sumoblitz.field_L ? 1 : 0;
        if (!(!((dt) this).field_l)) {
            return;
        }
        while (0 < param2) {
            var5 = ((dt) this).field_d.read(param3, param1, param2);
            if (0 >= var5) {
                throw new EOFException();
            }
            param1 = param1 + var5;
            param2 = param2 - var5;
        }
        if (param0 > -12) {
            ((dt) this).field_b = true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "More suggestions";
        field_f = true;
    }
}
