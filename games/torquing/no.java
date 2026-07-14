/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class no implements Runnable {
    private java.net.Socket field_b;
    private boolean field_c;
    private boolean field_h;
    private rc field_k;
    static bo field_n;
    private int field_l;
    private vh field_g;
    private InputStream field_f;
    private int field_m;
    private int field_a;
    private OutputStream field_e;
    static int[] field_j;
    static int[] field_i;
    private byte[] field_d;

    final void e(int param0) throws IOException {
        if (param0 != 22685) {
            Object var3 = null;
            sf[] discarded$0 = no.a((vh) null, -81);
        }
        if (((no) this).field_c) {
            return;
        }
        if (!(!((no) this).field_h)) {
            ((no) this).field_h = false;
            throw new IOException();
        }
    }

    final void a(boolean param0) {
        int var4 = 0;
        var4 = Torquing.field_u;
        if (((no) this).field_c) {
            return;
        }
        Object var2 = this;
        // monitorenter this
        ((no) this).field_c = param0 ? true : false;
        this.notifyAll();
        // monitorexit var2
        if (null != ((no) this).field_k) {
            while (-1 == (((no) this).field_k.field_a ^ -1)) {
                ub.a(1976, 1L);
            }
            if (!(((no) this).field_k.field_a != 1)) {
                try {
                    if (false) throw (InterruptedException) null;
                    ((Thread) ((no) this).field_k.field_d).join();
                } catch (InterruptedException interruptedException) {
                }
            }
        }
        ((no) this).field_k = null;
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
                        var6 = Torquing.field_u;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3 = this;
                            if (((no) this).field_a == ((no) this).field_m) {
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
                            if (((no) this).field_c) {
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
                            if (((no) this).field_a >= ((no) this).field_m) {
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
                            var1_int = ((no) this).field_l - ((no) this).field_m;
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
                            var1_int = ((no) this).field_a - ((no) this).field_m;
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
                            var2 = ((no) this).field_m;
                            if ((var1_int ^ -1) >= -1) {
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
                            ((no) this).field_e.write(((no) this).field_d, var2, var1_int);
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
                            ((no) this).field_h = true;
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
                            ((no) this).field_m = (var1_int + ((no) this).field_m) % ((no) this).field_l;
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
                            if (((no) this).field_m == ((no) this).field_a) {
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
                            ((no) this).field_e.flush();
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
                            ((no) this).field_h = true;
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
                            if (null == ((no) this).field_f) {
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
                            ((no) this).field_f.close();
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
                            if (null != ((no) this).field_e) {
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
                            ((no) this).field_e.close();
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
                            if (((no) this).field_b == null) {
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
                            ((no) this).field_b.close();
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
                            ((no) this).field_d = null;
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
                        nn.a((String) null, (Throwable) (Object) var1_ref, -9958);
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

    final void a(int param0, byte[] param1, byte param2, int param3) throws IOException {
        Object var5_ref_Object = null;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = Torquing.field_u;
                    if (((no) this).field_c) {
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
                    if (((no) this).field_h) {
                        statePc = 5;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 5: {
                    ((no) this).field_h = false;
                    throw new IOException();
                }
                case 6: {
                    if (((no) this).field_d == null) {
                        statePc = 8;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 8: {
                    ((no) this).field_d = new byte[((no) this).field_l];
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    var5_ref_Object = this;
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
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var6 >= param3) {
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
                        ((no) this).field_d[((no) this).field_a] = param1[var6 + param0];
                        ((no) this).field_a = (((no) this).field_a - -1) % ((no) this).field_l;
                        if (((no) this).field_a == (((no) this).field_m + (((no) this).field_l + -100)) % ((no) this).field_l) {
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
                        if (((no) this).field_k == null) {
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
                        ((no) this).field_k = ((no) this).field_g.a((byte) -90, 3, (Runnable) this);
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
                        // monitorexit var5_ref_Object
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
                        // monitorexit var5_ref_Object
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
                    var5 = 44 / ((param2 - -55) / 42);
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void c(int param0) {
        if (!(!hj.field_b)) {
            return;
        }
        ra.field_e = of.field_l.field_r;
        fq.field_F.field_d = fq.field_F.field_d - of.field_l.field_r;
        fq.field_F.field_c = fq.field_F.field_c - of.field_l.field_v;
        hb.field_s = of.field_l.field_v;
        of.field_l.field_r = 0;
        t var4 = of.field_l;
        t var5 = var4;
        of.field_l.field_u = of.field_l.field_t;
        of.field_l.field_w = of.field_l.field_s;
        ub.field_E = -200;
        var5.field_v = 0;
        ra.field_c = (hb.field_s - ub.field_E) / 35;
        kc.field_v = la.field_j.field_r - -(la.field_j.field_t / 2);
        if (param0 > -68) {
            return;
        }
        ll.field_g = 63664;
        je.field_a = la.field_j.field_s / 2 + la.field_j.field_v;
        t var2 = la.field_j;
        la.field_j.field_r = 0;
        la.field_j.field_w = la.field_j.field_s;
        la.field_j.field_u = la.field_j.field_t;
        nn.field_e = -jb.field_b.field_c + 640;
        var2.field_v = 0;
        pp.field_a = nn.field_e / 30;
    }

    final static boolean a(int param0, int param1) {
        try {
            int var2_int = 0;
            IOException var2 = null;
            int stackIn_13_0 = 0;
            int stackIn_15_0 = 0;
            int stackOut_12_0 = 0;
            int stackOut_14_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (param0 <= kj.field_d.field_n) {
                            statePc = 2;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        return true;
                    }
                    case 3: {
                        if (vk.field_E == null) {
                            statePc = 5;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        return false;
                    }
                    case 6: {
                        try {
                            if (param1 == 0) {
                                statePc = 8;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            no.c(-9);
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var2_int = vk.field_E.a(-85);
                            if (-1 <= (var2_int ^ -1)) {
                                statePc = 16;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            if (var2_int <= param0 + -kj.field_d.field_n) {
                                statePc = 11;
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
                            var2_int = param0 - kj.field_d.field_n;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            vk.field_E.a(var2_int, kj.field_d.field_n, kj.field_d.field_j, (byte) -74);
                            rb.field_C = km.b(param1 ^ -1);
                            kj.field_d.field_n = kj.field_d.field_n + var2_int;
                            if (param0 <= kj.field_d.field_n) {
                                statePc = 14;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            stackOut_12_0 = 0;
                            stackIn_13_0 = stackOut_12_0;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        return stackIn_13_0 != 0;
                    }
                    case 14: {
                        try {
                            kj.field_d.field_n = 0;
                            stackOut_14_0 = 1;
                            stackIn_15_0 = stackOut_14_0;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        return stackIn_15_0 != 0;
                    }
                    case 16: {
                        try {
                            if ((var2_int ^ -1) > -1) {
                                statePc = 19;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (-30001L <= (lc.h((byte) -76) ^ -1L)) {
                                statePc = 21;
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
                            ih.b(true);
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            ih.b(true);
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        return false;
                    }
                    case 22: {
                        var2 = (IOException) (Object) caughtException;
                        ih.b(true);
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 23: {
                        return false;
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

    final int d(int param0) throws IOException {
        if (((no) this).field_c) {
            return 0;
        }
        if (param0 != 0) {
            field_j = null;
        }
        return ((no) this).field_f.read();
    }

    final void a(int param0, int param1, byte[] param2, byte param3) throws IOException {
        int var5 = 0;
        int var6 = Torquing.field_u;
        if (!(!((no) this).field_c)) {
            return;
        }
        while (0 < param0) {
            var5 = ((no) this).field_f.read(param2, param1, param0);
            if (var5 <= 0) {
                throw new EOFException();
            }
            param0 = param0 - var5;
            param1 = param1 + var5;
        }
        if (param3 != -74) {
            ((no) this).field_f = null;
        }
    }

    final static sf[] a(vh param0, int param1) {
        int var5 = 0;
        sf var6 = null;
        int var7 = Torquing.field_u;
        if (!param0.a((byte) 13)) {
            return new sf[]{};
        }
        if (param1 > -10) {
            pc discarded$0 = no.b(false);
        }
        rc var8 = param0.a(100);
        while (var8.field_a == 0) {
            ub.a(1976, 10L);
        }
        if (!(2 != var8.field_a)) {
            return new sf[]{};
        }
        int[] var12 = (int[]) var8.field_d;
        int[] var11 = var12;
        int[] var10 = var11;
        int[] var9 = var10;
        int[] var3 = var9;
        sf[] var4 = new sf[var12.length >> 626420226];
        for (var5 = 0; var4.length > var5; var5++) {
            var6 = new sf();
            var4[var5] = var6;
            var6.field_d = var3[var5 << 749009602];
            var6.field_c = var3[(var5 << -1164807710) + 1];
            var6.field_b = var3[2 + (var5 << 1225699106)];
            var6.field_e = var3[(var5 << -1680835230) + 3];
        }
        return var4;
    }

    final int a(int param0) throws IOException {
        if (param0 >= -68) {
            field_j = null;
        }
        if (((no) this).field_c) {
            return 0;
        }
        return ((no) this).field_f.available();
    }

    protected final void finalize() {
        ((no) this).a(true);
    }

    no(java.net.Socket param0, vh param1) throws IOException {
        this(param0, param1, 5000);
    }

    final static pc b(boolean param0) {
        if (!param0) {
            field_j = null;
        }
        if (bi.field_f == null) {
            bi.field_f = new pc(sp.field_R, 20, 0, 0, 0, 11579568, -1, 0, 0, sp.field_R.field_x, -1, 2147483647, true);
        }
        return bi.field_f;
    }

    public static void b(int param0) {
        field_i = null;
        field_n = null;
        if (param0 != 0) {
            field_i = null;
        }
        field_j = null;
    }

    private no(java.net.Socket param0, vh param1, int param2) throws IOException {
        ((no) this).field_a = 0;
        ((no) this).field_m = 0;
        ((no) this).field_h = false;
        ((no) this).field_c = false;
        ((no) this).field_g = param1;
        ((no) this).field_b = param0;
        ((no) this).field_b.setSoTimeout(30000);
        ((no) this).field_b.setTcpNoDelay(true);
        ((no) this).field_f = ((no) this).field_b.getInputStream();
        ((no) this).field_e = ((no) this).field_b.getOutputStream();
        ((no) this).field_l = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new int[8192];
        field_i = new int[128];
    }
}
