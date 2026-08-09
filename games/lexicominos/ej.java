/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ej {
    static bj field_a;
    static db[] field_b;
    static sh field_d;
    static int[] field_c;

    public static void a(int param0) {
        field_b = null;
        if (param0 != -4) {
            field_a = (bj) null;
        }
        field_c = null;
        field_a = null;
        field_d = null;
    }

    final static void a(int param0, th param1) {
        try {
            int stackIn_30_0 = 0;
            int stackIn_74_0 = 0;
            RuntimeException stackIn_77_0 = null;
            StringBuilder stackIn_77_1 = null;
            RuntimeException stackIn_78_0 = null;
            StringBuilder stackIn_78_1 = null;
            RuntimeException stackIn_79_0 = null;
            StringBuilder stackIn_79_1 = null;
            String stackIn_79_2 = null;
            int decompiledRegionSelector0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            RuntimeException var2 = null;
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
            int var8 = 0;
            Object[] var9 = null;
            int var10_int = 0;
            Object var10 = null;
            ObjectInputStream var11 = null;
            int var12 = 0;
            pd var13 = null;
            java.lang.reflect.Field var14 = null;
            java.lang.reflect.Field var15 = null;
            pd var17 = null;
            Object var18 = null;
            Object var19 = null;
            Object var21 = null;
            byte[][] var24 = null;
            java.lang.reflect.Field var25 = null;
            java.lang.reflect.Method var26 = null;
            java.lang.reflect.Method var27 = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var18 = null;
                        var19 = null;
                        var21 = null;
                        var12 = Lexicominos.field_L ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (param0 == -17) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            field_b = (db[]) null;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var13 = (pd) ((Object) al.field_C.a(true));
                            var17 = var13;
                            if (var17 == null) {
                                statePc = 5;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        return;
                    }
                    case 6: {
                        try {
                            var3 = 0;
                            var4 = 0;
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (var4 >= var17.field_p) {
                                statePc = 24;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if (var12 != 0) {
                                statePc = 26;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            if (null != var13.field_k[var4]) {
                                statePc = 11;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            if (2 != var13.field_k[var4].field_b) {
                                statePc = 13;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            var13.field_n[var4] = -5;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            if (-1 != (var13.field_k[var4].field_b ^ -1)) {
                                statePc = 15;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            var3 = 1;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (var13.field_i[var4] != null) {
                                statePc = 17;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if ((var13.field_i[var4].field_b ^ -1) == -3) {
                                statePc = 19;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            var13.field_n[var4] = -6;
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (-1 == (var13.field_i[var4].field_b ^ -1)) {
                                statePc = 22;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            var3 = 1;
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            var4++;
                            if (var12 == 0) {
                                statePc = 7;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if (var3 != 0) {
                                statePc = 26;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        return;
                    }
                    case 27: {
                        try {
                            var4 = param1.field_h;
                            param1.f(var17.field_j, -32287);
                            var5 = 0;
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            if (var17.field_p <= var5) {
                                statePc = 73;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            stackIn_74_0 = 0;
                            stackIn_30_0 = stackIn_74_0;
                            if (var12 != 0) {
                                statePc = 74;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if (stackIn_30_0 != var13.field_n[var5]) {
                                statePc = 32;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            param1.c(var13.field_n[var5], -1);
                            if (var12 == 0) {
                                statePc = 72;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            var6_int = var13.field_m[var5];
                            if (-1 == (var6_int ^ -1)) {
                                statePc = 39;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = ((Object) stateCaught_33 instanceof ClassNotFoundException ? 60 : ((Object) stateCaught_33 instanceof InvalidClassException ? 61 : ((Object) stateCaught_33 instanceof StreamCorruptedException ? 62 : ((Object) stateCaught_33 instanceof OptionalDataException ? 63 : ((Object) stateCaught_33 instanceof IllegalAccessException ? 64 : ((Object) stateCaught_33 instanceof IllegalArgumentException ? 65 : ((Object) stateCaught_33 instanceof java.lang.reflect.InvocationTargetException ? 66 : ((Object) stateCaught_33 instanceof SecurityException ? 67 : ((Object) stateCaught_33 instanceof IOException ? 68 : ((Object) stateCaught_33 instanceof NullPointerException ? 69 : ((Object) stateCaught_33 instanceof Exception ? 70 : 71)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if ((var6_int ^ -1) == -2) {
                                statePc = 38;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = ((Object) stateCaught_34 instanceof ClassNotFoundException ? 60 : ((Object) stateCaught_34 instanceof InvalidClassException ? 61 : ((Object) stateCaught_34 instanceof StreamCorruptedException ? 62 : ((Object) stateCaught_34 instanceof OptionalDataException ? 63 : ((Object) stateCaught_34 instanceof IllegalAccessException ? 64 : ((Object) stateCaught_34 instanceof IllegalArgumentException ? 65 : ((Object) stateCaught_34 instanceof java.lang.reflect.InvocationTargetException ? 66 : ((Object) stateCaught_34 instanceof SecurityException ? 67 : ((Object) stateCaught_34 instanceof IOException ? 68 : ((Object) stateCaught_34 instanceof NullPointerException ? 69 : ((Object) stateCaught_34 instanceof Exception ? 70 : 71)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            if (-3 == (var6_int ^ -1)) {
                                statePc = 37;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = ((Object) stateCaught_35 instanceof ClassNotFoundException ? 60 : ((Object) stateCaught_35 instanceof InvalidClassException ? 61 : ((Object) stateCaught_35 instanceof StreamCorruptedException ? 62 : ((Object) stateCaught_35 instanceof OptionalDataException ? 63 : ((Object) stateCaught_35 instanceof IllegalAccessException ? 64 : ((Object) stateCaught_35 instanceof IllegalArgumentException ? 65 : ((Object) stateCaught_35 instanceof java.lang.reflect.InvocationTargetException ? 66 : ((Object) stateCaught_35 instanceof SecurityException ? 67 : ((Object) stateCaught_35 instanceof IOException ? 68 : ((Object) stateCaught_35 instanceof NullPointerException ? 69 : ((Object) stateCaught_35 instanceof Exception ? 70 : 71)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            statePc = 40;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = ((Object) stateCaught_36 instanceof ClassNotFoundException ? 60 : ((Object) stateCaught_36 instanceof InvalidClassException ? 61 : ((Object) stateCaught_36 instanceof StreamCorruptedException ? 62 : ((Object) stateCaught_36 instanceof OptionalDataException ? 63 : ((Object) stateCaught_36 instanceof IllegalAccessException ? 64 : ((Object) stateCaught_36 instanceof IllegalArgumentException ? 65 : ((Object) stateCaught_36 instanceof java.lang.reflect.InvocationTargetException ? 66 : ((Object) stateCaught_36 instanceof SecurityException ? 67 : ((Object) stateCaught_36 instanceof IOException ? 68 : ((Object) stateCaught_36 instanceof NullPointerException ? 69 : ((Object) stateCaught_36 instanceof Exception ? 70 : 71)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            var25 = (java.lang.reflect.Field) (var13.field_k[var5].field_g);
                            var8 = var25.getModifiers();
                            param1.c(0, -1);
                            param1.f(var8, -32287);
                            if (var12 == 0) {
                                statePc = 40;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = ((Object) stateCaught_37 instanceof ClassNotFoundException ? 60 : ((Object) stateCaught_37 instanceof InvalidClassException ? 61 : ((Object) stateCaught_37 instanceof StreamCorruptedException ? 62 : ((Object) stateCaught_37 instanceof OptionalDataException ? 63 : ((Object) stateCaught_37 instanceof IllegalAccessException ? 64 : ((Object) stateCaught_37 instanceof IllegalArgumentException ? 65 : ((Object) stateCaught_37 instanceof java.lang.reflect.InvocationTargetException ? 66 : ((Object) stateCaught_37 instanceof SecurityException ? 67 : ((Object) stateCaught_37 instanceof IOException ? 68 : ((Object) stateCaught_37 instanceof NullPointerException ? 69 : ((Object) stateCaught_37 instanceof Exception ? 70 : 71)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            var14 = (java.lang.reflect.Field) (var13.field_k[var5].field_g);
                            var7 = var14;
                            var14.setInt((Object) null, var13.field_h[var5]);
                            param1.c(0, -1);
                            if (var12 == 0) {
                                statePc = 40;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = ((Object) stateCaught_38 instanceof ClassNotFoundException ? 60 : ((Object) stateCaught_38 instanceof InvalidClassException ? 61 : ((Object) stateCaught_38 instanceof StreamCorruptedException ? 62 : ((Object) stateCaught_38 instanceof OptionalDataException ? 63 : ((Object) stateCaught_38 instanceof IllegalAccessException ? 64 : ((Object) stateCaught_38 instanceof IllegalArgumentException ? 65 : ((Object) stateCaught_38 instanceof java.lang.reflect.InvocationTargetException ? 66 : ((Object) stateCaught_38 instanceof SecurityException ? 67 : ((Object) stateCaught_38 instanceof IOException ? 68 : ((Object) stateCaught_38 instanceof NullPointerException ? 69 : ((Object) stateCaught_38 instanceof Exception ? 70 : 71)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            var15 = (java.lang.reflect.Field) (var13.field_k[var5].field_g);
                            var8 = var15.getInt((Object) null);
                            param1.c(0, -1);
                            param1.f(var8, param0 ^ 32270);
                            statePc = 40;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = ((Object) stateCaught_39 instanceof ClassNotFoundException ? 60 : ((Object) stateCaught_39 instanceof InvalidClassException ? 61 : ((Object) stateCaught_39 instanceof StreamCorruptedException ? 62 : ((Object) stateCaught_39 instanceof OptionalDataException ? 63 : ((Object) stateCaught_39 instanceof IllegalAccessException ? 64 : ((Object) stateCaught_39 instanceof IllegalArgumentException ? 65 : ((Object) stateCaught_39 instanceof java.lang.reflect.InvocationTargetException ? 66 : ((Object) stateCaught_39 instanceof SecurityException ? 67 : ((Object) stateCaught_39 instanceof IOException ? 68 : ((Object) stateCaught_39 instanceof NullPointerException ? 69 : ((Object) stateCaught_39 instanceof Exception ? 70 : 71)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            if ((var6_int ^ -1) == -4) {
                                statePc = 44;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = ((Object) stateCaught_40 instanceof ClassNotFoundException ? 60 : ((Object) stateCaught_40 instanceof InvalidClassException ? 61 : ((Object) stateCaught_40 instanceof StreamCorruptedException ? 62 : ((Object) stateCaught_40 instanceof OptionalDataException ? 63 : ((Object) stateCaught_40 instanceof IllegalAccessException ? 64 : ((Object) stateCaught_40 instanceof IllegalArgumentException ? 65 : ((Object) stateCaught_40 instanceof java.lang.reflect.InvocationTargetException ? 66 : ((Object) stateCaught_40 instanceof SecurityException ? 67 : ((Object) stateCaught_40 instanceof IOException ? 68 : ((Object) stateCaught_40 instanceof NullPointerException ? 69 : ((Object) stateCaught_40 instanceof Exception ? 70 : 71)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            if (4 == var6_int) {
                                statePc = 43;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = ((Object) stateCaught_41 instanceof ClassNotFoundException ? 60 : ((Object) stateCaught_41 instanceof InvalidClassException ? 61 : ((Object) stateCaught_41 instanceof StreamCorruptedException ? 62 : ((Object) stateCaught_41 instanceof OptionalDataException ? 63 : ((Object) stateCaught_41 instanceof IllegalAccessException ? 64 : ((Object) stateCaught_41 instanceof IllegalArgumentException ? 65 : ((Object) stateCaught_41 instanceof java.lang.reflect.InvocationTargetException ? 66 : ((Object) stateCaught_41 instanceof SecurityException ? 67 : ((Object) stateCaught_41 instanceof IOException ? 68 : ((Object) stateCaught_41 instanceof NullPointerException ? 69 : ((Object) stateCaught_41 instanceof Exception ? 70 : 71)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = ((Object) stateCaught_42 instanceof ClassNotFoundException ? 60 : ((Object) stateCaught_42 instanceof InvalidClassException ? 61 : ((Object) stateCaught_42 instanceof StreamCorruptedException ? 62 : ((Object) stateCaught_42 instanceof OptionalDataException ? 63 : ((Object) stateCaught_42 instanceof IllegalAccessException ? 64 : ((Object) stateCaught_42 instanceof IllegalArgumentException ? 65 : ((Object) stateCaught_42 instanceof java.lang.reflect.InvocationTargetException ? 66 : ((Object) stateCaught_42 instanceof SecurityException ? 67 : ((Object) stateCaught_42 instanceof IOException ? 68 : ((Object) stateCaught_42 instanceof NullPointerException ? 69 : ((Object) stateCaught_42 instanceof Exception ? 70 : 71)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            var26 = (java.lang.reflect.Method) (var13.field_i[var5].field_g);
                            var8 = var26.getModifiers();
                            param1.c(0, -1);
                            param1.f(var8, -32287);
                            if (var12 == 0) {
                                statePc = 72;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = ((Object) stateCaught_43 instanceof ClassNotFoundException ? 60 : ((Object) stateCaught_43 instanceof InvalidClassException ? 61 : ((Object) stateCaught_43 instanceof StreamCorruptedException ? 62 : ((Object) stateCaught_43 instanceof OptionalDataException ? 63 : ((Object) stateCaught_43 instanceof IllegalAccessException ? 64 : ((Object) stateCaught_43 instanceof IllegalArgumentException ? 65 : ((Object) stateCaught_43 instanceof java.lang.reflect.InvocationTargetException ? 66 : ((Object) stateCaught_43 instanceof SecurityException ? 67 : ((Object) stateCaught_43 instanceof IOException ? 68 : ((Object) stateCaught_43 instanceof NullPointerException ? 69 : ((Object) stateCaught_43 instanceof Exception ? 70 : 71)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            var27 = (java.lang.reflect.Method) (var13.field_i[var5].field_g);
                            var24 = var13.field_o[var5];
                            var9 = new Object[var24.length];
                            var10_int = 0;
                            statePc = 45;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = ((Object) stateCaught_44 instanceof ClassNotFoundException ? 60 : ((Object) stateCaught_44 instanceof InvalidClassException ? 61 : ((Object) stateCaught_44 instanceof StreamCorruptedException ? 62 : ((Object) stateCaught_44 instanceof OptionalDataException ? 63 : ((Object) stateCaught_44 instanceof IllegalAccessException ? 64 : ((Object) stateCaught_44 instanceof IllegalArgumentException ? 65 : ((Object) stateCaught_44 instanceof java.lang.reflect.InvocationTargetException ? 66 : ((Object) stateCaught_44 instanceof SecurityException ? 67 : ((Object) stateCaught_44 instanceof IOException ? 68 : ((Object) stateCaught_44 instanceof NullPointerException ? 69 : ((Object) stateCaught_44 instanceof Exception ? 70 : 71)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            if (var10_int >= var24.length) {
                                statePc = 49;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = ((Object) stateCaught_45 instanceof ClassNotFoundException ? 60 : ((Object) stateCaught_45 instanceof InvalidClassException ? 61 : ((Object) stateCaught_45 instanceof StreamCorruptedException ? 62 : ((Object) stateCaught_45 instanceof OptionalDataException ? 63 : ((Object) stateCaught_45 instanceof IllegalAccessException ? 64 : ((Object) stateCaught_45 instanceof IllegalArgumentException ? 65 : ((Object) stateCaught_45 instanceof java.lang.reflect.InvocationTargetException ? 66 : ((Object) stateCaught_45 instanceof SecurityException ? 67 : ((Object) stateCaught_45 instanceof IOException ? 68 : ((Object) stateCaught_45 instanceof NullPointerException ? 69 : ((Object) stateCaught_45 instanceof Exception ? 70 : 71)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            var11 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var24[var10_int])));
                            var9[var10_int] = var11.readObject();
                            var10_int++;
                            if (var12 != 0) {
                                statePc = 72;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = ((Object) stateCaught_46 instanceof ClassNotFoundException ? 60 : ((Object) stateCaught_46 instanceof InvalidClassException ? 61 : ((Object) stateCaught_46 instanceof StreamCorruptedException ? 62 : ((Object) stateCaught_46 instanceof OptionalDataException ? 63 : ((Object) stateCaught_46 instanceof IllegalAccessException ? 64 : ((Object) stateCaught_46 instanceof IllegalArgumentException ? 65 : ((Object) stateCaught_46 instanceof java.lang.reflect.InvocationTargetException ? 66 : ((Object) stateCaught_46 instanceof SecurityException ? 67 : ((Object) stateCaught_46 instanceof IOException ? 68 : ((Object) stateCaught_46 instanceof NullPointerException ? 69 : ((Object) stateCaught_46 instanceof Exception ? 70 : 71)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            if (var12 == 0) {
                                statePc = 45;
                            } else {
                                statePc = 48;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = ((Object) stateCaught_47 instanceof ClassNotFoundException ? 60 : ((Object) stateCaught_47 instanceof InvalidClassException ? 61 : ((Object) stateCaught_47 instanceof StreamCorruptedException ? 62 : ((Object) stateCaught_47 instanceof OptionalDataException ? 63 : ((Object) stateCaught_47 instanceof IllegalAccessException ? 64 : ((Object) stateCaught_47 instanceof IllegalArgumentException ? 65 : ((Object) stateCaught_47 instanceof java.lang.reflect.InvocationTargetException ? 66 : ((Object) stateCaught_47 instanceof SecurityException ? 67 : ((Object) stateCaught_47 instanceof IOException ? 68 : ((Object) stateCaught_47 instanceof NullPointerException ? 69 : ((Object) stateCaught_47 instanceof Exception ? 70 : 71)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            statePc = 49;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = ((Object) stateCaught_48 instanceof ClassNotFoundException ? 60 : ((Object) stateCaught_48 instanceof InvalidClassException ? 61 : ((Object) stateCaught_48 instanceof StreamCorruptedException ? 62 : ((Object) stateCaught_48 instanceof OptionalDataException ? 63 : ((Object) stateCaught_48 instanceof IllegalAccessException ? 64 : ((Object) stateCaught_48 instanceof IllegalArgumentException ? 65 : ((Object) stateCaught_48 instanceof java.lang.reflect.InvocationTargetException ? 66 : ((Object) stateCaught_48 instanceof SecurityException ? 67 : ((Object) stateCaught_48 instanceof IOException ? 68 : ((Object) stateCaught_48 instanceof NullPointerException ? 69 : ((Object) stateCaught_48 instanceof Exception ? 70 : 71)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            var10 = var27.invoke((Object) null, var9);
                            if (var10 != null) {
                                statePc = 52;
                            } else {
                                statePc = 50;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = ((Object) stateCaught_49 instanceof ClassNotFoundException ? 60 : ((Object) stateCaught_49 instanceof InvalidClassException ? 61 : ((Object) stateCaught_49 instanceof StreamCorruptedException ? 62 : ((Object) stateCaught_49 instanceof OptionalDataException ? 63 : ((Object) stateCaught_49 instanceof IllegalAccessException ? 64 : ((Object) stateCaught_49 instanceof IllegalArgumentException ? 65 : ((Object) stateCaught_49 instanceof java.lang.reflect.InvocationTargetException ? 66 : ((Object) stateCaught_49 instanceof SecurityException ? 67 : ((Object) stateCaught_49 instanceof IOException ? 68 : ((Object) stateCaught_49 instanceof NullPointerException ? 69 : ((Object) stateCaught_49 instanceof Exception ? 70 : 71)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            param1.c(0, -1);
                            if (var12 == 0) {
                                statePc = 72;
                            } else {
                                statePc = 51;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = ((Object) stateCaught_50 instanceof ClassNotFoundException ? 60 : ((Object) stateCaught_50 instanceof InvalidClassException ? 61 : ((Object) stateCaught_50 instanceof StreamCorruptedException ? 62 : ((Object) stateCaught_50 instanceof OptionalDataException ? 63 : ((Object) stateCaught_50 instanceof IllegalAccessException ? 64 : ((Object) stateCaught_50 instanceof IllegalArgumentException ? 65 : ((Object) stateCaught_50 instanceof java.lang.reflect.InvocationTargetException ? 66 : ((Object) stateCaught_50 instanceof SecurityException ? 67 : ((Object) stateCaught_50 instanceof IOException ? 68 : ((Object) stateCaught_50 instanceof NullPointerException ? 69 : ((Object) stateCaught_50 instanceof Exception ? 70 : 71)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            statePc = 52;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = ((Object) stateCaught_51 instanceof ClassNotFoundException ? 60 : ((Object) stateCaught_51 instanceof InvalidClassException ? 61 : ((Object) stateCaught_51 instanceof StreamCorruptedException ? 62 : ((Object) stateCaught_51 instanceof OptionalDataException ? 63 : ((Object) stateCaught_51 instanceof IllegalAccessException ? 64 : ((Object) stateCaught_51 instanceof IllegalArgumentException ? 65 : ((Object) stateCaught_51 instanceof java.lang.reflect.InvocationTargetException ? 66 : ((Object) stateCaught_51 instanceof SecurityException ? 67 : ((Object) stateCaught_51 instanceof IOException ? 68 : ((Object) stateCaught_51 instanceof NullPointerException ? 69 : ((Object) stateCaught_51 instanceof Exception ? 70 : 71)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            if (var10 instanceof Number) {
                                statePc = 58;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = ((Object) stateCaught_52 instanceof ClassNotFoundException ? 60 : ((Object) stateCaught_52 instanceof InvalidClassException ? 61 : ((Object) stateCaught_52 instanceof StreamCorruptedException ? 62 : ((Object) stateCaught_52 instanceof OptionalDataException ? 63 : ((Object) stateCaught_52 instanceof IllegalAccessException ? 64 : ((Object) stateCaught_52 instanceof IllegalArgumentException ? 65 : ((Object) stateCaught_52 instanceof java.lang.reflect.InvocationTargetException ? 66 : ((Object) stateCaught_52 instanceof SecurityException ? 67 : ((Object) stateCaught_52 instanceof IOException ? 68 : ((Object) stateCaught_52 instanceof NullPointerException ? 69 : ((Object) stateCaught_52 instanceof Exception ? 70 : 71)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            if (var10 instanceof String) {
                                statePc = 56;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = ((Object) stateCaught_53 instanceof ClassNotFoundException ? 60 : ((Object) stateCaught_53 instanceof InvalidClassException ? 61 : ((Object) stateCaught_53 instanceof StreamCorruptedException ? 62 : ((Object) stateCaught_53 instanceof OptionalDataException ? 63 : ((Object) stateCaught_53 instanceof IllegalAccessException ? 64 : ((Object) stateCaught_53 instanceof IllegalArgumentException ? 65 : ((Object) stateCaught_53 instanceof java.lang.reflect.InvocationTargetException ? 66 : ((Object) stateCaught_53 instanceof SecurityException ? 67 : ((Object) stateCaught_53 instanceof IOException ? 68 : ((Object) stateCaught_53 instanceof NullPointerException ? 69 : ((Object) stateCaught_53 instanceof Exception ? 70 : 71)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            param1.c(4, -1);
                            if (var12 == 0) {
                                statePc = 72;
                            } else {
                                statePc = 55;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = ((Object) stateCaught_54 instanceof ClassNotFoundException ? 60 : ((Object) stateCaught_54 instanceof InvalidClassException ? 61 : ((Object) stateCaught_54 instanceof StreamCorruptedException ? 62 : ((Object) stateCaught_54 instanceof OptionalDataException ? 63 : ((Object) stateCaught_54 instanceof IllegalAccessException ? 64 : ((Object) stateCaught_54 instanceof IllegalArgumentException ? 65 : ((Object) stateCaught_54 instanceof java.lang.reflect.InvocationTargetException ? 66 : ((Object) stateCaught_54 instanceof SecurityException ? 67 : ((Object) stateCaught_54 instanceof IOException ? 68 : ((Object) stateCaught_54 instanceof NullPointerException ? 69 : ((Object) stateCaught_54 instanceof Exception ? 70 : 71)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            statePc = 56;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = ((Object) stateCaught_55 instanceof ClassNotFoundException ? 60 : ((Object) stateCaught_55 instanceof InvalidClassException ? 61 : ((Object) stateCaught_55 instanceof StreamCorruptedException ? 62 : ((Object) stateCaught_55 instanceof OptionalDataException ? 63 : ((Object) stateCaught_55 instanceof IllegalAccessException ? 64 : ((Object) stateCaught_55 instanceof IllegalArgumentException ? 65 : ((Object) stateCaught_55 instanceof java.lang.reflect.InvocationTargetException ? 66 : ((Object) stateCaught_55 instanceof SecurityException ? 67 : ((Object) stateCaught_55 instanceof IOException ? 68 : ((Object) stateCaught_55 instanceof NullPointerException ? 69 : ((Object) stateCaught_55 instanceof Exception ? 70 : 71)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            param1.c(2, -1);
                            param1.a((String) (var10), (byte) 0);
                            if (var12 == 0) {
                                statePc = 72;
                            } else {
                                statePc = 57;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = ((Object) stateCaught_56 instanceof ClassNotFoundException ? 60 : ((Object) stateCaught_56 instanceof InvalidClassException ? 61 : ((Object) stateCaught_56 instanceof StreamCorruptedException ? 62 : ((Object) stateCaught_56 instanceof OptionalDataException ? 63 : ((Object) stateCaught_56 instanceof IllegalAccessException ? 64 : ((Object) stateCaught_56 instanceof IllegalArgumentException ? 65 : ((Object) stateCaught_56 instanceof java.lang.reflect.InvocationTargetException ? 66 : ((Object) stateCaught_56 instanceof SecurityException ? 67 : ((Object) stateCaught_56 instanceof IOException ? 68 : ((Object) stateCaught_56 instanceof NullPointerException ? 69 : ((Object) stateCaught_56 instanceof Exception ? 70 : 71)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = ((Object) stateCaught_57 instanceof ClassNotFoundException ? 60 : ((Object) stateCaught_57 instanceof InvalidClassException ? 61 : ((Object) stateCaught_57 instanceof StreamCorruptedException ? 62 : ((Object) stateCaught_57 instanceof OptionalDataException ? 63 : ((Object) stateCaught_57 instanceof IllegalAccessException ? 64 : ((Object) stateCaught_57 instanceof IllegalArgumentException ? 65 : ((Object) stateCaught_57 instanceof java.lang.reflect.InvocationTargetException ? 66 : ((Object) stateCaught_57 instanceof SecurityException ? 67 : ((Object) stateCaught_57 instanceof IOException ? 68 : ((Object) stateCaught_57 instanceof NullPointerException ? 69 : ((Object) stateCaught_57 instanceof Exception ? 70 : 71)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            param1.c(1, -1);
                            param1.a(((Number) (var10)).longValue(), (byte) 37);
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = ((Object) stateCaught_58 instanceof ClassNotFoundException ? 60 : ((Object) stateCaught_58 instanceof InvalidClassException ? 61 : ((Object) stateCaught_58 instanceof StreamCorruptedException ? 62 : ((Object) stateCaught_58 instanceof OptionalDataException ? 63 : ((Object) stateCaught_58 instanceof IllegalAccessException ? 64 : ((Object) stateCaught_58 instanceof IllegalArgumentException ? 65 : ((Object) stateCaught_58 instanceof java.lang.reflect.InvocationTargetException ? 66 : ((Object) stateCaught_58 instanceof SecurityException ? 67 : ((Object) stateCaught_58 instanceof IOException ? 68 : ((Object) stateCaught_58 instanceof NullPointerException ? 69 : ((Object) stateCaught_58 instanceof Exception ? 70 : 71)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            var6 = (ClassNotFoundException) ((Object) caughtException);
                            param1.c(-10, -1);
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            var6_ref = (InvalidClassException) ((Object) caughtException);
                            param1.c(-11, -1);
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            var6_ref2 = (StreamCorruptedException) ((Object) caughtException);
                            param1.c(-12, -1);
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            var6_ref3 = (OptionalDataException) ((Object) caughtException);
                            param1.c(-13, param0 + 16);
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            var6_ref4 = (IllegalAccessException) ((Object) caughtException);
                            param1.c(-14, -1);
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            var6_ref5 = (IllegalArgumentException) ((Object) caughtException);
                            param1.c(-15, -1);
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            var6_ref6 = (java.lang.reflect.InvocationTargetException) ((Object) caughtException);
                            param1.c(-16, -1);
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            var6_ref7 = (SecurityException) ((Object) caughtException);
                            param1.c(-17, -1);
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            var6_ref8 = (IOException) ((Object) caughtException);
                            param1.c(-18, -1);
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            var6_ref9 = (NullPointerException) ((Object) caughtException);
                            param1.c(-19, param0 ^ 16);
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            var6_ref10 = (Exception) ((Object) caughtException);
                            param1.c(-20, -1);
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            var6_ref11 = caughtException;
                            param1.c(-21, -1);
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            var5++;
                            if (var12 == 0) {
                                statePc = 28;
                            } else {
                                statePc = 73;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            stackIn_74_0 = param1.a(var4, (byte) 82);
                            statePc = 74;
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            var17.b((byte) -116);
                            statePc = 75;
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        return;
                    }
                    case 76: {
                        var2 = (RuntimeException) ((Object) caughtException);
                        stackIn_78_0 = (RuntimeException) (var2);
                        stackIn_77_0 = stackIn_78_0;
                        stackIn_78_1 = new StringBuilder().append("ej.A(").append(param0).append(',');
                        stackIn_77_1 = stackIn_78_1;
                        if (param1 == null) {
                            statePc = 78;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    }
                    case 77: {
                        stackIn_79_0 = (RuntimeException) ((Object) stackIn_77_0);
                        stackIn_79_1 = (StringBuilder) ((Object) stackIn_77_1);
                        stackIn_79_2 = "{...}";
                        statePc = 79;
                        continue stateLoop;
                    }
                    case 78: {
                        stackIn_79_0 = (RuntimeException) ((Object) stackIn_78_0);
                        stackIn_79_1 = (StringBuilder) ((Object) stackIn_78_1);
                        stackIn_79_2 = "null";
                        statePc = 79;
                        continue stateLoop;
                    }
                    case 79: {
                        throw ld.a((Throwable) ((Object) stackIn_79_0), stackIn_79_2 + ')');
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

    static {
        field_a = new bj(2);
        field_c = new int[8192];
    }
}
