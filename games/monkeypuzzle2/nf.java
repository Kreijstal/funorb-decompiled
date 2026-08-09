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
            int stackIn_27_0 = 0;
            int stackIn_70_0 = 0;
            RuntimeException stackIn_73_0 = null;
            StringBuilder stackIn_73_1 = null;
            RuntimeException stackIn_74_0 = null;
            StringBuilder stackIn_74_1 = null;
            RuntimeException stackIn_75_0 = null;
            StringBuilder stackIn_75_1 = null;
            String stackIn_75_2 = null;
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
            i var13 = null;
            java.lang.reflect.Field var14 = null;
            java.lang.reflect.Field var15 = null;
            i var17 = null;
            Object var18 = null;
            Object var19 = null;
            Object var21 = null;
            byte[][] var24 = null;
            java.lang.reflect.Field var25 = null;
            java.lang.reflect.Method var26 = null;
            java.lang.reflect.Method var27 = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var18 = null;
                        var19 = null;
                        var21 = null;
                        var12 = MonkeyPuzzle2.field_F ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var13 = (i) ((Object) ua.field_v.a((byte) -117));
                            var17 = var13;
                            if (var17 == null) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        return;
                    }
                    case 4: {
                        try {
                            var3 = 0;
                            var4 = 0;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (var17.field_e <= var4) {
                                statePc = 19;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (var12 != 0) {
                                statePc = 22;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (null == var13.field_k[var4]) {
                                statePc = 13;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if ((var13.field_k[var4].field_g ^ -1) == -3) {
                                statePc = 10;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            var13.field_o[var4] = -5;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            if (0 != var13.field_k[var4].field_g) {
                                statePc = 13;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            var3 = 1;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            if (var13.field_s[var4] == null) {
                                statePc = 18;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            if ((var13.field_s[var4].field_g ^ -1) != -3) {
                                statePc = 16;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            var13.field_o[var4] = -6;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if ((var13.field_s[var4].field_g ^ -1) != -1) {
                                statePc = 18;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            var3 = 1;
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            var4++;
                            if (var12 == 0) {
                                statePc = 5;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (var3 == 0) {
                                statePc = 21;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        return;
                    }
                    case 21: {
                        try {
                            var4 = param1.field_h;
                            param1.a(-803539344, var17.field_l);
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            if (param0 <= -79) {
                                statePc = 24;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            nf.a(116, (byte) 63, -58, 12);
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            var5 = 0;
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            if (var17.field_e <= var5) {
                                statePc = 69;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            stackIn_70_0 = 0;
                            stackIn_27_0 = stackIn_70_0;
                            if (var12 != 0) {
                                statePc = 70;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            if (stackIn_27_0 != var13.field_o[var5]) {
                                statePc = 29;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            param1.b(var13.field_o[var5], -49152);
                            if (var12 == 0) {
                                statePc = 68;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            var6_int = var13.field_q[var5];
                            if (0 == var6_int) {
                                statePc = 35;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = ((Object) stateCaught_30 instanceof ClassNotFoundException ? 56 : ((Object) stateCaught_30 instanceof InvalidClassException ? 57 : ((Object) stateCaught_30 instanceof StreamCorruptedException ? 58 : ((Object) stateCaught_30 instanceof OptionalDataException ? 59 : ((Object) stateCaught_30 instanceof IllegalAccessException ? 60 : ((Object) stateCaught_30 instanceof IllegalArgumentException ? 61 : ((Object) stateCaught_30 instanceof java.lang.reflect.InvocationTargetException ? 62 : ((Object) stateCaught_30 instanceof SecurityException ? 63 : ((Object) stateCaught_30 instanceof IOException ? 64 : ((Object) stateCaught_30 instanceof NullPointerException ? 65 : ((Object) stateCaught_30 instanceof Exception ? 66 : 67)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if ((var6_int ^ -1) == -2) {
                                statePc = 34;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = ((Object) stateCaught_31 instanceof ClassNotFoundException ? 56 : ((Object) stateCaught_31 instanceof InvalidClassException ? 57 : ((Object) stateCaught_31 instanceof StreamCorruptedException ? 58 : ((Object) stateCaught_31 instanceof OptionalDataException ? 59 : ((Object) stateCaught_31 instanceof IllegalAccessException ? 60 : ((Object) stateCaught_31 instanceof IllegalArgumentException ? 61 : ((Object) stateCaught_31 instanceof java.lang.reflect.InvocationTargetException ? 62 : ((Object) stateCaught_31 instanceof SecurityException ? 63 : ((Object) stateCaught_31 instanceof IOException ? 64 : ((Object) stateCaught_31 instanceof NullPointerException ? 65 : ((Object) stateCaught_31 instanceof Exception ? 66 : 67)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if ((var6_int ^ -1) != -3) {
                                statePc = 36;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = ((Object) stateCaught_32 instanceof ClassNotFoundException ? 56 : ((Object) stateCaught_32 instanceof InvalidClassException ? 57 : ((Object) stateCaught_32 instanceof StreamCorruptedException ? 58 : ((Object) stateCaught_32 instanceof OptionalDataException ? 59 : ((Object) stateCaught_32 instanceof IllegalAccessException ? 60 : ((Object) stateCaught_32 instanceof IllegalArgumentException ? 61 : ((Object) stateCaught_32 instanceof java.lang.reflect.InvocationTargetException ? 62 : ((Object) stateCaught_32 instanceof SecurityException ? 63 : ((Object) stateCaught_32 instanceof IOException ? 64 : ((Object) stateCaught_32 instanceof NullPointerException ? 65 : ((Object) stateCaught_32 instanceof Exception ? 66 : 67)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            var25 = (java.lang.reflect.Field) (var13.field_k[var5].field_b);
                            var8 = var25.getModifiers();
                            param1.b(0, -49152);
                            param1.a(-803539344, var8);
                            if (var12 == 0) {
                                statePc = 36;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = ((Object) stateCaught_33 instanceof ClassNotFoundException ? 56 : ((Object) stateCaught_33 instanceof InvalidClassException ? 57 : ((Object) stateCaught_33 instanceof StreamCorruptedException ? 58 : ((Object) stateCaught_33 instanceof OptionalDataException ? 59 : ((Object) stateCaught_33 instanceof IllegalAccessException ? 60 : ((Object) stateCaught_33 instanceof IllegalArgumentException ? 61 : ((Object) stateCaught_33 instanceof java.lang.reflect.InvocationTargetException ? 62 : ((Object) stateCaught_33 instanceof SecurityException ? 63 : ((Object) stateCaught_33 instanceof IOException ? 64 : ((Object) stateCaught_33 instanceof NullPointerException ? 65 : ((Object) stateCaught_33 instanceof Exception ? 66 : 67)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            var14 = (java.lang.reflect.Field) (var13.field_k[var5].field_b);
                            var7 = var14;
                            var14.setInt((Object) null, var13.field_g[var5]);
                            param1.b(0, -49152);
                            if (var12 == 0) {
                                statePc = 36;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = ((Object) stateCaught_34 instanceof ClassNotFoundException ? 56 : ((Object) stateCaught_34 instanceof InvalidClassException ? 57 : ((Object) stateCaught_34 instanceof StreamCorruptedException ? 58 : ((Object) stateCaught_34 instanceof OptionalDataException ? 59 : ((Object) stateCaught_34 instanceof IllegalAccessException ? 60 : ((Object) stateCaught_34 instanceof IllegalArgumentException ? 61 : ((Object) stateCaught_34 instanceof java.lang.reflect.InvocationTargetException ? 62 : ((Object) stateCaught_34 instanceof SecurityException ? 63 : ((Object) stateCaught_34 instanceof IOException ? 64 : ((Object) stateCaught_34 instanceof NullPointerException ? 65 : ((Object) stateCaught_34 instanceof Exception ? 66 : 67)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            var15 = (java.lang.reflect.Field) (var13.field_k[var5].field_b);
                            var8 = var15.getInt((Object) null);
                            param1.b(0, -49152);
                            param1.a(-803539344, var8);
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = ((Object) stateCaught_35 instanceof ClassNotFoundException ? 56 : ((Object) stateCaught_35 instanceof InvalidClassException ? 57 : ((Object) stateCaught_35 instanceof StreamCorruptedException ? 58 : ((Object) stateCaught_35 instanceof OptionalDataException ? 59 : ((Object) stateCaught_35 instanceof IllegalAccessException ? 60 : ((Object) stateCaught_35 instanceof IllegalArgumentException ? 61 : ((Object) stateCaught_35 instanceof java.lang.reflect.InvocationTargetException ? 62 : ((Object) stateCaught_35 instanceof SecurityException ? 63 : ((Object) stateCaught_35 instanceof IOException ? 64 : ((Object) stateCaught_35 instanceof NullPointerException ? 65 : ((Object) stateCaught_35 instanceof Exception ? 66 : 67)))))))))));
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
                            statePc = ((Object) stateCaught_36 instanceof ClassNotFoundException ? 56 : ((Object) stateCaught_36 instanceof InvalidClassException ? 57 : ((Object) stateCaught_36 instanceof StreamCorruptedException ? 58 : ((Object) stateCaught_36 instanceof OptionalDataException ? 59 : ((Object) stateCaught_36 instanceof IllegalAccessException ? 60 : ((Object) stateCaught_36 instanceof IllegalArgumentException ? 61 : ((Object) stateCaught_36 instanceof java.lang.reflect.InvocationTargetException ? 62 : ((Object) stateCaught_36 instanceof SecurityException ? 63 : ((Object) stateCaught_36 instanceof IOException ? 64 : ((Object) stateCaught_36 instanceof NullPointerException ? 65 : ((Object) stateCaught_36 instanceof Exception ? 66 : 67)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            if (var6_int == 4) {
                                statePc = 39;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = ((Object) stateCaught_37 instanceof ClassNotFoundException ? 56 : ((Object) stateCaught_37 instanceof InvalidClassException ? 57 : ((Object) stateCaught_37 instanceof StreamCorruptedException ? 58 : ((Object) stateCaught_37 instanceof OptionalDataException ? 59 : ((Object) stateCaught_37 instanceof IllegalAccessException ? 60 : ((Object) stateCaught_37 instanceof IllegalArgumentException ? 61 : ((Object) stateCaught_37 instanceof java.lang.reflect.InvocationTargetException ? 62 : ((Object) stateCaught_37 instanceof SecurityException ? 63 : ((Object) stateCaught_37 instanceof IOException ? 64 : ((Object) stateCaught_37 instanceof NullPointerException ? 65 : ((Object) stateCaught_37 instanceof Exception ? 66 : 67)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = ((Object) stateCaught_38 instanceof ClassNotFoundException ? 56 : ((Object) stateCaught_38 instanceof InvalidClassException ? 57 : ((Object) stateCaught_38 instanceof StreamCorruptedException ? 58 : ((Object) stateCaught_38 instanceof OptionalDataException ? 59 : ((Object) stateCaught_38 instanceof IllegalAccessException ? 60 : ((Object) stateCaught_38 instanceof IllegalArgumentException ? 61 : ((Object) stateCaught_38 instanceof java.lang.reflect.InvocationTargetException ? 62 : ((Object) stateCaught_38 instanceof SecurityException ? 63 : ((Object) stateCaught_38 instanceof IOException ? 64 : ((Object) stateCaught_38 instanceof NullPointerException ? 65 : ((Object) stateCaught_38 instanceof Exception ? 66 : 67)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            var26 = (java.lang.reflect.Method) (var13.field_s[var5].field_b);
                            var8 = var26.getModifiers();
                            param1.b(0, -49152);
                            param1.a(-803539344, var8);
                            if (var12 == 0) {
                                statePc = 55;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = ((Object) stateCaught_39 instanceof ClassNotFoundException ? 56 : ((Object) stateCaught_39 instanceof InvalidClassException ? 57 : ((Object) stateCaught_39 instanceof StreamCorruptedException ? 58 : ((Object) stateCaught_39 instanceof OptionalDataException ? 59 : ((Object) stateCaught_39 instanceof IllegalAccessException ? 60 : ((Object) stateCaught_39 instanceof IllegalArgumentException ? 61 : ((Object) stateCaught_39 instanceof java.lang.reflect.InvocationTargetException ? 62 : ((Object) stateCaught_39 instanceof SecurityException ? 63 : ((Object) stateCaught_39 instanceof IOException ? 64 : ((Object) stateCaught_39 instanceof NullPointerException ? 65 : ((Object) stateCaught_39 instanceof Exception ? 66 : 67)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            var27 = (java.lang.reflect.Method) (var13.field_s[var5].field_b);
                            var24 = var13.field_f[var5];
                            var9 = new Object[var24.length];
                            var10_int = 0;
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = ((Object) stateCaught_40 instanceof ClassNotFoundException ? 56 : ((Object) stateCaught_40 instanceof InvalidClassException ? 57 : ((Object) stateCaught_40 instanceof StreamCorruptedException ? 58 : ((Object) stateCaught_40 instanceof OptionalDataException ? 59 : ((Object) stateCaught_40 instanceof IllegalAccessException ? 60 : ((Object) stateCaught_40 instanceof IllegalArgumentException ? 61 : ((Object) stateCaught_40 instanceof java.lang.reflect.InvocationTargetException ? 62 : ((Object) stateCaught_40 instanceof SecurityException ? 63 : ((Object) stateCaught_40 instanceof IOException ? 64 : ((Object) stateCaught_40 instanceof NullPointerException ? 65 : ((Object) stateCaught_40 instanceof Exception ? 66 : 67)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            if ((var10_int ^ -1) <= (var24.length ^ -1)) {
                                statePc = 45;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = ((Object) stateCaught_41 instanceof ClassNotFoundException ? 56 : ((Object) stateCaught_41 instanceof InvalidClassException ? 57 : ((Object) stateCaught_41 instanceof StreamCorruptedException ? 58 : ((Object) stateCaught_41 instanceof OptionalDataException ? 59 : ((Object) stateCaught_41 instanceof IllegalAccessException ? 60 : ((Object) stateCaught_41 instanceof IllegalArgumentException ? 61 : ((Object) stateCaught_41 instanceof java.lang.reflect.InvocationTargetException ? 62 : ((Object) stateCaught_41 instanceof SecurityException ? 63 : ((Object) stateCaught_41 instanceof IOException ? 64 : ((Object) stateCaught_41 instanceof NullPointerException ? 65 : ((Object) stateCaught_41 instanceof Exception ? 66 : 67)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            var11 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var24[var10_int])));
                            var9[var10_int] = var11.readObject();
                            var10_int++;
                            if (var12 != 0) {
                                statePc = 55;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = ((Object) stateCaught_42 instanceof ClassNotFoundException ? 56 : ((Object) stateCaught_42 instanceof InvalidClassException ? 57 : ((Object) stateCaught_42 instanceof StreamCorruptedException ? 58 : ((Object) stateCaught_42 instanceof OptionalDataException ? 59 : ((Object) stateCaught_42 instanceof IllegalAccessException ? 60 : ((Object) stateCaught_42 instanceof IllegalArgumentException ? 61 : ((Object) stateCaught_42 instanceof java.lang.reflect.InvocationTargetException ? 62 : ((Object) stateCaught_42 instanceof SecurityException ? 63 : ((Object) stateCaught_42 instanceof IOException ? 64 : ((Object) stateCaught_42 instanceof NullPointerException ? 65 : ((Object) stateCaught_42 instanceof Exception ? 66 : 67)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            if (var12 == 0) {
                                statePc = 41;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = ((Object) stateCaught_43 instanceof ClassNotFoundException ? 56 : ((Object) stateCaught_43 instanceof InvalidClassException ? 57 : ((Object) stateCaught_43 instanceof StreamCorruptedException ? 58 : ((Object) stateCaught_43 instanceof OptionalDataException ? 59 : ((Object) stateCaught_43 instanceof IllegalAccessException ? 60 : ((Object) stateCaught_43 instanceof IllegalArgumentException ? 61 : ((Object) stateCaught_43 instanceof java.lang.reflect.InvocationTargetException ? 62 : ((Object) stateCaught_43 instanceof SecurityException ? 63 : ((Object) stateCaught_43 instanceof IOException ? 64 : ((Object) stateCaught_43 instanceof NullPointerException ? 65 : ((Object) stateCaught_43 instanceof Exception ? 66 : 67)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            statePc = 45;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = ((Object) stateCaught_44 instanceof ClassNotFoundException ? 56 : ((Object) stateCaught_44 instanceof InvalidClassException ? 57 : ((Object) stateCaught_44 instanceof StreamCorruptedException ? 58 : ((Object) stateCaught_44 instanceof OptionalDataException ? 59 : ((Object) stateCaught_44 instanceof IllegalAccessException ? 60 : ((Object) stateCaught_44 instanceof IllegalArgumentException ? 61 : ((Object) stateCaught_44 instanceof java.lang.reflect.InvocationTargetException ? 62 : ((Object) stateCaught_44 instanceof SecurityException ? 63 : ((Object) stateCaught_44 instanceof IOException ? 64 : ((Object) stateCaught_44 instanceof NullPointerException ? 65 : ((Object) stateCaught_44 instanceof Exception ? 66 : 67)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            var10 = var27.invoke((Object) null, var9);
                            if (var10 != null) {
                                statePc = 48;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = ((Object) stateCaught_45 instanceof ClassNotFoundException ? 56 : ((Object) stateCaught_45 instanceof InvalidClassException ? 57 : ((Object) stateCaught_45 instanceof StreamCorruptedException ? 58 : ((Object) stateCaught_45 instanceof OptionalDataException ? 59 : ((Object) stateCaught_45 instanceof IllegalAccessException ? 60 : ((Object) stateCaught_45 instanceof IllegalArgumentException ? 61 : ((Object) stateCaught_45 instanceof java.lang.reflect.InvocationTargetException ? 62 : ((Object) stateCaught_45 instanceof SecurityException ? 63 : ((Object) stateCaught_45 instanceof IOException ? 64 : ((Object) stateCaught_45 instanceof NullPointerException ? 65 : ((Object) stateCaught_45 instanceof Exception ? 66 : 67)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            param1.b(0, -49152);
                            if (var12 == 0) {
                                statePc = 55;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = ((Object) stateCaught_46 instanceof ClassNotFoundException ? 56 : ((Object) stateCaught_46 instanceof InvalidClassException ? 57 : ((Object) stateCaught_46 instanceof StreamCorruptedException ? 58 : ((Object) stateCaught_46 instanceof OptionalDataException ? 59 : ((Object) stateCaught_46 instanceof IllegalAccessException ? 60 : ((Object) stateCaught_46 instanceof IllegalArgumentException ? 61 : ((Object) stateCaught_46 instanceof java.lang.reflect.InvocationTargetException ? 62 : ((Object) stateCaught_46 instanceof SecurityException ? 63 : ((Object) stateCaught_46 instanceof IOException ? 64 : ((Object) stateCaught_46 instanceof NullPointerException ? 65 : ((Object) stateCaught_46 instanceof Exception ? 66 : 67)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            statePc = 48;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = ((Object) stateCaught_47 instanceof ClassNotFoundException ? 56 : ((Object) stateCaught_47 instanceof InvalidClassException ? 57 : ((Object) stateCaught_47 instanceof StreamCorruptedException ? 58 : ((Object) stateCaught_47 instanceof OptionalDataException ? 59 : ((Object) stateCaught_47 instanceof IllegalAccessException ? 60 : ((Object) stateCaught_47 instanceof IllegalArgumentException ? 61 : ((Object) stateCaught_47 instanceof java.lang.reflect.InvocationTargetException ? 62 : ((Object) stateCaught_47 instanceof SecurityException ? 63 : ((Object) stateCaught_47 instanceof IOException ? 64 : ((Object) stateCaught_47 instanceof NullPointerException ? 65 : ((Object) stateCaught_47 instanceof Exception ? 66 : 67)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            if (var10 instanceof Number) {
                                statePc = 54;
                            } else {
                                statePc = 49;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = ((Object) stateCaught_48 instanceof ClassNotFoundException ? 56 : ((Object) stateCaught_48 instanceof InvalidClassException ? 57 : ((Object) stateCaught_48 instanceof StreamCorruptedException ? 58 : ((Object) stateCaught_48 instanceof OptionalDataException ? 59 : ((Object) stateCaught_48 instanceof IllegalAccessException ? 60 : ((Object) stateCaught_48 instanceof IllegalArgumentException ? 61 : ((Object) stateCaught_48 instanceof java.lang.reflect.InvocationTargetException ? 62 : ((Object) stateCaught_48 instanceof SecurityException ? 63 : ((Object) stateCaught_48 instanceof IOException ? 64 : ((Object) stateCaught_48 instanceof NullPointerException ? 65 : ((Object) stateCaught_48 instanceof Exception ? 66 : 67)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            if (!(var10 instanceof String)) {
                                statePc = 52;
                            } else {
                                statePc = 50;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = ((Object) stateCaught_49 instanceof ClassNotFoundException ? 56 : ((Object) stateCaught_49 instanceof InvalidClassException ? 57 : ((Object) stateCaught_49 instanceof StreamCorruptedException ? 58 : ((Object) stateCaught_49 instanceof OptionalDataException ? 59 : ((Object) stateCaught_49 instanceof IllegalAccessException ? 60 : ((Object) stateCaught_49 instanceof IllegalArgumentException ? 61 : ((Object) stateCaught_49 instanceof java.lang.reflect.InvocationTargetException ? 62 : ((Object) stateCaught_49 instanceof SecurityException ? 63 : ((Object) stateCaught_49 instanceof IOException ? 64 : ((Object) stateCaught_49 instanceof NullPointerException ? 65 : ((Object) stateCaught_49 instanceof Exception ? 66 : 67)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            param1.b(2, -49152);
                            param1.a(-105, (String) (var10));
                            if (var12 == 0) {
                                statePc = 55;
                            } else {
                                statePc = 51;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = ((Object) stateCaught_50 instanceof ClassNotFoundException ? 56 : ((Object) stateCaught_50 instanceof InvalidClassException ? 57 : ((Object) stateCaught_50 instanceof StreamCorruptedException ? 58 : ((Object) stateCaught_50 instanceof OptionalDataException ? 59 : ((Object) stateCaught_50 instanceof IllegalAccessException ? 60 : ((Object) stateCaught_50 instanceof IllegalArgumentException ? 61 : ((Object) stateCaught_50 instanceof java.lang.reflect.InvocationTargetException ? 62 : ((Object) stateCaught_50 instanceof SecurityException ? 63 : ((Object) stateCaught_50 instanceof IOException ? 64 : ((Object) stateCaught_50 instanceof NullPointerException ? 65 : ((Object) stateCaught_50 instanceof Exception ? 66 : 67)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            statePc = 52;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = ((Object) stateCaught_51 instanceof ClassNotFoundException ? 56 : ((Object) stateCaught_51 instanceof InvalidClassException ? 57 : ((Object) stateCaught_51 instanceof StreamCorruptedException ? 58 : ((Object) stateCaught_51 instanceof OptionalDataException ? 59 : ((Object) stateCaught_51 instanceof IllegalAccessException ? 60 : ((Object) stateCaught_51 instanceof IllegalArgumentException ? 61 : ((Object) stateCaught_51 instanceof java.lang.reflect.InvocationTargetException ? 62 : ((Object) stateCaught_51 instanceof SecurityException ? 63 : ((Object) stateCaught_51 instanceof IOException ? 64 : ((Object) stateCaught_51 instanceof NullPointerException ? 65 : ((Object) stateCaught_51 instanceof Exception ? 66 : 67)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            param1.b(4, -49152);
                            if (var12 == 0) {
                                statePc = 55;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = ((Object) stateCaught_52 instanceof ClassNotFoundException ? 56 : ((Object) stateCaught_52 instanceof InvalidClassException ? 57 : ((Object) stateCaught_52 instanceof StreamCorruptedException ? 58 : ((Object) stateCaught_52 instanceof OptionalDataException ? 59 : ((Object) stateCaught_52 instanceof IllegalAccessException ? 60 : ((Object) stateCaught_52 instanceof IllegalArgumentException ? 61 : ((Object) stateCaught_52 instanceof java.lang.reflect.InvocationTargetException ? 62 : ((Object) stateCaught_52 instanceof SecurityException ? 63 : ((Object) stateCaught_52 instanceof IOException ? 64 : ((Object) stateCaught_52 instanceof NullPointerException ? 65 : ((Object) stateCaught_52 instanceof Exception ? 66 : 67)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = ((Object) stateCaught_53 instanceof ClassNotFoundException ? 56 : ((Object) stateCaught_53 instanceof InvalidClassException ? 57 : ((Object) stateCaught_53 instanceof StreamCorruptedException ? 58 : ((Object) stateCaught_53 instanceof OptionalDataException ? 59 : ((Object) stateCaught_53 instanceof IllegalAccessException ? 60 : ((Object) stateCaught_53 instanceof IllegalArgumentException ? 61 : ((Object) stateCaught_53 instanceof java.lang.reflect.InvocationTargetException ? 62 : ((Object) stateCaught_53 instanceof SecurityException ? 63 : ((Object) stateCaught_53 instanceof IOException ? 64 : ((Object) stateCaught_53 instanceof NullPointerException ? 65 : ((Object) stateCaught_53 instanceof Exception ? 66 : 67)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            param1.b(1, -49152);
                            param1.a(((Number) (var10)).longValue(), (byte) 84);
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = ((Object) stateCaught_54 instanceof ClassNotFoundException ? 56 : ((Object) stateCaught_54 instanceof InvalidClassException ? 57 : ((Object) stateCaught_54 instanceof StreamCorruptedException ? 58 : ((Object) stateCaught_54 instanceof OptionalDataException ? 59 : ((Object) stateCaught_54 instanceof IllegalAccessException ? 60 : ((Object) stateCaught_54 instanceof IllegalArgumentException ? 61 : ((Object) stateCaught_54 instanceof java.lang.reflect.InvocationTargetException ? 62 : ((Object) stateCaught_54 instanceof SecurityException ? 63 : ((Object) stateCaught_54 instanceof IOException ? 64 : ((Object) stateCaught_54 instanceof NullPointerException ? 65 : ((Object) stateCaught_54 instanceof Exception ? 66 : 67)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            var6 = (ClassNotFoundException) ((Object) caughtException);
                            param1.b(-10, -49152);
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            var6_ref = (InvalidClassException) ((Object) caughtException);
                            param1.b(-11, -49152);
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            var6_ref2 = (StreamCorruptedException) ((Object) caughtException);
                            param1.b(-12, -49152);
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            var6_ref3 = (OptionalDataException) ((Object) caughtException);
                            param1.b(-13, -49152);
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            var6_ref4 = (IllegalAccessException) ((Object) caughtException);
                            param1.b(-14, -49152);
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            var6_ref5 = (IllegalArgumentException) ((Object) caughtException);
                            param1.b(-15, -49152);
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            var6_ref6 = (java.lang.reflect.InvocationTargetException) ((Object) caughtException);
                            param1.b(-16, -49152);
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            var6_ref7 = (SecurityException) ((Object) caughtException);
                            param1.b(-17, -49152);
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            var6_ref8 = (IOException) ((Object) caughtException);
                            param1.b(-18, -49152);
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            var6_ref9 = (NullPointerException) ((Object) caughtException);
                            param1.b(-19, -49152);
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            var6_ref10 = (Exception) ((Object) caughtException);
                            param1.b(-20, -49152);
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            var6_ref11 = caughtException;
                            param1.b(-21, -49152);
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            var5++;
                            if (var12 == 0) {
                                statePc = 25;
                            } else {
                                statePc = 69;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            stackIn_70_0 = param1.a((byte) -66, var4);
                            statePc = 70;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            var17.c(-19822);
                            statePc = 71;
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        return;
                    }
                    case 72: {
                        var2 = (RuntimeException) ((Object) caughtException);
                        stackIn_74_0 = (RuntimeException) (var2);
                        stackIn_73_0 = stackIn_74_0;
                        stackIn_74_1 = new StringBuilder().append("nf.GB(").append(param0).append(',');
                        stackIn_73_1 = stackIn_74_1;
                        if (param1 == null) {
                            statePc = 74;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    }
                    case 73: {
                        stackIn_75_0 = (RuntimeException) ((Object) stackIn_73_0);
                        stackIn_75_1 = (StringBuilder) ((Object) stackIn_73_1);
                        stackIn_75_2 = "{...}";
                        statePc = 75;
                        continue stateLoop;
                    }
                    case 74: {
                        stackIn_75_0 = (RuntimeException) ((Object) stackIn_74_0);
                        stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
                        stackIn_75_2 = "null";
                        statePc = 75;
                        continue stateLoop;
                    }
                    case 75: {
                        throw la.a((Throwable) ((Object) stackIn_75_0), stackIn_75_2 + ')');
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
            this.a(false, -117, 77);
        }
    }

    nf(kj param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_K = 0;
        this.field_L = 0;
    }

    final void b(int param0, int param1, int param2, int param3) {
        if (!(param3 > 0)) {
            this.a(param0, (byte) 124, param2);
            return;
        }
        this.field_G = this.field_l;
        this.field_K = param3;
        this.field_I = param0;
        this.field_L = param1;
        this.field_J = param2;
        this.field_H = this.field_p;
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
        if (param0 < 0 || 65536 <= param0) {
            param0 = param0 >>> 16;
            var2 += 16;
        }
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
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_3_0 = null;
        short[] stackIn_20_0 = null;
        short[] stackIn_23_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4_int = param1.f(8, param2);
                        if (0 != var4_int) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return (short[]) ((Object) stackIn_3_0);
                }
                case 4: {
                    try {
                        if (param3 == null) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((param3.length ^ -1) != (var4_int ^ -1)) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        param3 = new short[var4_int];
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (!param0) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        nf.a(113, (byte) 53, 71, -3);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var5 = param1.f(8, 4);
                        var6 = (short)param1.f(8, 16);
                        if ((var5 ^ -1) < -1) {
                            statePc = 17;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var7 = 0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var4_int <= var7) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        param3[var7] = (short)var6;
                        var7++;
                        if (var8 != 0) {
                            statePc = 22;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var8 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var8 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var7 = 0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var4_int <= var7) {
                            statePc = 22;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackIn_23_0 = (short[]) (param3);
                        stackIn_20_0 = stackIn_23_0;
                        if (var8 != 0) {
                            statePc = 23;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackIn_20_0[var7] = (short)(var6 + param1.f(8, var5));
                        var7++;
                        if (var8 == 0) {
                            statePc = 18;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackIn_23_0 = (short[]) (param3);
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 23: {
                    return stackIn_23_0;
                }
                case 24: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_26_0 = (RuntimeException) (var4);
                    stackIn_25_0 = stackIn_26_0;
                    stackIn_26_1 = new StringBuilder().append("nf.EA(").append(param0).append(',');
                    stackIn_25_1 = stackIn_26_1;
                    if (param1 == null) {
                        statePc = 26;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    stackIn_27_0 = (RuntimeException) ((Object) stackIn_25_0);
                    stackIn_27_1 = (StringBuilder) ((Object) stackIn_25_1);
                    stackIn_27_2 = "{...}";
                    statePc = 27;
                    continue stateLoop;
                }
                case 26: {
                    stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
                    stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
                    stackIn_27_2 = "null";
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    stackIn_29_0 = (RuntimeException) ((Object) stackIn_27_0);
                    stackIn_28_0 = stackIn_29_0;
                    stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(param2).append(',');
                    stackIn_28_1 = stackIn_29_1;
                    if (param3 == null) {
                        statePc = 29;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    stackIn_30_0 = (RuntimeException) ((Object) stackIn_28_0);
                    stackIn_30_1 = (StringBuilder) ((Object) stackIn_28_1);
                    stackIn_30_2 = "{...}";
                    statePc = 30;
                    continue stateLoop;
                }
                case 29: {
                    stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
                    stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
                    stackIn_30_2 = "null";
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    throw la.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
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
        if ((this.field_K ^ -1) >= -1) {
            return;
        }
        this.a(this.field_I, (byte) -109, this.field_J);
        this.field_K = 0;
        this.e((byte) 10);
    }

    void a(boolean param0, int param1, int param2) {
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int statePc = 0;
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
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var16 = MonkeyPuzzle2.field_F ? 1 : 0;
                    ge.a(6 + param1, param2 - -35, this.field_l + -12, -40 + this.field_p, 2105376, 0);
                    var4 = 35;
                    var5 = 211;
                    var6 = 194;
                    if (!param0) {
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
                    var7 = 0;
                    var8 = param2;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (var4 <= var7) {
                        statePc = 31;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    stackIn_32_0 = var8;
                    stackIn_5_0 = stackIn_32_0;
                    stackIn_32_1 = ge.field_f;
                    stackIn_5_1 = stackIn_32_1;
                    if (var16 != 0) {
                        statePc = 32;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (stackIn_5_0 < stackIn_5_1) {
                        statePc = 30;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (ge.field_k <= var8) {
                        statePc = 30;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var9 = var5 + var7 * (-var5 + var6) / var4;
                    var10 = 0;
                    var11 = this.field_l;
                    if (-21 <= (var7 ^ -1)) {
                        statePc = 9;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if ((var10 ^ -1) < -21) {
                        statePc = 17;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var12 = (20 + -var7) * (-var7 + 20) + (-var10 + 20) * (-var10 + 20);
                    stackIn_18_0 = var12 ^ -1;
                    stackIn_11_0 = stackIn_18_0;
                    stackIn_18_1 = -463;
                    stackIn_11_1 = stackIn_18_1;
                    if (var16 != 0) {
                        statePc = 18;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (stackIn_11_0 >= stackIn_11_1) {
                        statePc = 14;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (var16 == 0) {
                        statePc = 16;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (var12 < 420) {
                        statePc = 17;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var13 = (462 + -var12) * var9 / 42;
                    var13 = var13 | (var13 << 446319696 | var13 << -838844024);
                    ge.field_i[var10 + var8 * ge.field_h + param1] = var13;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    var10++;
                    if (var16 == 0) {
                        statePc = 9;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    stackIn_18_0 = var7 ^ -1;
                    stackIn_18_1 = -21;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    if (stackIn_18_0 < stackIn_18_1) {
                        statePc = 28;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var12 = var11;
                    var11 -= 21;
                    var13 = 0;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    if (var13 > 20) {
                        statePc = 27;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    var14 = (-var7 + 20) * (20 - var7) + var13 * var13;
                    stackIn_29_0 = -463;
                    stackIn_22_0 = stackIn_29_0;
                    stackIn_29_1 = var14 ^ -1;
                    stackIn_22_1 = stackIn_29_1;
                    if (var16 != 0) {
                        statePc = 29;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    if (stackIn_22_0 > stackIn_22_1) {
                        statePc = 27;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (420 <= var14) {
                        statePc = 25;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    var12 = var11 - -1;
                    if (var16 == 0) {
                        statePc = 26;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    var15 = var9 * (462 + -var14) / 42;
                    var15 = var15 | (var15 << 223973264 | var15 << -1223379096);
                    ge.field_i[var11 + ge.field_h * var8 + param1] = var15;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    var11++;
                    var13++;
                    if (var16 == 0) {
                        statePc = 20;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    var11 = var12;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    var9 = var9 | (var9 << -1122122416 | var9 << -1360539448);
                    stackIn_29_0 = param1 + var10;
                    stackIn_29_1 = var8;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    ge.a(stackIn_29_0, stackIn_29_1, var11 + -var10, var9);
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    var8++;
                    var7++;
                    if (var16 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    var4 = 22;
                    var5 = 194;
                    var6 = 169;
                    var7 = 0;
                    stackIn_32_0 = param2;
                    stackIn_32_1 = -35;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    var8 = stackIn_32_0 - stackIn_32_1;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    if (var4 <= var7) {
                        statePc = 37;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    var9 = var7 * (-var5 + var6) / var4 + var5;
                    var9 = var9 | (var9 << -1147390800 | var9 << 1837289992);
                    ge.a(param1, var8, 6, var9);
                    ge.a(param1 - -this.field_l + -6, var8, 6, var9);
                    var8++;
                    var7++;
                    if (var16 != 0) {
                        statePc = 38;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    if (var16 == 0) {
                        statePc = 33;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    af.field_e.c(this.field_l + param1 + -90, 10 + param2);
                    qb.a(param2 - -35, pe.field_a, (byte) -108, 5 + param1, this.field_l - 10);
                    qb.a(-22 + param2 + this.field_p, ra.field_Z, (byte) -109, param1, this.field_l);
                    var6 = 127;
                    var5 = 169;
                    var4 = -79 + this.field_p;
                    var7 = 0;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    var8 = 57 + param2;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    if (var7 >= var4) {
                        statePc = 43;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    var9 = var5 + (var6 + -var5) * var7 / var4;
                    var9 = var9 | (var9 << -1939856496 | var9 << 673181288);
                    ge.a(param1, var8, 6, var9);
                    ge.a(-6 + (this.field_l + param1), var8, 6, var9);
                    var7++;
                    var8++;
                    if (var16 != 0) {
                        statePc = 43;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if (var16 == 0) {
                        statePc = 39;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    boolean b(boolean param0) {
        if (param0) {
            this.k(-110);
        }
        this.p(-21);
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
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        L0: {
          if (param0 == -23913) {
            break L0;
          } else {
            nf.a(-124, true);
            break L0;
          }
        }
        L1: {
          if ((this.field_K ^ -1) < -1) {
            L2: {
              L3: {
                var2 = this.field_J;
                var3 = this.field_I;
                fieldTemp$1 = this.field_L + 1;
                this.field_L = this.field_L + 1;
                if ((this.field_K ^ -1) < (fieldTemp$1 ^ -1)) {
                  break L3;
                } else {
                  this.field_K = 0;
                  this.e((byte) 10);
                  if (!MonkeyPuzzle2.field_F) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var4 = (this.field_K * 2 + -this.field_L) * this.field_L;
              var5 = this.field_K * this.field_K;
              var3 = var4 * (-this.field_H + this.field_I) / var5 + this.field_H;
              var2 = this.field_G + var4 * (-this.field_G + this.field_J) / var5;
              break L2;
            }
            this.a(var3, (byte) 115, var2);
            break L1;
          } else {
            break L1;
          }
        }
        return super.k(-23913);
    }

    static {
        field_N = 0;
        field_E = "Back";
    }
}
