/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hb {
    static int[] field_b;
    static int field_d;
    static int[] field_a;
    static int field_f;
    static String field_h;
    static ka field_c;
    private String field_e;
    static String[] field_g;

    final boolean a(String param0, int param1) {
        if (param1 != 0) {
            field_d = 17;
        }
        return ((hb) this).field_e.equals((Object) (Object) param0);
    }

    final static StringBuilder a(int param0, byte param1, StringBuilder param2, char param3) {
        int var6 = TorChallenge.field_F ? 1 : 0;
        int var4 = param2.length();
        param2.setLength(param0);
        int var5 = var4;
        if (param1 != 30) {
            hb.a(false);
        }
        while (param0 > var5) {
            param2.setCharAt(var5, param3);
            var5++;
        }
        return param2;
    }

    final static void a(pa param0, int param1) {
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
            gh var14 = null;
            Object var16 = null;
            java.lang.reflect.Field var16_ref = null;
            gh var17 = null;
            java.lang.reflect.Field var18 = null;
            Object var19 = null;
            Object var20 = null;
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
                        var16 = null;
                        var19 = null;
                        var20 = null;
                        var21 = null;
                        var23 = null;
                        var13 = TorChallenge.field_F ? 1 : 0;
                        var14 = (gh) (Object) pf.field_d.c((byte) -79);
                        var17 = var14;
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
                        var4 = -59 % ((21 - param1) / 51);
                        var3 = 0;
                        var5 = 0;
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
                        if (var17.field_p <= var5) {
                            statePc = 19;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        if (null == var14.field_j[var5]) {
                            statePc = 12;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        if (2 == var14.field_j[var5].field_d) {
                            statePc = 8;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        var14.field_o[var5] = -5;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        if (0 == var14.field_j[var5].field_d) {
                            statePc = 11;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        var3 = 1;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 12: {
                        if (null != var14.field_q[var5]) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        var5++;
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 14: {
                        if ((var14.field_q[var5].field_d ^ -1) != -3) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        var14.field_o[var5] = -6;
                        statePc = 16;
                        continue stateLoop;
                    }
                    case 16: {
                        if (0 == var14.field_q[var5].field_d) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 17: {
                        var5++;
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 18: {
                        var3 = 1;
                        var5++;
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 19: {
                        if (var3 == 0) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 20: {
                        return;
                    }
                    case 21: {
                        var5 = param0.field_q;
                        param0.a(var17.field_l, false);
                        var6 = 0;
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 22: {
                        if (var6 >= var17.field_p) {
                            statePc = 58;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        if (var17.field_o[var6] == 0) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    }
                    case 24: {
                        param0.d(var17.field_o[var6], (byte) 122);
                        statePc = 57;
                        continue stateLoop;
                    }
                    case 25: {
                        try {
                            var7_int = var17.field_t[var6];
                            if (var7_int == 0) {
                                statePc = 30;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof ClassNotFoundException ? 45 : (stateCaught_25 instanceof InvalidClassException ? 46 : (stateCaught_25 instanceof StreamCorruptedException ? 47 : (stateCaught_25 instanceof OptionalDataException ? 48 : (stateCaught_25 instanceof IllegalAccessException ? 49 : (stateCaught_25 instanceof IllegalArgumentException ? 50 : (stateCaught_25 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_25 instanceof SecurityException ? 52 : (stateCaught_25 instanceof IOException ? 53 : (stateCaught_25 instanceof NullPointerException ? 54 : (stateCaught_25 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            if ((var7_int ^ -1) != -2) {
                                statePc = 28;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof ClassNotFoundException ? 45 : (stateCaught_26 instanceof InvalidClassException ? 46 : (stateCaught_26 instanceof StreamCorruptedException ? 47 : (stateCaught_26 instanceof OptionalDataException ? 48 : (stateCaught_26 instanceof IllegalAccessException ? 49 : (stateCaught_26 instanceof IllegalArgumentException ? 50 : (stateCaught_26 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_26 instanceof SecurityException ? 52 : (stateCaught_26 instanceof IOException ? 53 : (stateCaught_26 instanceof NullPointerException ? 54 : (stateCaught_26 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var16_ref = (java.lang.reflect.Field) var17.field_j[var6].field_g;
                            var18 = var16_ref;
                            var18.setInt((Object) null, var17.field_u[var6]);
                            param0.d(0, (byte) 122);
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof ClassNotFoundException ? 45 : (stateCaught_27 instanceof InvalidClassException ? 46 : (stateCaught_27 instanceof StreamCorruptedException ? 47 : (stateCaught_27 instanceof OptionalDataException ? 48 : (stateCaught_27 instanceof IllegalAccessException ? 49 : (stateCaught_27 instanceof IllegalArgumentException ? 50 : (stateCaught_27 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_27 instanceof SecurityException ? 52 : (stateCaught_27 instanceof IOException ? 53 : (stateCaught_27 instanceof NullPointerException ? 54 : (stateCaught_27 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            if ((var7_int ^ -1) != -3) {
                                statePc = 31;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof ClassNotFoundException ? 45 : (stateCaught_28 instanceof InvalidClassException ? 46 : (stateCaught_28 instanceof StreamCorruptedException ? 47 : (stateCaught_28 instanceof OptionalDataException ? 48 : (stateCaught_28 instanceof IllegalAccessException ? 49 : (stateCaught_28 instanceof IllegalArgumentException ? 50 : (stateCaught_28 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_28 instanceof SecurityException ? 52 : (stateCaught_28 instanceof IOException ? 53 : (stateCaught_28 instanceof NullPointerException ? 54 : (stateCaught_28 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            var27 = (java.lang.reflect.Field) var17.field_j[var6].field_g;
                            var9 = var27.getModifiers();
                            param0.d(0, (byte) 122);
                            param0.a(var9, false);
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof ClassNotFoundException ? 45 : (stateCaught_29 instanceof InvalidClassException ? 46 : (stateCaught_29 instanceof StreamCorruptedException ? 47 : (stateCaught_29 instanceof OptionalDataException ? 48 : (stateCaught_29 instanceof IllegalAccessException ? 49 : (stateCaught_29 instanceof IllegalArgumentException ? 50 : (stateCaught_29 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_29 instanceof SecurityException ? 52 : (stateCaught_29 instanceof IOException ? 53 : (stateCaught_29 instanceof NullPointerException ? 54 : (stateCaught_29 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            var28 = (java.lang.reflect.Field) var17.field_j[var6].field_g;
                            var9 = var28.getInt((Object) null);
                            param0.d(0, (byte) 122);
                            param0.a(var9, false);
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof ClassNotFoundException ? 45 : (stateCaught_30 instanceof InvalidClassException ? 46 : (stateCaught_30 instanceof StreamCorruptedException ? 47 : (stateCaught_30 instanceof OptionalDataException ? 48 : (stateCaught_30 instanceof IllegalAccessException ? 49 : (stateCaught_30 instanceof IllegalArgumentException ? 50 : (stateCaught_30 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_30 instanceof SecurityException ? 52 : (stateCaught_30 instanceof IOException ? 53 : (stateCaught_30 instanceof NullPointerException ? 54 : (stateCaught_30 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (-4 == (var7_int ^ -1)) {
                                statePc = 34;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof ClassNotFoundException ? 45 : (stateCaught_31 instanceof InvalidClassException ? 46 : (stateCaught_31 instanceof StreamCorruptedException ? 47 : (stateCaught_31 instanceof OptionalDataException ? 48 : (stateCaught_31 instanceof IllegalAccessException ? 49 : (stateCaught_31 instanceof IllegalArgumentException ? 50 : (stateCaught_31 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_31 instanceof SecurityException ? 52 : (stateCaught_31 instanceof IOException ? 53 : (stateCaught_31 instanceof NullPointerException ? 54 : (stateCaught_31 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if (var7_int != 4) {
                                statePc = 57;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof ClassNotFoundException ? 45 : (stateCaught_32 instanceof InvalidClassException ? 46 : (stateCaught_32 instanceof StreamCorruptedException ? 47 : (stateCaught_32 instanceof OptionalDataException ? 48 : (stateCaught_32 instanceof IllegalAccessException ? 49 : (stateCaught_32 instanceof IllegalArgumentException ? 50 : (stateCaught_32 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_32 instanceof SecurityException ? 52 : (stateCaught_32 instanceof IOException ? 53 : (stateCaught_32 instanceof NullPointerException ? 54 : (stateCaught_32 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            var29 = (java.lang.reflect.Method) var17.field_q[var6].field_g;
                            var9 = var29.getModifiers();
                            param0.d(0, (byte) 122);
                            param0.a(var9, false);
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof ClassNotFoundException ? 45 : (stateCaught_33 instanceof InvalidClassException ? 46 : (stateCaught_33 instanceof StreamCorruptedException ? 47 : (stateCaught_33 instanceof OptionalDataException ? 48 : (stateCaught_33 instanceof IllegalAccessException ? 49 : (stateCaught_33 instanceof IllegalArgumentException ? 50 : (stateCaught_33 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_33 instanceof SecurityException ? 52 : (stateCaught_33 instanceof IOException ? 53 : (stateCaught_33 instanceof NullPointerException ? 54 : (stateCaught_33 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            var30 = (java.lang.reflect.Method) var17.field_q[var6].field_g;
                            var26 = var17.field_s[var6];
                            var10 = new Object[var26.length];
                            var11_int = 0;
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof ClassNotFoundException ? 45 : (stateCaught_34 instanceof InvalidClassException ? 46 : (stateCaught_34 instanceof StreamCorruptedException ? 47 : (stateCaught_34 instanceof OptionalDataException ? 48 : (stateCaught_34 instanceof IllegalAccessException ? 49 : (stateCaught_34 instanceof IllegalArgumentException ? 50 : (stateCaught_34 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_34 instanceof SecurityException ? 52 : (stateCaught_34 instanceof IOException ? 53 : (stateCaught_34 instanceof NullPointerException ? 54 : (stateCaught_34 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            if (var26.length <= var11_int) {
                                statePc = 37;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof ClassNotFoundException ? 45 : (stateCaught_35 instanceof InvalidClassException ? 46 : (stateCaught_35 instanceof StreamCorruptedException ? 47 : (stateCaught_35 instanceof OptionalDataException ? 48 : (stateCaught_35 instanceof IllegalAccessException ? 49 : (stateCaught_35 instanceof IllegalArgumentException ? 50 : (stateCaught_35 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_35 instanceof SecurityException ? 52 : (stateCaught_35 instanceof IOException ? 53 : (stateCaught_35 instanceof NullPointerException ? 54 : (stateCaught_35 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            var12 = new ObjectInputStream((InputStream) (Object) new ByteArrayInputStream(var26[var11_int]));
                            var10[var11_int] = var12.readObject();
                            var11_int++;
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof ClassNotFoundException ? 45 : (stateCaught_36 instanceof InvalidClassException ? 46 : (stateCaught_36 instanceof StreamCorruptedException ? 47 : (stateCaught_36 instanceof OptionalDataException ? 48 : (stateCaught_36 instanceof IllegalAccessException ? 49 : (stateCaught_36 instanceof IllegalArgumentException ? 50 : (stateCaught_36 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_36 instanceof SecurityException ? 52 : (stateCaught_36 instanceof IOException ? 53 : (stateCaught_36 instanceof NullPointerException ? 54 : (stateCaught_36 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            var11 = var30.invoke((Object) null, var10);
                            if (var11 != null) {
                                statePc = 39;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof ClassNotFoundException ? 45 : (stateCaught_37 instanceof InvalidClassException ? 46 : (stateCaught_37 instanceof StreamCorruptedException ? 47 : (stateCaught_37 instanceof OptionalDataException ? 48 : (stateCaught_37 instanceof IllegalAccessException ? 49 : (stateCaught_37 instanceof IllegalArgumentException ? 50 : (stateCaught_37 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_37 instanceof SecurityException ? 52 : (stateCaught_37 instanceof IOException ? 53 : (stateCaught_37 instanceof NullPointerException ? 54 : (stateCaught_37 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            param0.d(0, (byte) 122);
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof ClassNotFoundException ? 45 : (stateCaught_38 instanceof InvalidClassException ? 46 : (stateCaught_38 instanceof StreamCorruptedException ? 47 : (stateCaught_38 instanceof OptionalDataException ? 48 : (stateCaught_38 instanceof IllegalAccessException ? 49 : (stateCaught_38 instanceof IllegalArgumentException ? 50 : (stateCaught_38 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_38 instanceof SecurityException ? 52 : (stateCaught_38 instanceof IOException ? 53 : (stateCaught_38 instanceof NullPointerException ? 54 : (stateCaught_38 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            if (!(var11 instanceof Number)) {
                                statePc = 41;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof ClassNotFoundException ? 45 : (stateCaught_39 instanceof InvalidClassException ? 46 : (stateCaught_39 instanceof StreamCorruptedException ? 47 : (stateCaught_39 instanceof OptionalDataException ? 48 : (stateCaught_39 instanceof IllegalAccessException ? 49 : (stateCaught_39 instanceof IllegalArgumentException ? 50 : (stateCaught_39 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_39 instanceof SecurityException ? 52 : (stateCaught_39 instanceof IOException ? 53 : (stateCaught_39 instanceof NullPointerException ? 54 : (stateCaught_39 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            param0.d(1, (byte) 122);
                            param0.a(true, ((Number) var11).longValue());
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof ClassNotFoundException ? 45 : (stateCaught_40 instanceof InvalidClassException ? 46 : (stateCaught_40 instanceof StreamCorruptedException ? 47 : (stateCaught_40 instanceof OptionalDataException ? 48 : (stateCaught_40 instanceof IllegalAccessException ? 49 : (stateCaught_40 instanceof IllegalArgumentException ? 50 : (stateCaught_40 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_40 instanceof SecurityException ? 52 : (stateCaught_40 instanceof IOException ? 53 : (stateCaught_40 instanceof NullPointerException ? 54 : (stateCaught_40 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            if (!(var11 instanceof String)) {
                                statePc = 43;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof ClassNotFoundException ? 45 : (stateCaught_41 instanceof InvalidClassException ? 46 : (stateCaught_41 instanceof StreamCorruptedException ? 47 : (stateCaught_41 instanceof OptionalDataException ? 48 : (stateCaught_41 instanceof IllegalAccessException ? 49 : (stateCaught_41 instanceof IllegalArgumentException ? 50 : (stateCaught_41 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_41 instanceof SecurityException ? 52 : (stateCaught_41 instanceof IOException ? 53 : (stateCaught_41 instanceof NullPointerException ? 54 : (stateCaught_41 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            param0.d(2, (byte) 122);
                            param0.a((String) var11, (byte) 123);
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof ClassNotFoundException ? 45 : (stateCaught_42 instanceof InvalidClassException ? 46 : (stateCaught_42 instanceof StreamCorruptedException ? 47 : (stateCaught_42 instanceof OptionalDataException ? 48 : (stateCaught_42 instanceof IllegalAccessException ? 49 : (stateCaught_42 instanceof IllegalArgumentException ? 50 : (stateCaught_42 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_42 instanceof SecurityException ? 52 : (stateCaught_42 instanceof IOException ? 53 : (stateCaught_42 instanceof NullPointerException ? 54 : (stateCaught_42 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            param0.d(4, (byte) 122);
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof ClassNotFoundException ? 45 : (stateCaught_43 instanceof InvalidClassException ? 46 : (stateCaught_43 instanceof StreamCorruptedException ? 47 : (stateCaught_43 instanceof OptionalDataException ? 48 : (stateCaught_43 instanceof IllegalAccessException ? 49 : (stateCaught_43 instanceof IllegalArgumentException ? 50 : (stateCaught_43 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_43 instanceof SecurityException ? 52 : (stateCaught_43 instanceof IOException ? 53 : (stateCaught_43 instanceof NullPointerException ? 54 : (stateCaught_43 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        var7 = (ClassNotFoundException) (Object) caughtException;
                        param0.d(-10, (byte) 122);
                        statePc = 57;
                        continue stateLoop;
                    }
                    case 46: {
                        var7_ref = (InvalidClassException) (Object) caughtException;
                        param0.d(-11, (byte) 122);
                        statePc = 57;
                        continue stateLoop;
                    }
                    case 47: {
                        var7_ref2 = (StreamCorruptedException) (Object) caughtException;
                        param0.d(-12, (byte) 122);
                        statePc = 57;
                        continue stateLoop;
                    }
                    case 48: {
                        var7_ref3 = (OptionalDataException) (Object) caughtException;
                        param0.d(-13, (byte) 122);
                        statePc = 57;
                        continue stateLoop;
                    }
                    case 49: {
                        var7_ref4 = (IllegalAccessException) (Object) caughtException;
                        param0.d(-14, (byte) 122);
                        statePc = 57;
                        continue stateLoop;
                    }
                    case 50: {
                        var7_ref5 = (IllegalArgumentException) (Object) caughtException;
                        param0.d(-15, (byte) 122);
                        statePc = 57;
                        continue stateLoop;
                    }
                    case 51: {
                        var7_ref6 = (java.lang.reflect.InvocationTargetException) (Object) caughtException;
                        param0.d(-16, (byte) 122);
                        statePc = 57;
                        continue stateLoop;
                    }
                    case 52: {
                        var7_ref7 = (SecurityException) (Object) caughtException;
                        param0.d(-17, (byte) 122);
                        statePc = 57;
                        continue stateLoop;
                    }
                    case 53: {
                        var7_ref8 = (IOException) (Object) caughtException;
                        param0.d(-18, (byte) 122);
                        statePc = 57;
                        continue stateLoop;
                    }
                    case 54: {
                        var7_ref9 = (NullPointerException) (Object) caughtException;
                        param0.d(-19, (byte) 122);
                        statePc = 57;
                        continue stateLoop;
                    }
                    case 55: {
                        var7_ref10 = (Exception) (Object) caughtException;
                        param0.d(-20, (byte) 122);
                        statePc = 57;
                        continue stateLoop;
                    }
                    case 56: {
                        var7_ref11 = caughtException;
                        param0.d(-21, (byte) 122);
                        statePc = 57;
                        continue stateLoop;
                    }
                    case 57: {
                        var6++;
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 58: {
                        int discarded$1 = param0.b(var5, 14430);
                        var17.a(true);
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

    final void a(java.applet.Applet param0, boolean param1) {
        oh.a(31536000L, ((hb) this).field_e, param0, "jagex-last-login-method", 0);
        if (param1) {
            field_f = 78;
        }
    }

    public static void a(boolean param0) {
        field_b = null;
        field_h = null;
        field_c = null;
        if (param0) {
            field_c = null;
        }
        field_g = null;
        field_a = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    hb(String param0) {
        ((hb) this).field_e = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[4];
        field_b = new int[]{256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256};
        field_h = "Checking";
        field_f = 0;
    }
}
