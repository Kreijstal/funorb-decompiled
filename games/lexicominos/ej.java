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
            field_a = null;
        }
        field_c = null;
        field_a = null;
        field_d = null;
    }

    final static void a(int param0, th param1) {
        try {
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
            int var8 = 0;
            Object[] var9 = null;
            int var10_int = 0;
            Object var10 = null;
            ObjectInputStream var11 = null;
            int var12 = 0;
            pd var13 = null;
            java.lang.reflect.Field var15 = null;
            Object var16 = null;
            java.lang.reflect.Field var16_ref = null;
            pd var17 = null;
            Object var18 = null;
            java.lang.reflect.Field var19 = null;
            Object var20 = null;
            Object var22 = null;
            byte[][] var25 = null;
            java.lang.reflect.Field var26 = null;
            java.lang.reflect.Method var27 = null;
            java.lang.reflect.Method var28 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var18 = null;
                        var16 = null;
                        var20 = null;
                        var22 = null;
                        var12 = Lexicominos.field_L ? 1 : 0;
                        if (param0 == -17) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        field_b = null;
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        var13 = (pd) (Object) al.field_C.a(true);
                        var17 = var13;
                        if (var17 == null) {
                            statePc = 4;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        return;
                    }
                    case 5: {
                        var3 = 0;
                        var4 = 0;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        if (var4 >= var17.field_p) {
                            statePc = 21;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        if (null != var13.field_k[var4]) {
                            statePc = 9;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 9: {
                        if (2 != var13.field_k[var4].field_b) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        var13.field_n[var4] = -5;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        if (-1 != (var13.field_k[var4].field_b ^ -1)) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        var3 = 1;
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 13: {
                        if (var13.field_i[var4] != null) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        var4++;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 15: {
                        if (var13.field_i[var4].field_b == -3) {
                            statePc = 17;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 17: {
                        var13.field_n[var4] = -6;
                        statePc = 18;
                        continue stateLoop;
                    }
                    case 18: {
                        if (-1 == var13.field_i[var4].field_b) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 19: {
                        var4++;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 20: {
                        var3 = 1;
                        var4++;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 21: {
                        if (var3 != 0) {
                            statePc = 23;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        return;
                    }
                    case 24: {
                        var4 = param1.field_h;
                        param1.f(var17.field_j, -32287);
                        var5 = 0;
                        statePc = 25;
                        continue stateLoop;
                    }
                    case 25: {
                        if (var17.field_p <= var5) {
                            statePc = 64;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    }
                    case 26: {
                        if (0 != var17.field_n[var5]) {
                            statePc = 28;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    }
                    case 28: {
                        param1.c(var17.field_n[var5], -1);
                        statePc = 63;
                        continue stateLoop;
                    }
                    case 29: {
                        try {
                            var6_int = var17.field_m[var5];
                            if (-1 == (var6_int ^ -1)) {
                                statePc = 35;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof ClassNotFoundException ? 51 : (stateCaught_29 instanceof InvalidClassException ? 52 : (stateCaught_29 instanceof StreamCorruptedException ? 53 : (stateCaught_29 instanceof OptionalDataException ? 54 : (stateCaught_29 instanceof IllegalAccessException ? 55 : (stateCaught_29 instanceof IllegalArgumentException ? 56 : (stateCaught_29 instanceof java.lang.reflect.InvocationTargetException ? 57 : (stateCaught_29 instanceof SecurityException ? 58 : (stateCaught_29 instanceof IOException ? 59 : (stateCaught_29 instanceof NullPointerException ? 60 : (stateCaught_29 instanceof Exception ? 61 : 62)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if (var6_int == -2) {
                                statePc = 34;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof ClassNotFoundException ? 51 : (stateCaught_30 instanceof InvalidClassException ? 52 : (stateCaught_30 instanceof StreamCorruptedException ? 53 : (stateCaught_30 instanceof OptionalDataException ? 54 : (stateCaught_30 instanceof IllegalAccessException ? 55 : (stateCaught_30 instanceof IllegalArgumentException ? 56 : (stateCaught_30 instanceof java.lang.reflect.InvocationTargetException ? 57 : (stateCaught_30 instanceof SecurityException ? 58 : (stateCaught_30 instanceof IOException ? 59 : (stateCaught_30 instanceof NullPointerException ? 60 : (stateCaught_30 instanceof Exception ? 61 : 62)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (-3 == var6_int) {
                                statePc = 33;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof ClassNotFoundException ? 51 : (stateCaught_31 instanceof InvalidClassException ? 52 : (stateCaught_31 instanceof StreamCorruptedException ? 53 : (stateCaught_31 instanceof OptionalDataException ? 54 : (stateCaught_31 instanceof IllegalAccessException ? 55 : (stateCaught_31 instanceof IllegalArgumentException ? 56 : (stateCaught_31 instanceof java.lang.reflect.InvocationTargetException ? 57 : (stateCaught_31 instanceof SecurityException ? 58 : (stateCaught_31 instanceof IOException ? 59 : (stateCaught_31 instanceof NullPointerException ? 60 : (stateCaught_31 instanceof Exception ? 61 : 62)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof ClassNotFoundException ? 51 : (stateCaught_32 instanceof InvalidClassException ? 52 : (stateCaught_32 instanceof StreamCorruptedException ? 53 : (stateCaught_32 instanceof OptionalDataException ? 54 : (stateCaught_32 instanceof IllegalAccessException ? 55 : (stateCaught_32 instanceof IllegalArgumentException ? 56 : (stateCaught_32 instanceof java.lang.reflect.InvocationTargetException ? 57 : (stateCaught_32 instanceof SecurityException ? 58 : (stateCaught_32 instanceof IOException ? 59 : (stateCaught_32 instanceof NullPointerException ? 60 : (stateCaught_32 instanceof Exception ? 61 : 62)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            var26 = (java.lang.reflect.Field) var17.field_k[var5].field_g;
                            var8 = var26.getModifiers();
                            param1.c(0, -1);
                            param1.f(var8, -32287);
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof ClassNotFoundException ? 51 : (stateCaught_33 instanceof InvalidClassException ? 52 : (stateCaught_33 instanceof StreamCorruptedException ? 53 : (stateCaught_33 instanceof OptionalDataException ? 54 : (stateCaught_33 instanceof IllegalAccessException ? 55 : (stateCaught_33 instanceof IllegalArgumentException ? 56 : (stateCaught_33 instanceof java.lang.reflect.InvocationTargetException ? 57 : (stateCaught_33 instanceof SecurityException ? 58 : (stateCaught_33 instanceof IOException ? 59 : (stateCaught_33 instanceof NullPointerException ? 60 : (stateCaught_33 instanceof Exception ? 61 : 62)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            var16_ref = (java.lang.reflect.Field) var17.field_k[var5].field_g;
                            var19 = var16_ref;
                            var19.setInt((Object) null, var17.field_h[var5]);
                            param1.c(0, -1);
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof ClassNotFoundException ? 51 : (stateCaught_34 instanceof InvalidClassException ? 52 : (stateCaught_34 instanceof StreamCorruptedException ? 53 : (stateCaught_34 instanceof OptionalDataException ? 54 : (stateCaught_34 instanceof IllegalAccessException ? 55 : (stateCaught_34 instanceof IllegalArgumentException ? 56 : (stateCaught_34 instanceof java.lang.reflect.InvocationTargetException ? 57 : (stateCaught_34 instanceof SecurityException ? 58 : (stateCaught_34 instanceof IOException ? 59 : (stateCaught_34 instanceof NullPointerException ? 60 : (stateCaught_34 instanceof Exception ? 61 : 62)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            var15 = (java.lang.reflect.Field) var17.field_k[var5].field_g;
                            var8 = var15.getInt((Object) null);
                            param1.c(0, -1);
                            param1.f(var8, param0 ^ 32270);
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof ClassNotFoundException ? 51 : (stateCaught_35 instanceof InvalidClassException ? 52 : (stateCaught_35 instanceof StreamCorruptedException ? 53 : (stateCaught_35 instanceof OptionalDataException ? 54 : (stateCaught_35 instanceof IllegalAccessException ? 55 : (stateCaught_35 instanceof IllegalArgumentException ? 56 : (stateCaught_35 instanceof java.lang.reflect.InvocationTargetException ? 57 : (stateCaught_35 instanceof SecurityException ? 58 : (stateCaught_35 instanceof IOException ? 59 : (stateCaught_35 instanceof NullPointerException ? 60 : (stateCaught_35 instanceof Exception ? 61 : 62)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            if ((var6_int ^ -1) == -4) {
                                statePc = 40;
                            } else {
                                statePc = 37;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof ClassNotFoundException ? 51 : (stateCaught_36 instanceof InvalidClassException ? 52 : (stateCaught_36 instanceof StreamCorruptedException ? 53 : (stateCaught_36 instanceof OptionalDataException ? 54 : (stateCaught_36 instanceof IllegalAccessException ? 55 : (stateCaught_36 instanceof IllegalArgumentException ? 56 : (stateCaught_36 instanceof java.lang.reflect.InvocationTargetException ? 57 : (stateCaught_36 instanceof SecurityException ? 58 : (stateCaught_36 instanceof IOException ? 59 : (stateCaught_36 instanceof NullPointerException ? 60 : (stateCaught_36 instanceof Exception ? 61 : 62)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            if (4 == var6_int) {
                                statePc = 39;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof ClassNotFoundException ? 51 : (stateCaught_37 instanceof InvalidClassException ? 52 : (stateCaught_37 instanceof StreamCorruptedException ? 53 : (stateCaught_37 instanceof OptionalDataException ? 54 : (stateCaught_37 instanceof IllegalAccessException ? 55 : (stateCaught_37 instanceof IllegalArgumentException ? 56 : (stateCaught_37 instanceof java.lang.reflect.InvocationTargetException ? 57 : (stateCaught_37 instanceof SecurityException ? 58 : (stateCaught_37 instanceof IOException ? 59 : (stateCaught_37 instanceof NullPointerException ? 60 : (stateCaught_37 instanceof Exception ? 61 : 62)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof ClassNotFoundException ? 51 : (stateCaught_38 instanceof InvalidClassException ? 52 : (stateCaught_38 instanceof StreamCorruptedException ? 53 : (stateCaught_38 instanceof OptionalDataException ? 54 : (stateCaught_38 instanceof IllegalAccessException ? 55 : (stateCaught_38 instanceof IllegalArgumentException ? 56 : (stateCaught_38 instanceof java.lang.reflect.InvocationTargetException ? 57 : (stateCaught_38 instanceof SecurityException ? 58 : (stateCaught_38 instanceof IOException ? 59 : (stateCaught_38 instanceof NullPointerException ? 60 : (stateCaught_38 instanceof Exception ? 61 : 62)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            var27 = (java.lang.reflect.Method) var17.field_i[var5].field_g;
                            var8 = var27.getModifiers();
                            param1.c(0, -1);
                            param1.f(var8, -32287);
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof ClassNotFoundException ? 51 : (stateCaught_39 instanceof InvalidClassException ? 52 : (stateCaught_39 instanceof StreamCorruptedException ? 53 : (stateCaught_39 instanceof OptionalDataException ? 54 : (stateCaught_39 instanceof IllegalAccessException ? 55 : (stateCaught_39 instanceof IllegalArgumentException ? 56 : (stateCaught_39 instanceof java.lang.reflect.InvocationTargetException ? 57 : (stateCaught_39 instanceof SecurityException ? 58 : (stateCaught_39 instanceof IOException ? 59 : (stateCaught_39 instanceof NullPointerException ? 60 : (stateCaught_39 instanceof Exception ? 61 : 62)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            var28 = (java.lang.reflect.Method) var17.field_i[var5].field_g;
                            var25 = var17.field_o[var5];
                            var9 = new Object[var25.length];
                            var10_int = 0;
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof ClassNotFoundException ? 51 : (stateCaught_40 instanceof InvalidClassException ? 52 : (stateCaught_40 instanceof StreamCorruptedException ? 53 : (stateCaught_40 instanceof OptionalDataException ? 54 : (stateCaught_40 instanceof IllegalAccessException ? 55 : (stateCaught_40 instanceof IllegalArgumentException ? 56 : (stateCaught_40 instanceof java.lang.reflect.InvocationTargetException ? 57 : (stateCaught_40 instanceof SecurityException ? 58 : (stateCaught_40 instanceof IOException ? 59 : (stateCaught_40 instanceof NullPointerException ? 60 : (stateCaught_40 instanceof Exception ? 61 : 62)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            if (var10_int >= var25.length) {
                                statePc = 43;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof ClassNotFoundException ? 51 : (stateCaught_41 instanceof InvalidClassException ? 52 : (stateCaught_41 instanceof StreamCorruptedException ? 53 : (stateCaught_41 instanceof OptionalDataException ? 54 : (stateCaught_41 instanceof IllegalAccessException ? 55 : (stateCaught_41 instanceof IllegalArgumentException ? 56 : (stateCaught_41 instanceof java.lang.reflect.InvocationTargetException ? 57 : (stateCaught_41 instanceof SecurityException ? 58 : (stateCaught_41 instanceof IOException ? 59 : (stateCaught_41 instanceof NullPointerException ? 60 : (stateCaught_41 instanceof Exception ? 61 : 62)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            var11 = new ObjectInputStream((InputStream) (Object) new ByteArrayInputStream(var25[var10_int]));
                            var9[var10_int] = var11.readObject();
                            var10_int++;
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof ClassNotFoundException ? 51 : (stateCaught_42 instanceof InvalidClassException ? 52 : (stateCaught_42 instanceof StreamCorruptedException ? 53 : (stateCaught_42 instanceof OptionalDataException ? 54 : (stateCaught_42 instanceof IllegalAccessException ? 55 : (stateCaught_42 instanceof IllegalArgumentException ? 56 : (stateCaught_42 instanceof java.lang.reflect.InvocationTargetException ? 57 : (stateCaught_42 instanceof SecurityException ? 58 : (stateCaught_42 instanceof IOException ? 59 : (stateCaught_42 instanceof NullPointerException ? 60 : (stateCaught_42 instanceof Exception ? 61 : 62)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            var10 = var28.invoke((Object) null, var9);
                            if (var10 != null) {
                                statePc = 45;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof ClassNotFoundException ? 51 : (stateCaught_43 instanceof InvalidClassException ? 52 : (stateCaught_43 instanceof StreamCorruptedException ? 53 : (stateCaught_43 instanceof OptionalDataException ? 54 : (stateCaught_43 instanceof IllegalAccessException ? 55 : (stateCaught_43 instanceof IllegalArgumentException ? 56 : (stateCaught_43 instanceof java.lang.reflect.InvocationTargetException ? 57 : (stateCaught_43 instanceof SecurityException ? 58 : (stateCaught_43 instanceof IOException ? 59 : (stateCaught_43 instanceof NullPointerException ? 60 : (stateCaught_43 instanceof Exception ? 61 : 62)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            param1.c(0, -1);
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof ClassNotFoundException ? 51 : (stateCaught_44 instanceof InvalidClassException ? 52 : (stateCaught_44 instanceof StreamCorruptedException ? 53 : (stateCaught_44 instanceof OptionalDataException ? 54 : (stateCaught_44 instanceof IllegalAccessException ? 55 : (stateCaught_44 instanceof IllegalArgumentException ? 56 : (stateCaught_44 instanceof java.lang.reflect.InvocationTargetException ? 57 : (stateCaught_44 instanceof SecurityException ? 58 : (stateCaught_44 instanceof IOException ? 59 : (stateCaught_44 instanceof NullPointerException ? 60 : (stateCaught_44 instanceof Exception ? 61 : 62)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            if (var10 instanceof Number) {
                                statePc = 49;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof ClassNotFoundException ? 51 : (stateCaught_45 instanceof InvalidClassException ? 52 : (stateCaught_45 instanceof StreamCorruptedException ? 53 : (stateCaught_45 instanceof OptionalDataException ? 54 : (stateCaught_45 instanceof IllegalAccessException ? 55 : (stateCaught_45 instanceof IllegalArgumentException ? 56 : (stateCaught_45 instanceof java.lang.reflect.InvocationTargetException ? 57 : (stateCaught_45 instanceof SecurityException ? 58 : (stateCaught_45 instanceof IOException ? 59 : (stateCaught_45 instanceof NullPointerException ? 60 : (stateCaught_45 instanceof Exception ? 61 : 62)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            if (var10 instanceof String) {
                                statePc = 48;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof ClassNotFoundException ? 51 : (stateCaught_46 instanceof InvalidClassException ? 52 : (stateCaught_46 instanceof StreamCorruptedException ? 53 : (stateCaught_46 instanceof OptionalDataException ? 54 : (stateCaught_46 instanceof IllegalAccessException ? 55 : (stateCaught_46 instanceof IllegalArgumentException ? 56 : (stateCaught_46 instanceof java.lang.reflect.InvocationTargetException ? 57 : (stateCaught_46 instanceof SecurityException ? 58 : (stateCaught_46 instanceof IOException ? 59 : (stateCaught_46 instanceof NullPointerException ? 60 : (stateCaught_46 instanceof Exception ? 61 : 62)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            param1.c(4, -1);
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof ClassNotFoundException ? 51 : (stateCaught_47 instanceof InvalidClassException ? 52 : (stateCaught_47 instanceof StreamCorruptedException ? 53 : (stateCaught_47 instanceof OptionalDataException ? 54 : (stateCaught_47 instanceof IllegalAccessException ? 55 : (stateCaught_47 instanceof IllegalArgumentException ? 56 : (stateCaught_47 instanceof java.lang.reflect.InvocationTargetException ? 57 : (stateCaught_47 instanceof SecurityException ? 58 : (stateCaught_47 instanceof IOException ? 59 : (stateCaught_47 instanceof NullPointerException ? 60 : (stateCaught_47 instanceof Exception ? 61 : 62)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            param1.c(2, -1);
                            param1.a((String) var10, (byte) 0);
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof ClassNotFoundException ? 51 : (stateCaught_48 instanceof InvalidClassException ? 52 : (stateCaught_48 instanceof StreamCorruptedException ? 53 : (stateCaught_48 instanceof OptionalDataException ? 54 : (stateCaught_48 instanceof IllegalAccessException ? 55 : (stateCaught_48 instanceof IllegalArgumentException ? 56 : (stateCaught_48 instanceof java.lang.reflect.InvocationTargetException ? 57 : (stateCaught_48 instanceof SecurityException ? 58 : (stateCaught_48 instanceof IOException ? 59 : (stateCaught_48 instanceof NullPointerException ? 60 : (stateCaught_48 instanceof Exception ? 61 : 62)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            param1.c(1, -1);
                            param1.a(((Number) var10).longValue(), (byte) 37);
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = (stateCaught_49 instanceof ClassNotFoundException ? 51 : (stateCaught_49 instanceof InvalidClassException ? 52 : (stateCaught_49 instanceof StreamCorruptedException ? 53 : (stateCaught_49 instanceof OptionalDataException ? 54 : (stateCaught_49 instanceof IllegalAccessException ? 55 : (stateCaught_49 instanceof IllegalArgumentException ? 56 : (stateCaught_49 instanceof java.lang.reflect.InvocationTargetException ? 57 : (stateCaught_49 instanceof SecurityException ? 58 : (stateCaught_49 instanceof IOException ? 59 : (stateCaught_49 instanceof NullPointerException ? 60 : (stateCaught_49 instanceof Exception ? 61 : 62)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        var6 = (ClassNotFoundException) (Object) caughtException;
                        param1.c(-10, -1);
                        statePc = 63;
                        continue stateLoop;
                    }
                    case 52: {
                        var6_ref = (InvalidClassException) (Object) caughtException;
                        param1.c(-11, -1);
                        statePc = 63;
                        continue stateLoop;
                    }
                    case 53: {
                        var6_ref2 = (StreamCorruptedException) (Object) caughtException;
                        param1.c(-12, -1);
                        statePc = 63;
                        continue stateLoop;
                    }
                    case 54: {
                        var6_ref3 = (OptionalDataException) (Object) caughtException;
                        param1.c(-13, param0 + 16);
                        statePc = 63;
                        continue stateLoop;
                    }
                    case 55: {
                        var6_ref4 = (IllegalAccessException) (Object) caughtException;
                        param1.c(-14, -1);
                        statePc = 63;
                        continue stateLoop;
                    }
                    case 56: {
                        var6_ref5 = (IllegalArgumentException) (Object) caughtException;
                        param1.c(-15, -1);
                        statePc = 63;
                        continue stateLoop;
                    }
                    case 57: {
                        var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) caughtException;
                        param1.c(-16, -1);
                        statePc = 63;
                        continue stateLoop;
                    }
                    case 58: {
                        var6_ref7 = (SecurityException) (Object) caughtException;
                        param1.c(-17, -1);
                        statePc = 63;
                        continue stateLoop;
                    }
                    case 59: {
                        var6_ref8 = (IOException) (Object) caughtException;
                        param1.c(-18, -1);
                        statePc = 63;
                        continue stateLoop;
                    }
                    case 60: {
                        var6_ref9 = (NullPointerException) (Object) caughtException;
                        param1.c(-19, param0 ^ 16);
                        statePc = 63;
                        continue stateLoop;
                    }
                    case 61: {
                        var6_ref10 = (Exception) (Object) caughtException;
                        param1.c(-20, -1);
                        statePc = 63;
                        continue stateLoop;
                    }
                    case 62: {
                        var6_ref11 = caughtException;
                        param1.c(-21, -1);
                        statePc = 63;
                        continue stateLoop;
                    }
                    case 63: {
                        var5++;
                        statePc = 25;
                        continue stateLoop;
                    }
                    case 64: {
                        int discarded$1 = param1.a(var4, (byte) 82);
                        var17.b((byte) -116);
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new bj(2);
        field_c = new int[8192];
    }
}
