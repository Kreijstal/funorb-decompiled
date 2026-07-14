/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bu implements Runnable {
    ao field_q;
    ao field_c;
    private static String field_e;
    java.awt.EventQueue field_a;
    ao field_j;
    private Thread field_s;
    boolean field_l;
    private boolean field_m;
    private gh field_k;
    private static volatile long field_w;
    ao[] field_v;
    private wu field_p;
    private Object field_g;
    static String field_r;
    static java.lang.reflect.Method field_x;
    private boolean field_f;
    static String field_h;
    private static String field_t;
    private static int field_d;
    private Object field_i;
    private static String field_b;
    private wu field_o;
    private wg field_n;
    static String field_u;

    final wu a(int param0, Class[] param1, Class param2, String param3) {
        if (param0 != -30971) {
            ((bu) this).field_k = null;
        }
        return this.a(8, 0, 8128, (Object) (Object) new Object[3], 0);
    }

    final wu a(String param0, Class param1, int param2) {
        if (param2 != 0) {
            return null;
        }
        return this.a(9, 0, 8128, (Object) (Object) new Object[2], 0);
    }

    final wu a(byte param0, int param1, int param2, java.awt.Component param3) {
        java.awt.Point var5 = param3.getLocationOnScreen();
        if (param0 <= 19) {
            field_e = null;
        }
        return this.a(14, param1 - -var5.y, 8128, (Object) null, var5.x + param2);
    }

    private final wu a(String param0, boolean param1, int param2, int param3) {
        if (param2 != -8) {
            return null;
        }
        return this.a(param1 ? 22 : 1, 0, 8128, (Object) (Object) param0, param3);
    }

    final wu b(boolean param0) {
        if (!param0) {
            return null;
        }
        return this.a(5, 0, 8128, (Object) null, 0);
    }

    final wu a(int param0, java.awt.Component param1, boolean param2) {
        if (param0 > -116) {
            return null;
        }
        return this.a(15, 0, 8128, (Object) (Object) param1, !param2 ? 0 : 1);
    }

    final boolean b(int param0) {
        if (!(((bu) this).field_l)) {
            return false;
        }
        int var2 = -103 % ((param0 - 46) / 34);
        if (((bu) this).field_f) {
            return ((bu) this).field_k != null ? true : false;
        }
        return ((bu) this).field_i != null ? true : false;
    }

    public final void run() {
        try {
            Object var2 = null;
            ThreadDeath var2_ref = null;
            Throwable var2_ref2 = null;
            int var2_int = 0;
            InterruptedException var3 = null;
            lw var3_ref = null;
            Exception var3_ref2 = null;
            ao var3_ref3 = null;
            int var3_int = 0;
            Throwable var4 = null;
            int var4_int = 0;
            String var4_ref = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            wu var8 = null;
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
            int stackIn_70_0 = 0;
            int stackOut_68_0 = 0;
            int stackOut_69_0 = 0;
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
                            if (((bu) this).field_m) {
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
                            if (null == ((bu) this).field_o) {
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
                            var8 = ((bu) this).field_o;
                            ((bu) this).field_o = ((bu) this).field_o.field_f;
                            if (((bu) this).field_o != null) {
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
                            ((bu) this).field_p = null;
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
                            var4 = caughtException;
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
                        throw (RuntimeException) (Object) var4;
                    }
                    case 15: {
                        try {
                            var2_int = var8.field_c;
                            if (-2 == var2_int) {
                                statePc = 103;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if (-23 != var2_int) {
                                statePc = 23;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (field_w > nj.a(35)) {
                                statePc = 19;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            var8.field_b = (Object) (Object) ql.a((String) var8.field_g, var8.field_d, -13067).a(1);
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof lw ? 22 : (stateCaught_20 instanceof ThreadDeath ? 109 : 110));
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            statePc = 107;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            var3_ref = (lw) (Object) caughtException;
                            var8.field_b = (Object) (Object) var3_ref.getMessage();
                            throw var3_ref;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (var2_int != 2) {
                                statePc = 25;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            var9 = new Thread((Runnable) var8.field_g);
                            var9.setDaemon(true);
                            var9.start();
                            var9.setPriority(var8.field_d);
                            var8.field_b = (Object) (Object) var9;
                            statePc = 107;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            if (4 != var2_int) {
                                statePc = 29;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            if (field_w <= nj.a(43)) {
                                statePc = 28;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            var8.field_b = (Object) (Object) new DataInputStream(((java.net.URL) var8.field_g).openStream());
                            statePc = 107;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            if ((var2_int ^ -1) != -9) {
                                statePc = 34;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            var10 = (Object[]) var8.field_g;
                            if (!((bu) this).field_l) {
                                statePc = 33;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof ThreadDeath ? 109 : 110);
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
                            statePc = (stateCaught_31 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            throw new SecurityException();
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            var8.field_b = (Object) (Object) ((Class) var10[0]).getDeclaredMethod((String) var10[1], (Class[]) var10[2]);
                            statePc = 107;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if (-10 == var2_int) {
                                statePc = 98;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            if (-19 != var2_int) {
                                statePc = 37;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            var11 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var8.field_b = (Object) (Object) var11.getContents((Object) null);
                            statePc = 107;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            if ((var2_int ^ -1) != -20) {
                                statePc = 39;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            var7 = (java.awt.datatransfer.Transferable) var8.field_g;
                            var12 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var12.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                            statePc = 107;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            if (!((bu) this).field_l) {
                                statePc = 97;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            if (-4 == (var2_int ^ -1)) {
                                statePc = 94;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            if ((var2_int ^ -1) != -22) {
                                statePc = 45;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            if ((field_w ^ -1L) >= (nj.a(-52) ^ -1L)) {
                                statePc = 44;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            var8.field_b = (Object) (Object) java.net.InetAddress.getByName((String) var8.field_g).getAddress();
                            statePc = 107;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            if ((var2_int ^ -1) != -6) {
                                statePc = 49;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            if (((bu) this).field_f) {
                                statePc = 48;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            var8.field_b = Class.forName("fe").getMethod("listmodes", new Class[0]).invoke(((bu) this).field_i, new Object[0]);
                            statePc = 107;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            var8.field_b = (Object) (Object) ((bu) this).field_k.a(0);
                            statePc = 107;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            if (var2_int != 6) {
                                statePc = 53;
                            } else {
                                statePc = 50;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = (stateCaught_49 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            var13 = new java.awt.Frame("Jagex Full Screen");
                            var8.field_b = (Object) (Object) var13;
                            var13.setResizable(false);
                            if (((bu) this).field_f) {
                                statePc = 52;
                            } else {
                                statePc = 51;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = (stateCaught_50 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            Object discarded$6 = Class.forName("fe").getMethod("enter", new Class[5]).invoke(((bu) this).field_i, new Object[5]);
                            statePc = 107;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = (stateCaught_51 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            ((bu) this).field_k.a(var8.field_d >>> 1232972816, 65535 & var8.field_e, var8.field_d & 65535, var13, var8.field_e >> 1153725424, -2147483648);
                            statePc = 107;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            if (-8 != (var2_int ^ -1)) {
                                statePc = 57;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = (stateCaught_53 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            if (!((bu) this).field_f) {
                                statePc = 56;
                            } else {
                                statePc = 55;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = (stateCaught_54 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            ((bu) this).field_k.a(0, (java.awt.Frame) var8.field_g);
                            statePc = 107;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = (stateCaught_55 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            Object discarded$7 = Class.forName("fe").getMethod("exit", new Class[0]).invoke(((bu) this).field_i, new Object[0]);
                            statePc = 107;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = (stateCaught_56 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            if (12 == var2_int) {
                                statePc = 93;
                            } else {
                                statePc = 58;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = (stateCaught_57 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            if (13 != var2_int) {
                                statePc = 60;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = (stateCaught_58 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            var3_ref3 = bu.a(-112, field_d, "", (String) var8.field_g);
                            var8.field_b = (Object) (Object) var3_ref3;
                            statePc = 107;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = (stateCaught_59 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            if (!((bu) this).field_l) {
                                statePc = 65;
                            } else {
                                statePc = 61;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = (stateCaught_60 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            if (var2_int != 14) {
                                statePc = 65;
                            } else {
                                statePc = 62;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = (stateCaught_61 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            var3_int = var8.field_d;
                            var4_int = var8.field_e;
                            if (!((bu) this).field_f) {
                                statePc = 64;
                            } else {
                                statePc = 63;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = (stateCaught_62 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            ((bu) this).field_n.a(var4_int, (byte) -40, var3_int);
                            statePc = 107;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = (stateCaught_63 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            Object discarded$8 = Class.forName("fl").getDeclaredMethod("movemouse", new Class[2]).invoke(((bu) this).field_g, new Object[2]);
                            statePc = 107;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = (stateCaught_64 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            if (!((bu) this).field_l) {
                                statePc = 73;
                            } else {
                                statePc = 66;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = (stateCaught_65 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            if (15 != var2_int) {
                                statePc = 73;
                            } else {
                                statePc = 67;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = (stateCaught_66 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            if (-1 == (var8.field_d ^ -1)) {
                                statePc = 69;
                            } else {
                                statePc = 68;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = (stateCaught_67 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            stackOut_68_0 = 1;
                            stackIn_70_0 = stackOut_68_0;
                            statePc = 70;
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = (stateCaught_68 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            stackOut_69_0 = 0;
                            stackIn_70_0 = stackOut_69_0;
                            statePc = 70;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = (stateCaught_69 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            var3_int = stackIn_70_0;
                            var14 = (java.awt.Component) var8.field_g;
                            if (!((bu) this).field_f) {
                                statePc = 72;
                            } else {
                                statePc = 71;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = (stateCaught_70 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            ((bu) this).field_n.a(var14, var3_int != 0, -106);
                            statePc = 107;
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = (stateCaught_71 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            Object discarded$9 = Class.forName("fl").getDeclaredMethod("showcursor", new Class[2]).invoke(((bu) this).field_g, new Object[2]);
                            statePc = 107;
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = (stateCaught_72 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            if (((bu) this).field_f) {
                                statePc = 76;
                            } else {
                                statePc = 74;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = (stateCaught_73 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            if ((var2_int ^ -1) == -18) {
                                statePc = 92;
                            } else {
                                statePc = 75;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = (stateCaught_74 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            statePc = 76;
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = (stateCaught_75 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            if (var2_int != 16) {
                                statePc = 91;
                            } else {
                                statePc = 77;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = (stateCaught_76 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            statePc = 78;
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = (stateCaught_77 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            if (field_h.startsWith("win")) {
                                statePc = 80;
                            } else {
                                statePc = 79;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = (stateCaught_78 instanceof Exception ? 90 : (stateCaught_78 instanceof ThreadDeath ? 109 : 110));
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = (stateCaught_79 instanceof Exception ? 90 : (stateCaught_79 instanceof ThreadDeath ? 109 : 110));
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            var15 = (String) var8.field_g;
                            if (var15.startsWith("http://")) {
                                statePc = 83;
                            } else {
                                statePc = 81;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = (stateCaught_80 instanceof Exception ? 90 : (stateCaught_80 instanceof ThreadDeath ? 109 : 110));
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            if (var15.startsWith("https://")) {
                                statePc = 83;
                            } else {
                                statePc = 82;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = (stateCaught_81 instanceof Exception ? 90 : (stateCaught_81 instanceof ThreadDeath ? 109 : 110));
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = (stateCaught_82 instanceof Exception ? 90 : (stateCaught_82 instanceof ThreadDeath ? 109 : 110));
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            var4_ref = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            var5 = 0;
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = (stateCaught_83 instanceof Exception ? 90 : (stateCaught_83 instanceof ThreadDeath ? 109 : 110));
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            if (var15.length() <= var5) {
                                statePc = 88;
                            } else {
                                statePc = 85;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = (stateCaught_84 instanceof Exception ? 90 : (stateCaught_84 instanceof ThreadDeath ? 109 : 110));
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            if (-1 != var4_ref.indexOf((int) var15.charAt(var5))) {
                                statePc = 87;
                            } else {
                                statePc = 86;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = (stateCaught_85 instanceof Exception ? 90 : (stateCaught_85 instanceof ThreadDeath ? 109 : 110));
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = (stateCaught_86 instanceof Exception ? 90 : (stateCaught_86 instanceof ThreadDeath ? 109 : 110));
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            var5++;
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = (stateCaught_87 instanceof Exception ? 90 : (stateCaught_87 instanceof ThreadDeath ? 109 : 110));
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            Process discarded$10 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var15 + "\"");
                            var8.field_b = null;
                            statePc = 89;
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = (stateCaught_88 instanceof Exception ? 90 : (stateCaught_88 instanceof ThreadDeath ? 109 : 110));
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            statePc = 107;
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = (stateCaught_89 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            var3_ref2 = (Exception) (Object) caughtException;
                            var8.field_b = (Object) (Object) var3_ref2;
                            throw (RuntimeException) (Object) var3_ref2;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = (stateCaught_90 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = (stateCaught_91 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            var16 = (Object[]) var8.field_g;
                            Object discarded$11 = Class.forName("fl").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((bu) this).field_g, new Object[5]);
                            statePc = 107;
                            continue stateLoop;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = (stateCaught_92 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            var3_ref3 = bu.a(-127, field_d, field_e, (String) var8.field_g);
                            var8.field_b = (Object) (Object) var3_ref3;
                            statePc = 107;
                            continue stateLoop;
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = (stateCaught_93 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        try {
                            if ((nj.a(-68) ^ -1L) <= (field_w ^ -1L)) {
                                statePc = 96;
                            } else {
                                statePc = 95;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = (stateCaught_94 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_95) {
                            caughtException = stateCaught_95;
                            statePc = (stateCaught_95 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 96: {
                        try {
                            var17 = (255 & var8.field_d >> -263221864) + "." + ((16767672 & var8.field_d) >> -1175570576) + "." + ((65454 & var8.field_d) >> -274944696) + "." + (var8.field_d & 255);
                            var8.field_b = (Object) (Object) java.net.InetAddress.getByName(var17).getHostName();
                            statePc = 107;
                            continue stateLoop;
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = (stateCaught_96 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_97) {
                            caughtException = stateCaught_97;
                            statePc = (stateCaught_97 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 98: {
                        try {
                            var18 = (Object[]) var8.field_g;
                            if (((bu) this).field_l) {
                                statePc = 100;
                            } else {
                                statePc = 99;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_98) {
                            caughtException = stateCaught_98;
                            statePc = (stateCaught_98 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            statePc = 102;
                            continue stateLoop;
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = (stateCaught_99 instanceof ThreadDeath ? 109 : 110);
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
                            statePc = (stateCaught_100 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        try {
                            throw new SecurityException();
                        } catch (Throwable stateCaught_101) {
                            caughtException = stateCaught_101;
                            statePc = (stateCaught_101 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 102: {
                        try {
                            var8.field_b = (Object) (Object) ((Class) var18[0]).getDeclaredField((String) var18[1]);
                            statePc = 107;
                            continue stateLoop;
                        } catch (Throwable stateCaught_102) {
                            caughtException = stateCaught_102;
                            statePc = (stateCaught_102 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 103: {
                        try {
                            if (nj.a(-119) < field_w) {
                                statePc = 105;
                            } else {
                                statePc = 104;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_103) {
                            caughtException = stateCaught_103;
                            statePc = (stateCaught_103 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 104: {
                        try {
                            statePc = 106;
                            continue stateLoop;
                        } catch (Throwable stateCaught_104) {
                            caughtException = stateCaught_104;
                            statePc = (stateCaught_104 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 105: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_105) {
                            caughtException = stateCaught_105;
                            statePc = (stateCaught_105 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 106: {
                        try {
                            var8.field_b = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var8.field_g), var8.field_d);
                            statePc = 107;
                            continue stateLoop;
                        } catch (Throwable stateCaught_106) {
                            caughtException = stateCaught_106;
                            statePc = (stateCaught_106 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 107: {
                        try {
                            var8.field_a = 1;
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_107) {
                            caughtException = stateCaught_107;
                            statePc = (stateCaught_107 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 109: {
                        var2_ref = (ThreadDeath) (Object) caughtException;
                        throw var2_ref;
                    }
                    case 110: {
                        var2_ref2 = caughtException;
                        var8.field_a = 2;
                        statePc = 111;
                        continue stateLoop;
                    }
                    case 111: {
                        var2 = (Object) (Object) var8;
                        // monitorenter var8
                        statePc = 112;
                        continue stateLoop;
                    }
                    case 112: {
                        try {
                            ((Object) (Object) var8).notify();
                            // monitorexit var2
                            statePc = 0;
                            continue stateLoop;
                        } catch (Throwable stateCaught_112) {
                            caughtException = stateCaught_112;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 114: {
                        try {
                            var6 = caughtException;
                            // monitorexit var2
                            statePc = 115;
                            continue stateLoop;
                        } catch (Throwable stateCaught_114) {
                            caughtException = stateCaught_114;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 115: {
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

    final wu a(byte param0, java.awt.datatransfer.Transferable param1) {
        if (param0 != 68) {
            ((bu) this).field_g = null;
        }
        return this.a(19, 0, 8128, (Object) (Object) param1, 0);
    }

    final wu a(int param0, int param1, boolean param2, int param3, int param4) {
        if (param2) {
            return null;
        }
        return this.a(6, param1 + (param4 << -1370823920), 8128, (Object) null, (param3 << -1397180272) - -param0);
    }

    final wu a(int param0) {
        if (param0 != 15) {
            return null;
        }
        return this.a(18, 0, 8128, (Object) null, 0);
    }

    final void a(boolean param0) {
        try {
            Object var2 = null;
            InterruptedException var2_ref = null;
            IOException var2_ref2 = null;
            int var2_int = 0;
            Throwable var3 = null;
            IOException var3_ref = null;
            Object stackIn_2_0 = null;
            Object stackIn_3_0 = null;
            Object stackIn_4_0 = null;
            int stackIn_4_1 = 0;
            Object stackOut_1_0 = null;
            Object stackOut_2_0 = null;
            int stackOut_2_1 = 0;
            Object stackOut_3_0 = null;
            int stackOut_3_1 = 0;
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
                            stackOut_1_0 = this;
                            stackIn_3_0 = stackOut_1_0;
                            stackIn_2_0 = stackOut_1_0;
                            if (!param0) {
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
                            stackOut_2_0 = this;
                            stackOut_2_1 = 1;
                            stackIn_4_0 = stackOut_2_0;
                            stackIn_4_1 = stackOut_2_1;
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
                            stackOut_3_0 = this;
                            stackOut_3_1 = 0;
                            stackIn_4_0 = stackOut_3_0;
                            stackIn_4_1 = stackOut_3_1;
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
                            ((bu) this).field_m = stackIn_4_1 != 0;
                            this.notifyAll();
                            // monitorexit var2
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
                            var3 = caughtException;
                            // monitorexit var2
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 6;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        throw (RuntimeException) (Object) var3;
                    }
                    case 8: {
                        try {
                            ((bu) this).field_s.join();
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        var2_ref = (InterruptedException) (Object) caughtException;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        if (null == ((bu) this).field_c) {
                            statePc = 15;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        try {
                            ((bu) this).field_c.a(-101);
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
                        if (null != ((bu) this).field_j) {
                            statePc = 17;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 17: {
                        try {
                            ((bu) this).field_j.a(-118);
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
                        if (null != ((bu) this).field_v) {
                            statePc = 22;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        var2_int = 0;
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 23: {
                        if (var2_int >= ((bu) this).field_v.length) {
                            statePc = 30;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    }
                    case 24: {
                        if (((bu) this).field_v[var2_int] != null) {
                            statePc = 27;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    }
                    case 25: {
                        var2_int++;
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 27: {
                        try {
                            ((bu) this).field_v[var2_int].a(-123);
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        var2_int++;
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 29: {
                        var3_ref = (IOException) (Object) caughtException;
                        var2_int++;
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 30: {
                        if (null != ((bu) this).field_q) {
                            statePc = 32;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    }
                    case 32: {
                        try {
                            ((bu) this).field_q.a(-106);
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        var2_ref2 = (IOException) (Object) caughtException;
                        statePc = 35;
                        continue stateLoop;
                    }
                    case 35: {
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

    final wu a(java.net.URL param0, byte param1) {
        if (param1 > -17) {
            Object var4 = null;
            ao discarded$0 = bu.a(92, -82, (String) null, (String) null);
        }
        return this.a(4, 0, 8128, (Object) (Object) param0, 0);
    }

    final wu a(byte param0, java.awt.Frame param1) {
        if (param0 >= -36) {
            Object var4 = null;
            ao discarded$0 = bu.a(-21, 74, (String) null, (String) null);
        }
        return this.a(7, 0, 8128, (Object) (Object) param1, 0);
    }

    final wu a(int param0, byte param1, Runnable param2) {
        if (param1 < 109) {
            ((bu) this).field_g = null;
        }
        return this.a(2, 0, 8128, (Object) (Object) param2, param0);
    }

    private final wu a(int param0, int param1, int param2, Object param3, int param4) {
        wu var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        Object stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = new wu();
                    var6.field_e = param1;
                    var6.field_d = param4;
                    var6.field_g = param3;
                    var6.field_c = param0;
                    var7 = this;
                    // monitorenter this
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param2 == 8128) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        // monitorexit var7
                        stackOut_2_0 = null;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return (wu) (Object) stackIn_3_0;
                }
                case 4: {
                    try {
                        if (null != ((bu) this).field_p) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        ((bu) this).field_o = var6;
                        ((bu) this).field_p = var6;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        ((bu) this).field_p.field_f = var6;
                        ((bu) this).field_p = var6;
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
                        this.notify();
                        // monitorexit var7
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var8 = caughtException;
                        // monitorexit var7
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 10: {
                    throw (RuntimeException) (Object) var8;
                }
                case 11: {
                    return var6;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    bu(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        int var5_int = 0;
        gh var7 = null;
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
                    ((bu) this).field_l = false;
                    ((bu) this).field_m = false;
                    ((bu) this).field_j = null;
                    ((bu) this).field_c = null;
                    ((bu) this).field_f = false;
                    ((bu) this).field_p = null;
                    ((bu) this).field_o = null;
                    ((bu) this).field_q = null;
                    field_u = "Unknown";
                    field_r = "1.1";
                    field_e = param1;
                    field_d = param0;
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
                    ((bu) this).field_l = stackIn_3_1 != 0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        field_u = System.getProperty("java.vendor");
                        field_r = System.getProperty("java.version");
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
                    if (-1 != field_u.toLowerCase().indexOf("microsoft")) {
                        statePc = 9;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 9: {
                    ((bu) this).field_f = true;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    try {
                        field_t = System.getProperty("os.name");
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
                    field_t = "Unknown";
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    field_h = field_t.toLowerCase();
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
                        field_b = System.getProperty("user.home");
                        if (null == field_b) {
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
                        field_b = field_b + "/";
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
                    if (null == field_b) {
                        statePc = 26;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 26: {
                    field_b = "~/";
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    try {
                        ((bu) this).field_a = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
                    if (((bu) this).field_f) {
                        statePc = 37;
                    } else {
                        statePc = 31;
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
                        field_x = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[1]);
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
                    bj.a(field_e, (byte) -99, field_d);
                    if (!((bu) this).field_l) {
                        statePc = 55;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    ((bu) this).field_q = new ao(bj.a("random.dat", (String) null, field_d, false), "rw", 25L);
                    ((bu) this).field_c = new ao(bj.a("main_file_cache.dat2", 0), "rw", 314572800L);
                    ((bu) this).field_j = new ao(bj.a("main_file_cache.idx255", 0), "rw", 1048576L);
                    ((bu) this).field_v = new ao[param2];
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
                    ((bu) this).field_v[var5_int] = new ao(bj.a("main_file_cache.idx" + var5_int, 0), "rw", 1048576L);
                    var5_int++;
                    statePc = 39;
                    continue stateLoop;
                }
                case 41: {
                    if (!((bu) this).field_f) {
                        statePc = 45;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    try {
                        Object discarded$7 = Class.forName("mw").newInstance();
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
                        if (!((bu) this).field_f) {
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
                        var7 = new gh();
                        ((bu) this).field_k = var7;
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
                        ((bu) this).field_i = Class.forName("fe").newInstance();
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
                        if (((bu) this).field_f) {
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
                        ((bu) this).field_g = Class.forName("fl").newInstance();
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
                        ((bu) this).field_n = new wg();
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
                    ((bu) this).field_m = false;
                    ((bu) this).field_s = new Thread((Runnable) this);
                    ((bu) this).field_s.setPriority(10);
                    ((bu) this).field_s.setDaemon(true);
                    ((bu) this).field_s.start();
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final static ao a(int param0, int param1, String param2, String param3) {
        try {
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            String var7 = null;
            Exception var8 = null;
            ao var8_ref = null;
            ao stackIn_15_0 = null;
            Throwable decompiledCaughtException = null;
            ao stackOut_14_0 = null;
            L0: {
              if (param1 == 33) {
                var4 = "jagex_" + param2 + "_preferences" + param3 + "_rc.dat";
                break L0;
              } else {
                if ((param1 ^ -1) != -35) {
                  var4 = "jagex_" + param2 + "_preferences" + param3 + ".dat";
                  break L0;
                } else {
                  var4 = "jagex_" + param2 + "_preferences" + param3 + "_wip.dat";
                  break L0;
                }
              }
            }
            var5_array = new String[]{"c:/rscache/", "/rscache/", field_b, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
            if (param0 <= -95) {
              var6 = 0;
              L1: while (true) {
                if (var5_array.length > var6) {
                  L2: {
                    var7 = var5_array[var6];
                    if (0 >= var7.length()) {
                      break L2;
                    } else {
                      if (new File(var7).exists()) {
                        break L2;
                      } else {
                        var6++;
                        continue L1;
                      }
                    }
                  }
                  try {
                    var8_ref = new ao(new File(var7, var4), "rw", 10000L);
                    stackOut_14_0 = (ao) var8_ref;
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

    final wu a(boolean param0, String param1, int param2) {
        if (!param0) {
            field_h = null;
        }
        return this.a(param1, false, -8, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = 0L;
    }
}
