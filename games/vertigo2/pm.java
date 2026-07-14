/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pm implements Runnable {
    static boolean field_a;
    private wk field_e;
    private java.net.Socket field_g;
    static boolean field_d;
    private int field_h;
    private int field_i;
    private OutputStream field_f;
    private int field_l;
    private byte[] field_j;
    private boolean field_c;
    private boolean field_b;
    private InputStream field_m;
    private jj field_k;

    final int a(int param0) throws IOException {
        if (param0 != 15166) {
            ((pm) this).field_h = -24;
        }
        if (((pm) this).field_c) {
            return 0;
        }
        return ((pm) this).field_m.available();
    }

    protected final void finalize() {
        ((pm) this).b(0);
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
                        var6 = Vertigo2.field_L ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3 = this;
                            if (((pm) this).field_i != ((pm) this).field_l) {
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
                            if (((pm) this).field_c) {
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
                            statePc = 18;
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
                            if (((pm) this).field_i >= ((pm) this).field_l) {
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
                            var1_int = -((pm) this).field_l + ((pm) this).field_h;
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
                            var1_int = ((pm) this).field_i - ((pm) this).field_l;
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
                            var2 = ((pm) this).field_l;
                            if (0 >= var1_int) {
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
                            ((pm) this).field_f.write(((pm) this).field_j, var2, var1_int);
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
                            ((pm) this).field_b = true;
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
                            ((pm) this).field_l = (((pm) this).field_l + var1_int) % ((pm) this).field_h;
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
                            if (((pm) this).field_i != ((pm) this).field_l) {
                                statePc = 1;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = (stateCaught_14 instanceof IOException ? 17 : 29);
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            ((pm) this).field_f.flush();
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof IOException ? 17 : 29);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            var3_ref = (IOException) (Object) caughtException;
                            ((pm) this).field_b = true;
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
                            if (((pm) this).field_m != null) {
                                statePc = 20;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof IOException ? 26 : 29);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof IOException ? 26 : 29);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            ((pm) this).field_m.close();
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
                            if (((pm) this).field_f == null) {
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
                            ((pm) this).field_f.close();
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
                            if (((pm) this).field_g == null) {
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
                            ((pm) this).field_g.close();
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
                            ((pm) this).field_j = null;
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
                        ke.a((Throwable) (Object) var1_ref, (String) null, 0);
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

    final void b(int param0) {
        int var4 = 0;
        var4 = Vertigo2.field_L ? 1 : 0;
        if (!(!((pm) this).field_c)) {
            return;
        }
        if (param0 != 0) {
            r discarded$1 = pm.a(79, 67);
        }
        Object var2 = this;
        // monitorenter this
        ((pm) this).field_c = true;
        this.notifyAll();
        // monitorexit var2
        if (((pm) this).field_e != null) {
            while (((pm) this).field_e.field_b == 0) {
                um.a(true, 1L);
            }
            if (!(-2 != (((pm) this).field_e.field_b ^ -1))) {
                try {
                    if (false) throw (InterruptedException) null;
                    ((Thread) ((pm) this).field_e.field_d).join();
                } catch (InterruptedException interruptedException) {
                }
            }
        }
        ((pm) this).field_e = null;
    }

    final void a(byte[] param0, boolean param1, int param2, int param3) throws IOException {
        int var5 = 0;
        int var6 = Vertigo2.field_L ? 1 : 0;
        if (!(!((pm) this).field_c)) {
            return;
        }
        while (0 < param2) {
            var5 = ((pm) this).field_m.read(param0, param3, param2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            param3 = param3 + var5;
            param2 = param2 - var5;
        }
        if (param1) {
            ((pm) this).field_k = null;
        }
    }

    final void c(int param0) throws IOException {
        if (param0 != -26206) {
            ((pm) this).run();
        }
        if (!(!((pm) this).field_c)) {
            return;
        }
        if (!(!((pm) this).field_b)) {
            ((pm) this).field_b = false;
            throw new IOException();
        }
    }

    final static void a(byte param0, boolean param1) {
        ak.a(false, param1, 3);
        if (param0 != 52) {
            r discarded$0 = pm.a(-23, -49);
        }
    }

    pm(java.net.Socket param0, jj param1) throws IOException {
        this(param0, param1, 5000);
    }

    final int a(byte param0) throws IOException {
        int var2 = 29 / ((42 - param0) / 42);
        if (!(!((pm) this).field_c)) {
            return 0;
        }
        return ((pm) this).field_m.read();
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        Object var5 = null;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        int var9 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = Vertigo2.field_L ? 1 : 0;
                    if (((pm) this).field_c) {
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
                    if (!((pm) this).field_b) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    ((pm) this).field_b = false;
                    throw new IOException();
                }
                case 5: {
                    if (null != ((pm) this).field_j) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    ((pm) this).field_j = new byte[((pm) this).field_h];
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
                        var6 = 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var6 >= param1) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        ((pm) this).field_j[((pm) this).field_i] = param3[var6 + param0];
                        ((pm) this).field_i = (1 + ((pm) this).field_i) % ((pm) this).field_h;
                        if ((((pm) this).field_h + ((pm) this).field_l - 100) % ((pm) this).field_h == ((pm) this).field_i) {
                            statePc = 12;
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
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw new IOException();
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var6++;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var7 = -118 / ((param2 - -29) / 52);
                        if (((pm) this).field_e == null) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        ((pm) this).field_e = ((pm) this).field_k.a(3, (Runnable) this, 0);
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
                        var8 = caughtException;
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

    final static r a(int param0, int param1) {
        if (param1 <= 122) {
            field_d = true;
        }
        return vo.a(false, 126, 1, param0, false, true);
    }

    private pm(java.net.Socket param0, jj param1, int param2) throws IOException {
        ((pm) this).field_l = 0;
        ((pm) this).field_i = 0;
        ((pm) this).field_c = false;
        ((pm) this).field_b = false;
        ((pm) this).field_k = param1;
        ((pm) this).field_g = param0;
        ((pm) this).field_g.setSoTimeout(30000);
        ((pm) this).field_g.setTcpNoDelay(true);
        ((pm) this).field_m = ((pm) this).field_g.getInputStream();
        ((pm) this).field_f = ((pm) this).field_g.getOutputStream();
        ((pm) this).field_h = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = false;
    }
}
