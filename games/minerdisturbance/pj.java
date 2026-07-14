/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pj implements uj {
    static int field_a;
    static int field_b;
    static String field_d;
    static ea[] field_e;
    static th field_c;

    public static void a(int param0) {
        field_e = null;
        field_c = null;
        if (param0 != 2) {
            field_c = null;
        }
        field_d = null;
    }

    final static void a(byte param0, ld param1) {
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
            gl var13 = null;
            java.lang.reflect.Field var15 = null;
            Object var16 = null;
            java.lang.reflect.Field var16_ref = null;
            gl var17 = null;
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
                        var12 = MinerDisturbance.field_ab;
                        var13 = (gl) (Object) on.field_t.b(105);
                        var17 = var13;
                        if (param0 == 119) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        field_e = null;
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
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
                        if (var4 >= var17.field_y) {
                            statePc = 21;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        if (var13.field_r[var4] == null) {
                            statePc = 13;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        if (var13.field_r[var4].field_c == 2) {
                            statePc = 10;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        var13.field_w[var4] = -5;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        if (-1 != (var13.field_r[var4].field_c ^ -1)) {
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
                        if (null != var13.field_q[var4]) {
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
                        if (-3 == (var13.field_q[var4].field_c ^ -1)) {
                            statePc = 17;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 17: {
                        var13.field_w[var4] = -6;
                        statePc = 18;
                        continue stateLoop;
                    }
                    case 18: {
                        if (0 == var13.field_q[var4].field_c) {
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
                        if (var3 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        return;
                    }
                    case 23: {
                        var4 = param1.field_o;
                        param1.a((byte) 107, var17.field_n);
                        var5 = 0;
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 24: {
                        if (var17.field_y <= var5) {
                            statePc = 63;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    }
                    case 25: {
                        if (0 != var17.field_w[var5]) {
                            statePc = 27;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    }
                    case 27: {
                        param1.c(var17.field_w[var5], 25564);
                        statePc = 62;
                        continue stateLoop;
                    }
                    case 28: {
                        try {
                            var6_int = var17.field_s[var5];
                            if (var6_int != 0) {
                                statePc = 30;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof ClassNotFoundException ? 50 : (stateCaught_28 instanceof InvalidClassException ? 51 : (stateCaught_28 instanceof StreamCorruptedException ? 52 : (stateCaught_28 instanceof OptionalDataException ? 53 : (stateCaught_28 instanceof IllegalAccessException ? 54 : (stateCaught_28 instanceof IllegalArgumentException ? 55 : (stateCaught_28 instanceof java.lang.reflect.InvocationTargetException ? 56 : (stateCaught_28 instanceof SecurityException ? 57 : (stateCaught_28 instanceof IOException ? 58 : (stateCaught_28 instanceof NullPointerException ? 59 : (stateCaught_28 instanceof Exception ? 60 : 61)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            var26 = (java.lang.reflect.Field) var17.field_r[var5].field_a;
                            var8 = var26.getInt((Object) null);
                            param1.c(0, 25564);
                            param1.a((byte) 120, var8);
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof ClassNotFoundException ? 50 : (stateCaught_29 instanceof InvalidClassException ? 51 : (stateCaught_29 instanceof StreamCorruptedException ? 52 : (stateCaught_29 instanceof OptionalDataException ? 53 : (stateCaught_29 instanceof IllegalAccessException ? 54 : (stateCaught_29 instanceof IllegalArgumentException ? 55 : (stateCaught_29 instanceof java.lang.reflect.InvocationTargetException ? 56 : (stateCaught_29 instanceof SecurityException ? 57 : (stateCaught_29 instanceof IOException ? 58 : (stateCaught_29 instanceof NullPointerException ? 59 : (stateCaught_29 instanceof Exception ? 60 : 61)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if ((var6_int ^ -1) != -2) {
                                statePc = 32;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof ClassNotFoundException ? 50 : (stateCaught_30 instanceof InvalidClassException ? 51 : (stateCaught_30 instanceof StreamCorruptedException ? 52 : (stateCaught_30 instanceof OptionalDataException ? 53 : (stateCaught_30 instanceof IllegalAccessException ? 54 : (stateCaught_30 instanceof IllegalArgumentException ? 55 : (stateCaught_30 instanceof java.lang.reflect.InvocationTargetException ? 56 : (stateCaught_30 instanceof SecurityException ? 57 : (stateCaught_30 instanceof IOException ? 58 : (stateCaught_30 instanceof NullPointerException ? 59 : (stateCaught_30 instanceof Exception ? 60 : 61)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            var16_ref = (java.lang.reflect.Field) var17.field_r[var5].field_a;
                            var19 = var16_ref;
                            var19.setInt((Object) null, var17.field_p[var5]);
                            param1.c(0, 25564);
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof ClassNotFoundException ? 50 : (stateCaught_31 instanceof InvalidClassException ? 51 : (stateCaught_31 instanceof StreamCorruptedException ? 52 : (stateCaught_31 instanceof OptionalDataException ? 53 : (stateCaught_31 instanceof IllegalAccessException ? 54 : (stateCaught_31 instanceof IllegalArgumentException ? 55 : (stateCaught_31 instanceof java.lang.reflect.InvocationTargetException ? 56 : (stateCaught_31 instanceof SecurityException ? 57 : (stateCaught_31 instanceof IOException ? 58 : (stateCaught_31 instanceof NullPointerException ? 59 : (stateCaught_31 instanceof Exception ? 60 : 61)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if (var6_int == 2) {
                                statePc = 34;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof ClassNotFoundException ? 50 : (stateCaught_32 instanceof InvalidClassException ? 51 : (stateCaught_32 instanceof StreamCorruptedException ? 52 : (stateCaught_32 instanceof OptionalDataException ? 53 : (stateCaught_32 instanceof IllegalAccessException ? 54 : (stateCaught_32 instanceof IllegalArgumentException ? 55 : (stateCaught_32 instanceof java.lang.reflect.InvocationTargetException ? 56 : (stateCaught_32 instanceof SecurityException ? 57 : (stateCaught_32 instanceof IOException ? 58 : (stateCaught_32 instanceof NullPointerException ? 59 : (stateCaught_32 instanceof Exception ? 60 : 61)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof ClassNotFoundException ? 50 : (stateCaught_33 instanceof InvalidClassException ? 51 : (stateCaught_33 instanceof StreamCorruptedException ? 52 : (stateCaught_33 instanceof OptionalDataException ? 53 : (stateCaught_33 instanceof IllegalAccessException ? 54 : (stateCaught_33 instanceof IllegalArgumentException ? 55 : (stateCaught_33 instanceof java.lang.reflect.InvocationTargetException ? 56 : (stateCaught_33 instanceof SecurityException ? 57 : (stateCaught_33 instanceof IOException ? 58 : (stateCaught_33 instanceof NullPointerException ? 59 : (stateCaught_33 instanceof Exception ? 60 : 61)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            var15 = (java.lang.reflect.Field) var17.field_r[var5].field_a;
                            var8 = var15.getModifiers();
                            param1.c(0, 25564);
                            param1.a((byte) 95, var8);
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof ClassNotFoundException ? 50 : (stateCaught_34 instanceof InvalidClassException ? 51 : (stateCaught_34 instanceof StreamCorruptedException ? 52 : (stateCaught_34 instanceof OptionalDataException ? 53 : (stateCaught_34 instanceof IllegalAccessException ? 54 : (stateCaught_34 instanceof IllegalArgumentException ? 55 : (stateCaught_34 instanceof java.lang.reflect.InvocationTargetException ? 56 : (stateCaught_34 instanceof SecurityException ? 57 : (stateCaught_34 instanceof IOException ? 58 : (stateCaught_34 instanceof NullPointerException ? 59 : (stateCaught_34 instanceof Exception ? 60 : 61)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            if (var6_int == 3) {
                                statePc = 39;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof ClassNotFoundException ? 50 : (stateCaught_35 instanceof InvalidClassException ? 51 : (stateCaught_35 instanceof StreamCorruptedException ? 52 : (stateCaught_35 instanceof OptionalDataException ? 53 : (stateCaught_35 instanceof IllegalAccessException ? 54 : (stateCaught_35 instanceof IllegalArgumentException ? 55 : (stateCaught_35 instanceof java.lang.reflect.InvocationTargetException ? 56 : (stateCaught_35 instanceof SecurityException ? 57 : (stateCaught_35 instanceof IOException ? 58 : (stateCaught_35 instanceof NullPointerException ? 59 : (stateCaught_35 instanceof Exception ? 60 : 61)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            if (-5 == (var6_int ^ -1)) {
                                statePc = 38;
                            } else {
                                statePc = 37;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof ClassNotFoundException ? 50 : (stateCaught_36 instanceof InvalidClassException ? 51 : (stateCaught_36 instanceof StreamCorruptedException ? 52 : (stateCaught_36 instanceof OptionalDataException ? 53 : (stateCaught_36 instanceof IllegalAccessException ? 54 : (stateCaught_36 instanceof IllegalArgumentException ? 55 : (stateCaught_36 instanceof java.lang.reflect.InvocationTargetException ? 56 : (stateCaught_36 instanceof SecurityException ? 57 : (stateCaught_36 instanceof IOException ? 58 : (stateCaught_36 instanceof NullPointerException ? 59 : (stateCaught_36 instanceof Exception ? 60 : 61)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof ClassNotFoundException ? 50 : (stateCaught_37 instanceof InvalidClassException ? 51 : (stateCaught_37 instanceof StreamCorruptedException ? 52 : (stateCaught_37 instanceof OptionalDataException ? 53 : (stateCaught_37 instanceof IllegalAccessException ? 54 : (stateCaught_37 instanceof IllegalArgumentException ? 55 : (stateCaught_37 instanceof java.lang.reflect.InvocationTargetException ? 56 : (stateCaught_37 instanceof SecurityException ? 57 : (stateCaught_37 instanceof IOException ? 58 : (stateCaught_37 instanceof NullPointerException ? 59 : (stateCaught_37 instanceof Exception ? 60 : 61)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            var27 = (java.lang.reflect.Method) var17.field_q[var5].field_a;
                            var8 = var27.getModifiers();
                            param1.c(0, 25564);
                            param1.a((byte) 108, var8);
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof ClassNotFoundException ? 50 : (stateCaught_38 instanceof InvalidClassException ? 51 : (stateCaught_38 instanceof StreamCorruptedException ? 52 : (stateCaught_38 instanceof OptionalDataException ? 53 : (stateCaught_38 instanceof IllegalAccessException ? 54 : (stateCaught_38 instanceof IllegalArgumentException ? 55 : (stateCaught_38 instanceof java.lang.reflect.InvocationTargetException ? 56 : (stateCaught_38 instanceof SecurityException ? 57 : (stateCaught_38 instanceof IOException ? 58 : (stateCaught_38 instanceof NullPointerException ? 59 : (stateCaught_38 instanceof Exception ? 60 : 61)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            var28 = (java.lang.reflect.Method) var17.field_q[var5].field_a;
                            var25 = var17.field_v[var5];
                            var9 = new Object[var25.length];
                            var10_int = 0;
                            statePc = 40;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof ClassNotFoundException ? 50 : (stateCaught_39 instanceof InvalidClassException ? 51 : (stateCaught_39 instanceof StreamCorruptedException ? 52 : (stateCaught_39 instanceof OptionalDataException ? 53 : (stateCaught_39 instanceof IllegalAccessException ? 54 : (stateCaught_39 instanceof IllegalArgumentException ? 55 : (stateCaught_39 instanceof java.lang.reflect.InvocationTargetException ? 56 : (stateCaught_39 instanceof SecurityException ? 57 : (stateCaught_39 instanceof IOException ? 58 : (stateCaught_39 instanceof NullPointerException ? 59 : (stateCaught_39 instanceof Exception ? 60 : 61)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            if (var10_int >= var25.length) {
                                statePc = 42;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof ClassNotFoundException ? 50 : (stateCaught_40 instanceof InvalidClassException ? 51 : (stateCaught_40 instanceof StreamCorruptedException ? 52 : (stateCaught_40 instanceof OptionalDataException ? 53 : (stateCaught_40 instanceof IllegalAccessException ? 54 : (stateCaught_40 instanceof IllegalArgumentException ? 55 : (stateCaught_40 instanceof java.lang.reflect.InvocationTargetException ? 56 : (stateCaught_40 instanceof SecurityException ? 57 : (stateCaught_40 instanceof IOException ? 58 : (stateCaught_40 instanceof NullPointerException ? 59 : (stateCaught_40 instanceof Exception ? 60 : 61)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            var11 = new ObjectInputStream((InputStream) (Object) new ByteArrayInputStream(var25[var10_int]));
                            var9[var10_int] = var11.readObject();
                            var10_int++;
                            statePc = 40;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof ClassNotFoundException ? 50 : (stateCaught_41 instanceof InvalidClassException ? 51 : (stateCaught_41 instanceof StreamCorruptedException ? 52 : (stateCaught_41 instanceof OptionalDataException ? 53 : (stateCaught_41 instanceof IllegalAccessException ? 54 : (stateCaught_41 instanceof IllegalArgumentException ? 55 : (stateCaught_41 instanceof java.lang.reflect.InvocationTargetException ? 56 : (stateCaught_41 instanceof SecurityException ? 57 : (stateCaught_41 instanceof IOException ? 58 : (stateCaught_41 instanceof NullPointerException ? 59 : (stateCaught_41 instanceof Exception ? 60 : 61)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            var10 = var28.invoke((Object) null, var9);
                            if (var10 == null) {
                                statePc = 48;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof ClassNotFoundException ? 50 : (stateCaught_42 instanceof InvalidClassException ? 51 : (stateCaught_42 instanceof StreamCorruptedException ? 52 : (stateCaught_42 instanceof OptionalDataException ? 53 : (stateCaught_42 instanceof IllegalAccessException ? 54 : (stateCaught_42 instanceof IllegalArgumentException ? 55 : (stateCaught_42 instanceof java.lang.reflect.InvocationTargetException ? 56 : (stateCaught_42 instanceof SecurityException ? 57 : (stateCaught_42 instanceof IOException ? 58 : (stateCaught_42 instanceof NullPointerException ? 59 : (stateCaught_42 instanceof Exception ? 60 : 61)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            if (var10 instanceof Number) {
                                statePc = 47;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof ClassNotFoundException ? 50 : (stateCaught_43 instanceof InvalidClassException ? 51 : (stateCaught_43 instanceof StreamCorruptedException ? 52 : (stateCaught_43 instanceof OptionalDataException ? 53 : (stateCaught_43 instanceof IllegalAccessException ? 54 : (stateCaught_43 instanceof IllegalArgumentException ? 55 : (stateCaught_43 instanceof java.lang.reflect.InvocationTargetException ? 56 : (stateCaught_43 instanceof SecurityException ? 57 : (stateCaught_43 instanceof IOException ? 58 : (stateCaught_43 instanceof NullPointerException ? 59 : (stateCaught_43 instanceof Exception ? 60 : 61)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            if (!(var10 instanceof String)) {
                                statePc = 46;
                            } else {
                                statePc = 45;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof ClassNotFoundException ? 50 : (stateCaught_44 instanceof InvalidClassException ? 51 : (stateCaught_44 instanceof StreamCorruptedException ? 52 : (stateCaught_44 instanceof OptionalDataException ? 53 : (stateCaught_44 instanceof IllegalAccessException ? 54 : (stateCaught_44 instanceof IllegalArgumentException ? 55 : (stateCaught_44 instanceof java.lang.reflect.InvocationTargetException ? 56 : (stateCaught_44 instanceof SecurityException ? 57 : (stateCaught_44 instanceof IOException ? 58 : (stateCaught_44 instanceof NullPointerException ? 59 : (stateCaught_44 instanceof Exception ? 60 : 61)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            param1.c(2, 25564);
                            param1.b(23446, (String) var10);
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof ClassNotFoundException ? 50 : (stateCaught_45 instanceof InvalidClassException ? 51 : (stateCaught_45 instanceof StreamCorruptedException ? 52 : (stateCaught_45 instanceof OptionalDataException ? 53 : (stateCaught_45 instanceof IllegalAccessException ? 54 : (stateCaught_45 instanceof IllegalArgumentException ? 55 : (stateCaught_45 instanceof java.lang.reflect.InvocationTargetException ? 56 : (stateCaught_45 instanceof SecurityException ? 57 : (stateCaught_45 instanceof IOException ? 58 : (stateCaught_45 instanceof NullPointerException ? 59 : (stateCaught_45 instanceof Exception ? 60 : 61)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            param1.c(4, 25564);
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof ClassNotFoundException ? 50 : (stateCaught_46 instanceof InvalidClassException ? 51 : (stateCaught_46 instanceof StreamCorruptedException ? 52 : (stateCaught_46 instanceof OptionalDataException ? 53 : (stateCaught_46 instanceof IllegalAccessException ? 54 : (stateCaught_46 instanceof IllegalArgumentException ? 55 : (stateCaught_46 instanceof java.lang.reflect.InvocationTargetException ? 56 : (stateCaught_46 instanceof SecurityException ? 57 : (stateCaught_46 instanceof IOException ? 58 : (stateCaught_46 instanceof NullPointerException ? 59 : (stateCaught_46 instanceof Exception ? 60 : 61)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            param1.c(1, 25564);
                            param1.b(-1, ((Number) var10).longValue());
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof ClassNotFoundException ? 50 : (stateCaught_47 instanceof InvalidClassException ? 51 : (stateCaught_47 instanceof StreamCorruptedException ? 52 : (stateCaught_47 instanceof OptionalDataException ? 53 : (stateCaught_47 instanceof IllegalAccessException ? 54 : (stateCaught_47 instanceof IllegalArgumentException ? 55 : (stateCaught_47 instanceof java.lang.reflect.InvocationTargetException ? 56 : (stateCaught_47 instanceof SecurityException ? 57 : (stateCaught_47 instanceof IOException ? 58 : (stateCaught_47 instanceof NullPointerException ? 59 : (stateCaught_47 instanceof Exception ? 60 : 61)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            param1.c(0, 25564);
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof ClassNotFoundException ? 50 : (stateCaught_48 instanceof InvalidClassException ? 51 : (stateCaught_48 instanceof StreamCorruptedException ? 52 : (stateCaught_48 instanceof OptionalDataException ? 53 : (stateCaught_48 instanceof IllegalAccessException ? 54 : (stateCaught_48 instanceof IllegalArgumentException ? 55 : (stateCaught_48 instanceof java.lang.reflect.InvocationTargetException ? 56 : (stateCaught_48 instanceof SecurityException ? 57 : (stateCaught_48 instanceof IOException ? 58 : (stateCaught_48 instanceof NullPointerException ? 59 : (stateCaught_48 instanceof Exception ? 60 : 61)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        var6 = (ClassNotFoundException) (Object) caughtException;
                        param1.c(-10, 25564);
                        statePc = 62;
                        continue stateLoop;
                    }
                    case 51: {
                        var6_ref = (InvalidClassException) (Object) caughtException;
                        param1.c(-11, 25564);
                        statePc = 62;
                        continue stateLoop;
                    }
                    case 52: {
                        var6_ref2 = (StreamCorruptedException) (Object) caughtException;
                        param1.c(-12, 25564);
                        statePc = 62;
                        continue stateLoop;
                    }
                    case 53: {
                        var6_ref3 = (OptionalDataException) (Object) caughtException;
                        param1.c(-13, param0 ^ 25515);
                        statePc = 62;
                        continue stateLoop;
                    }
                    case 54: {
                        var6_ref4 = (IllegalAccessException) (Object) caughtException;
                        param1.c(-14, 25564);
                        statePc = 62;
                        continue stateLoop;
                    }
                    case 55: {
                        var6_ref5 = (IllegalArgumentException) (Object) caughtException;
                        param1.c(-15, 25564);
                        statePc = 62;
                        continue stateLoop;
                    }
                    case 56: {
                        var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) caughtException;
                        param1.c(-16, 25564);
                        statePc = 62;
                        continue stateLoop;
                    }
                    case 57: {
                        var6_ref7 = (SecurityException) (Object) caughtException;
                        param1.c(-17, 25564);
                        statePc = 62;
                        continue stateLoop;
                    }
                    case 58: {
                        var6_ref8 = (IOException) (Object) caughtException;
                        param1.c(-18, param0 + 25445);
                        statePc = 62;
                        continue stateLoop;
                    }
                    case 59: {
                        var6_ref9 = (NullPointerException) (Object) caughtException;
                        param1.c(-19, 25564);
                        statePc = 62;
                        continue stateLoop;
                    }
                    case 60: {
                        var6_ref10 = (Exception) (Object) caughtException;
                        param1.c(-20, 25564);
                        statePc = 62;
                        continue stateLoop;
                    }
                    case 61: {
                        var6_ref11 = caughtException;
                        param1.c(-21, 25564);
                        statePc = 62;
                        continue stateLoop;
                    }
                    case 62: {
                        var5++;
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 63: {
                        int discarded$1 = param1.e(-84, var4);
                        var17.b(param0 + -85);
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

    public final void a(boolean param0) {
        tb.field_a = 4;
        om.field_g = 9;
        if (param0) {
            Object var3 = null;
            p discarded$0 = pj.a(106, 69, (bj) null, 17, (bj) null);
        }
    }

    public final String a(byte param0) {
        int var2 = -73 % ((param0 - -33) / 62);
        return "Add Myth";
    }

    final static void a(boolean param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = MinerDisturbance.field_ab;
          if ((field_a ^ -1) < -1) {
            L1: {
              if (null == ij.field_o) {
                kf.field_d = pe.a((byte) -124, 640, 0, 480, 0, qa.field_a);
                break L1;
              } else {
                kf.field_d = ij.field_o.a((byte) -70);
                le.a((byte) -128, 2);
                break L1;
              }
            }
            if (null != kf.field_d) {
              var2 = 2;
              ab.a((byte) -13, (java.awt.Canvas) (Object) kf.field_d);
              break L0;
            } else {
              var2 = 3;
              break L0;
            }
          } else {
            if (!kj.a(false)) {
              var2 = 1;
              break L0;
            } else {
              var2 = 0;
              break L0;
            }
          }
        }
        if (param1 <= -117) {
          L2: {
            if (ij.field_o != null) {
              break L2;
            } else {
              if (em.field_w) {
                qd.a(126, param0, var2);
                break L2;
              } else {
                break L2;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final static p a(int param0, int param1, bj param2, int param3, bj param4) {
        if (param0 != -10) {
            field_a = 81;
        }
        if (!cn.a(param3, 258, param1, param2)) {
            return null;
        }
        return lg.a(param4.a(false, param1, param3), param0 + -6623);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Invalid password.";
    }
}
