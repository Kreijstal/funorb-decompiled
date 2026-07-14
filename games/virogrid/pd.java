/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pd implements Runnable {
    static String field_q;
    private boolean field_g;
    ji field_o;
    private Thread field_t;
    private un field_h;
    private static volatile long field_f;
    ji[] field_i;
    static java.lang.reflect.Method field_v;
    static String field_k;
    java.awt.EventQueue field_w;
    static String field_x;
    private ki field_l;
    private un field_m;
    private static int field_u;
    boolean field_a;
    private static String field_d;
    private static String field_r;
    private boolean field_e;
    private static String field_n;
    private Object field_b;
    ji field_j;
    ji field_c;
    private om field_s;
    private Object field_p;

    final un a(java.awt.Frame param0, boolean param1) {
        if (param1) {
            ((pd) this).field_e = false;
        }
        return this.a(7, (byte) -30, 0, (Object) (Object) param0, 0);
    }

    public final void run() {
        try {
            Object var2 = null;
            ThreadDeath var2_ref = null;
            Throwable var2_ref2 = null;
            int var2_int = 0;
            InterruptedException var3 = null;
            te var3_ref = null;
            Exception var3_ref2 = null;
            ji var3_ref3 = null;
            int var3_int = 0;
            Throwable var4_ref_Throwable = null;
            int var4 = 0;
            String var4_ref = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            String var8 = null;
            un var9 = null;
            Object[] var10 = null;
            Object[] var11 = null;
            String var12 = null;
            java.awt.Frame var13 = null;
            Object[] var14 = null;
            java.awt.Component var15 = null;
            java.awt.datatransfer.Clipboard var16 = null;
            java.awt.datatransfer.Clipboard var17 = null;
            Thread var18 = null;
            int stackIn_97_0 = 0;
            int stackOut_95_0 = 0;
            int stackOut_96_0 = 0;
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
                            if (!((pd) this).field_e) {
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
                            if (null != ((pd) this).field_h) {
                                statePc = 6;
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
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var9 = ((pd) this).field_h;
                            ((pd) this).field_h = ((pd) this).field_h.field_d;
                            if (null != ((pd) this).field_h) {
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
                            ((pd) this).field_m = null;
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
                            var2_int = var9.field_b;
                            if (1 != var2_int) {
                                statePc = 20;
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
                            if (field_f > hc.a(-9986)) {
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
                            statePc = 19;
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
                            var9.field_f = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var9.field_g), var9.field_e);
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
                            if (22 != var2_int) {
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
                            if (hc.a(-9986) < field_f) {
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
                            var9.field_f = (Object) (Object) ig.a(var9.field_e, (String) var9.field_g, -92).b(-18982);
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof te ? 26 : (stateCaught_24 instanceof ThreadDeath ? 114 : 115));
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
                            var3_ref = (te) (Object) caughtException;
                            var9.field_f = (Object) (Object) var3_ref.getMessage();
                            throw var3_ref;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            if (2 == var2_int) {
                                statePc = 111;
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
                            if ((var2_int ^ -1) == -5) {
                                statePc = 108;
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
                            if (var2_int != 8) {
                                statePc = 35;
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
                            var10 = (Object[]) var9.field_g;
                            if (((pd) this).field_a) {
                                statePc = 32;
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
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if (null != ((Class) var10[0]).getClassLoader()) {
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
                            throw new SecurityException();
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            var9.field_f = (Object) (Object) ((Class) var10[0]).getDeclaredMethod((String) var10[1], (Class[]) var10[2]);
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            if (9 != var2_int) {
                                statePc = 41;
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
                            var11 = (Object[]) var9.field_g;
                            if (!((pd) this).field_a) {
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
                            if (null == ((Class) var11[0]).getClassLoader()) {
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
                            statePc = 40;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            throw new SecurityException();
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            var9.field_f = (Object) (Object) ((Class) var11[0]).getDeclaredField((String) var11[1]);
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
                            if (var2_int == -19) {
                                statePc = 107;
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
                            if (-20 == var2_int) {
                                statePc = 106;
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
                            if (!((pd) this).field_a) {
                                statePc = 105;
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
                            if (-4 != (var2_int ^ -1)) {
                                statePc = 48;
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
                            if ((field_f ^ -1L) >= (hc.a(-9986) ^ -1L)) {
                                statePc = 47;
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
                            throw new IOException();
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            var12 = (var9.field_e >> 1988519064 & 255) + "." + ((16761372 & var9.field_e) >> 1374038736) + "." + (255 & var9.field_e >> -1438212376) + "." + (255 & var9.field_e);
                            var9.field_f = (Object) (Object) java.net.InetAddress.getByName(var12).getHostName();
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
                            if ((var2_int ^ -1) != -22) {
                                statePc = 52;
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
                            if (hc.a(-9986) >= field_f) {
                                statePc = 51;
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
                            throw new IOException();
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = (stateCaught_50 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            var9.field_f = (Object) (Object) java.net.InetAddress.getByName((String) var9.field_g).getAddress();
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
                            if (var2_int != 5) {
                                statePc = 56;
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
                            if (((pd) this).field_g) {
                                statePc = 55;
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
                            var9.field_f = Class.forName("vk").getMethod("listmodes", new Class[0]).invoke(((pd) this).field_p, new Object[0]);
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = (stateCaught_54 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            var9.field_f = (Object) (Object) ((pd) this).field_s.a(123);
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
                            if (6 != var2_int) {
                                statePc = 60;
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
                            var13 = new java.awt.Frame("Jagex Full Screen");
                            var9.field_f = (Object) (Object) var13;
                            var13.setResizable(false);
                            if (!((pd) this).field_g) {
                                statePc = 59;
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
                            ((pd) this).field_s.a(-80, var9.field_c & 65535, var13, var9.field_e >>> -1094514160, 65535 & var9.field_e, var9.field_c >> -1421081936);
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = (stateCaught_58 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            Object discarded$6 = Class.forName("vk").getMethod("enter", new Class[5]).invoke(((pd) this).field_p, new Object[5]);
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = (stateCaught_59 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            if (7 != var2_int) {
                                statePc = 64;
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
                            if (!((pd) this).field_g) {
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
                            ((pd) this).field_s.a((byte) -54, (java.awt.Frame) var9.field_g);
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
                            Object discarded$7 = Class.forName("vk").getMethod("exit", new Class[0]).invoke(((pd) this).field_p, new Object[0]);
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = (stateCaught_63 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            if (var2_int == 12) {
                                statePc = 104;
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
                            if (13 == var2_int) {
                                statePc = 103;
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
                            if (!((pd) this).field_a) {
                                statePc = 69;
                            } else {
                                statePc = 67;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = (stateCaught_66 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            if (-15 == (var2_int ^ -1)) {
                                statePc = 100;
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
                            statePc = 69;
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = (stateCaught_68 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            if (!((pd) this).field_a) {
                                statePc = 72;
                            } else {
                                statePc = 70;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = (stateCaught_69 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            if (15 == var2_int) {
                                statePc = 94;
                            } else {
                                statePc = 71;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = (stateCaught_70 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = (stateCaught_71 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            if (((pd) this).field_g) {
                                statePc = 75;
                            } else {
                                statePc = 73;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = (stateCaught_72 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            if (17 == var2_int) {
                                statePc = 93;
                            } else {
                                statePc = 74;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = (stateCaught_73 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            statePc = 75;
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = (stateCaught_74 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            if (16 == var2_int) {
                                statePc = 77;
                            } else {
                                statePc = 76;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = (stateCaught_75 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = (stateCaught_76 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            if (!field_x.startsWith("win")) {
                                statePc = 79;
                            } else {
                                statePc = 78;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = (stateCaught_77 instanceof Exception ? 92 : (stateCaught_77 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            statePc = 80;
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = (stateCaught_78 instanceof Exception ? 92 : (stateCaught_78 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = (stateCaught_79 instanceof Exception ? 92 : (stateCaught_79 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            var8 = (String) var9.field_g;
                            if (var8.startsWith("http://")) {
                                statePc = 84;
                            } else {
                                statePc = 81;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = (stateCaught_80 instanceof Exception ? 92 : (stateCaught_80 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            if (!var8.startsWith("https://")) {
                                statePc = 83;
                            } else {
                                statePc = 82;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = (stateCaught_81 instanceof Exception ? 92 : (stateCaught_81 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = (stateCaught_82 instanceof Exception ? 92 : (stateCaught_82 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = (stateCaught_83 instanceof Exception ? 92 : (stateCaught_83 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            var4_ref = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            var5 = 0;
                            statePc = 85;
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = (stateCaught_84 instanceof Exception ? 92 : (stateCaught_84 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            if (var8.length() <= var5) {
                                statePc = 90;
                            } else {
                                statePc = 86;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = (stateCaught_85 instanceof Exception ? 92 : (stateCaught_85 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            if (0 == (var4_ref.indexOf((int) var8.charAt(var5)) ^ -1)) {
                                statePc = 88;
                            } else {
                                statePc = 87;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = (stateCaught_86 instanceof Exception ? 92 : (stateCaught_86 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            statePc = 89;
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = (stateCaught_87 instanceof Exception ? 92 : (stateCaught_87 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = (stateCaught_88 instanceof Exception ? 92 : (stateCaught_88 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            var5++;
                            statePc = 85;
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = (stateCaught_89 instanceof Exception ? 92 : (stateCaught_89 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            Process discarded$8 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var8 + "\"");
                            var9.field_f = null;
                            statePc = 91;
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = (stateCaught_90 instanceof Exception ? 92 : (stateCaught_90 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
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
                            var3_ref2 = (Exception) (Object) caughtException;
                            var9.field_f = (Object) (Object) var3_ref2;
                            throw (RuntimeException) (Object) var3_ref2;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = (stateCaught_92 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            var14 = (Object[]) var9.field_g;
                            Object discarded$9 = Class.forName("uj").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((pd) this).field_b, new Object[5]);
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
                            if (0 == var9.field_e) {
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
                            stackOut_95_0 = 1;
                            stackIn_97_0 = stackOut_95_0;
                            statePc = 97;
                            continue stateLoop;
                        } catch (Throwable stateCaught_95) {
                            caughtException = stateCaught_95;
                            statePc = (stateCaught_95 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 96: {
                        try {
                            stackOut_96_0 = 0;
                            stackIn_97_0 = stackOut_96_0;
                            statePc = 97;
                            continue stateLoop;
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = (stateCaught_96 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            var3_int = stackIn_97_0;
                            var15 = (java.awt.Component) var9.field_g;
                            if (!((pd) this).field_g) {
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
                            ((pd) this).field_l.a(var15, -110, var3_int != 0);
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
                            Object discarded$10 = Class.forName("uj").getDeclaredMethod("showcursor", new Class[2]).invoke(((pd) this).field_b, new Object[2]);
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = (stateCaught_99 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 100: {
                        try {
                            var3_int = var9.field_e;
                            var4 = var9.field_c;
                            if (!((pd) this).field_g) {
                                statePc = 102;
                            } else {
                                statePc = 101;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_100) {
                            caughtException = stateCaught_100;
                            statePc = (stateCaught_100 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        try {
                            ((pd) this).field_l.a(-1340, var3_int, var4);
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
                            Object discarded$11 = Class.forName("uj").getDeclaredMethod("movemouse", new Class[2]).invoke(((pd) this).field_b, new Object[2]);
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
                            var3_ref3 = pd.a("", (String) var9.field_g, field_u, 100150608);
                            var9.field_f = (Object) (Object) var3_ref3;
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
                            var3_ref3 = pd.a(field_n, (String) var9.field_g, field_u, 100150608);
                            var9.field_f = (Object) (Object) var3_ref3;
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_104) {
                            caughtException = stateCaught_104;
                            statePc = (stateCaught_104 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 105: {
                        try {
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_105) {
                            caughtException = stateCaught_105;
                            statePc = (stateCaught_105 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 106: {
                        try {
                            var7 = (java.awt.datatransfer.Transferable) var9.field_g;
                            var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var16.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_106) {
                            caughtException = stateCaught_106;
                            statePc = (stateCaught_106 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 107: {
                        try {
                            var17 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var9.field_f = (Object) (Object) var17.getContents((Object) null);
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_107) {
                            caughtException = stateCaught_107;
                            statePc = (stateCaught_107 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 108: {
                        try {
                            if ((hc.a(-9986) ^ -1L) <= (field_f ^ -1L)) {
                                statePc = 110;
                            } else {
                                statePc = 109;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_108) {
                            caughtException = stateCaught_108;
                            statePc = (stateCaught_108 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 109: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_109) {
                            caughtException = stateCaught_109;
                            statePc = (stateCaught_109 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 110: {
                        try {
                            var9.field_f = (Object) (Object) new DataInputStream(((java.net.URL) var9.field_g).openStream());
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_110) {
                            caughtException = stateCaught_110;
                            statePc = (stateCaught_110 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 111: {
                        try {
                            var18 = new Thread((Runnable) var9.field_g);
                            var18.setDaemon(true);
                            var18.start();
                            var18.setPriority(var9.field_e);
                            var9.field_f = (Object) (Object) var18;
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
                            var9.field_a = 1;
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
                        var9.field_a = 2;
                        statePc = 116;
                        continue stateLoop;
                    }
                    case 116: {
                        var2 = (Object) (Object) var9;
                        // monitorenter var9
                        statePc = 117;
                        continue stateLoop;
                    }
                    case 117: {
                        try {
                            ((Object) (Object) var9).notify();
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

    final un a(int param0, int param1, int param2, int param3, int param4) {
        if (param3 != 1289287280) {
            ((pd) this).a(50);
        }
        return this.a(6, (byte) -30, param4 + (param2 << 1289287280), (Object) null, (param1 << 1011124560) - -param0);
    }

    final un a(int param0, Runnable param1, int param2) {
        if (param2 != 255) {
            field_d = null;
        }
        return this.a(2, (byte) -30, param0, (Object) (Object) param1, 0);
    }

    final un a(Class param0, String param1, boolean param2) {
        if (!param2) {
            Object var5 = null;
            un discarded$0 = this.a(-84, (byte) -3, -6, (Object) null, -93);
        }
        return this.a(9, (byte) -30, 0, (Object) (Object) new Object[2], 0);
    }

    final un a(int param0, int param1, String param2) {
        if (param1 != 27402) {
            return null;
        }
        return this.a(param1 + -27401, false, param2, param0);
    }

    private final static ji a(String param0, String param1, int param2, int param3) {
        try {
            String var7_ref = null;
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            Object var7 = null;
            Exception var8 = null;
            ji var8_ref = null;
            ji stackIn_14_0 = null;
            Throwable decompiledCaughtException = null;
            ji stackOut_13_0 = null;
            var7_ref = null;
            L0: {
              if (param3 == 100150608) {
                break L0;
              } else {
                field_k = null;
                break L0;
              }
            }
            L1: {
              if (33 != param2) {
                if (-35 != (param2 ^ -1)) {
                  var4 = "jagex_" + param0 + "_preferences" + param1 + ".dat";
                  break L1;
                } else {
                  var4 = "jagex_" + param0 + "_preferences" + param1 + "_wip.dat";
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
                  if (0 >= var7_ref.length()) {
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
                  var8_ref = new ji(new File(var7_ref, var4), "rw", 10000L);
                  stackOut_13_0 = (ji) var8_ref;
                  stackIn_14_0 = stackOut_13_0;
                } catch (java.lang.Exception decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  return stackIn_14_0;
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

    private final un a(int param0, boolean param1, String param2, int param3) {
        if (param0 != 1) {
            return null;
        }
        return this.a(param1 ? 22 : 1, (byte) -30, param3, (Object) (Object) param2, 0);
    }

    final un a(java.net.URL param0, boolean param1) {
        if (!param1) {
            field_n = null;
        }
        return this.a(4, (byte) -30, 0, (Object) (Object) param0, 0);
    }

    final un a(Class param0, Class[] param1, boolean param2, String param3) {
        if (!param2) {
            Object var6 = null;
            un discarded$0 = ((pd) this).a((Class) null, (Class[]) null, true, (String) null);
        }
        return this.a(8, (byte) -30, 0, (Object) (Object) new Object[3], 0);
    }

    private final un a(int param0, byte param1, int param2, Object param3, int param4) {
        un var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = new un();
                    var6.field_g = param3;
                    if (param1 == -30) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return null;
                }
                case 2: {
                    var6.field_e = param2;
                    var6.field_c = param4;
                    var6.field_b = param0;
                    var7 = this;
                    // monitorenter this
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        if (((pd) this).field_m != null) {
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
                        ((pd) this).field_h = var6;
                        ((pd) this).field_m = var6;
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
                        ((pd) this).field_m.field_d = var6;
                        ((pd) this).field_m = var6;
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
                            ((pd) this).field_e = true;
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
                            ((pd) this).field_t.join();
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        var2_ref = (InterruptedException) (Object) caughtException;
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        if (param0 == 23607) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 9: {
                        return;
                    }
                    case 10: {
                        if (((pd) this).field_c != null) {
                            statePc = 12;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        try {
                            ((pd) this).field_c.b(0);
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
                        if (null == ((pd) this).field_j) {
                            statePc = 19;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        try {
                            ((pd) this).field_j.b(0);
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
                        if (((pd) this).field_i != null) {
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
                        if (((pd) this).field_i.length <= var2_int) {
                            statePc = 28;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        if (null != ((pd) this).field_i[var2_int]) {
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
                            ((pd) this).field_i[var2_int].b(0);
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
                        if (((pd) this).field_o != null) {
                            statePc = 30;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    }
                    case 30: {
                        try {
                            ((pd) this).field_o.b(0);
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

    final un a(byte param0) {
        if (param0 > -106) {
            ((pd) this).field_o = null;
        }
        return this.a(5, (byte) -30, 0, (Object) null, 0);
    }

    final boolean b(int param0) {
        int var2 = 71 % ((param0 - -58) / 60);
        if (!(((pd) this).field_a)) {
            return false;
        }
        if (((pd) this).field_g) {
            return ((pd) this).field_s != null ? true : false;
        }
        return ((pd) this).field_p != null ? true : false;
    }

    pd(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        int var5_int = 0;
        om var6 = null;
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
                    ((pd) this).field_g = false;
                    ((pd) this).field_a = false;
                    ((pd) this).field_m = null;
                    ((pd) this).field_h = null;
                    ((pd) this).field_e = false;
                    ((pd) this).field_j = null;
                    ((pd) this).field_o = null;
                    ((pd) this).field_c = null;
                    field_u = param0;
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
                    ((pd) this).field_a = stackIn_3_1 != 0;
                    field_k = "1.1";
                    field_q = "Unknown";
                    field_n = param1;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        field_q = System.getProperty("java.vendor");
                        field_k = System.getProperty("java.version");
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
                    if (field_q.toLowerCase().indexOf("microsoft") != -1) {
                        statePc = 9;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 9: {
                    ((pd) this).field_g = true;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    try {
                        field_d = System.getProperty("os.name");
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
                    field_d = "Unknown";
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    field_x = field_d.toLowerCase();
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
                        if (null == field_r) {
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
                        ((pd) this).field_w = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
                    if (((pd) this).field_g) {
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
                        field_v = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[1]);
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
                    ui.a((byte) 125, field_u, field_n);
                    if (!((pd) this).field_a) {
                        statePc = 56;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    ((pd) this).field_o = new ji(ui.a((byte) 123, (String) null, "random.dat", field_u), "rw", 25L);
                    ((pd) this).field_c = new ji(ui.a("main_file_cache.dat2", (byte) -83), "rw", 314572800L);
                    ((pd) this).field_j = new ji(ui.a("main_file_cache.idx255", (byte) -83), "rw", 1048576L);
                    ((pd) this).field_i = new ji[param2];
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
                    ((pd) this).field_i[var5_int] = new ji(ui.a("main_file_cache.idx" + var5_int, (byte) -83), "rw", 1048576L);
                    var5_int++;
                    statePc = 39;
                    continue stateLoop;
                }
                case 41: {
                    if (((pd) this).field_g) {
                        statePc = 43;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 43: {
                    try {
                        Object discarded$7 = Class.forName("jn").newInstance();
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
                        if (!((pd) this).field_g) {
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
                        var6 = new om();
                        ((pd) this).field_s = var6;
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
                        ((pd) this).field_p = Class.forName("vk").newInstance();
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
                        if (((pd) this).field_g) {
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
                        ((pd) this).field_b = Class.forName("uj").newInstance();
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
                        ((pd) this).field_l = new ki();
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
                    ((pd) this).field_e = false;
                    ((pd) this).field_t = new Thread((Runnable) this);
                    ((pd) this).field_t.setPriority(10);
                    ((pd) this).field_t.setDaemon(true);
                    ((pd) this).field_t.start();
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 0L;
    }
}
