/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class go implements Runnable {
    private Object field_b;
    mc field_k;
    mc field_i;
    private Object field_x;
    java.awt.EventQueue field_j;
    private di field_f;
    static java.lang.reflect.Method field_h;
    private tc field_m;
    private static String field_o;
    mc[] field_t;
    private static String field_c;
    private boolean field_w;
    static String field_l;
    static String field_q;
    private boolean field_v;
    private di field_u;
    mc field_s;
    boolean field_d;
    private cl field_p;
    private static volatile long field_g;
    private Thread field_n;
    static String field_r;
    private static int field_e;
    private static String field_a;

    final di a(int param0, Runnable param1, int param2) {
        if (param0 < 19) {
            ((go) this).field_v = true;
        }
        return this.a(2, (Object) (Object) param1, true, param2, 0);
    }

    final di a(Class[] param0, boolean param1, Class param2, String param3) {
        if (param1) {
            return null;
        }
        return this.a(8, (Object) (Object) new Object[3], true, 0, 0);
    }

    final void b(int param0) {
        try {
            Object var2 = null;
            InterruptedException var2_ref = null;
            IOException var2_ref2 = null;
            int var2_int = 0;
            Object var2_ref3 = null;
            Throwable var3 = null;
            IOException var3_ref = null;
            Object var4 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (param0 > 123) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        var4 = null;
                        di discarded$1 = ((go) this).a((java.awt.Frame) null, true);
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        var2_ref3 = this;
                        // monitorenter this
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        try {
                            ((go) this).field_w = true;
                            this.notifyAll();
                            // monitorexit var2_ref3
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
                            // monitorexit var2_ref3
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
                            ((go) this).field_n.join();
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
                        if (null == ((go) this).field_i) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        try {
                            ((go) this).field_i.b((byte) 38);
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
                        if (null != ((go) this).field_k) {
                            statePc = 16;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        try {
                            ((go) this).field_k.b((byte) 38);
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
                        if (null == ((go) this).field_t) {
                            statePc = 27;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 20: {
                        var2_int = 0;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 21: {
                        if (var2_int >= ((go) this).field_t.length) {
                            statePc = 27;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        if (((go) this).field_t[var2_int] != null) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        var2_int++;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 24: {
                        try {
                            ((go) this).field_t[var2_int].b((byte) 38);
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 26;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        var2_int++;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 26: {
                        var3_ref = (IOException) (Object) caughtException;
                        var2_int++;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 27: {
                        if (null == ((go) this).field_s) {
                            statePc = 31;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    }
                    case 28: {
                        try {
                            ((go) this).field_s.b((byte) 38);
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        var2_ref2 = (IOException) (Object) caughtException;
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

    public final void run() {
        try {
            Object var2 = null;
            ThreadDeath var2_ref = null;
            Throwable var2_ref2 = null;
            int var2_int = 0;
            InterruptedException var3_ref_InterruptedException = null;
            en var3_ref_en = null;
            Exception var3_ref_Exception = null;
            mc var3_ref = null;
            int var3 = 0;
            Throwable var4_ref_Throwable = null;
            int var4 = 0;
            String var4_ref = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            di var8 = null;
            Thread var9 = null;
            Object[] var10 = null;
            java.awt.Frame var11 = null;
            Object[] var12 = null;
            String var13 = null;
            java.awt.Component var14 = null;
            String var15 = null;
            java.awt.datatransfer.Clipboard var16 = null;
            java.awt.datatransfer.Clipboard var17 = null;
            Object[] var18 = null;
            int stackIn_88_0 = 0;
            int stackOut_86_0 = 0;
            int stackOut_87_0 = 0;
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
                            if (!((go) this).field_w) {
                                statePc = 4;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 12;
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
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        return;
                    }
                    case 4: {
                        try {
                            if (((go) this).field_f == null) {
                                statePc = 7;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var8 = ((go) this).field_f;
                            ((go) this).field_f = ((go) this).field_f.field_e;
                            if (null != ((go) this).field_f) {
                                statePc = 10;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            ((go) this).field_u = null;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            this.wait();
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = (stateCaught_7 instanceof InterruptedException ? 9 : 12);
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            var3_ref_InterruptedException = (InterruptedException) (Object) caughtException;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            // monitorexit var2
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            var4_ref_Throwable = caughtException;
                            // monitorexit var2
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        throw (RuntimeException) (Object) var4_ref_Throwable;
                    }
                    case 14: {
                        try {
                            var2_int = var8.field_g;
                            if (var2_int == 1) {
                                statePc = 109;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = (stateCaught_14 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (-23 != (var2_int ^ -1)) {
                                statePc = 21;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if (field_g <= bl.a((byte) 92)) {
                                statePc = 18;
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
                            throw new IOException();
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            var8.field_d = (Object) (Object) wj.a((byte) 3, var8.field_c, (String) var8.field_a).b(4646);
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof en ? 20 : (stateCaught_18 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
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
                            var3_ref_en = (en) (Object) caughtException;
                            var8.field_d = (Object) (Object) var3_ref_en.getMessage();
                            throw var3_ref_en;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if ((var2_int ^ -1) != -3) {
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
                            var9 = new Thread((Runnable) var8.field_a);
                            var9.setDaemon(true);
                            var9.start();
                            var9.setPriority(var8.field_c);
                            var8.field_d = (Object) (Object) var9;
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
                            if (4 != var2_int) {
                                statePc = 28;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if (field_g > bl.a((byte) 119)) {
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
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var8.field_d = (Object) (Object) new DataInputStream(((java.net.URL) var8.field_a).openStream());
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            if (var2_int != 8) {
                                statePc = 34;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            var10 = (Object[]) var8.field_a;
                            if (((go) this).field_d) {
                                statePc = 31;
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
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (null != ((Class) var10[0]).getClassLoader()) {
                                statePc = 33;
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
                            throw new SecurityException();
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            var8.field_d = (Object) (Object) ((Class) var10[0]).getDeclaredMethod((String) var10[1], (Class[]) var10[2]);
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if (9 == var2_int) {
                                statePc = 103;
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
                            if (var2_int == 18) {
                                statePc = 102;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            if (var2_int == -20) {
                                statePc = 101;
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
                            if (((go) this).field_d) {
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
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            if (-4 == var2_int) {
                                statePc = 97;
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
                            if ((bl.a((byte) 53) ^ -1L) > (field_g ^ -1L)) {
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
                            var8.field_d = (Object) (Object) java.net.InetAddress.getByName((String) var8.field_a).getAddress();
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
                            if (var2_int != 5) {
                                statePc = 49;
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
                            if (!((go) this).field_v) {
                                statePc = 48;
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
                            var8.field_d = (Object) (Object) ((go) this).field_m.a(81);
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
                            var8.field_d = Class.forName("te").getMethod("listmodes", new Class[0]).invoke(((go) this).field_b, new Object[0]);
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            if (-7 != (var2_int ^ -1)) {
                                statePc = 53;
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
                            var11 = new java.awt.Frame("Jagex Full Screen");
                            var8.field_d = (Object) (Object) var11;
                            var11.setResizable(false);
                            if (((go) this).field_v) {
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
                            Object discarded$6 = Class.forName("te").getMethod("enter", new Class[5]).invoke(((go) this).field_b, new Object[5]);
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
                            ((go) this).field_m.a(65535 & var8.field_b, var8.field_c >>> 1665071856, var8.field_c & 65535, var11, 0, var8.field_b >> 2113147600);
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            if (var2_int == -8) {
                                statePc = 94;
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
                            if (-13 != var2_int) {
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
                            var3_ref = go.a(field_c, (String) var8.field_a, true, field_e);
                            var8.field_d = (Object) (Object) var3_ref;
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
                            if ((var2_int ^ -1) != -14) {
                                statePc = 58;
                            } else {
                                statePc = 57;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = (stateCaught_56 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            var3_ref = go.a("", (String) var8.field_a, true, field_e);
                            var8.field_d = (Object) (Object) var3_ref;
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = (stateCaught_57 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            if (!((go) this).field_d) {
                                statePc = 61;
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
                            if (-15 == var2_int) {
                                statePc = 91;
                            } else {
                                statePc = 60;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = (stateCaught_59 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = (stateCaught_60 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            if (!((go) this).field_d) {
                                statePc = 64;
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
                            if (-16 == var2_int) {
                                statePc = 85;
                            } else {
                                statePc = 63;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = (stateCaught_62 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = (stateCaught_63 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            if (((go) this).field_v) {
                                statePc = 67;
                            } else {
                                statePc = 65;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = (stateCaught_64 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            if (var2_int != 17) {
                                statePc = 67;
                            } else {
                                statePc = 66;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = (stateCaught_65 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            var12 = (Object[]) var8.field_a;
                            Object discarded$7 = Class.forName("to").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((go) this).field_x, new Object[5]);
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = (stateCaught_66 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            if (16 != var2_int) {
                                statePc = 84;
                            } else {
                                statePc = 68;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = (stateCaught_67 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            if (!field_l.startsWith("win")) {
                                statePc = 70;
                            } else {
                                statePc = 69;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = (stateCaught_68 instanceof Exception ? 83 : (stateCaught_68 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            statePc = 71;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = (stateCaught_69 instanceof Exception ? 83 : (stateCaught_69 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = (stateCaught_70 instanceof Exception ? 83 : (stateCaught_70 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            var13 = (String) var8.field_a;
                            if (var13.startsWith("http://")) {
                                statePc = 75;
                            } else {
                                statePc = 72;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = (stateCaught_71 instanceof Exception ? 83 : (stateCaught_71 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            if (!var13.startsWith("https://")) {
                                statePc = 74;
                            } else {
                                statePc = 73;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = (stateCaught_72 instanceof Exception ? 83 : (stateCaught_72 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            statePc = 75;
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = (stateCaught_73 instanceof Exception ? 83 : (stateCaught_73 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = (stateCaught_74 instanceof Exception ? 83 : (stateCaught_74 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            var4_ref = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            var5 = 0;
                            statePc = 76;
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = (stateCaught_75 instanceof Exception ? 83 : (stateCaught_75 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            if (var13.length() <= var5) {
                                statePc = 81;
                            } else {
                                statePc = 77;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = (stateCaught_76 instanceof Exception ? 83 : (stateCaught_76 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            if (-1 == var4_ref.indexOf((int) var13.charAt(var5))) {
                                statePc = 79;
                            } else {
                                statePc = 78;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = (stateCaught_77 instanceof Exception ? 83 : (stateCaught_77 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            statePc = 80;
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = (stateCaught_78 instanceof Exception ? 83 : (stateCaught_78 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = (stateCaught_79 instanceof Exception ? 83 : (stateCaught_79 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            var5++;
                            statePc = 76;
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = (stateCaught_80 instanceof Exception ? 83 : (stateCaught_80 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            Process discarded$8 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var13 + "\"");
                            var8.field_d = null;
                            statePc = 82;
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = (stateCaught_81 instanceof Exception ? 83 : (stateCaught_81 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = (stateCaught_82 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            var3_ref_Exception = (Exception) (Object) caughtException;
                            var8.field_d = (Object) (Object) var3_ref_Exception;
                            throw (RuntimeException) (Object) var3_ref_Exception;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = (stateCaught_83 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = (stateCaught_84 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            if (var8.field_c == 0) {
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
                            stackOut_86_0 = 1;
                            stackIn_88_0 = stackOut_86_0;
                            statePc = 88;
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = (stateCaught_86 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            stackOut_87_0 = 0;
                            stackIn_88_0 = stackOut_87_0;
                            statePc = 88;
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = (stateCaught_87 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            var3 = stackIn_88_0;
                            var14 = (java.awt.Component) var8.field_a;
                            if (((go) this).field_v) {
                                statePc = 90;
                            } else {
                                statePc = 89;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = (stateCaught_88 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            Object discarded$9 = Class.forName("to").getDeclaredMethod("showcursor", new Class[2]).invoke(((go) this).field_x, new Object[2]);
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
                            ((go) this).field_p.a(var14, var3 != 0, -1101);
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = (stateCaught_90 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            var3 = var8.field_c;
                            var4 = var8.field_b;
                            if (((go) this).field_v) {
                                statePc = 93;
                            } else {
                                statePc = 92;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = (stateCaught_91 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            Object discarded$10 = Class.forName("to").getDeclaredMethod("movemouse", new Class[2]).invoke(((go) this).field_x, new Object[2]);
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
                            ((go) this).field_p.a(var4, -12, var3);
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = (stateCaught_93 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        try {
                            if (!((go) this).field_v) {
                                statePc = 96;
                            } else {
                                statePc = 95;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = (stateCaught_94 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        try {
                            ((go) this).field_m.a((java.awt.Frame) var8.field_a, (byte) 3);
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
                            Object discarded$11 = Class.forName("te").getMethod("exit", new Class[0]).invoke(((go) this).field_b, new Object[0]);
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
                            if (bl.a((byte) 85) < field_g) {
                                statePc = 99;
                            } else {
                                statePc = 98;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_97) {
                            caughtException = stateCaught_97;
                            statePc = (stateCaught_97 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 98: {
                        try {
                            statePc = 100;
                            continue stateLoop;
                        } catch (Throwable stateCaught_98) {
                            caughtException = stateCaught_98;
                            statePc = (stateCaught_98 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = (stateCaught_99 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 100: {
                        try {
                            var15 = (255 & var8.field_c >> -1062958824) + "." + ((var8.field_c & 16770086) >> -1606534896) + "." + ((65396 & var8.field_c) >> -617841688) + "." + (255 & var8.field_c);
                            var8.field_d = (Object) (Object) java.net.InetAddress.getByName(var15).getHostName();
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_100) {
                            caughtException = stateCaught_100;
                            statePc = (stateCaught_100 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        try {
                            var7 = (java.awt.datatransfer.Transferable) var8.field_a;
                            var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var16.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
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
                            var17 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var8.field_d = (Object) (Object) var17.getContents((Object) null);
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
                            var18 = (Object[]) var8.field_a;
                            if (((go) this).field_d) {
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
                            var8.field_d = (Object) (Object) ((Class) var18[0]).getDeclaredField((String) var18[1]);
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
                            if ((field_g ^ -1L) >= (bl.a((byte) 109) ^ -1L)) {
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
                            var8.field_d = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var8.field_a), var8.field_c);
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
                            var8.field_f = 1;
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
                        var8.field_f = 2;
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

    final di a(boolean param0, java.awt.Component param1, int param2) {
        if (param2 != -14697) {
            Object var5 = null;
            di discarded$0 = ((go) this).a((String) null, -2, (byte) -60);
        }
        return this.a(15, (Object) (Object) param1, true, param0 ? 1 : 0, 0);
    }

    private final di a(int param0, Object param1, boolean param2, int param3, int param4) {
        di var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = new di();
                    if (param2) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_r = null;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var6.field_c = param3;
                    var6.field_b = param4;
                    var6.field_a = param1;
                    var6.field_g = param0;
                    var7 = this;
                    // monitorenter this
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        if (((go) this).field_u != null) {
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
                        ((go) this).field_f = var6;
                        ((go) this).field_u = var6;
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
                        ((go) this).field_u.field_e = var6;
                        ((go) this).field_u = var6;
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

    private final static mc a(String param0, String param1, boolean param2, int param3) {
        try {
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            String var7 = null;
            Exception var8 = null;
            mc var8_ref = null;
            mc stackIn_11_0 = null;
            Throwable decompiledCaughtException = null;
            mc stackOut_10_0 = null;
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
                        var4 = "jagex_" + param0 + "_preferences" + param1 + "_rc.dat";
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 2: {
                        if (-35 == (param3 ^ -1)) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        var4 = "jagex_" + param0 + "_preferences" + param1 + ".dat";
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 4: {
                        var4 = "jagex_" + param0 + "_preferences" + param1 + "_wip.dat";
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 5: {
                        var5_array = new String[]{"c:/rscache/", "/rscache/", field_o, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
                        var6 = 0;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        if (var6 >= var5_array.length) {
                            statePc = 13;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        var7 = var5_array[var6];
                        if (-1 <= (var7.length() ^ -1)) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        if (new File(var7).exists()) {
                            statePc = 10;
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
                    case 10: {
                        try {
                            var8_ref = new mc(new File(var7, var4), "rw", 10000L);
                            stackOut_10_0 = (mc) var8_ref;
                            stackIn_11_0 = stackOut_10_0;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        return stackIn_11_0;
                    }
                    case 12: {
                        var8 = (Exception) (Object) caughtException;
                        var6++;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 13: {
                        if (!param2) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        return null;
                    }
                    case 15: {
                        field_g = -28L;
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

    final di a(byte param0, String param1, Class param2) {
        int var4 = 81 / ((param0 - 7) / 59);
        return this.a(9, (Object) (Object) new Object[2], true, 0, 0);
    }

    final di a(String param0, int param1, byte param2) {
        if (param2 != -120) {
            ((go) this).field_p = null;
        }
        return this.a((byte) -121, param0, param1, false);
    }

    final boolean a(int param0) {
        if (!((go) this).field_d) {
            return false;
        }
        if (param0 >= -35) {
            ((go) this).field_p = null;
        }
        if (((go) this).field_v) {
            return null != ((go) this).field_m ? true : false;
        }
        return null != ((go) this).field_b ? true : false;
    }

    final di c(int param0) {
        if (param0 != 0) {
            ((go) this).run();
        }
        return this.a(5, (Object) null, true, 0, 0);
    }

    final di a(java.awt.Frame param0, boolean param1) {
        if (!param1) {
            Object var4 = null;
            di discarded$0 = ((go) this).a((Class[]) null, true, (Class) null, (String) null);
        }
        return this.a(7, (Object) (Object) param0, true, 0, 0);
    }

    private final di a(byte param0, String param1, int param2, boolean param3) {
        int var5 = -62 / ((param0 - -53) / 58);
        return this.a(!param3 ? 1 : 22, (Object) (Object) param1, true, param2, 0);
    }

    final di a(byte param0, java.net.URL param1) {
        if (param0 != -12) {
            field_r = null;
        }
        return this.a(4, (Object) (Object) param1, true, 0, 0);
    }

    final di a(int param0, byte param1, int param2, int param3, int param4) {
        int var6 = 66 % ((param1 - 73) / 53);
        return this.a(6, (Object) null, true, param4 + (param0 << -1330614192), (param3 << -505898800) - -param2);
    }

    go(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        int var5_int = 0;
        tc var7 = null;
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
                    ((go) this).field_i = null;
                    ((go) this).field_f = null;
                    ((go) this).field_w = false;
                    ((go) this).field_k = null;
                    ((go) this).field_s = null;
                    ((go) this).field_u = null;
                    ((go) this).field_d = false;
                    ((go) this).field_v = false;
                    field_c = param1;
                    field_e = param0;
                    field_q = "1.1";
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
                    ((go) this).field_d = stackIn_3_1 != 0;
                    field_r = "Unknown";
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        field_r = System.getProperty("java.vendor");
                        field_q = System.getProperty("java.version");
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
                    if (0 == (field_r.toLowerCase().indexOf("microsoft") ^ -1)) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    ((go) this).field_v = true;
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
                    field_l = field_a.toLowerCase();
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
                        field_o = System.getProperty("user.home");
                        if (null == field_o) {
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
                        field_o = field_o + "/";
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
                    if (field_o != null) {
                        statePc = 25;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    field_o = "~/";
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    try {
                        ((go) this).field_j = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 27: {
                    var5_ref = caughtException;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    if (((go) this).field_v) {
                        statePc = 35;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    try {
                        java.lang.reflect.Method discarded$6 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[1]);
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 31: {
                    var5 = (Exception) (Object) caughtException;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    try {
                        field_h = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[1]);
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 34: {
                    var5 = (Exception) (Object) caughtException;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    nd.a(field_c, field_e, -7682);
                    if (!((go) this).field_d) {
                        statePc = 53;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    ((go) this).field_s = new mc(nd.a("random.dat", -25157, (String) null, field_e), "rw", 25L);
                    ((go) this).field_i = new mc(nd.a("main_file_cache.dat2", 0), "rw", 314572800L);
                    ((go) this).field_k = new mc(nd.a("main_file_cache.idx255", 0), "rw", 1048576L);
                    ((go) this).field_t = new mc[param2];
                    var5_int = 0;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    if (var5_int >= param2) {
                        statePc = 39;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    ((go) this).field_t[var5_int] = new mc(nd.a("main_file_cache.idx" + var5_int, 0), "rw", 1048576L);
                    var5_int++;
                    statePc = 37;
                    continue stateLoop;
                }
                case 39: {
                    if (!((go) this).field_v) {
                        statePc = 43;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    try {
                        Object discarded$7 = Class.forName("rd").newInstance();
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 42: {
                    var5_ref = caughtException;
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    try {
                        if (((go) this).field_v) {
                            statePc = 45;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        ((go) this).field_b = Class.forName("te").newInstance();
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var7 = new tc();
                        ((go) this).field_m = var7;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 47: {
                    var5_ref = caughtException;
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    try {
                        if (!((go) this).field_v) {
                            statePc = 50;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        ((go) this).field_p = new cl();
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        ((go) this).field_x = Class.forName("to").newInstance();
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 52: {
                    var5_ref = caughtException;
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    ((go) this).field_w = false;
                    ((go) this).field_n = new Thread((Runnable) this);
                    ((go) this).field_n.setPriority(10);
                    ((go) this).field_n.setDaemon(true);
                    ((go) this).field_n.start();
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = 0L;
    }
}
