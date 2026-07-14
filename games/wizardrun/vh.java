/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vh implements Runnable {
    static String field_k;
    private static String field_l;
    static java.lang.reflect.Method field_q;
    private al field_x;
    ri field_i;
    private boolean field_j;
    ri field_m;
    private Object field_t;
    java.awt.EventQueue field_a;
    private static volatile long field_d;
    private static int field_w;
    static String field_p;
    private Thread field_e;
    boolean field_s;
    private static String field_v;
    private jh field_r;
    private Object field_h;
    private ba field_u;
    ri[] field_f;
    private static String field_n;
    ri field_c;
    private jh field_o;
    private boolean field_g;
    static String field_b;

    public final void run() {
        try {
            Object var2 = null;
            ThreadDeath var2_ref = null;
            Throwable var2_ref2 = null;
            int var2_int = 0;
            InterruptedException var3 = null;
            hf var3_ref = null;
            Exception var3_ref2 = null;
            ri var3_ref3 = null;
            int var3_int = 0;
            Throwable var4_ref_Throwable = null;
            int var4 = 0;
            String var4_ref = null;
            int var5 = 0;
            Throwable var6 = null;
            String var7 = null;
            java.awt.datatransfer.Transferable var8 = null;
            jh var9 = null;
            Object[] var10 = null;
            java.awt.datatransfer.Clipboard var11 = null;
            Object[] var12 = null;
            java.awt.Component var13 = null;
            java.awt.Frame var14 = null;
            String var15 = null;
            java.awt.datatransfer.Clipboard var16 = null;
            Object[] var17 = null;
            Thread var18 = null;
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
                            if (!((vh) this).field_g) {
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
                            if (((vh) this).field_o != null) {
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
                            var9 = ((vh) this).field_o;
                            ((vh) this).field_o = ((vh) this).field_o.field_c;
                            if (((vh) this).field_o != null) {
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
                            ((vh) this).field_r = null;
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
                            if ((var2_int ^ -1) == -2) {
                                statePc = 105;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if (var2_int != 22) {
                                statePc = 22;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (d.a((byte) 50) >= field_d) {
                                statePc = 19;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            var9.field_e = (Object) (Object) mj.a((String) var9.field_g, var9.field_d, -1).a((byte) -128);
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof hf ? 21 : (stateCaught_19 instanceof ThreadDeath ? 111 : 112));
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            var3_ref = (hf) (Object) caughtException;
                            var9.field_e = (Object) (Object) var3_ref.getMessage();
                            throw var3_ref;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            if (-3 == (var2_int ^ -1)) {
                                statePc = 104;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (4 == var2_int) {
                                statePc = 101;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if ((var2_int ^ -1) != -9) {
                                statePc = 30;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            var10 = (Object[]) var9.field_g;
                            if (((vh) this).field_s) {
                                statePc = 27;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            if (null != ((Class) var10[0]).getClassLoader()) {
                                statePc = 29;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            throw new SecurityException();
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            var9.field_e = (Object) (Object) ((Class) var10[0]).getDeclaredMethod((String) var10[1], (Class[]) var10[2]);
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if (var2_int == 9) {
                                statePc = 95;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (18 != var2_int) {
                                statePc = 33;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            var11 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var9.field_e = (Object) (Object) var11.getContents((Object) null);
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            if ((var2_int ^ -1) == -20) {
                                statePc = 94;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if (!((vh) this).field_s) {
                                statePc = 93;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            if ((var2_int ^ -1) == -4) {
                                statePc = 90;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            if ((var2_int ^ -1) == -22) {
                                statePc = 87;
                            } else {
                                statePc = 37;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            if (var2_int == 5) {
                                statePc = 84;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            if (6 == var2_int) {
                                statePc = 81;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            if (7 == var2_int) {
                                statePc = 78;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            if (var2_int == -13) {
                                statePc = 77;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            if (13 == var2_int) {
                                statePc = 76;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            if (!((vh) this).field_s) {
                                statePc = 45;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            if (-15 == var2_int) {
                                statePc = 73;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            statePc = 45;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            if (!((vh) this).field_s) {
                                statePc = 48;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            if (15 == var2_int) {
                                statePc = 67;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            statePc = 48;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            if (((vh) this).field_j) {
                                statePc = 51;
                            } else {
                                statePc = 49;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            if (var2_int != 17) {
                                statePc = 51;
                            } else {
                                statePc = 50;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = (stateCaught_49 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            var12 = (Object[]) var9.field_g;
                            Object discarded$6 = Class.forName("ak").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((vh) this).field_h, new Object[5]);
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = (stateCaught_50 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            if (-17 != (var2_int ^ -1)) {
                                statePc = 66;
                            } else {
                                statePc = 52;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = (stateCaught_51 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            if (!field_k.startsWith("win")) {
                                statePc = 54;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof Exception ? 65 : (stateCaught_52 instanceof ThreadDeath ? 111 : 112));
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            statePc = 55;
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = (stateCaught_53 instanceof Exception ? 65 : (stateCaught_53 instanceof ThreadDeath ? 111 : 112));
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = (stateCaught_54 instanceof Exception ? 65 : (stateCaught_54 instanceof ThreadDeath ? 111 : 112));
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            var7 = (String) var9.field_g;
                            if (var7.startsWith("http://")) {
                                statePc = 58;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = (stateCaught_55 instanceof Exception ? 65 : (stateCaught_55 instanceof ThreadDeath ? 111 : 112));
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            if (var7.startsWith("https://")) {
                                statePc = 58;
                            } else {
                                statePc = 57;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = (stateCaught_56 instanceof Exception ? 65 : (stateCaught_56 instanceof ThreadDeath ? 111 : 112));
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = (stateCaught_57 instanceof Exception ? 65 : (stateCaught_57 instanceof ThreadDeath ? 111 : 112));
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            var4_ref = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            var5 = 0;
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = (stateCaught_58 instanceof Exception ? 65 : (stateCaught_58 instanceof ThreadDeath ? 111 : 112));
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            if (var7.length() <= var5) {
                                statePc = 63;
                            } else {
                                statePc = 60;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = (stateCaught_59 instanceof Exception ? 65 : (stateCaught_59 instanceof ThreadDeath ? 111 : 112));
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            if ((var4_ref.indexOf((int) var7.charAt(var5)) ^ -1) != 0) {
                                statePc = 62;
                            } else {
                                statePc = 61;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = (stateCaught_60 instanceof Exception ? 65 : (stateCaught_60 instanceof ThreadDeath ? 111 : 112));
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = (stateCaught_61 instanceof Exception ? 65 : (stateCaught_61 instanceof ThreadDeath ? 111 : 112));
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            var5++;
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = (stateCaught_62 instanceof Exception ? 65 : (stateCaught_62 instanceof ThreadDeath ? 111 : 112));
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            Process discarded$7 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var7 + "\"");
                            var9.field_e = null;
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = (stateCaught_63 instanceof Exception ? 65 : (stateCaught_63 instanceof ThreadDeath ? 111 : 112));
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = (stateCaught_64 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            var3_ref2 = (Exception) (Object) caughtException;
                            var9.field_e = (Object) (Object) var3_ref2;
                            throw (RuntimeException) (Object) var3_ref2;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = (stateCaught_65 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = (stateCaught_66 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            if (0 == var9.field_d) {
                                statePc = 69;
                            } else {
                                statePc = 68;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = (stateCaught_67 instanceof ThreadDeath ? 111 : 112);
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
                            statePc = (stateCaught_68 instanceof ThreadDeath ? 111 : 112);
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
                            statePc = (stateCaught_69 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            var3_int = stackIn_70_0;
                            var13 = (java.awt.Component) var9.field_g;
                            if (!((vh) this).field_j) {
                                statePc = 72;
                            } else {
                                statePc = 71;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = (stateCaught_70 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            ((vh) this).field_x.a(0, var3_int != 0, var13);
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = (stateCaught_71 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            Object discarded$8 = Class.forName("ak").getDeclaredMethod("showcursor", new Class[2]).invoke(((vh) this).field_h, new Object[2]);
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = (stateCaught_72 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            var3_int = var9.field_d;
                            var4 = var9.field_f;
                            if (((vh) this).field_j) {
                                statePc = 75;
                            } else {
                                statePc = 74;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = (stateCaught_73 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            Object discarded$9 = Class.forName("ak").getDeclaredMethod("movemouse", new Class[2]).invoke(((vh) this).field_h, new Object[2]);
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = (stateCaught_74 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            ((vh) this).field_x.a(var3_int, var4, (byte) 116);
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = (stateCaught_75 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            var3_ref3 = vh.a(0, field_w, (String) var9.field_g, "");
                            var9.field_e = (Object) (Object) var3_ref3;
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = (stateCaught_76 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            var3_ref3 = vh.a(0, field_w, (String) var9.field_g, field_v);
                            var9.field_e = (Object) (Object) var3_ref3;
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = (stateCaught_77 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            if (((vh) this).field_j) {
                                statePc = 80;
                            } else {
                                statePc = 79;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = (stateCaught_78 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            Object discarded$10 = Class.forName("bj").getMethod("exit", new Class[0]).invoke(((vh) this).field_t, new Object[0]);
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = (stateCaught_79 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            ((vh) this).field_u.a(-2147483648, (java.awt.Frame) var9.field_g);
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = (stateCaught_80 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            var14 = new java.awt.Frame("Jagex Full Screen");
                            var9.field_e = (Object) (Object) var14;
                            var14.setResizable(false);
                            if (!((vh) this).field_j) {
                                statePc = 83;
                            } else {
                                statePc = 82;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = (stateCaught_81 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            ((vh) this).field_u.a(var9.field_f >> 760852976, (byte) 122, var9.field_d >>> 169978736, 65535 & var9.field_d, var9.field_f & 65535, var14);
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = (stateCaught_82 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            Object discarded$11 = Class.forName("bj").getMethod("enter", new Class[5]).invoke(((vh) this).field_t, new Object[5]);
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = (stateCaught_83 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            if (((vh) this).field_j) {
                                statePc = 86;
                            } else {
                                statePc = 85;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = (stateCaught_84 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            var9.field_e = Class.forName("bj").getMethod("listmodes", new Class[0]).invoke(((vh) this).field_t, new Object[0]);
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = (stateCaught_85 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            var9.field_e = (Object) (Object) ((vh) this).field_u.a(true);
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = (stateCaught_86 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            if (d.a((byte) 84) >= field_d) {
                                statePc = 89;
                            } else {
                                statePc = 88;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = (stateCaught_87 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = (stateCaught_88 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            var9.field_e = (Object) (Object) java.net.InetAddress.getByName((String) var9.field_g).getAddress();
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = (stateCaught_89 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            if ((d.a((byte) 25) ^ -1L) <= (field_d ^ -1L)) {
                                statePc = 92;
                            } else {
                                statePc = 91;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = (stateCaught_90 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = (stateCaught_91 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            var15 = (var9.field_d >> 168063864 & 255) + "." + (255 & var9.field_d >> 721460240) + "." + ((65409 & var9.field_d) >> 951108808) + "." + (255 & var9.field_d);
                            var9.field_e = (Object) (Object) java.net.InetAddress.getByName(var15).getHostName();
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = (stateCaught_92 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = (stateCaught_93 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        try {
                            var8 = (java.awt.datatransfer.Transferable) var9.field_g;
                            var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var16.setContents(var8, (java.awt.datatransfer.ClipboardOwner) null);
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = (stateCaught_94 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        try {
                            var17 = (Object[]) var9.field_g;
                            if (((vh) this).field_s) {
                                statePc = 97;
                            } else {
                                statePc = 96;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_95) {
                            caughtException = stateCaught_95;
                            statePc = (stateCaught_95 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 96: {
                        try {
                            statePc = 100;
                            continue stateLoop;
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = (stateCaught_96 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            if (((Class) var17[0]).getClassLoader() == null) {
                                statePc = 99;
                            } else {
                                statePc = 98;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_97) {
                            caughtException = stateCaught_97;
                            statePc = (stateCaught_97 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 98: {
                        try {
                            statePc = 100;
                            continue stateLoop;
                        } catch (Throwable stateCaught_98) {
                            caughtException = stateCaught_98;
                            statePc = (stateCaught_98 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            throw new SecurityException();
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = (stateCaught_99 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 100: {
                        try {
                            var9.field_e = (Object) (Object) ((Class) var17[0]).getDeclaredField((String) var17[1]);
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_100) {
                            caughtException = stateCaught_100;
                            statePc = (stateCaught_100 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        try {
                            if (d.a((byte) 56) >= field_d) {
                                statePc = 103;
                            } else {
                                statePc = 102;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_101) {
                            caughtException = stateCaught_101;
                            statePc = (stateCaught_101 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 102: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_102) {
                            caughtException = stateCaught_102;
                            statePc = (stateCaught_102 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 103: {
                        try {
                            var9.field_e = (Object) (Object) new DataInputStream(((java.net.URL) var9.field_g).openStream());
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_103) {
                            caughtException = stateCaught_103;
                            statePc = (stateCaught_103 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 104: {
                        try {
                            var18 = new Thread((Runnable) var9.field_g);
                            var18.setDaemon(true);
                            var18.start();
                            var18.setPriority(var9.field_d);
                            var9.field_e = (Object) (Object) var18;
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_104) {
                            caughtException = stateCaught_104;
                            statePc = (stateCaught_104 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 105: {
                        try {
                            if (d.a((byte) 21) < field_d) {
                                statePc = 107;
                            } else {
                                statePc = 106;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_105) {
                            caughtException = stateCaught_105;
                            statePc = (stateCaught_105 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 106: {
                        try {
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_106) {
                            caughtException = stateCaught_106;
                            statePc = (stateCaught_106 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 107: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_107) {
                            caughtException = stateCaught_107;
                            statePc = (stateCaught_107 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 108: {
                        try {
                            var9.field_e = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var9.field_g), var9.field_d);
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_108) {
                            caughtException = stateCaught_108;
                            statePc = (stateCaught_108 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 109: {
                        try {
                            var9.field_a = 1;
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_109) {
                            caughtException = stateCaught_109;
                            statePc = (stateCaught_109 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 111: {
                        var2_ref = (ThreadDeath) (Object) caughtException;
                        throw var2_ref;
                    }
                    case 112: {
                        var2_ref2 = caughtException;
                        var9.field_a = 2;
                        statePc = 113;
                        continue stateLoop;
                    }
                    case 113: {
                        var2 = (Object) (Object) var9;
                        // monitorenter var9
                        statePc = 114;
                        continue stateLoop;
                    }
                    case 114: {
                        try {
                            ((Object) (Object) var9).notify();
                            // monitorexit var2
                            statePc = 0;
                            continue stateLoop;
                        } catch (Throwable stateCaught_114) {
                            caughtException = stateCaught_114;
                            statePc = 116;
                            continue stateLoop;
                        }
                    }
                    case 116: {
                        try {
                            var6 = caughtException;
                            // monitorexit var2
                            statePc = 117;
                            continue stateLoop;
                        } catch (Throwable stateCaught_116) {
                            caughtException = stateCaught_116;
                            statePc = 116;
                            continue stateLoop;
                        }
                    }
                    case 117: {
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

    final jh a(int param0, int param1, int param2, int param3, int param4) {
        if (param1 < 93) {
            return null;
        }
        return this.a(false, param2 + (param0 << -889433872), (Object) null, param4 + (param3 << -419438256), 6);
    }

    final jh a(boolean param0) {
        if (param0) {
            field_w = -25;
        }
        return this.a(false, 0, (Object) null, 0, 5);
    }

    private final static ri a(int param0, int param1, String param2, String param3) {
        try {
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            String var7 = null;
            Exception var8 = null;
            ri var8_ref = null;
            ri stackIn_12_0 = null;
            Throwable decompiledCaughtException = null;
            ri stackOut_11_0 = null;
            L0: {
              if ((param1 ^ -1) != -34) {
                if (34 == param1) {
                  var4 = "jagex_" + param3 + "_preferences" + param2 + "_wip.dat";
                  break L0;
                } else {
                  var4 = "jagex_" + param3 + "_preferences" + param2 + ".dat";
                  break L0;
                }
              } else {
                var4 = "jagex_" + param3 + "_preferences" + param2 + "_rc.dat";
                break L0;
              }
            }
            var5_array = new String[]{"c:/rscache/", "/rscache/", field_n, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
            var6 = param0;
            L1: while (true) {
              if (var5_array.length > var6) {
                L2: {
                  var7 = var5_array[var6];
                  if (-1 <= (var7.length() ^ -1)) {
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
                  var8_ref = new ri(new File(var7, var4), "rw", 10000L);
                  stackOut_11_0 = (ri) var8_ref;
                  stackIn_12_0 = stackOut_11_0;
                } catch (java.lang.Exception decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  return stackIn_12_0;
                }
                continue L1;
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

    private final jh a(int param0, String param1, boolean param2, byte param3) {
        if (param3 < 74) {
            field_b = null;
        }
        return this.a(false, 0, (Object) (Object) param1, param0, !param2 ? 1 : 22);
    }

    final jh a(byte param0, Runnable param1, int param2) {
        if (param0 > -47) {
            return null;
        }
        return this.a(false, 0, (Object) (Object) param1, param2, 2);
    }

    final jh a(java.net.URL param0, int param1) {
        if (param1 < 119) {
            ((vh) this).field_m = null;
        }
        return this.a(false, 0, (Object) (Object) param0, 0, 4);
    }

    final jh a(int param0, Class param1, String param2) {
        if (param0 != -8024) {
            Object var5 = null;
            jh discarded$0 = ((vh) this).a((String) null, (Class[]) null, (Class) null, -89);
        }
        return this.a(false, 0, (Object) (Object) new Object[2], 0, 9);
    }

    final jh a(String param0, Class[] param1, Class param2, int param3) {
        if (param3 != 3617) {
            field_k = null;
        }
        return this.a(false, 0, (Object) (Object) new Object[3], 0, 8);
    }

    final jh a(String param0, int param1, byte param2) {
        if (param2 != -20) {
            return null;
        }
        return this.a(param1, param0, false, (byte) 85);
    }

    final jh a(int param0, java.awt.Frame param1) {
        if (param0 != 7) {
            Object var4 = null;
            jh discarded$0 = this.a(69, (String) null, true, (byte) 10);
        }
        return this.a(false, 0, (Object) (Object) param1, 0, 7);
    }

    final boolean a(int param0) {
        if (param0 != 169978736) {
            return false;
        }
        if (!((vh) this).field_s) {
            return false;
        }
        if (!((vh) this).field_j) {
            return ((vh) this).field_t != null ? true : false;
        }
        return null != ((vh) this).field_u ? true : false;
    }

    final void b(int param0) {
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
                            ((vh) this).field_g = true;
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
                            if (param0 == -3) {
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
                            var4 = null;
                            jh discarded$1 = ((vh) this).a((java.net.URL) null, 108);
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
                            ((vh) this).field_e.join();
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
                        if (null != ((vh) this).field_m) {
                            statePc = 12;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        try {
                            ((vh) this).field_m.a(-1);
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
                        if (null != ((vh) this).field_i) {
                            statePc = 17;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 17: {
                        try {
                            ((vh) this).field_i.a(-1);
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
                        if (((vh) this).field_f == null) {
                            statePc = 29;
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
                        if (var2_int >= ((vh) this).field_f.length) {
                            statePc = 29;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        if (((vh) this).field_f[var2_int] != null) {
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
                            ((vh) this).field_f[var2_int].a(param0 ^ 2);
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
                        if (((vh) this).field_c != null) {
                            statePc = 31;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    }
                    case 31: {
                        try {
                            ((vh) this).field_c.a(param0 + 2);
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

    private final jh a(boolean param0, int param1, Object param2, int param3, int param4) {
        jh var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = new jh();
                    var6.field_d = param3;
                    var6.field_g = param2;
                    var6.field_f = param1;
                    var6.field_b = param4;
                    if (!param0) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_d = 103L;
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
                        if (null == ((vh) this).field_r) {
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
                        ((vh) this).field_r.field_c = var6;
                        ((vh) this).field_r = var6;
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
                        ((vh) this).field_o = var6;
                        ((vh) this).field_r = var6;
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

    vh(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        int var5_int = 0;
        ba var7 = null;
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
                    ((vh) this).field_m = null;
                    ((vh) this).field_i = null;
                    ((vh) this).field_j = false;
                    ((vh) this).field_r = null;
                    ((vh) this).field_s = false;
                    ((vh) this).field_g = false;
                    ((vh) this).field_c = null;
                    ((vh) this).field_o = null;
                    field_b = "1.1";
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
                    ((vh) this).field_s = stackIn_3_1 != 0;
                    field_v = param1;
                    field_p = "Unknown";
                    field_w = param0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        field_p = System.getProperty("java.vendor");
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
                    if (field_p.toLowerCase().indexOf("microsoft") == -1) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    ((vh) this).field_j = true;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    try {
                        field_l = System.getProperty("os.name");
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
                    field_l = "Unknown";
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    field_k = field_l.toLowerCase();
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
                        if (null == field_n) {
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
                        ((vh) this).field_a = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
                    if (((vh) this).field_j) {
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
                        field_q = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[1]);
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
                    fd.a(field_v, field_w, (byte) 125);
                    if (!((vh) this).field_s) {
                        statePc = 54;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    ((vh) this).field_c = new ri(fd.a("random.dat", field_w, (String) null, -93), "rw", 25L);
                    ((vh) this).field_m = new ri(fd.a("main_file_cache.dat2", (byte) 115), "rw", 314572800L);
                    ((vh) this).field_i = new ri(fd.a("main_file_cache.idx255", (byte) 115), "rw", 1048576L);
                    ((vh) this).field_f = new ri[param2];
                    var5_int = 0;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    if (param2 <= var5_int) {
                        statePc = 40;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    ((vh) this).field_f[var5_int] = new ri(fd.a("main_file_cache.idx" + var5_int, (byte) 115), "rw", 1048576L);
                    var5_int++;
                    statePc = 38;
                    continue stateLoop;
                }
                case 40: {
                    if (!((vh) this).field_j) {
                        statePc = 44;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    try {
                        Object discarded$7 = Class.forName("gl").newInstance();
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 43: {
                    var5_ref = caughtException;
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    try {
                        if (((vh) this).field_j) {
                            statePc = 46;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        ((vh) this).field_t = Class.forName("bj").newInstance();
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var7 = new ba();
                        ((vh) this).field_u = var7;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 48: {
                    var5_ref = caughtException;
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    try {
                        if (!((vh) this).field_j) {
                            statePc = 51;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        ((vh) this).field_x = new al();
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        ((vh) this).field_h = Class.forName("ak").newInstance();
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 53: {
                    var5_ref = caughtException;
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    ((vh) this).field_g = false;
                    ((vh) this).field_e = new Thread((Runnable) this);
                    ((vh) this).field_e.setPriority(10);
                    ((vh) this).field_e.setDaemon(true);
                    ((vh) this).field_e.start();
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 0L;
    }
}
