/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fe implements Runnable {
    private Thread field_l;
    static String field_c;
    static String field_k;
    static java.lang.reflect.Method field_x;
    private boolean field_r;
    private static String field_u;
    java.awt.EventQueue field_m;
    private ib field_p;
    private t field_o;
    private Object field_t;
    private static int field_g;
    private static String field_n;
    private ke field_q;
    private static volatile long field_a;
    boolean field_e;
    static String field_w;
    di field_h;
    di field_v;
    di field_b;
    di[] field_s;
    private static String field_f;
    private Object field_d;
    private ib field_j;
    private boolean field_i;

    final boolean b(int param0) {
        if (!((fe) this).field_e) {
            return false;
        }
        if (param0 != 5) {
            return false;
        }
        if (((fe) this).field_i) {
            return null != ((fe) this).field_q ? true : false;
        }
        return null != ((fe) this).field_d ? true : false;
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
                            ((fe) this).field_r = true;
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
                        try {
                            if (param0 <= -15) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            ib discarded$1 = ((fe) this).a(-108, -85, -43, -56, -118);
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            ((fe) this).field_l.join();
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
                        if (((fe) this).field_b == null) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        try {
                            ((fe) this).field_b.a(false);
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
                        if (null != ((fe) this).field_h) {
                            statePc = 16;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        try {
                            ((fe) this).field_h.a(false);
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
                        if (((fe) this).field_s != null) {
                            statePc = 21;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    }
                    case 21: {
                        var2_int = 0;
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 22: {
                        if (var2_int >= ((fe) this).field_s.length) {
                            statePc = 29;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        if (((fe) this).field_s[var2_int] != null) {
                            statePc = 26;
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
                    case 26: {
                        try {
                            ((fe) this).field_s[var2_int].a(false);
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 28;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        var2_int++;
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 28: {
                        var3_ref = (IOException) (Object) caughtException;
                        var2_int++;
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 29: {
                        if (((fe) this).field_v != null) {
                            statePc = 31;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    }
                    case 31: {
                        try {
                            ((fe) this).field_v.a(false);
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        var2_ref2 = (IOException) (Object) caughtException;
                        statePc = 34;
                        continue stateLoop;
                    }
                    case 34: {
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

    final ib a(Class param0, byte param1, Class[] param2, String param3) {
        if (param1 <= 51) {
            Object var6 = null;
            ib discarded$0 = ((fe) this).a(-46, (java.net.URL) null);
        }
        return this.a(8, 0, (byte) -75, 0, (Object) (Object) new Object[3]);
    }

    public final void run() {
        try {
            Object var2 = null;
            ThreadDeath var2_ref = null;
            Throwable var2_ref2 = null;
            int var2_int = 0;
            InterruptedException var3 = null;
            Exception var3_ref = null;
            jd var3_ref2 = null;
            di var3_ref3 = null;
            int var3_int = 0;
            Throwable var4_ref_Throwable = null;
            int var4 = 0;
            String var4_ref = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            ib var8 = null;
            Thread var9 = null;
            Object[] var10 = null;
            java.awt.datatransfer.Clipboard var11 = null;
            java.awt.datatransfer.Clipboard var12 = null;
            java.awt.Frame var13 = null;
            java.awt.Component var14 = null;
            String var15 = null;
            Object[] var16 = null;
            String var17 = null;
            Object[] var18 = null;
            int stackIn_58_0 = 0;
            int stackOut_56_0 = 0;
            int stackOut_57_0 = 0;
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
                            if (!((fe) this).field_r) {
                                statePc = 4;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 13;
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
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        return;
                    }
                    case 4: {
                        try {
                            if (null == ((fe) this).field_p) {
                                statePc = 8;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var8 = ((fe) this).field_p;
                            ((fe) this).field_p = ((fe) this).field_p.field_a;
                            if (null == ((fe) this).field_p) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            ((fe) this).field_j = null;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            this.wait();
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = (stateCaught_8 instanceof InterruptedException ? 10 : 13);
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            var3 = (InterruptedException) (Object) caughtException;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            // monitorexit var2
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            var4_ref_Throwable = caughtException;
                            // monitorexit var2
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        throw (RuntimeException) (Object) var4_ref_Throwable;
                    }
                    case 15: {
                        try {
                            var2_int = var8.field_d;
                            if (-2 != (var2_int ^ -1)) {
                                statePc = 19;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if ((lk.a(0) ^ -1L) <= (field_a ^ -1L)) {
                                statePc = 18;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            var8.field_g = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var8.field_f), var8.field_b);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if ((var2_int ^ -1) == -23) {
                                statePc = 106;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if ((var2_int ^ -1) != -3) {
                                statePc = 22;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            var9 = new Thread((Runnable) var8.field_f);
                            var9.setDaemon(true);
                            var9.start();
                            var9.setPriority(var8.field_b);
                            var8.field_g = (Object) (Object) var9;
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            if ((var2_int ^ -1) == -5) {
                                statePc = 103;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (8 != var2_int) {
                                statePc = 30;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            var10 = (Object[]) var8.field_f;
                            if (((fe) this).field_e) {
                                statePc = 26;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            if (null == ((Class) var10[0]).getClassLoader()) {
                                statePc = 28;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            throw new SecurityException();
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            var8.field_g = (Object) (Object) ((Class) var10[0]).getDeclaredMethod((String) var10[1], (Class[]) var10[2]);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if (-10 == var2_int) {
                                statePc = 99;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (var2_int != 18) {
                                statePc = 33;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            var11 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var8.field_g = (Object) (Object) var11.getContents((Object) null);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            if (-20 != var2_int) {
                                statePc = 35;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            var7 = (java.awt.datatransfer.Transferable) var8.field_f;
                            var12 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var12.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            if (!((fe) this).field_e) {
                                statePc = 98;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            if (-4 == var2_int) {
                                statePc = 94;
                            } else {
                                statePc = 37;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            if (21 == var2_int) {
                                statePc = 90;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            if (-6 == var2_int) {
                                statePc = 87;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            if ((var2_int ^ -1) != -7) {
                                statePc = 43;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            var13 = new java.awt.Frame("Jagex Full Screen");
                            var8.field_g = (Object) (Object) var13;
                            var13.setResizable(false);
                            if (((fe) this).field_i) {
                                statePc = 42;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            Object discarded$6 = Class.forName("cb").getMethod("enter", new Class[5]).invoke(((fe) this).field_d, new Object[5]);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            ((fe) this).field_q.a(70, var8.field_e >> 536852240, var8.field_e & 65535, var13, 65535 & var8.field_b, var8.field_b >>> 773056912);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            if ((var2_int ^ -1) != -8) {
                                statePc = 47;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            if (((fe) this).field_i) {
                                statePc = 46;
                            } else {
                                statePc = 45;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            Object discarded$7 = Class.forName("cb").getMethod("exit", new Class[0]).invoke(((fe) this).field_d, new Object[0]);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            ((fe) this).field_q.a(-16986, (java.awt.Frame) var8.field_f);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            if (var2_int != -13) {
                                statePc = 49;
                            } else {
                                statePc = 48;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            var3_ref3 = fe.a(field_u, (String) var8.field_f, field_g, -7);
                            var8.field_g = (Object) (Object) var3_ref3;
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            if (-14 == var2_int) {
                                statePc = 86;
                            } else {
                                statePc = 50;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = (stateCaught_49 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            if (!((fe) this).field_e) {
                                statePc = 53;
                            } else {
                                statePc = 51;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = (stateCaught_50 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            if (var2_int == -15) {
                                statePc = 83;
                            } else {
                                statePc = 52;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = (stateCaught_51 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            statePc = 53;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            if (!((fe) this).field_e) {
                                statePc = 61;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = (stateCaught_53 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            if (15 != var2_int) {
                                statePc = 61;
                            } else {
                                statePc = 55;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = (stateCaught_54 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            if (-1 == var8.field_b) {
                                statePc = 57;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = (stateCaught_55 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            stackOut_56_0 = 1;
                            stackIn_58_0 = stackOut_56_0;
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = (stateCaught_56 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            stackOut_57_0 = 0;
                            stackIn_58_0 = stackOut_57_0;
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = (stateCaught_57 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            var3_int = stackIn_58_0;
                            var14 = (java.awt.Component) var8.field_f;
                            if (!((fe) this).field_i) {
                                statePc = 60;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = (stateCaught_58 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            ((fe) this).field_o.a(var3_int != 0, 0, var14);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = (stateCaught_59 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            Object discarded$8 = Class.forName("na").getDeclaredMethod("showcursor", new Class[2]).invoke(((fe) this).field_t, new Object[2]);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = (stateCaught_60 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            if (((fe) this).field_i) {
                                statePc = 64;
                            } else {
                                statePc = 62;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = (stateCaught_61 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            if (-18 == var2_int) {
                                statePc = 82;
                            } else {
                                statePc = 63;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = (stateCaught_62 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = (stateCaught_63 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            if (-17 != var2_int) {
                                statePc = 81;
                            } else {
                                statePc = 65;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = (stateCaught_64 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            statePc = 66;
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = (stateCaught_65 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            if (field_k.startsWith("win")) {
                                statePc = 68;
                            } else {
                                statePc = 67;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = (stateCaught_66 instanceof Exception ? 80 : (stateCaught_66 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = (stateCaught_67 instanceof Exception ? 80 : (stateCaught_67 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            var15 = (String) var8.field_f;
                            if (var15.startsWith("http://")) {
                                statePc = 72;
                            } else {
                                statePc = 69;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = (stateCaught_68 instanceof Exception ? 80 : (stateCaught_68 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            if (!var15.startsWith("https://")) {
                                statePc = 71;
                            } else {
                                statePc = 70;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = (stateCaught_69 instanceof Exception ? 80 : (stateCaught_69 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = (stateCaught_70 instanceof Exception ? 80 : (stateCaught_70 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = (stateCaught_71 instanceof Exception ? 80 : (stateCaught_71 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            var4_ref = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            var5 = 0;
                            statePc = 73;
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = (stateCaught_72 instanceof Exception ? 80 : (stateCaught_72 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            if (var5 >= var15.length()) {
                                statePc = 78;
                            } else {
                                statePc = 74;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = (stateCaught_73 instanceof Exception ? 80 : (stateCaught_73 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            if (0 == (var4_ref.indexOf((int) var15.charAt(var5)) ^ -1)) {
                                statePc = 76;
                            } else {
                                statePc = 75;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = (stateCaught_74 instanceof Exception ? 80 : (stateCaught_74 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            statePc = 77;
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = (stateCaught_75 instanceof Exception ? 80 : (stateCaught_75 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = (stateCaught_76 instanceof Exception ? 80 : (stateCaught_76 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            var5++;
                            statePc = 73;
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = (stateCaught_77 instanceof Exception ? 80 : (stateCaught_77 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            Process discarded$9 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var15 + "\"");
                            var8.field_g = null;
                            statePc = 79;
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = (stateCaught_78 instanceof Exception ? 80 : (stateCaught_78 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = (stateCaught_79 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            var3_ref = (Exception) (Object) caughtException;
                            var8.field_g = (Object) (Object) var3_ref;
                            throw (RuntimeException) (Object) var3_ref;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = (stateCaught_80 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = (stateCaught_81 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            var16 = (Object[]) var8.field_f;
                            Object discarded$10 = Class.forName("na").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((fe) this).field_t, new Object[5]);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = (stateCaught_82 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            var3_int = var8.field_b;
                            var4 = var8.field_e;
                            if (!((fe) this).field_i) {
                                statePc = 85;
                            } else {
                                statePc = 84;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = (stateCaught_83 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            ((fe) this).field_o.a(var3_int, 101024, var4);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = (stateCaught_84 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            Object discarded$11 = Class.forName("na").getDeclaredMethod("movemouse", new Class[2]).invoke(((fe) this).field_t, new Object[2]);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = (stateCaught_85 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            var3_ref3 = fe.a("", (String) var8.field_f, field_g, -7);
                            var8.field_g = (Object) (Object) var3_ref3;
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = (stateCaught_86 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            if (((fe) this).field_i) {
                                statePc = 89;
                            } else {
                                statePc = 88;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = (stateCaught_87 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            var8.field_g = Class.forName("cb").getMethod("listmodes", new Class[0]).invoke(((fe) this).field_d, new Object[0]);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = (stateCaught_88 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            var8.field_g = (Object) (Object) ((fe) this).field_q.a((byte) 106);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = (stateCaught_89 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            if ((lk.a(0) ^ -1L) > (field_a ^ -1L)) {
                                statePc = 92;
                            } else {
                                statePc = 91;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = (stateCaught_90 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            statePc = 93;
                            continue stateLoop;
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = (stateCaught_91 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = (stateCaught_92 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            var8.field_g = (Object) (Object) java.net.InetAddress.getByName((String) var8.field_f).getAddress();
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = (stateCaught_93 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        try {
                            if ((lk.a(0) ^ -1L) > (field_a ^ -1L)) {
                                statePc = 96;
                            } else {
                                statePc = 95;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = (stateCaught_94 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        try {
                            statePc = 97;
                            continue stateLoop;
                        } catch (Throwable stateCaught_95) {
                            caughtException = stateCaught_95;
                            statePc = (stateCaught_95 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 96: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = (stateCaught_96 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            var17 = (255 & var8.field_b >> -449713480) + "." + (255 & var8.field_b >> -431375760) + "." + (var8.field_b >> -1471754776 & 255) + "." + (255 & var8.field_b);
                            var8.field_g = (Object) (Object) java.net.InetAddress.getByName(var17).getHostName();
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_97) {
                            caughtException = stateCaught_97;
                            statePc = (stateCaught_97 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 98: {
                        try {
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_98) {
                            caughtException = stateCaught_98;
                            statePc = (stateCaught_98 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            var18 = (Object[]) var8.field_f;
                            if (!((fe) this).field_e) {
                                statePc = 102;
                            } else {
                                statePc = 100;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = (stateCaught_99 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 100: {
                        try {
                            if (null != ((Class) var18[0]).getClassLoader()) {
                                statePc = 102;
                            } else {
                                statePc = 101;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_100) {
                            caughtException = stateCaught_100;
                            statePc = (stateCaught_100 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        try {
                            throw new SecurityException();
                        } catch (Throwable stateCaught_101) {
                            caughtException = stateCaught_101;
                            statePc = (stateCaught_101 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 102: {
                        try {
                            var8.field_g = (Object) (Object) ((Class) var18[0]).getDeclaredField((String) var18[1]);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_102) {
                            caughtException = stateCaught_102;
                            statePc = (stateCaught_102 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 103: {
                        try {
                            if (lk.a(0) >= field_a) {
                                statePc = 105;
                            } else {
                                statePc = 104;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_103) {
                            caughtException = stateCaught_103;
                            statePc = (stateCaught_103 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 104: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_104) {
                            caughtException = stateCaught_104;
                            statePc = (stateCaught_104 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 105: {
                        try {
                            var8.field_g = (Object) (Object) new DataInputStream(((java.net.URL) var8.field_f).openStream());
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_105) {
                            caughtException = stateCaught_105;
                            statePc = (stateCaught_105 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 106: {
                        try {
                            if (lk.a(0) >= field_a) {
                                statePc = 108;
                            } else {
                                statePc = 107;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_106) {
                            caughtException = stateCaught_106;
                            statePc = (stateCaught_106 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 107: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_107) {
                            caughtException = stateCaught_107;
                            statePc = (stateCaught_107 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 108: {
                        try {
                            var8.field_g = (Object) (Object) li.a(false, (String) var8.field_f, var8.field_b).a(-70);
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_108) {
                            caughtException = stateCaught_108;
                            statePc = (stateCaught_108 instanceof jd ? 110 : (stateCaught_108 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 109: {
                        try {
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_109) {
                            caughtException = stateCaught_109;
                            statePc = (stateCaught_109 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 110: {
                        try {
                            var3_ref2 = (jd) (Object) caughtException;
                            var8.field_g = (Object) (Object) var3_ref2.getMessage();
                            throw var3_ref2;
                        } catch (Throwable stateCaught_110) {
                            caughtException = stateCaught_110;
                            statePc = (stateCaught_110 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 111: {
                        try {
                            var8.field_c = 1;
                            statePc = 115;
                            continue stateLoop;
                        } catch (Throwable stateCaught_111) {
                            caughtException = stateCaught_111;
                            statePc = (stateCaught_111 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 113: {
                        var2_ref = (ThreadDeath) (Object) caughtException;
                        throw var2_ref;
                    }
                    case 114: {
                        var2_ref2 = caughtException;
                        var8.field_c = 2;
                        statePc = 115;
                        continue stateLoop;
                    }
                    case 115: {
                        var2 = (Object) (Object) var8;
                        // monitorenter var8
                        statePc = 116;
                        continue stateLoop;
                    }
                    case 116: {
                        try {
                            ((Object) (Object) var8).notify();
                            // monitorexit var2
                            statePc = 0;
                            continue stateLoop;
                        } catch (Throwable stateCaught_116) {
                            caughtException = stateCaught_116;
                            statePc = 118;
                            continue stateLoop;
                        }
                    }
                    case 118: {
                        try {
                            var6 = caughtException;
                            // monitorexit var2
                            statePc = 119;
                            continue stateLoop;
                        } catch (Throwable stateCaught_118) {
                            caughtException = stateCaught_118;
                            statePc = 118;
                            continue stateLoop;
                        }
                    }
                    case 119: {
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

    final ib a(java.awt.Frame param0, int param1) {
        if (param1 < 44) {
            Object var4 = null;
            ib discarded$0 = ((fe) this).a(57, (String) null, (Class) null);
        }
        return this.a(7, 0, (byte) -92, 0, (Object) (Object) param0);
    }

    final ib a(int param0, java.net.URL param1) {
        if (param0 != -21377) {
            field_a = 73L;
        }
        return this.a(4, 0, (byte) -110, 0, (Object) (Object) param1);
    }

    final ib a(int param0, int param1, int param2, int param3, int param4) {
        if (param2 != -7573) {
            ib discarded$0 = ((fe) this).a(127);
        }
        return this.a(6, param4 + (param1 << -1747912016), (byte) -65, (param3 << -1359998640) + param0, (Object) null);
    }

    final ib a(Runnable param0, int param1, int param2) {
        if (param2 != 65535) {
            return null;
        }
        return this.a(2, 0, (byte) -72, param1, (Object) (Object) param0);
    }

    final ib a(int param0) {
        if (param0 != -1) {
            Object var3 = null;
            ib discarded$0 = this.a(115, true, 98, (String) null);
        }
        return this.a(5, 0, (byte) -79, 0, (Object) null);
    }

    private final static di a(String param0, String param1, int param2, int param3) {
        try {
            String var7_ref = null;
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            Object var7 = null;
            Exception var8 = null;
            di var8_ref = null;
            di stackIn_15_0 = null;
            Throwable decompiledCaughtException = null;
            di stackOut_14_0 = null;
            var7_ref = null;
            L0: {
              if (-34 == (param2 ^ -1)) {
                var4 = "jagex_" + param0 + "_preferences" + param1 + "_rc.dat";
                break L0;
              } else {
                if ((param2 ^ -1) == -35) {
                  var4 = "jagex_" + param0 + "_preferences" + param1 + "_wip.dat";
                  break L0;
                } else {
                  var4 = "jagex_" + param0 + "_preferences" + param1 + ".dat";
                  break L0;
                }
              }
            }
            if (param3 == -7) {
              var5_array = new String[]{"c:/rscache/", "/rscache/", field_n, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
              var6 = 0;
              L1: while (true) {
                if (var5_array.length > var6) {
                  L2: {
                    var7_ref = var5_array[var6];
                    if ((var7_ref.length() ^ -1) >= -1) {
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
                    var8_ref = new di(new File(var7_ref, var4), "rw", 10000L);
                    stackOut_14_0 = (di) var8_ref;
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

    final ib a(int param0, String param1, Class param2) {
        if (param0 >= -107) {
            return null;
        }
        return this.a(9, 0, (byte) -62, 0, (Object) (Object) new Object[2]);
    }

    private final ib a(int param0, int param1, byte param2, int param3, Object param4) {
        ib var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (param2 <= -48) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    ib discarded$3 = ((fe) this).a(-23);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var6 = new ib();
                    var6.field_f = param4;
                    var6.field_e = param1;
                    var6.field_d = param0;
                    var6.field_b = param3;
                    var7 = this;
                    // monitorenter this
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        if (null == ((fe) this).field_j) {
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
                        ((fe) this).field_j.field_a = var6;
                        ((fe) this).field_j = var6;
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
                        ((fe) this).field_p = var6;
                        ((fe) this).field_j = var6;
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

    private final ib a(int param0, boolean param1, int param2, String param3) {
        if (param2 != 18832) {
            field_f = null;
        }
        return this.a(param1 ? 22 : 1, 0, (byte) -118, param0, (Object) (Object) param3);
    }

    final ib a(int param0, String param1, int param2) {
        if (param0 < 9) {
            Object var5 = null;
            ib discarded$0 = ((fe) this).a(-86, (String) null, (Class) null);
        }
        return this.a(param2, false, 18832, param1);
    }

    fe(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        int var5_int = 0;
        ke var7 = null;
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
                    ((fe) this).field_r = false;
                    ((fe) this).field_p = null;
                    ((fe) this).field_e = false;
                    ((fe) this).field_v = null;
                    ((fe) this).field_j = null;
                    ((fe) this).field_h = null;
                    ((fe) this).field_i = false;
                    ((fe) this).field_b = null;
                    field_g = param0;
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
                    ((fe) this).field_e = stackIn_3_1 != 0;
                    field_c = "1.1";
                    field_w = "Unknown";
                    field_u = param1;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        field_w = System.getProperty("java.vendor");
                        field_c = System.getProperty("java.version");
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
                    if (-1 == field_w.toLowerCase().indexOf("microsoft")) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    ((fe) this).field_i = true;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    try {
                        field_f = System.getProperty("os.name");
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
                    field_f = "Unknown";
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    field_k = field_f.toLowerCase();
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
                    if (null == field_n) {
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
                        ((fe) this).field_m = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
                    if (((fe) this).field_i) {
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
                    ed.a((byte) -4, field_u, field_g);
                    if (!((fe) this).field_e) {
                        statePc = 55;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    ((fe) this).field_v = new di(ed.a(83, field_g, "random.dat", (String) null), "rw", 25L);
                    ((fe) this).field_b = new di(ed.a("main_file_cache.dat2", 32718), "rw", 314572800L);
                    ((fe) this).field_h = new di(ed.a("main_file_cache.idx255", 32718), "rw", 1048576L);
                    ((fe) this).field_s = new di[param2];
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
                    ((fe) this).field_s[var5_int] = new di(ed.a("main_file_cache.idx" + var5_int, 32718), "rw", 1048576L);
                    var5_int++;
                    statePc = 38;
                    continue stateLoop;
                }
                case 40: {
                    if (((fe) this).field_i) {
                        statePc = 42;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 42: {
                    try {
                        Object discarded$7 = Class.forName("pk").newInstance();
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
                        if (((fe) this).field_i) {
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
                        ((fe) this).field_d = Class.forName("cb").newInstance();
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
                        var7 = new ke();
                        ((fe) this).field_q = var7;
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
                        if (((fe) this).field_i) {
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
                        ((fe) this).field_t = Class.forName("na").newInstance();
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
                        ((fe) this).field_o = new t();
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
                    ((fe) this).field_r = false;
                    ((fe) this).field_l = new Thread((Runnable) this);
                    ((fe) this).field_l.setPriority(10);
                    ((fe) this).field_l.setDaemon(true);
                    ((fe) this).field_l.start();
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0L;
    }
}
