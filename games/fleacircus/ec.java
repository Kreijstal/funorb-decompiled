/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ec implements Runnable {
    volatile boolean field_h;
    ce field_f;
    volatile boolean field_g;
    static fh field_b;
    volatile la[] field_c;
    static String field_d;
    static String field_e;
    static String field_a;

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        field_a = null;
        field_e = null;
        if (param0 <= 116) {
            field_a = (String) null;
        }
    }

    final static void a(ih param0, boolean param1) {
        try {
            int stackIn_23_0 = 0;
            int stackIn_69_0 = 0;
            RuntimeException stackIn_72_0 = null;
            StringBuilder stackIn_72_1 = null;
            RuntimeException stackIn_73_0 = null;
            StringBuilder stackIn_73_1 = null;
            RuntimeException stackIn_74_0 = null;
            StringBuilder stackIn_74_1 = null;
            String stackIn_74_2 = null;
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
            fg var13 = null;
            java.lang.reflect.Field var14 = null;
            java.lang.reflect.Field var15 = null;
            fg var17 = null;
            Object var18 = null;
            Object var20 = null;
            Object var21 = null;
            byte[][] var24 = null;
            java.lang.reflect.Field var25 = null;
            java.lang.reflect.Method var26 = null;
            java.lang.reflect.Method var27 = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var18 = null;
                        var20 = null;
                        var21 = null;
                        var12 = fleas.field_A ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var13 = (fg) ((Object) jk.field_m.c((byte) 47));
                            var17 = var13;
                            if (var17 != null) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        return;
                    }
                    case 3: {
                        try {
                            var3 = param1 ? 1 : 0;
                            var4 = 0;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (var17.field_k <= var4) {
                                statePc = 17;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (var12 != 0) {
                                statePc = 19;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (null == var13.field_n[var4]) {
                                statePc = 11;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (2 != var13.field_n[var4].field_b) {
                                statePc = 9;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var13.field_r[var4] = -5;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            if (0 != var13.field_n[var4].field_b) {
                                statePc = 11;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            var3 = 1;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            if (var13.field_s[var4] == null) {
                                statePc = 16;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            if (2 != var13.field_s[var4].field_b) {
                                statePc = 14;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            var13.field_r[var4] = -6;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            if (-1 != (var13.field_s[var4].field_b ^ -1)) {
                                statePc = 16;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            var3 = 1;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            var4++;
                            if (var12 == 0) {
                                statePc = 4;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (var3 != 0) {
                                statePc = 19;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        return;
                    }
                    case 20: {
                        try {
                            var4 = param0.field_i;
                            param0.a(var17.field_v, (byte) -84);
                            var5 = 0;
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (var17.field_k <= var5) {
                                statePc = 68;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            stackIn_69_0 = var13.field_r[var5] ^ -1;
                            stackIn_23_0 = stackIn_69_0;
                            if (var12 != 0) {
                                statePc = 69;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (stackIn_23_0 != -1) {
                                statePc = 25;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            param0.a(-11, var13.field_r[var5]);
                            if (var12 == 0) {
                                statePc = 67;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            var6_int = var13.field_o[var5];
                            if (var6_int != 0) {
                                statePc = 28;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = ((Object) stateCaught_26 instanceof ClassNotFoundException ? 55 : ((Object) stateCaught_26 instanceof InvalidClassException ? 56 : ((Object) stateCaught_26 instanceof StreamCorruptedException ? 57 : ((Object) stateCaught_26 instanceof OptionalDataException ? 58 : ((Object) stateCaught_26 instanceof IllegalAccessException ? 59 : ((Object) stateCaught_26 instanceof IllegalArgumentException ? 60 : ((Object) stateCaught_26 instanceof java.lang.reflect.InvocationTargetException ? 61 : ((Object) stateCaught_26 instanceof SecurityException ? 62 : ((Object) stateCaught_26 instanceof IOException ? 63 : ((Object) stateCaught_26 instanceof NullPointerException ? 64 : ((Object) stateCaught_26 instanceof Exception ? 65 : 66)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var25 = (java.lang.reflect.Field) (var13.field_n[var5].field_e);
                            var8 = var25.getInt((Object) null);
                            param0.a(-11, 0);
                            param0.a(var8, (byte) -58);
                            if (var12 == 0) {
                                statePc = 33;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = ((Object) stateCaught_27 instanceof ClassNotFoundException ? 55 : ((Object) stateCaught_27 instanceof InvalidClassException ? 56 : ((Object) stateCaught_27 instanceof StreamCorruptedException ? 57 : ((Object) stateCaught_27 instanceof OptionalDataException ? 58 : ((Object) stateCaught_27 instanceof IllegalAccessException ? 59 : ((Object) stateCaught_27 instanceof IllegalArgumentException ? 60 : ((Object) stateCaught_27 instanceof java.lang.reflect.InvocationTargetException ? 61 : ((Object) stateCaught_27 instanceof SecurityException ? 62 : ((Object) stateCaught_27 instanceof IOException ? 63 : ((Object) stateCaught_27 instanceof NullPointerException ? 64 : ((Object) stateCaught_27 instanceof Exception ? 65 : 66)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            if (var6_int != 1) {
                                statePc = 30;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = ((Object) stateCaught_28 instanceof ClassNotFoundException ? 55 : ((Object) stateCaught_28 instanceof InvalidClassException ? 56 : ((Object) stateCaught_28 instanceof StreamCorruptedException ? 57 : ((Object) stateCaught_28 instanceof OptionalDataException ? 58 : ((Object) stateCaught_28 instanceof IllegalAccessException ? 59 : ((Object) stateCaught_28 instanceof IllegalArgumentException ? 60 : ((Object) stateCaught_28 instanceof java.lang.reflect.InvocationTargetException ? 61 : ((Object) stateCaught_28 instanceof SecurityException ? 62 : ((Object) stateCaught_28 instanceof IOException ? 63 : ((Object) stateCaught_28 instanceof NullPointerException ? 64 : ((Object) stateCaught_28 instanceof Exception ? 65 : 66)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            var14 = (java.lang.reflect.Field) (var13.field_n[var5].field_e);
                            var7 = var14;
                            var14.setInt((Object) null, var13.field_p[var5]);
                            param0.a(-11, 0);
                            if (var12 == 0) {
                                statePc = 33;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = ((Object) stateCaught_29 instanceof ClassNotFoundException ? 55 : ((Object) stateCaught_29 instanceof InvalidClassException ? 56 : ((Object) stateCaught_29 instanceof StreamCorruptedException ? 57 : ((Object) stateCaught_29 instanceof OptionalDataException ? 58 : ((Object) stateCaught_29 instanceof IllegalAccessException ? 59 : ((Object) stateCaught_29 instanceof IllegalArgumentException ? 60 : ((Object) stateCaught_29 instanceof java.lang.reflect.InvocationTargetException ? 61 : ((Object) stateCaught_29 instanceof SecurityException ? 62 : ((Object) stateCaught_29 instanceof IOException ? 63 : ((Object) stateCaught_29 instanceof NullPointerException ? 64 : ((Object) stateCaught_29 instanceof Exception ? 65 : 66)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if (2 == var6_int) {
                                statePc = 32;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = ((Object) stateCaught_30 instanceof ClassNotFoundException ? 55 : ((Object) stateCaught_30 instanceof InvalidClassException ? 56 : ((Object) stateCaught_30 instanceof StreamCorruptedException ? 57 : ((Object) stateCaught_30 instanceof OptionalDataException ? 58 : ((Object) stateCaught_30 instanceof IllegalAccessException ? 59 : ((Object) stateCaught_30 instanceof IllegalArgumentException ? 60 : ((Object) stateCaught_30 instanceof java.lang.reflect.InvocationTargetException ? 61 : ((Object) stateCaught_30 instanceof SecurityException ? 62 : ((Object) stateCaught_30 instanceof IOException ? 63 : ((Object) stateCaught_30 instanceof NullPointerException ? 64 : ((Object) stateCaught_30 instanceof Exception ? 65 : 66)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = ((Object) stateCaught_31 instanceof ClassNotFoundException ? 55 : ((Object) stateCaught_31 instanceof InvalidClassException ? 56 : ((Object) stateCaught_31 instanceof StreamCorruptedException ? 57 : ((Object) stateCaught_31 instanceof OptionalDataException ? 58 : ((Object) stateCaught_31 instanceof IllegalAccessException ? 59 : ((Object) stateCaught_31 instanceof IllegalArgumentException ? 60 : ((Object) stateCaught_31 instanceof java.lang.reflect.InvocationTargetException ? 61 : ((Object) stateCaught_31 instanceof SecurityException ? 62 : ((Object) stateCaught_31 instanceof IOException ? 63 : ((Object) stateCaught_31 instanceof NullPointerException ? 64 : ((Object) stateCaught_31 instanceof Exception ? 65 : 66)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            var15 = (java.lang.reflect.Field) (var13.field_n[var5].field_e);
                            var8 = var15.getModifiers();
                            param0.a(-11, 0);
                            param0.a(var8, (byte) -18);
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = ((Object) stateCaught_32 instanceof ClassNotFoundException ? 55 : ((Object) stateCaught_32 instanceof InvalidClassException ? 56 : ((Object) stateCaught_32 instanceof StreamCorruptedException ? 57 : ((Object) stateCaught_32 instanceof OptionalDataException ? 58 : ((Object) stateCaught_32 instanceof IllegalAccessException ? 59 : ((Object) stateCaught_32 instanceof IllegalArgumentException ? 60 : ((Object) stateCaught_32 instanceof java.lang.reflect.InvocationTargetException ? 61 : ((Object) stateCaught_32 instanceof SecurityException ? 62 : ((Object) stateCaught_32 instanceof IOException ? 63 : ((Object) stateCaught_32 instanceof NullPointerException ? 64 : ((Object) stateCaught_32 instanceof Exception ? 65 : 66)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            if (var6_int != 3) {
                                statePc = 51;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = ((Object) stateCaught_33 instanceof ClassNotFoundException ? 55 : ((Object) stateCaught_33 instanceof InvalidClassException ? 56 : ((Object) stateCaught_33 instanceof StreamCorruptedException ? 57 : ((Object) stateCaught_33 instanceof OptionalDataException ? 58 : ((Object) stateCaught_33 instanceof IllegalAccessException ? 59 : ((Object) stateCaught_33 instanceof IllegalArgumentException ? 60 : ((Object) stateCaught_33 instanceof java.lang.reflect.InvocationTargetException ? 61 : ((Object) stateCaught_33 instanceof SecurityException ? 62 : ((Object) stateCaught_33 instanceof IOException ? 63 : ((Object) stateCaught_33 instanceof NullPointerException ? 64 : ((Object) stateCaught_33 instanceof Exception ? 65 : 66)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            var26 = (java.lang.reflect.Method) (var13.field_s[var5].field_e);
                            var24 = var13.field_w[var5];
                            var9 = new Object[var24.length];
                            var10_int = 0;
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = ((Object) stateCaught_34 instanceof ClassNotFoundException ? 55 : ((Object) stateCaught_34 instanceof InvalidClassException ? 56 : ((Object) stateCaught_34 instanceof StreamCorruptedException ? 57 : ((Object) stateCaught_34 instanceof OptionalDataException ? 58 : ((Object) stateCaught_34 instanceof IllegalAccessException ? 59 : ((Object) stateCaught_34 instanceof IllegalArgumentException ? 60 : ((Object) stateCaught_34 instanceof java.lang.reflect.InvocationTargetException ? 61 : ((Object) stateCaught_34 instanceof SecurityException ? 62 : ((Object) stateCaught_34 instanceof IOException ? 63 : ((Object) stateCaught_34 instanceof NullPointerException ? 64 : ((Object) stateCaught_34 instanceof Exception ? 65 : 66)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            if (var24.length <= var10_int) {
                                statePc = 39;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = ((Object) stateCaught_35 instanceof ClassNotFoundException ? 55 : ((Object) stateCaught_35 instanceof InvalidClassException ? 56 : ((Object) stateCaught_35 instanceof StreamCorruptedException ? 57 : ((Object) stateCaught_35 instanceof OptionalDataException ? 58 : ((Object) stateCaught_35 instanceof IllegalAccessException ? 59 : ((Object) stateCaught_35 instanceof IllegalArgumentException ? 60 : ((Object) stateCaught_35 instanceof java.lang.reflect.InvocationTargetException ? 61 : ((Object) stateCaught_35 instanceof SecurityException ? 62 : ((Object) stateCaught_35 instanceof IOException ? 63 : ((Object) stateCaught_35 instanceof NullPointerException ? 64 : ((Object) stateCaught_35 instanceof Exception ? 65 : 66)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            var11 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var24[var10_int])));
                            var9[var10_int] = var11.readObject();
                            var10_int++;
                            if (var12 != 0) {
                                statePc = 67;
                            } else {
                                statePc = 37;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = ((Object) stateCaught_36 instanceof ClassNotFoundException ? 55 : ((Object) stateCaught_36 instanceof InvalidClassException ? 56 : ((Object) stateCaught_36 instanceof StreamCorruptedException ? 57 : ((Object) stateCaught_36 instanceof OptionalDataException ? 58 : ((Object) stateCaught_36 instanceof IllegalAccessException ? 59 : ((Object) stateCaught_36 instanceof IllegalArgumentException ? 60 : ((Object) stateCaught_36 instanceof java.lang.reflect.InvocationTargetException ? 61 : ((Object) stateCaught_36 instanceof SecurityException ? 62 : ((Object) stateCaught_36 instanceof IOException ? 63 : ((Object) stateCaught_36 instanceof NullPointerException ? 64 : ((Object) stateCaught_36 instanceof Exception ? 65 : 66)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            if (var12 == 0) {
                                statePc = 35;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = ((Object) stateCaught_37 instanceof ClassNotFoundException ? 55 : ((Object) stateCaught_37 instanceof InvalidClassException ? 56 : ((Object) stateCaught_37 instanceof StreamCorruptedException ? 57 : ((Object) stateCaught_37 instanceof OptionalDataException ? 58 : ((Object) stateCaught_37 instanceof IllegalAccessException ? 59 : ((Object) stateCaught_37 instanceof IllegalArgumentException ? 60 : ((Object) stateCaught_37 instanceof java.lang.reflect.InvocationTargetException ? 61 : ((Object) stateCaught_37 instanceof SecurityException ? 62 : ((Object) stateCaught_37 instanceof IOException ? 63 : ((Object) stateCaught_37 instanceof NullPointerException ? 64 : ((Object) stateCaught_37 instanceof Exception ? 65 : 66)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            statePc = 39;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = ((Object) stateCaught_38 instanceof ClassNotFoundException ? 55 : ((Object) stateCaught_38 instanceof InvalidClassException ? 56 : ((Object) stateCaught_38 instanceof StreamCorruptedException ? 57 : ((Object) stateCaught_38 instanceof OptionalDataException ? 58 : ((Object) stateCaught_38 instanceof IllegalAccessException ? 59 : ((Object) stateCaught_38 instanceof IllegalArgumentException ? 60 : ((Object) stateCaught_38 instanceof java.lang.reflect.InvocationTargetException ? 61 : ((Object) stateCaught_38 instanceof SecurityException ? 62 : ((Object) stateCaught_38 instanceof IOException ? 63 : ((Object) stateCaught_38 instanceof NullPointerException ? 64 : ((Object) stateCaught_38 instanceof Exception ? 65 : 66)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            var10 = var26.invoke((Object) null, var9);
                            if (var10 != null) {
                                statePc = 41;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = ((Object) stateCaught_39 instanceof ClassNotFoundException ? 55 : ((Object) stateCaught_39 instanceof InvalidClassException ? 56 : ((Object) stateCaught_39 instanceof StreamCorruptedException ? 57 : ((Object) stateCaught_39 instanceof OptionalDataException ? 58 : ((Object) stateCaught_39 instanceof IllegalAccessException ? 59 : ((Object) stateCaught_39 instanceof IllegalArgumentException ? 60 : ((Object) stateCaught_39 instanceof java.lang.reflect.InvocationTargetException ? 61 : ((Object) stateCaught_39 instanceof SecurityException ? 62 : ((Object) stateCaught_39 instanceof IOException ? 63 : ((Object) stateCaught_39 instanceof NullPointerException ? 64 : ((Object) stateCaught_39 instanceof Exception ? 65 : 66)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            param0.a(-11, 0);
                            statePc = 50;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = ((Object) stateCaught_40 instanceof ClassNotFoundException ? 55 : ((Object) stateCaught_40 instanceof InvalidClassException ? 56 : ((Object) stateCaught_40 instanceof StreamCorruptedException ? 57 : ((Object) stateCaught_40 instanceof OptionalDataException ? 58 : ((Object) stateCaught_40 instanceof IllegalAccessException ? 59 : ((Object) stateCaught_40 instanceof IllegalArgumentException ? 60 : ((Object) stateCaught_40 instanceof java.lang.reflect.InvocationTargetException ? 61 : ((Object) stateCaught_40 instanceof SecurityException ? 62 : ((Object) stateCaught_40 instanceof IOException ? 63 : ((Object) stateCaught_40 instanceof NullPointerException ? 64 : ((Object) stateCaught_40 instanceof Exception ? 65 : 66)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            if (!(var10 instanceof Number)) {
                                statePc = 44;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = ((Object) stateCaught_41 instanceof ClassNotFoundException ? 55 : ((Object) stateCaught_41 instanceof InvalidClassException ? 56 : ((Object) stateCaught_41 instanceof StreamCorruptedException ? 57 : ((Object) stateCaught_41 instanceof OptionalDataException ? 58 : ((Object) stateCaught_41 instanceof IllegalAccessException ? 59 : ((Object) stateCaught_41 instanceof IllegalArgumentException ? 60 : ((Object) stateCaught_41 instanceof java.lang.reflect.InvocationTargetException ? 61 : ((Object) stateCaught_41 instanceof SecurityException ? 62 : ((Object) stateCaught_41 instanceof IOException ? 63 : ((Object) stateCaught_41 instanceof NullPointerException ? 64 : ((Object) stateCaught_41 instanceof Exception ? 65 : 66)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            param0.a(-11, 1);
                            param0.a(-83, ((Number) (var10)).longValue());
                            if (var12 == 0) {
                                statePc = 50;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = ((Object) stateCaught_42 instanceof ClassNotFoundException ? 55 : ((Object) stateCaught_42 instanceof InvalidClassException ? 56 : ((Object) stateCaught_42 instanceof StreamCorruptedException ? 57 : ((Object) stateCaught_42 instanceof OptionalDataException ? 58 : ((Object) stateCaught_42 instanceof IllegalAccessException ? 59 : ((Object) stateCaught_42 instanceof IllegalArgumentException ? 60 : ((Object) stateCaught_42 instanceof java.lang.reflect.InvocationTargetException ? 61 : ((Object) stateCaught_42 instanceof SecurityException ? 62 : ((Object) stateCaught_42 instanceof IOException ? 63 : ((Object) stateCaught_42 instanceof NullPointerException ? 64 : ((Object) stateCaught_42 instanceof Exception ? 65 : 66)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            statePc = 44;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = ((Object) stateCaught_43 instanceof ClassNotFoundException ? 55 : ((Object) stateCaught_43 instanceof InvalidClassException ? 56 : ((Object) stateCaught_43 instanceof StreamCorruptedException ? 57 : ((Object) stateCaught_43 instanceof OptionalDataException ? 58 : ((Object) stateCaught_43 instanceof IllegalAccessException ? 59 : ((Object) stateCaught_43 instanceof IllegalArgumentException ? 60 : ((Object) stateCaught_43 instanceof java.lang.reflect.InvocationTargetException ? 61 : ((Object) stateCaught_43 instanceof SecurityException ? 62 : ((Object) stateCaught_43 instanceof IOException ? 63 : ((Object) stateCaught_43 instanceof NullPointerException ? 64 : ((Object) stateCaught_43 instanceof Exception ? 65 : 66)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            if (var10 instanceof String) {
                                statePc = 47;
                            } else {
                                statePc = 45;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = ((Object) stateCaught_44 instanceof ClassNotFoundException ? 55 : ((Object) stateCaught_44 instanceof InvalidClassException ? 56 : ((Object) stateCaught_44 instanceof StreamCorruptedException ? 57 : ((Object) stateCaught_44 instanceof OptionalDataException ? 58 : ((Object) stateCaught_44 instanceof IllegalAccessException ? 59 : ((Object) stateCaught_44 instanceof IllegalArgumentException ? 60 : ((Object) stateCaught_44 instanceof java.lang.reflect.InvocationTargetException ? 61 : ((Object) stateCaught_44 instanceof SecurityException ? 62 : ((Object) stateCaught_44 instanceof IOException ? 63 : ((Object) stateCaught_44 instanceof NullPointerException ? 64 : ((Object) stateCaught_44 instanceof Exception ? 65 : 66)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            param0.a(-11, 4);
                            if (var12 == 0) {
                                statePc = 50;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = ((Object) stateCaught_45 instanceof ClassNotFoundException ? 55 : ((Object) stateCaught_45 instanceof InvalidClassException ? 56 : ((Object) stateCaught_45 instanceof StreamCorruptedException ? 57 : ((Object) stateCaught_45 instanceof OptionalDataException ? 58 : ((Object) stateCaught_45 instanceof IllegalAccessException ? 59 : ((Object) stateCaught_45 instanceof IllegalArgumentException ? 60 : ((Object) stateCaught_45 instanceof java.lang.reflect.InvocationTargetException ? 61 : ((Object) stateCaught_45 instanceof SecurityException ? 62 : ((Object) stateCaught_45 instanceof IOException ? 63 : ((Object) stateCaught_45 instanceof NullPointerException ? 64 : ((Object) stateCaught_45 instanceof Exception ? 65 : 66)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            statePc = 47;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = ((Object) stateCaught_46 instanceof ClassNotFoundException ? 55 : ((Object) stateCaught_46 instanceof InvalidClassException ? 56 : ((Object) stateCaught_46 instanceof StreamCorruptedException ? 57 : ((Object) stateCaught_46 instanceof OptionalDataException ? 58 : ((Object) stateCaught_46 instanceof IllegalAccessException ? 59 : ((Object) stateCaught_46 instanceof IllegalArgumentException ? 60 : ((Object) stateCaught_46 instanceof java.lang.reflect.InvocationTargetException ? 61 : ((Object) stateCaught_46 instanceof SecurityException ? 62 : ((Object) stateCaught_46 instanceof IOException ? 63 : ((Object) stateCaught_46 instanceof NullPointerException ? 64 : ((Object) stateCaught_46 instanceof Exception ? 65 : 66)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            param0.a(-11, 2);
                            param0.a(127, (String) (var10));
                            if (var12 == 0) {
                                statePc = 50;
                            } else {
                                statePc = 48;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = ((Object) stateCaught_47 instanceof ClassNotFoundException ? 55 : ((Object) stateCaught_47 instanceof InvalidClassException ? 56 : ((Object) stateCaught_47 instanceof StreamCorruptedException ? 57 : ((Object) stateCaught_47 instanceof OptionalDataException ? 58 : ((Object) stateCaught_47 instanceof IllegalAccessException ? 59 : ((Object) stateCaught_47 instanceof IllegalArgumentException ? 60 : ((Object) stateCaught_47 instanceof java.lang.reflect.InvocationTargetException ? 61 : ((Object) stateCaught_47 instanceof SecurityException ? 62 : ((Object) stateCaught_47 instanceof IOException ? 63 : ((Object) stateCaught_47 instanceof NullPointerException ? 64 : ((Object) stateCaught_47 instanceof Exception ? 65 : 66)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            statePc = 49;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = ((Object) stateCaught_48 instanceof ClassNotFoundException ? 55 : ((Object) stateCaught_48 instanceof InvalidClassException ? 56 : ((Object) stateCaught_48 instanceof StreamCorruptedException ? 57 : ((Object) stateCaught_48 instanceof OptionalDataException ? 58 : ((Object) stateCaught_48 instanceof IllegalAccessException ? 59 : ((Object) stateCaught_48 instanceof IllegalArgumentException ? 60 : ((Object) stateCaught_48 instanceof java.lang.reflect.InvocationTargetException ? 61 : ((Object) stateCaught_48 instanceof SecurityException ? 62 : ((Object) stateCaught_48 instanceof IOException ? 63 : ((Object) stateCaught_48 instanceof NullPointerException ? 64 : ((Object) stateCaught_48 instanceof Exception ? 65 : 66)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            param0.a(-11, 0);
                            statePc = 50;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = ((Object) stateCaught_49 instanceof ClassNotFoundException ? 55 : ((Object) stateCaught_49 instanceof InvalidClassException ? 56 : ((Object) stateCaught_49 instanceof StreamCorruptedException ? 57 : ((Object) stateCaught_49 instanceof OptionalDataException ? 58 : ((Object) stateCaught_49 instanceof IllegalAccessException ? 59 : ((Object) stateCaught_49 instanceof IllegalArgumentException ? 60 : ((Object) stateCaught_49 instanceof java.lang.reflect.InvocationTargetException ? 61 : ((Object) stateCaught_49 instanceof SecurityException ? 62 : ((Object) stateCaught_49 instanceof IOException ? 63 : ((Object) stateCaught_49 instanceof NullPointerException ? 64 : ((Object) stateCaught_49 instanceof Exception ? 65 : 66)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            if (var12 == 0) {
                                statePc = 67;
                            } else {
                                statePc = 51;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = ((Object) stateCaught_50 instanceof ClassNotFoundException ? 55 : ((Object) stateCaught_50 instanceof InvalidClassException ? 56 : ((Object) stateCaught_50 instanceof StreamCorruptedException ? 57 : ((Object) stateCaught_50 instanceof OptionalDataException ? 58 : ((Object) stateCaught_50 instanceof IllegalAccessException ? 59 : ((Object) stateCaught_50 instanceof IllegalArgumentException ? 60 : ((Object) stateCaught_50 instanceof java.lang.reflect.InvocationTargetException ? 61 : ((Object) stateCaught_50 instanceof SecurityException ? 62 : ((Object) stateCaught_50 instanceof IOException ? 63 : ((Object) stateCaught_50 instanceof NullPointerException ? 64 : ((Object) stateCaught_50 instanceof Exception ? 65 : 66)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            if (4 == var6_int) {
                                statePc = 53;
                            } else {
                                statePc = 52;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = ((Object) stateCaught_51 instanceof ClassNotFoundException ? 55 : ((Object) stateCaught_51 instanceof InvalidClassException ? 56 : ((Object) stateCaught_51 instanceof StreamCorruptedException ? 57 : ((Object) stateCaught_51 instanceof OptionalDataException ? 58 : ((Object) stateCaught_51 instanceof IllegalAccessException ? 59 : ((Object) stateCaught_51 instanceof IllegalArgumentException ? 60 : ((Object) stateCaught_51 instanceof java.lang.reflect.InvocationTargetException ? 61 : ((Object) stateCaught_51 instanceof SecurityException ? 62 : ((Object) stateCaught_51 instanceof IOException ? 63 : ((Object) stateCaught_51 instanceof NullPointerException ? 64 : ((Object) stateCaught_51 instanceof Exception ? 65 : 66)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = ((Object) stateCaught_52 instanceof ClassNotFoundException ? 55 : ((Object) stateCaught_52 instanceof InvalidClassException ? 56 : ((Object) stateCaught_52 instanceof StreamCorruptedException ? 57 : ((Object) stateCaught_52 instanceof OptionalDataException ? 58 : ((Object) stateCaught_52 instanceof IllegalAccessException ? 59 : ((Object) stateCaught_52 instanceof IllegalArgumentException ? 60 : ((Object) stateCaught_52 instanceof java.lang.reflect.InvocationTargetException ? 61 : ((Object) stateCaught_52 instanceof SecurityException ? 62 : ((Object) stateCaught_52 instanceof IOException ? 63 : ((Object) stateCaught_52 instanceof NullPointerException ? 64 : ((Object) stateCaught_52 instanceof Exception ? 65 : 66)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            var27 = (java.lang.reflect.Method) (var13.field_s[var5].field_e);
                            var8 = var27.getModifiers();
                            param0.a(-11, 0);
                            param0.a(var8, (byte) -32);
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = ((Object) stateCaught_53 instanceof ClassNotFoundException ? 55 : ((Object) stateCaught_53 instanceof InvalidClassException ? 56 : ((Object) stateCaught_53 instanceof StreamCorruptedException ? 57 : ((Object) stateCaught_53 instanceof OptionalDataException ? 58 : ((Object) stateCaught_53 instanceof IllegalAccessException ? 59 : ((Object) stateCaught_53 instanceof IllegalArgumentException ? 60 : ((Object) stateCaught_53 instanceof java.lang.reflect.InvocationTargetException ? 61 : ((Object) stateCaught_53 instanceof SecurityException ? 62 : ((Object) stateCaught_53 instanceof IOException ? 63 : ((Object) stateCaught_53 instanceof NullPointerException ? 64 : ((Object) stateCaught_53 instanceof Exception ? 65 : 66)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            var6 = (ClassNotFoundException) ((Object) caughtException);
                            param0.a(-11, -10);
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            var6_ref = (InvalidClassException) ((Object) caughtException);
                            param0.a(-11, -11);
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            var6_ref2 = (StreamCorruptedException) ((Object) caughtException);
                            param0.a(-11, -12);
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            var6_ref3 = (OptionalDataException) ((Object) caughtException);
                            param0.a(-11, -13);
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            var6_ref4 = (IllegalAccessException) ((Object) caughtException);
                            param0.a(-11, -14);
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            var6_ref5 = (IllegalArgumentException) ((Object) caughtException);
                            param0.a(-11, -15);
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            var6_ref6 = (java.lang.reflect.InvocationTargetException) ((Object) caughtException);
                            param0.a(-11, -16);
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            var6_ref7 = (SecurityException) ((Object) caughtException);
                            param0.a(-11, -17);
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            var6_ref8 = (IOException) ((Object) caughtException);
                            param0.a(-11, -18);
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            var6_ref9 = (NullPointerException) ((Object) caughtException);
                            param0.a(-11, -19);
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            var6_ref10 = (Exception) ((Object) caughtException);
                            param0.a(-11, -20);
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            var6_ref11 = caughtException;
                            param0.a(-11, -21);
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            var5++;
                            if (var12 == 0) {
                                statePc = 21;
                            } else {
                                statePc = 68;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            stackIn_69_0 = param0.c(var4, -30532);
                            statePc = 69;
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            var17.c(-1);
                            statePc = 70;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        return;
                    }
                    case 71: {
                        var2 = (RuntimeException) ((Object) caughtException);
                        stackIn_73_0 = (RuntimeException) (var2);
                        stackIn_72_0 = stackIn_73_0;
                        stackIn_73_1 = new StringBuilder().append("ec.C(");
                        stackIn_72_1 = stackIn_73_1;
                        if (param0 == null) {
                            statePc = 73;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    }
                    case 72: {
                        stackIn_74_0 = (RuntimeException) ((Object) stackIn_72_0);
                        stackIn_74_1 = (StringBuilder) ((Object) stackIn_72_1);
                        stackIn_74_2 = "{...}";
                        statePc = 74;
                        continue stateLoop;
                    }
                    case 73: {
                        stackIn_74_0 = (RuntimeException) ((Object) stackIn_73_0);
                        stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
                        stackIn_74_2 = "null";
                        statePc = 74;
                        continue stateLoop;
                    }
                    case 74: {
                        throw pf.a((Throwable) ((Object) stackIn_74_0), stackIn_74_2 + ',' + param1 + ')');
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

    final static void a(hg param0, byte param1, int param2) {
        ih var3 = ud.field_b;
        var3.e(8, param2);
        if (param1 != 30) {
            return;
        }
        try {
            var3.a(-11, param0.field_m);
            var3.a(-11, param0.field_j);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "ec.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final void run() {
        Exception exception = null;
        int var1_int = 0;
        la var2 = null;
        int var4 = 0;
        String var5 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        Throwable var3 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = fleas.field_A ? 1 : 0;
                    this.field_h = true;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (this.field_g) {
                            statePc = 11;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = ((Object) stateCaught_1 instanceof Exception ? 12 : 14);
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var4 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = ((Object) stateCaught_2 instanceof Exception ? 12 : 14);
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var1_int = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = ((Object) stateCaught_3 instanceof Exception ? 12 : 14);
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var1_int >= 2) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = ((Object) stateCaught_4 instanceof Exception ? 12 : 14);
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var2 = this.field_c[var1_int];
                        if (var4 != 0) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = ((Object) stateCaught_5 instanceof Exception ? 12 : 14);
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var2 == null) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = ((Object) stateCaught_6 instanceof Exception ? 12 : 14);
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var2.a();
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = ((Object) stateCaught_7 instanceof Exception ? 12 : 14);
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var1_int++;
                        if (var4 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = ((Object) stateCaught_8 instanceof Exception ? 12 : 14);
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        vh.a(10L, -108);
                        aj.a((byte) -60, (Object) null, this.field_f);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = ((Object) stateCaught_9 instanceof Exception ? 12 : 14);
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var4 == 0) {
                            statePc = 1;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = ((Object) stateCaught_10 instanceof Exception ? 12 : 14);
                        continue stateLoop;
                    }
                }
                case 11: {
                    this.field_h = false;
                    statePc = 16;
                    continue stateLoop;
                }
                case 12: {
                    try {
                        exception = (Exception) ((Object) caughtException);
                        var5 = (String) null;
                        ud.a((String) null, (Throwable) ((Object) exception), 0);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    this.field_h = false;
                    statePc = 16;
                    continue stateLoop;
                }
                case 14: {
                    try {
                        var3 = caughtException;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 15: {
                    this.field_h = false;
                    throw ec.<RuntimeException>$cfr$sneakyThrow(var3);
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    ec() {
        this.field_c = new la[2];
        this.field_g = false;
        this.field_h = false;
    }

    static {
        field_b = new fh(1, 2, 2, 0);
        field_d = "Hints (1/2)";
        field_e = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_a = "Start new levels";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
