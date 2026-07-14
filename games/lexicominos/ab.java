/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ab implements Runnable {
    java.awt.EventQueue field_i;
    private static String field_n;
    private ei field_k;
    private ai field_r;
    private static int field_l;
    ea field_t;
    static String field_v;
    ea field_o;
    boolean field_e;
    static java.lang.reflect.Method field_x;
    private static String field_s;
    private static String field_a;
    private od field_u;
    ea field_w;
    private Object field_f;
    private boolean field_g;
    static String field_b;
    ea[] field_c;
    private boolean field_h;
    private static volatile long field_p;
    static String field_j;
    private Object field_d;
    private ei field_q;
    private Thread field_m;

    final ei a(int param0, java.awt.Frame param1) {
        if (param0 != 0) {
            Object var4 = null;
            ei discarded$0 = ((ab) this).a((Runnable) null, true, -106);
        }
        return this.a(param0 ^ -402166672, 0, 0, 7, (Object) (Object) param1);
    }

    final ei a(Runnable param0, boolean param1, int param2) {
        if (param1) {
            return null;
        }
        return this.a(-402166672, 0, param2, 2, (Object) (Object) param0);
    }

    final void a(int param0) {
        try {
            Object var2 = null;
            InterruptedException var2_ref = null;
            IOException var2_ref2 = null;
            int var2_int = 0;
            Throwable var3 = null;
            IOException var3_ref = null;
            Object var4 = null;
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
                            if (param0 == -265) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 5;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            var4 = null;
                            ei discarded$1 = ((ab) this).a(55, (byte) 0, (String) null);
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 5;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            ((ab) this).field_h = true;
                            this.notifyAll();
                            // monitorexit var2
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 5;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var3 = caughtException;
                            // monitorexit var2
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 5;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        throw (RuntimeException) (Object) var3;
                    }
                    case 7: {
                        try {
                            ((ab) this).field_m.join();
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
                        if (((ab) this).field_t != null) {
                            statePc = 12;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        try {
                            ((ab) this).field_t.a(true);
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        var2_ref2 = (IOException) (Object) caughtException;
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 15: {
                        if (((ab) this).field_o == null) {
                            statePc = 19;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        try {
                            ((ab) this).field_o.a(true);
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
                        if (((ab) this).field_c != null) {
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
                        if (((ab) this).field_c.length <= var2_int) {
                            statePc = 28;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        if (null != ((ab) this).field_c[var2_int]) {
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
                            ((ab) this).field_c[var2_int].a(true);
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
                        if (((ab) this).field_w != null) {
                            statePc = 30;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    }
                    case 30: {
                        try {
                            ((ab) this).field_w.a(true);
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

    public final void run() {
        try {
            Object var2 = null;
            ThreadDeath var2_ref = null;
            Throwable var2_ref2 = null;
            int var2_int = 0;
            InterruptedException var3 = null;
            ck var3_ref = null;
            Exception var3_ref2 = null;
            ea var3_ref3 = null;
            int var3_int = 0;
            Throwable var4_ref_Throwable = null;
            int var4 = 0;
            String var4_ref = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            ei var8 = null;
            Thread var9 = null;
            Object[] var10 = null;
            java.awt.datatransfer.Clipboard var11 = null;
            String var12 = null;
            Object[] var13 = null;
            String var14 = null;
            java.awt.Component var15 = null;
            java.awt.Frame var16 = null;
            java.awt.datatransfer.Clipboard var17 = null;
            Object[] var18 = null;
            int stackIn_82_0 = 0;
            int stackOut_80_0 = 0;
            int stackOut_81_0 = 0;
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
                            if (!((ab) this).field_h) {
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
                            if (((ab) this).field_k != null) {
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
                            var8 = ((ab) this).field_k;
                            ((ab) this).field_k = ((ab) this).field_k.field_f;
                            if (null == ((ab) this).field_k) {
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
                            ((ab) this).field_q = null;
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
                            var3 = (InterruptedException) (Object) caughtException;
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
                            var4_ref_Throwable = caughtException;
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
                        throw (RuntimeException) (Object) var4_ref_Throwable;
                    }
                    case 16: {
                        try {
                            var2_int = var8.field_a;
                            if (-2 == (var2_int ^ -1)) {
                                statePc = 109;
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
                            if ((var2_int ^ -1) != -23) {
                                statePc = 24;
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
                            if ((rf.c(0) ^ -1L) > (field_p ^ -1L)) {
                                statePc = 20;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            var8.field_g = (Object) (Object) v.a((String) var8.field_c, var8.field_d, (byte) 127).b(51);
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof ck ? 23 : (stateCaught_21 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            var3_ref = (ck) (Object) caughtException;
                            var8.field_g = (Object) (Object) var3_ref.getMessage();
                            throw var3_ref;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if (2 != var2_int) {
                                statePc = 26;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            var9 = new Thread((Runnable) var8.field_c);
                            var9.setDaemon(true);
                            var9.start();
                            var9.setPriority(var8.field_d);
                            var8.field_g = (Object) (Object) var9;
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
                            if (var2_int != 4) {
                                statePc = 31;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            if ((field_p ^ -1L) < (rf.c(0) ^ -1L)) {
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
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            var8.field_g = (Object) (Object) new DataInputStream(((java.net.URL) var8.field_c).openStream());
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (-9 != (var2_int ^ -1)) {
                                statePc = 38;
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
                            var10 = (Object[]) var8.field_c;
                            if (((ab) this).field_e) {
                                statePc = 34;
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
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if (((Class) var10[0]).getClassLoader() == null) {
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
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            throw new SecurityException();
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            var8.field_g = (Object) (Object) ((Class) var10[0]).getDeclaredMethod((String) var10[1], (Class[]) var10[2]);
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            if (-10 == var2_int) {
                                statePc = 104;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            if (var2_int != 18) {
                                statePc = 41;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            var11 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var8.field_g = (Object) (Object) var11.getContents((Object) null);
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            if (-20 == var2_int) {
                                statePc = 103;
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
                            if (!((ab) this).field_e) {
                                statePc = 102;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            if (3 != var2_int) {
                                statePc = 48;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            if (field_p > rf.c(0)) {
                                statePc = 46;
                            } else {
                                statePc = 45;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            statePc = 47;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            var12 = (var8.field_d >> 761970712 & 255) + "." + (255 & var8.field_d >> -1149726256) + "." + ((var8.field_d & 65321) >> -2115196792) + "." + (255 & var8.field_d);
                            var8.field_g = (Object) (Object) java.net.InetAddress.getByName(var12).getHostName();
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            if ((var2_int ^ -1) == -22) {
                                statePc = 99;
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
                            if ((var2_int ^ -1) == -6) {
                                statePc = 96;
                            } else {
                                statePc = 50;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = (stateCaught_49 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            if (var2_int == -7) {
                                statePc = 93;
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
                            if (7 == var2_int) {
                                statePc = 90;
                            } else {
                                statePc = 52;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = (stateCaught_51 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            if (12 == var2_int) {
                                statePc = 89;
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
                            if (-14 == var2_int) {
                                statePc = 88;
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
                            if (!((ab) this).field_e) {
                                statePc = 57;
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
                            if ((var2_int ^ -1) == -15) {
                                statePc = 85;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = (stateCaught_55 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = (stateCaught_56 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            if (!((ab) this).field_e) {
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
                            if (var2_int == -16) {
                                statePc = 79;
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
                            if (((ab) this).field_g) {
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
                            if (-18 != var2_int) {
                                statePc = 63;
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
                            var13 = (Object[]) var8.field_c;
                            Object discarded$6 = Class.forName("lc").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((ab) this).field_d, new Object[5]);
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = (stateCaught_62 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            if ((var2_int ^ -1) != -17) {
                                statePc = 78;
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
                            if (field_b.startsWith("win")) {
                                statePc = 66;
                            } else {
                                statePc = 65;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = (stateCaught_64 instanceof Exception ? 77 : (stateCaught_64 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = (stateCaught_65 instanceof Exception ? 77 : (stateCaught_65 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            var14 = (String) var8.field_c;
                            if (var14.startsWith("http://")) {
                                statePc = 69;
                            } else {
                                statePc = 67;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = (stateCaught_66 instanceof Exception ? 77 : (stateCaught_66 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            if (var14.startsWith("https://")) {
                                statePc = 69;
                            } else {
                                statePc = 68;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = (stateCaught_67 instanceof Exception ? 77 : (stateCaught_67 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = (stateCaught_68 instanceof Exception ? 77 : (stateCaught_68 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            var4_ref = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            var5 = 0;
                            statePc = 70;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = (stateCaught_69 instanceof Exception ? 77 : (stateCaught_69 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            if (var14.length() <= var5) {
                                statePc = 75;
                            } else {
                                statePc = 71;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = (stateCaught_70 instanceof Exception ? 77 : (stateCaught_70 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            if (0 == (var4_ref.indexOf((int) var14.charAt(var5)) ^ -1)) {
                                statePc = 73;
                            } else {
                                statePc = 72;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = (stateCaught_71 instanceof Exception ? 77 : (stateCaught_71 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            statePc = 74;
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = (stateCaught_72 instanceof Exception ? 77 : (stateCaught_72 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = (stateCaught_73 instanceof Exception ? 77 : (stateCaught_73 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            var5++;
                            statePc = 70;
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = (stateCaught_74 instanceof Exception ? 77 : (stateCaught_74 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            Process discarded$7 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var14 + "\"");
                            var8.field_g = null;
                            statePc = 76;
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = (stateCaught_75 instanceof Exception ? 77 : (stateCaught_75 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = (stateCaught_76 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            var3_ref2 = (Exception) (Object) caughtException;
                            var8.field_g = (Object) (Object) var3_ref2;
                            throw (RuntimeException) (Object) var3_ref2;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = (stateCaught_77 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = (stateCaught_78 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            if (0 == var8.field_d) {
                                statePc = 81;
                            } else {
                                statePc = 80;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = (stateCaught_79 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            stackOut_80_0 = 1;
                            stackIn_82_0 = stackOut_80_0;
                            statePc = 82;
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = (stateCaught_80 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            stackOut_81_0 = 0;
                            stackIn_82_0 = stackOut_81_0;
                            statePc = 82;
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = (stateCaught_81 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            var3_int = stackIn_82_0;
                            var15 = (java.awt.Component) var8.field_c;
                            if (((ab) this).field_g) {
                                statePc = 84;
                            } else {
                                statePc = 83;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = (stateCaught_82 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            Object discarded$8 = Class.forName("lc").getDeclaredMethod("showcursor", new Class[2]).invoke(((ab) this).field_d, new Object[2]);
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = (stateCaught_83 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            ((ab) this).field_u.a(var15, var3_int != 0, true);
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = (stateCaught_84 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            var3_int = var8.field_d;
                            var4 = var8.field_e;
                            if (!((ab) this).field_g) {
                                statePc = 87;
                            } else {
                                statePc = 86;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = (stateCaught_85 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            ((ab) this).field_u.a(var3_int, var4, 123);
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
                            Object discarded$9 = Class.forName("lc").getDeclaredMethod("movemouse", new Class[2]).invoke(((ab) this).field_d, new Object[2]);
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = (stateCaught_87 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            var3_ref3 = ab.a((String) var8.field_c, 2, "", field_l);
                            var8.field_g = (Object) (Object) var3_ref3;
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
                            var3_ref3 = ab.a((String) var8.field_c, 2, field_s, field_l);
                            var8.field_g = (Object) (Object) var3_ref3;
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
                            if (((ab) this).field_g) {
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
                            Object discarded$10 = Class.forName("tk").getMethod("exit", new Class[0]).invoke(((ab) this).field_f, new Object[0]);
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
                            ((ab) this).field_r.a((java.awt.Frame) var8.field_c, -20);
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
                            var16 = new java.awt.Frame("Jagex Full Screen");
                            var8.field_g = (Object) (Object) var16;
                            var16.setResizable(false);
                            if (((ab) this).field_g) {
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
                            Object discarded$11 = Class.forName("tk").getMethod("enter", new Class[5]).invoke(((ab) this).field_f, new Object[5]);
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
                            ((ab) this).field_r.a(var16, var8.field_e >> -2089408976, 13486, var8.field_d >>> 238891568, 65535 & var8.field_d, var8.field_e & 65535);
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
                            if (!((ab) this).field_g) {
                                statePc = 98;
                            } else {
                                statePc = 97;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = (stateCaught_96 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            var8.field_g = (Object) (Object) ((ab) this).field_r.a(0);
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
                            var8.field_g = Class.forName("tk").getMethod("listmodes", new Class[0]).invoke(((ab) this).field_f, new Object[0]);
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_98) {
                            caughtException = stateCaught_98;
                            statePc = (stateCaught_98 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            if ((rf.c(0) ^ -1L) <= (field_p ^ -1L)) {
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
                            throw new IOException();
                        } catch (Throwable stateCaught_100) {
                            caughtException = stateCaught_100;
                            statePc = (stateCaught_100 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        try {
                            var8.field_g = (Object) (Object) java.net.InetAddress.getByName((String) var8.field_c).getAddress();
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_101) {
                            caughtException = stateCaught_101;
                            statePc = (stateCaught_101 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 102: {
                        try {
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_102) {
                            caughtException = stateCaught_102;
                            statePc = (stateCaught_102 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 103: {
                        try {
                            var7 = (java.awt.datatransfer.Transferable) var8.field_c;
                            var17 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var17.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_103) {
                            caughtException = stateCaught_103;
                            statePc = (stateCaught_103 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 104: {
                        try {
                            var18 = (Object[]) var8.field_c;
                            if (((ab) this).field_e) {
                                statePc = 106;
                            } else {
                                statePc = 105;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_104) {
                            caughtException = stateCaught_104;
                            statePc = (stateCaught_104 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 105: {
                        try {
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_105) {
                            caughtException = stateCaught_105;
                            statePc = (stateCaught_105 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 106: {
                        try {
                            if (null != ((Class) var18[0]).getClassLoader()) {
                                statePc = 108;
                            } else {
                                statePc = 107;
                            }
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
                            var8.field_g = (Object) (Object) ((Class) var18[0]).getDeclaredField((String) var18[1]);
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
                            if ((rf.c(0) ^ -1L) <= (field_p ^ -1L)) {
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
                            var8.field_g = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var8.field_c), var8.field_d);
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
                            var8.field_b = 1;
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
                        var8.field_b = 2;
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

    private final ei a(byte param0, boolean param1, String param2, int param3) {
        if (param0 > -125) {
            field_n = null;
        }
        return this.a(-402166672, 0, param3, !param1 ? 1 : 22, (Object) (Object) param2);
    }

    final boolean b(int param0) {
        if (param0 != 0) {
            Object var3 = null;
            ei discarded$0 = this.a(25, 83, 116, 75, (Object) null);
        }
        if (!(((ab) this).field_e)) {
            return false;
        }
        if (!((ab) this).field_g) {
            return null != ((ab) this).field_f ? true : false;
        }
        return null != ((ab) this).field_r ? true : false;
    }

    final ei a(int param0, byte param1, String param2) {
        int var4 = -71 % ((71 - param1) / 46);
        return this.a((byte) -126, false, param2, param0);
    }

    final ei a(String param0, int param1, Class param2) {
        if (param1 != 2) {
            ((ab) this).field_f = null;
        }
        return this.a(param1 ^ -402166670, 0, 0, 9, (Object) (Object) new Object[2]);
    }

    final ei a(int param0, int param1, int param2, int param3, int param4) {
        if (param0 != 28460) {
            ((ab) this).field_i = null;
        }
        return this.a(-402166672, (param3 << 1980525328) - -param4, param2 + (param1 << -1591800272), 6, (Object) null);
    }

    final ei a(int param0, java.net.URL param1) {
        if (param0 != -23816) {
            ((ab) this).field_c = null;
        }
        return this.a(-402166672, 0, 0, 4, (Object) (Object) param1);
    }

    final ei a(byte param0) {
        if (param0 < 67) {
            return null;
        }
        return this.a(-402166672, 0, 0, 5, (Object) null);
    }

    final ei a(String param0, Class param1, Class[] param2, byte param3) {
        if (param3 != 113) {
            Object var6 = null;
            ei discarded$0 = ((ab) this).a((String) null, (Class) null, (Class[]) null, (byte) -43);
        }
        return this.a(-402166672, 0, 0, 8, (Object) (Object) new Object[3]);
    }

    private final ei a(int param0, int param1, int param2, int param3, Object param4) {
        ei var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = new ei();
                    var6.field_e = param1;
                    var6.field_a = param3;
                    var6.field_c = param4;
                    var6.field_d = param2;
                    if (param0 == -402166672) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_v = null;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var7 = this;
                    // monitorenter this
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        if (null == ((ab) this).field_q) {
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
                        ((ab) this).field_q.field_f = var6;
                        ((ab) this).field_q = var6;
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
                        ((ab) this).field_k = var6;
                        ((ab) this).field_q = var6;
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

    private final static ea a(String param0, int param1, String param2, int param3) {
        try {
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            String var7 = null;
            Exception var8 = null;
            ea var8_ref = null;
            Object var9 = null;
            ea stackIn_12_0 = null;
            Throwable decompiledCaughtException = null;
            ea stackOut_11_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if ((param3 ^ -1) != -34) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        var4 = "jagex_" + param2 + "_preferences" + param0 + "_rc.dat";
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 2: {
                        if (-35 != (param3 ^ -1)) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        var4 = "jagex_" + param2 + "_preferences" + param0 + "_wip.dat";
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 4: {
                        var4 = "jagex_" + param2 + "_preferences" + param0 + ".dat";
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 5: {
                        var5_array = new String[]{"c:/rscache/", "/rscache/", field_n, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
                        var6 = 0;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        if (var6 >= var5_array.length) {
                            statePc = 14;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        var7 = var5_array[var6];
                        if (-1 <= (var7.length() ^ -1)) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        if (new File(var7).exists()) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 9: {
                        var6++;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 11: {
                        try {
                            var8_ref = new ea(new File(var7, var4), "rw", 10000L);
                            stackOut_11_0 = (ea) var8_ref;
                            stackIn_12_0 = stackOut_11_0;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        return stackIn_12_0;
                    }
                    case 13: {
                        var8 = (Exception) (Object) caughtException;
                        var6++;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 14: {
                        if (param1 != 2) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        return null;
                    }
                    case 16: {
                        var9 = null;
                        ea discarded$1 = ab.a((String) null, -113, (String) null, 96);
                        return null;
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

    ab(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        int var5_int = 0;
        ai var7 = null;
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
                    ((ab) this).field_k = null;
                    ((ab) this).field_w = null;
                    ((ab) this).field_t = null;
                    ((ab) this).field_g = false;
                    ((ab) this).field_h = false;
                    ((ab) this).field_o = null;
                    ((ab) this).field_e = false;
                    ((ab) this).field_q = null;
                    field_j = "Unknown";
                    field_v = "1.1";
                    field_s = param1;
                    field_l = param0;
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
                    ((ab) this).field_e = stackIn_3_1 != 0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        field_j = System.getProperty("java.vendor");
                        field_v = System.getProperty("java.version");
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
                    if (-1 == field_j.toLowerCase().indexOf("microsoft")) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    ((ab) this).field_g = true;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    try {
                        field_a = System.getProperty("os.name");
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
                    field_a = "Unknown";
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    field_b = field_a.toLowerCase();
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
                        field_n = System.getProperty("user.home");
                        if (field_n == null) {
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
                        field_n = field_n + "/";
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
                    if (field_n == null) {
                        statePc = 25;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 25: {
                    field_n = "~/";
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    try {
                        ((ab) this).field_i = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
                    if (((ab) this).field_g) {
                        statePc = 36;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    try {
                        java.lang.reflect.Method discarded$6 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[1]);
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 32: {
                    var5 = (Exception) (Object) caughtException;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    try {
                        field_x = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[1]);
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 35: {
                    var5 = (Exception) (Object) caughtException;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    s.a(field_l, field_s, false);
                    if (!((ab) this).field_e) {
                        statePc = 55;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    ((ab) this).field_w = new ea(s.a("random.dat", (String) null, field_l, (byte) -45), "rw", 25L);
                    ((ab) this).field_t = new ea(s.a(true, "main_file_cache.dat2"), "rw", 314572800L);
                    ((ab) this).field_o = new ea(s.a(true, "main_file_cache.idx255"), "rw", 1048576L);
                    ((ab) this).field_c = new ea[param2];
                    var5_int = 0;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    if (var5_int >= param2) {
                        statePc = 40;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    ((ab) this).field_c[var5_int] = new ea(s.a(true, "main_file_cache.idx" + var5_int), "rw", 1048576L);
                    var5_int++;
                    statePc = 38;
                    continue stateLoop;
                }
                case 40: {
                    if (((ab) this).field_g) {
                        statePc = 42;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 42: {
                    try {
                        Object discarded$7 = Class.forName("dk").newInstance();
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 44: {
                    var5_ref = caughtException;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    try {
                        if (!((ab) this).field_g) {
                            statePc = 47;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var7 = new ai();
                        ((ab) this).field_r = var7;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        ((ab) this).field_f = Class.forName("tk").newInstance();
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 49: {
                    var5_ref = caughtException;
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    try {
                        if (!((ab) this).field_g) {
                            statePc = 52;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        ((ab) this).field_u = new od();
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        ((ab) this).field_d = Class.forName("lc").newInstance();
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 54: {
                    var5_ref = caughtException;
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    ((ab) this).field_h = false;
                    ((ab) this).field_m = new Thread((Runnable) this);
                    ((ab) this).field_m.setPriority(10);
                    ((ab) this).field_m.setDaemon(true);
                    ((ab) this).field_m.start();
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = 0L;
    }
}
