/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vf implements Runnable {
    private static String field_n;
    private static volatile long field_l;
    an field_i;
    private Object field_x;
    private boolean field_u;
    static String field_s;
    private ue field_t;
    static String field_b;
    private static int field_v;
    an field_k;
    static String field_j;
    an field_f;
    private static String field_r;
    private ia field_c;
    private static String field_g;
    private Thread field_d;
    private Object field_m;
    private boolean field_q;
    static java.lang.reflect.Method field_h;
    boolean field_a;
    java.awt.EventQueue field_p;
    an[] field_e;
    private ia field_o;
    private ga field_w;

    final boolean b(byte param0) {
        int var2 = -48 % ((-43 - param0) / 55);
        if (!((vf) this).field_a) {
            return false;
        }
        if (!((vf) this).field_q) {
            return null != ((vf) this).field_x ? true : false;
        }
        return null != ((vf) this).field_w ? true : false;
    }

    final void a(int param0) {
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
                            ((vf) this).field_u = true;
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
                            if (param0 == -29109) {
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
                        return;
                    }
                    case 7: {
                        try {
                            ((vf) this).field_d.join();
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
                        if (null != ((vf) this).field_k) {
                            statePc = 12;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        try {
                            ((vf) this).field_k.b(param0 ^ 29131);
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
                        if (((vf) this).field_f != null) {
                            statePc = 17;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 17: {
                        try {
                            ((vf) this).field_f.b(-126);
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        var2_ref2 = (IOException) (Object) caughtException;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 20: {
                        if (null == ((vf) this).field_e) {
                            statePc = 28;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    }
                    case 21: {
                        var2_int = 0;
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 22: {
                        if (var2_int >= ((vf) this).field_e.length) {
                            statePc = 28;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        if (((vf) this).field_e[var2_int] != null) {
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
                            ((vf) this).field_e[var2_int].b(-111);
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
                        if (null == ((vf) this).field_i) {
                            statePc = 32;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    }
                    case 29: {
                        try {
                            ((vf) this).field_i.b(-114);
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 31;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        var2_ref2 = (IOException) (Object) caughtException;
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

    public final void run() {
        try {
            Object var2 = null;
            ThreadDeath var2_ref = null;
            Throwable var2_ref2 = null;
            int var2_int = 0;
            InterruptedException var3 = null;
            Exception var3_ref = null;
            pm var3_ref2 = null;
            an var3_ref3 = null;
            int var3_int = 0;
            Throwable var4_ref_Throwable = null;
            int var4 = 0;
            String var4_ref = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            String var8 = null;
            ia var9 = null;
            java.awt.datatransfer.Clipboard var10 = null;
            java.awt.datatransfer.Clipboard var11 = null;
            String var12 = null;
            java.awt.Component var13 = null;
            Object[] var14 = null;
            java.awt.Frame var15 = null;
            Object[] var16 = null;
            Object[] var17 = null;
            Thread var18 = null;
            int stackIn_52_0 = 0;
            int stackOut_50_0 = 0;
            int stackOut_51_0 = 0;
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
                            if (((vf) this).field_u) {
                                statePc = 3;
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
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            // monitorexit var2
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        return;
                    }
                    case 5: {
                        try {
                            if (null == ((vf) this).field_c) {
                                statePc = 8;
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
                            var9 = ((vf) this).field_c;
                            ((vf) this).field_c = ((vf) this).field_c.field_e;
                            if (null != ((vf) this).field_c) {
                                statePc = 11;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            ((vf) this).field_o = null;
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
                            var2_int = var9.field_g;
                            if (-2 == var2_int) {
                                statePc = 109;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if (-23 == var2_int) {
                                statePc = 103;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (2 == var2_int) {
                                statePc = 102;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (4 != var2_int) {
                                statePc = 23;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (sf.a((byte) 126) < field_l) {
                                statePc = 21;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            var9.field_a = (Object) (Object) new DataInputStream(((java.net.URL) var9.field_d).openStream());
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (8 == var2_int) {
                                statePc = 98;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if (-10 == (var2_int ^ -1)) {
                                statePc = 92;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            if (18 != var2_int) {
                                statePc = 27;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            var10 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var9.field_a = (Object) (Object) var10.getContents((Object) null);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            if (19 != var2_int) {
                                statePc = 29;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            var7 = (java.awt.datatransfer.Transferable) var9.field_d;
                            var11 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var11.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            if (((vf) this).field_a) {
                                statePc = 31;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (3 != var2_int) {
                                statePc = 36;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if (field_l > sf.a((byte) 113)) {
                                statePc = 34;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            var12 = (255 & var9.field_f >> -425671944) + "." + ((var9.field_f & 16776460) >> 1084091248) + "." + ((var9.field_f & 65306) >> 1259736808) + "." + (255 & var9.field_f);
                            var9.field_a = (Object) (Object) java.net.InetAddress.getByName(var12).getHostName();
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            if (-22 == (var2_int ^ -1)) {
                                statePc = 89;
                            } else {
                                statePc = 37;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            if (5 == var2_int) {
                                statePc = 86;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            if ((var2_int ^ -1) == -7) {
                                statePc = 83;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            if (7 == var2_int) {
                                statePc = 80;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            if (var2_int != 12) {
                                statePc = 42;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            var3_ref3 = vf.a(field_g, (String) var9.field_d, field_v, 34);
                            var9.field_a = (Object) (Object) var3_ref3;
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            if (13 != var2_int) {
                                statePc = 44;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            var3_ref3 = vf.a("", (String) var9.field_d, field_v, 34);
                            var9.field_a = (Object) (Object) var3_ref3;
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            if (!((vf) this).field_a) {
                                statePc = 47;
                            } else {
                                statePc = 45;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            if (-15 == (var2_int ^ -1)) {
                                statePc = 77;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            statePc = 47;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            if (!((vf) this).field_a) {
                                statePc = 55;
                            } else {
                                statePc = 48;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            if ((var2_int ^ -1) != -16) {
                                statePc = 55;
                            } else {
                                statePc = 49;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            if (0 == var9.field_f) {
                                statePc = 51;
                            } else {
                                statePc = 50;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = (stateCaught_49 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            stackOut_50_0 = 1;
                            stackIn_52_0 = stackOut_50_0;
                            statePc = 52;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = (stateCaught_50 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            stackOut_51_0 = 0;
                            stackIn_52_0 = stackOut_51_0;
                            statePc = 52;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = (stateCaught_51 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            var3_int = stackIn_52_0;
                            var13 = (java.awt.Component) var9.field_d;
                            if (((vf) this).field_q) {
                                statePc = 54;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            Object discarded$6 = Class.forName("jj").getDeclaredMethod("showcursor", new Class[2]).invoke(((vf) this).field_m, new Object[2]);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = (stateCaught_53 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            ((vf) this).field_t.a(0, var13, var3_int != 0);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = (stateCaught_54 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            if (((vf) this).field_q) {
                                statePc = 58;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = (stateCaught_55 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            if (17 == var2_int) {
                                statePc = 76;
                            } else {
                                statePc = 57;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = (stateCaught_56 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = (stateCaught_57 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            if ((var2_int ^ -1) == -17) {
                                statePc = 60;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = (stateCaught_58 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = (stateCaught_59 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            if (!field_j.startsWith("win")) {
                                statePc = 62;
                            } else {
                                statePc = 61;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = (stateCaught_60 instanceof Exception ? 75 : (stateCaught_60 instanceof ThreadDeath ? 115 : 116));
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = (stateCaught_61 instanceof Exception ? 75 : (stateCaught_61 instanceof ThreadDeath ? 115 : 116));
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = (stateCaught_62 instanceof Exception ? 75 : (stateCaught_62 instanceof ThreadDeath ? 115 : 116));
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            var8 = (String) var9.field_d;
                            if (var8.startsWith("http://")) {
                                statePc = 67;
                            } else {
                                statePc = 64;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = (stateCaught_63 instanceof Exception ? 75 : (stateCaught_63 instanceof ThreadDeath ? 115 : 116));
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            if (!var8.startsWith("https://")) {
                                statePc = 66;
                            } else {
                                statePc = 65;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = (stateCaught_64 instanceof Exception ? 75 : (stateCaught_64 instanceof ThreadDeath ? 115 : 116));
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = (stateCaught_65 instanceof Exception ? 75 : (stateCaught_65 instanceof ThreadDeath ? 115 : 116));
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = (stateCaught_66 instanceof Exception ? 75 : (stateCaught_66 instanceof ThreadDeath ? 115 : 116));
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            var4_ref = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            var5 = 0;
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = (stateCaught_67 instanceof Exception ? 75 : (stateCaught_67 instanceof ThreadDeath ? 115 : 116));
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            if (var5 >= var8.length()) {
                                statePc = 73;
                            } else {
                                statePc = 69;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = (stateCaught_68 instanceof Exception ? 75 : (stateCaught_68 instanceof ThreadDeath ? 115 : 116));
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            if (-1 == var4_ref.indexOf((int) var8.charAt(var5))) {
                                statePc = 71;
                            } else {
                                statePc = 70;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = (stateCaught_69 instanceof Exception ? 75 : (stateCaught_69 instanceof ThreadDeath ? 115 : 116));
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = (stateCaught_70 instanceof Exception ? 75 : (stateCaught_70 instanceof ThreadDeath ? 115 : 116));
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = (stateCaught_71 instanceof Exception ? 75 : (stateCaught_71 instanceof ThreadDeath ? 115 : 116));
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            var5++;
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = (stateCaught_72 instanceof Exception ? 75 : (stateCaught_72 instanceof ThreadDeath ? 115 : 116));
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            Process discarded$7 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var8 + "\"");
                            var9.field_a = null;
                            statePc = 74;
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = (stateCaught_73 instanceof Exception ? 75 : (stateCaught_73 instanceof ThreadDeath ? 115 : 116));
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = (stateCaught_74 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            var3_ref = (Exception) (Object) caughtException;
                            var9.field_a = (Object) (Object) var3_ref;
                            throw (RuntimeException) (Object) var3_ref;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = (stateCaught_75 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            var14 = (Object[]) var9.field_d;
                            Object discarded$8 = Class.forName("jj").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((vf) this).field_m, new Object[5]);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = (stateCaught_76 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            var3_int = var9.field_f;
                            var4 = var9.field_b;
                            if (((vf) this).field_q) {
                                statePc = 79;
                            } else {
                                statePc = 78;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = (stateCaught_77 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            Object discarded$9 = Class.forName("jj").getDeclaredMethod("movemouse", new Class[2]).invoke(((vf) this).field_m, new Object[2]);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = (stateCaught_78 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            ((vf) this).field_t.a(false, var3_int, var4);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = (stateCaught_79 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            if (!((vf) this).field_q) {
                                statePc = 82;
                            } else {
                                statePc = 81;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = (stateCaught_80 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            ((vf) this).field_w.a((byte) -101, (java.awt.Frame) var9.field_d);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = (stateCaught_81 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            Object discarded$10 = Class.forName("ej").getMethod("exit", new Class[0]).invoke(((vf) this).field_x, new Object[0]);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = (stateCaught_82 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            var15 = new java.awt.Frame("Jagex Full Screen");
                            var9.field_a = (Object) (Object) var15;
                            var15.setResizable(false);
                            if (((vf) this).field_q) {
                                statePc = 85;
                            } else {
                                statePc = 84;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = (stateCaught_83 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            Object discarded$11 = Class.forName("ej").getMethod("enter", new Class[5]).invoke(((vf) this).field_x, new Object[5]);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = (stateCaught_84 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            ((vf) this).field_w.a(65535 & var9.field_b, var9.field_f >>> -514158576, (byte) 114, var15, 65535 & var9.field_f, var9.field_b >> 1783228272);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = (stateCaught_85 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            if (!((vf) this).field_q) {
                                statePc = 88;
                            } else {
                                statePc = 87;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = (stateCaught_86 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            var9.field_a = (Object) (Object) ((vf) this).field_w.a(0);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = (stateCaught_87 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            var9.field_a = Class.forName("ej").getMethod("listmodes", new Class[0]).invoke(((vf) this).field_x, new Object[0]);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = (stateCaught_88 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            if ((field_l ^ -1L) >= (sf.a((byte) -38) ^ -1L)) {
                                statePc = 91;
                            } else {
                                statePc = 90;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = (stateCaught_89 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = (stateCaught_90 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            var9.field_a = (Object) (Object) java.net.InetAddress.getByName((String) var9.field_d).getAddress();
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = (stateCaught_91 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            var16 = (Object[]) var9.field_d;
                            if (((vf) this).field_a) {
                                statePc = 94;
                            } else {
                                statePc = 93;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = (stateCaught_92 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            statePc = 97;
                            continue stateLoop;
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = (stateCaught_93 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        try {
                            if (null == ((Class) var16[0]).getClassLoader()) {
                                statePc = 96;
                            } else {
                                statePc = 95;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = (stateCaught_94 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        try {
                            statePc = 97;
                            continue stateLoop;
                        } catch (Throwable stateCaught_95) {
                            caughtException = stateCaught_95;
                            statePc = (stateCaught_95 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 96: {
                        try {
                            throw new SecurityException();
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = (stateCaught_96 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            var9.field_a = (Object) (Object) ((Class) var16[0]).getDeclaredField((String) var16[1]);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_97) {
                            caughtException = stateCaught_97;
                            statePc = (stateCaught_97 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 98: {
                        try {
                            var17 = (Object[]) var9.field_d;
                            if (!((vf) this).field_a) {
                                statePc = 101;
                            } else {
                                statePc = 99;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_98) {
                            caughtException = stateCaught_98;
                            statePc = (stateCaught_98 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            if (((Class) var17[0]).getClassLoader() != null) {
                                statePc = 101;
                            } else {
                                statePc = 100;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = (stateCaught_99 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 100: {
                        try {
                            throw new SecurityException();
                        } catch (Throwable stateCaught_100) {
                            caughtException = stateCaught_100;
                            statePc = (stateCaught_100 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        try {
                            var9.field_a = (Object) (Object) ((Class) var17[0]).getDeclaredMethod((String) var17[1], (Class[]) var17[2]);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_101) {
                            caughtException = stateCaught_101;
                            statePc = (stateCaught_101 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 102: {
                        try {
                            var18 = new Thread((Runnable) var9.field_d);
                            var18.setDaemon(true);
                            var18.start();
                            var18.setPriority(var9.field_f);
                            var9.field_a = (Object) (Object) var18;
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_102) {
                            caughtException = stateCaught_102;
                            statePc = (stateCaught_102 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 103: {
                        try {
                            if ((field_l ^ -1L) < (sf.a((byte) 99) ^ -1L)) {
                                statePc = 105;
                            } else {
                                statePc = 104;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_103) {
                            caughtException = stateCaught_103;
                            statePc = (stateCaught_103 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 104: {
                        try {
                            statePc = 106;
                            continue stateLoop;
                        } catch (Throwable stateCaught_104) {
                            caughtException = stateCaught_104;
                            statePc = (stateCaught_104 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 105: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_105) {
                            caughtException = stateCaught_105;
                            statePc = (stateCaught_105 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 106: {
                        try {
                            var9.field_a = (Object) (Object) id.a((byte) -34, (String) var9.field_d, var9.field_f).a(0);
                            statePc = 107;
                            continue stateLoop;
                        } catch (Throwable stateCaught_106) {
                            caughtException = stateCaught_106;
                            statePc = (stateCaught_106 instanceof pm ? 108 : (stateCaught_106 instanceof ThreadDeath ? 115 : 116));
                            continue stateLoop;
                        }
                    }
                    case 107: {
                        try {
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_107) {
                            caughtException = stateCaught_107;
                            statePc = (stateCaught_107 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 108: {
                        try {
                            var3_ref2 = (pm) (Object) caughtException;
                            var9.field_a = (Object) (Object) var3_ref2.getMessage();
                            throw var3_ref2;
                        } catch (Throwable stateCaught_108) {
                            caughtException = stateCaught_108;
                            statePc = (stateCaught_108 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 109: {
                        try {
                            if (sf.a((byte) 116) < field_l) {
                                statePc = 111;
                            } else {
                                statePc = 110;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_109) {
                            caughtException = stateCaught_109;
                            statePc = (stateCaught_109 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 110: {
                        try {
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_110) {
                            caughtException = stateCaught_110;
                            statePc = (stateCaught_110 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 111: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_111) {
                            caughtException = stateCaught_111;
                            statePc = (stateCaught_111 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 112: {
                        try {
                            var9.field_a = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var9.field_d), var9.field_f);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_112) {
                            caughtException = stateCaught_112;
                            statePc = (stateCaught_112 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 113: {
                        try {
                            var9.field_c = 1;
                            statePc = 117;
                            continue stateLoop;
                        } catch (Throwable stateCaught_113) {
                            caughtException = stateCaught_113;
                            statePc = (stateCaught_113 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 115: {
                        var2_ref = (ThreadDeath) (Object) caughtException;
                        throw var2_ref;
                    }
                    case 116: {
                        var2_ref2 = caughtException;
                        var9.field_c = 2;
                        statePc = 117;
                        continue stateLoop;
                    }
                    case 117: {
                        var2 = (Object) (Object) var9;
                        // monitorenter var9
                        statePc = 118;
                        continue stateLoop;
                    }
                    case 118: {
                        try {
                            ((Object) (Object) var9).notify();
                            // monitorexit var2
                            statePc = 0;
                            continue stateLoop;
                        } catch (Throwable stateCaught_118) {
                            caughtException = stateCaught_118;
                            statePc = 120;
                            continue stateLoop;
                        }
                    }
                    case 120: {
                        try {
                            var6 = caughtException;
                            // monitorexit var2
                            statePc = 121;
                            continue stateLoop;
                        } catch (Throwable stateCaught_120) {
                            caughtException = stateCaught_120;
                            statePc = 120;
                            continue stateLoop;
                        }
                    }
                    case 121: {
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

    private final ia a(int param0, int param1, String param2, boolean param3) {
        if (param1 <= 62) {
            Object var6 = null;
            ia discarded$0 = ((vf) this).a((java.awt.Frame) null, false);
        }
        return this.a((Object) (Object) param2, param0, (byte) 67, 0, param3 ? 22 : 1);
    }

    final ia a(int param0, int param1, int param2, int param3, byte param4) {
        if (param4 >= -97) {
            Object var7 = null;
            ia discarded$0 = ((vf) this).a((Runnable) null, (byte) -99, 23);
        }
        return this.a((Object) null, param3 + (param2 << -30453008), (byte) 67, (param0 << 1627323632) - -param1, 6);
    }

    private final ia a(Object param0, int param1, byte param2, int param3, int param4) {
        ia var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = new ia();
                    var6.field_g = param4;
                    var6.field_f = param1;
                    var6.field_b = param3;
                    var6.field_d = param0;
                    var7 = this;
                    // monitorenter this
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (((vf) this).field_o != null) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ((vf) this).field_c = var6;
                        ((vf) this).field_o = var6;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ((vf) this).field_o.field_e = var6;
                        ((vf) this).field_o = var6;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        this.notify();
                        // monitorexit var7
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var8 = caughtException;
                        // monitorexit var7
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 7: {
                    throw (RuntimeException) (Object) var8;
                }
                case 8: {
                    if (param2 == 67) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    return null;
                }
                case 10: {
                    return var6;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final ia a(Runnable param0, byte param1, int param2) {
        if (param1 < 0) {
            return null;
        }
        return this.a((Object) (Object) param0, param2, (byte) 67, 0, 2);
    }

    final ia a(byte param0) {
        if (param0 != -114) {
            return null;
        }
        return this.a((Object) null, 0, (byte) 67, 0, 5);
    }

    private final static an a(String param0, String param1, int param2, int param3) {
        try {
            String var7_ref = null;
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            Object var7 = null;
            Exception var8 = null;
            an var8_ref = null;
            Object var9 = null;
            an stackIn_15_0 = null;
            Throwable decompiledCaughtException = null;
            an stackOut_14_0 = null;
            var7_ref = null;
            L0: {
              if (param3 == 34) {
                break L0;
              } else {
                var9 = null;
                an discarded$1 = vf.a((String) null, (String) null, 82, 95);
                break L0;
              }
            }
            L1: {
              if (param2 != 33) {
                if (34 == param2) {
                  var4 = "jagex_" + param0 + "_preferences" + param1 + "_wip.dat";
                  break L1;
                } else {
                  var4 = "jagex_" + param0 + "_preferences" + param1 + ".dat";
                  break L1;
                }
              } else {
                var4 = "jagex_" + param0 + "_preferences" + param1 + "_rc.dat";
                break L1;
              }
            }
            var5_array = new String[]{"c:/rscache/", "/rscache/", field_r, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
            var6 = 0;
            L2: while (true) {
              if (var6 < var5_array.length) {
                L3: {
                  var7_ref = var5_array[var6];
                  if ((var7_ref.length() ^ -1) >= -1) {
                    break L3;
                  } else {
                    if (new File(var7_ref).exists()) {
                      break L3;
                    } else {
                      var6++;
                      continue L2;
                    }
                  }
                }
                try {
                  var8_ref = new an(new File(var7_ref, var4), "rw", 10000L);
                  stackOut_14_0 = (an) var8_ref;
                  stackIn_15_0 = stackOut_14_0;
                } catch (java.lang.Exception decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  return stackIn_15_0;
                }
                continue L2;
              } else {
                return null;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final ia a(java.awt.Frame param0, boolean param1) {
        if (!param1) {
            ((vf) this).field_i = null;
        }
        return this.a((Object) (Object) param0, 0, (byte) 67, 0, 7);
    }

    final ia a(Class param0, String param1, int param2) {
        if (param2 != 21268) {
            ((vf) this).field_k = null;
        }
        return this.a((Object) (Object) new Object[2], 0, (byte) 67, 0, 9);
    }

    final ia a(String param0, int param1, byte param2) {
        if (param2 < 3) {
            ia discarded$0 = ((vf) this).a((byte) 66);
        }
        return this.a(param1, 67, param0, false);
    }

    final ia a(String param0, Class param1, int param2, Class[] param3) {
        if (param2 < 5) {
            return null;
        }
        return this.a((Object) (Object) new Object[3], 0, (byte) 67, 0, 8);
    }

    final ia a(byte param0, java.net.URL param1) {
        if (param0 != -83) {
            return null;
        }
        return this.a((Object) (Object) param1, 0, (byte) 67, 0, 4);
    }

    vf(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        int var5_int = 0;
        ga var6 = null;
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
                    ((vf) this).field_i = null;
                    ((vf) this).field_u = false;
                    ((vf) this).field_c = null;
                    ((vf) this).field_k = null;
                    ((vf) this).field_q = false;
                    ((vf) this).field_a = false;
                    ((vf) this).field_f = null;
                    ((vf) this).field_o = null;
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
                    ((vf) this).field_a = stackIn_3_1 != 0;
                    field_b = "1.1";
                    field_v = param0;
                    field_g = param1;
                    field_s = "Unknown";
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        field_s = System.getProperty("java.vendor");
                        field_b = System.getProperty("java.version");
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
                    if (-1 != field_s.toLowerCase().indexOf("microsoft")) {
                        statePc = 9;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 9: {
                    ((vf) this).field_q = true;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    try {
                        field_n = System.getProperty("os.name");
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    var5 = (Exception) (Object) caughtException;
                    field_n = "Unknown";
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    field_j = field_n.toLowerCase();
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    try {
                        String discarded$4 = System.getProperty("os.arch").toLowerCase();
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    var5 = (Exception) (Object) caughtException;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    try {
                        String discarded$5 = System.getProperty("os.version").toLowerCase();
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 19: {
                    var5 = (Exception) (Object) caughtException;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    try {
                        field_r = System.getProperty("user.home");
                        if (field_r == null) {
                            statePc = 24;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        field_r = field_r + "/";
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 23: {
                    var5 = (Exception) (Object) caughtException;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    if (null == field_r) {
                        statePc = 26;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 26: {
                    field_r = "~/";
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    try {
                        ((vf) this).field_p = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 29: {
                    var5_ref = caughtException;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    if (!((vf) this).field_q) {
                        statePc = 32;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 32: {
                    try {
                        java.lang.reflect.Method discarded$6 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[1]);
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
                    try {
                        field_h = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[1]);
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 37: {
                    var5 = (Exception) (Object) caughtException;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    fk.a(true, field_g, field_v);
                    if (!((vf) this).field_a) {
                        statePc = 57;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    ((vf) this).field_i = new an(fk.a((String) null, "random.dat", false, field_v), "rw", 25L);
                    ((vf) this).field_k = new an(fk.a(0, "main_file_cache.dat2"), "rw", 314572800L);
                    ((vf) this).field_f = new an(fk.a(0, "main_file_cache.idx255"), "rw", 1048576L);
                    ((vf) this).field_e = new an[param2];
                    var5_int = 0;
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    if (param2 <= var5_int) {
                        statePc = 42;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    ((vf) this).field_e[var5_int] = new an(fk.a(0, "main_file_cache.idx" + var5_int), "rw", 1048576L);
                    var5_int++;
                    statePc = 40;
                    continue stateLoop;
                }
                case 42: {
                    if (((vf) this).field_q) {
                        statePc = 44;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 44: {
                    try {
                        Object discarded$7 = Class.forName("qj").newInstance();
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 46: {
                    var5_ref = caughtException;
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    try {
                        if (((vf) this).field_q) {
                            statePc = 49;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        ((vf) this).field_x = Class.forName("ej").newInstance();
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var6 = new ga();
                        ((vf) this).field_w = var6;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 51: {
                    var5_ref = caughtException;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    try {
                        if (!((vf) this).field_q) {
                            statePc = 54;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        ((vf) this).field_t = new ue();
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        ((vf) this).field_m = Class.forName("jj").newInstance();
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 56: {
                    var5_ref = caughtException;
                    statePc = 57;
                    continue stateLoop;
                }
                case 57: {
                    ((vf) this).field_u = false;
                    ((vf) this).field_d = new Thread((Runnable) this);
                    ((vf) this).field_d.setPriority(10);
                    ((vf) this).field_d.setDaemon(true);
                    ((vf) this).field_d.start();
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = 0L;
    }
}
