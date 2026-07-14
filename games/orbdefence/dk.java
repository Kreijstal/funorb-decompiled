/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class dk {
    static int field_a;
    static String field_b;
    static int[] field_c;

    final static int[] a(int param0, int param1, boolean param2) {
        if (param2) {
            field_c = null;
        }
        int var3 = lm.a(param0, (byte) -125);
        int var4 = mf.a(param0, -128);
        int var5 = lm.a(param1, (byte) -118);
        int var6 = mf.a(param1, -19);
        int var7 = (int)((long)var5 * (long)var3 >> -1429028528);
        int var8 = (int)((long)var6 * (long)var3 >> -484802672);
        int var9 = (int)((long)var5 * (long)var4 >> -1395148976);
        int var10 = (int)((long)var6 * (long)var4 >> 1056712464);
        return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
    }

    final static void a(byte param0) {
        il.a(4, 0);
        int var1 = 68 / ((-63 - param0) / 54);
    }

    final static void a(int param0) {
        bg.a(false);
        int var1 = -84 / ((15 - param0) / 63);
        vh.field_j = true;
        ca.field_b = true;
        bm.field_d.n(7920);
        vd.a(false, -536866817, hi.field_f);
    }

    public static void b(int param0) {
        field_b = null;
        field_c = null;
        if (param0 != 0) {
            field_a = -40;
        }
    }

    final static void a(byte param0, se param1) {
        try {
            int var3 = 0;
            int var4 = 0;
            int var5 = 0;
            int var6 = 0;
            ClassNotFoundException var7 = null;
            InvalidClassException var7_ref = null;
            StreamCorruptedException var7_ref2 = null;
            OptionalDataException var7_ref3 = null;
            IllegalAccessException var7_ref4 = null;
            IllegalArgumentException var7_ref5 = null;
            java.lang.reflect.InvocationTargetException var7_ref6 = null;
            SecurityException var7_ref7 = null;
            IOException var7_ref8 = null;
            NullPointerException var7_ref9 = null;
            Exception var7_ref10 = null;
            Throwable var7_ref11 = null;
            int var7_int = 0;
            int var9 = 0;
            Object[] var10 = null;
            int var11_int = 0;
            Object var11 = null;
            ObjectInputStream var12 = null;
            int var13 = 0;
            ud var14 = null;
            Object var16 = null;
            Object var17 = null;
            java.lang.reflect.Field var17_ref = null;
            ud var18 = null;
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
                        var19 = null;
                        var17 = null;
                        var16 = null;
                        var21 = null;
                        var23 = null;
                        var13 = OrbDefence.field_D ? 1 : 0;
                        var14 = (ud) (Object) ab.field_h.b((byte) 114);
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
                        var3 = 87 % ((param0 - 65) / 32);
                        var4 = 0;
                        var5 = 0;
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
                        if (var5 >= var18.field_o) {
                            statePc = 21;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        if (var14.field_h[var5] != null) {
                            statePc = 7;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        if ((var14.field_h[var5].field_a ^ -1) == -3) {
                            statePc = 9;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 9: {
                        var14.field_m[var5] = -5;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if (var14.field_h[var5].field_a == 0) {
                            statePc = 12;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        var4 = 1;
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 13: {
                        if (var14.field_i[var5] != null) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        var5++;
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 15: {
                        if ((var14.field_i[var5].field_a ^ -1) == -3) {
                            statePc = 17;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 17: {
                        var14.field_m[var5] = -6;
                        statePc = 18;
                        continue stateLoop;
                    }
                    case 18: {
                        if (0 == var14.field_i[var5].field_a) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 19: {
                        var5++;
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 20: {
                        var4 = 1;
                        var5++;
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 21: {
                        if (var4 != 0) {
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
                        var5 = param1.field_i;
                        param1.b(var18.field_k, -1);
                        var6 = 0;
                        statePc = 25;
                        continue stateLoop;
                    }
                    case 25: {
                        if (var6 >= var18.field_o) {
                            statePc = 63;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    }
                    case 26: {
                        if (var18.field_m[var6] != 0) {
                            statePc = 28;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    }
                    case 28: {
                        param1.a(var18.field_m[var6], -17);
                        statePc = 62;
                        continue stateLoop;
                    }
                    case 29: {
                        try {
                            var7_int = var18.field_l[var6];
                            if (-1 != (var7_int ^ -1)) {
                                statePc = 31;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof ClassNotFoundException ? 50 : (stateCaught_29 instanceof InvalidClassException ? 51 : (stateCaught_29 instanceof StreamCorruptedException ? 52 : (stateCaught_29 instanceof OptionalDataException ? 53 : (stateCaught_29 instanceof IllegalAccessException ? 54 : (stateCaught_29 instanceof IllegalArgumentException ? 55 : (stateCaught_29 instanceof java.lang.reflect.InvocationTargetException ? 56 : (stateCaught_29 instanceof SecurityException ? 57 : (stateCaught_29 instanceof IOException ? 58 : (stateCaught_29 instanceof NullPointerException ? 59 : (stateCaught_29 instanceof Exception ? 60 : 61)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            var27 = (java.lang.reflect.Field) var18.field_h[var6].field_g;
                            var9 = var27.getInt((Object) null);
                            param1.a(0, -127);
                            param1.b(var9, -1);
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof ClassNotFoundException ? 50 : (stateCaught_30 instanceof InvalidClassException ? 51 : (stateCaught_30 instanceof StreamCorruptedException ? 52 : (stateCaught_30 instanceof OptionalDataException ? 53 : (stateCaught_30 instanceof IllegalAccessException ? 54 : (stateCaught_30 instanceof IllegalArgumentException ? 55 : (stateCaught_30 instanceof java.lang.reflect.InvocationTargetException ? 56 : (stateCaught_30 instanceof SecurityException ? 57 : (stateCaught_30 instanceof IOException ? 58 : (stateCaught_30 instanceof NullPointerException ? 59 : (stateCaught_30 instanceof Exception ? 60 : 61)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (var7_int != 1) {
                                statePc = 33;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof ClassNotFoundException ? 50 : (stateCaught_31 instanceof InvalidClassException ? 51 : (stateCaught_31 instanceof StreamCorruptedException ? 52 : (stateCaught_31 instanceof OptionalDataException ? 53 : (stateCaught_31 instanceof IllegalAccessException ? 54 : (stateCaught_31 instanceof IllegalArgumentException ? 55 : (stateCaught_31 instanceof java.lang.reflect.InvocationTargetException ? 56 : (stateCaught_31 instanceof SecurityException ? 57 : (stateCaught_31 instanceof IOException ? 58 : (stateCaught_31 instanceof NullPointerException ? 59 : (stateCaught_31 instanceof Exception ? 60 : 61)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            var17_ref = (java.lang.reflect.Field) var18.field_h[var6].field_g;
                            var20 = var17_ref;
                            var20.setInt((Object) null, var18.field_n[var6]);
                            param1.a(0, -36);
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof ClassNotFoundException ? 50 : (stateCaught_32 instanceof InvalidClassException ? 51 : (stateCaught_32 instanceof StreamCorruptedException ? 52 : (stateCaught_32 instanceof OptionalDataException ? 53 : (stateCaught_32 instanceof IllegalAccessException ? 54 : (stateCaught_32 instanceof IllegalArgumentException ? 55 : (stateCaught_32 instanceof java.lang.reflect.InvocationTargetException ? 56 : (stateCaught_32 instanceof SecurityException ? 57 : (stateCaught_32 instanceof IOException ? 58 : (stateCaught_32 instanceof NullPointerException ? 59 : (stateCaught_32 instanceof Exception ? 60 : 61)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            if (2 != var7_int) {
                                statePc = 35;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof ClassNotFoundException ? 50 : (stateCaught_33 instanceof InvalidClassException ? 51 : (stateCaught_33 instanceof StreamCorruptedException ? 52 : (stateCaught_33 instanceof OptionalDataException ? 53 : (stateCaught_33 instanceof IllegalAccessException ? 54 : (stateCaught_33 instanceof IllegalArgumentException ? 55 : (stateCaught_33 instanceof java.lang.reflect.InvocationTargetException ? 56 : (stateCaught_33 instanceof SecurityException ? 57 : (stateCaught_33 instanceof IOException ? 58 : (stateCaught_33 instanceof NullPointerException ? 59 : (stateCaught_33 instanceof Exception ? 60 : 61)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            var28 = (java.lang.reflect.Field) var18.field_h[var6].field_g;
                            var9 = var28.getModifiers();
                            param1.a(0, -48);
                            param1.b(var9, -1);
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
                            if (var7_int == 3) {
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
                            if ((var7_int ^ -1) == -5) {
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
                            var29 = (java.lang.reflect.Method) var18.field_i[var6].field_g;
                            var9 = var29.getModifiers();
                            param1.a(0, -120);
                            param1.b(var9, -1);
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
                            var30 = (java.lang.reflect.Method) var18.field_i[var6].field_g;
                            var26 = var18.field_g[var6];
                            var10 = new Object[var26.length];
                            var11_int = 0;
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
                            if (var26.length <= var11_int) {
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
                            var12 = new ObjectInputStream((InputStream) (Object) new ByteArrayInputStream(var26[var11_int]));
                            var10[var11_int] = var12.readObject();
                            var11_int++;
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
                            var11 = var30.invoke((Object) null, var10);
                            if (var11 != null) {
                                statePc = 44;
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
                            param1.a(0, -76);
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof ClassNotFoundException ? 50 : (stateCaught_43 instanceof InvalidClassException ? 51 : (stateCaught_43 instanceof StreamCorruptedException ? 52 : (stateCaught_43 instanceof OptionalDataException ? 53 : (stateCaught_43 instanceof IllegalAccessException ? 54 : (stateCaught_43 instanceof IllegalArgumentException ? 55 : (stateCaught_43 instanceof java.lang.reflect.InvocationTargetException ? 56 : (stateCaught_43 instanceof SecurityException ? 57 : (stateCaught_43 instanceof IOException ? 58 : (stateCaught_43 instanceof NullPointerException ? 59 : (stateCaught_43 instanceof Exception ? 60 : 61)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            if (!(var11 instanceof Number)) {
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
                            param1.a(1, -62);
                            param1.a(((Number) var11).longValue(), -16943);
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
                            if (!(var11 instanceof String)) {
                                statePc = 48;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof ClassNotFoundException ? 50 : (stateCaught_46 instanceof InvalidClassException ? 51 : (stateCaught_46 instanceof StreamCorruptedException ? 52 : (stateCaught_46 instanceof OptionalDataException ? 53 : (stateCaught_46 instanceof IllegalAccessException ? 54 : (stateCaught_46 instanceof IllegalArgumentException ? 55 : (stateCaught_46 instanceof java.lang.reflect.InvocationTargetException ? 56 : (stateCaught_46 instanceof SecurityException ? 57 : (stateCaught_46 instanceof IOException ? 58 : (stateCaught_46 instanceof NullPointerException ? 59 : (stateCaught_46 instanceof Exception ? 60 : 61)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            param1.a(2, -26);
                            param1.a((String) var11, -6528);
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
                            param1.a(4, -48);
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof ClassNotFoundException ? 50 : (stateCaught_48 instanceof InvalidClassException ? 51 : (stateCaught_48 instanceof StreamCorruptedException ? 52 : (stateCaught_48 instanceof OptionalDataException ? 53 : (stateCaught_48 instanceof IllegalAccessException ? 54 : (stateCaught_48 instanceof IllegalArgumentException ? 55 : (stateCaught_48 instanceof java.lang.reflect.InvocationTargetException ? 56 : (stateCaught_48 instanceof SecurityException ? 57 : (stateCaught_48 instanceof IOException ? 58 : (stateCaught_48 instanceof NullPointerException ? 59 : (stateCaught_48 instanceof Exception ? 60 : 61)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        var7 = (ClassNotFoundException) (Object) caughtException;
                        param1.a(-10, -16);
                        statePc = 62;
                        continue stateLoop;
                    }
                    case 51: {
                        var7_ref = (InvalidClassException) (Object) caughtException;
                        param1.a(-11, -119);
                        statePc = 62;
                        continue stateLoop;
                    }
                    case 52: {
                        var7_ref2 = (StreamCorruptedException) (Object) caughtException;
                        param1.a(-12, -123);
                        statePc = 62;
                        continue stateLoop;
                    }
                    case 53: {
                        var7_ref3 = (OptionalDataException) (Object) caughtException;
                        param1.a(-13, -9);
                        statePc = 62;
                        continue stateLoop;
                    }
                    case 54: {
                        var7_ref4 = (IllegalAccessException) (Object) caughtException;
                        param1.a(-14, -99);
                        statePc = 62;
                        continue stateLoop;
                    }
                    case 55: {
                        var7_ref5 = (IllegalArgumentException) (Object) caughtException;
                        param1.a(-15, -86);
                        statePc = 62;
                        continue stateLoop;
                    }
                    case 56: {
                        var7_ref6 = (java.lang.reflect.InvocationTargetException) (Object) caughtException;
                        param1.a(-16, -73);
                        statePc = 62;
                        continue stateLoop;
                    }
                    case 57: {
                        var7_ref7 = (SecurityException) (Object) caughtException;
                        param1.a(-17, -58);
                        statePc = 62;
                        continue stateLoop;
                    }
                    case 58: {
                        var7_ref8 = (IOException) (Object) caughtException;
                        param1.a(-18, -96);
                        statePc = 62;
                        continue stateLoop;
                    }
                    case 59: {
                        var7_ref9 = (NullPointerException) (Object) caughtException;
                        param1.a(-19, -7);
                        statePc = 62;
                        continue stateLoop;
                    }
                    case 60: {
                        var7_ref10 = (Exception) (Object) caughtException;
                        param1.a(-20, -108);
                        statePc = 62;
                        continue stateLoop;
                    }
                    case 61: {
                        var7_ref11 = caughtException;
                        param1.a(-21, -71);
                        statePc = 62;
                        continue stateLoop;
                    }
                    case 62: {
                        var6++;
                        statePc = 25;
                        continue stateLoop;
                    }
                    case 63: {
                        int discarded$1 = param1.e(-18951, var5);
                        var18.b(57);
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

    final static boolean a(CharSequence param0, int param1) {
        if (param1 != 5408) {
            dk.a(-113);
        }
        return tj.a(false, param1 + -5408, param0);
    }

    final static boolean a(int param0, ki param1, ki param2, ki param3) {
        L0: {
          if (!param1.b(-1)) {
            break L0;
          } else {
            if (!param1.b((byte) 104, "commonui")) {
              break L0;
            } else {
              L1: {
                if (param0 == 1) {
                  break L1;
                } else {
                  field_a = -12;
                  break L1;
                }
              }
              L2: {
                if (!param3.b(-1)) {
                  break L2;
                } else {
                  if (!param3.b((byte) 92, "commonui")) {
                    break L2;
                  } else {
                    if (!param2.b(param0 + -2)) {
                      return false;
                    } else {
                      if (param2.b((byte) -110, "button.gif")) {
                        return true;
                      } else {
                        return false;
                      }
                    }
                  }
                }
              }
              return false;
            }
          }
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "End Game";
    }
}
