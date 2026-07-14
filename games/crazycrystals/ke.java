/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class ke {
    static String field_c;
    static String field_a;
    static int[] field_b;

    final static e a(String param0, int param1) {
        if (param1 != 28515) {
            Object var3 = null;
            ke.a((md) null, -96);
        }
        if (gk.field_e.b(param1 ^ -28494)) {
            if (!(param0.equals((Object) (Object) gk.field_e.a(125)))) {
                gk.field_e = lc.a(param0, (byte) 51);
            }
        }
        return gk.field_e;
    }

    abstract int a(long param0, int param1);

    final static void a(String param0, boolean param1, int param2) {
        ud.field_U = param1 ? true : false;
        dj.field_t = true;
        sp.field_a = new na(qe.field_g, mo.field_m, param0, ne.field_d, ud.field_U);
        if (param2 != -13) {
            field_a = null;
        }
        qe.field_g.b(-3264, (qm) (Object) sp.field_a);
    }

    abstract long a(boolean param0);

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        field_c = null;
        if (param0 < 123) {
            field_a = null;
        }
    }

    final int b(long param0, int param1) {
        long var4 = ((ke) this).a(true);
        if (param1 != -1) {
            return -69;
        }
        if (0L < var4) {
            fh.a(true, var4);
        }
        return ((ke) this).a(param0, param1 ^ 18);
    }

    final static void a(md param0, int param1) {
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
            pi var13 = null;
            Object var16 = null;
            java.lang.reflect.Field var16_ref = null;
            pi var17 = null;
            Object var18 = null;
            Object var19 = null;
            java.lang.reflect.Field var20 = null;
            Object var21 = null;
            Object var23 = null;
            byte[][] var26 = null;
            java.lang.reflect.Field var27 = null;
            java.lang.reflect.Field var28 = null;
            java.lang.reflect.Method var29 = null;
            java.lang.reflect.Method var30 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var18 = null;
                        var19 = null;
                        var16 = null;
                        var21 = null;
                        var23 = null;
                        var12 = CrazyCrystals.field_B;
                        var13 = (pi) (Object) hc.field_b.g(param1 + 41202);
                        var17 = var13;
                        if (var17 != null) {
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
                        if (param1 == -9129) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        field_c = null;
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
                        var3 = 0;
                        var4 = 0;
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 5: {
                        if (var17.field_i <= var4) {
                            statePc = 20;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        if (null == var13.field_k[var4]) {
                            statePc = 12;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        if (-3 == var13.field_k[var4].field_a) {
                            statePc = 9;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 9: {
                        var13.field_n[var4] = -5;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if (-1 != var13.field_k[var4].field_a) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        var3 = 1;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 12: {
                        if (var13.field_m[var4] != null) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        var4++;
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 14: {
                        if (-3 == (var13.field_m[var4].field_a ^ -1)) {
                            statePc = 16;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        var13.field_n[var4] = -6;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 17: {
                        if (var13.field_m[var4].field_a == 0) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 18: {
                        var4++;
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 19: {
                        var3 = 1;
                        var4++;
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 20: {
                        if (var3 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    }
                    case 21: {
                        return;
                    }
                    case 22: {
                        var4 = param0.field_f;
                        param0.a(var17.field_l, param1 ^ 7255);
                        var5 = 0;
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 23: {
                        if (var5 >= var17.field_i) {
                            statePc = 61;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    }
                    case 24: {
                        if (var17.field_n[var5] == 0) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    }
                    case 25: {
                        param0.a(true, var17.field_n[var5]);
                        statePc = 60;
                        continue stateLoop;
                    }
                    case 26: {
                        try {
                            var6_int = var17.field_f[var5];
                            if (0 != var6_int) {
                                statePc = 28;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof ClassNotFoundException ? 48 : (stateCaught_26 instanceof InvalidClassException ? 49 : (stateCaught_26 instanceof StreamCorruptedException ? 50 : (stateCaught_26 instanceof OptionalDataException ? 51 : (stateCaught_26 instanceof IllegalAccessException ? 52 : (stateCaught_26 instanceof IllegalArgumentException ? 53 : (stateCaught_26 instanceof java.lang.reflect.InvocationTargetException ? 54 : (stateCaught_26 instanceof SecurityException ? 55 : (stateCaught_26 instanceof IOException ? 56 : (stateCaught_26 instanceof NullPointerException ? 57 : (stateCaught_26 instanceof Exception ? 58 : 59)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var27 = (java.lang.reflect.Field) var17.field_k[var5].field_b;
                            var8 = var27.getInt((Object) null);
                            param0.a(true, 0);
                            param0.a(var8, -16384);
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof ClassNotFoundException ? 48 : (stateCaught_27 instanceof InvalidClassException ? 49 : (stateCaught_27 instanceof StreamCorruptedException ? 50 : (stateCaught_27 instanceof OptionalDataException ? 51 : (stateCaught_27 instanceof IllegalAccessException ? 52 : (stateCaught_27 instanceof IllegalArgumentException ? 53 : (stateCaught_27 instanceof java.lang.reflect.InvocationTargetException ? 54 : (stateCaught_27 instanceof SecurityException ? 55 : (stateCaught_27 instanceof IOException ? 56 : (stateCaught_27 instanceof NullPointerException ? 57 : (stateCaught_27 instanceof Exception ? 58 : 59)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            if (1 == var6_int) {
                                statePc = 32;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof ClassNotFoundException ? 48 : (stateCaught_28 instanceof InvalidClassException ? 49 : (stateCaught_28 instanceof StreamCorruptedException ? 50 : (stateCaught_28 instanceof OptionalDataException ? 51 : (stateCaught_28 instanceof IllegalAccessException ? 52 : (stateCaught_28 instanceof IllegalArgumentException ? 53 : (stateCaught_28 instanceof java.lang.reflect.InvocationTargetException ? 54 : (stateCaught_28 instanceof SecurityException ? 55 : (stateCaught_28 instanceof IOException ? 56 : (stateCaught_28 instanceof NullPointerException ? 57 : (stateCaught_28 instanceof Exception ? 58 : 59)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            if (-3 == (var6_int ^ -1)) {
                                statePc = 31;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof ClassNotFoundException ? 48 : (stateCaught_29 instanceof InvalidClassException ? 49 : (stateCaught_29 instanceof StreamCorruptedException ? 50 : (stateCaught_29 instanceof OptionalDataException ? 51 : (stateCaught_29 instanceof IllegalAccessException ? 52 : (stateCaught_29 instanceof IllegalArgumentException ? 53 : (stateCaught_29 instanceof java.lang.reflect.InvocationTargetException ? 54 : (stateCaught_29 instanceof SecurityException ? 55 : (stateCaught_29 instanceof IOException ? 56 : (stateCaught_29 instanceof NullPointerException ? 57 : (stateCaught_29 instanceof Exception ? 58 : 59)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof ClassNotFoundException ? 48 : (stateCaught_30 instanceof InvalidClassException ? 49 : (stateCaught_30 instanceof StreamCorruptedException ? 50 : (stateCaught_30 instanceof OptionalDataException ? 51 : (stateCaught_30 instanceof IllegalAccessException ? 52 : (stateCaught_30 instanceof IllegalArgumentException ? 53 : (stateCaught_30 instanceof java.lang.reflect.InvocationTargetException ? 54 : (stateCaught_30 instanceof SecurityException ? 55 : (stateCaught_30 instanceof IOException ? 56 : (stateCaught_30 instanceof NullPointerException ? 57 : (stateCaught_30 instanceof Exception ? 58 : 59)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            var28 = (java.lang.reflect.Field) var17.field_k[var5].field_b;
                            var8 = var28.getModifiers();
                            param0.a(true, 0);
                            param0.a(var8, -16384);
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof ClassNotFoundException ? 48 : (stateCaught_31 instanceof InvalidClassException ? 49 : (stateCaught_31 instanceof StreamCorruptedException ? 50 : (stateCaught_31 instanceof OptionalDataException ? 51 : (stateCaught_31 instanceof IllegalAccessException ? 52 : (stateCaught_31 instanceof IllegalArgumentException ? 53 : (stateCaught_31 instanceof java.lang.reflect.InvocationTargetException ? 54 : (stateCaught_31 instanceof SecurityException ? 55 : (stateCaught_31 instanceof IOException ? 56 : (stateCaught_31 instanceof NullPointerException ? 57 : (stateCaught_31 instanceof Exception ? 58 : 59)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            var16_ref = (java.lang.reflect.Field) var17.field_k[var5].field_b;
                            var20 = var16_ref;
                            var20.setInt((Object) null, var17.field_g[var5]);
                            param0.a(true, 0);
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof ClassNotFoundException ? 48 : (stateCaught_32 instanceof InvalidClassException ? 49 : (stateCaught_32 instanceof StreamCorruptedException ? 50 : (stateCaught_32 instanceof OptionalDataException ? 51 : (stateCaught_32 instanceof IllegalAccessException ? 52 : (stateCaught_32 instanceof IllegalArgumentException ? 53 : (stateCaught_32 instanceof java.lang.reflect.InvocationTargetException ? 54 : (stateCaught_32 instanceof SecurityException ? 55 : (stateCaught_32 instanceof IOException ? 56 : (stateCaught_32 instanceof NullPointerException ? 57 : (stateCaught_32 instanceof Exception ? 58 : 59)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            if (var6_int == -4) {
                                statePc = 37;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof ClassNotFoundException ? 48 : (stateCaught_33 instanceof InvalidClassException ? 49 : (stateCaught_33 instanceof StreamCorruptedException ? 50 : (stateCaught_33 instanceof OptionalDataException ? 51 : (stateCaught_33 instanceof IllegalAccessException ? 52 : (stateCaught_33 instanceof IllegalArgumentException ? 53 : (stateCaught_33 instanceof java.lang.reflect.InvocationTargetException ? 54 : (stateCaught_33 instanceof SecurityException ? 55 : (stateCaught_33 instanceof IOException ? 56 : (stateCaught_33 instanceof NullPointerException ? 57 : (stateCaught_33 instanceof Exception ? 58 : 59)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if (-5 == var6_int) {
                                statePc = 36;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof ClassNotFoundException ? 48 : (stateCaught_34 instanceof InvalidClassException ? 49 : (stateCaught_34 instanceof StreamCorruptedException ? 50 : (stateCaught_34 instanceof OptionalDataException ? 51 : (stateCaught_34 instanceof IllegalAccessException ? 52 : (stateCaught_34 instanceof IllegalArgumentException ? 53 : (stateCaught_34 instanceof java.lang.reflect.InvocationTargetException ? 54 : (stateCaught_34 instanceof SecurityException ? 55 : (stateCaught_34 instanceof IOException ? 56 : (stateCaught_34 instanceof NullPointerException ? 57 : (stateCaught_34 instanceof Exception ? 58 : 59)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof ClassNotFoundException ? 48 : (stateCaught_35 instanceof InvalidClassException ? 49 : (stateCaught_35 instanceof StreamCorruptedException ? 50 : (stateCaught_35 instanceof OptionalDataException ? 51 : (stateCaught_35 instanceof IllegalAccessException ? 52 : (stateCaught_35 instanceof IllegalArgumentException ? 53 : (stateCaught_35 instanceof java.lang.reflect.InvocationTargetException ? 54 : (stateCaught_35 instanceof SecurityException ? 55 : (stateCaught_35 instanceof IOException ? 56 : (stateCaught_35 instanceof NullPointerException ? 57 : (stateCaught_35 instanceof Exception ? 58 : 59)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            var29 = (java.lang.reflect.Method) var17.field_m[var5].field_b;
                            var8 = var29.getModifiers();
                            param0.a(true, 0);
                            param0.a(var8, -16384);
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof ClassNotFoundException ? 48 : (stateCaught_36 instanceof InvalidClassException ? 49 : (stateCaught_36 instanceof StreamCorruptedException ? 50 : (stateCaught_36 instanceof OptionalDataException ? 51 : (stateCaught_36 instanceof IllegalAccessException ? 52 : (stateCaught_36 instanceof IllegalArgumentException ? 53 : (stateCaught_36 instanceof java.lang.reflect.InvocationTargetException ? 54 : (stateCaught_36 instanceof SecurityException ? 55 : (stateCaught_36 instanceof IOException ? 56 : (stateCaught_36 instanceof NullPointerException ? 57 : (stateCaught_36 instanceof Exception ? 58 : 59)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            var30 = (java.lang.reflect.Method) var17.field_m[var5].field_b;
                            var26 = var17.field_h[var5];
                            var9 = new Object[var26.length];
                            var10_int = 0;
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof ClassNotFoundException ? 48 : (stateCaught_37 instanceof InvalidClassException ? 49 : (stateCaught_37 instanceof StreamCorruptedException ? 50 : (stateCaught_37 instanceof OptionalDataException ? 51 : (stateCaught_37 instanceof IllegalAccessException ? 52 : (stateCaught_37 instanceof IllegalArgumentException ? 53 : (stateCaught_37 instanceof java.lang.reflect.InvocationTargetException ? 54 : (stateCaught_37 instanceof SecurityException ? 55 : (stateCaught_37 instanceof IOException ? 56 : (stateCaught_37 instanceof NullPointerException ? 57 : (stateCaught_37 instanceof Exception ? 58 : 59)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            if (var26.length <= var10_int) {
                                statePc = 40;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof ClassNotFoundException ? 48 : (stateCaught_38 instanceof InvalidClassException ? 49 : (stateCaught_38 instanceof StreamCorruptedException ? 50 : (stateCaught_38 instanceof OptionalDataException ? 51 : (stateCaught_38 instanceof IllegalAccessException ? 52 : (stateCaught_38 instanceof IllegalArgumentException ? 53 : (stateCaught_38 instanceof java.lang.reflect.InvocationTargetException ? 54 : (stateCaught_38 instanceof SecurityException ? 55 : (stateCaught_38 instanceof IOException ? 56 : (stateCaught_38 instanceof NullPointerException ? 57 : (stateCaught_38 instanceof Exception ? 58 : 59)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            var11 = new ObjectInputStream((InputStream) (Object) new ByteArrayInputStream(var26[var10_int]));
                            var9[var10_int] = var11.readObject();
                            var10_int++;
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof ClassNotFoundException ? 48 : (stateCaught_39 instanceof InvalidClassException ? 49 : (stateCaught_39 instanceof StreamCorruptedException ? 50 : (stateCaught_39 instanceof OptionalDataException ? 51 : (stateCaught_39 instanceof IllegalAccessException ? 52 : (stateCaught_39 instanceof IllegalArgumentException ? 53 : (stateCaught_39 instanceof java.lang.reflect.InvocationTargetException ? 54 : (stateCaught_39 instanceof SecurityException ? 55 : (stateCaught_39 instanceof IOException ? 56 : (stateCaught_39 instanceof NullPointerException ? 57 : (stateCaught_39 instanceof Exception ? 58 : 59)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            var10 = var30.invoke((Object) null, var9);
                            if (var10 == null) {
                                statePc = 46;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof ClassNotFoundException ? 48 : (stateCaught_40 instanceof InvalidClassException ? 49 : (stateCaught_40 instanceof StreamCorruptedException ? 50 : (stateCaught_40 instanceof OptionalDataException ? 51 : (stateCaught_40 instanceof IllegalAccessException ? 52 : (stateCaught_40 instanceof IllegalArgumentException ? 53 : (stateCaught_40 instanceof java.lang.reflect.InvocationTargetException ? 54 : (stateCaught_40 instanceof SecurityException ? 55 : (stateCaught_40 instanceof IOException ? 56 : (stateCaught_40 instanceof NullPointerException ? 57 : (stateCaught_40 instanceof Exception ? 58 : 59)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            if (var10 instanceof Number) {
                                statePc = 45;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof ClassNotFoundException ? 48 : (stateCaught_41 instanceof InvalidClassException ? 49 : (stateCaught_41 instanceof StreamCorruptedException ? 50 : (stateCaught_41 instanceof OptionalDataException ? 51 : (stateCaught_41 instanceof IllegalAccessException ? 52 : (stateCaught_41 instanceof IllegalArgumentException ? 53 : (stateCaught_41 instanceof java.lang.reflect.InvocationTargetException ? 54 : (stateCaught_41 instanceof SecurityException ? 55 : (stateCaught_41 instanceof IOException ? 56 : (stateCaught_41 instanceof NullPointerException ? 57 : (stateCaught_41 instanceof Exception ? 58 : 59)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            if (!(var10 instanceof String)) {
                                statePc = 44;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof ClassNotFoundException ? 48 : (stateCaught_42 instanceof InvalidClassException ? 49 : (stateCaught_42 instanceof StreamCorruptedException ? 50 : (stateCaught_42 instanceof OptionalDataException ? 51 : (stateCaught_42 instanceof IllegalAccessException ? 52 : (stateCaught_42 instanceof IllegalArgumentException ? 53 : (stateCaught_42 instanceof java.lang.reflect.InvocationTargetException ? 54 : (stateCaught_42 instanceof SecurityException ? 55 : (stateCaught_42 instanceof IOException ? 56 : (stateCaught_42 instanceof NullPointerException ? 57 : (stateCaught_42 instanceof Exception ? 58 : 59)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            param0.a(true, 2);
                            param0.b((String) var10, (byte) -23);
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof ClassNotFoundException ? 48 : (stateCaught_43 instanceof InvalidClassException ? 49 : (stateCaught_43 instanceof StreamCorruptedException ? 50 : (stateCaught_43 instanceof OptionalDataException ? 51 : (stateCaught_43 instanceof IllegalAccessException ? 52 : (stateCaught_43 instanceof IllegalArgumentException ? 53 : (stateCaught_43 instanceof java.lang.reflect.InvocationTargetException ? 54 : (stateCaught_43 instanceof SecurityException ? 55 : (stateCaught_43 instanceof IOException ? 56 : (stateCaught_43 instanceof NullPointerException ? 57 : (stateCaught_43 instanceof Exception ? 58 : 59)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            param0.a(true, 4);
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof ClassNotFoundException ? 48 : (stateCaught_44 instanceof InvalidClassException ? 49 : (stateCaught_44 instanceof StreamCorruptedException ? 50 : (stateCaught_44 instanceof OptionalDataException ? 51 : (stateCaught_44 instanceof IllegalAccessException ? 52 : (stateCaught_44 instanceof IllegalArgumentException ? 53 : (stateCaught_44 instanceof java.lang.reflect.InvocationTargetException ? 54 : (stateCaught_44 instanceof SecurityException ? 55 : (stateCaught_44 instanceof IOException ? 56 : (stateCaught_44 instanceof NullPointerException ? 57 : (stateCaught_44 instanceof Exception ? 58 : 59)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            param0.a(true, 1);
                            param0.b(((Number) var10).longValue(), (byte) 13);
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof ClassNotFoundException ? 48 : (stateCaught_45 instanceof InvalidClassException ? 49 : (stateCaught_45 instanceof StreamCorruptedException ? 50 : (stateCaught_45 instanceof OptionalDataException ? 51 : (stateCaught_45 instanceof IllegalAccessException ? 52 : (stateCaught_45 instanceof IllegalArgumentException ? 53 : (stateCaught_45 instanceof java.lang.reflect.InvocationTargetException ? 54 : (stateCaught_45 instanceof SecurityException ? 55 : (stateCaught_45 instanceof IOException ? 56 : (stateCaught_45 instanceof NullPointerException ? 57 : (stateCaught_45 instanceof Exception ? 58 : 59)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            param0.a(true, 0);
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof ClassNotFoundException ? 48 : (stateCaught_46 instanceof InvalidClassException ? 49 : (stateCaught_46 instanceof StreamCorruptedException ? 50 : (stateCaught_46 instanceof OptionalDataException ? 51 : (stateCaught_46 instanceof IllegalAccessException ? 52 : (stateCaught_46 instanceof IllegalArgumentException ? 53 : (stateCaught_46 instanceof java.lang.reflect.InvocationTargetException ? 54 : (stateCaught_46 instanceof SecurityException ? 55 : (stateCaught_46 instanceof IOException ? 56 : (stateCaught_46 instanceof NullPointerException ? 57 : (stateCaught_46 instanceof Exception ? 58 : 59)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        var6 = (ClassNotFoundException) (Object) caughtException;
                        param0.a(true, -10);
                        statePc = 60;
                        continue stateLoop;
                    }
                    case 49: {
                        var6_ref = (InvalidClassException) (Object) caughtException;
                        param0.a(true, -11);
                        statePc = 60;
                        continue stateLoop;
                    }
                    case 50: {
                        var6_ref2 = (StreamCorruptedException) (Object) caughtException;
                        param0.a(true, -12);
                        statePc = 60;
                        continue stateLoop;
                    }
                    case 51: {
                        var6_ref3 = (OptionalDataException) (Object) caughtException;
                        param0.a(true, -13);
                        statePc = 60;
                        continue stateLoop;
                    }
                    case 52: {
                        var6_ref4 = (IllegalAccessException) (Object) caughtException;
                        param0.a(true, -14);
                        statePc = 60;
                        continue stateLoop;
                    }
                    case 53: {
                        var6_ref5 = (IllegalArgumentException) (Object) caughtException;
                        param0.a(true, -15);
                        statePc = 60;
                        continue stateLoop;
                    }
                    case 54: {
                        var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) caughtException;
                        param0.a(true, -16);
                        statePc = 60;
                        continue stateLoop;
                    }
                    case 55: {
                        var6_ref7 = (SecurityException) (Object) caughtException;
                        param0.a(true, -17);
                        statePc = 60;
                        continue stateLoop;
                    }
                    case 56: {
                        var6_ref8 = (IOException) (Object) caughtException;
                        param0.a(true, -18);
                        statePc = 60;
                        continue stateLoop;
                    }
                    case 57: {
                        var6_ref9 = (NullPointerException) (Object) caughtException;
                        param0.a(true, -19);
                        statePc = 60;
                        continue stateLoop;
                    }
                    case 58: {
                        var6_ref10 = (Exception) (Object) caughtException;
                        param0.a(true, -20);
                        statePc = 60;
                        continue stateLoop;
                    }
                    case 59: {
                        var6_ref11 = caughtException;
                        param0.a(true, -21);
                        statePc = 60;
                        continue stateLoop;
                    }
                    case 60: {
                        var5++;
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 61: {
                        int discarded$1 = param0.b(var4, (byte) -101);
                        var17.a(false);
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

    abstract void a(int param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Service unavailable";
        field_c = "Watch how the green player lets the rock start rolling, but intercepts it before it actually falls.";
        field_b = new int[5];
    }
}
