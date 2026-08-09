/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hb {
    static int field_b;
    static cc field_a;

    final static void a(dl param0, int param1) {
        try {
            Object stackIn_6_0 = null;
            Object stackIn_35_0 = null;
            int stackIn_39_0 = 0;
            int stackIn_101_0 = 0;
            RuntimeException stackIn_104_0 = null;
            StringBuilder stackIn_104_1 = null;
            RuntimeException stackIn_106_0 = null;
            StringBuilder stackIn_106_1 = null;
            RuntimeException stackIn_107_0 = null;
            StringBuilder stackIn_107_1 = null;
            String stackIn_107_2 = null;
            int decompiledRegionSelector0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            bb var2 = null;
            RuntimeException var2_ref = null;
            int var3 = 0;
            int var4 = 0;
            int var5 = 0;
            int var6_int = 0;
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
            java.lang.reflect.Field var7 = null;
            java.lang.reflect.Method var7_ref = null;
            int var8_int = 0;
            byte[][] var8 = null;
            Object[] var9 = null;
            int var10_int = 0;
            Object var10 = null;
            ObjectInputStream var11 = null;
            int var12 = 0;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var12 = AceOfSkies.field_G ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var2 = (bb) ((Object) av.field_c.d(param1 + 268410723));
                            if (var2 != null) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 103;
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
                            statePc = 103;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if ((var4 ^ -1) <= (var2.field_g ^ -1)) {
                                statePc = 28;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 103;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            stackIn_35_0 = null;
                            stackIn_6_0 = stackIn_35_0;
                            if (var12 != 0) {
                                statePc = 35;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 103;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (stackIn_6_0 == var2.field_f[var4]) {
                                statePc = 17;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 103;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 103;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            if ((var2.field_f[var4].field_a ^ -1) == -3) {
                                statePc = 14;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 103;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 103;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 103;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            var2.field_e[var4] = -5;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 103;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if ((var2.field_f[var4].field_a ^ -1) != -1) {
                                statePc = 17;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 103;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            var3 = 1;
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 103;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (null != var2.field_h[var4]) {
                                statePc = 20;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 103;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 103;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if ((var2.field_h[var4].field_a ^ -1) != -3) {
                                statePc = 23;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 103;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            var2.field_e[var4] = -6;
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 103;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (-1 == (var2.field_h[var4].field_a ^ -1)) {
                                statePc = 26;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 103;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 103;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            var3 = 1;
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 103;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var4++;
                            if (var12 == 0) {
                                statePc = 4;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 103;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            if (var3 != 0) {
                                statePc = 31;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 103;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 103;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        return;
                    }
                    case 32: {
                        try {
                            var4 = param0.field_g;
                            if (param1 == 24732) {
                                statePc = 36;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 103;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            stackIn_35_0 = null;
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 103;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            field_a = (cc) ((Object) stackIn_35_0);
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 103;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            param0.a((byte) 87, var2.field_j);
                            var5 = 0;
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 103;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            if (var5 >= var2.field_g) {
                                statePc = 100;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 103;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            stackIn_101_0 = 0;
                            stackIn_39_0 = stackIn_101_0;
                            if (var12 != 0) {
                                statePc = 101;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 103;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            if (stackIn_39_0 == var2.field_e[var5]) {
                                statePc = 45;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 103;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 103;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            param0.b(param1 ^ -1336888268, var2.field_e[var5]);
                            if (var12 == 0) {
                                statePc = 99;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 103;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            statePc = 45;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 103;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            var6_int = var2.field_l[var5];
                            if (-1 != (var6_int ^ -1)) {
                                statePc = 47;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = ((Object) stateCaught_45 instanceof ClassNotFoundException ? 87 : ((Object) stateCaught_45 instanceof InvalidClassException ? 88 : ((Object) stateCaught_45 instanceof StreamCorruptedException ? 89 : ((Object) stateCaught_45 instanceof OptionalDataException ? 90 : ((Object) stateCaught_45 instanceof IllegalAccessException ? 91 : ((Object) stateCaught_45 instanceof IllegalArgumentException ? 92 : ((Object) stateCaught_45 instanceof java.lang.reflect.InvocationTargetException ? 93 : ((Object) stateCaught_45 instanceof SecurityException ? 94 : ((Object) stateCaught_45 instanceof IOException ? 95 : ((Object) stateCaught_45 instanceof NullPointerException ? 96 : ((Object) stateCaught_45 instanceof Exception ? 97 : 98)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            var7 = (java.lang.reflect.Field) (var2.field_f[var5].field_f);
                            var8_int = var7.getInt((Object) null);
                            param0.b(-1336879960, 0);
                            param0.a((byte) 90, var8_int);
                            if (var12 == 0) {
                                statePc = 55;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = ((Object) stateCaught_46 instanceof ClassNotFoundException ? 87 : ((Object) stateCaught_46 instanceof InvalidClassException ? 88 : ((Object) stateCaught_46 instanceof StreamCorruptedException ? 89 : ((Object) stateCaught_46 instanceof OptionalDataException ? 90 : ((Object) stateCaught_46 instanceof IllegalAccessException ? 91 : ((Object) stateCaught_46 instanceof IllegalArgumentException ? 92 : ((Object) stateCaught_46 instanceof java.lang.reflect.InvocationTargetException ? 93 : ((Object) stateCaught_46 instanceof SecurityException ? 94 : ((Object) stateCaught_46 instanceof IOException ? 95 : ((Object) stateCaught_46 instanceof NullPointerException ? 96 : ((Object) stateCaught_46 instanceof Exception ? 97 : 98)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            if (1 != var6_int) {
                                statePc = 51;
                            } else {
                                statePc = 48;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = ((Object) stateCaught_47 instanceof ClassNotFoundException ? 87 : ((Object) stateCaught_47 instanceof InvalidClassException ? 88 : ((Object) stateCaught_47 instanceof StreamCorruptedException ? 89 : ((Object) stateCaught_47 instanceof OptionalDataException ? 90 : ((Object) stateCaught_47 instanceof IllegalAccessException ? 91 : ((Object) stateCaught_47 instanceof IllegalArgumentException ? 92 : ((Object) stateCaught_47 instanceof java.lang.reflect.InvocationTargetException ? 93 : ((Object) stateCaught_47 instanceof SecurityException ? 94 : ((Object) stateCaught_47 instanceof IOException ? 95 : ((Object) stateCaught_47 instanceof NullPointerException ? 96 : ((Object) stateCaught_47 instanceof Exception ? 97 : 98)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            statePc = 50;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = ((Object) stateCaught_48 instanceof ClassNotFoundException ? 87 : ((Object) stateCaught_48 instanceof InvalidClassException ? 88 : ((Object) stateCaught_48 instanceof StreamCorruptedException ? 89 : ((Object) stateCaught_48 instanceof OptionalDataException ? 90 : ((Object) stateCaught_48 instanceof IllegalAccessException ? 91 : ((Object) stateCaught_48 instanceof IllegalArgumentException ? 92 : ((Object) stateCaught_48 instanceof java.lang.reflect.InvocationTargetException ? 93 : ((Object) stateCaught_48 instanceof SecurityException ? 94 : ((Object) stateCaught_48 instanceof IOException ? 95 : ((Object) stateCaught_48 instanceof NullPointerException ? 96 : ((Object) stateCaught_48 instanceof Exception ? 97 : 98)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            var7 = (java.lang.reflect.Field) (var2.field_f[var5].field_f);
                            var7.setInt((Object) null, var2.field_i[var5]);
                            param0.b(-1336879960, 0);
                            if (var12 == 0) {
                                statePc = 55;
                            } else {
                                statePc = 51;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = ((Object) stateCaught_50 instanceof ClassNotFoundException ? 87 : ((Object) stateCaught_50 instanceof InvalidClassException ? 88 : ((Object) stateCaught_50 instanceof StreamCorruptedException ? 89 : ((Object) stateCaught_50 instanceof OptionalDataException ? 90 : ((Object) stateCaught_50 instanceof IllegalAccessException ? 91 : ((Object) stateCaught_50 instanceof IllegalArgumentException ? 92 : ((Object) stateCaught_50 instanceof java.lang.reflect.InvocationTargetException ? 93 : ((Object) stateCaught_50 instanceof SecurityException ? 94 : ((Object) stateCaught_50 instanceof IOException ? 95 : ((Object) stateCaught_50 instanceof NullPointerException ? 96 : ((Object) stateCaught_50 instanceof Exception ? 97 : 98)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            if (-3 != (var6_int ^ -1)) {
                                statePc = 55;
                            } else {
                                statePc = 52;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = ((Object) stateCaught_51 instanceof ClassNotFoundException ? 87 : ((Object) stateCaught_51 instanceof InvalidClassException ? 88 : ((Object) stateCaught_51 instanceof StreamCorruptedException ? 89 : ((Object) stateCaught_51 instanceof OptionalDataException ? 90 : ((Object) stateCaught_51 instanceof IllegalAccessException ? 91 : ((Object) stateCaught_51 instanceof IllegalArgumentException ? 92 : ((Object) stateCaught_51 instanceof java.lang.reflect.InvocationTargetException ? 93 : ((Object) stateCaught_51 instanceof SecurityException ? 94 : ((Object) stateCaught_51 instanceof IOException ? 95 : ((Object) stateCaught_51 instanceof NullPointerException ? 96 : ((Object) stateCaught_51 instanceof Exception ? 97 : 98)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = ((Object) stateCaught_52 instanceof ClassNotFoundException ? 87 : ((Object) stateCaught_52 instanceof InvalidClassException ? 88 : ((Object) stateCaught_52 instanceof StreamCorruptedException ? 89 : ((Object) stateCaught_52 instanceof OptionalDataException ? 90 : ((Object) stateCaught_52 instanceof IllegalAccessException ? 91 : ((Object) stateCaught_52 instanceof IllegalArgumentException ? 92 : ((Object) stateCaught_52 instanceof java.lang.reflect.InvocationTargetException ? 93 : ((Object) stateCaught_52 instanceof SecurityException ? 94 : ((Object) stateCaught_52 instanceof IOException ? 95 : ((Object) stateCaught_52 instanceof NullPointerException ? 96 : ((Object) stateCaught_52 instanceof Exception ? 97 : 98)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            var7 = (java.lang.reflect.Field) (var2.field_f[var5].field_f);
                            var8_int = var7.getModifiers();
                            param0.b(-1336879960, 0);
                            param0.a((byte) 28, var8_int);
                            statePc = 55;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = ((Object) stateCaught_54 instanceof ClassNotFoundException ? 87 : ((Object) stateCaught_54 instanceof InvalidClassException ? 88 : ((Object) stateCaught_54 instanceof StreamCorruptedException ? 89 : ((Object) stateCaught_54 instanceof OptionalDataException ? 90 : ((Object) stateCaught_54 instanceof IllegalAccessException ? 91 : ((Object) stateCaught_54 instanceof IllegalArgumentException ? 92 : ((Object) stateCaught_54 instanceof java.lang.reflect.InvocationTargetException ? 93 : ((Object) stateCaught_54 instanceof SecurityException ? 94 : ((Object) stateCaught_54 instanceof IOException ? 95 : ((Object) stateCaught_54 instanceof NullPointerException ? 96 : ((Object) stateCaught_54 instanceof Exception ? 97 : 98)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            if (3 == var6_int) {
                                statePc = 62;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = ((Object) stateCaught_55 instanceof ClassNotFoundException ? 87 : ((Object) stateCaught_55 instanceof InvalidClassException ? 88 : ((Object) stateCaught_55 instanceof StreamCorruptedException ? 89 : ((Object) stateCaught_55 instanceof OptionalDataException ? 90 : ((Object) stateCaught_55 instanceof IllegalAccessException ? 91 : ((Object) stateCaught_55 instanceof IllegalArgumentException ? 92 : ((Object) stateCaught_55 instanceof java.lang.reflect.InvocationTargetException ? 93 : ((Object) stateCaught_55 instanceof SecurityException ? 94 : ((Object) stateCaught_55 instanceof IOException ? 95 : ((Object) stateCaught_55 instanceof NullPointerException ? 96 : ((Object) stateCaught_55 instanceof Exception ? 97 : 98)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            if (var6_int == 4) {
                                statePc = 61;
                            } else {
                                statePc = 57;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = ((Object) stateCaught_56 instanceof ClassNotFoundException ? 87 : ((Object) stateCaught_56 instanceof InvalidClassException ? 88 : ((Object) stateCaught_56 instanceof StreamCorruptedException ? 89 : ((Object) stateCaught_56 instanceof OptionalDataException ? 90 : ((Object) stateCaught_56 instanceof IllegalAccessException ? 91 : ((Object) stateCaught_56 instanceof IllegalArgumentException ? 92 : ((Object) stateCaught_56 instanceof java.lang.reflect.InvocationTargetException ? 93 : ((Object) stateCaught_56 instanceof SecurityException ? 94 : ((Object) stateCaught_56 instanceof IOException ? 95 : ((Object) stateCaught_56 instanceof NullPointerException ? 96 : ((Object) stateCaught_56 instanceof Exception ? 97 : 98)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = ((Object) stateCaught_57 instanceof ClassNotFoundException ? 87 : ((Object) stateCaught_57 instanceof InvalidClassException ? 88 : ((Object) stateCaught_57 instanceof StreamCorruptedException ? 89 : ((Object) stateCaught_57 instanceof OptionalDataException ? 90 : ((Object) stateCaught_57 instanceof IllegalAccessException ? 91 : ((Object) stateCaught_57 instanceof IllegalArgumentException ? 92 : ((Object) stateCaught_57 instanceof java.lang.reflect.InvocationTargetException ? 93 : ((Object) stateCaught_57 instanceof SecurityException ? 94 : ((Object) stateCaught_57 instanceof IOException ? 95 : ((Object) stateCaught_57 instanceof NullPointerException ? 96 : ((Object) stateCaught_57 instanceof Exception ? 97 : 98)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            statePc = 86;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = ((Object) stateCaught_59 instanceof ClassNotFoundException ? 87 : ((Object) stateCaught_59 instanceof InvalidClassException ? 88 : ((Object) stateCaught_59 instanceof StreamCorruptedException ? 89 : ((Object) stateCaught_59 instanceof OptionalDataException ? 90 : ((Object) stateCaught_59 instanceof IllegalAccessException ? 91 : ((Object) stateCaught_59 instanceof IllegalArgumentException ? 92 : ((Object) stateCaught_59 instanceof java.lang.reflect.InvocationTargetException ? 93 : ((Object) stateCaught_59 instanceof SecurityException ? 94 : ((Object) stateCaught_59 instanceof IOException ? 95 : ((Object) stateCaught_59 instanceof NullPointerException ? 96 : ((Object) stateCaught_59 instanceof Exception ? 97 : 98)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            var7_ref = (java.lang.reflect.Method) (var2.field_h[var5].field_f);
                            var8_int = var7_ref.getModifiers();
                            param0.b(param1 + -1336904692, 0);
                            param0.a((byte) 65, var8_int);
                            if (var12 == 0) {
                                statePc = 86;
                            } else {
                                statePc = 62;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = ((Object) stateCaught_61 instanceof ClassNotFoundException ? 87 : ((Object) stateCaught_61 instanceof InvalidClassException ? 88 : ((Object) stateCaught_61 instanceof StreamCorruptedException ? 89 : ((Object) stateCaught_61 instanceof OptionalDataException ? 90 : ((Object) stateCaught_61 instanceof IllegalAccessException ? 91 : ((Object) stateCaught_61 instanceof IllegalArgumentException ? 92 : ((Object) stateCaught_61 instanceof java.lang.reflect.InvocationTargetException ? 93 : ((Object) stateCaught_61 instanceof SecurityException ? 94 : ((Object) stateCaught_61 instanceof IOException ? 95 : ((Object) stateCaught_61 instanceof NullPointerException ? 96 : ((Object) stateCaught_61 instanceof Exception ? 97 : 98)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            var7_ref = (java.lang.reflect.Method) (var2.field_h[var5].field_f);
                            var8 = var2.field_k[var5];
                            var9 = new Object[var8.length];
                            var10_int = 0;
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = ((Object) stateCaught_62 instanceof ClassNotFoundException ? 87 : ((Object) stateCaught_62 instanceof InvalidClassException ? 88 : ((Object) stateCaught_62 instanceof StreamCorruptedException ? 89 : ((Object) stateCaught_62 instanceof OptionalDataException ? 90 : ((Object) stateCaught_62 instanceof IllegalAccessException ? 91 : ((Object) stateCaught_62 instanceof IllegalArgumentException ? 92 : ((Object) stateCaught_62 instanceof java.lang.reflect.InvocationTargetException ? 93 : ((Object) stateCaught_62 instanceof SecurityException ? 94 : ((Object) stateCaught_62 instanceof IOException ? 95 : ((Object) stateCaught_62 instanceof NullPointerException ? 96 : ((Object) stateCaught_62 instanceof Exception ? 97 : 98)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            if ((var10_int ^ -1) <= (var8.length ^ -1)) {
                                statePc = 68;
                            } else {
                                statePc = 64;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = ((Object) stateCaught_63 instanceof ClassNotFoundException ? 87 : ((Object) stateCaught_63 instanceof InvalidClassException ? 88 : ((Object) stateCaught_63 instanceof StreamCorruptedException ? 89 : ((Object) stateCaught_63 instanceof OptionalDataException ? 90 : ((Object) stateCaught_63 instanceof IllegalAccessException ? 91 : ((Object) stateCaught_63 instanceof IllegalArgumentException ? 92 : ((Object) stateCaught_63 instanceof java.lang.reflect.InvocationTargetException ? 93 : ((Object) stateCaught_63 instanceof SecurityException ? 94 : ((Object) stateCaught_63 instanceof IOException ? 95 : ((Object) stateCaught_63 instanceof NullPointerException ? 96 : ((Object) stateCaught_63 instanceof Exception ? 97 : 98)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            var11 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var8[var10_int])));
                            var9[var10_int] = var11.readObject();
                            var10_int++;
                            if (var12 != 0) {
                                statePc = 86;
                            } else {
                                statePc = 65;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = ((Object) stateCaught_64 instanceof ClassNotFoundException ? 87 : ((Object) stateCaught_64 instanceof InvalidClassException ? 88 : ((Object) stateCaught_64 instanceof StreamCorruptedException ? 89 : ((Object) stateCaught_64 instanceof OptionalDataException ? 90 : ((Object) stateCaught_64 instanceof IllegalAccessException ? 91 : ((Object) stateCaught_64 instanceof IllegalArgumentException ? 92 : ((Object) stateCaught_64 instanceof java.lang.reflect.InvocationTargetException ? 93 : ((Object) stateCaught_64 instanceof SecurityException ? 94 : ((Object) stateCaught_64 instanceof IOException ? 95 : ((Object) stateCaught_64 instanceof NullPointerException ? 96 : ((Object) stateCaught_64 instanceof Exception ? 97 : 98)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            if (var12 == 0) {
                                statePc = 63;
                            } else {
                                statePc = 66;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = ((Object) stateCaught_65 instanceof ClassNotFoundException ? 87 : ((Object) stateCaught_65 instanceof InvalidClassException ? 88 : ((Object) stateCaught_65 instanceof StreamCorruptedException ? 89 : ((Object) stateCaught_65 instanceof OptionalDataException ? 90 : ((Object) stateCaught_65 instanceof IllegalAccessException ? 91 : ((Object) stateCaught_65 instanceof IllegalArgumentException ? 92 : ((Object) stateCaught_65 instanceof java.lang.reflect.InvocationTargetException ? 93 : ((Object) stateCaught_65 instanceof SecurityException ? 94 : ((Object) stateCaught_65 instanceof IOException ? 95 : ((Object) stateCaught_65 instanceof NullPointerException ? 96 : ((Object) stateCaught_65 instanceof Exception ? 97 : 98)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = ((Object) stateCaught_66 instanceof ClassNotFoundException ? 87 : ((Object) stateCaught_66 instanceof InvalidClassException ? 88 : ((Object) stateCaught_66 instanceof StreamCorruptedException ? 89 : ((Object) stateCaught_66 instanceof OptionalDataException ? 90 : ((Object) stateCaught_66 instanceof IllegalAccessException ? 91 : ((Object) stateCaught_66 instanceof IllegalArgumentException ? 92 : ((Object) stateCaught_66 instanceof java.lang.reflect.InvocationTargetException ? 93 : ((Object) stateCaught_66 instanceof SecurityException ? 94 : ((Object) stateCaught_66 instanceof IOException ? 95 : ((Object) stateCaught_66 instanceof NullPointerException ? 96 : ((Object) stateCaught_66 instanceof Exception ? 97 : 98)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            var10 = var7_ref.invoke((Object) null, var9);
                            if (var10 != null) {
                                statePc = 72;
                            } else {
                                statePc = 69;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = ((Object) stateCaught_68 instanceof ClassNotFoundException ? 87 : ((Object) stateCaught_68 instanceof InvalidClassException ? 88 : ((Object) stateCaught_68 instanceof StreamCorruptedException ? 89 : ((Object) stateCaught_68 instanceof OptionalDataException ? 90 : ((Object) stateCaught_68 instanceof IllegalAccessException ? 91 : ((Object) stateCaught_68 instanceof IllegalArgumentException ? 92 : ((Object) stateCaught_68 instanceof java.lang.reflect.InvocationTargetException ? 93 : ((Object) stateCaught_68 instanceof SecurityException ? 94 : ((Object) stateCaught_68 instanceof IOException ? 95 : ((Object) stateCaught_68 instanceof NullPointerException ? 96 : ((Object) stateCaught_68 instanceof Exception ? 97 : 98)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            param0.b(-1336879960, 0);
                            if (var12 == 0) {
                                statePc = 86;
                            } else {
                                statePc = 70;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = ((Object) stateCaught_69 instanceof ClassNotFoundException ? 87 : ((Object) stateCaught_69 instanceof InvalidClassException ? 88 : ((Object) stateCaught_69 instanceof StreamCorruptedException ? 89 : ((Object) stateCaught_69 instanceof OptionalDataException ? 90 : ((Object) stateCaught_69 instanceof IllegalAccessException ? 91 : ((Object) stateCaught_69 instanceof IllegalArgumentException ? 92 : ((Object) stateCaught_69 instanceof java.lang.reflect.InvocationTargetException ? 93 : ((Object) stateCaught_69 instanceof SecurityException ? 94 : ((Object) stateCaught_69 instanceof IOException ? 95 : ((Object) stateCaught_69 instanceof NullPointerException ? 96 : ((Object) stateCaught_69 instanceof Exception ? 97 : 98)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = ((Object) stateCaught_70 instanceof ClassNotFoundException ? 87 : ((Object) stateCaught_70 instanceof InvalidClassException ? 88 : ((Object) stateCaught_70 instanceof StreamCorruptedException ? 89 : ((Object) stateCaught_70 instanceof OptionalDataException ? 90 : ((Object) stateCaught_70 instanceof IllegalAccessException ? 91 : ((Object) stateCaught_70 instanceof IllegalArgumentException ? 92 : ((Object) stateCaught_70 instanceof java.lang.reflect.InvocationTargetException ? 93 : ((Object) stateCaught_70 instanceof SecurityException ? 94 : ((Object) stateCaught_70 instanceof IOException ? 95 : ((Object) stateCaught_70 instanceof NullPointerException ? 96 : ((Object) stateCaught_70 instanceof Exception ? 97 : 98)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            if (var10 instanceof Number) {
                                statePc = 84;
                            } else {
                                statePc = 73;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = ((Object) stateCaught_72 instanceof ClassNotFoundException ? 87 : ((Object) stateCaught_72 instanceof InvalidClassException ? 88 : ((Object) stateCaught_72 instanceof StreamCorruptedException ? 89 : ((Object) stateCaught_72 instanceof OptionalDataException ? 90 : ((Object) stateCaught_72 instanceof IllegalAccessException ? 91 : ((Object) stateCaught_72 instanceof IllegalArgumentException ? 92 : ((Object) stateCaught_72 instanceof java.lang.reflect.InvocationTargetException ? 93 : ((Object) stateCaught_72 instanceof SecurityException ? 94 : ((Object) stateCaught_72 instanceof IOException ? 95 : ((Object) stateCaught_72 instanceof NullPointerException ? 96 : ((Object) stateCaught_72 instanceof Exception ? 97 : 98)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            statePc = 75;
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = ((Object) stateCaught_73 instanceof ClassNotFoundException ? 87 : ((Object) stateCaught_73 instanceof InvalidClassException ? 88 : ((Object) stateCaught_73 instanceof StreamCorruptedException ? 89 : ((Object) stateCaught_73 instanceof OptionalDataException ? 90 : ((Object) stateCaught_73 instanceof IllegalAccessException ? 91 : ((Object) stateCaught_73 instanceof IllegalArgumentException ? 92 : ((Object) stateCaught_73 instanceof java.lang.reflect.InvocationTargetException ? 93 : ((Object) stateCaught_73 instanceof SecurityException ? 94 : ((Object) stateCaught_73 instanceof IOException ? 95 : ((Object) stateCaught_73 instanceof NullPointerException ? 96 : ((Object) stateCaught_73 instanceof Exception ? 97 : 98)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            if (var10 instanceof String) {
                                statePc = 81;
                            } else {
                                statePc = 76;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = ((Object) stateCaught_75 instanceof ClassNotFoundException ? 87 : ((Object) stateCaught_75 instanceof InvalidClassException ? 88 : ((Object) stateCaught_75 instanceof StreamCorruptedException ? 89 : ((Object) stateCaught_75 instanceof OptionalDataException ? 90 : ((Object) stateCaught_75 instanceof IllegalAccessException ? 91 : ((Object) stateCaught_75 instanceof IllegalArgumentException ? 92 : ((Object) stateCaught_75 instanceof java.lang.reflect.InvocationTargetException ? 93 : ((Object) stateCaught_75 instanceof SecurityException ? 94 : ((Object) stateCaught_75 instanceof IOException ? 95 : ((Object) stateCaught_75 instanceof NullPointerException ? 96 : ((Object) stateCaught_75 instanceof Exception ? 97 : 98)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            statePc = 78;
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = ((Object) stateCaught_76 instanceof ClassNotFoundException ? 87 : ((Object) stateCaught_76 instanceof InvalidClassException ? 88 : ((Object) stateCaught_76 instanceof StreamCorruptedException ? 89 : ((Object) stateCaught_76 instanceof OptionalDataException ? 90 : ((Object) stateCaught_76 instanceof IllegalAccessException ? 91 : ((Object) stateCaught_76 instanceof IllegalArgumentException ? 92 : ((Object) stateCaught_76 instanceof java.lang.reflect.InvocationTargetException ? 93 : ((Object) stateCaught_76 instanceof SecurityException ? 94 : ((Object) stateCaught_76 instanceof IOException ? 95 : ((Object) stateCaught_76 instanceof NullPointerException ? 96 : ((Object) stateCaught_76 instanceof Exception ? 97 : 98)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            param0.b(-1336879960, 4);
                            if (var12 == 0) {
                                statePc = 86;
                            } else {
                                statePc = 79;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = ((Object) stateCaught_78 instanceof ClassNotFoundException ? 87 : ((Object) stateCaught_78 instanceof InvalidClassException ? 88 : ((Object) stateCaught_78 instanceof StreamCorruptedException ? 89 : ((Object) stateCaught_78 instanceof OptionalDataException ? 90 : ((Object) stateCaught_78 instanceof IllegalAccessException ? 91 : ((Object) stateCaught_78 instanceof IllegalArgumentException ? 92 : ((Object) stateCaught_78 instanceof java.lang.reflect.InvocationTargetException ? 93 : ((Object) stateCaught_78 instanceof SecurityException ? 94 : ((Object) stateCaught_78 instanceof IOException ? 95 : ((Object) stateCaught_78 instanceof NullPointerException ? 96 : ((Object) stateCaught_78 instanceof Exception ? 97 : 98)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            statePc = 81;
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = ((Object) stateCaught_79 instanceof ClassNotFoundException ? 87 : ((Object) stateCaught_79 instanceof InvalidClassException ? 88 : ((Object) stateCaught_79 instanceof StreamCorruptedException ? 89 : ((Object) stateCaught_79 instanceof OptionalDataException ? 90 : ((Object) stateCaught_79 instanceof IllegalAccessException ? 91 : ((Object) stateCaught_79 instanceof IllegalArgumentException ? 92 : ((Object) stateCaught_79 instanceof java.lang.reflect.InvocationTargetException ? 93 : ((Object) stateCaught_79 instanceof SecurityException ? 94 : ((Object) stateCaught_79 instanceof IOException ? 95 : ((Object) stateCaught_79 instanceof NullPointerException ? 96 : ((Object) stateCaught_79 instanceof Exception ? 97 : 98)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            param0.b(-1336879960, 2);
                            param0.a(-47, (String) (var10));
                            if (var12 == 0) {
                                statePc = 86;
                            } else {
                                statePc = 82;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = ((Object) stateCaught_81 instanceof ClassNotFoundException ? 87 : ((Object) stateCaught_81 instanceof InvalidClassException ? 88 : ((Object) stateCaught_81 instanceof StreamCorruptedException ? 89 : ((Object) stateCaught_81 instanceof OptionalDataException ? 90 : ((Object) stateCaught_81 instanceof IllegalAccessException ? 91 : ((Object) stateCaught_81 instanceof IllegalArgumentException ? 92 : ((Object) stateCaught_81 instanceof java.lang.reflect.InvocationTargetException ? 93 : ((Object) stateCaught_81 instanceof SecurityException ? 94 : ((Object) stateCaught_81 instanceof IOException ? 95 : ((Object) stateCaught_81 instanceof NullPointerException ? 96 : ((Object) stateCaught_81 instanceof Exception ? 97 : 98)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = ((Object) stateCaught_82 instanceof ClassNotFoundException ? 87 : ((Object) stateCaught_82 instanceof InvalidClassException ? 88 : ((Object) stateCaught_82 instanceof StreamCorruptedException ? 89 : ((Object) stateCaught_82 instanceof OptionalDataException ? 90 : ((Object) stateCaught_82 instanceof IllegalAccessException ? 91 : ((Object) stateCaught_82 instanceof IllegalArgumentException ? 92 : ((Object) stateCaught_82 instanceof java.lang.reflect.InvocationTargetException ? 93 : ((Object) stateCaught_82 instanceof SecurityException ? 94 : ((Object) stateCaught_82 instanceof IOException ? 95 : ((Object) stateCaught_82 instanceof NullPointerException ? 96 : ((Object) stateCaught_82 instanceof Exception ? 97 : 98)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            param0.b(-1336879960, 1);
                            param0.b((byte) -102, ((Number) (var10)).longValue());
                            statePc = 86;
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = ((Object) stateCaught_84 instanceof ClassNotFoundException ? 87 : ((Object) stateCaught_84 instanceof InvalidClassException ? 88 : ((Object) stateCaught_84 instanceof StreamCorruptedException ? 89 : ((Object) stateCaught_84 instanceof OptionalDataException ? 90 : ((Object) stateCaught_84 instanceof IllegalAccessException ? 91 : ((Object) stateCaught_84 instanceof IllegalArgumentException ? 92 : ((Object) stateCaught_84 instanceof java.lang.reflect.InvocationTargetException ? 93 : ((Object) stateCaught_84 instanceof SecurityException ? 94 : ((Object) stateCaught_84 instanceof IOException ? 95 : ((Object) stateCaught_84 instanceof NullPointerException ? 96 : ((Object) stateCaught_84 instanceof Exception ? 97 : 98)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            statePc = 99;
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = 103;
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            var6 = (ClassNotFoundException) ((Object) caughtException);
                            param0.b(-1336879960, -10);
                            statePc = 99;
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = 103;
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            var6_ref = (InvalidClassException) ((Object) caughtException);
                            param0.b(-1336879960, -11);
                            statePc = 99;
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = 103;
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            var6_ref2 = (StreamCorruptedException) ((Object) caughtException);
                            param0.b(-1336879960, -12);
                            statePc = 99;
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = 103;
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            var6_ref3 = (OptionalDataException) ((Object) caughtException);
                            param0.b(param1 + -1336904692, -13);
                            statePc = 99;
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = 103;
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            var6_ref4 = (IllegalAccessException) ((Object) caughtException);
                            param0.b(-1336879960, -14);
                            statePc = 99;
                            continue stateLoop;
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = 103;
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            var6_ref5 = (IllegalArgumentException) ((Object) caughtException);
                            param0.b(-1336879960, -15);
                            statePc = 99;
                            continue stateLoop;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = 103;
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            var6_ref6 = (java.lang.reflect.InvocationTargetException) ((Object) caughtException);
                            param0.b(-1336879960, -16);
                            statePc = 99;
                            continue stateLoop;
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = 103;
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        try {
                            var6_ref7 = (SecurityException) ((Object) caughtException);
                            param0.b(-1336879960, -17);
                            statePc = 99;
                            continue stateLoop;
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = 103;
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        try {
                            var6_ref8 = (IOException) ((Object) caughtException);
                            param0.b(-1336879960, -18);
                            statePc = 99;
                            continue stateLoop;
                        } catch (Throwable stateCaught_95) {
                            caughtException = stateCaught_95;
                            statePc = 103;
                            continue stateLoop;
                        }
                    }
                    case 96: {
                        try {
                            var6_ref9 = (NullPointerException) ((Object) caughtException);
                            param0.b(-1336879960, -19);
                            statePc = 99;
                            continue stateLoop;
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = 103;
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            var6_ref10 = (Exception) ((Object) caughtException);
                            param0.b(-1336879960, -20);
                            statePc = 99;
                            continue stateLoop;
                        } catch (Throwable stateCaught_97) {
                            caughtException = stateCaught_97;
                            statePc = 103;
                            continue stateLoop;
                        }
                    }
                    case 98: {
                        try {
                            var6_ref11 = caughtException;
                            param0.b(-1336879960, -21);
                            statePc = 99;
                            continue stateLoop;
                        } catch (Throwable stateCaught_98) {
                            caughtException = stateCaught_98;
                            statePc = 103;
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            var5++;
                            if (var12 == 0) {
                                statePc = 37;
                            } else {
                                statePc = 100;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = 103;
                            continue stateLoop;
                        }
                    }
                    case 100: {
                        try {
                            stackIn_101_0 = param0.e(var4, 56);
                            statePc = 101;
                            continue stateLoop;
                        } catch (Throwable stateCaught_100) {
                            caughtException = stateCaught_100;
                            statePc = 103;
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        try {
                            var2.c(-125);
                            statePc = 102;
                            continue stateLoop;
                        } catch (Throwable stateCaught_101) {
                            caughtException = stateCaught_101;
                            statePc = 103;
                            continue stateLoop;
                        }
                    }
                    case 102: {
                        return;
                    }
                    case 103: {
                        var2_ref = (RuntimeException) ((Object) caughtException);
                        stackIn_106_0 = (RuntimeException) (var2_ref);
                        stackIn_104_0 = stackIn_106_0;
                        stackIn_106_1 = new StringBuilder().append("hb.C(");
                        stackIn_104_1 = stackIn_106_1;
                        if (param0 == null) {
                            statePc = 106;
                        } else {
                            statePc = 104;
                        }
                        continue stateLoop;
                    }
                    case 104: {
                        stackIn_107_0 = (RuntimeException) ((Object) stackIn_104_0);
                        stackIn_107_1 = (StringBuilder) ((Object) stackIn_104_1);
                        stackIn_107_2 = "{...}";
                        statePc = 107;
                        continue stateLoop;
                    }
                    case 106: {
                        stackIn_107_0 = (RuntimeException) ((Object) stackIn_106_0);
                        stackIn_107_1 = (StringBuilder) ((Object) stackIn_106_1);
                        stackIn_107_2 = "null";
                        statePc = 107;
                        continue stateLoop;
                    }
                    case 107: {
                        throw pn.a((Throwable) ((Object) stackIn_107_0), stackIn_107_2 + ',' + param1 + ')');
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
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_119_0 = null;
        StringBuilder stackIn_119_1 = null;
        RuntimeException stackIn_121_0 = null;
        StringBuilder stackIn_121_1 = null;
        RuntimeException stackIn_122_0 = null;
        StringBuilder stackIn_122_1 = null;
        String stackIn_122_2 = null;
        RuntimeException stackIn_123_0 = null;
        StringBuilder stackIn_123_1 = null;
        RuntimeException stackIn_125_0 = null;
        StringBuilder stackIn_125_1 = null;
        RuntimeException stackIn_126_0 = null;
        StringBuilder stackIn_126_1 = null;
        String stackIn_126_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        bo var10 = null;
        RuntimeException var10_ref = null;
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
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var28 = AceOfSkies.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var10 = fa.a(param7, true);
                        if (param9 == null) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return;
                }
                case 5: {
                    try {
                        if (0 >= param5) {
                            statePc = 11;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (-1 <= (param6 ^ -1)) {
                            statePc = 11;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 11: {
                    return;
                }
                case 12: {
                    try {
                        if (null == param9[3]) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackIn_16_0 = param9[3].d();
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackIn_16_0 = 0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var11 = stackIn_16_0;
                        if (param9[5] == null) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackIn_20_0 = param9[5].d();
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackIn_20_0 = 0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var12 = stackIn_20_0;
                        if (null == param9[1]) {
                            statePc = 23;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackIn_24_0 = param9[1].c();
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackIn_24_0 = 0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var13 = stackIn_24_0;
                        if (param9[7] != null) {
                            statePc = 27;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackIn_28_0 = 0;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackIn_28_0 = param9[7].c();
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var14 = stackIn_28_0;
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
                            statePc = 30;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var23 = param5 * var11 / (var12 + var11) + param2;
                        var22 = param5 * var11 / (var12 + var11) + param2;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var24 = var19;
                        var25 = var20;
                        if ((var24 ^ -1) < (var25 ^ -1)) {
                            statePc = 33;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var25 = var13 * param6 / (var14 + var13) + param0;
                        var24 = var13 * param6 / (var14 + var13) + param0;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (null == param9[0]) {
                            statePc = 37;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var10.a(var22, param2, var24, param0, 77);
                        param9[0].a(param2, param0, param3, param1, param4);
                        var10.a(true);
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (null != param9[2]) {
                            statePc = 40;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var10.a(var15, var23, var24, param0, 84);
                        param9[2].a(var18, param0, param3, param1, param4);
                        var10.a(true);
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (param9[6] != null) {
                            statePc = 44;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var10.a(var22, param2, var16, var25, -99);
                        param9[6].a(param2, var20, param3, param1, param4);
                        var10.a(true);
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (null == param9[8]) {
                            statePc = 48;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var10.a(var15, var23, var16, var25, 118);
                        param9[8].a(var18, var20, param3, param1, param4);
                        var10.a(true);
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (null == param9[1]) {
                            statePc = 61;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (-1 != (param9[1].d() ^ -1)) {
                            statePc = 54;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var10.a(var23, var22, var24, param0, 76);
                        var26 = var17;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if ((var18 ^ -1) >= (var26 ^ -1)) {
                            statePc = 60;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        param9[1].a(var26, param0, param3, param1, param4);
                        var26 = var26 + param9[1].d();
                        if (var28 != 0) {
                            statePc = 61;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (var28 == 0) {
                            statePc = 55;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var10.a(true);
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (null == param9[7]) {
                            statePc = 72;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (-1 == (param9[7].d() ^ -1)) {
                            statePc = 72;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var10.a(var23, var22, var16, var25, 121);
                        var26 = var17;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if ((var18 ^ -1) >= (var26 ^ -1)) {
                            statePc = 71;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        param9[7].a(var26, var20, param3, param1, param4);
                        var26 = var26 + param9[7].d();
                        if (var28 != 0) {
                            statePc = 72;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if (var28 == 0) {
                            statePc = 66;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        var10.a(true);
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if (param9[3] == null) {
                            statePc = 83;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if (0 == param9[3].c()) {
                            statePc = 83;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        var10.a(var22, param2, var25, var24, -112);
                        var26 = var19;
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        if (var26 >= var20) {
                            statePc = 82;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        param9[3].a(param2, var26, param3, param1, param4);
                        var26 = var26 + param9[3].c();
                        if (var28 != 0) {
                            statePc = 83;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        if (var28 == 0) {
                            statePc = 77;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        var10.a(true);
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        if (null == param9[5]) {
                            statePc = 96;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        if (-1 != (param9[5].c() ^ -1)) {
                            statePc = 89;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        var10.a(var15, var23, var25, var24, 100);
                        var26 = var19;
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        if (var20 <= var26) {
                            statePc = 95;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        param9[5].a(var18, var26, param3, param1, param4);
                        var26 = var26 + param9[5].c();
                        if (var28 != 0) {
                            statePc = 96;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        if (var28 == 0) {
                            statePc = 90;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        var10.a(true);
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        if (param9[4] == null) {
                            statePc = 127;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        if (0 == param9[4].d()) {
                            statePc = 127;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        if ((param9[4].c() ^ -1) != -1) {
                            statePc = 105;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        statePc = 103;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        statePc = 127;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        var10.a(var23, var22, var25, var24, 93);
                        var26 = var19;
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        if (var26 >= var20) {
                            statePc = 116;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        if (var28 != 0) {
                            statePc = 127;
                        } else {
                            statePc = 108;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        var27 = var17;
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        if (var27 >= var18) {
                            statePc = 114;
                        } else {
                            statePc = 110;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        param9[4].a(var27, var26, param3, param1, param4);
                        var27 = var27 + param9[4].d();
                        if (var28 != 0) {
                            statePc = 115;
                        } else {
                            statePc = 111;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        if (var28 == 0) {
                            statePc = 109;
                        } else {
                            statePc = 112;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        var26 = var26 + param9[4].c();
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        if (var28 == 0) {
                            statePc = 106;
                        } else {
                            statePc = 116;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        var10.a(true);
                        statePc = 127;
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 118: {
                    var10_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_121_0 = (RuntimeException) (var10_ref);
                    stackIn_119_0 = stackIn_121_0;
                    stackIn_121_1 = new StringBuilder().append("hb.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
                    stackIn_119_1 = stackIn_121_1;
                    if (param7 == null) {
                        statePc = 121;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    stackIn_122_0 = (RuntimeException) ((Object) stackIn_119_0);
                    stackIn_122_1 = (StringBuilder) ((Object) stackIn_119_1);
                    stackIn_122_2 = "{...}";
                    statePc = 122;
                    continue stateLoop;
                }
                case 121: {
                    stackIn_122_0 = (RuntimeException) ((Object) stackIn_121_0);
                    stackIn_122_1 = (StringBuilder) ((Object) stackIn_121_1);
                    stackIn_122_2 = "null";
                    statePc = 122;
                    continue stateLoop;
                }
                case 122: {
                    stackIn_125_0 = (RuntimeException) ((Object) stackIn_122_0);
                    stackIn_123_0 = stackIn_125_0;
                    stackIn_125_1 = ((StringBuilder) (Object) stackIn_122_1).append(stackIn_122_2).append(',').append(param8).append(',');
                    stackIn_123_1 = stackIn_125_1;
                    if (param9 == null) {
                        statePc = 125;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    stackIn_126_0 = (RuntimeException) ((Object) stackIn_123_0);
                    stackIn_126_1 = (StringBuilder) ((Object) stackIn_123_1);
                    stackIn_126_2 = "{...}";
                    statePc = 126;
                    continue stateLoop;
                }
                case 125: {
                    stackIn_126_0 = (RuntimeException) ((Object) stackIn_125_0);
                    stackIn_126_1 = (StringBuilder) ((Object) stackIn_125_1);
                    stackIn_126_2 = "null";
                    statePc = 126;
                    continue stateLoop;
                }
                case 126: {
                    throw pn.a((Throwable) ((Object) stackIn_126_0), stackIn_126_2 + ')');
                }
                case 127: {
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
            throw pn.a((Throwable) ((Object) runtimeException), "hb.B(" + param0 + ')');
        }
    }

    static {
    }
}
