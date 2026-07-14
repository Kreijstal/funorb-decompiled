/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class jqa implements Runnable {
    private boolean field_a;
    private int field_k;
    private int field_d;
    private java.net.Socket field_e;
    static jea field_b;
    private InputStream field_h;
    private fia field_i;
    private OutputStream field_l;
    private byte[] field_c;
    static int field_g;
    private boolean field_f;
    private naa field_j;
    private int field_m;

    protected final void finalize() {
        ((jqa) this).a((byte) 105);
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 >= -64) {
            field_g = 33;
        }
    }

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
        Object var5 = null;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = TombRacer.field_G ? 1 : 0;
                    if (((jqa) this).field_a) {
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
                    if (((jqa) this).field_f) {
                        statePc = 5;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 5: {
                    ((jqa) this).field_f = false;
                    throw new IOException();
                }
                case 6: {
                    if (((jqa) this).field_c == null) {
                        statePc = 8;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 8: {
                    ((jqa) this).field_c = new byte[((jqa) this).field_d];
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
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var6 >= param2) {
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
                        ((jqa) this).field_c[((jqa) this).field_m] = param0[var6 + param1];
                        ((jqa) this).field_m = (1 + ((jqa) this).field_m) % ((jqa) this).field_d;
                        if (((jqa) this).field_m != (((jqa) this).field_d + ((jqa) this).field_k - 100) % ((jqa) this).field_d) {
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
                        if (((jqa) this).field_j != null) {
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
                        ((jqa) this).field_j = ((jqa) this).field_i.a((Runnable) this, 425, 3);
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
                    if (param3 >= 99) {
                        statePc = 23;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    ((jqa) this).field_k = 121;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int d(int param0) throws IOException {
        if (!(!((jqa) this).field_a)) {
            return 0;
        }
        if (param0 != -2147483648) {
            Object var3 = null;
            int discarded$0 = jqa.a(-72, (Random) null, -100);
        }
        return ((jqa) this).field_h.read();
    }

    final static int a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        if (!(pda.a(param9, param4, param6, 256, param7, param3, param0, param8, param2))) {
            return 0;
        }
        if (param1 != 1) {
            field_b = null;
        }
        int var10 = ova.a(param7, param8, true, param9, param6);
        int var11 = ova.a(param4, param3, true, param0, param2);
        if (!(-1 <= (param5 ^ -1))) {
            var10 = var10 + (1 << param5 - 1);
            var11 = var11 + (1 << -1 + param5);
        }
        return (var10 >> param5) * (var11 >> param5);
    }

    jqa(java.net.Socket param0, fia param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void b(int param0) throws IOException {
        if (((jqa) this).field_a) {
            return;
        }
        if (((jqa) this).field_f) {
            ((jqa) this).field_f = false;
            throw new IOException();
        }
        if (param0 < 79) {
            ((jqa) this).a((byte) 122);
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        int var5 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        if (((jqa) this).field_a) {
            return;
        }
        if (param0 != 0) {
            return;
        }
        while (param3 < -1) {
            var5 = ((jqa) this).field_h.read(param2, param1, param3);
            if (-1 >= var5) {
                throw new EOFException();
            }
            param3 = param3 - var5;
            param1 = param1 + var5;
        }
    }

    final int c(int param0) throws IOException {
        if (((jqa) this).field_a) {
            return 0;
        }
        if (param0 != 0) {
            ((jqa) this).a((byte) 47);
        }
        return ((jqa) this).field_h.available();
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
                        var6 = TombRacer.field_G ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3 = this;
                            if (((jqa) this).field_m == ((jqa) this).field_k) {
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
                            if (((jqa) this).field_a) {
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
                            statePc = 20;
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
                            var2 = ((jqa) this).field_k;
                            if (((jqa) this).field_k > ((jqa) this).field_m) {
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
                            var1_int = -((jqa) this).field_k + ((jqa) this).field_m;
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
                            var1_int = ((jqa) this).field_d - ((jqa) this).field_k;
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
                            if (-1 > (var1_int ^ -1)) {
                                statePc = 12;
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
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            ((jqa) this).field_l.write(((jqa) this).field_c, var2, var1_int);
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = (stateCaught_12 instanceof IOException ? 14 : 30);
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            var3_ref = (IOException) (Object) caughtException;
                            ((jqa) this).field_f = true;
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
                            ((jqa) this).field_k = (((jqa) this).field_k - -var1_int) % ((jqa) this).field_d;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if (((jqa) this).field_m != ((jqa) this).field_k) {
                                statePc = 1;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof IOException ? 19 : 30);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            ((jqa) this).field_l.flush();
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof IOException ? 19 : 30);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            var3_ref = (IOException) (Object) caughtException;
                            ((jqa) this).field_f = true;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (null == ((jqa) this).field_h) {
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
                            ((jqa) this).field_h.close();
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof IOException ? 27 : 30);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            if (((jqa) this).field_l == null) {
                                statePc = 24;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof IOException ? 27 : 30);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            ((jqa) this).field_l.close();
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
                            if (null == ((jqa) this).field_e) {
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
                            ((jqa) this).field_e.close();
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
                            ((jqa) this).field_c = null;
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
                        ssa.a((String) null, (byte) 122, (Throwable) (Object) var1_ref);
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

    final static int a(int param0, Random param1, int param2) {
        int var5 = 0;
        if (!(param0 > 0)) {
            throw new IllegalArgumentException();
        }
        int var3 = -43 % ((param2 - -14) / 57);
        if (!(!cla.a(9181, param0))) {
            return (int)((4294967295L & (long)param1.nextInt()) * (long)param0 >> 625570336);
        }
        int var4 = -2147483648 - (int)(4294967296L % (long)param0);
        while (true) {
            var5 = param1.nextInt();
            if (var4 > var5) {
                break;
            }
        }
        return oea.a(var5, param0, -127);
    }

    final void a(byte param0) {
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        if (((jqa) this).field_a) {
            return;
        }
        Object var2 = this;
        // monitorenter this
        ((jqa) this).field_a = true;
        this.notifyAll();
        // monitorexit var2
        if (((jqa) this).field_j != null) {
            while (-1 == (((jqa) this).field_j.field_b ^ -1)) {
                vja.a(0, 1L);
            }
            if (1 == ((jqa) this).field_j.field_b) {
                try {
                    if (false) throw (InterruptedException) null;
                    ((Thread) ((jqa) this).field_j.field_f).join();
                } catch (InterruptedException interruptedException) {
                }
            }
        }
        if (param0 != 105) {
            ((jqa) this).field_c = null;
        }
        ((jqa) this).field_j = null;
    }

    private jqa(java.net.Socket param0, fia param1, int param2) throws IOException {
        ((jqa) this).field_k = 0;
        ((jqa) this).field_a = false;
        ((jqa) this).field_f = false;
        ((jqa) this).field_m = 0;
        ((jqa) this).field_i = param1;
        ((jqa) this).field_e = param0;
        ((jqa) this).field_e.setSoTimeout(30000);
        ((jqa) this).field_e.setTcpNoDelay(true);
        ((jqa) this).field_h = ((jqa) this).field_e.getInputStream();
        ((jqa) this).field_l = ((jqa) this).field_e.getOutputStream();
        ((jqa) this).field_d = param2;
    }

    static {
    }
}
