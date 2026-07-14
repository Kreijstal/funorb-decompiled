/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class el implements Runnable {
    static boolean field_k;
    static String field_i;
    private boolean field_l;
    private InputStream field_e;
    private OutputStream field_j;
    private un field_n;
    static String field_g;
    private java.net.Socket field_q;
    static String field_b;
    private boolean field_p;
    static String field_a;
    private int field_c;
    private byte[] field_v;
    static eh field_d;
    private int field_m;
    static int field_r;
    static int[] field_w;
    static int[] field_h;
    static cj[] field_s;
    static String field_f;
    private int field_u;
    static int field_t;
    private pd field_o;

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
        int var5 = 0;
        int var6 = Virogrid.field_F ? 1 : 0;
        if (param2 != -1) {
            el.a(false);
        }
        if (((el) this).field_l) {
            return;
        }
        while (param0 > 0) {
            var5 = ((el) this).field_e.read(param1, param3, param0);
            if ((var5 ^ -1) >= -1) {
                throw new EOFException();
            }
            param0 = param0 - var5;
            param3 = param3 + var5;
        }
    }

    final static cj a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        hg var8 = null;
        th var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int[] stackIn_23_0 = null;
        int stackOut_1_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_8_0 = 0;
        int[] stackOut_21_0 = null;
        Object stackOut_22_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = Virogrid.field_F ? 1 : 0;
                    var8 = sh.field_qb;
                    var3 = var8.g(11132);
                    td.field_h = 127 & var3;
                    if (param1 == (128 & var3)) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    stackOut_1_0 = 1;
                    stackIn_3_0 = stackOut_1_0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 2: {
                    stackOut_2_0 = 0;
                    stackIn_3_0 = stackOut_2_0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    ea.field_b = stackIn_3_0 != 0;
                    va.field_b = var8.g(11132);
                    hk.field_Kb = var8.e((byte) -60);
                    if (td.field_h != 2) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    eb.field_d = var8.c((byte) -54);
                    pl.field_b = var8.a(-25842);
                    statePc = 6;
                    continue stateLoop;
                }
                case 5: {
                    eb.field_d = 0;
                    pl.field_b = 0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (1 != var8.g(11132)) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    stackOut_7_0 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    statePc = 9;
                    continue stateLoop;
                }
                case 8: {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    var4 = stackIn_9_0;
                    vc.field_hb = var8.h(-118);
                    if (var4 == 0) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    vl.field_k = var8.h(-118);
                    statePc = 12;
                    continue stateLoop;
                }
                case 11: {
                    vl.field_k = vc.field_hb;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (-2 == (td.field_h ^ -1)) {
                        statePc = 15;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (4 != td.field_h) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    ef.field_b = var8.c((byte) 49);
                    pb.field_l = var8.h(-127);
                    statePc = 17;
                    continue stateLoop;
                }
                case 16: {
                    pb.field_l = null;
                    ef.field_b = 0;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if (param0) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    aa.field_f = hc.a(128, 80, (jc) (Object) var8);
                    ne.field_e = null;
                    statePc = 26;
                    continue stateLoop;
                }
                case 19: {
                    var5 = var8.c((byte) -77);
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    try {
                        var9 = cj.field_s.a((byte) 125, var5);
                        aa.field_f = var9.d(124);
                        if (vl.field_k.equals((Object) (Object) mi.field_d)) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackOut_21_0 = var9.field_u;
                        stackIn_23_0 = stackOut_21_0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackOut_22_0 = null;
                        stackIn_23_0 = (int[]) (Object) stackOut_22_0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        ne.field_e = stackIn_23_0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 25: {
                    var6 = (Exception) (Object) caughtException;
                    en.a("CC1", (Throwable) (Object) var6, 1);
                    ne.field_e = null;
                    aa.field_f = null;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    return new cj(param0);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if ((param1 & 7) != 0) {
            var2 = 8 - (param1 & 7);
        }
        int var4 = 112 % ((46 - param0) / 59);
        int var3 = var2 + param1;
        return var3;
    }

    final void c(int param0) throws IOException {
        if (param0 > -62) {
            ((el) this).field_l = true;
        }
        if (((el) this).field_l) {
            return;
        }
        if (((el) this).field_p) {
            ((el) this).field_p = false;
            throw new IOException();
        }
    }

    final void b(int param0) {
        int var4 = 0;
        var4 = Virogrid.field_F ? 1 : 0;
        if (((el) this).field_l) {
            return;
        }
        Object var2 = this;
        // monitorenter this
        ((el) this).field_l = true;
        this.notifyAll();
        // monitorexit var2
        if (!(null == ((el) this).field_n)) {
            while (-1 == (((el) this).field_n.field_a ^ -1)) {
                mm.a(-64, 1L);
            }
            if (!((((el) this).field_n.field_a ^ -1) != -2)) {
                try {
                    if (false) throw (InterruptedException) null;
                    ((Thread) ((el) this).field_n.field_f).join();
                } catch (InterruptedException interruptedException) {
                }
            }
        }
        if (param0 != 4155) {
            field_f = null;
        }
        ((el) this).field_n = null;
    }

    final static void e(int param0) {
        if (param0 != -2) {
            return;
        }
        la var1 = (la) (Object) vi.field_h.a((byte) -34);
        if (var1 == null) {
            tn.a(false);
            return;
        }
        hg var2 = sh.field_qb;
        int discarded$0 = var2.d((byte) 118);
        int discarded$1 = var2.d((byte) 102);
        int discarded$2 = var2.d((byte) 99);
        int discarded$3 = var2.d((byte) 102);
        var1.a(false);
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
                    var8 = Virogrid.field_F ? 1 : 0;
                    if (!((el) this).field_l) {
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
                    if (!((el) this).field_p) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((el) this).field_p = false;
                    throw new IOException();
                }
                case 4: {
                    if (((el) this).field_v == null) {
                        statePc = 6;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 6: {
                    ((el) this).field_v = new byte[((el) this).field_m];
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
                        var6 = param1;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var6 >= param3) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        ((el) this).field_v[((el) this).field_c] = param0[var6 + param2];
                        ((el) this).field_c = (((el) this).field_c - -1) % ((el) this).field_m;
                        if (((el) this).field_c != (((el) this).field_m + ((el) this).field_u + -100) % ((el) this).field_m) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw new IOException();
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var6++;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (null != ((el) this).field_n) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        ((el) this).field_n = ((el) this).field_o.a(3, (Runnable) this, param1 ^ 255);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        this.notifyAll();
                        // monitorexit var5
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var7 = caughtException;
                        // monitorexit var5
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 18: {
                    if (var7 instanceof RuntimeException) throw (RuntimeException) var7;
                    if (var7 instanceof Error) throw (Error) var7;
                    throw (IOException) (Object) var7;
                }
                case 19: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(boolean param0) {
        if (!param0) {
            return;
        }
        ib.b(-94);
        nf.a(td.field_j, j.field_k[0].field_u, pg.field_e, oc.field_k, -27, qi.field_d);
    }

    protected final void finalize() {
        ((el) this).b(4155);
    }

    public static void d(int param0) {
        if (param0 > -124) {
            return;
        }
        field_a = null;
        field_f = null;
        field_g = null;
        field_s = null;
        field_w = null;
        field_i = null;
        field_d = null;
        field_h = null;
        field_b = null;
    }

    final int f(int param0) throws IOException {
        if (!(!((el) this).field_l)) {
            return 0;
        }
        if (param0 != 31479) {
            return 69;
        }
        return ((el) this).field_e.available();
    }

    final static void a(int param0, boolean param1) {
        ad.field_g[2] = 0.0;
        ad.field_g[0] = 1.0;
        el.a(false, (byte) -106);
        mj.field_D = 262144;
        ao.field_Hb = 52.5f;
        we.field_k = 50.0f;
        co.field_h = 0;
        int var2 = param1 ? 1 : 0;
        int var3 = bd.field_e;
        if (hm.field_c != 0) {
            // if_icmpeq L89
            // if_icmpeq L89
            // if_icmpeq L89
            // if_icmpeq L89
        } else {
            var3 = hm.field_c;
        }
        gb.a(-2, var3, var2 != 0, 0);
        if (param0 != 12229) {
            field_h = null;
        }
        if (-1 != mj.field_E) {
            if (-11 <= mj.field_E) {
                // if_icmpge L144
            } else {
                bc.field_c = -16 >= (mj.field_E ^ -1) ? 3 : 2;
                co.field_l = -16 >= (mj.field_E ^ -1) ? 3 : 2;
                ka.a(true, (byte) 87);
            }
        }
    }

    public final void run() {
        try {
            IOException iOException = null;
            int var1_int = 0;
            IOException var1 = null;
            Exception var1_ref = null;
            int var2 = 0;
            Object var3 = null;
            int var6 = 0;
            Object var7 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = Virogrid.field_F ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3 = this;
                            if (((el) this).field_u != ((el) this).field_c) {
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
                            if (!((el) this).field_l) {
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
                            statePc = 17;
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
                            if (((el) this).field_u <= ((el) this).field_c) {
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
                            var1_int = ((el) this).field_m - ((el) this).field_u;
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
                            var1_int = ((el) this).field_c + -((el) this).field_u;
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
                            var2 = ((el) this).field_u;
                            if ((var1_int ^ -1) >= -1) {
                                statePc = 1;
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
                            ((el) this).field_j.write(((el) this).field_v, var2, var1_int);
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = (stateCaught_9 instanceof IOException ? 11 : 29);
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            iOException = (IOException) (Object) caughtException;
                            ((el) this).field_p = true;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            ((el) this).field_u = (((el) this).field_u + var1_int) % ((el) this).field_m;
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
                            if (((el) this).field_u != ((el) this).field_c) {
                                statePc = 1;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = (stateCaught_13 instanceof IOException ? 16 : 29);
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            ((el) this).field_j.flush();
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = (stateCaught_14 instanceof IOException ? 16 : 29);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            iOException = (IOException) (Object) caughtException;
                            ((el) this).field_p = true;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (null != ((el) this).field_e) {
                                statePc = 19;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof IOException ? 26 : 29);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof IOException ? 26 : 29);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            ((el) this).field_e.close();
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
                            if (((el) this).field_j == null) {
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
                            ((el) this).field_j.close();
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
                            if (((el) this).field_q != null) {
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
                            ((el) this).field_q.close();
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
                            ((el) this).field_v = null;
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
                        en.a((String) null, (Throwable) (Object) var1_ref, 1);
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

    el(java.net.Socket param0, pd param1) throws IOException {
        this(param0, param1, 5000);
    }

    final static void a(boolean param0, byte param1) {
        ec.field_z = sj.field_o;
        jk.field_c = 2;
        if (param0) {
            kg.field_a = sg.field_i;
            ai.field_c = sj.field_o;
        }
        if (param1 != -106) {
            return;
        }
        em.field_c = sg.field_i;
    }

    final int a(int param0) throws IOException {
        if (param0 != -1) {
            ((el) this).field_l = false;
        }
        if (((el) this).field_l) {
            return 0;
        }
        return ((el) this).field_e.read();
    }

    private el(java.net.Socket param0, pd param1, int param2) throws IOException {
        ((el) this).field_l = false;
        ((el) this).field_p = false;
        ((el) this).field_c = 0;
        ((el) this).field_u = 0;
        ((el) this).field_q = param0;
        ((el) this).field_o = param1;
        ((el) this).field_q.setSoTimeout(30000);
        ((el) this).field_q.setTcpNoDelay(true);
        ((el) this).field_e = ((el) this).field_q.getInputStream();
        ((el) this).field_j = ((el) this).field_q.getOutputStream();
        ((el) this).field_m = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_b = "Full";
        field_r = -1;
        field_g = "Only show lobby chat from my friends";
        field_f = "Seriously offensive language";
        field_t = 2;
        field_h = new int[]{8};
        field_a = "This game option has not yet been unlocked for use.";
    }
}
