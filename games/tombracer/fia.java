/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fia implements Runnable {
    private Object field_i;
    boolean field_c;
    private static int field_d;
    ml field_x;
    private Thread field_m;
    private static volatile long field_o;
    ml[] field_h;
    private naa field_l;
    private boolean field_f;
    private static String field_s;
    static String field_j;
    private Object field_t;
    ml field_n;
    java.awt.EventQueue field_r;
    private sp field_w;
    private qj field_g;
    static java.lang.reflect.Method field_b;
    private static String field_u;
    ml field_q;
    static String field_v;
    boolean field_p;
    static String field_e;
    private naa field_k;
    private static String field_a;

    final naa a(java.net.URL param0, int param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        naa stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        naa stackOut_3_0 = null;
        try {
          if (param1 >= 69) {
            return (naa) (Object) stackIn_2_0;
          } else {
            stackOut_1_0 = null;
            stackIn_2_0 = stackOut_1_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_3_0 = this.a(0, 0, (byte) 104, (Object) (Object) param0, 4);
          stackIn_4_0 = stackOut_3_0;
        }
        return null;
    }

    public final void run() {
        try {
            naa var1 = null;
            RuntimeException var1_ref = null;
            Object var2 = null;
            ThreadDeath var2_ref = null;
            Throwable var2_ref2 = null;
            int var2_int = 0;
            InterruptedException var3 = null;
            Exception var3_ref = null;
            wra var3_ref2 = null;
            Thread var3_ref3 = null;
            Object[] var3_array = null;
            java.awt.datatransfer.Transferable var3_ref4 = null;
            int var3_int = 0;
            String var3_ref5 = null;
            Throwable var4 = null;
            java.awt.datatransfer.Clipboard var4_ref = null;
            int var4_int = 0;
            java.awt.Component var4_ref2 = null;
            int var5 = 0;
            Throwable var6 = null;
            int stackIn_98_0 = 0;
            int stackIn_105_0 = 0;
            String stackIn_124_0 = null;
            int stackIn_144_0 = 0;
            int stackOut_97_0 = 0;
            int stackOut_104_0 = 0;
            String stackOut_123_0 = null;
            int stackOut_141_0 = 0;
            int stackOut_143_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var2 = this;
                            // monitorenter this
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 193;
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            if (((fia) this).field_f) {
                                statePc = 4;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            // monitorexit var2
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        return;
                    }
                    case 6: {
                        try {
                            if (((fia) this).field_l != null) {
                                statePc = 9;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            var1 = ((fia) this).field_l;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            ((fia) this).field_l = ((fia) this).field_l.field_g;
                            if (null == ((fia) this).field_l) {
                                statePc = 13;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            ((fia) this).field_k = null;
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            this.wait();
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = (stateCaught_14 instanceof InterruptedException ? 16 : 19);
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            var3 = (InterruptedException) (Object) caughtException;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            // monitorexit var2
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 193;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            var4 = caughtException;
                            // monitorexit var2
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            throw (RuntimeException) (Object) var4;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 193;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            var2_int = var1.field_a;
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            if (-2 == (var2_int ^ -1)) {
                                statePc = 178;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (-23 == (var2_int ^ -1)) {
                                statePc = 172;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            if ((var2_int ^ -1) == -3) {
                                statePc = 171;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            if (4 != var2_int) {
                                statePc = 38;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if (field_o <= bva.b((byte) -107)) {
                                statePc = 37;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            var1.field_f = (Object) (Object) new DataInputStream(((java.net.URL) var1.field_c).openStream());
                            statePc = 183;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            if (8 != var2_int) {
                                statePc = 48;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            var3_array = (Object[]) var1.field_c;
                            statePc = 40;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            if (((fia) this).field_c) {
                                statePc = 43;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            statePc = 47;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            if (((Class) var3_array[0]).getClassLoader() == null) {
                                statePc = 46;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            statePc = 47;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            throw new SecurityException();
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            var1.field_f = (Object) (Object) ((Class) var3_array[0]).getDeclaredMethod((String) var3_array[1], (Class[]) var3_array[2]);
                            statePc = 183;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            if (9 == var2_int) {
                                statePc = 163;
                            } else {
                                statePc = 49;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            if (-19 != (var2_int ^ -1)) {
                                statePc = 53;
                            } else {
                                statePc = 50;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = (stateCaught_49 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            statePc = 52;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = (stateCaught_50 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            var3_ref3 = (Thread) (Object) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var1.field_f = (Object) (Object) ((java.awt.datatransfer.Clipboard) (Object) var3_ref3).getContents((Object) null);
                            statePc = 183;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            if (-20 == (var2_int ^ -1)) {
                                statePc = 162;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = (stateCaught_53 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            if (!((fia) this).field_c) {
                                statePc = 161;
                            } else {
                                statePc = 55;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = (stateCaught_54 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = (stateCaught_55 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            if (var2_int != 3) {
                                statePc = 67;
                            } else {
                                statePc = 58;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = (stateCaught_57 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = (stateCaught_58 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            if (bva.b((byte) -107) < field_o) {
                                statePc = 65;
                            } else {
                                statePc = 61;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = (stateCaught_60 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = (stateCaught_61 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            statePc = 66;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = (stateCaught_63 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = (stateCaught_65 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            var3_ref3 = (Thread) (Object) ((255 & var1.field_e >> 1821467352) + "." + ((16739670 & var1.field_e) >> -1640614736) + "." + (var1.field_e >> 1967332360 & 255) + "." + (255 & var1.field_e));
                            var1.field_f = (Object) (Object) java.net.InetAddress.getByName((String) (Object) var3_ref3).getHostName();
                            statePc = 183;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = (stateCaught_66 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            if ((var2_int ^ -1) != -22) {
                                statePc = 74;
                            } else {
                                statePc = 68;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = (stateCaught_67 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            if ((bva.b((byte) -107) ^ -1L) <= (field_o ^ -1L)) {
                                statePc = 73;
                            } else {
                                statePc = 69;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = (stateCaught_68 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            statePc = 71;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = (stateCaught_69 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = (stateCaught_71 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            var1.field_f = (Object) (Object) java.net.InetAddress.getByName((String) var1.field_c).getAddress();
                            statePc = 183;
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = (stateCaught_73 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            if (-6 == (var2_int ^ -1)) {
                                statePc = 157;
                            } else {
                                statePc = 75;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = (stateCaught_74 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            if (6 != var2_int) {
                                statePc = 84;
                            } else {
                                statePc = 76;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = (stateCaught_75 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            statePc = 78;
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = (stateCaught_76 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            var3_ref3 = (Thread) (Object) new java.awt.Frame("Jagex Full Screen");
                            statePc = 79;
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = (stateCaught_78 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            var1.field_f = (Object) (Object) var3_ref3;
                            ((java.awt.Frame) (Object) var3_ref3).setResizable(false);
                            if (((fia) this).field_p) {
                                statePc = 82;
                            } else {
                                statePc = 80;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = (stateCaught_79 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            Object discarded$6 = Class.forName("pj").getMethod("enter", new Class[5]).invoke(((fia) this).field_i, new Object[5]);
                            statePc = 83;
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = (stateCaught_80 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            ((fia) this).field_w.a((java.awt.Frame) (Object) var3_ref3, var1.field_e >>> 435914000, var1.field_d >> 1199163120, var1.field_d & 65535, var1.field_e & 65535, true);
                            statePc = 83;
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = (stateCaught_82 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            statePc = 183;
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = (stateCaught_83 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            if (-8 != (var2_int ^ -1)) {
                                statePc = 91;
                            } else {
                                statePc = 85;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = (stateCaught_84 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            if (!((fia) this).field_p) {
                                statePc = 90;
                            } else {
                                statePc = 86;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = (stateCaught_85 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            statePc = 88;
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = (stateCaught_86 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            ((fia) this).field_w.a((java.awt.Frame) var1.field_c, (byte) -108);
                            statePc = 183;
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = (stateCaught_88 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            Object discarded$7 = Class.forName("pj").getMethod("exit", new Class[0]).invoke(((fia) this).field_i, new Object[0]);
                            statePc = 183;
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = (stateCaught_90 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            if (var2_int == 12) {
                                statePc = 156;
                            } else {
                                statePc = 92;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = (stateCaught_91 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            if (13 != var2_int) {
                                statePc = 96;
                            } else {
                                statePc = 93;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = (stateCaught_92 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            statePc = 95;
                            continue stateLoop;
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = (stateCaught_93 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        try {
                            var3_ref3 = (Thread) (Object) fia.a(-20529, field_d, (String) var1.field_c, "");
                            var1.field_f = (Object) (Object) var3_ref3;
                            statePc = 183;
                            continue stateLoop;
                        } catch (Throwable stateCaught_95) {
                            caughtException = stateCaught_95;
                            statePc = (stateCaught_95 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 96: {
                        try {
                            if (!((fia) this).field_c) {
                                statePc = 101;
                            } else {
                                statePc = 97;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = (stateCaught_96 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            stackOut_97_0 = 14;
                            stackIn_98_0 = stackOut_97_0;
                            statePc = 98;
                            continue stateLoop;
                        } catch (Throwable stateCaught_97) {
                            caughtException = stateCaught_97;
                            statePc = (stateCaught_97 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 98: {
                        try {
                            if (stackIn_98_0 == var2_int) {
                                statePc = 150;
                            } else {
                                statePc = 99;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_98) {
                            caughtException = stateCaught_98;
                            statePc = (stateCaught_98 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            statePc = 101;
                            continue stateLoop;
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = (stateCaught_99 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        try {
                            if (!((fia) this).field_c) {
                                statePc = 108;
                            } else {
                                statePc = 102;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_101) {
                            caughtException = stateCaught_101;
                            statePc = (stateCaught_101 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 102: {
                        try {
                            statePc = 104;
                            continue stateLoop;
                        } catch (Throwable stateCaught_102) {
                            caughtException = stateCaught_102;
                            statePc = (stateCaught_102 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 104: {
                        try {
                            stackOut_104_0 = 15;
                            stackIn_105_0 = stackOut_104_0;
                            statePc = 105;
                            continue stateLoop;
                        } catch (Throwable stateCaught_104) {
                            caughtException = stateCaught_104;
                            statePc = (stateCaught_104 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 105: {
                        try {
                            if (stackIn_105_0 == var2_int) {
                                statePc = 140;
                            } else {
                                statePc = 106;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_105) {
                            caughtException = stateCaught_105;
                            statePc = (stateCaught_105 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 106: {
                        try {
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_106) {
                            caughtException = stateCaught_106;
                            statePc = (stateCaught_106 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 108: {
                        try {
                            if (((fia) this).field_p) {
                                statePc = 115;
                            } else {
                                statePc = 109;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_108) {
                            caughtException = stateCaught_108;
                            statePc = (stateCaught_108 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 109: {
                        try {
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_109) {
                            caughtException = stateCaught_109;
                            statePc = (stateCaught_109 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 111: {
                        try {
                            if (17 != var2_int) {
                                statePc = 115;
                            } else {
                                statePc = 112;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_111) {
                            caughtException = stateCaught_111;
                            statePc = (stateCaught_111 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 112: {
                        try {
                            statePc = 114;
                            continue stateLoop;
                        } catch (Throwable stateCaught_112) {
                            caughtException = stateCaught_112;
                            statePc = (stateCaught_112 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 114: {
                        try {
                            var3_array = (Object[]) var1.field_c;
                            Object discarded$8 = Class.forName("kfa").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((fia) this).field_t, new Object[5]);
                            statePc = 183;
                            continue stateLoop;
                        } catch (Throwable stateCaught_114) {
                            caughtException = stateCaught_114;
                            statePc = (stateCaught_114 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 115: {
                        try {
                            if (-17 == (var2_int ^ -1)) {
                                statePc = 118;
                            } else {
                                statePc = 116;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_115) {
                            caughtException = stateCaught_115;
                            statePc = (stateCaught_115 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 116: {
                        try {
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_116) {
                            caughtException = stateCaught_116;
                            statePc = (stateCaught_116 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 118: {
                        try {
                            if (field_j.startsWith("win")) {
                                statePc = 121;
                            } else {
                                statePc = 119;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_118) {
                            caughtException = stateCaught_118;
                            statePc = (stateCaught_118 instanceof Exception ? 139 : (stateCaught_118 instanceof ThreadDeath ? 185 : 186));
                            continue stateLoop;
                        }
                    }
                    case 119: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_119) {
                            caughtException = stateCaught_119;
                            statePc = (stateCaught_119 instanceof Exception ? 139 : (stateCaught_119 instanceof ThreadDeath ? 185 : 186));
                            continue stateLoop;
                        }
                    }
                    case 121: {
                        try {
                            var3_ref5 = (String) var1.field_c;
                            statePc = 122;
                            continue stateLoop;
                        } catch (Throwable stateCaught_121) {
                            caughtException = stateCaught_121;
                            statePc = (stateCaught_121 instanceof Exception ? 139 : (stateCaught_121 instanceof ThreadDeath ? 185 : 186));
                            continue stateLoop;
                        }
                    }
                    case 122: {
                        try {
                            if (var3_ref5.startsWith("http://")) {
                                statePc = 129;
                            } else {
                                statePc = 123;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_122) {
                            caughtException = stateCaught_122;
                            statePc = (stateCaught_122 instanceof Exception ? 139 : (stateCaught_122 instanceof ThreadDeath ? 185 : 186));
                            continue stateLoop;
                        }
                    }
                    case 123: {
                        try {
                            stackOut_123_0 = (String) var3_ref5;
                            stackIn_124_0 = stackOut_123_0;
                            statePc = 124;
                            continue stateLoop;
                        } catch (Throwable stateCaught_123) {
                            caughtException = stateCaught_123;
                            statePc = (stateCaught_123 instanceof Exception ? 139 : (stateCaught_123 instanceof ThreadDeath ? 185 : 186));
                            continue stateLoop;
                        }
                    }
                    case 124: {
                        try {
                            if (((String) (Object) stackIn_124_0).startsWith("https://")) {
                                statePc = 129;
                            } else {
                                statePc = 125;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_124) {
                            caughtException = stateCaught_124;
                            statePc = (stateCaught_124 instanceof Exception ? 139 : (stateCaught_124 instanceof ThreadDeath ? 185 : 186));
                            continue stateLoop;
                        }
                    }
                    case 125: {
                        try {
                            statePc = 127;
                            continue stateLoop;
                        } catch (Throwable stateCaught_125) {
                            caughtException = stateCaught_125;
                            statePc = (stateCaught_125 instanceof Exception ? 139 : (stateCaught_125 instanceof ThreadDeath ? 185 : 186));
                            continue stateLoop;
                        }
                    }
                    case 127: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_127) {
                            caughtException = stateCaught_127;
                            statePc = (stateCaught_127 instanceof Exception ? 139 : (stateCaught_127 instanceof ThreadDeath ? 185 : 186));
                            continue stateLoop;
                        }
                    }
                    case 129: {
                        try {
                            var4_ref = (java.awt.datatransfer.Clipboard) (Object) "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            var5 = 0;
                            statePc = 130;
                            continue stateLoop;
                        } catch (Throwable stateCaught_129) {
                            caughtException = stateCaught_129;
                            statePc = (stateCaught_129 instanceof Exception ? 139 : (stateCaught_129 instanceof ThreadDeath ? 185 : 186));
                            continue stateLoop;
                        }
                    }
                    case 130: {
                        try {
                            if ((var5 ^ -1) <= (var3_ref5.length() ^ -1)) {
                                statePc = 137;
                            } else {
                                statePc = 131;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_130) {
                            caughtException = stateCaught_130;
                            statePc = (stateCaught_130 instanceof Exception ? 139 : (stateCaught_130 instanceof ThreadDeath ? 185 : 186));
                            continue stateLoop;
                        }
                    }
                    case 131: {
                        try {
                            if (0 != (((String) (Object) var4_ref).indexOf((int) var3_ref5.charAt(var5)) ^ -1)) {
                                statePc = 136;
                            } else {
                                statePc = 132;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_131) {
                            caughtException = stateCaught_131;
                            statePc = (stateCaught_131 instanceof Exception ? 139 : (stateCaught_131 instanceof ThreadDeath ? 185 : 186));
                            continue stateLoop;
                        }
                    }
                    case 132: {
                        try {
                            statePc = 134;
                            continue stateLoop;
                        } catch (Throwable stateCaught_132) {
                            caughtException = stateCaught_132;
                            statePc = (stateCaught_132 instanceof Exception ? 139 : (stateCaught_132 instanceof ThreadDeath ? 185 : 186));
                            continue stateLoop;
                        }
                    }
                    case 134: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_134) {
                            caughtException = stateCaught_134;
                            statePc = (stateCaught_134 instanceof Exception ? 139 : (stateCaught_134 instanceof ThreadDeath ? 185 : 186));
                            continue stateLoop;
                        }
                    }
                    case 136: {
                        try {
                            var5++;
                            statePc = 130;
                            continue stateLoop;
                        } catch (Throwable stateCaught_136) {
                            caughtException = stateCaught_136;
                            statePc = (stateCaught_136 instanceof Exception ? 139 : (stateCaught_136 instanceof ThreadDeath ? 185 : 186));
                            continue stateLoop;
                        }
                    }
                    case 137: {
                        try {
                            Process discarded$9 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var3_ref5 + "\"");
                            var1.field_f = null;
                            statePc = 138;
                            continue stateLoop;
                        } catch (Throwable stateCaught_137) {
                            caughtException = stateCaught_137;
                            statePc = (stateCaught_137 instanceof Exception ? 139 : (stateCaught_137 instanceof ThreadDeath ? 185 : 186));
                            continue stateLoop;
                        }
                    }
                    case 138: {
                        try {
                            statePc = 183;
                            continue stateLoop;
                        } catch (Throwable stateCaught_138) {
                            caughtException = stateCaught_138;
                            statePc = (stateCaught_138 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 139: {
                        try {
                            var3_ref = (Exception) (Object) caughtException;
                            var1.field_f = (Object) (Object) var3_ref;
                            throw (RuntimeException) (Object) var3_ref;
                        } catch (Throwable stateCaught_139) {
                            caughtException = stateCaught_139;
                            statePc = (stateCaught_139 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 140: {
                        try {
                            if ((var1.field_e ^ -1) == -1) {
                                statePc = 143;
                            } else {
                                statePc = 141;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_140) {
                            caughtException = stateCaught_140;
                            statePc = (stateCaught_140 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 141: {
                        try {
                            stackOut_141_0 = 1;
                            stackIn_144_0 = stackOut_141_0;
                            statePc = 144;
                            continue stateLoop;
                        } catch (Throwable stateCaught_141) {
                            caughtException = stateCaught_141;
                            statePc = (stateCaught_141 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 143: {
                        try {
                            stackOut_143_0 = 0;
                            stackIn_144_0 = stackOut_143_0;
                            statePc = 144;
                            continue stateLoop;
                        } catch (Throwable stateCaught_143) {
                            caughtException = stateCaught_143;
                            statePc = (stateCaught_143 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 144: {
                        try {
                            var3_int = stackIn_144_0;
                            var4_ref2 = (java.awt.Component) var1.field_c;
                            statePc = 145;
                            continue stateLoop;
                        } catch (Throwable stateCaught_144) {
                            caughtException = stateCaught_144;
                            statePc = (stateCaught_144 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 145: {
                        try {
                            if (!((fia) this).field_p) {
                                statePc = 148;
                            } else {
                                statePc = 146;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_145) {
                            caughtException = stateCaught_145;
                            statePc = (stateCaught_145 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 146: {
                        try {
                            ((fia) this).field_g.a(var3_int != 0, -54, var4_ref2);
                            statePc = 149;
                            continue stateLoop;
                        } catch (Throwable stateCaught_146) {
                            caughtException = stateCaught_146;
                            statePc = (stateCaught_146 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 148: {
                        try {
                            Object discarded$10 = Class.forName("kfa").getDeclaredMethod("showcursor", new Class[2]).invoke(((fia) this).field_t, new Object[2]);
                            statePc = 149;
                            continue stateLoop;
                        } catch (Throwable stateCaught_148) {
                            caughtException = stateCaught_148;
                            statePc = (stateCaught_148 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 149: {
                        try {
                            statePc = 183;
                            continue stateLoop;
                        } catch (Throwable stateCaught_149) {
                            caughtException = stateCaught_149;
                            statePc = (stateCaught_149 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 150: {
                        try {
                            var3_int = var1.field_e;
                            var4_int = var1.field_d;
                            statePc = 151;
                            continue stateLoop;
                        } catch (Throwable stateCaught_150) {
                            caughtException = stateCaught_150;
                            statePc = (stateCaught_150 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 151: {
                        try {
                            if (((fia) this).field_p) {
                                statePc = 154;
                            } else {
                                statePc = 152;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_151) {
                            caughtException = stateCaught_151;
                            statePc = (stateCaught_151 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 152: {
                        try {
                            Object discarded$11 = Class.forName("kfa").getDeclaredMethod("movemouse", new Class[2]).invoke(((fia) this).field_t, new Object[2]);
                            statePc = 155;
                            continue stateLoop;
                        } catch (Throwable stateCaught_152) {
                            caughtException = stateCaught_152;
                            statePc = (stateCaught_152 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 154: {
                        try {
                            ((fia) this).field_g.a(0, var3_int, var4_int);
                            statePc = 155;
                            continue stateLoop;
                        } catch (Throwable stateCaught_154) {
                            caughtException = stateCaught_154;
                            statePc = (stateCaught_154 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 155: {
                        try {
                            statePc = 183;
                            continue stateLoop;
                        } catch (Throwable stateCaught_155) {
                            caughtException = stateCaught_155;
                            statePc = (stateCaught_155 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 156: {
                        try {
                            var3_ref3 = (Thread) (Object) fia.a(-20529, field_d, (String) var1.field_c, field_u);
                            var1.field_f = (Object) (Object) var3_ref3;
                            statePc = 183;
                            continue stateLoop;
                        } catch (Throwable stateCaught_156) {
                            caughtException = stateCaught_156;
                            statePc = (stateCaught_156 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 157: {
                        try {
                            if (!((fia) this).field_p) {
                                statePc = 160;
                            } else {
                                statePc = 158;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_157) {
                            caughtException = stateCaught_157;
                            statePc = (stateCaught_157 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 158: {
                        try {
                            var1.field_f = (Object) (Object) ((fia) this).field_w.a((byte) 52);
                            statePc = 183;
                            continue stateLoop;
                        } catch (Throwable stateCaught_158) {
                            caughtException = stateCaught_158;
                            statePc = (stateCaught_158 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 160: {
                        try {
                            var1.field_f = Class.forName("pj").getMethod("listmodes", new Class[0]).invoke(((fia) this).field_i, new Object[0]);
                            statePc = 183;
                            continue stateLoop;
                        } catch (Throwable stateCaught_160) {
                            caughtException = stateCaught_160;
                            statePc = (stateCaught_160 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 161: {
                        try {
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_161) {
                            caughtException = stateCaught_161;
                            statePc = (stateCaught_161 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 162: {
                        try {
                            var3_ref4 = (java.awt.datatransfer.Transferable) var1.field_c;
                            var4_ref = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var4_ref.setContents(var3_ref4, (java.awt.datatransfer.ClipboardOwner) null);
                            statePc = 183;
                            continue stateLoop;
                        } catch (Throwable stateCaught_162) {
                            caughtException = stateCaught_162;
                            statePc = (stateCaught_162 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 163: {
                        try {
                            var3_array = (Object[]) var1.field_c;
                            statePc = 164;
                            continue stateLoop;
                        } catch (Throwable stateCaught_163) {
                            caughtException = stateCaught_163;
                            statePc = (stateCaught_163 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 164: {
                        try {
                            if (((fia) this).field_c) {
                                statePc = 167;
                            } else {
                                statePc = 165;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_164) {
                            caughtException = stateCaught_164;
                            statePc = (stateCaught_164 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 165: {
                        try {
                            statePc = 170;
                            continue stateLoop;
                        } catch (Throwable stateCaught_165) {
                            caughtException = stateCaught_165;
                            statePc = (stateCaught_165 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 167: {
                        try {
                            if (((Class) var3_array[0]).getClassLoader() != null) {
                                statePc = 170;
                            } else {
                                statePc = 168;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_167) {
                            caughtException = stateCaught_167;
                            statePc = (stateCaught_167 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 168: {
                        try {
                            throw new SecurityException();
                        } catch (Throwable stateCaught_168) {
                            caughtException = stateCaught_168;
                            statePc = (stateCaught_168 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 170: {
                        try {
                            var1.field_f = (Object) (Object) ((Class) var3_array[0]).getDeclaredField((String) var3_array[1]);
                            statePc = 183;
                            continue stateLoop;
                        } catch (Throwable stateCaught_170) {
                            caughtException = stateCaught_170;
                            statePc = (stateCaught_170 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 171: {
                        try {
                            var3_ref3 = new Thread((Runnable) var1.field_c);
                            var3_ref3.setDaemon(true);
                            var3_ref3.start();
                            var3_ref3.setPriority(var1.field_e);
                            var1.field_f = (Object) (Object) var3_ref3;
                            statePc = 183;
                            continue stateLoop;
                        } catch (Throwable stateCaught_171) {
                            caughtException = stateCaught_171;
                            statePc = (stateCaught_171 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 172: {
                        try {
                            if (field_o <= bva.b((byte) -107)) {
                                statePc = 175;
                            } else {
                                statePc = 173;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_172) {
                            caughtException = stateCaught_172;
                            statePc = (stateCaught_172 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 173: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_173) {
                            caughtException = stateCaught_173;
                            statePc = (stateCaught_173 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 175: {
                        try {
                            var1.field_f = (Object) (Object) hg.a((String) var1.field_c, var1.field_e, false).a(25927);
                            statePc = 176;
                            continue stateLoop;
                        } catch (Throwable stateCaught_175) {
                            caughtException = stateCaught_175;
                            statePc = (stateCaught_175 instanceof wra ? 177 : (stateCaught_175 instanceof ThreadDeath ? 185 : 186));
                            continue stateLoop;
                        }
                    }
                    case 176: {
                        try {
                            statePc = 183;
                            continue stateLoop;
                        } catch (Throwable stateCaught_176) {
                            caughtException = stateCaught_176;
                            statePc = (stateCaught_176 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 177: {
                        try {
                            var3_ref2 = (wra) (Object) caughtException;
                            var1.field_f = (Object) (Object) var3_ref2.getMessage();
                            throw var3_ref2;
                        } catch (Throwable stateCaught_177) {
                            caughtException = stateCaught_177;
                            statePc = (stateCaught_177 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 178: {
                        try {
                            if (bva.b((byte) -107) < field_o) {
                                statePc = 181;
                            } else {
                                statePc = 179;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_178) {
                            caughtException = stateCaught_178;
                            statePc = (stateCaught_178 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 179: {
                        try {
                            statePc = 182;
                            continue stateLoop;
                        } catch (Throwable stateCaught_179) {
                            caughtException = stateCaught_179;
                            statePc = (stateCaught_179 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 181: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_181) {
                            caughtException = stateCaught_181;
                            statePc = (stateCaught_181 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 182: {
                        try {
                            var1.field_f = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var1.field_c), var1.field_e);
                            statePc = 183;
                            continue stateLoop;
                        } catch (Throwable stateCaught_182) {
                            caughtException = stateCaught_182;
                            statePc = (stateCaught_182 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 183: {
                        try {
                            var1.field_b = 1;
                            statePc = 184;
                            continue stateLoop;
                        } catch (Throwable stateCaught_183) {
                            caughtException = stateCaught_183;
                            statePc = (stateCaught_183 instanceof ThreadDeath ? 185 : 186);
                            continue stateLoop;
                        }
                    }
                    case 184: {
                        try {
                            statePc = 187;
                            continue stateLoop;
                        } catch (Throwable stateCaught_184) {
                            caughtException = stateCaught_184;
                            statePc = 193;
                            continue stateLoop;
                        }
                    }
                    case 185: {
                        try {
                            var2_ref = (ThreadDeath) (Object) caughtException;
                            throw var2_ref;
                        } catch (Throwable stateCaught_185) {
                            caughtException = stateCaught_185;
                            statePc = 193;
                            continue stateLoop;
                        }
                    }
                    case 186: {
                        try {
                            var2_ref2 = caughtException;
                            var1.field_b = 2;
                            statePc = 187;
                            continue stateLoop;
                        } catch (Throwable stateCaught_186) {
                            caughtException = stateCaught_186;
                            statePc = 193;
                            continue stateLoop;
                        }
                    }
                    case 187: {
                        try {
                            var2 = (Object) (Object) var1;
                            // monitorenter var1
                            statePc = 188;
                            continue stateLoop;
                        } catch (Throwable stateCaught_187) {
                            caughtException = stateCaught_187;
                            statePc = 193;
                            continue stateLoop;
                        }
                    }
                    case 188: {
                        try {
                            ((Object) (Object) var1).notify();
                            // monitorexit var2
                            statePc = 189;
                            continue stateLoop;
                        } catch (Throwable stateCaught_188) {
                            caughtException = stateCaught_188;
                            statePc = 190;
                            continue stateLoop;
                        }
                    }
                    case 189: {
                        try {
                            statePc = 192;
                            continue stateLoop;
                        } catch (Throwable stateCaught_189) {
                            caughtException = stateCaught_189;
                            statePc = 193;
                            continue stateLoop;
                        }
                    }
                    case 190: {
                        try {
                            var6 = caughtException;
                            // monitorexit var2
                            statePc = 191;
                            continue stateLoop;
                        } catch (Throwable stateCaught_190) {
                            caughtException = stateCaught_190;
                            statePc = 190;
                            continue stateLoop;
                        }
                    }
                    case 191: {
                        try {
                            throw (RuntimeException) (Object) var6;
                        } catch (Throwable stateCaught_191) {
                            caughtException = stateCaught_191;
                            statePc = 193;
                            continue stateLoop;
                        }
                    }
                    case 192: {
                        try {
                            statePc = 0;
                            continue stateLoop;
                        } catch (Throwable stateCaught_192) {
                            caughtException = stateCaught_192;
                            statePc = 193;
                            continue stateLoop;
                        }
                    }
                    case 193: {
                        var1_ref = (RuntimeException) (Object) caughtException;
                        throw var1_ref;
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

    final naa a(int param0, String param1, int param2) {
        RuntimeException var4 = null;
        naa stackIn_5_0 = null;
        RuntimeException decompiledCaughtException = null;
        naa stackOut_4_0 = null;
        try {
          try {
            L0: {
              if (param0 == -24818) {
                break L0;
              } else {
                naa discarded$2 = ((fia) this).a((byte) 92, (java.awt.datatransfer.Transferable) null);
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_4_0 = this.a(param0 + 24819, param1, false, param2);
          stackIn_5_0 = stackOut_4_0;
        }
        return null;
    }

    final naa a(int param0, String param1, Class param2) {
        RuntimeException var4 = null;
        naa stackIn_5_0 = null;
        RuntimeException decompiledCaughtException = null;
        naa stackOut_4_0 = null;
        try {
          try {
            L0: {
              if (param0 == 10355) {
                break L0;
              } else {
                ml discarded$2 = fia.a(-73, 85, (String) null, (String) null);
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_4_0 = this.a(0, 0, (byte) 104, (Object) (Object) new Object[2], 9);
          stackIn_5_0 = stackOut_4_0;
        }
        return null;
    }

    private final naa a(int param0, String param1, boolean param2, int param3) {
        RuntimeException var5 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        String stackIn_5_4 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        String stackIn_7_4 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        String stackIn_8_4 = null;
        int stackIn_8_5 = 0;
        naa stackIn_9_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        String stackOut_4_4 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        String stackOut_5_4 = null;
        int stackOut_5_5 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        String stackOut_7_4 = null;
        int stackOut_7_5 = 0;
        naa stackOut_8_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0 == 1) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        ml discarded$2 = fia.a(-120, 43, (String) null, (String) null);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = this;
                        stackOut_4_1 = param3;
                        stackOut_4_2 = 0;
                        stackOut_4_3 = 104;
                        stackOut_4_4 = (String) param1;
                        stackIn_7_0 = stackOut_4_0;
                        stackIn_7_1 = stackOut_4_1;
                        stackIn_7_2 = stackOut_4_2;
                        stackIn_7_3 = stackOut_4_3;
                        stackIn_7_4 = stackOut_4_4;
                        stackIn_5_0 = stackOut_4_0;
                        stackIn_5_1 = stackOut_4_1;
                        stackIn_5_2 = stackOut_4_2;
                        stackIn_5_3 = stackOut_4_3;
                        stackIn_5_4 = stackOut_4_4;
                        if (!param2) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = this;
                        stackOut_5_1 = stackIn_5_1;
                        stackOut_5_2 = stackIn_5_2;
                        stackOut_5_3 = stackIn_5_3;
                        stackOut_5_4 = (String) (Object) stackIn_5_4;
                        stackOut_5_5 = 22;
                        stackIn_8_0 = stackOut_5_0;
                        stackIn_8_1 = stackOut_5_1;
                        stackIn_8_2 = stackOut_5_2;
                        stackIn_8_3 = stackOut_5_3;
                        stackIn_8_4 = stackOut_5_4;
                        stackIn_8_5 = stackOut_5_5;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = this;
                        stackOut_7_1 = stackIn_7_1;
                        stackOut_7_2 = stackIn_7_2;
                        stackOut_7_3 = stackIn_7_3;
                        stackOut_7_4 = (String) (Object) stackIn_7_4;
                        stackOut_7_5 = 1;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        stackIn_8_2 = stackOut_7_2;
                        stackIn_8_3 = stackOut_7_3;
                        stackIn_8_4 = stackOut_7_4;
                        stackIn_8_5 = stackOut_7_5;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = this.a(stackIn_8_1, stackIn_8_2, (byte) stackIn_8_3, (Object) (Object) stackIn_8_4, stackIn_8_5);
                        stackIn_9_0 = stackOut_8_0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return stackIn_9_0;
                }
                case 10: {
                    var5 = (RuntimeException) (Object) caughtException;
                    throw var5;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final naa a(int param0, Class[] param1, String param2, Class param3) {
        RuntimeException var5 = null;
        naa stackIn_5_0 = null;
        RuntimeException decompiledCaughtException = null;
        naa stackOut_4_0 = null;
        try {
          try {
            L0: {
              if (param0 == 26868) {
                break L0;
              } else {
                ((fia) this).field_i = null;
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_4_0 = this.a(0, 0, (byte) 104, (Object) (Object) new Object[3], 8);
          stackIn_5_0 = stackOut_4_0;
        }
        return null;
    }

    final boolean a(byte param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_20_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (!((fia) this).field_c) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = 0;
                        stackIn_4_0 = stackOut_3_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return stackIn_4_0 != 0;
                }
                case 5: {
                    try {
                        if (param0 == 69) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        ((fia) this).field_r = null;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (!((fia) this).field_p) {
                            statePc = 17;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (((fia) this).field_w == null) {
                            statePc = 15;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = 1;
                        stackIn_16_0 = stackOut_13_0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackOut_15_0 = 0;
                        stackIn_16_0 = stackOut_15_0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 16: {
                    return stackIn_16_0 != 0;
                }
                case 17: {
                    try {
                        if (null == ((fia) this).field_i) {
                            statePc = 20;
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
                        stackOut_18_0 = 1;
                        stackIn_21_0 = stackOut_18_0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackOut_20_0 = 0;
                        stackIn_21_0 = stackOut_20_0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 21: {
                    return stackIn_21_0 != 0;
                }
                case 22: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw var2;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void b(byte param0) {
        try {
            Object var2 = null;
            InterruptedException var2_ref = null;
            IOException var2_ref2 = null;
            RuntimeException var2_ref3 = null;
            int var2_int = 0;
            Throwable var3 = null;
            IOException var3_ref = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var2 = this;
                            // monitorenter this
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            ((fia) this).field_f = true;
                            this.notifyAll();
                            // monitorexit var2
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 3;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 44;
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
                        try {
                            throw (RuntimeException) (Object) var3;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (param0 == 59) {
                                statePc = 9;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = (stateCaught_5 instanceof InterruptedException ? 8 : 44);
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            naa discarded$1 = ((fia) this).a((java.awt.Frame) null, 58);
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = (stateCaught_6 instanceof InterruptedException ? 8 : 44);
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            ((fia) this).field_m.join();
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = (stateCaught_9 instanceof InterruptedException ? 11 : 44);
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            var2_ref = (InterruptedException) (Object) caughtException;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            if (null != ((fia) this).field_n) {
                                statePc = 15;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = (stateCaught_12 instanceof InterruptedException ? 14 : 44);
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = (stateCaught_13 instanceof InterruptedException ? 14 : 44);
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            ((fia) this).field_n.b((byte) -112);
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof IOException ? 17 : 44);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            var2_ref2 = (IOException) (Object) caughtException;
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (null != ((fia) this).field_q) {
                                statePc = 21;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof InterruptedException ? 20 : 44);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof InterruptedException ? 20 : 44);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            ((fia) this).field_q.b((byte) -77);
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof IOException ? 23 : 44);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            var2_ref2 = (IOException) (Object) caughtException;
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if (((fia) this).field_h != null) {
                                statePc = 27;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof InterruptedException ? 26 : 44);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof InterruptedException ? 26 : 44);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var2_int = 0;
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            if ((var2_int ^ -1) <= (((fia) this).field_h.length ^ -1)) {
                                statePc = 37;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof InterruptedException ? 31 : 44);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            if (null == ((fia) this).field_h[var2_int]) {
                                statePc = 36;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof InterruptedException ? 31 : 34);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            ((fia) this).field_h[var2_int].b((byte) -101);
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof IOException ? 35 : 34);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            var3_ref = (IOException) (Object) caughtException;
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            var2_int++;
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            if (((fia) this).field_x != null) {
                                statePc = 40;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof InterruptedException ? 39 : 44);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            statePc = 45;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof InterruptedException ? 39 : 44);
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            ((fia) this).field_x.b((byte) -101);
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof IOException ? 42 : 44);
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            statePc = 45;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            var2_ref2 = (IOException) (Object) caughtException;
                            statePc = 45;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        var2_ref3 = (RuntimeException) (Object) caughtException;
                        throw var2_ref3;
                    }
                    case 45: {
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

    private final static ml a(int param0, int param1, String param2, String param3) {
        try {
            RuntimeException var4 = null;
            String var4_ref = null;
            String[] var5 = null;
            int var6 = 0;
            String var7 = null;
            Exception var8 = null;
            ml var8_ref = null;
            Object stackIn_7_0 = null;
            ml stackIn_16_0 = null;
            Object stackIn_20_0 = null;
            Object stackOut_6_0 = null;
            ml stackOut_15_0 = null;
            Object stackOut_19_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            if (33 != param1) {
                                statePc = 2;
                            } else {
                                statePc = 1;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            var4_ref = "jagex_" + param3 + "_preferences" + param2 + "_rc.dat";
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if ((param1 ^ -1) == -35) {
                                statePc = 4;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var4_ref = "jagex_" + param3 + "_preferences" + param2 + ".dat";
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            var4_ref = "jagex_" + param3 + "_preferences" + param2 + "_wip.dat";
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var5 = new String[]{"c:/rscache/", "/rscache/", field_a, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
                            if (param0 == -20529) {
                                statePc = 8;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            stackOut_6_0 = null;
                            stackIn_7_0 = stackOut_6_0;
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        return (ml) (Object) stackIn_7_0;
                    }
                    case 8: {
                        try {
                            var6 = 0;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            if ((var6 ^ -1) <= (var5.length ^ -1)) {
                                statePc = 19;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            var7 = var5[var6];
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
                            if (-1 <= (var7.length() ^ -1)) {
                                statePc = 15;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = (stateCaught_11 instanceof Exception ? 14 : 21);
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            if (!new File(var7).exists()) {
                                statePc = 18;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = (stateCaught_12 instanceof Exception ? 14 : 21);
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
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            var8_ref = new ml(new File(var7, var4_ref), "rw", 10000L);
                            stackOut_15_0 = (ml) var8_ref;
                            stackIn_16_0 = stackOut_15_0;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof Exception ? 17 : 21);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        return stackIn_16_0;
                    }
                    case 17: {
                        try {
                            var8 = (Exception) (Object) caughtException;
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            var6++;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            stackOut_19_0 = null;
                            stackIn_20_0 = stackOut_19_0;
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        return (ml) (Object) stackIn_20_0;
                    }
                    case 21: {
                        var4 = (RuntimeException) (Object) caughtException;
                        throw var4;
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

    final naa a(int param0) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        naa stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        naa stackOut_3_0 = null;
        try {
          if (param0 <= -87) {
            return (naa) (Object) stackIn_2_0;
          } else {
            stackOut_1_0 = null;
            stackIn_2_0 = stackOut_1_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_3_0 = this.a(0, 0, (byte) 104, (Object) null, 5);
          stackIn_4_0 = stackOut_3_0;
        }
        return null;
    }

    final naa a(java.awt.Frame param0, int param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        naa stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        naa stackOut_3_0 = null;
        try {
          if (param1 == 18885) {
            return (naa) (Object) stackIn_2_0;
          } else {
            stackOut_1_0 = null;
            stackIn_2_0 = stackOut_1_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_3_0 = this.a(0, 0, (byte) 104, (Object) (Object) param0, 7);
          stackIn_4_0 = stackOut_3_0;
        }
        return null;
    }

    private final naa a(int param0, int param1, byte param2, Object param3, int param4) {
        naa var6 = null;
        RuntimeException var6_ref = null;
        Object var7 = null;
        Throwable var8 = null;
        Object stackIn_2_0 = null;
        naa stackIn_12_0 = null;
        Object stackOut_1_0 = null;
        naa stackOut_11_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param2 == 104) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        stackOut_1_0 = null;
                        stackIn_2_0 = stackOut_1_0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return (naa) (Object) stackIn_2_0;
                }
                case 3: {
                    try {
                        var6 = new naa();
                        var6.field_e = param0;
                        var6.field_d = param1;
                        var6.field_a = param4;
                        var6.field_c = param3;
                        var7 = this;
                        // monitorenter this
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (null != ((fia) this).field_k) {
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
                        ((fia) this).field_l = var6;
                        ((fia) this).field_k = var6;
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
                        ((fia) this).field_k.field_g = var6;
                        ((fia) this).field_k = var6;
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
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 13;
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
                    try {
                        throw (RuntimeException) (Object) var8;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackOut_11_0 = (naa) var6;
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
                    var6_ref = (RuntimeException) (Object) caughtException;
                    throw var6_ref;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final naa a(int param0, int param1, int param2, byte param3, int param4) {
        RuntimeException var6 = null;
        Object stackIn_2_0 = null;
        naa stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        naa stackOut_3_0 = null;
        try {
          if (param3 == 66) {
            return (naa) (Object) stackIn_2_0;
          } else {
            stackOut_1_0 = null;
            stackIn_2_0 = stackOut_1_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_3_0 = this.a(param2 + (param4 << -711272432), param1 + (param0 << -1645972240), (byte) 104, (Object) null, 6);
          stackIn_4_0 = stackOut_3_0;
        }
        return null;
    }

    final naa a(Runnable param0, int param1, int param2) {
        RuntimeException var4 = null;
        naa stackIn_5_0 = null;
        RuntimeException decompiledCaughtException = null;
        naa stackOut_4_0 = null;
        try {
          try {
            L0: {
              if (param1 == 425) {
                break L0;
              } else {
                ((fia) this).field_h = null;
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_4_0 = this.a(param2, 0, (byte) 104, (Object) (Object) param0, 2);
          stackIn_5_0 = stackOut_4_0;
        }
        return null;
    }

    final boolean a(byte[] param0, File param1, boolean param2) {
        FileOutputStream var4 = null;
        IOException var4_ref = null;
        RuntimeException var4_ref2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var4 = new FileOutputStream(param1);
                        var4.write(param0, 0, param0.length);
                        if (param2) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = (stateCaught_0 instanceof IOException ? 5 : 6);
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        stackOut_1_0 = 0;
                        stackIn_2_0 = stackOut_1_0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = (stateCaught_1 instanceof IOException ? 5 : 6);
                        continue stateLoop;
                    }
                }
                case 2: {
                    return stackIn_2_0 != 0;
                }
                case 3: {
                    try {
                        var4.close();
                        stackOut_3_0 = 1;
                        stackIn_4_0 = stackOut_3_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = (stateCaught_3 instanceof IOException ? 5 : 6);
                        continue stateLoop;
                    }
                }
                case 4: {
                    return stackIn_4_0 != 0;
                }
                case 5: {
                    try {
                        var4_ref = (IOException) (Object) caughtException;
                        throw new RuntimeException();
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    var4_ref2 = (RuntimeException) (Object) caughtException;
                    throw var4_ref2;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final naa a(byte param0, java.awt.datatransfer.Transferable param1) {
        RuntimeException var3 = null;
        naa stackIn_5_0 = null;
        RuntimeException decompiledCaughtException = null;
        naa stackOut_4_0 = null;
        try {
          try {
            L0: {
              if (param0 > 56) {
                break L0;
              } else {
                naa discarded$2 = ((fia) this).a(96);
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_4_0 = this.a(0, 0, (byte) 104, (Object) (Object) param1, 19);
          stackIn_5_0 = stackOut_4_0;
        }
        return null;
    }

    final naa b(int param0) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        naa stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        naa stackOut_3_0 = null;
        try {
          if (param0 > 104) {
            return (naa) (Object) stackIn_2_0;
          } else {
            stackOut_1_0 = null;
            stackIn_2_0 = stackOut_1_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_3_0 = this.a(0, 0, (byte) 104, (Object) null, 18);
          stackIn_4_0 = stackOut_3_0;
        }
        return null;
    }

    fia(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        RuntimeException var5_ref2 = null;
        int var5_int = 0;
        ThreadGroup var5_ref3 = null;
        ThreadGroup var6 = null;
        Thread[] var7 = null;
        int var8 = 0;
        Object stackIn_64_0 = null;
        Thread[] stackIn_78_0 = null;
        Object stackOut_63_0 = null;
        Thread[] stackOut_77_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    ((fia) this).field_c = false;
                    ((fia) this).field_x = null;
                    ((fia) this).field_l = null;
                    ((fia) this).field_n = null;
                    ((fia) this).field_f = false;
                    ((fia) this).field_p = false;
                    ((fia) this).field_k = null;
                    ((fia) this).field_q = null;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        field_d = param0;
                        field_u = param1;
                        field_e = "Unknown";
                        field_v = "1.1";
                        ((fia) this).field_c = param3;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_e = System.getProperty("java.vendor");
                        field_v = System.getProperty("java.version");
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = (stateCaught_2 instanceof Exception ? 4 : 87);
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var5 = (Exception) (Object) caughtException;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (-1 == field_e.toLowerCase().indexOf("microsoft")) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = (stateCaught_5 instanceof Exception ? 8 : 87);
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        ((fia) this).field_p = true;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = (stateCaught_6 instanceof Exception ? 8 : 87);
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        field_s = System.getProperty("os.name");
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = (stateCaught_9 instanceof Exception ? 11 : 87);
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var5 = (Exception) (Object) caughtException;
                        field_s = "Unknown";
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        field_j = field_s.toLowerCase();
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        String discarded$5 = System.getProperty("os.arch").toLowerCase();
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = (stateCaught_13 instanceof Exception ? 15 : 87);
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var5 = (Exception) (Object) caughtException;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        String discarded$6 = System.getProperty("os.version").toLowerCase();
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = (stateCaught_16 instanceof Exception ? 18 : 87);
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var5 = (Exception) (Object) caughtException;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        field_a = System.getProperty("user.home");
                        if (field_a != null) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = (stateCaught_19 instanceof Exception ? 24 : 87);
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = (stateCaught_20 instanceof Exception ? 24 : 87);
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        field_a = field_a + "/";
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = (stateCaught_22 instanceof Exception ? 24 : 87);
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var5 = (Exception) (Object) caughtException;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (null != field_a) {
                            statePc = 29;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = (stateCaught_25 instanceof Exception ? 28 : 87);
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        field_a = "~/";
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = (stateCaught_26 instanceof Exception ? 28 : 87);
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        ((fia) this).field_r = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var5_ref = caughtException;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (!((fia) this).field_p) {
                            statePc = 35;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = (stateCaught_32 instanceof Exception ? 34 : 87);
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = (stateCaught_33 instanceof Exception ? 34 : 87);
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        java.lang.reflect.Method discarded$7 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[1]);
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = (stateCaught_35 instanceof Exception ? 37 : 87);
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var5 = (Exception) (Object) caughtException;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        field_b = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[1]);
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = (stateCaught_38 instanceof Exception ? 40 : 87);
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var5 = (Exception) (Object) caughtException;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        iba.a(field_d, -70, field_u);
                        if (!((fia) this).field_c) {
                            statePc = 62;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        ((fia) this).field_x = new ml(iba.a((String) null, "random.dat", 0, field_d), "rw", 25L);
                        ((fia) this).field_n = new ml(iba.a("main_file_cache.dat2", (byte) -71), "rw", 314572800L);
                        ((fia) this).field_q = new ml(iba.a("main_file_cache.idx255", (byte) -123), "rw", 1048576L);
                        ((fia) this).field_h = new ml[param2];
                        var5_int = 0;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if ((param2 ^ -1) >= (var5_int ^ -1)) {
                            statePc = 46;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = (stateCaught_43 instanceof Exception ? 45 : 87);
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        ((fia) this).field_h[var5_int] = new ml(iba.a("main_file_cache.idx" + var5_int, (byte) -108), "rw", 1048576L);
                        var5_int++;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = (stateCaught_44 instanceof Exception ? 45 : 87);
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (!((fia) this).field_p) {
                            statePc = 50;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        Object discarded$8 = Class.forName("nva").newInstance();
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var5_ref = caughtException;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (!((fia) this).field_p) {
                            statePc = 53;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        ((fia) this).field_w = new sp();
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        ((fia) this).field_i = Class.forName("pj").newInstance();
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var5_ref = caughtException;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (!((fia) this).field_p) {
                            statePc = 59;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        ((fia) this).field_g = new qj();
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        ((fia) this).field_t = Class.forName("kfa").newInstance();
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var5_ref = caughtException;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (!((fia) this).field_c) {
                            statePc = 85;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = (stateCaught_62 instanceof Exception ? 66 : 87);
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        stackOut_63_0 = this;
                        stackIn_64_0 = stackOut_63_0;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = (stateCaught_63 instanceof Exception ? 66 : 87);
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (!((fia) this).field_p) {
                            statePc = 69;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = (stateCaught_64 instanceof Exception ? 68 : 87);
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = (stateCaught_65 instanceof Exception ? 68 : 87);
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = (stateCaught_66 instanceof Exception ? 68 : 87);
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = (stateCaught_67 instanceof Exception ? 68 : 87);
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        var5_ref3 = Thread.currentThread().getThreadGroup();
                        var6 = var5_ref3.getParent();
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if (var6 == null) {
                            statePc = 72;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        var5_ref3 = var6;
                        var6 = var5_ref3.getParent();
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        var7 = new Thread[1000];
                        int discarded$9 = var5_ref3.enumerate(var7);
                        var8 = 0;
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if ((var7.length ^ -1) >= (var8 ^ -1)) {
                            statePc = 85;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = (stateCaught_73 instanceof Exception ? 76 : 87);
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (null == var7[var8]) {
                            statePc = 84;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = (stateCaught_74 instanceof Exception ? 80 : 87);
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = (stateCaught_75 instanceof Exception ? 80 : 87);
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = (stateCaught_76 instanceof Exception ? 80 : 87);
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        stackOut_77_0 = (Thread[]) var7;
                        stackIn_78_0 = stackOut_77_0;
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = (stateCaught_77 instanceof Exception ? 80 : 87);
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if (((Thread) (Object) stackIn_78_0[var8]).getName().startsWith("AWT")) {
                            statePc = 83;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = (stateCaught_78 instanceof Exception ? 82 : 87);
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = (stateCaught_79 instanceof Exception ? 82 : 87);
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = (stateCaught_80 instanceof Exception ? 82 : 87);
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = (stateCaught_81 instanceof Exception ? 82 : 87);
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        var7[var8].setPriority(1);
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        var8++;
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        ((fia) this).field_f = false;
                        ((fia) this).field_m = new Thread((Runnable) this);
                        ((fia) this).field_m.setPriority(10);
                        ((fia) this).field_m.setDaemon(true);
                        ((fia) this).field_m.start();
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 87: {
                    var5_ref2 = (RuntimeException) (Object) caughtException;
                    throw var5_ref2;
                }
                case 88: {
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 0L;
    }
}
