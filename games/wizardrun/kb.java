/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class kb extends gf {
    static o field_jb;

    final static void j(byte param0) {
        if (param0 != 63) {
            field_jb = null;
        }
        tj.a(param0 + 3025, jg.f(1));
    }

    kb(wi param0, ub param1) {
        super(param0, param1, 33, 20, 30);
    }

    final static void a(int param0, mg param1) {
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
            pk var13 = null;
            Object var16 = null;
            java.lang.reflect.Field var16_ref = null;
            pk var17 = null;
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
                        var12 = wizardrun.field_H;
                        var13 = (pk) (Object) kj.field_d.b((byte) 60);
                        var17 = var13;
                        if (var17 == null) {
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
                        if (var4 >= var17.field_r) {
                            statePc = 18;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        if (null == var13.field_l[var4]) {
                            statePc = 11;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        if (var13.field_l[var4].field_a != 2) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        var13.field_j[var4] = -5;
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        if (-1 == (var13.field_l[var4].field_a ^ -1)) {
                            statePc = 10;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        var3 = 1;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        if (var13.field_m[var4] != null) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        var4++;
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 13: {
                        if (var13.field_m[var4].field_a != -3) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        var13.field_j[var4] = -6;
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 15: {
                        if (-1 == var13.field_m[var4].field_a) {
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
                        var4 = param1.field_m;
                        param1.f(var17.field_i, 613003928);
                        var5 = 0;
                        if (param0 >= 17) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        kb.j((byte) -60);
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 23: {
                        if (var17.field_r <= var5) {
                            statePc = 60;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    }
                    case 24: {
                        if (-1 != (var17.field_j[var5] ^ -1)) {
                            statePc = 26;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    }
                    case 26: {
                        param1.b((byte) 11, var17.field_j[var5]);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 27: {
                        try {
                            var6_int = var17.field_t[var5];
                            if (0 != var6_int) {
                                statePc = 29;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof ClassNotFoundException ? 47 : (stateCaught_27 instanceof InvalidClassException ? 48 : (stateCaught_27 instanceof StreamCorruptedException ? 49 : (stateCaught_27 instanceof OptionalDataException ? 50 : (stateCaught_27 instanceof IllegalAccessException ? 51 : (stateCaught_27 instanceof IllegalArgumentException ? 52 : (stateCaught_27 instanceof java.lang.reflect.InvocationTargetException ? 53 : (stateCaught_27 instanceof SecurityException ? 54 : (stateCaught_27 instanceof IOException ? 55 : (stateCaught_27 instanceof NullPointerException ? 56 : (stateCaught_27 instanceof Exception ? 57 : 58)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            var27 = (java.lang.reflect.Field) var17.field_l[var5].field_e;
                            var8 = var27.getInt((Object) null);
                            param1.b((byte) 11, 0);
                            param1.f(var8, 613003928);
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof ClassNotFoundException ? 47 : (stateCaught_28 instanceof InvalidClassException ? 48 : (stateCaught_28 instanceof StreamCorruptedException ? 49 : (stateCaught_28 instanceof OptionalDataException ? 50 : (stateCaught_28 instanceof IllegalAccessException ? 51 : (stateCaught_28 instanceof IllegalArgumentException ? 52 : (stateCaught_28 instanceof java.lang.reflect.InvocationTargetException ? 53 : (stateCaught_28 instanceof SecurityException ? 54 : (stateCaught_28 instanceof IOException ? 55 : (stateCaught_28 instanceof NullPointerException ? 56 : (stateCaught_28 instanceof Exception ? 57 : 58)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            if (1 == var6_int) {
                                statePc = 32;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof ClassNotFoundException ? 47 : (stateCaught_29 instanceof InvalidClassException ? 48 : (stateCaught_29 instanceof StreamCorruptedException ? 49 : (stateCaught_29 instanceof OptionalDataException ? 50 : (stateCaught_29 instanceof IllegalAccessException ? 51 : (stateCaught_29 instanceof IllegalArgumentException ? 52 : (stateCaught_29 instanceof java.lang.reflect.InvocationTargetException ? 53 : (stateCaught_29 instanceof SecurityException ? 54 : (stateCaught_29 instanceof IOException ? 55 : (stateCaught_29 instanceof NullPointerException ? 56 : (stateCaught_29 instanceof Exception ? 57 : 58)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if (-3 != (var6_int ^ -1)) {
                                statePc = 33;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof ClassNotFoundException ? 47 : (stateCaught_30 instanceof InvalidClassException ? 48 : (stateCaught_30 instanceof StreamCorruptedException ? 49 : (stateCaught_30 instanceof OptionalDataException ? 50 : (stateCaught_30 instanceof IllegalAccessException ? 51 : (stateCaught_30 instanceof IllegalArgumentException ? 52 : (stateCaught_30 instanceof java.lang.reflect.InvocationTargetException ? 53 : (stateCaught_30 instanceof SecurityException ? 54 : (stateCaught_30 instanceof IOException ? 55 : (stateCaught_30 instanceof NullPointerException ? 56 : (stateCaught_30 instanceof Exception ? 57 : 58)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            var28 = (java.lang.reflect.Field) var17.field_l[var5].field_e;
                            var8 = var28.getModifiers();
                            param1.b((byte) 11, 0);
                            param1.f(var8, 613003928);
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof ClassNotFoundException ? 47 : (stateCaught_31 instanceof InvalidClassException ? 48 : (stateCaught_31 instanceof StreamCorruptedException ? 49 : (stateCaught_31 instanceof OptionalDataException ? 50 : (stateCaught_31 instanceof IllegalAccessException ? 51 : (stateCaught_31 instanceof IllegalArgumentException ? 52 : (stateCaught_31 instanceof java.lang.reflect.InvocationTargetException ? 53 : (stateCaught_31 instanceof SecurityException ? 54 : (stateCaught_31 instanceof IOException ? 55 : (stateCaught_31 instanceof NullPointerException ? 56 : (stateCaught_31 instanceof Exception ? 57 : 58)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            var16_ref = (java.lang.reflect.Field) var17.field_l[var5].field_e;
                            var20 = var16_ref;
                            var20.setInt((Object) null, var17.field_p[var5]);
                            param1.b((byte) 11, 0);
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof ClassNotFoundException ? 47 : (stateCaught_32 instanceof InvalidClassException ? 48 : (stateCaught_32 instanceof StreamCorruptedException ? 49 : (stateCaught_32 instanceof OptionalDataException ? 50 : (stateCaught_32 instanceof IllegalAccessException ? 51 : (stateCaught_32 instanceof IllegalArgumentException ? 52 : (stateCaught_32 instanceof java.lang.reflect.InvocationTargetException ? 53 : (stateCaught_32 instanceof SecurityException ? 54 : (stateCaught_32 instanceof IOException ? 55 : (stateCaught_32 instanceof NullPointerException ? 56 : (stateCaught_32 instanceof Exception ? 57 : 58)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            if (var6_int == 3) {
                                statePc = 36;
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
                            if (4 != var6_int) {
                                statePc = 59;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof ClassNotFoundException ? 47 : (stateCaught_34 instanceof InvalidClassException ? 48 : (stateCaught_34 instanceof StreamCorruptedException ? 49 : (stateCaught_34 instanceof OptionalDataException ? 50 : (stateCaught_34 instanceof IllegalAccessException ? 51 : (stateCaught_34 instanceof IllegalArgumentException ? 52 : (stateCaught_34 instanceof java.lang.reflect.InvocationTargetException ? 53 : (stateCaught_34 instanceof SecurityException ? 54 : (stateCaught_34 instanceof IOException ? 55 : (stateCaught_34 instanceof NullPointerException ? 56 : (stateCaught_34 instanceof Exception ? 57 : 58)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            var29 = (java.lang.reflect.Method) var17.field_m[var5].field_e;
                            var8 = var29.getModifiers();
                            param1.b((byte) 11, 0);
                            param1.f(var8, 613003928);
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
                            var30 = (java.lang.reflect.Method) var17.field_m[var5].field_e;
                            var26 = var17.field_k[var5];
                            var9 = new Object[var26.length];
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
                            if (var10_int >= var26.length) {
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
                            var11 = new ObjectInputStream((InputStream) (Object) new ByteArrayInputStream(var26[var10_int]));
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
                            var10 = var30.invoke((Object) null, var9);
                            if (var10 != null) {
                                statePc = 41;
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
                            param1.b((byte) 11, 0);
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof ClassNotFoundException ? 47 : (stateCaught_40 instanceof InvalidClassException ? 48 : (stateCaught_40 instanceof StreamCorruptedException ? 49 : (stateCaught_40 instanceof OptionalDataException ? 50 : (stateCaught_40 instanceof IllegalAccessException ? 51 : (stateCaught_40 instanceof IllegalArgumentException ? 52 : (stateCaught_40 instanceof java.lang.reflect.InvocationTargetException ? 53 : (stateCaught_40 instanceof SecurityException ? 54 : (stateCaught_40 instanceof IOException ? 55 : (stateCaught_40 instanceof NullPointerException ? 56 : (stateCaught_40 instanceof Exception ? 57 : 58)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            if (!(var10 instanceof Number)) {
                                statePc = 43;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof ClassNotFoundException ? 47 : (stateCaught_41 instanceof InvalidClassException ? 48 : (stateCaught_41 instanceof StreamCorruptedException ? 49 : (stateCaught_41 instanceof OptionalDataException ? 50 : (stateCaught_41 instanceof IllegalAccessException ? 51 : (stateCaught_41 instanceof IllegalArgumentException ? 52 : (stateCaught_41 instanceof java.lang.reflect.InvocationTargetException ? 53 : (stateCaught_41 instanceof SecurityException ? 54 : (stateCaught_41 instanceof IOException ? 55 : (stateCaught_41 instanceof NullPointerException ? 56 : (stateCaught_41 instanceof Exception ? 57 : 58)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            param1.b((byte) 11, 1);
                            param1.b(1290648728, ((Number) var10).longValue());
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof ClassNotFoundException ? 47 : (stateCaught_42 instanceof InvalidClassException ? 48 : (stateCaught_42 instanceof StreamCorruptedException ? 49 : (stateCaught_42 instanceof OptionalDataException ? 50 : (stateCaught_42 instanceof IllegalAccessException ? 51 : (stateCaught_42 instanceof IllegalArgumentException ? 52 : (stateCaught_42 instanceof java.lang.reflect.InvocationTargetException ? 53 : (stateCaught_42 instanceof SecurityException ? 54 : (stateCaught_42 instanceof IOException ? 55 : (stateCaught_42 instanceof NullPointerException ? 56 : (stateCaught_42 instanceof Exception ? 57 : 58)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            if (var10 instanceof String) {
                                statePc = 45;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof ClassNotFoundException ? 47 : (stateCaught_43 instanceof InvalidClassException ? 48 : (stateCaught_43 instanceof StreamCorruptedException ? 49 : (stateCaught_43 instanceof OptionalDataException ? 50 : (stateCaught_43 instanceof IllegalAccessException ? 51 : (stateCaught_43 instanceof IllegalArgumentException ? 52 : (stateCaught_43 instanceof java.lang.reflect.InvocationTargetException ? 53 : (stateCaught_43 instanceof SecurityException ? 54 : (stateCaught_43 instanceof IOException ? 55 : (stateCaught_43 instanceof NullPointerException ? 56 : (stateCaught_43 instanceof Exception ? 57 : 58)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            param1.b((byte) 11, 4);
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
                            param1.b((byte) 11, 2);
                            param1.a((String) var10, false);
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
                        param1.b((byte) 11, -10);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 48: {
                        var6_ref = (InvalidClassException) (Object) caughtException;
                        param1.b((byte) 11, -11);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 49: {
                        var6_ref2 = (StreamCorruptedException) (Object) caughtException;
                        param1.b((byte) 11, -12);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 50: {
                        var6_ref3 = (OptionalDataException) (Object) caughtException;
                        param1.b((byte) 11, -13);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 51: {
                        var6_ref4 = (IllegalAccessException) (Object) caughtException;
                        param1.b((byte) 11, -14);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 52: {
                        var6_ref5 = (IllegalArgumentException) (Object) caughtException;
                        param1.b((byte) 11, -15);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 53: {
                        var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) caughtException;
                        param1.b((byte) 11, -16);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 54: {
                        var6_ref7 = (SecurityException) (Object) caughtException;
                        param1.b((byte) 11, -17);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 55: {
                        var6_ref8 = (IOException) (Object) caughtException;
                        param1.b((byte) 11, -18);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 56: {
                        var6_ref9 = (NullPointerException) (Object) caughtException;
                        param1.b((byte) 11, -19);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 57: {
                        var6_ref10 = (Exception) (Object) caughtException;
                        param1.b((byte) 11, -20);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 58: {
                        var6_ref11 = caughtException;
                        param1.b((byte) 11, -21);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 59: {
                        var5++;
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 60: {
                        int discarded$1 = param1.e(var4, -1182887024);
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

    final void c(ub param0, int param1) {
        super.c(param0, -119);
        if (param1 > -109) {
            field_jb = null;
        }
    }

    public static void l(int param0) {
        if (param0 != 1) {
            field_jb = null;
        }
        field_jb = null;
    }

    static {
    }
}
