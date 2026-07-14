/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ib implements Runnable {
    static String field_j;
    private sc field_m;
    private static volatile long field_w;
    private static String field_i;
    bg field_a;
    boolean field_f;
    bg field_h;
    private Thread field_r;
    private boolean field_l;
    private af field_o;
    bg[] field_g;
    private af field_k;
    java.awt.EventQueue field_t;
    static java.lang.reflect.Method field_c;
    bg field_u;
    private static String field_n;
    private Object field_d;
    private Object field_e;
    private static String field_v;
    private static int field_b;
    private cl field_x;
    private boolean field_q;
    static String field_s;
    static String field_p;

    private final af a(String param0, int param1, int param2, boolean param3) {
        if (param1 < 37) {
            ((ib) this).field_a = null;
        }
        return this.a(0, param2, !param3 ? 1 : 22, -15563, (Object) (Object) param0);
    }

    final void a(byte param0) {
        try {
            Object var2 = null;
            InterruptedException var2_ref = null;
            IOException var2_ref2 = null;
            int var2_int = 0;
            Throwable var3 = null;
            IOException var3_ref = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var2 = this;
                        // monitorenter this
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            ((ib) this).field_q = true;
                            this.notifyAll();
                            // monitorexit var2
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 3;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var3 = caughtException;
                            // monitorexit var2
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 3;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        throw (RuntimeException) (Object) var3;
                    }
                    case 5: {
                        if (param0 == 55) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        return;
                    }
                    case 7: {
                        try {
                            ((ib) this).field_r.join();
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        var2_ref = (InterruptedException) (Object) caughtException;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if (null == ((ib) this).field_u) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        try {
                            ((ib) this).field_u.a((byte) 20);
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        var2_ref2 = (IOException) (Object) caughtException;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
                        if (((ib) this).field_h != null) {
                            statePc = 16;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        try {
                            ((ib) this).field_h.a((byte) 20);
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        var2_ref2 = (IOException) (Object) caughtException;
                        statePc = 19;
                        continue stateLoop;
                    }
                    case 19: {
                        if (((ib) this).field_g != null) {
                            statePc = 21;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    }
                    case 21: {
                        var2_int = 0;
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 22: {
                        if (var2_int >= ((ib) this).field_g.length) {
                            statePc = 28;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        if (null != ((ib) this).field_g[var2_int]) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    }
                    case 24: {
                        var2_int++;
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 25: {
                        try {
                            ((ib) this).field_g[var2_int].a((byte) 20);
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 27;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        var2_int++;
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 27: {
                        var3_ref = (IOException) (Object) caughtException;
                        var2_int++;
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 28: {
                        if (((ib) this).field_a != null) {
                            statePc = 30;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    }
                    case 30: {
                        try {
                            ((ib) this).field_a.a((byte) 20);
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        var2_ref2 = (IOException) (Object) caughtException;
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

    final af a(String param0, Class[] param1, Class param2, byte param3) {
        if (param3 != -32) {
            af discarded$0 = ((ib) this).a(37);
        }
        return this.a(0, 0, 8, -15563, (Object) (Object) new Object[3]);
    }

    private final af a(int param0, int param1, int param2, int param3, Object param4) {
        af var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = new af();
                    var6.field_f = param0;
                    if (param3 == -15563) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    ((ib) this).run();
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var6.field_c = param4;
                    var6.field_a = param2;
                    var6.field_g = param1;
                    var7 = this;
                    // monitorenter this
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        if (((ib) this).field_o == null) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        ((ib) this).field_o.field_e = var6;
                        ((ib) this).field_o = var6;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        ((ib) this).field_k = var6;
                        ((ib) this).field_o = var6;
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
                        this.notify();
                        // monitorexit var7
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
                        var8 = caughtException;
                        // monitorexit var7
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 9: {
                    throw (RuntimeException) (Object) var8;
                }
                case 10: {
                    return var6;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final af a(java.net.URL param0, int param1) {
        if (param1 != 0) {
            Object var4 = null;
            bg discarded$0 = ib.a((String) null, (String) null, 88, 91);
        }
        return this.a(0, 0, 4, param1 + -15563, (Object) (Object) param0);
    }

    final boolean a(boolean param0) {
        if (!param0) {
            Object var3 = null;
            af discarded$0 = ((ib) this).a((String) null, 24, (Class) null);
        }
        if (!((ib) this).field_f) {
            return false;
        }
        if (!((ib) this).field_l) {
            return ((ib) this).field_e != null ? true : false;
        }
        return ((ib) this).field_x != null ? true : false;
    }

    public final void run() {
        try {
            Object var2 = null;
            ThreadDeath var2_ref = null;
            Throwable var2_ref2 = null;
            int var2_int = 0;
            InterruptedException var3_ref_InterruptedException = null;
            uk var3_ref_uk = null;
            Exception var3_ref_Exception = null;
            bg var3_ref = null;
            int var3 = 0;
            Throwable var4 = null;
            int var4_int = 0;
            String var4_ref = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            af var8 = null;
            Thread var9 = null;
            String var10 = null;
            String var11 = null;
            Object[] var12 = null;
            java.awt.Component var13 = null;
            java.awt.Frame var14 = null;
            java.awt.datatransfer.Clipboard var15 = null;
            java.awt.datatransfer.Clipboard var16 = null;
            Object[] var17 = null;
            Object[] var18 = null;
            int stackIn_84_0 = 0;
            int stackOut_82_0 = 0;
            int stackOut_83_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var2 = this;
                        // monitorenter this
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (!((ib) this).field_q) {
                                statePc = 4;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            // monitorexit var2
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        return;
                    }
                    case 4: {
                        try {
                            if (((ib) this).field_k != null) {
                                statePc = 6;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var8 = ((ib) this).field_k;
                            ((ib) this).field_k = ((ib) this).field_k.field_e;
                            if (null == ((ib) this).field_k) {
                                statePc = 8;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            ((ib) this).field_o = null;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            this.wait();
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = (stateCaught_9 instanceof InterruptedException ? 11 : 14);
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            var3_ref_InterruptedException = (InterruptedException) (Object) caughtException;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            // monitorexit var2
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            var4 = caughtException;
                            // monitorexit var2
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        throw (RuntimeException) (Object) var4;
                    }
                    case 16: {
                        try {
                            var2_int = var8.field_a;
                            if (-2 != (var2_int ^ -1)) {
                                statePc = 20;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (field_w <= bb.b(-1)) {
                                statePc = 19;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            var8.field_b = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var8.field_c), var8.field_g);
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if ((var2_int ^ -1) != -23) {
                                statePc = 27;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (bb.b(-1) < field_w) {
                                statePc = 23;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            var8.field_b = (Object) (Object) lh.a(var8.field_g, (String) var8.field_c, -1).b(-64);
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof uk ? 26 : (stateCaught_24 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            var3_ref_uk = (uk) (Object) caughtException;
                            var8.field_b = (Object) (Object) var3_ref_uk.getMessage();
                            throw var3_ref_uk;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            if (-3 != (var2_int ^ -1)) {
                                statePc = 29;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            var9 = new Thread((Runnable) var8.field_c);
                            var9.setDaemon(true);
                            var9.start();
                            var9.setPriority(var8.field_g);
                            var8.field_b = (Object) (Object) var9;
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            if (-5 == (var2_int ^ -1)) {
                                statePc = 109;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if (var2_int == 8) {
                                statePc = 103;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (var2_int == 9) {
                                statePc = 98;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if (18 == var2_int) {
                                statePc = 97;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            if ((var2_int ^ -1) == -20) {
                                statePc = 96;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if (((ib) this).field_f) {
                                statePc = 36;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            if (3 != var2_int) {
                                statePc = 40;
                            } else {
                                statePc = 37;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            if ((field_w ^ -1L) >= (bb.b(-1) ^ -1L)) {
                                statePc = 39;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            var10 = (var8.field_g >> -641062856 & 255) + "." + (255 & var8.field_g >> -2075453520) + "." + ((var8.field_g & 65493) >> 661687304) + "." + (var8.field_g & 255);
                            var8.field_b = (Object) (Object) java.net.InetAddress.getByName(var10).getHostName();
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            if (21 != var2_int) {
                                statePc = 45;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            if (field_w > bb.b(-1)) {
                                statePc = 43;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            statePc = 44;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            var8.field_b = (Object) (Object) java.net.InetAddress.getByName((String) var8.field_c).getAddress();
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            if (5 == var2_int) {
                                statePc = 93;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            if (6 == var2_int) {
                                statePc = 90;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            if (var2_int == -8) {
                                statePc = 87;
                            } else {
                                statePc = 48;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            if (-13 != var2_int) {
                                statePc = 50;
                            } else {
                                statePc = 49;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            var3_ref = ib.a(field_n, (String) var8.field_c, 104, field_b);
                            var8.field_b = (Object) (Object) var3_ref;
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = (stateCaught_49 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            if (13 != var2_int) {
                                statePc = 52;
                            } else {
                                statePc = 51;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = (stateCaught_50 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            var3_ref = ib.a("", (String) var8.field_c, 69, field_b);
                            var8.field_b = (Object) (Object) var3_ref;
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = (stateCaught_51 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            if (!((ib) this).field_f) {
                                statePc = 57;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            if ((var2_int ^ -1) != -15) {
                                statePc = 57;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = (stateCaught_53 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            var3 = var8.field_g;
                            var4_int = var8.field_f;
                            if (((ib) this).field_l) {
                                statePc = 56;
                            } else {
                                statePc = 55;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = (stateCaught_54 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            Object discarded$6 = Class.forName("jl").getDeclaredMethod("movemouse", new Class[2]).invoke(((ib) this).field_d, new Object[2]);
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = (stateCaught_55 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            ((ib) this).field_m.a(var4_int, true, var3);
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = (stateCaught_56 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            if (!((ib) this).field_f) {
                                statePc = 60;
                            } else {
                                statePc = 58;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = (stateCaught_57 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            if (15 == var2_int) {
                                statePc = 81;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = (stateCaught_58 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = (stateCaught_59 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            if (((ib) this).field_l) {
                                statePc = 63;
                            } else {
                                statePc = 61;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = (stateCaught_60 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            if (-18 == var2_int) {
                                statePc = 80;
                            } else {
                                statePc = 62;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = (stateCaught_61 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = (stateCaught_62 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            if (-17 == var2_int) {
                                statePc = 65;
                            } else {
                                statePc = 64;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = (stateCaught_63 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = (stateCaught_64 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            if (field_s.startsWith("win")) {
                                statePc = 67;
                            } else {
                                statePc = 66;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = (stateCaught_65 instanceof Exception ? 79 : (stateCaught_65 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = (stateCaught_66 instanceof Exception ? 79 : (stateCaught_66 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            var11 = (String) var8.field_c;
                            if (var11.startsWith("http://")) {
                                statePc = 71;
                            } else {
                                statePc = 68;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = (stateCaught_67 instanceof Exception ? 79 : (stateCaught_67 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            if (!var11.startsWith("https://")) {
                                statePc = 70;
                            } else {
                                statePc = 69;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = (stateCaught_68 instanceof Exception ? 79 : (stateCaught_68 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            statePc = 71;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = (stateCaught_69 instanceof Exception ? 79 : (stateCaught_69 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = (stateCaught_70 instanceof Exception ? 79 : (stateCaught_70 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            var4_ref = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            var5 = 0;
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = (stateCaught_71 instanceof Exception ? 79 : (stateCaught_71 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            if (var5 >= var11.length()) {
                                statePc = 77;
                            } else {
                                statePc = 73;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = (stateCaught_72 instanceof Exception ? 79 : (stateCaught_72 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            if (-1 == var4_ref.indexOf((int) var11.charAt(var5))) {
                                statePc = 75;
                            } else {
                                statePc = 74;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = (stateCaught_73 instanceof Exception ? 79 : (stateCaught_73 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            statePc = 76;
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = (stateCaught_74 instanceof Exception ? 79 : (stateCaught_74 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = (stateCaught_75 instanceof Exception ? 79 : (stateCaught_75 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            var5++;
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = (stateCaught_76 instanceof Exception ? 79 : (stateCaught_76 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            Process discarded$7 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var11 + "\"");
                            var8.field_b = null;
                            statePc = 78;
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = (stateCaught_77 instanceof Exception ? 79 : (stateCaught_77 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = (stateCaught_78 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            var3_ref_Exception = (Exception) (Object) caughtException;
                            var8.field_b = (Object) (Object) var3_ref_Exception;
                            throw (RuntimeException) (Object) var3_ref_Exception;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = (stateCaught_79 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            var12 = (Object[]) var8.field_c;
                            Object discarded$8 = Class.forName("jl").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((ib) this).field_d, new Object[5]);
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = (stateCaught_80 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            if (-1 == (var8.field_g ^ -1)) {
                                statePc = 83;
                            } else {
                                statePc = 82;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = (stateCaught_81 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            stackOut_82_0 = 1;
                            stackIn_84_0 = stackOut_82_0;
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = (stateCaught_82 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            stackOut_83_0 = 0;
                            stackIn_84_0 = stackOut_83_0;
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = (stateCaught_83 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            var3 = stackIn_84_0;
                            var13 = (java.awt.Component) var8.field_c;
                            if (((ib) this).field_l) {
                                statePc = 86;
                            } else {
                                statePc = 85;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = (stateCaught_84 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            Object discarded$9 = Class.forName("jl").getDeclaredMethod("showcursor", new Class[2]).invoke(((ib) this).field_d, new Object[2]);
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = (stateCaught_85 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            ((ib) this).field_m.a(var3 != 0, var13, 54);
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = (stateCaught_86 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            if (!((ib) this).field_l) {
                                statePc = 89;
                            } else {
                                statePc = 88;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = (stateCaught_87 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            ((ib) this).field_x.a(8, (java.awt.Frame) var8.field_c);
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = (stateCaught_88 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            Object discarded$10 = Class.forName("rj").getMethod("exit", new Class[0]).invoke(((ib) this).field_e, new Object[0]);
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = (stateCaught_89 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            var14 = new java.awt.Frame("Jagex Full Screen");
                            var8.field_b = (Object) (Object) var14;
                            var14.setResizable(false);
                            if (((ib) this).field_l) {
                                statePc = 92;
                            } else {
                                statePc = 91;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = (stateCaught_90 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            Object discarded$11 = Class.forName("rj").getMethod("enter", new Class[5]).invoke(((ib) this).field_e, new Object[5]);
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = (stateCaught_91 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            ((ib) this).field_x.a(var8.field_f >> -2053526128, 11468, var8.field_g >>> -540972080, var14, 65535 & var8.field_f, 65535 & var8.field_g);
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = (stateCaught_92 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            if (((ib) this).field_l) {
                                statePc = 95;
                            } else {
                                statePc = 94;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = (stateCaught_93 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        try {
                            var8.field_b = Class.forName("rj").getMethod("listmodes", new Class[0]).invoke(((ib) this).field_e, new Object[0]);
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = (stateCaught_94 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        try {
                            var8.field_b = (Object) (Object) ((ib) this).field_x.a(-16);
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_95) {
                            caughtException = stateCaught_95;
                            statePc = (stateCaught_95 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 96: {
                        try {
                            var7 = (java.awt.datatransfer.Transferable) var8.field_c;
                            var15 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var15.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = (stateCaught_96 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var8.field_b = (Object) (Object) var16.getContents((Object) null);
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_97) {
                            caughtException = stateCaught_97;
                            statePc = (stateCaught_97 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 98: {
                        try {
                            var17 = (Object[]) var8.field_c;
                            if (!((ib) this).field_f) {
                                statePc = 102;
                            } else {
                                statePc = 99;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_98) {
                            caughtException = stateCaught_98;
                            statePc = (stateCaught_98 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            if (((Class) var17[0]).getClassLoader() == null) {
                                statePc = 101;
                            } else {
                                statePc = 100;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = (stateCaught_99 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 100: {
                        try {
                            statePc = 102;
                            continue stateLoop;
                        } catch (Throwable stateCaught_100) {
                            caughtException = stateCaught_100;
                            statePc = (stateCaught_100 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        try {
                            throw new SecurityException();
                        } catch (Throwable stateCaught_101) {
                            caughtException = stateCaught_101;
                            statePc = (stateCaught_101 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 102: {
                        try {
                            var8.field_b = (Object) (Object) ((Class) var17[0]).getDeclaredField((String) var17[1]);
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_102) {
                            caughtException = stateCaught_102;
                            statePc = (stateCaught_102 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 103: {
                        try {
                            var18 = (Object[]) var8.field_c;
                            if (((ib) this).field_f) {
                                statePc = 105;
                            } else {
                                statePc = 104;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_103) {
                            caughtException = stateCaught_103;
                            statePc = (stateCaught_103 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 104: {
                        try {
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_104) {
                            caughtException = stateCaught_104;
                            statePc = (stateCaught_104 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 105: {
                        try {
                            if (null == ((Class) var18[0]).getClassLoader()) {
                                statePc = 107;
                            } else {
                                statePc = 106;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_105) {
                            caughtException = stateCaught_105;
                            statePc = (stateCaught_105 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 106: {
                        try {
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_106) {
                            caughtException = stateCaught_106;
                            statePc = (stateCaught_106 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 107: {
                        try {
                            throw new SecurityException();
                        } catch (Throwable stateCaught_107) {
                            caughtException = stateCaught_107;
                            statePc = (stateCaught_107 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 108: {
                        try {
                            var8.field_b = (Object) (Object) ((Class) var18[0]).getDeclaredMethod((String) var18[1], (Class[]) var18[2]);
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_108) {
                            caughtException = stateCaught_108;
                            statePc = (stateCaught_108 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 109: {
                        try {
                            if ((bb.b(-1) ^ -1L) <= (field_w ^ -1L)) {
                                statePc = 111;
                            } else {
                                statePc = 110;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_109) {
                            caughtException = stateCaught_109;
                            statePc = (stateCaught_109 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 110: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_110) {
                            caughtException = stateCaught_110;
                            statePc = (stateCaught_110 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 111: {
                        try {
                            var8.field_b = (Object) (Object) new DataInputStream(((java.net.URL) var8.field_c).openStream());
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_111) {
                            caughtException = stateCaught_111;
                            statePc = (stateCaught_111 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 112: {
                        try {
                            var8.field_d = 1;
                            statePc = 116;
                            continue stateLoop;
                        } catch (Throwable stateCaught_112) {
                            caughtException = stateCaught_112;
                            statePc = (stateCaught_112 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 114: {
                        var2_ref = (ThreadDeath) (Object) caughtException;
                        throw var2_ref;
                    }
                    case 115: {
                        var2_ref2 = caughtException;
                        var8.field_d = 2;
                        statePc = 116;
                        continue stateLoop;
                    }
                    case 116: {
                        var2 = (Object) (Object) var8;
                        // monitorenter var8
                        statePc = 117;
                        continue stateLoop;
                    }
                    case 117: {
                        try {
                            ((Object) (Object) var8).notify();
                            // monitorexit var2
                            statePc = 0;
                            continue stateLoop;
                        } catch (Throwable stateCaught_117) {
                            caughtException = stateCaught_117;
                            statePc = 119;
                            continue stateLoop;
                        }
                    }
                    case 119: {
                        try {
                            var6 = caughtException;
                            // monitorexit var2
                            statePc = 120;
                            continue stateLoop;
                        } catch (Throwable stateCaught_119) {
                            caughtException = stateCaught_119;
                            statePc = 119;
                            continue stateLoop;
                        }
                    }
                    case 120: {
                        throw (RuntimeException) (Object) var6;
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

    final af a(java.awt.Frame param0, byte param1) {
        if (param1 != -95) {
            ((ib) this).field_r = null;
        }
        return this.a(0, 0, 7, -15563, (Object) (Object) param0);
    }

    final af a(int param0, int param1, int param2, int param3, boolean param4) {
        if (param4) {
            Object var7 = null;
            af discarded$0 = ((ib) this).a((java.awt.Frame) null, (byte) 11);
        }
        return this.a(param0 + (param1 << -1290329808), (param3 << -1165186704) + param2, 6, -15563, (Object) null);
    }

    final af a(int param0) {
        if (param0 != 2) {
            return null;
        }
        return this.a(0, 0, 5, -15563, (Object) null);
    }

    private final static bg a(String param0, String param1, int param2, int param3) {
        try {
            String var7_ref = null;
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            Object var7 = null;
            Exception var8 = null;
            bg var8_ref = null;
            bg stackIn_15_0 = null;
            Throwable decompiledCaughtException = null;
            bg stackOut_14_0 = null;
            var7_ref = null;
            if (param2 >= 55) {
              L0: {
                if (-34 == (param3 ^ -1)) {
                  var4 = "jagex_" + param0 + "_preferences" + param1 + "_rc.dat";
                  break L0;
                } else {
                  if (param3 != 34) {
                    var4 = "jagex_" + param0 + "_preferences" + param1 + ".dat";
                    break L0;
                  } else {
                    var4 = "jagex_" + param0 + "_preferences" + param1 + "_wip.dat";
                    break L0;
                  }
                }
              }
              var5_array = new String[]{"c:/rscache/", "/rscache/", field_i, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
              var6 = 0;
              L1: while (true) {
                if (var5_array.length > var6) {
                  L2: {
                    var7_ref = var5_array[var6];
                    if (var7_ref.length() <= 0) {
                      break L2;
                    } else {
                      if (new File(var7_ref).exists()) {
                        break L2;
                      } else {
                        var6++;
                        continue L1;
                      }
                    }
                  }
                  try {
                    var8_ref = new bg(new File(var7_ref, var4), "rw", 10000L);
                    stackOut_14_0 = (bg) var8_ref;
                    stackIn_15_0 = stackOut_14_0;
                  } catch (java.lang.Exception decompiledCaughtParameter) {
                    decompiledCaughtException = decompiledCaughtParameter;
                    return stackIn_15_0;
                  }
                  continue L1;
                } else {
                  return null;
                }
              }
            } else {
              return null;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final af a(String param0, int param1, Class param2) {
        if (param1 != 9) {
            Object var5 = null;
            af discarded$0 = this.a(-70, -27, -21, 108, (Object) null);
        }
        return this.a(0, 0, 9, -15563, (Object) (Object) new Object[2]);
    }

    final af a(int param0, int param1, String param2) {
        if (param0 != 0) {
            return null;
        }
        return this.a(param2, 85, param1, false);
    }

    ib(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        int var5_int = 0;
        cl var7 = null;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    ((ib) this).field_h = null;
                    ((ib) this).field_l = false;
                    ((ib) this).field_f = false;
                    ((ib) this).field_a = null;
                    ((ib) this).field_u = null;
                    ((ib) this).field_k = null;
                    ((ib) this).field_o = null;
                    ((ib) this).field_q = false;
                    field_j = "1.1";
                    field_p = "Unknown";
                    stackOut_0_0 = this;
                    stackIn_2_0 = stackOut_0_0;
                    stackIn_1_0 = stackOut_0_0;
                    if (!param3) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    stackOut_1_0 = this;
                    stackOut_1_1 = 1;
                    stackIn_3_0 = stackOut_1_0;
                    stackIn_3_1 = stackOut_1_1;
                    statePc = 3;
                    continue stateLoop;
                }
                case 2: {
                    stackOut_2_0 = this;
                    stackOut_2_1 = 0;
                    stackIn_3_0 = stackOut_2_0;
                    stackIn_3_1 = stackOut_2_1;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    ((ib) this).field_f = stackIn_3_1 != 0;
                    field_b = param0;
                    field_n = param1;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        field_p = System.getProperty("java.vendor");
                        field_j = System.getProperty("java.version");
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    var5 = (Exception) (Object) caughtException;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (0 == (field_p.toLowerCase().indexOf("microsoft") ^ -1)) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    ((ib) this).field_l = true;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    try {
                        field_v = System.getProperty("os.name");
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    var5 = (Exception) (Object) caughtException;
                    field_v = "Unknown";
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    field_s = field_v.toLowerCase();
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    try {
                        String discarded$4 = System.getProperty("os.arch").toLowerCase();
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    var5 = (Exception) (Object) caughtException;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    try {
                        String discarded$5 = System.getProperty("os.version").toLowerCase();
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 18: {
                    var5 = (Exception) (Object) caughtException;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    try {
                        field_i = System.getProperty("user.home");
                        if (null == field_i) {
                            statePc = 23;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        field_i = field_i + "/";
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 22: {
                    var5 = (Exception) (Object) caughtException;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    if (null == field_i) {
                        statePc = 25;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 25: {
                    field_i = "~/";
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    try {
                        ((ib) this).field_t = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 28: {
                    var5_ref = caughtException;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    if (!((ib) this).field_l) {
                        statePc = 31;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 31: {
                    try {
                        java.lang.reflect.Method discarded$6 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[1]);
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 33: {
                    var5 = (Exception) (Object) caughtException;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    try {
                        field_c = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[1]);
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 36: {
                    var5 = (Exception) (Object) caughtException;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    me.a(field_n, field_b, -38);
                    if (!((ib) this).field_f) {
                        statePc = 56;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    ((ib) this).field_a = new bg(me.a(field_b, "random.dat", false, (String) null), "rw", 25L);
                    ((ib) this).field_u = new bg(me.a("main_file_cache.dat2", 95), "rw", 314572800L);
                    ((ib) this).field_h = new bg(me.a("main_file_cache.idx255", 126), "rw", 1048576L);
                    ((ib) this).field_g = new bg[param2];
                    var5_int = 0;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    if (param2 <= var5_int) {
                        statePc = 41;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    ((ib) this).field_g[var5_int] = new bg(me.a("main_file_cache.idx" + var5_int, 37), "rw", 1048576L);
                    var5_int++;
                    statePc = 39;
                    continue stateLoop;
                }
                case 41: {
                    if (((ib) this).field_l) {
                        statePc = 43;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 43: {
                    try {
                        Object discarded$7 = Class.forName("df").newInstance();
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 45: {
                    var5_ref = caughtException;
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    try {
                        if (!((ib) this).field_l) {
                            statePc = 48;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var7 = new cl();
                        ((ib) this).field_x = var7;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        ((ib) this).field_e = Class.forName("rj").newInstance();
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 50: {
                    var5_ref = caughtException;
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    try {
                        if (!((ib) this).field_l) {
                            statePc = 53;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        ((ib) this).field_m = new sc();
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        ((ib) this).field_d = Class.forName("jl").newInstance();
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 55: {
                    var5_ref = caughtException;
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    ((ib) this).field_q = false;
                    ((ib) this).field_r = new Thread((Runnable) this);
                    ((ib) this).field_r.setPriority(10);
                    ((ib) this).field_r.setDaemon(true);
                    ((ib) this).field_r.start();
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final af a(byte param0, int param1, Runnable param2) {
        if (param0 != -28) {
            field_s = null;
        }
        return this.a(0, param1, 2, -15563, (Object) (Object) param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = 0L;
    }
}
