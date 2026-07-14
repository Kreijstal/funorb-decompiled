/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class de {
    static ci field_d;
    static String field_a;
    static le field_c;
    static String field_b;

    final static void a(nk param0, byte param1) {
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
            Object var13 = null;
            fl var14 = null;
            Object var17 = null;
            java.lang.reflect.Field var17_ref = null;
            fl var18 = null;
            Object var19 = null;
            Object var20 = null;
            java.lang.reflect.Field var21 = null;
            Object var23 = null;
            Object var24 = null;
            byte[][] var27 = null;
            java.lang.reflect.Field var28 = null;
            java.lang.reflect.Field var29 = null;
            java.lang.reflect.Method var30 = null;
            java.lang.reflect.Method var31 = null;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var19 = null;
                        var20 = null;
                        var17_ref = null;
                        var23 = null;
                        var24 = null;
                        var12 = Chess.field_G;
                        var14 = (fl) (Object) vj.field_c.g(param1 ^ -18175);
                        var18 = var14;
                        if (var18 == null) {
                            statePc = 2;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        return;
                    }
                    case 3: {
                        var3 = 0;
                        var4 = 0;
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
                        if (var18.field_l <= var4) {
                            statePc = 18;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        if (null == var14.field_w[var4]) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        if (var14.field_w[var4].field_f != 2) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        var14.field_o[var4] = -5;
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        if (var14.field_w[var4].field_f != 0) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 9: {
                        var3 = 1;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if (null != var14.field_u[var4]) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        var4++;
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 12: {
                        if ((var14.field_u[var4].field_f ^ -1) == -3) {
                            statePc = 14;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        var14.field_o[var4] = -6;
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 15: {
                        if (var14.field_u[var4].field_f == 0) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        var4++;
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 17: {
                        var3 = 1;
                        var4++;
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 18: {
                        if (var3 != 0) {
                            statePc = 20;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    }
                    case 20: {
                        return;
                    }
                    case 21: {
                        var4 = param0.field_l;
                        param0.d(var18.field_t, (byte) -81);
                        var5 = 0;
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 22: {
                        if (var5 >= var18.field_l) {
                            statePc = 59;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        if (0 == var18.field_o[var5]) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    }
                    case 24: {
                        param0.c(var18.field_o[var5], (byte) 48);
                        statePc = 58;
                        continue stateLoop;
                    }
                    case 25: {
                        try {
                            var6_int = var18.field_q[var5];
                            if (-1 != (var6_int ^ -1)) {
                                statePc = 27;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof ClassNotFoundException ? 46 : (stateCaught_25 instanceof InvalidClassException ? 47 : (stateCaught_25 instanceof StreamCorruptedException ? 48 : (stateCaught_25 instanceof OptionalDataException ? 49 : (stateCaught_25 instanceof IllegalAccessException ? 50 : (stateCaught_25 instanceof IllegalArgumentException ? 51 : (stateCaught_25 instanceof java.lang.reflect.InvocationTargetException ? 52 : (stateCaught_25 instanceof SecurityException ? 53 : (stateCaught_25 instanceof IOException ? 54 : (stateCaught_25 instanceof NullPointerException ? 55 : (stateCaught_25 instanceof Exception ? 56 : 57)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            var28 = (java.lang.reflect.Field) var18.field_w[var5].field_b;
                            var8 = var28.getInt((Object) null);
                            param0.c(0, (byte) 116);
                            param0.d(var8, (byte) -81);
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof ClassNotFoundException ? 46 : (stateCaught_26 instanceof InvalidClassException ? 47 : (stateCaught_26 instanceof StreamCorruptedException ? 48 : (stateCaught_26 instanceof OptionalDataException ? 49 : (stateCaught_26 instanceof IllegalAccessException ? 50 : (stateCaught_26 instanceof IllegalArgumentException ? 51 : (stateCaught_26 instanceof java.lang.reflect.InvocationTargetException ? 52 : (stateCaught_26 instanceof SecurityException ? 53 : (stateCaught_26 instanceof IOException ? 54 : (stateCaught_26 instanceof NullPointerException ? 55 : (stateCaught_26 instanceof Exception ? 56 : 57)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            if (var6_int == 1) {
                                statePc = 31;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof ClassNotFoundException ? 46 : (stateCaught_27 instanceof InvalidClassException ? 47 : (stateCaught_27 instanceof StreamCorruptedException ? 48 : (stateCaught_27 instanceof OptionalDataException ? 49 : (stateCaught_27 instanceof IllegalAccessException ? 50 : (stateCaught_27 instanceof IllegalArgumentException ? 51 : (stateCaught_27 instanceof java.lang.reflect.InvocationTargetException ? 52 : (stateCaught_27 instanceof SecurityException ? 53 : (stateCaught_27 instanceof IOException ? 54 : (stateCaught_27 instanceof NullPointerException ? 55 : (stateCaught_27 instanceof Exception ? 56 : 57)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            if (var6_int == 2) {
                                statePc = 30;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof ClassNotFoundException ? 46 : (stateCaught_28 instanceof InvalidClassException ? 47 : (stateCaught_28 instanceof StreamCorruptedException ? 48 : (stateCaught_28 instanceof OptionalDataException ? 49 : (stateCaught_28 instanceof IllegalAccessException ? 50 : (stateCaught_28 instanceof IllegalArgumentException ? 51 : (stateCaught_28 instanceof java.lang.reflect.InvocationTargetException ? 52 : (stateCaught_28 instanceof SecurityException ? 53 : (stateCaught_28 instanceof IOException ? 54 : (stateCaught_28 instanceof NullPointerException ? 55 : (stateCaught_28 instanceof Exception ? 56 : 57)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof ClassNotFoundException ? 46 : (stateCaught_29 instanceof InvalidClassException ? 47 : (stateCaught_29 instanceof StreamCorruptedException ? 48 : (stateCaught_29 instanceof OptionalDataException ? 49 : (stateCaught_29 instanceof IllegalAccessException ? 50 : (stateCaught_29 instanceof IllegalArgumentException ? 51 : (stateCaught_29 instanceof java.lang.reflect.InvocationTargetException ? 52 : (stateCaught_29 instanceof SecurityException ? 53 : (stateCaught_29 instanceof IOException ? 54 : (stateCaught_29 instanceof NullPointerException ? 55 : (stateCaught_29 instanceof Exception ? 56 : 57)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            var29 = (java.lang.reflect.Field) var18.field_w[var5].field_b;
                            var8 = var29.getModifiers();
                            param0.c(0, (byte) -96);
                            param0.d(var8, (byte) -81);
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof ClassNotFoundException ? 46 : (stateCaught_30 instanceof InvalidClassException ? 47 : (stateCaught_30 instanceof StreamCorruptedException ? 48 : (stateCaught_30 instanceof OptionalDataException ? 49 : (stateCaught_30 instanceof IllegalAccessException ? 50 : (stateCaught_30 instanceof IllegalArgumentException ? 51 : (stateCaught_30 instanceof java.lang.reflect.InvocationTargetException ? 52 : (stateCaught_30 instanceof SecurityException ? 53 : (stateCaught_30 instanceof IOException ? 54 : (stateCaught_30 instanceof NullPointerException ? 55 : (stateCaught_30 instanceof Exception ? 56 : 57)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            var17_ref = (java.lang.reflect.Field) var18.field_w[var5].field_b;
                            var21 = var17_ref;
                            var21.setInt((Object) null, var18.field_v[var5]);
                            param0.c(0, (byte) 75);
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof ClassNotFoundException ? 46 : (stateCaught_31 instanceof InvalidClassException ? 47 : (stateCaught_31 instanceof StreamCorruptedException ? 48 : (stateCaught_31 instanceof OptionalDataException ? 49 : (stateCaught_31 instanceof IllegalAccessException ? 50 : (stateCaught_31 instanceof IllegalArgumentException ? 51 : (stateCaught_31 instanceof java.lang.reflect.InvocationTargetException ? 52 : (stateCaught_31 instanceof SecurityException ? 53 : (stateCaught_31 instanceof IOException ? 54 : (stateCaught_31 instanceof NullPointerException ? 55 : (stateCaught_31 instanceof Exception ? 56 : 57)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if (3 != var6_int) {
                                statePc = 43;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof ClassNotFoundException ? 46 : (stateCaught_32 instanceof InvalidClassException ? 47 : (stateCaught_32 instanceof StreamCorruptedException ? 48 : (stateCaught_32 instanceof OptionalDataException ? 49 : (stateCaught_32 instanceof IllegalAccessException ? 50 : (stateCaught_32 instanceof IllegalArgumentException ? 51 : (stateCaught_32 instanceof java.lang.reflect.InvocationTargetException ? 52 : (stateCaught_32 instanceof SecurityException ? 53 : (stateCaught_32 instanceof IOException ? 54 : (stateCaught_32 instanceof NullPointerException ? 55 : (stateCaught_32 instanceof Exception ? 56 : 57)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            var30 = (java.lang.reflect.Method) var18.field_u[var5].field_b;
                            var27 = var18.field_r[var5];
                            var9 = new Object[var27.length];
                            var10_int = 0;
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof ClassNotFoundException ? 46 : (stateCaught_33 instanceof InvalidClassException ? 47 : (stateCaught_33 instanceof StreamCorruptedException ? 48 : (stateCaught_33 instanceof OptionalDataException ? 49 : (stateCaught_33 instanceof IllegalAccessException ? 50 : (stateCaught_33 instanceof IllegalArgumentException ? 51 : (stateCaught_33 instanceof java.lang.reflect.InvocationTargetException ? 52 : (stateCaught_33 instanceof SecurityException ? 53 : (stateCaught_33 instanceof IOException ? 54 : (stateCaught_33 instanceof NullPointerException ? 55 : (stateCaught_33 instanceof Exception ? 56 : 57)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if (var27.length <= var10_int) {
                                statePc = 36;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof ClassNotFoundException ? 46 : (stateCaught_34 instanceof InvalidClassException ? 47 : (stateCaught_34 instanceof StreamCorruptedException ? 48 : (stateCaught_34 instanceof OptionalDataException ? 49 : (stateCaught_34 instanceof IllegalAccessException ? 50 : (stateCaught_34 instanceof IllegalArgumentException ? 51 : (stateCaught_34 instanceof java.lang.reflect.InvocationTargetException ? 52 : (stateCaught_34 instanceof SecurityException ? 53 : (stateCaught_34 instanceof IOException ? 54 : (stateCaught_34 instanceof NullPointerException ? 55 : (stateCaught_34 instanceof Exception ? 56 : 57)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            var11 = new ObjectInputStream((InputStream) (Object) new ByteArrayInputStream(var27[var10_int]));
                            var9[var10_int] = var11.readObject();
                            var10_int++;
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof ClassNotFoundException ? 46 : (stateCaught_35 instanceof InvalidClassException ? 47 : (stateCaught_35 instanceof StreamCorruptedException ? 48 : (stateCaught_35 instanceof OptionalDataException ? 49 : (stateCaught_35 instanceof IllegalAccessException ? 50 : (stateCaught_35 instanceof IllegalArgumentException ? 51 : (stateCaught_35 instanceof java.lang.reflect.InvocationTargetException ? 52 : (stateCaught_35 instanceof SecurityException ? 53 : (stateCaught_35 instanceof IOException ? 54 : (stateCaught_35 instanceof NullPointerException ? 55 : (stateCaught_35 instanceof Exception ? 56 : 57)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            var10 = var30.invoke((Object) null, var9);
                            if (var10 != null) {
                                statePc = 38;
                            } else {
                                statePc = 37;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof ClassNotFoundException ? 46 : (stateCaught_36 instanceof InvalidClassException ? 47 : (stateCaught_36 instanceof StreamCorruptedException ? 48 : (stateCaught_36 instanceof OptionalDataException ? 49 : (stateCaught_36 instanceof IllegalAccessException ? 50 : (stateCaught_36 instanceof IllegalArgumentException ? 51 : (stateCaught_36 instanceof java.lang.reflect.InvocationTargetException ? 52 : (stateCaught_36 instanceof SecurityException ? 53 : (stateCaught_36 instanceof IOException ? 54 : (stateCaught_36 instanceof NullPointerException ? 55 : (stateCaught_36 instanceof Exception ? 56 : 57)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            param0.c(0, (byte) -67);
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof ClassNotFoundException ? 46 : (stateCaught_37 instanceof InvalidClassException ? 47 : (stateCaught_37 instanceof StreamCorruptedException ? 48 : (stateCaught_37 instanceof OptionalDataException ? 49 : (stateCaught_37 instanceof IllegalAccessException ? 50 : (stateCaught_37 instanceof IllegalArgumentException ? 51 : (stateCaught_37 instanceof java.lang.reflect.InvocationTargetException ? 52 : (stateCaught_37 instanceof SecurityException ? 53 : (stateCaught_37 instanceof IOException ? 54 : (stateCaught_37 instanceof NullPointerException ? 55 : (stateCaught_37 instanceof Exception ? 56 : 57)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            if (var10 instanceof Number) {
                                statePc = 42;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof ClassNotFoundException ? 46 : (stateCaught_38 instanceof InvalidClassException ? 47 : (stateCaught_38 instanceof StreamCorruptedException ? 48 : (stateCaught_38 instanceof OptionalDataException ? 49 : (stateCaught_38 instanceof IllegalAccessException ? 50 : (stateCaught_38 instanceof IllegalArgumentException ? 51 : (stateCaught_38 instanceof java.lang.reflect.InvocationTargetException ? 52 : (stateCaught_38 instanceof SecurityException ? 53 : (stateCaught_38 instanceof IOException ? 54 : (stateCaught_38 instanceof NullPointerException ? 55 : (stateCaught_38 instanceof Exception ? 56 : 57)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            if (!(var10 instanceof String)) {
                                statePc = 41;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof ClassNotFoundException ? 46 : (stateCaught_39 instanceof InvalidClassException ? 47 : (stateCaught_39 instanceof StreamCorruptedException ? 48 : (stateCaught_39 instanceof OptionalDataException ? 49 : (stateCaught_39 instanceof IllegalAccessException ? 50 : (stateCaught_39 instanceof IllegalArgumentException ? 51 : (stateCaught_39 instanceof java.lang.reflect.InvocationTargetException ? 52 : (stateCaught_39 instanceof SecurityException ? 53 : (stateCaught_39 instanceof IOException ? 54 : (stateCaught_39 instanceof NullPointerException ? 55 : (stateCaught_39 instanceof Exception ? 56 : 57)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            param0.c(2, (byte) -90);
                            param0.a(-108, (String) var10);
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof ClassNotFoundException ? 46 : (stateCaught_40 instanceof InvalidClassException ? 47 : (stateCaught_40 instanceof StreamCorruptedException ? 48 : (stateCaught_40 instanceof OptionalDataException ? 49 : (stateCaught_40 instanceof IllegalAccessException ? 50 : (stateCaught_40 instanceof IllegalArgumentException ? 51 : (stateCaught_40 instanceof java.lang.reflect.InvocationTargetException ? 52 : (stateCaught_40 instanceof SecurityException ? 53 : (stateCaught_40 instanceof IOException ? 54 : (stateCaught_40 instanceof NullPointerException ? 55 : (stateCaught_40 instanceof Exception ? 56 : 57)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            param0.c(4, (byte) -51);
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof ClassNotFoundException ? 46 : (stateCaught_41 instanceof InvalidClassException ? 47 : (stateCaught_41 instanceof StreamCorruptedException ? 48 : (stateCaught_41 instanceof OptionalDataException ? 49 : (stateCaught_41 instanceof IllegalAccessException ? 50 : (stateCaught_41 instanceof IllegalArgumentException ? 51 : (stateCaught_41 instanceof java.lang.reflect.InvocationTargetException ? 52 : (stateCaught_41 instanceof SecurityException ? 53 : (stateCaught_41 instanceof IOException ? 54 : (stateCaught_41 instanceof NullPointerException ? 55 : (stateCaught_41 instanceof Exception ? 56 : 57)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            param0.c(1, (byte) -100);
                            param0.a(-98, ((Number) var10).longValue());
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof ClassNotFoundException ? 46 : (stateCaught_42 instanceof InvalidClassException ? 47 : (stateCaught_42 instanceof StreamCorruptedException ? 48 : (stateCaught_42 instanceof OptionalDataException ? 49 : (stateCaught_42 instanceof IllegalAccessException ? 50 : (stateCaught_42 instanceof IllegalArgumentException ? 51 : (stateCaught_42 instanceof java.lang.reflect.InvocationTargetException ? 52 : (stateCaught_42 instanceof SecurityException ? 53 : (stateCaught_42 instanceof IOException ? 54 : (stateCaught_42 instanceof NullPointerException ? 55 : (stateCaught_42 instanceof Exception ? 56 : 57)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            if (var6_int != 4) {
                                statePc = 58;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof ClassNotFoundException ? 46 : (stateCaught_43 instanceof InvalidClassException ? 47 : (stateCaught_43 instanceof StreamCorruptedException ? 48 : (stateCaught_43 instanceof OptionalDataException ? 49 : (stateCaught_43 instanceof IllegalAccessException ? 50 : (stateCaught_43 instanceof IllegalArgumentException ? 51 : (stateCaught_43 instanceof java.lang.reflect.InvocationTargetException ? 52 : (stateCaught_43 instanceof SecurityException ? 53 : (stateCaught_43 instanceof IOException ? 54 : (stateCaught_43 instanceof NullPointerException ? 55 : (stateCaught_43 instanceof Exception ? 56 : 57)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            var31 = (java.lang.reflect.Method) var18.field_u[var5].field_b;
                            var8 = var31.getModifiers();
                            param0.c(0, (byte) 111);
                            param0.d(var8, (byte) -81);
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof ClassNotFoundException ? 46 : (stateCaught_44 instanceof InvalidClassException ? 47 : (stateCaught_44 instanceof StreamCorruptedException ? 48 : (stateCaught_44 instanceof OptionalDataException ? 49 : (stateCaught_44 instanceof IllegalAccessException ? 50 : (stateCaught_44 instanceof IllegalArgumentException ? 51 : (stateCaught_44 instanceof java.lang.reflect.InvocationTargetException ? 52 : (stateCaught_44 instanceof SecurityException ? 53 : (stateCaught_44 instanceof IOException ? 54 : (stateCaught_44 instanceof NullPointerException ? 55 : (stateCaught_44 instanceof Exception ? 56 : 57)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        var6 = (ClassNotFoundException) (Object) caughtException;
                        param0.c(-10, (byte) -85);
                        statePc = 58;
                        continue stateLoop;
                    }
                    case 47: {
                        var6_ref = (InvalidClassException) (Object) caughtException;
                        param0.c(-11, (byte) 105);
                        statePc = 58;
                        continue stateLoop;
                    }
                    case 48: {
                        var6_ref2 = (StreamCorruptedException) (Object) caughtException;
                        param0.c(-12, (byte) -102);
                        statePc = 58;
                        continue stateLoop;
                    }
                    case 49: {
                        var6_ref3 = (OptionalDataException) (Object) caughtException;
                        param0.c(-13, (byte) 116);
                        statePc = 58;
                        continue stateLoop;
                    }
                    case 50: {
                        var6_ref4 = (IllegalAccessException) (Object) caughtException;
                        param0.c(-14, (byte) -115);
                        statePc = 58;
                        continue stateLoop;
                    }
                    case 51: {
                        var6_ref5 = (IllegalArgumentException) (Object) caughtException;
                        param0.c(-15, (byte) 123);
                        statePc = 58;
                        continue stateLoop;
                    }
                    case 52: {
                        var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) caughtException;
                        param0.c(-16, (byte) 79);
                        statePc = 58;
                        continue stateLoop;
                    }
                    case 53: {
                        var6_ref7 = (SecurityException) (Object) caughtException;
                        param0.c(-17, (byte) 114);
                        statePc = 58;
                        continue stateLoop;
                    }
                    case 54: {
                        var6_ref8 = (IOException) (Object) caughtException;
                        param0.c(-18, (byte) -56);
                        statePc = 58;
                        continue stateLoop;
                    }
                    case 55: {
                        var6_ref9 = (NullPointerException) (Object) caughtException;
                        param0.c(-19, (byte) -114);
                        statePc = 58;
                        continue stateLoop;
                    }
                    case 56: {
                        var6_ref10 = (Exception) (Object) caughtException;
                        param0.c(-20, (byte) -113);
                        statePc = 58;
                        continue stateLoop;
                    }
                    case 57: {
                        var6_ref11 = caughtException;
                        param0.c(-21, (byte) 118);
                        statePc = 58;
                        continue stateLoop;
                    }
                    case 58: {
                        var5++;
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 59: {
                        if (param1 == 67) {
                            statePc = 61;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    }
                    case 60: {
                        var13 = null;
                        de.a((nk) null, (byte) -43);
                        statePc = 61;
                        continue stateLoop;
                    }
                    case 61: {
                        int discarded$1 = param0.b(var4, (byte) -126);
                        var18.c(-2193);
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

    public static void a(byte param0) {
        field_a = null;
        field_d = null;
        if (param0 > -101) {
            field_a = null;
        }
        field_b = null;
        field_c = null;
    }

    final static void a(int param0, boolean param1) {
        if (param0 != 0) {
            Object var3 = null;
            de.a((nk) null, (byte) -114);
        }
        if (!(pc.field_Mb == null)) {
            sj.a(pc.field_Mb, (byte) 85);
        }
        if (null != pi.field_d) {
            pi.field_d.b(-65, param1);
        }
        k.a(param1, param0 ^ 100);
        if (!(pj.field_h == null)) {
            pj.field_h.a(false, param1);
        }
        vk.a(false, param1);
    }

    final static void a(int param0) {
        if (qk.field_h == jc.field_f) {
            return;
        }
        if (0 <= jc.field_f) {
            ae.field_e[jc.field_f].c((byte) -57);
        }
        if (param0 != -31645) {
            return;
        }
        jc.field_f = qk.field_h;
        if (lc.field_q) {
            oc.field_p = null;
            lc.field_q = false;
        }
        nc.field_T = 0;
        wn.field_e = ma.field_D;
        if (mf.field_o) {
            cb.field_e = null;
            tg.field_e = new jc();
            wc.field_w = 0;
            mf.field_o = false;
            vk.field_b = 0;
        }
        if (!(!ji.field_P)) {
            fj.a(param0 + 31645);
            vf.a(true);
            pd.field_Lb = null;
            ji.field_P = false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Owner";
        field_b = "This password contains repeated characters, and would be easy to guess";
    }
}
