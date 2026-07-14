/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class k implements Runnable {
    private int field_s;
    private dl field_h;
    static kc field_d;
    static ch field_q;
    private boolean field_g;
    static String field_f;
    private boolean field_l;
    private byte[] field_b;
    private InputStream field_i;
    private java.net.Socket field_e;
    private int field_n;
    private OutputStream field_r;
    private og field_a;
    static String field_p;
    private int field_j;
    static String[] field_k;
    static volatile boolean field_c;
    static int[] field_m;
    static int field_o;

    final void a(boolean param0) throws IOException {
        if (param0) {
            return;
        }
        if (((k) this).field_g) {
            return;
        }
        if (!(!((k) this).field_l)) {
            ((k) this).field_l = false;
            throw new IOException();
        }
    }

    final static void a(le param0, boolean param1) {
        if (!param1) {
            Object var3 = null;
            k.a((le) null, false);
        }
        rk.field_O = param0.field_V;
        qn.field_ob = param0;
    }

    public static void c(int param0) {
        field_q = null;
        field_k = null;
        field_f = null;
        field_p = null;
        if (param0 != 11138) {
            return;
        }
        field_d = null;
        field_m = null;
    }

    final void a(byte[] param0, byte param1, int param2, int param3) throws IOException {
        int var5 = 0;
        int var6 = ArcanistsMulti.field_G ? 1 : 0;
        if (((k) this).field_g) {
            return;
        }
        while (param3 > 0) {
            var5 = ((k) this).field_i.read(param0, param2, param3);
            if (!((var5 ^ -1) < -1)) {
                throw new EOFException();
            }
            param2 = param2 + var5;
            param3 = param3 - var5;
        }
        if (param1 >= -122) {
            ((k) this).field_a = null;
        }
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
                    var8 = ArcanistsMulti.field_G ? 1 : 0;
                    if (!((k) this).field_g) {
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
                    if (((k) this).field_l) {
                        statePc = 4;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 4: {
                    ((k) this).field_l = false;
                    throw new IOException();
                }
                case 5: {
                    if (((k) this).field_b == null) {
                        statePc = 7;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 7: {
                    ((k) this).field_b = new byte[((k) this).field_n];
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
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var6 >= param0) {
                            statePc = 15;
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
                        ((k) this).field_b[((k) this).field_s] = param3[param1 + var6];
                        ((k) this).field_s = (1 + ((k) this).field_s) % ((k) this).field_n;
                        if (((k) this).field_s == (((k) this).field_j - (-((k) this).field_n - -100)) % ((k) this).field_n) {
                            statePc = 13;
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
                        statePc = 14;
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
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (((k) this).field_a != null) {
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
                        ((k) this).field_a = ((k) this).field_h.a(124, 3, (Runnable) this);
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
                    if (param2 > 114) {
                        statePc = 23;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    ((k) this).field_r = null;
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

    final void d(int param0) {
        int var4 = 0;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 != -23482) {
            field_f = null;
        }
        if (((k) this).field_g) {
            return;
        }
        Object var2 = this;
        // monitorenter this
        ((k) this).field_g = true;
        this.notifyAll();
        // monitorexit var2
        if (null != ((k) this).field_a) {
            while (((k) this).field_a.field_e == 0) {
                ao.a(1L, 1);
            }
            if (!((((k) this).field_a.field_e ^ -1) != -2)) {
                try {
                    if (false) throw (InterruptedException) null;
                    ((Thread) ((k) this).field_a.field_g).join();
                } catch (InterruptedException interruptedException) {
                }
            }
        }
        ((k) this).field_a = null;
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
                        var6 = ArcanistsMulti.field_G ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3 = this;
                            if (((k) this).field_j != ((k) this).field_s) {
                                statePc = 6;
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
                            if (((k) this).field_g) {
                                statePc = 4;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 31;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 31;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            statePc = 20;
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
                            var2 = ((k) this).field_j;
                            if (((k) this).field_j <= ((k) this).field_s) {
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
                            var1_int = ((k) this).field_n - ((k) this).field_j;
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
                            var1_int = -((k) this).field_j + ((k) this).field_s;
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
                            if (var1_int > 0) {
                                statePc = 11;
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
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 31;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            ((k) this).field_r.write(((k) this).field_b, var2, var1_int);
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
                            ((k) this).field_l = true;
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
                            ((k) this).field_j = (var1_int + ((k) this).field_j) % ((k) this).field_n;
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
                            if (((k) this).field_s == ((k) this).field_j) {
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
                            ((k) this).field_r.flush();
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
                            ((k) this).field_l = true;
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
                            if (((k) this).field_i == null) {
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
                            ((k) this).field_i.close();
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
                            if (((k) this).field_r == null) {
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
                            ((k) this).field_r.close();
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
                            if (null != ((k) this).field_e) {
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
                            ((k) this).field_e.close();
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
                            ((k) this).field_b = null;
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
                        jh.a((Throwable) (Object) var1_ref, (String) null, (byte) 20);
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

    k(java.net.Socket param0, dl param1) throws IOException {
        this(param0, param1, 5000);
    }

    final static String a(int param0) {
        if (!(in.field_Gb != sk.field_a)) {
            return on.field_d;
        }
        if (param0 != 0) {
            field_k = null;
        }
        if (!(wn.field_z.a((byte) -106))) {
            return wn.field_z.a(true);
        }
        if (hb.field_Gb == sk.field_a) {
            return wn.field_z.a(true);
        }
        return ge.field_g;
    }

    protected final void finalize() {
        ((k) this).d(-23482);
    }

    final int b(int param0) throws IOException {
        if (param0 != 0) {
            ((k) this).field_s = -21;
        }
        if (((k) this).field_g) {
            return 0;
        }
        return ((k) this).field_i.available();
    }

    final int a(byte param0) throws IOException {
        if (((k) this).field_g) {
            return 0;
        }
        if (param0 != 120) {
            ((k) this).d(-9);
        }
        return ((k) this).field_i.read();
    }

    private k(java.net.Socket param0, dl param1, int param2) throws IOException {
        ((k) this).field_s = 0;
        ((k) this).field_l = false;
        ((k) this).field_g = false;
        ((k) this).field_j = 0;
        ((k) this).field_e = param0;
        ((k) this).field_h = param1;
        ((k) this).field_e.setSoTimeout(30000);
        ((k) this).field_e.setTcpNoDelay(true);
        ((k) this).field_i = ((k) this).field_e.getInputStream();
        ((k) this).field_r = ((k) this).field_e.getOutputStream();
        ((k) this).field_n = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "<%0> is not on your ignore list.";
        field_p = "You";
        field_q = new ch(3);
        field_k = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_m = new int[8192];
        field_o = 0;
        field_c = true;
    }
}
