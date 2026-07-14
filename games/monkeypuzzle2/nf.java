/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class nf extends rh {
    static int field_M;
    private int field_J;
    static bg field_F;
    static int field_N;
    static String field_E;
    private int field_G;
    private int field_L;
    private int field_K;
    private int field_I;
    private int field_H;

    final static void a(int param0, hb param1) {
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
            i var13 = null;
            java.lang.reflect.Field var15 = null;
            Object var16 = null;
            java.lang.reflect.Field var16_ref = null;
            i var17 = null;
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
                        var12 = MonkeyPuzzle2.field_F ? 1 : 0;
                        var13 = (i) (Object) ua.field_v.a((byte) -117);
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
                        if (var17.field_e <= var4) {
                            statePc = 18;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        if (null == var13.field_k[var4]) {
                            statePc = 11;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        if ((var13.field_k[var4].field_g ^ -1) == -3) {
                            statePc = 8;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        var13.field_o[var4] = -5;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        if (0 != var13.field_k[var4].field_g) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        var3 = 1;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        if (var13.field_s[var4] != null) {
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
                        if ((var13.field_s[var4].field_g ^ -1) != -3) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        var13.field_o[var4] = -6;
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 15: {
                        if (var13.field_s[var4].field_g == 0) {
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
                        if (var3 == 0) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 19: {
                        return;
                    }
                    case 20: {
                        var4 = param1.field_h;
                        param1.a(-803539344, var17.field_l);
                        if (param0 <= -79) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    }
                    case 21: {
                        nf.a(116, (byte) 63, -58, 12);
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 22: {
                        var5 = 0;
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 23: {
                        if (var17.field_e <= var5) {
                            statePc = 61;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    }
                    case 24: {
                        if (0 != var17.field_o[var5]) {
                            statePc = 26;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    }
                    case 26: {
                        param1.b(var17.field_o[var5], -49152);
                        statePc = 60;
                        continue stateLoop;
                    }
                    case 27: {
                        try {
                            var6_int = var17.field_q[var5];
                            if (0 == var6_int) {
                                statePc = 32;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof ClassNotFoundException ? 48 : (stateCaught_27 instanceof InvalidClassException ? 49 : (stateCaught_27 instanceof StreamCorruptedException ? 50 : (stateCaught_27 instanceof OptionalDataException ? 51 : (stateCaught_27 instanceof IllegalAccessException ? 52 : (stateCaught_27 instanceof IllegalArgumentException ? 53 : (stateCaught_27 instanceof java.lang.reflect.InvocationTargetException ? 54 : (stateCaught_27 instanceof SecurityException ? 55 : (stateCaught_27 instanceof IOException ? 56 : (stateCaught_27 instanceof NullPointerException ? 57 : (stateCaught_27 instanceof Exception ? 58 : 59)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            if ((var6_int ^ -1) == -2) {
                                statePc = 31;
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
                            if ((var6_int ^ -1) != -3) {
                                statePc = 33;
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
                            var26 = (java.lang.reflect.Field) var17.field_k[var5].field_b;
                            var8 = var26.getModifiers();
                            param1.b(0, -49152);
                            param1.a(-803539344, var8);
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
                            var16_ref = (java.lang.reflect.Field) var17.field_k[var5].field_b;
                            var19 = var16_ref;
                            var19.setInt((Object) null, var17.field_g[var5]);
                            param1.b(0, -49152);
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
                            var15 = (java.lang.reflect.Field) var17.field_k[var5].field_b;
                            var8 = var15.getInt((Object) null);
                            param1.b(0, -49152);
                            param1.a(-803539344, var8);
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
                            if ((var6_int ^ -1) == -4) {
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
                            if (var6_int == 4) {
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
                            var27 = (java.lang.reflect.Method) var17.field_s[var5].field_b;
                            var8 = var27.getModifiers();
                            param1.b(0, -49152);
                            param1.a(-803539344, var8);
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
                            var28 = (java.lang.reflect.Method) var17.field_s[var5].field_b;
                            var25 = var17.field_f[var5];
                            var9 = new Object[var25.length];
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
                            if (var10_int >= var25.length) {
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
                            var11 = new ObjectInputStream((InputStream) (Object) new ByteArrayInputStream(var25[var10_int]));
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
                            var10 = var28.invoke((Object) null, var9);
                            if (var10 != null) {
                                statePc = 42;
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
                            param1.b(0, -49152);
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof ClassNotFoundException ? 48 : (stateCaught_41 instanceof InvalidClassException ? 49 : (stateCaught_41 instanceof StreamCorruptedException ? 50 : (stateCaught_41 instanceof OptionalDataException ? 51 : (stateCaught_41 instanceof IllegalAccessException ? 52 : (stateCaught_41 instanceof IllegalArgumentException ? 53 : (stateCaught_41 instanceof java.lang.reflect.InvocationTargetException ? 54 : (stateCaught_41 instanceof SecurityException ? 55 : (stateCaught_41 instanceof IOException ? 56 : (stateCaught_41 instanceof NullPointerException ? 57 : (stateCaught_41 instanceof Exception ? 58 : 59)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            if (var10 instanceof Number) {
                                statePc = 46;
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
                            if (!(var10 instanceof String)) {
                                statePc = 45;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof ClassNotFoundException ? 48 : (stateCaught_43 instanceof InvalidClassException ? 49 : (stateCaught_43 instanceof StreamCorruptedException ? 50 : (stateCaught_43 instanceof OptionalDataException ? 51 : (stateCaught_43 instanceof IllegalAccessException ? 52 : (stateCaught_43 instanceof IllegalArgumentException ? 53 : (stateCaught_43 instanceof java.lang.reflect.InvocationTargetException ? 54 : (stateCaught_43 instanceof SecurityException ? 55 : (stateCaught_43 instanceof IOException ? 56 : (stateCaught_43 instanceof NullPointerException ? 57 : (stateCaught_43 instanceof Exception ? 58 : 59)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            param1.b(2, -49152);
                            param1.a(-105, (String) var10);
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
                            param1.b(4, -49152);
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
                            param1.b(1, -49152);
                            param1.a(((Number) var10).longValue(), (byte) 84);
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
                        param1.b(-10, -49152);
                        statePc = 60;
                        continue stateLoop;
                    }
                    case 49: {
                        var6_ref = (InvalidClassException) (Object) caughtException;
                        param1.b(-11, -49152);
                        statePc = 60;
                        continue stateLoop;
                    }
                    case 50: {
                        var6_ref2 = (StreamCorruptedException) (Object) caughtException;
                        param1.b(-12, -49152);
                        statePc = 60;
                        continue stateLoop;
                    }
                    case 51: {
                        var6_ref3 = (OptionalDataException) (Object) caughtException;
                        param1.b(-13, -49152);
                        statePc = 60;
                        continue stateLoop;
                    }
                    case 52: {
                        var6_ref4 = (IllegalAccessException) (Object) caughtException;
                        param1.b(-14, -49152);
                        statePc = 60;
                        continue stateLoop;
                    }
                    case 53: {
                        var6_ref5 = (IllegalArgumentException) (Object) caughtException;
                        param1.b(-15, -49152);
                        statePc = 60;
                        continue stateLoop;
                    }
                    case 54: {
                        var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) caughtException;
                        param1.b(-16, -49152);
                        statePc = 60;
                        continue stateLoop;
                    }
                    case 55: {
                        var6_ref7 = (SecurityException) (Object) caughtException;
                        param1.b(-17, -49152);
                        statePc = 60;
                        continue stateLoop;
                    }
                    case 56: {
                        var6_ref8 = (IOException) (Object) caughtException;
                        param1.b(-18, -49152);
                        statePc = 60;
                        continue stateLoop;
                    }
                    case 57: {
                        var6_ref9 = (NullPointerException) (Object) caughtException;
                        param1.b(-19, -49152);
                        statePc = 60;
                        continue stateLoop;
                    }
                    case 58: {
                        var6_ref10 = (Exception) (Object) caughtException;
                        param1.b(-20, -49152);
                        statePc = 60;
                        continue stateLoop;
                    }
                    case 59: {
                        var6_ref11 = caughtException;
                        param1.b(-21, -49152);
                        statePc = 60;
                        continue stateLoop;
                    }
                    case 60: {
                        var5++;
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 61: {
                        int discarded$1 = param1.a((byte) -66, var4);
                        var17.c(-19822);
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

    void e(byte param0) {
        if (param0 != 10) {
            ((nf) this).a(false, -117, 77);
        }
    }

    nf(kj param0, int param1, int param2) {
        super(param0, param1, param2);
        ((nf) this).field_K = 0;
        ((nf) this).field_L = 0;
    }

    final void b(int param0, int param1, int param2, int param3) {
        if (!(param3 > 0)) {
            ((nf) this).a(param0, (byte) 124, param2);
            return;
        }
        ((nf) this).field_G = ((nf) this).field_l;
        ((nf) this).field_K = param3;
        ((nf) this).field_I = param0;
        ((nf) this).field_L = param1;
        ((nf) this).field_J = param2;
        ((nf) this).field_H = ((nf) this).field_p;
    }

    final static void n(int param0) {
        if (param0 >= -34) {
            return;
        }
        int var1 = pf.a((byte) 97, 3);
        cj.a((byte) 105, ke.field_h[28 + var1]);
    }

    final static int a(int param0, boolean param1) {
        int var2 = 0;
        if (param0 >= 0) {
            // if_icmpgt L23
        }
        param0 = param0 >>> 16;
        var2 += 16;
        if (param0 >= 256) {
            var2 += 8;
            param0 = param0 >>> 8;
        }
        if (!((param0 ^ -1) > -17)) {
            param0 = param0 >>> 4;
            var2 += 4;
        }
        if (!param1) {
            return 95;
        }
        if (param0 >= 4) {
            param0 = param0 >>> 2;
            var2 += 2;
        }
        if (param0 >= 1) {
            var2++;
            param0 = param0 >>> 1;
        }
        return param0 + var2;
    }

    final static short[] a(boolean param0, hb param1, int param2, short[] param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        var4 = param1.f(8, param2);
        if (0 != var4) {
          L0: {
            L1: {
              if (param3 == null) {
                break L1;
              } else {
                if (param3.length != var4) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            param3 = new short[var4];
            break L0;
          }
          L2: {
            if (!param0) {
              break L2;
            } else {
              nf.a(113, (byte) 53, 71, -3);
              break L2;
            }
          }
          L3: {
            var5 = param1.f(8, 4);
            var6 = (short)param1.f(8, 16);
            if ((var5 ^ -1) < -1) {
              var7 = 0;
              L4: while (true) {
                if (var4 <= var7) {
                  break L3;
                } else {
                  param3[var7] = (short)(var6 + param1.f(8, var5));
                  var7++;
                  continue L4;
                }
              }
            } else {
              var7 = 0;
              L5: while (true) {
                if (var4 <= var7) {
                  break L3;
                } else {
                  param3[var7] = (short)var6;
                  var7++;
                  continue L5;
                }
              }
            }
          }
          return param3;
        } else {
          return null;
        }
    }

    final static void a(int param0, byte param1, int param2, int param3) {
        ve.a(74, param2, param3, ah.field_g[param0]);
        if (param1 != 115) {
            field_M = 40;
        }
    }

    void p(int param0) {
        if (param0 != -21) {
            nf.a(-27, (byte) -88, -52, -108);
        }
        if ((((nf) this).field_K ^ -1) >= -1) {
            return;
        }
        ((nf) this).a(((nf) this).field_I, (byte) -109, ((nf) this).field_J);
        ((nf) this).field_K = 0;
        ((nf) this).e((byte) 10);
    }

    void a(boolean param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        var16 = MonkeyPuzzle2.field_F ? 1 : 0;
        ge.a(6 + param1, param2 - -35, ((nf) this).field_l + -12, -40 + ((nf) this).field_p, 2105376, 0);
        var4 = 35;
        var5 = 211;
        var6 = 194;
        if (!param0) {
          var7 = 0;
          var8 = param2;
          L0: while (true) {
            if (var4 <= var7) {
              var4 = 22;
              var5 = 194;
              var6 = 169;
              var7 = 0;
              var8 = param2 - -35;
              L1: while (true) {
                if (var4 <= var7) {
                  af.field_e.c(((nf) this).field_l + param1 + -90, 10 + param2);
                  qb.a(param2 - -35, pe.field_a, (byte) -108, 5 + param1, ((nf) this).field_l - 10);
                  qb.a(-22 + param2 + ((nf) this).field_p, ra.field_Z, (byte) -109, param1, ((nf) this).field_l);
                  var6 = 127;
                  var5 = 169;
                  var4 = -79 + ((nf) this).field_p;
                  var7 = 0;
                  var8 = 57 + param2;
                  L2: while (true) {
                    if (var7 >= var4) {
                      return;
                    } else {
                      var9 = var5 + (var6 + -var5) * var7 / var4;
                      var9 = var9 | (var9 << -1939856496 | var9 << 673181288);
                      ge.a(param1, var8, 6, var9);
                      ge.a(-6 + (((nf) this).field_l + param1), var8, 6, var9);
                      var7++;
                      var8++;
                      continue L2;
                    }
                  }
                } else {
                  var9 = var7 * (-var5 + var6) / var4 + var5;
                  var9 = var9 | (var9 << -1147390800 | var9 << 1837289992);
                  ge.a(param1, var8, 6, var9);
                  ge.a(param1 - -((nf) this).field_l + -6, var8, 6, var9);
                  var8++;
                  var7++;
                  continue L1;
                }
              }
            } else {
              if (var8 >= ge.field_f) {
                if (ge.field_k > var8) {
                  L3: {
                    var9 = var5 + var7 * (-var5 + var6) / var4;
                    var10 = 0;
                    var11 = ((nf) this).field_l;
                    if (-21 <= (var7 ^ -1)) {
                      L4: while (true) {
                        if ((var10 ^ -1) < -21) {
                          break L3;
                        } else {
                          var12 = (20 + -var7) * (-var7 + 20) + (-var10 + 20) * (-var10 + 20);
                          if ((var12 ^ -1) >= -463) {
                            if (var12 < 420) {
                              break L3;
                            } else {
                              var13 = (462 + -var12) * var9 / 42;
                              var13 = var13 | (var13 << 446319696 | var13 << -838844024);
                              ge.field_i[var10 + var8 * ge.field_h + param1] = var13;
                              var10++;
                              continue L4;
                            }
                          } else {
                            var10++;
                            continue L4;
                          }
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  L5: {
                    if ((var7 ^ -1) < -21) {
                      break L5;
                    } else {
                      var12 = var11;
                      var11 -= 21;
                      var13 = 0;
                      L6: while (true) {
                        L7: {
                          if (var13 > 20) {
                            break L7;
                          } else {
                            var14 = (-var7 + 20) * (20 - var7) + var13 * var13;
                            if (-463 > (var14 ^ -1)) {
                              break L7;
                            } else {
                              if (420 <= var14) {
                                var15 = var9 * (462 + -var14) / 42;
                                var15 = var15 | (var15 << 223973264 | var15 << -1223379096);
                                ge.field_i[var11 + ge.field_h * var8 + param1] = var15;
                                var11++;
                                var13++;
                                continue L6;
                              } else {
                                var12 = var11 - -1;
                                var11++;
                                var13++;
                                continue L6;
                              }
                            }
                          }
                        }
                        var11 = var12;
                        break L5;
                      }
                    }
                  }
                  var9 = var9 | (var9 << -1122122416 | var9 << -1360539448);
                  ge.a(param1 + var10, var8, var11 + -var10, var9);
                  var8++;
                  var7++;
                  continue L0;
                } else {
                  var8++;
                  var7++;
                  continue L0;
                }
              } else {
                var8++;
                var7++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    boolean b(boolean param0) {
        if (param0) {
            boolean discarded$0 = ((nf) this).k(-110);
        }
        ((nf) this).p(-21);
        return super.b(false);
    }

    public static void o(int param0) {
        if (param0 != -4110) {
            nf.n(73);
        }
        field_F = null;
        field_E = null;
    }

    boolean k(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (param0 != -23913) {
            int discarded$0 = nf.a(-124, true);
        }
        if ((((nf) this).field_K ^ -1) >= -1) {
        } else {
            var2 = ((nf) this).field_J;
            var3 = ((nf) this).field_I;
            ((nf) this).field_L = ((nf) this).field_L + 1;
            if (((nf) this).field_K <= ((nf) this).field_L + 1) {
                ((nf) this).field_K = 0;
                ((nf) this).e((byte) 10);
            } else {
                var4 = (((nf) this).field_K * 2 + -((nf) this).field_L) * ((nf) this).field_L;
                var5 = ((nf) this).field_K * ((nf) this).field_K;
                var3 = var4 * (-((nf) this).field_H + ((nf) this).field_I) / var5 + ((nf) this).field_H;
                var2 = ((nf) this).field_G + var4 * (-((nf) this).field_G + ((nf) this).field_J) / var5;
            }
            ((nf) this).a(var3, (byte) 115, var2);
        }
        return super.k(-23913);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = 0;
        field_E = "Back";
    }
}
