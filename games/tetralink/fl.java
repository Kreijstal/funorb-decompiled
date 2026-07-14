/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fl implements Runnable {
    private OutputStream field_i;
    static int field_g;
    private java.net.Socket field_f;
    static String field_a;
    static int field_b;
    private int field_k;
    static kc field_o;
    private vl field_r;
    private int field_v;
    private ie field_d;
    private byte[] field_t;
    static ji field_n;
    private boolean field_m;
    static int field_q;
    static int[] field_c;
    private int field_l;
    static boolean field_s;
    static lk field_u;
    static String field_h;
    private boolean field_p;
    static String field_e;
    private InputStream field_j;

    public static void b(int param0) {
        field_c = null;
        field_o = null;
        field_e = null;
        field_a = null;
        field_u = null;
        if (param0 != -26787) {
            field_b = 24;
        }
        field_h = null;
        field_n = null;
    }

    final int c(int param0) throws IOException {
        if (param0 != 3) {
            fl.b(95);
        }
        if (((fl) this).field_m) {
            return 0;
        }
        return ((fl) this).field_j.read();
    }

    final void d(int param0) {
        int var4 = 0;
        var4 = TetraLink.field_J;
        if (((fl) this).field_m) {
            return;
        }
        Object var2 = this;
        // monitorenter this
        ((fl) this).field_m = true;
        this.notifyAll();
        if (param0 != -15488) {
            ((fl) this).finalize();
        }
        // monitorexit var2
        if (null != ((fl) this).field_r) {
            while (((fl) this).field_r.field_d == 0) {
                tb.a(false, 1L);
            }
            if (1 == ((fl) this).field_r.field_d) {
                try {
                    if (false) throw (InterruptedException) null;
                    ((Thread) ((fl) this).field_r.field_f).join();
                } catch (InterruptedException interruptedException) {
                }
            }
        }
        ((fl) this).field_r = null;
    }

    protected final void finalize() {
        ((fl) this).d(-15488);
    }

    fl(java.net.Socket param0, ie param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        int var5 = 0;
        int var6 = TetraLink.field_J;
        if (((fl) this).field_m) {
            return;
        }
        if (param3 != 0) {
            field_u = null;
        }
        while (param1 > 0) {
            var5 = ((fl) this).field_j.read(param2, param0, param1);
            if (-1 <= (var5 ^ -1)) {
                throw new EOFException();
            }
            param0 = param0 + var5;
            param1 = param1 - var5;
        }
    }

    final void a(int param0) throws IOException {
        if (!(!((fl) this).field_m)) {
            return;
        }
        if (((fl) this).field_p) {
            ((fl) this).field_p = false;
            throw new IOException();
        }
        if (param0 != 100) {
            ((fl) this).d(-94);
        }
    }

    final static hb e(int param0) {
        String var1 = sa.a((byte) -39);
        if (param0 != 1) {
            Object var2 = null;
            boolean discarded$0 = fl.a((byte) 60, (CharSequence) null);
        }
        if (var1 != null) {
            if (!(0 > var1.indexOf('@'))) {
                var1 = "";
            }
        }
        return new hb(sa.a((byte) -113), pm.a(true));
    }

    final void a(boolean param0, int param1, byte[] param2, int param3) throws IOException {
        Object var5 = null;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = TetraLink.field_J;
                    if (((fl) this).field_m) {
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
                    if (((fl) this).field_p) {
                        statePc = 5;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 5: {
                    ((fl) this).field_p = false;
                    throw new IOException();
                }
                case 6: {
                    if (((fl) this).field_t != null) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    ((fl) this).field_t = new byte[((fl) this).field_k];
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
                        if (param0) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        field_s = false;
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
                        if (var6 >= param1) {
                            statePc = 15;
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
                        ((fl) this).field_t[((fl) this).field_v] = param2[var6 + param3];
                        ((fl) this).field_v = (((fl) this).field_v - -1) % ((fl) this).field_k;
                        if ((((fl) this).field_k + ((fl) this).field_l - 100) % ((fl) this).field_k != ((fl) this).field_v) {
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
                        throw new IOException();
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 20;
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
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (null == ((fl) this).field_r) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        ((fl) this).field_r = ((fl) this).field_d.a((Runnable) this, 88, 3);
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
                        var6 = TetraLink.field_J;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3 = this;
                            if (((fl) this).field_l != ((fl) this).field_v) {
                                statePc = 5;
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
                            if (!((fl) this).field_m) {
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
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 29;
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
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var2 = ((fl) this).field_l;
                            if (((fl) this).field_v >= ((fl) this).field_l) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var1_int = -((fl) this).field_l + ((fl) this).field_k;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var1_int = ((fl) this).field_v - ((fl) this).field_l;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if (-1 > (var1_int ^ -1)) {
                                statePc = 10;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            ((fl) this).field_i.write(((fl) this).field_t, var2, var1_int);
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
                            ((fl) this).field_p = true;
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
                            ((fl) this).field_l = (((fl) this).field_l + var1_int) % ((fl) this).field_k;
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
                            if (((fl) this).field_l != ((fl) this).field_v) {
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
                            ((fl) this).field_i.flush();
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
                            ((fl) this).field_p = true;
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
                            if (((fl) this).field_j == null) {
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
                            ((fl) this).field_j.close();
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof IOException ? 26 : 29);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (((fl) this).field_i == null) {
                                statePc = 22;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof IOException ? 26 : 29);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            ((fl) this).field_i.close();
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof IOException ? 26 : 29);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            if (null != ((fl) this).field_f) {
                                statePc = 24;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof IOException ? 26 : 29);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof IOException ? 26 : 29);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            ((fl) this).field_f.close();
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof IOException ? 26 : 29);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 29;
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
                            ((fl) this).field_t = null;
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
                        fk.a(-55, (Throwable) (Object) var1_ref, (String) null);
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

    final static boolean a(byte param0, CharSequence param1) {
        if (param0 <= 119) {
            hb discarded$0 = fl.e(92);
        }
        return ti.a(45, param1, false);
    }

    final int f(int param0) throws IOException {
        if (param0 != 0) {
            ((fl) this).field_i = null;
        }
        if (((fl) this).field_m) {
            return 0;
        }
        return ((fl) this).field_j.available();
    }

    private fl(java.net.Socket param0, ie param1, int param2) throws IOException {
        ((fl) this).field_v = 0;
        ((fl) this).field_m = false;
        ((fl) this).field_l = 0;
        ((fl) this).field_p = false;
        ((fl) this).field_f = param0;
        ((fl) this).field_d = param1;
        ((fl) this).field_f.setSoTimeout(30000);
        ((fl) this).field_f.setTcpNoDelay(true);
        ((fl) this).field_j = ((fl) this).field_f.getInputStream();
        ((fl) this).field_i = ((fl) this).field_f.getOutputStream();
        ((fl) this).field_k = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[]{6000, 4500, 3000, 2250, 1500, 1000, 500};
        field_q = 0;
        field_a = "Waiting for extra data";
        field_s = false;
        field_e = "You are playing <%0>.";
        field_h = "You have declined the invitation.";
    }
}
