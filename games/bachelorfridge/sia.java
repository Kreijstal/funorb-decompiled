/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sia extends kj {
    private kv field_l;
    static kv field_j;
    static boolean field_h;
    static kv field_g;
    private int field_f;
    static java.awt.Canvas field_i;
    private ad field_k;

    public static void c(int param0) {
        field_j = null;
        if (param0 != 10371) {
            sia.c(13);
        }
        field_g = null;
        field_i = null;
    }

    sia(gj param0, int param1, int param2, ad param3) {
        super(param0, param1, param2);
        ((sia) this).field_k = param3;
        ((sia) this).field_f = 100;
        ((sia) this).field_l = en.field_a.a();
    }

    final boolean b(int param0) {
        if (param0 < 21) {
            sia.c(-46);
        }
        ((sia) this).field_f = ((sia) this).field_f - 1;
        return 0 >= ((sia) this).field_f - 1 ? true : false;
    }

    final static void a(pf param0, int param1) {
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
            fka var13 = null;
            java.lang.reflect.Field var15 = null;
            fka var16 = null;
            java.lang.reflect.Field var17 = null;
            Object var18 = null;
            Object var19 = null;
            Object var20 = null;
            Object var22 = null;
            byte[][] var25 = null;
            java.lang.reflect.Field var26 = null;
            java.lang.reflect.Field var27 = null;
            java.lang.reflect.Method var28 = null;
            java.lang.reflect.Method var29 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var18 = null;
                        var19 = null;
                        var20 = null;
                        var22 = null;
                        var12 = BachelorFridge.field_y;
                        var13 = (fka) (Object) fd.field_z.b((byte) 90);
                        var16 = var13;
                        if (var16 != null) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        return;
                    }
                    case 2: {
                        var3 = 0;
                        var4 = 0;
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        if (var4 >= var16.field_k) {
                            statePc = 17;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        if (null == var13.field_i[var4]) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        if (2 != var13.field_i[var4].field_f) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        var13.field_l[var4] = -5;
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        if (var13.field_i[var4].field_f != 0) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        var3 = 1;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        if (null != var13.field_j[var4]) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        var4++;
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 11: {
                        if ((var13.field_j[var4].field_f ^ -1) == -3) {
                            statePc = 13;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        var13.field_l[var4] = -6;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
                        if (var13.field_j[var4].field_f == 0) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        var4++;
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 16: {
                        var3 = 1;
                        var4++;
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 17: {
                        if (var3 != 0) {
                            statePc = 19;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 19: {
                        return;
                    }
                    case 20: {
                        var4 = param0.field_g;
                        param0.e(var16.field_n, -1615464796);
                        var5 = 0;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 21: {
                        if (var5 >= var16.field_k) {
                            statePc = 60;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        if (-1 != (var16.field_l[var5] ^ -1)) {
                            statePc = 24;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    }
                    case 24: {
                        param0.d(var16.field_l[var5], 0);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 25: {
                        try {
                            var6_int = var16.field_g[var5];
                            if (var6_int == 0) {
                                statePc = 31;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof ClassNotFoundException ? 47 : (stateCaught_25 instanceof InvalidClassException ? 48 : (stateCaught_25 instanceof StreamCorruptedException ? 49 : (stateCaught_25 instanceof OptionalDataException ? 50 : (stateCaught_25 instanceof IllegalAccessException ? 51 : (stateCaught_25 instanceof IllegalArgumentException ? 52 : (stateCaught_25 instanceof java.lang.reflect.InvocationTargetException ? 53 : (stateCaught_25 instanceof SecurityException ? 54 : (stateCaught_25 instanceof IOException ? 55 : (stateCaught_25 instanceof NullPointerException ? 56 : (stateCaught_25 instanceof Exception ? 57 : 58)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            if (1 != var6_int) {
                                statePc = 28;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof ClassNotFoundException ? 47 : (stateCaught_26 instanceof InvalidClassException ? 48 : (stateCaught_26 instanceof StreamCorruptedException ? 49 : (stateCaught_26 instanceof OptionalDataException ? 50 : (stateCaught_26 instanceof IllegalAccessException ? 51 : (stateCaught_26 instanceof IllegalArgumentException ? 52 : (stateCaught_26 instanceof java.lang.reflect.InvocationTargetException ? 53 : (stateCaught_26 instanceof SecurityException ? 54 : (stateCaught_26 instanceof IOException ? 55 : (stateCaught_26 instanceof NullPointerException ? 56 : (stateCaught_26 instanceof Exception ? 57 : 58)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var15 = (java.lang.reflect.Field) var16.field_i[var5].field_e;
                            var17 = var15;
                            var17.setInt((Object) null, var16.field_m[var5]);
                            param0.d(0, 0);
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof ClassNotFoundException ? 47 : (stateCaught_27 instanceof InvalidClassException ? 48 : (stateCaught_27 instanceof StreamCorruptedException ? 49 : (stateCaught_27 instanceof OptionalDataException ? 50 : (stateCaught_27 instanceof IllegalAccessException ? 51 : (stateCaught_27 instanceof IllegalArgumentException ? 52 : (stateCaught_27 instanceof java.lang.reflect.InvocationTargetException ? 53 : (stateCaught_27 instanceof SecurityException ? 54 : (stateCaught_27 instanceof IOException ? 55 : (stateCaught_27 instanceof NullPointerException ? 56 : (stateCaught_27 instanceof Exception ? 57 : 58)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            if ((var6_int ^ -1) == -3) {
                                statePc = 30;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof ClassNotFoundException ? 47 : (stateCaught_28 instanceof InvalidClassException ? 48 : (stateCaught_28 instanceof StreamCorruptedException ? 49 : (stateCaught_28 instanceof OptionalDataException ? 50 : (stateCaught_28 instanceof IllegalAccessException ? 51 : (stateCaught_28 instanceof IllegalArgumentException ? 52 : (stateCaught_28 instanceof java.lang.reflect.InvocationTargetException ? 53 : (stateCaught_28 instanceof SecurityException ? 54 : (stateCaught_28 instanceof IOException ? 55 : (stateCaught_28 instanceof NullPointerException ? 56 : (stateCaught_28 instanceof Exception ? 57 : 58)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof ClassNotFoundException ? 47 : (stateCaught_29 instanceof InvalidClassException ? 48 : (stateCaught_29 instanceof StreamCorruptedException ? 49 : (stateCaught_29 instanceof OptionalDataException ? 50 : (stateCaught_29 instanceof IllegalAccessException ? 51 : (stateCaught_29 instanceof IllegalArgumentException ? 52 : (stateCaught_29 instanceof java.lang.reflect.InvocationTargetException ? 53 : (stateCaught_29 instanceof SecurityException ? 54 : (stateCaught_29 instanceof IOException ? 55 : (stateCaught_29 instanceof NullPointerException ? 56 : (stateCaught_29 instanceof Exception ? 57 : 58)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            var26 = (java.lang.reflect.Field) var16.field_i[var5].field_e;
                            var8 = var26.getModifiers();
                            param0.d(0, 0);
                            param0.e(var8, -1615464796);
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof ClassNotFoundException ? 47 : (stateCaught_30 instanceof InvalidClassException ? 48 : (stateCaught_30 instanceof StreamCorruptedException ? 49 : (stateCaught_30 instanceof OptionalDataException ? 50 : (stateCaught_30 instanceof IllegalAccessException ? 51 : (stateCaught_30 instanceof IllegalArgumentException ? 52 : (stateCaught_30 instanceof java.lang.reflect.InvocationTargetException ? 53 : (stateCaught_30 instanceof SecurityException ? 54 : (stateCaught_30 instanceof IOException ? 55 : (stateCaught_30 instanceof NullPointerException ? 56 : (stateCaught_30 instanceof Exception ? 57 : 58)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            var27 = (java.lang.reflect.Field) var16.field_i[var5].field_e;
                            var8 = var27.getInt((Object) null);
                            param0.d(0, 0);
                            param0.e(var8, -1615464796);
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof ClassNotFoundException ? 47 : (stateCaught_31 instanceof InvalidClassException ? 48 : (stateCaught_31 instanceof StreamCorruptedException ? 49 : (stateCaught_31 instanceof OptionalDataException ? 50 : (stateCaught_31 instanceof IllegalAccessException ? 51 : (stateCaught_31 instanceof IllegalArgumentException ? 52 : (stateCaught_31 instanceof java.lang.reflect.InvocationTargetException ? 53 : (stateCaught_31 instanceof SecurityException ? 54 : (stateCaught_31 instanceof IOException ? 55 : (stateCaught_31 instanceof NullPointerException ? 56 : (stateCaught_31 instanceof Exception ? 57 : 58)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if (var6_int == 3) {
                                statePc = 36;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof ClassNotFoundException ? 47 : (stateCaught_32 instanceof InvalidClassException ? 48 : (stateCaught_32 instanceof StreamCorruptedException ? 49 : (stateCaught_32 instanceof OptionalDataException ? 50 : (stateCaught_32 instanceof IllegalAccessException ? 51 : (stateCaught_32 instanceof IllegalArgumentException ? 52 : (stateCaught_32 instanceof java.lang.reflect.InvocationTargetException ? 53 : (stateCaught_32 instanceof SecurityException ? 54 : (stateCaught_32 instanceof IOException ? 55 : (stateCaught_32 instanceof NullPointerException ? 56 : (stateCaught_32 instanceof Exception ? 57 : 58)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            if (4 == var6_int) {
                                statePc = 35;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof ClassNotFoundException ? 47 : (stateCaught_33 instanceof InvalidClassException ? 48 : (stateCaught_33 instanceof StreamCorruptedException ? 49 : (stateCaught_33 instanceof OptionalDataException ? 50 : (stateCaught_33 instanceof IllegalAccessException ? 51 : (stateCaught_33 instanceof IllegalArgumentException ? 52 : (stateCaught_33 instanceof java.lang.reflect.InvocationTargetException ? 53 : (stateCaught_33 instanceof SecurityException ? 54 : (stateCaught_33 instanceof IOException ? 55 : (stateCaught_33 instanceof NullPointerException ? 56 : (stateCaught_33 instanceof Exception ? 57 : 58)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof ClassNotFoundException ? 47 : (stateCaught_34 instanceof InvalidClassException ? 48 : (stateCaught_34 instanceof StreamCorruptedException ? 49 : (stateCaught_34 instanceof OptionalDataException ? 50 : (stateCaught_34 instanceof IllegalAccessException ? 51 : (stateCaught_34 instanceof IllegalArgumentException ? 52 : (stateCaught_34 instanceof java.lang.reflect.InvocationTargetException ? 53 : (stateCaught_34 instanceof SecurityException ? 54 : (stateCaught_34 instanceof IOException ? 55 : (stateCaught_34 instanceof NullPointerException ? 56 : (stateCaught_34 instanceof Exception ? 57 : 58)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            var28 = (java.lang.reflect.Method) var16.field_j[var5].field_e;
                            var8 = var28.getModifiers();
                            param0.d(0, 0);
                            param0.e(var8, -1615464796);
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof ClassNotFoundException ? 47 : (stateCaught_35 instanceof InvalidClassException ? 48 : (stateCaught_35 instanceof StreamCorruptedException ? 49 : (stateCaught_35 instanceof OptionalDataException ? 50 : (stateCaught_35 instanceof IllegalAccessException ? 51 : (stateCaught_35 instanceof IllegalArgumentException ? 52 : (stateCaught_35 instanceof java.lang.reflect.InvocationTargetException ? 53 : (stateCaught_35 instanceof SecurityException ? 54 : (stateCaught_35 instanceof IOException ? 55 : (stateCaught_35 instanceof NullPointerException ? 56 : (stateCaught_35 instanceof Exception ? 57 : 58)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            var29 = (java.lang.reflect.Method) var16.field_j[var5].field_e;
                            var25 = var16.field_f[var5];
                            var9 = new Object[var25.length];
                            var10_int = 0;
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof ClassNotFoundException ? 47 : (stateCaught_36 instanceof InvalidClassException ? 48 : (stateCaught_36 instanceof StreamCorruptedException ? 49 : (stateCaught_36 instanceof OptionalDataException ? 50 : (stateCaught_36 instanceof IllegalAccessException ? 51 : (stateCaught_36 instanceof IllegalArgumentException ? 52 : (stateCaught_36 instanceof java.lang.reflect.InvocationTargetException ? 53 : (stateCaught_36 instanceof SecurityException ? 54 : (stateCaught_36 instanceof IOException ? 55 : (stateCaught_36 instanceof NullPointerException ? 56 : (stateCaught_36 instanceof Exception ? 57 : 58)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            if (var10_int >= var25.length) {
                                statePc = 39;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof ClassNotFoundException ? 47 : (stateCaught_37 instanceof InvalidClassException ? 48 : (stateCaught_37 instanceof StreamCorruptedException ? 49 : (stateCaught_37 instanceof OptionalDataException ? 50 : (stateCaught_37 instanceof IllegalAccessException ? 51 : (stateCaught_37 instanceof IllegalArgumentException ? 52 : (stateCaught_37 instanceof java.lang.reflect.InvocationTargetException ? 53 : (stateCaught_37 instanceof SecurityException ? 54 : (stateCaught_37 instanceof IOException ? 55 : (stateCaught_37 instanceof NullPointerException ? 56 : (stateCaught_37 instanceof Exception ? 57 : 58)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            var11 = new ObjectInputStream((InputStream) (Object) new ByteArrayInputStream(var25[var10_int]));
                            var9[var10_int] = var11.readObject();
                            var10_int++;
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof ClassNotFoundException ? 47 : (stateCaught_38 instanceof InvalidClassException ? 48 : (stateCaught_38 instanceof StreamCorruptedException ? 49 : (stateCaught_38 instanceof OptionalDataException ? 50 : (stateCaught_38 instanceof IllegalAccessException ? 51 : (stateCaught_38 instanceof IllegalArgumentException ? 52 : (stateCaught_38 instanceof java.lang.reflect.InvocationTargetException ? 53 : (stateCaught_38 instanceof SecurityException ? 54 : (stateCaught_38 instanceof IOException ? 55 : (stateCaught_38 instanceof NullPointerException ? 56 : (stateCaught_38 instanceof Exception ? 57 : 58)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            var10 = var29.invoke((Object) null, var9);
                            if (var10 == null) {
                                statePc = 45;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof ClassNotFoundException ? 47 : (stateCaught_39 instanceof InvalidClassException ? 48 : (stateCaught_39 instanceof StreamCorruptedException ? 49 : (stateCaught_39 instanceof OptionalDataException ? 50 : (stateCaught_39 instanceof IllegalAccessException ? 51 : (stateCaught_39 instanceof IllegalArgumentException ? 52 : (stateCaught_39 instanceof java.lang.reflect.InvocationTargetException ? 53 : (stateCaught_39 instanceof SecurityException ? 54 : (stateCaught_39 instanceof IOException ? 55 : (stateCaught_39 instanceof NullPointerException ? 56 : (stateCaught_39 instanceof Exception ? 57 : 58)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            if (!(var10 instanceof Number)) {
                                statePc = 42;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof ClassNotFoundException ? 47 : (stateCaught_40 instanceof InvalidClassException ? 48 : (stateCaught_40 instanceof StreamCorruptedException ? 49 : (stateCaught_40 instanceof OptionalDataException ? 50 : (stateCaught_40 instanceof IllegalAccessException ? 51 : (stateCaught_40 instanceof IllegalArgumentException ? 52 : (stateCaught_40 instanceof java.lang.reflect.InvocationTargetException ? 53 : (stateCaught_40 instanceof SecurityException ? 54 : (stateCaught_40 instanceof IOException ? 55 : (stateCaught_40 instanceof NullPointerException ? 56 : (stateCaught_40 instanceof Exception ? 57 : 58)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            param0.d(1, 0);
                            param0.b(1686281208, ((Number) var10).longValue());
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof ClassNotFoundException ? 47 : (stateCaught_41 instanceof InvalidClassException ? 48 : (stateCaught_41 instanceof StreamCorruptedException ? 49 : (stateCaught_41 instanceof OptionalDataException ? 50 : (stateCaught_41 instanceof IllegalAccessException ? 51 : (stateCaught_41 instanceof IllegalArgumentException ? 52 : (stateCaught_41 instanceof java.lang.reflect.InvocationTargetException ? 53 : (stateCaught_41 instanceof SecurityException ? 54 : (stateCaught_41 instanceof IOException ? 55 : (stateCaught_41 instanceof NullPointerException ? 56 : (stateCaught_41 instanceof Exception ? 57 : 58)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            if (var10 instanceof String) {
                                statePc = 44;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof ClassNotFoundException ? 47 : (stateCaught_42 instanceof InvalidClassException ? 48 : (stateCaught_42 instanceof StreamCorruptedException ? 49 : (stateCaught_42 instanceof OptionalDataException ? 50 : (stateCaught_42 instanceof IllegalAccessException ? 51 : (stateCaught_42 instanceof IllegalArgumentException ? 52 : (stateCaught_42 instanceof java.lang.reflect.InvocationTargetException ? 53 : (stateCaught_42 instanceof SecurityException ? 54 : (stateCaught_42 instanceof IOException ? 55 : (stateCaught_42 instanceof NullPointerException ? 56 : (stateCaught_42 instanceof Exception ? 57 : 58)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            param0.d(4, 0);
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof ClassNotFoundException ? 47 : (stateCaught_43 instanceof InvalidClassException ? 48 : (stateCaught_43 instanceof StreamCorruptedException ? 49 : (stateCaught_43 instanceof OptionalDataException ? 50 : (stateCaught_43 instanceof IllegalAccessException ? 51 : (stateCaught_43 instanceof IllegalArgumentException ? 52 : (stateCaught_43 instanceof java.lang.reflect.InvocationTargetException ? 53 : (stateCaught_43 instanceof SecurityException ? 54 : (stateCaught_43 instanceof IOException ? 55 : (stateCaught_43 instanceof NullPointerException ? 56 : (stateCaught_43 instanceof Exception ? 57 : 58)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            param0.d(2, 0);
                            param0.a((byte) -50, (String) var10);
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof ClassNotFoundException ? 47 : (stateCaught_44 instanceof InvalidClassException ? 48 : (stateCaught_44 instanceof StreamCorruptedException ? 49 : (stateCaught_44 instanceof OptionalDataException ? 50 : (stateCaught_44 instanceof IllegalAccessException ? 51 : (stateCaught_44 instanceof IllegalArgumentException ? 52 : (stateCaught_44 instanceof java.lang.reflect.InvocationTargetException ? 53 : (stateCaught_44 instanceof SecurityException ? 54 : (stateCaught_44 instanceof IOException ? 55 : (stateCaught_44 instanceof NullPointerException ? 56 : (stateCaught_44 instanceof Exception ? 57 : 58)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            param0.d(0, 0);
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof ClassNotFoundException ? 47 : (stateCaught_45 instanceof InvalidClassException ? 48 : (stateCaught_45 instanceof StreamCorruptedException ? 49 : (stateCaught_45 instanceof OptionalDataException ? 50 : (stateCaught_45 instanceof IllegalAccessException ? 51 : (stateCaught_45 instanceof IllegalArgumentException ? 52 : (stateCaught_45 instanceof java.lang.reflect.InvocationTargetException ? 53 : (stateCaught_45 instanceof SecurityException ? 54 : (stateCaught_45 instanceof IOException ? 55 : (stateCaught_45 instanceof NullPointerException ? 56 : (stateCaught_45 instanceof Exception ? 57 : 58)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        var6 = (ClassNotFoundException) (Object) caughtException;
                        param0.d(-10, 0);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 48: {
                        var6_ref = (InvalidClassException) (Object) caughtException;
                        param0.d(-11, 0);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 49: {
                        var6_ref2 = (StreamCorruptedException) (Object) caughtException;
                        param0.d(-12, 0);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 50: {
                        var6_ref3 = (OptionalDataException) (Object) caughtException;
                        param0.d(-13, 0);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 51: {
                        var6_ref4 = (IllegalAccessException) (Object) caughtException;
                        param0.d(-14, 0);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 52: {
                        var6_ref5 = (IllegalArgumentException) (Object) caughtException;
                        param0.d(-15, 0);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 53: {
                        var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) caughtException;
                        param0.d(-16, 0);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 54: {
                        var6_ref7 = (SecurityException) (Object) caughtException;
                        param0.d(-17, 0);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 55: {
                        var6_ref8 = (IOException) (Object) caughtException;
                        param0.d(-18, 0);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 56: {
                        var6_ref9 = (NullPointerException) (Object) caughtException;
                        param0.d(-19, 0);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 57: {
                        var6_ref10 = (Exception) (Object) caughtException;
                        param0.d(-20, 0);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 58: {
                        var6_ref11 = caughtException;
                        param0.d(-21, 0);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 59: {
                        var5++;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 60: {
                        if (param1 > 66) {
                            statePc = 62;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    }
                    case 61: {
                        field_g = null;
                        statePc = 62;
                        continue stateLoop;
                    }
                    case 62: {
                        int discarded$1 = param0.a(var4, 19);
                        var16.a(false);
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

    final void a(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        kv var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var13 = BachelorFridge.field_y;
          param2 -= 4;
          var4 = 128;
          param0 -= 120;
          if ((((sia) this).field_f ^ -1) >= -81) {
            break L0;
          } else {
            param0 = param0 + (-80 + ((sia) this).field_f);
            var4 = (100 - ((sia) this).field_f) * var4 / 20;
            break L0;
          }
        }
        L1: {
          if (40 <= ((sia) this).field_f) {
            break L1;
          } else {
            param0 = param0 - (-((sia) this).field_f + 40 >> 855516289);
            var4 = ((sia) this).field_f * var4 / 40;
            break L1;
          }
        }
        L2: {
          ((sia) this).field_k.field_f.a(-10 + param0, 2048, param2 - 10, 2048, var4, (byte) 119);
          if (param1) {
            break L2;
          } else {
            ((sia) this).field_k = null;
            break L2;
          }
        }
        var5 = 0;
        L3: while (true) {
          if (3 <= var5) {
            return;
          } else {
            var6 = 50 * vr.field_b - -(65536 * var5 / 3);
            var7 = via.a(var6, (byte) 106);
            var8 = ft.a(var6, (byte) -128);
            var9 = ((sia) this).field_l;
            var10 = var9.field_n >> 1498983105;
            var11 = var9.field_o >> -1392920671;
            var12 = 20;
            var8 = (var12 * var8 >> 630273520) + param0 + 60;
            var7 = param2 - -70 - -(var7 * var12 >> -1426565520);
            var9.c(var7 - (var10 >> 208139649), var8 - (var11 >> 1985393793), var10, var11, var4);
            var5++;
            continue L3;
          }
        }
    }

    static {
    }
}
