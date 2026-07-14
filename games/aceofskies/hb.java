/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hb {
    static int field_b;
    static cc field_a;

    final static void a(dl param0, int param1) {
        try {
            RuntimeException var2 = null;
            bb var2_ref = null;
            int var3 = 0;
            int var4 = 0;
            int var5 = 0;
            ClassNotFoundException var6 = null;
            InvalidClassException var6_ref = null;
            StreamCorruptedException var6_ref2 = null;
            OptionalDataException var6_ref3 = null;
            IllegalAccessException var6_ref4 = null;
            IllegalArgumentException var6_ref5 = null;
            java.lang.reflect.InvocationTargetException var6_ref6 = null;
            SecurityException var6_ref7 = null;
            IOException var6_ref8 = null;
            NullPointerException var6_ref9 = null;
            Exception var6_ref10 = null;
            Throwable var6_ref11 = null;
            int var6_int = 0;
            java.lang.reflect.Field var7 = null;
            java.lang.reflect.Method var7_ref = null;
            int var8_int = 0;
            byte[][] var8 = null;
            Object[] var9 = null;
            int var10_int = 0;
            Object var10 = null;
            ObjectInputStream var11 = null;
            int var12 = 0;
            Object stackIn_6_0 = null;
            Object stackIn_7_0 = null;
            bb stackIn_7_1 = null;
            Object stackIn_37_0 = null;
            Object stackIn_39_0 = null;
            int stackIn_43_0 = 0;
            int stackIn_44_0 = 0;
            bb stackIn_44_1 = null;
            int stackIn_111_0 = 0;
            RuntimeException stackIn_115_0 = null;
            StringBuilder stackIn_115_1 = null;
            RuntimeException stackIn_117_0 = null;
            StringBuilder stackIn_117_1 = null;
            RuntimeException stackIn_118_0 = null;
            StringBuilder stackIn_118_1 = null;
            String stackIn_118_2 = null;
            Object stackOut_5_0 = null;
            Object stackOut_6_0 = null;
            bb stackOut_6_1 = null;
            Object stackOut_36_0 = null;
            Object stackOut_37_0 = null;
            int stackOut_42_0 = 0;
            int stackOut_43_0 = 0;
            bb stackOut_43_1 = null;
            int stackOut_110_0 = 0;
            RuntimeException stackOut_114_0 = null;
            StringBuilder stackOut_114_1 = null;
            RuntimeException stackOut_115_0 = null;
            StringBuilder stackOut_115_1 = null;
            String stackOut_115_2 = null;
            RuntimeException stackOut_117_0 = null;
            StringBuilder stackOut_117_1 = null;
            String stackOut_117_2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var12 = AceOfSkies.field_G ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var2_ref = (bb) av.field_c.d(param1 + 268410723);
                            if (var2_ref != null) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 113;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        return;
                    }
                    case 3: {
                        try {
                            var3 = 0;
                            var4 = 0;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 113;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if ((var4 ^ -1) <= (var2_ref.field_g ^ -1)) {
                                statePc = 30;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 113;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            stackOut_5_0 = null;
                            stackIn_39_0 = stackOut_5_0;
                            stackIn_6_0 = stackOut_5_0;
                            if (var12 != 0) {
                                statePc = 39;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = (stateCaught_5 instanceof ClassNotFoundException ? 9 : 113);
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            stackOut_6_0 = (Object) (Object) stackIn_6_0;
                            stackOut_6_1 = (bb) var2_ref;
                            stackIn_7_0 = stackOut_6_0;
                            stackIn_7_1 = stackOut_6_1;
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = (stateCaught_6 instanceof ClassNotFoundException ? 9 : 113);
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if ((Object) (Object) stackIn_7_0 == (Object) (Object) ((bb) (Object) stackIn_7_1).field_f[var4]) {
                                statePc = 18;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = (stateCaught_7 instanceof ClassNotFoundException ? 12 : 113);
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = (stateCaught_8 instanceof ClassNotFoundException ? 12 : 113);
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = (stateCaught_9 instanceof ClassNotFoundException ? 12 : 113);
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            if ((var2_ref.field_f[var4].field_a ^ -1) == -3) {
                                statePc = 15;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = (stateCaught_10 instanceof ClassNotFoundException ? 14 : 113);
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = (stateCaught_11 instanceof ClassNotFoundException ? 14 : 113);
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = (stateCaught_12 instanceof ClassNotFoundException ? 14 : 113);
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = (stateCaught_13 instanceof ClassNotFoundException ? 14 : 113);
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 113;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            var2_ref.field_e[var4] = -5;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 113;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if ((var2_ref.field_f[var4].field_a ^ -1) != -1) {
                                statePc = 18;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 113;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            var3 = 1;
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 113;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (null != var2_ref.field_h[var4]) {
                                statePc = 21;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof ClassNotFoundException ? 20 : 113);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof ClassNotFoundException ? 20 : 113);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 113;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if ((var2_ref.field_h[var4].field_a ^ -1) != -3) {
                                statePc = 25;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof ClassNotFoundException ? 24 : 113);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            var2_ref.field_e[var4] = -6;
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof ClassNotFoundException ? 24 : 113);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 113;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 113;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            if (-1 == (var2_ref.field_h[var4].field_a ^ -1)) {
                                statePc = 28;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof ClassNotFoundException ? 27 : 113);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof ClassNotFoundException ? 27 : 113);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 113;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            var3 = 1;
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 113;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            var4++;
                            if (var12 == 0) {
                                statePc = 4;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 113;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if (var3 != 0) {
                                statePc = 33;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof ClassNotFoundException ? 32 : 113);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof ClassNotFoundException ? 32 : 113);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 113;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        return;
                    }
                    case 34: {
                        try {
                            var4 = param0.field_g;
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 113;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            if (param1 == 24732) {
                                statePc = 40;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof ClassNotFoundException ? 38 : 113);
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            stackOut_36_0 = null;
                            stackIn_37_0 = stackOut_36_0;
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof ClassNotFoundException ? 38 : 113);
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            stackOut_37_0 = (Object) (Object) stackIn_37_0;
                            stackIn_39_0 = stackOut_37_0;
                            statePc = 39;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 113;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 113;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            field_a = (cc) stackIn_39_0;
                            statePc = 40;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 113;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            param0.a((byte) 87, var2_ref.field_j);
                            var5 = 0;
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 113;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            if (var5 >= var2_ref.field_g) {
                                statePc = 110;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 113;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            stackOut_42_0 = 0;
                            stackIn_111_0 = stackOut_42_0;
                            stackIn_43_0 = stackOut_42_0;
                            if (var12 != 0) {
                                statePc = 111;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof ClassNotFoundException ? 46 : 113);
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            stackOut_43_0 = stackIn_43_0;
                            stackOut_43_1 = (bb) var2_ref;
                            stackIn_44_0 = stackOut_43_0;
                            stackIn_44_1 = stackOut_43_1;
                            statePc = 44;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof ClassNotFoundException ? 46 : 113);
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            if (stackIn_44_0 == ((bb) (Object) stackIn_44_1).field_e[var5]) {
                                statePc = 50;
                            } else {
                                statePc = 45;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof ClassNotFoundException ? 49 : 113);
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            statePc = 47;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof ClassNotFoundException ? 49 : 113);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof ClassNotFoundException ? 49 : 113);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            param0.b(param1 ^ -1336888268, var2_ref.field_e[var5]);
                            if (var12 == 0) {
                                statePc = 109;
                            } else {
                                statePc = 48;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof ClassNotFoundException ? 49 : 113);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            statePc = 50;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = 113;
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 113;
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            var6_int = var2_ref.field_l[var5];
                            if (-1 != (var6_int ^ -1)) {
                                statePc = 53;
                            } else {
                                statePc = 51;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = (stateCaught_50 instanceof ClassNotFoundException ? 97 : (stateCaught_50 instanceof InvalidClassException ? 98 : (stateCaught_50 instanceof StreamCorruptedException ? 99 : (stateCaught_50 instanceof OptionalDataException ? 100 : (stateCaught_50 instanceof IllegalAccessException ? 101 : (stateCaught_50 instanceof IllegalArgumentException ? 102 : (stateCaught_50 instanceof java.lang.reflect.InvocationTargetException ? 103 : (stateCaught_50 instanceof SecurityException ? 104 : (stateCaught_50 instanceof IOException ? 105 : (stateCaught_50 instanceof NullPointerException ? 106 : (stateCaught_50 instanceof Exception ? 107 : 108)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            var7 = (java.lang.reflect.Field) var2_ref.field_f[var5].field_f;
                            var8_int = var7.getInt((Object) null);
                            statePc = 52;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = (stateCaught_51 instanceof ClassNotFoundException ? 97 : (stateCaught_51 instanceof InvalidClassException ? 98 : (stateCaught_51 instanceof StreamCorruptedException ? 99 : (stateCaught_51 instanceof OptionalDataException ? 100 : (stateCaught_51 instanceof IllegalAccessException ? 101 : (stateCaught_51 instanceof IllegalArgumentException ? 102 : (stateCaught_51 instanceof java.lang.reflect.InvocationTargetException ? 103 : (stateCaught_51 instanceof SecurityException ? 104 : (stateCaught_51 instanceof IOException ? 105 : (stateCaught_51 instanceof NullPointerException ? 106 : (stateCaught_51 instanceof Exception ? 107 : 108)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            param0.b(-1336879960, 0);
                            param0.a((byte) 90, var8_int);
                            if (var12 == 0) {
                                statePc = 62;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof ClassNotFoundException ? 97 : (stateCaught_52 instanceof InvalidClassException ? 98 : (stateCaught_52 instanceof StreamCorruptedException ? 99 : (stateCaught_52 instanceof OptionalDataException ? 100 : (stateCaught_52 instanceof IllegalAccessException ? 101 : (stateCaught_52 instanceof IllegalArgumentException ? 102 : (stateCaught_52 instanceof java.lang.reflect.InvocationTargetException ? 103 : (stateCaught_52 instanceof SecurityException ? 104 : (stateCaught_52 instanceof IOException ? 105 : (stateCaught_52 instanceof NullPointerException ? 106 : (stateCaught_52 instanceof Exception ? 107 : 108)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            if (1 != var6_int) {
                                statePc = 58;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = (stateCaught_53 instanceof ClassNotFoundException ? 97 : (stateCaught_53 instanceof InvalidClassException ? 98 : (stateCaught_53 instanceof StreamCorruptedException ? 99 : (stateCaught_53 instanceof OptionalDataException ? 100 : (stateCaught_53 instanceof IllegalAccessException ? 101 : (stateCaught_53 instanceof IllegalArgumentException ? 102 : (stateCaught_53 instanceof java.lang.reflect.InvocationTargetException ? 103 : (stateCaught_53 instanceof SecurityException ? 104 : (stateCaught_53 instanceof IOException ? 105 : (stateCaught_53 instanceof NullPointerException ? 106 : (stateCaught_53 instanceof Exception ? 107 : 108)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            statePc = 56;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = (stateCaught_54 instanceof ClassNotFoundException ? 97 : (stateCaught_54 instanceof InvalidClassException ? 98 : (stateCaught_54 instanceof StreamCorruptedException ? 99 : (stateCaught_54 instanceof OptionalDataException ? 100 : (stateCaught_54 instanceof IllegalAccessException ? 101 : (stateCaught_54 instanceof IllegalArgumentException ? 102 : (stateCaught_54 instanceof java.lang.reflect.InvocationTargetException ? 103 : (stateCaught_54 instanceof SecurityException ? 104 : (stateCaught_54 instanceof IOException ? 105 : (stateCaught_54 instanceof NullPointerException ? 106 : (stateCaught_54 instanceof Exception ? 107 : 108)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            var7 = (java.lang.reflect.Field) var2_ref.field_f[var5].field_f;
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = (stateCaught_56 instanceof ClassNotFoundException ? 97 : (stateCaught_56 instanceof InvalidClassException ? 98 : (stateCaught_56 instanceof StreamCorruptedException ? 99 : (stateCaught_56 instanceof OptionalDataException ? 100 : (stateCaught_56 instanceof IllegalAccessException ? 101 : (stateCaught_56 instanceof IllegalArgumentException ? 102 : (stateCaught_56 instanceof java.lang.reflect.InvocationTargetException ? 103 : (stateCaught_56 instanceof SecurityException ? 104 : (stateCaught_56 instanceof IOException ? 105 : (stateCaught_56 instanceof NullPointerException ? 106 : (stateCaught_56 instanceof Exception ? 107 : 108)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            var7.setInt((Object) null, var2_ref.field_i[var5]);
                            param0.b(-1336879960, 0);
                            if (var12 == 0) {
                                statePc = 62;
                            } else {
                                statePc = 58;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = (stateCaught_57 instanceof ClassNotFoundException ? 97 : (stateCaught_57 instanceof InvalidClassException ? 98 : (stateCaught_57 instanceof StreamCorruptedException ? 99 : (stateCaught_57 instanceof OptionalDataException ? 100 : (stateCaught_57 instanceof IllegalAccessException ? 101 : (stateCaught_57 instanceof IllegalArgumentException ? 102 : (stateCaught_57 instanceof java.lang.reflect.InvocationTargetException ? 103 : (stateCaught_57 instanceof SecurityException ? 104 : (stateCaught_57 instanceof IOException ? 105 : (stateCaught_57 instanceof NullPointerException ? 106 : (stateCaught_57 instanceof Exception ? 107 : 108)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            if (-3 != (var6_int ^ -1)) {
                                statePc = 62;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = (stateCaught_58 instanceof ClassNotFoundException ? 97 : (stateCaught_58 instanceof InvalidClassException ? 98 : (stateCaught_58 instanceof StreamCorruptedException ? 99 : (stateCaught_58 instanceof OptionalDataException ? 100 : (stateCaught_58 instanceof IllegalAccessException ? 101 : (stateCaught_58 instanceof IllegalArgumentException ? 102 : (stateCaught_58 instanceof java.lang.reflect.InvocationTargetException ? 103 : (stateCaught_58 instanceof SecurityException ? 104 : (stateCaught_58 instanceof IOException ? 105 : (stateCaught_58 instanceof NullPointerException ? 106 : (stateCaught_58 instanceof Exception ? 107 : 108)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = (stateCaught_59 instanceof ClassNotFoundException ? 97 : (stateCaught_59 instanceof InvalidClassException ? 98 : (stateCaught_59 instanceof StreamCorruptedException ? 99 : (stateCaught_59 instanceof OptionalDataException ? 100 : (stateCaught_59 instanceof IllegalAccessException ? 101 : (stateCaught_59 instanceof IllegalArgumentException ? 102 : (stateCaught_59 instanceof java.lang.reflect.InvocationTargetException ? 103 : (stateCaught_59 instanceof SecurityException ? 104 : (stateCaught_59 instanceof IOException ? 105 : (stateCaught_59 instanceof NullPointerException ? 106 : (stateCaught_59 instanceof Exception ? 107 : 108)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            var7 = (java.lang.reflect.Field) var2_ref.field_f[var5].field_f;
                            var8_int = var7.getModifiers();
                            param0.b(-1336879960, 0);
                            param0.a((byte) 28, var8_int);
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = (stateCaught_61 instanceof ClassNotFoundException ? 97 : (stateCaught_61 instanceof InvalidClassException ? 98 : (stateCaught_61 instanceof StreamCorruptedException ? 99 : (stateCaught_61 instanceof OptionalDataException ? 100 : (stateCaught_61 instanceof IllegalAccessException ? 101 : (stateCaught_61 instanceof IllegalArgumentException ? 102 : (stateCaught_61 instanceof java.lang.reflect.InvocationTargetException ? 103 : (stateCaught_61 instanceof SecurityException ? 104 : (stateCaught_61 instanceof IOException ? 105 : (stateCaught_61 instanceof NullPointerException ? 106 : (stateCaught_61 instanceof Exception ? 107 : 108)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            if (3 == var6_int) {
                                statePc = 69;
                            } else {
                                statePc = 63;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = (stateCaught_62 instanceof ClassNotFoundException ? 97 : (stateCaught_62 instanceof InvalidClassException ? 98 : (stateCaught_62 instanceof StreamCorruptedException ? 99 : (stateCaught_62 instanceof OptionalDataException ? 100 : (stateCaught_62 instanceof IllegalAccessException ? 101 : (stateCaught_62 instanceof IllegalArgumentException ? 102 : (stateCaught_62 instanceof java.lang.reflect.InvocationTargetException ? 103 : (stateCaught_62 instanceof SecurityException ? 104 : (stateCaught_62 instanceof IOException ? 105 : (stateCaught_62 instanceof NullPointerException ? 106 : (stateCaught_62 instanceof Exception ? 107 : 108)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            if (var6_int == 4) {
                                statePc = 68;
                            } else {
                                statePc = 64;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = (stateCaught_63 instanceof ClassNotFoundException ? 97 : (stateCaught_63 instanceof InvalidClassException ? 98 : (stateCaught_63 instanceof StreamCorruptedException ? 99 : (stateCaught_63 instanceof OptionalDataException ? 100 : (stateCaught_63 instanceof IllegalAccessException ? 101 : (stateCaught_63 instanceof IllegalArgumentException ? 102 : (stateCaught_63 instanceof java.lang.reflect.InvocationTargetException ? 103 : (stateCaught_63 instanceof SecurityException ? 104 : (stateCaught_63 instanceof IOException ? 105 : (stateCaught_63 instanceof NullPointerException ? 106 : (stateCaught_63 instanceof Exception ? 107 : 108)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            statePc = 66;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = (stateCaught_64 instanceof ClassNotFoundException ? 97 : (stateCaught_64 instanceof InvalidClassException ? 98 : (stateCaught_64 instanceof StreamCorruptedException ? 99 : (stateCaught_64 instanceof OptionalDataException ? 100 : (stateCaught_64 instanceof IllegalAccessException ? 101 : (stateCaught_64 instanceof IllegalArgumentException ? 102 : (stateCaught_64 instanceof java.lang.reflect.InvocationTargetException ? 103 : (stateCaught_64 instanceof SecurityException ? 104 : (stateCaught_64 instanceof IOException ? 105 : (stateCaught_64 instanceof NullPointerException ? 106 : (stateCaught_64 instanceof Exception ? 107 : 108)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            statePc = 96;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = (stateCaught_66 instanceof ClassNotFoundException ? 97 : (stateCaught_66 instanceof InvalidClassException ? 98 : (stateCaught_66 instanceof StreamCorruptedException ? 99 : (stateCaught_66 instanceof OptionalDataException ? 100 : (stateCaught_66 instanceof IllegalAccessException ? 101 : (stateCaught_66 instanceof IllegalArgumentException ? 102 : (stateCaught_66 instanceof java.lang.reflect.InvocationTargetException ? 103 : (stateCaught_66 instanceof SecurityException ? 104 : (stateCaught_66 instanceof IOException ? 105 : (stateCaught_66 instanceof NullPointerException ? 106 : (stateCaught_66 instanceof Exception ? 107 : 108)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            var7_ref = (java.lang.reflect.Method) var2_ref.field_h[var5].field_f;
                            var8_int = var7_ref.getModifiers();
                            param0.b(param1 + -1336904692, 0);
                            param0.a((byte) 65, var8_int);
                            if (var12 == 0) {
                                statePc = 96;
                            } else {
                                statePc = 69;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = (stateCaught_68 instanceof ClassNotFoundException ? 97 : (stateCaught_68 instanceof InvalidClassException ? 98 : (stateCaught_68 instanceof StreamCorruptedException ? 99 : (stateCaught_68 instanceof OptionalDataException ? 100 : (stateCaught_68 instanceof IllegalAccessException ? 101 : (stateCaught_68 instanceof IllegalArgumentException ? 102 : (stateCaught_68 instanceof java.lang.reflect.InvocationTargetException ? 103 : (stateCaught_68 instanceof SecurityException ? 104 : (stateCaught_68 instanceof IOException ? 105 : (stateCaught_68 instanceof NullPointerException ? 106 : (stateCaught_68 instanceof Exception ? 107 : 108)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            var7_ref = (java.lang.reflect.Method) var2_ref.field_h[var5].field_f;
                            var8 = var2_ref.field_k[var5];
                            var9 = new Object[var8.length];
                            var10_int = 0;
                            statePc = 70;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = (stateCaught_69 instanceof ClassNotFoundException ? 97 : (stateCaught_69 instanceof InvalidClassException ? 98 : (stateCaught_69 instanceof StreamCorruptedException ? 99 : (stateCaught_69 instanceof OptionalDataException ? 100 : (stateCaught_69 instanceof IllegalAccessException ? 101 : (stateCaught_69 instanceof IllegalArgumentException ? 102 : (stateCaught_69 instanceof java.lang.reflect.InvocationTargetException ? 103 : (stateCaught_69 instanceof SecurityException ? 104 : (stateCaught_69 instanceof IOException ? 105 : (stateCaught_69 instanceof NullPointerException ? 106 : (stateCaught_69 instanceof Exception ? 107 : 108)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            if ((var10_int ^ -1) <= (var8.length ^ -1)) {
                                statePc = 76;
                            } else {
                                statePc = 71;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = (stateCaught_70 instanceof ClassNotFoundException ? 97 : (stateCaught_70 instanceof InvalidClassException ? 98 : (stateCaught_70 instanceof StreamCorruptedException ? 99 : (stateCaught_70 instanceof OptionalDataException ? 100 : (stateCaught_70 instanceof IllegalAccessException ? 101 : (stateCaught_70 instanceof IllegalArgumentException ? 102 : (stateCaught_70 instanceof java.lang.reflect.InvocationTargetException ? 103 : (stateCaught_70 instanceof SecurityException ? 104 : (stateCaught_70 instanceof IOException ? 105 : (stateCaught_70 instanceof NullPointerException ? 106 : (stateCaught_70 instanceof Exception ? 107 : 108)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            var11 = new ObjectInputStream((InputStream) (Object) new ByteArrayInputStream(var8[var10_int]));
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = (stateCaught_71 instanceof ClassNotFoundException ? 97 : (stateCaught_71 instanceof InvalidClassException ? 98 : (stateCaught_71 instanceof StreamCorruptedException ? 99 : (stateCaught_71 instanceof OptionalDataException ? 100 : (stateCaught_71 instanceof IllegalAccessException ? 101 : (stateCaught_71 instanceof IllegalArgumentException ? 102 : (stateCaught_71 instanceof java.lang.reflect.InvocationTargetException ? 103 : (stateCaught_71 instanceof SecurityException ? 104 : (stateCaught_71 instanceof IOException ? 105 : (stateCaught_71 instanceof NullPointerException ? 106 : (stateCaught_71 instanceof Exception ? 107 : 108)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            var9[var10_int] = var11.readObject();
                            var10_int++;
                            if (var12 != 0) {
                                statePc = 96;
                            } else {
                                statePc = 73;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = (stateCaught_72 instanceof ClassNotFoundException ? 97 : (stateCaught_72 instanceof InvalidClassException ? 98 : (stateCaught_72 instanceof StreamCorruptedException ? 99 : (stateCaught_72 instanceof OptionalDataException ? 100 : (stateCaught_72 instanceof IllegalAccessException ? 101 : (stateCaught_72 instanceof IllegalArgumentException ? 102 : (stateCaught_72 instanceof java.lang.reflect.InvocationTargetException ? 103 : (stateCaught_72 instanceof SecurityException ? 104 : (stateCaught_72 instanceof IOException ? 105 : (stateCaught_72 instanceof NullPointerException ? 106 : (stateCaught_72 instanceof Exception ? 107 : 108)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            if (var12 == 0) {
                                statePc = 70;
                            } else {
                                statePc = 74;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = (stateCaught_73 instanceof ClassNotFoundException ? 97 : (stateCaught_73 instanceof InvalidClassException ? 98 : (stateCaught_73 instanceof StreamCorruptedException ? 99 : (stateCaught_73 instanceof OptionalDataException ? 100 : (stateCaught_73 instanceof IllegalAccessException ? 101 : (stateCaught_73 instanceof IllegalArgumentException ? 102 : (stateCaught_73 instanceof java.lang.reflect.InvocationTargetException ? 103 : (stateCaught_73 instanceof SecurityException ? 104 : (stateCaught_73 instanceof IOException ? 105 : (stateCaught_73 instanceof NullPointerException ? 106 : (stateCaught_73 instanceof Exception ? 107 : 108)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            statePc = 76;
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = (stateCaught_74 instanceof ClassNotFoundException ? 97 : (stateCaught_74 instanceof InvalidClassException ? 98 : (stateCaught_74 instanceof StreamCorruptedException ? 99 : (stateCaught_74 instanceof OptionalDataException ? 100 : (stateCaught_74 instanceof IllegalAccessException ? 101 : (stateCaught_74 instanceof IllegalArgumentException ? 102 : (stateCaught_74 instanceof java.lang.reflect.InvocationTargetException ? 103 : (stateCaught_74 instanceof SecurityException ? 104 : (stateCaught_74 instanceof IOException ? 105 : (stateCaught_74 instanceof NullPointerException ? 106 : (stateCaught_74 instanceof Exception ? 107 : 108)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            var10 = var7_ref.invoke((Object) null, var9);
                            statePc = 77;
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = (stateCaught_76 instanceof ClassNotFoundException ? 97 : (stateCaught_76 instanceof InvalidClassException ? 98 : (stateCaught_76 instanceof StreamCorruptedException ? 99 : (stateCaught_76 instanceof OptionalDataException ? 100 : (stateCaught_76 instanceof IllegalAccessException ? 101 : (stateCaught_76 instanceof IllegalArgumentException ? 102 : (stateCaught_76 instanceof java.lang.reflect.InvocationTargetException ? 103 : (stateCaught_76 instanceof SecurityException ? 104 : (stateCaught_76 instanceof IOException ? 105 : (stateCaught_76 instanceof NullPointerException ? 106 : (stateCaught_76 instanceof Exception ? 107 : 108)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            if (var10 != null) {
                                statePc = 81;
                            } else {
                                statePc = 78;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = (stateCaught_77 instanceof ClassNotFoundException ? 97 : (stateCaught_77 instanceof InvalidClassException ? 98 : (stateCaught_77 instanceof StreamCorruptedException ? 99 : (stateCaught_77 instanceof OptionalDataException ? 100 : (stateCaught_77 instanceof IllegalAccessException ? 101 : (stateCaught_77 instanceof IllegalArgumentException ? 102 : (stateCaught_77 instanceof java.lang.reflect.InvocationTargetException ? 103 : (stateCaught_77 instanceof SecurityException ? 104 : (stateCaught_77 instanceof IOException ? 105 : (stateCaught_77 instanceof NullPointerException ? 106 : (stateCaught_77 instanceof Exception ? 107 : 108)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            param0.b(-1336879960, 0);
                            if (var12 == 0) {
                                statePc = 96;
                            } else {
                                statePc = 79;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = (stateCaught_78 instanceof ClassNotFoundException ? 97 : (stateCaught_78 instanceof InvalidClassException ? 98 : (stateCaught_78 instanceof StreamCorruptedException ? 99 : (stateCaught_78 instanceof OptionalDataException ? 100 : (stateCaught_78 instanceof IllegalAccessException ? 101 : (stateCaught_78 instanceof IllegalArgumentException ? 102 : (stateCaught_78 instanceof java.lang.reflect.InvocationTargetException ? 103 : (stateCaught_78 instanceof SecurityException ? 104 : (stateCaught_78 instanceof IOException ? 105 : (stateCaught_78 instanceof NullPointerException ? 106 : (stateCaught_78 instanceof Exception ? 107 : 108)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            statePc = 81;
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = (stateCaught_79 instanceof ClassNotFoundException ? 97 : (stateCaught_79 instanceof InvalidClassException ? 98 : (stateCaught_79 instanceof StreamCorruptedException ? 99 : (stateCaught_79 instanceof OptionalDataException ? 100 : (stateCaught_79 instanceof IllegalAccessException ? 101 : (stateCaught_79 instanceof IllegalArgumentException ? 102 : (stateCaught_79 instanceof java.lang.reflect.InvocationTargetException ? 103 : (stateCaught_79 instanceof SecurityException ? 104 : (stateCaught_79 instanceof IOException ? 105 : (stateCaught_79 instanceof NullPointerException ? 106 : (stateCaught_79 instanceof Exception ? 107 : 108)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            if (var10 instanceof Number) {
                                statePc = 93;
                            } else {
                                statePc = 82;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = (stateCaught_81 instanceof ClassNotFoundException ? 97 : (stateCaught_81 instanceof InvalidClassException ? 98 : (stateCaught_81 instanceof StreamCorruptedException ? 99 : (stateCaught_81 instanceof OptionalDataException ? 100 : (stateCaught_81 instanceof IllegalAccessException ? 101 : (stateCaught_81 instanceof IllegalArgumentException ? 102 : (stateCaught_81 instanceof java.lang.reflect.InvocationTargetException ? 103 : (stateCaught_81 instanceof SecurityException ? 104 : (stateCaught_81 instanceof IOException ? 105 : (stateCaught_81 instanceof NullPointerException ? 106 : (stateCaught_81 instanceof Exception ? 107 : 108)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = (stateCaught_82 instanceof ClassNotFoundException ? 97 : (stateCaught_82 instanceof InvalidClassException ? 98 : (stateCaught_82 instanceof StreamCorruptedException ? 99 : (stateCaught_82 instanceof OptionalDataException ? 100 : (stateCaught_82 instanceof IllegalAccessException ? 101 : (stateCaught_82 instanceof IllegalArgumentException ? 102 : (stateCaught_82 instanceof java.lang.reflect.InvocationTargetException ? 103 : (stateCaught_82 instanceof SecurityException ? 104 : (stateCaught_82 instanceof IOException ? 105 : (stateCaught_82 instanceof NullPointerException ? 106 : (stateCaught_82 instanceof Exception ? 107 : 108)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            if (var10 instanceof String) {
                                statePc = 90;
                            } else {
                                statePc = 85;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = (stateCaught_84 instanceof ClassNotFoundException ? 97 : (stateCaught_84 instanceof InvalidClassException ? 98 : (stateCaught_84 instanceof StreamCorruptedException ? 99 : (stateCaught_84 instanceof OptionalDataException ? 100 : (stateCaught_84 instanceof IllegalAccessException ? 101 : (stateCaught_84 instanceof IllegalArgumentException ? 102 : (stateCaught_84 instanceof java.lang.reflect.InvocationTargetException ? 103 : (stateCaught_84 instanceof SecurityException ? 104 : (stateCaught_84 instanceof IOException ? 105 : (stateCaught_84 instanceof NullPointerException ? 106 : (stateCaught_84 instanceof Exception ? 107 : 108)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            statePc = 87;
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = (stateCaught_85 instanceof ClassNotFoundException ? 97 : (stateCaught_85 instanceof InvalidClassException ? 98 : (stateCaught_85 instanceof StreamCorruptedException ? 99 : (stateCaught_85 instanceof OptionalDataException ? 100 : (stateCaught_85 instanceof IllegalAccessException ? 101 : (stateCaught_85 instanceof IllegalArgumentException ? 102 : (stateCaught_85 instanceof java.lang.reflect.InvocationTargetException ? 103 : (stateCaught_85 instanceof SecurityException ? 104 : (stateCaught_85 instanceof IOException ? 105 : (stateCaught_85 instanceof NullPointerException ? 106 : (stateCaught_85 instanceof Exception ? 107 : 108)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            param0.b(-1336879960, 4);
                            if (var12 == 0) {
                                statePc = 96;
                            } else {
                                statePc = 88;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = (stateCaught_87 instanceof ClassNotFoundException ? 97 : (stateCaught_87 instanceof InvalidClassException ? 98 : (stateCaught_87 instanceof StreamCorruptedException ? 99 : (stateCaught_87 instanceof OptionalDataException ? 100 : (stateCaught_87 instanceof IllegalAccessException ? 101 : (stateCaught_87 instanceof IllegalArgumentException ? 102 : (stateCaught_87 instanceof java.lang.reflect.InvocationTargetException ? 103 : (stateCaught_87 instanceof SecurityException ? 104 : (stateCaught_87 instanceof IOException ? 105 : (stateCaught_87 instanceof NullPointerException ? 106 : (stateCaught_87 instanceof Exception ? 107 : 108)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            statePc = 90;
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = (stateCaught_88 instanceof ClassNotFoundException ? 97 : (stateCaught_88 instanceof InvalidClassException ? 98 : (stateCaught_88 instanceof StreamCorruptedException ? 99 : (stateCaught_88 instanceof OptionalDataException ? 100 : (stateCaught_88 instanceof IllegalAccessException ? 101 : (stateCaught_88 instanceof IllegalArgumentException ? 102 : (stateCaught_88 instanceof java.lang.reflect.InvocationTargetException ? 103 : (stateCaught_88 instanceof SecurityException ? 104 : (stateCaught_88 instanceof IOException ? 105 : (stateCaught_88 instanceof NullPointerException ? 106 : (stateCaught_88 instanceof Exception ? 107 : 108)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            param0.b(-1336879960, 2);
                            param0.a(-47, (String) var10);
                            if (var12 == 0) {
                                statePc = 96;
                            } else {
                                statePc = 91;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = (stateCaught_90 instanceof ClassNotFoundException ? 97 : (stateCaught_90 instanceof InvalidClassException ? 98 : (stateCaught_90 instanceof StreamCorruptedException ? 99 : (stateCaught_90 instanceof OptionalDataException ? 100 : (stateCaught_90 instanceof IllegalAccessException ? 101 : (stateCaught_90 instanceof IllegalArgumentException ? 102 : (stateCaught_90 instanceof java.lang.reflect.InvocationTargetException ? 103 : (stateCaught_90 instanceof SecurityException ? 104 : (stateCaught_90 instanceof IOException ? 105 : (stateCaught_90 instanceof NullPointerException ? 106 : (stateCaught_90 instanceof Exception ? 107 : 108)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            statePc = 93;
                            continue stateLoop;
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = (stateCaught_91 instanceof ClassNotFoundException ? 97 : (stateCaught_91 instanceof InvalidClassException ? 98 : (stateCaught_91 instanceof StreamCorruptedException ? 99 : (stateCaught_91 instanceof OptionalDataException ? 100 : (stateCaught_91 instanceof IllegalAccessException ? 101 : (stateCaught_91 instanceof IllegalArgumentException ? 102 : (stateCaught_91 instanceof java.lang.reflect.InvocationTargetException ? 103 : (stateCaught_91 instanceof SecurityException ? 104 : (stateCaught_91 instanceof IOException ? 105 : (stateCaught_91 instanceof NullPointerException ? 106 : (stateCaught_91 instanceof Exception ? 107 : 108)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            param0.b(-1336879960, 1);
                            param0.b((byte) -102, ((Number) var10).longValue());
                            statePc = 94;
                            continue stateLoop;
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = (stateCaught_93 instanceof ClassNotFoundException ? 97 : (stateCaught_93 instanceof InvalidClassException ? 98 : (stateCaught_93 instanceof StreamCorruptedException ? 99 : (stateCaught_93 instanceof OptionalDataException ? 100 : (stateCaught_93 instanceof IllegalAccessException ? 101 : (stateCaught_93 instanceof IllegalArgumentException ? 102 : (stateCaught_93 instanceof java.lang.reflect.InvocationTargetException ? 103 : (stateCaught_93 instanceof SecurityException ? 104 : (stateCaught_93 instanceof IOException ? 105 : (stateCaught_93 instanceof NullPointerException ? 106 : (stateCaught_93 instanceof Exception ? 107 : 108)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        try {
                            statePc = 96;
                            continue stateLoop;
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = (stateCaught_94 instanceof ClassNotFoundException ? 97 : (stateCaught_94 instanceof InvalidClassException ? 98 : (stateCaught_94 instanceof StreamCorruptedException ? 99 : (stateCaught_94 instanceof OptionalDataException ? 100 : (stateCaught_94 instanceof IllegalAccessException ? 101 : (stateCaught_94 instanceof IllegalArgumentException ? 102 : (stateCaught_94 instanceof java.lang.reflect.InvocationTargetException ? 103 : (stateCaught_94 instanceof SecurityException ? 104 : (stateCaught_94 instanceof IOException ? 105 : (stateCaught_94 instanceof NullPointerException ? 106 : (stateCaught_94 instanceof Exception ? 107 : 108)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 96: {
                        try {
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = 113;
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            var6 = (ClassNotFoundException) (Object) caughtException;
                            param0.b(-1336879960, -10);
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_97) {
                            caughtException = stateCaught_97;
                            statePc = 113;
                            continue stateLoop;
                        }
                    }
                    case 98: {
                        try {
                            var6_ref = (InvalidClassException) (Object) caughtException;
                            param0.b(-1336879960, -11);
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_98) {
                            caughtException = stateCaught_98;
                            statePc = 113;
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            var6_ref2 = (StreamCorruptedException) (Object) caughtException;
                            param0.b(-1336879960, -12);
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = 113;
                            continue stateLoop;
                        }
                    }
                    case 100: {
                        try {
                            var6_ref3 = (OptionalDataException) (Object) caughtException;
                            param0.b(param1 + -1336904692, -13);
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_100) {
                            caughtException = stateCaught_100;
                            statePc = 113;
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        try {
                            var6_ref4 = (IllegalAccessException) (Object) caughtException;
                            param0.b(-1336879960, -14);
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_101) {
                            caughtException = stateCaught_101;
                            statePc = 113;
                            continue stateLoop;
                        }
                    }
                    case 102: {
                        try {
                            var6_ref5 = (IllegalArgumentException) (Object) caughtException;
                            param0.b(-1336879960, -15);
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_102) {
                            caughtException = stateCaught_102;
                            statePc = 113;
                            continue stateLoop;
                        }
                    }
                    case 103: {
                        try {
                            var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) caughtException;
                            param0.b(-1336879960, -16);
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_103) {
                            caughtException = stateCaught_103;
                            statePc = 113;
                            continue stateLoop;
                        }
                    }
                    case 104: {
                        try {
                            var6_ref7 = (SecurityException) (Object) caughtException;
                            param0.b(-1336879960, -17);
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_104) {
                            caughtException = stateCaught_104;
                            statePc = 113;
                            continue stateLoop;
                        }
                    }
                    case 105: {
                        try {
                            var6_ref8 = (IOException) (Object) caughtException;
                            param0.b(-1336879960, -18);
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_105) {
                            caughtException = stateCaught_105;
                            statePc = 113;
                            continue stateLoop;
                        }
                    }
                    case 106: {
                        try {
                            var6_ref9 = (NullPointerException) (Object) caughtException;
                            param0.b(-1336879960, -19);
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_106) {
                            caughtException = stateCaught_106;
                            statePc = 113;
                            continue stateLoop;
                        }
                    }
                    case 107: {
                        try {
                            var6_ref10 = (Exception) (Object) caughtException;
                            param0.b(-1336879960, -20);
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_107) {
                            caughtException = stateCaught_107;
                            statePc = 113;
                            continue stateLoop;
                        }
                    }
                    case 108: {
                        try {
                            var6_ref11 = caughtException;
                            param0.b(-1336879960, -21);
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_108) {
                            caughtException = stateCaught_108;
                            statePc = 113;
                            continue stateLoop;
                        }
                    }
                    case 109: {
                        try {
                            var5++;
                            if (var12 == 0) {
                                statePc = 41;
                            } else {
                                statePc = 110;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_109) {
                            caughtException = stateCaught_109;
                            statePc = 113;
                            continue stateLoop;
                        }
                    }
                    case 110: {
                        try {
                            stackOut_110_0 = param0.e(var4, 56);
                            stackIn_111_0 = stackOut_110_0;
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_110) {
                            caughtException = stateCaught_110;
                            statePc = 113;
                            continue stateLoop;
                        }
                    }
                    case 111: {
                        try {
                            var2_ref.c(-125);
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_111) {
                            caughtException = stateCaught_111;
                            statePc = 113;
                            continue stateLoop;
                        }
                    }
                    case 112: {
                        return;
                    }
                    case 113: {
                        var2 = (RuntimeException) (Object) caughtException;
                        statePc = 114;
                        continue stateLoop;
                    }
                    case 114: {
                        try {
                            stackOut_114_0 = (RuntimeException) var2;
                            stackOut_114_1 = new StringBuilder().append("hb.C(");
                            stackIn_117_0 = stackOut_114_0;
                            stackIn_117_1 = stackOut_114_1;
                            stackIn_115_0 = stackOut_114_0;
                            stackIn_115_1 = stackOut_114_1;
                            if (param0 == null) {
                                statePc = 117;
                            } else {
                                statePc = 115;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_114) {
                            caughtException = stateCaught_114;
                            statePc = 116;
                            continue stateLoop;
                        }
                    }
                    case 115: {
                        try {
                            stackOut_115_0 = (RuntimeException) (Object) stackIn_115_0;
                            stackOut_115_1 = (StringBuilder) (Object) stackIn_115_1;
                            stackOut_115_2 = "{...}";
                            stackIn_118_0 = stackOut_115_0;
                            stackIn_118_1 = stackOut_115_1;
                            stackIn_118_2 = stackOut_115_2;
                            statePc = 118;
                            continue stateLoop;
                        } catch (Throwable stateCaught_115) {
                            caughtException = stateCaught_115;
                            statePc = 116;
                            continue stateLoop;
                        }
                    }
                    case 116: {
                        throw (RuntimeException) (Object) caughtException;
                    }
                    case 117: {
                        stackOut_117_0 = (RuntimeException) (Object) stackIn_117_0;
                        stackOut_117_1 = (StringBuilder) (Object) stackIn_117_1;
                        stackOut_117_2 = "null";
                        stackIn_118_0 = stackOut_117_0;
                        stackIn_118_1 = stackOut_117_1;
                        stackIn_118_2 = stackOut_117_2;
                        statePc = 118;
                        continue stateLoop;
                    }
                    case 118: {
                        throw pn.a((Throwable) (Object) stackIn_118_0, (String) (Object) (stackIn_118_2 + 44 + param1 + 41));
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

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, ha param7, byte param8, pa[] param9) {
        RuntimeException var10 = null;
        bo var10_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int stackIn_8_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_90_0 = 0;
        int stackIn_97_0 = 0;
        int stackIn_105_0 = 0;
        int stackIn_112_0 = 0;
        pa[] stackIn_116_0 = null;
        int stackIn_127_0 = 0;
        RuntimeException stackIn_137_0 = null;
        StringBuilder stackIn_137_1 = null;
        RuntimeException stackIn_139_0 = null;
        StringBuilder stackIn_139_1 = null;
        RuntimeException stackIn_140_0 = null;
        StringBuilder stackIn_140_1 = null;
        String stackIn_140_2 = null;
        RuntimeException stackIn_141_0 = null;
        StringBuilder stackIn_141_1 = null;
        RuntimeException stackIn_143_0 = null;
        StringBuilder stackIn_143_1 = null;
        RuntimeException stackIn_144_0 = null;
        StringBuilder stackIn_144_1 = null;
        String stackIn_144_2 = null;
        int stackOut_7_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_89_0 = 0;
        int stackOut_96_0 = 0;
        int stackOut_104_0 = 0;
        int stackOut_111_0 = 0;
        pa[] stackOut_115_0 = null;
        int stackOut_126_0 = 0;
        RuntimeException stackOut_136_0 = null;
        StringBuilder stackOut_136_1 = null;
        RuntimeException stackOut_137_0 = null;
        StringBuilder stackOut_137_1 = null;
        String stackOut_137_2 = null;
        RuntimeException stackOut_139_0 = null;
        StringBuilder stackOut_139_1 = null;
        String stackOut_139_2 = null;
        RuntimeException stackOut_140_0 = null;
        StringBuilder stackOut_140_1 = null;
        RuntimeException stackOut_141_0 = null;
        StringBuilder stackOut_141_1 = null;
        String stackOut_141_2 = null;
        RuntimeException stackOut_143_0 = null;
        StringBuilder stackOut_143_1 = null;
        String stackOut_143_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var28 = AceOfSkies.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var10_ref = fa.a(param7, true);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param9 == null) {
                            statePc = 5;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return;
                }
                case 6: {
                    try {
                        if (0 >= param5) {
                            statePc = 13;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = -1;
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (stackIn_8_0 <= (param6 ^ -1)) {
                            statePc = 13;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 13: {
                    return;
                }
                case 14: {
                    try {
                        if (null == param9[3]) {
                            statePc = 17;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackOut_15_0 = param9[3].d();
                        stackIn_18_0 = stackOut_15_0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackOut_17_0 = 0;
                        stackIn_18_0 = stackOut_17_0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var11 = stackIn_18_0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (param9[5] == null) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackOut_20_0 = param9[5].d();
                        stackIn_23_0 = stackOut_20_0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackOut_22_0 = 0;
                        stackIn_23_0 = stackOut_22_0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var12 = stackIn_23_0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (null == param9[1]) {
                            statePc = 27;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackOut_25_0 = param9[1].c();
                        stackIn_28_0 = stackOut_25_0;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackOut_27_0 = 0;
                        stackIn_28_0 = stackOut_27_0;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var13 = stackIn_28_0;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (param9[7] != null) {
                            statePc = 32;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackOut_30_0 = 0;
                        stackIn_33_0 = stackOut_30_0;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackOut_32_0 = param9[7].c();
                        stackIn_33_0 = stackOut_32_0;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var14 = stackIn_33_0;
                        var15 = param2 - -param5;
                        var16 = param0 + param6;
                        var17 = var11 + param2;
                        var18 = var15 + -var12;
                        var19 = var13 + param0;
                        var21 = 49 / ((7 - param8) / 47);
                        var20 = var16 - var14;
                        var22 = var17;
                        var23 = var18;
                        if ((var23 ^ -1) <= (var22 ^ -1)) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var23 = param5 * var11 / (var12 + var11) + param2;
                        var22 = param5 * var11 / (var12 + var11) + param2;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var24 = var19;
                        var25 = var20;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if ((var24 ^ -1) < (var25 ^ -1)) {
                            statePc = 39;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var25 = var13 * param6 / (var14 + var13) + param0;
                        var24 = var13 * param6 / (var14 + var13) + param0;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (null == param9[0]) {
                            statePc = 44;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var10_ref.a(var22, param2, var24, param0, 77);
                        param9[0].a(param2, param0, param3, param1, param4);
                        var10_ref.a(true);
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (null != param9[2]) {
                            statePc = 47;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var10_ref.a(var15, var23, var24, param0, 84);
                        param9[2].a(var18, param0, param3, param1, param4);
                        var10_ref.a(true);
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (param9[6] != null) {
                            statePc = 51;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var10_ref.a(var22, param2, var16, var25, -99);
                        param9[6].a(param2, var20, param3, param1, param4);
                        var10_ref.a(true);
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (null == param9[8]) {
                            statePc = 56;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var10_ref.a(var15, var23, var16, var25, 118);
                        param9[8].a(var18, var20, param3, param1, param4);
                        var10_ref.a(true);
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
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (null == param9[1]) {
                            statePc = 71;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        stackOut_57_0 = -1;
                        stackIn_58_0 = stackOut_57_0;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (stackIn_58_0 != (param9[1].d() ^ -1)) {
                            statePc = 63;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        var10_ref.a(var23, var22, var24, param0, 76);
                        var26 = var17;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if ((var18 ^ -1) >= (var26 ^ -1)) {
                            statePc = 70;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        param9[1].a(var26, param0, param3, param1, param4);
                        var26 = var26 + param9[1].d();
                        stackOut_65_0 = var28;
                        stackIn_66_0 = stackOut_65_0;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (stackIn_66_0 != 0) {
                            statePc = 71;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (var28 == 0) {
                            statePc = 64;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        var10_ref.a(true);
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (null == param9[7]) {
                            statePc = 83;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if (-1 == (param9[7].d() ^ -1)) {
                            statePc = 83;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        var10_ref.a(var23, var22, var16, var25, 121);
                        var26 = var17;
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if ((var18 ^ -1) >= (var26 ^ -1)) {
                            statePc = 82;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        param9[7].a(var26, var20, param3, param1, param4);
                        var26 = var26 + param9[7].d();
                        stackOut_77_0 = var28;
                        stackIn_78_0 = stackOut_77_0;
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if (stackIn_78_0 != 0) {
                            statePc = 83;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        if (var28 == 0) {
                            statePc = 76;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        var10_ref.a(true);
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        if (param9[3] == null) {
                            statePc = 95;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        if (0 == param9[3].c()) {
                            statePc = 95;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        var10_ref.a(var22, param2, var25, var24, -112);
                        var26 = var19;
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        if (var26 >= var20) {
                            statePc = 94;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        param9[3].a(param2, var26, param3, param1, param4);
                        var26 = var26 + param9[3].c();
                        stackOut_89_0 = var28;
                        stackIn_90_0 = stackOut_89_0;
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        if (stackIn_90_0 != 0) {
                            statePc = 95;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        if (var28 == 0) {
                            statePc = 88;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        var10_ref.a(true);
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        if (null == param9[5]) {
                            statePc = 110;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        stackOut_96_0 = -1;
                        stackIn_97_0 = stackOut_96_0;
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        if (stackIn_97_0 != (param9[5].c() ^ -1)) {
                            statePc = 102;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        var10_ref.a(var15, var23, var25, var24, 100);
                        var26 = var19;
                        statePc = 103;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        if (var20 <= var26) {
                            statePc = 109;
                        } else {
                            statePc = 104;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        param9[5].a(var18, var26, param3, param1, param4);
                        var26 = var26 + param9[5].c();
                        stackOut_104_0 = var28;
                        stackIn_105_0 = stackOut_104_0;
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        if (stackIn_105_0 != 0) {
                            statePc = 110;
                        } else {
                            statePc = 106;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        if (var28 == 0) {
                            statePc = 103;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        var10_ref.a(true);
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        if (param9[4] == null) {
                            statePc = 145;
                        } else {
                            statePc = 111;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        stackOut_111_0 = 0;
                        stackIn_112_0 = stackOut_111_0;
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        if (stackIn_112_0 == param9[4].d()) {
                            statePc = 145;
                        } else {
                            statePc = 113;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        stackOut_115_0 = (pa[]) param9;
                        stackIn_116_0 = stackOut_115_0;
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        if ((((pa) (Object) stackIn_116_0[4]).c() ^ -1) != -1) {
                            statePc = 121;
                        } else {
                            statePc = 117;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        statePc = 119;
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        statePc = 145;
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        var10_ref.a(var23, var22, var25, var24, 93);
                        var26 = var19;
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        if (var26 >= var20) {
                            statePc = 133;
                        } else {
                            statePc = 123;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        if (var28 != 0) {
                            statePc = 145;
                        } else {
                            statePc = 124;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        var27 = var17;
                        statePc = 125;
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        if (var27 >= var18) {
                            statePc = 131;
                        } else {
                            statePc = 126;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        param9[4].a(var27, var26, param3, param1, param4);
                        var27 = var27 + param9[4].d();
                        stackOut_126_0 = var28;
                        stackIn_127_0 = stackOut_126_0;
                        statePc = 127;
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        if (stackIn_127_0 != 0) {
                            statePc = 132;
                        } else {
                            statePc = 128;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 130;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        if (var28 == 0) {
                            statePc = 125;
                        } else {
                            statePc = 129;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 130;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        statePc = 131;
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        var26 = var26 + param9[4].c();
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        if (var28 == 0) {
                            statePc = 122;
                        } else {
                            statePc = 133;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        var10_ref.a(true);
                        statePc = 145;
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 135: {
                    var10 = (RuntimeException) (Object) caughtException;
                    statePc = 136;
                    continue stateLoop;
                }
                case 136: {
                    try {
                        stackOut_136_0 = (RuntimeException) var10;
                        stackOut_136_1 = new StringBuilder().append("hb.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44).append(param6).append(44);
                        stackIn_139_0 = stackOut_136_0;
                        stackIn_139_1 = stackOut_136_1;
                        stackIn_137_0 = stackOut_136_0;
                        stackIn_137_1 = stackOut_136_1;
                        if (param7 == null) {
                            statePc = 139;
                        } else {
                            statePc = 137;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        stackOut_137_0 = (RuntimeException) (Object) stackIn_137_0;
                        stackOut_137_1 = (StringBuilder) (Object) stackIn_137_1;
                        stackOut_137_2 = "{...}";
                        stackIn_140_0 = stackOut_137_0;
                        stackIn_140_1 = stackOut_137_1;
                        stackIn_140_2 = stackOut_137_2;
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 138: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 139: {
                    stackOut_139_0 = (RuntimeException) (Object) stackIn_139_0;
                    stackOut_139_1 = (StringBuilder) (Object) stackIn_139_1;
                    stackOut_139_2 = "null";
                    stackIn_140_0 = stackOut_139_0;
                    stackIn_140_1 = stackOut_139_1;
                    stackIn_140_2 = stackOut_139_2;
                    statePc = 140;
                    continue stateLoop;
                }
                case 140: {
                    try {
                        stackOut_140_0 = (RuntimeException) (Object) stackIn_140_0;
                        stackOut_140_1 = ((StringBuilder) (Object) stackIn_140_1).append(stackIn_140_2).append(44).append(param8).append(44);
                        stackIn_143_0 = stackOut_140_0;
                        stackIn_143_1 = stackOut_140_1;
                        stackIn_141_0 = stackOut_140_0;
                        stackIn_141_1 = stackOut_140_1;
                        if (param9 == null) {
                            statePc = 143;
                        } else {
                            statePc = 141;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        stackOut_141_0 = (RuntimeException) (Object) stackIn_141_0;
                        stackOut_141_1 = (StringBuilder) (Object) stackIn_141_1;
                        stackOut_141_2 = "{...}";
                        stackIn_144_0 = stackOut_141_0;
                        stackIn_144_1 = stackOut_141_1;
                        stackIn_144_2 = stackOut_141_2;
                        statePc = 144;
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 142: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 143: {
                    stackOut_143_0 = (RuntimeException) (Object) stackIn_143_0;
                    stackOut_143_1 = (StringBuilder) (Object) stackIn_143_1;
                    stackOut_143_2 = "null";
                    stackIn_144_0 = stackOut_143_0;
                    stackIn_144_1 = stackOut_143_1;
                    stackIn_144_2 = stackOut_143_2;
                    statePc = 144;
                    continue stateLoop;
                }
                case 144: {
                    throw pn.a((Throwable) (Object) stackIn_144_0, (String) (Object) (stackIn_144_2 + 41));
                }
                case 145: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        if (param0 != -12029) {
            return;
        }
        try {
            field_a = null;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "hb.B(" + param0 + 41);
        }
    }

    static {
    }
}
