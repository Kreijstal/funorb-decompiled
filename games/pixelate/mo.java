/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class mo implements Runnable {
    static int field_k;
    static String field_i;
    private OutputStream field_j;
    private ei field_m;
    private cb field_e;
    private int field_n;
    private int field_l;
    private boolean field_a;
    private byte[] field_d;
    static String field_b;
    private java.net.Socket field_h;
    private InputStream field_f;
    private boolean field_g;
    private int field_c;

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
                        var6 = Pixelate.field_H ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3 = this;
                            if (((mo) this).field_n == ((mo) this).field_c) {
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
                            if (((mo) this).field_a) {
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
                            var2 = ((mo) this).field_n;
                            if (((mo) this).field_n > ((mo) this).field_c) {
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
                            var1_int = -((mo) this).field_n + ((mo) this).field_c;
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
                            var1_int = -((mo) this).field_n + ((mo) this).field_l;
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
                            if (0 < var1_int) {
                                statePc = 12;
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
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 31;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            ((mo) this).field_j.write(((mo) this).field_d, var2, var1_int);
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = (stateCaught_12 instanceof IOException ? 14 : 31);
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 31;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            var3_ref = (IOException) (Object) caughtException;
                            ((mo) this).field_g = true;
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
                            ((mo) this).field_n = (((mo) this).field_n + var1_int) % ((mo) this).field_l;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 31;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if (((mo) this).field_c != ((mo) this).field_n) {
                                statePc = 1;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof IOException ? 19 : 31);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            ((mo) this).field_j.flush();
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof IOException ? 19 : 31);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            var3_ref = (IOException) (Object) caughtException;
                            ((mo) this).field_g = true;
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
                            if (null == ((mo) this).field_f) {
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
                            ((mo) this).field_f.close();
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
                            if (((mo) this).field_j != null) {
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
                            ((mo) this).field_j.close();
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
                            if (((mo) this).field_h == null) {
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
                            ((mo) this).field_h.close();
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
                            ((mo) this).field_d = null;
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
                        jo.a(1, (String) null, (Throwable) (Object) var1_ref);
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

    mo(java.net.Socket param0, cb param1) throws IOException {
        this(param0, param1, 5000);
    }

    final int c(byte param0) throws IOException {
        if (param0 != -81) {
            ((mo) this).field_g = false;
        }
        if (((mo) this).field_a) {
            return 0;
        }
        return ((mo) this).field_f.read();
    }

    final void b(int param0) {
        int var4 = 0;
        var4 = Pixelate.field_H ? 1 : 0;
        if (((mo) this).field_a) {
            return;
        }
        Object var2 = this;
        // monitorenter this
        ((mo) this).field_a = true;
        this.notifyAll();
        // monitorexit var2
        if (param0 != -1) {
            return;
        }
        if (!(null == ((mo) this).field_m)) {
            while (((mo) this).field_m.field_b == 0) {
                vg.a(1L, (byte) 23);
            }
            if ((((mo) this).field_m.field_b ^ -1) == -2) {
                try {
                    if (false) throw (InterruptedException) null;
                    ((Thread) ((mo) this).field_m.field_e).join();
                } catch (InterruptedException interruptedException) {
                }
            }
        }
        ((mo) this).field_m = null;
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        Object var5 = null;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = Pixelate.field_H ? 1 : 0;
                    if (!((mo) this).field_a) {
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
                    if (((mo) this).field_g) {
                        statePc = 4;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 4: {
                    ((mo) this).field_g = false;
                    throw new IOException();
                }
                case 5: {
                    if (null == ((mo) this).field_d) {
                        statePc = 7;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 7: {
                    ((mo) this).field_d = new byte[((mo) this).field_l];
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
                        if (param1 < -72) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        // monitorexit var5
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 11: {
                    return;
                }
                case 12: {
                    try {
                        var6 = 0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var6 >= param0) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        ((mo) this).field_d[((mo) this).field_c] = param3[param2 + var6];
                        ((mo) this).field_c = (((mo) this).field_c - -1) % ((mo) this).field_l;
                        if ((((mo) this).field_l + ((mo) this).field_n + -100) % ((mo) this).field_l != ((mo) this).field_c) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        throw new IOException();
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 22;
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
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (null == ((mo) this).field_m) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        ((mo) this).field_m = ((mo) this).field_e.a(3, (Runnable) this, (byte) -123);
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
                        this.notifyAll();
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

    final int a(int param0) throws IOException {
        if (param0 >= -68) {
            field_b = null;
        }
        if (!(!((mo) this).field_a)) {
            return 0;
        }
        return ((mo) this).field_f.available();
    }

    final void a(byte[] param0, int param1, byte param2, int param3) throws IOException {
        int var5 = 0;
        int var6 = Pixelate.field_H ? 1 : 0;
        if (param2 != 119) {
            ((mo) this).finalize();
        }
        if (((mo) this).field_a) {
            return;
        }
        while (-1 > (param3 ^ -1)) {
            var5 = ((mo) this).field_f.read(param0, param1, param3);
            if (!(var5 > 0)) {
                throw new EOFException();
            }
            param1 = param1 + var5;
            param3 = param3 - var5;
        }
    }

    final void b(byte param0) throws IOException {
        int var2 = -74 % ((36 - param0) / 56);
        if (!(!((mo) this).field_a)) {
            return;
        }
        if (((mo) this).field_g) {
            ((mo) this).field_g = false;
            throw new IOException();
        }
    }

    public static void a(byte param0) {
        field_i = null;
        field_b = null;
        if (param0 > -55) {
            mo.a((byte) 57);
        }
    }

    protected final void finalize() {
        ((mo) this).b(-1);
    }

    private mo(java.net.Socket param0, cb param1, int param2) throws IOException {
        ((mo) this).field_n = 0;
        ((mo) this).field_a = false;
        ((mo) this).field_c = 0;
        ((mo) this).field_g = false;
        ((mo) this).field_h = param0;
        ((mo) this).field_e = param1;
        ((mo) this).field_h.setSoTimeout(30000);
        ((mo) this).field_h.setTcpNoDelay(true);
        ((mo) this).field_f = ((mo) this).field_h.getInputStream();
        ((mo) this).field_j = ((mo) this).field_h.getOutputStream();
        ((mo) this).field_l = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "<%0> is already on your friend list.";
        field_i = "Player Name: ";
    }
}
