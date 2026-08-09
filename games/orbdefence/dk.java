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
            field_c = (int[]) null;
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
            int stackIn_30_0 = 0;
            int stackIn_74_0 = 0;
            RuntimeException stackIn_77_0 = null;
            StringBuilder stackIn_77_1 = null;
            RuntimeException stackIn_78_0 = null;
            StringBuilder stackIn_78_1 = null;
            RuntimeException stackIn_79_0 = null;
            StringBuilder stackIn_79_1 = null;
            String stackIn_79_2 = null;
            int decompiledRegionSelector0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            RuntimeException var2 = null;
            int var3 = 0;
            int var4 = 0;
            int var5 = 0;
            int var6 = 0;
            int var7_int = 0;
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
            java.lang.reflect.Field var8 = null;
            int var9 = 0;
            Object[] var10 = null;
            int var11_int = 0;
            Object var11 = null;
            ObjectInputStream var12 = null;
            int var13 = 0;
            ud var14 = null;
            java.lang.reflect.Field var15 = null;
            Object var16 = null;
            ud var18 = null;
            Object var19 = null;
            Object var20 = null;
            Object var22 = null;
            byte[][] var25 = null;
            java.lang.reflect.Field var26 = null;
            java.lang.reflect.Field var27 = null;
            java.lang.reflect.Method var28 = null;
            java.lang.reflect.Method var29 = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var19 = null;
                        var16 = null;
                        var20 = null;
                        var22 = null;
                        var13 = OrbDefence.field_D ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var14 = (ud) ((Object) ab.field_h.b((byte) 114));
                            var18 = var14;
                            if (var18 == null) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        return;
                    }
                    case 4: {
                        try {
                            var3 = 87 % ((param0 - 65) / 32);
                            var4 = 0;
                            var5 = 0;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (var5 >= var18.field_o) {
                                statePc = 24;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (var13 != 0) {
                                statePc = 26;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (var14.field_h[var5] != null) {
                                statePc = 9;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            if ((var14.field_h[var5].field_a ^ -1) == -3) {
                                statePc = 11;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            var14.field_m[var5] = -5;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            if (var14.field_h[var5].field_a == 0) {
                                statePc = 14;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            var4 = 1;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (var14.field_i[var5] != null) {
                                statePc = 17;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if ((var14.field_i[var5].field_a ^ -1) == -3) {
                                statePc = 19;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            var14.field_m[var5] = -6;
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (0 == var14.field_i[var5].field_a) {
                                statePc = 22;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            var4 = 1;
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            var5++;
                            if (var13 == 0) {
                                statePc = 5;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if (var4 != 0) {
                                statePc = 26;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        return;
                    }
                    case 27: {
                        try {
                            var5 = param1.field_i;
                            param1.b(var18.field_k, -1);
                            var6 = 0;
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            if (var6 >= var18.field_o) {
                                statePc = 73;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            stackIn_74_0 = var14.field_m[var6] ^ -1;
                            stackIn_30_0 = stackIn_74_0;
                            if (var13 != 0) {
                                statePc = 74;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if (stackIn_30_0 != -1) {
                                statePc = 32;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            param1.a(var14.field_m[var6], -17);
                            if (var13 == 0) {
                                statePc = 72;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            var7_int = var14.field_l[var6];
                            if (-1 != (var7_int ^ -1)) {
                                statePc = 35;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = ((Object) stateCaught_33 instanceof ClassNotFoundException ? 60 : ((Object) stateCaught_33 instanceof InvalidClassException ? 61 : ((Object) stateCaught_33 instanceof StreamCorruptedException ? 62 : ((Object) stateCaught_33 instanceof OptionalDataException ? 63 : ((Object) stateCaught_33 instanceof IllegalAccessException ? 64 : ((Object) stateCaught_33 instanceof IllegalArgumentException ? 65 : ((Object) stateCaught_33 instanceof java.lang.reflect.InvocationTargetException ? 66 : ((Object) stateCaught_33 instanceof SecurityException ? 67 : ((Object) stateCaught_33 instanceof IOException ? 68 : ((Object) stateCaught_33 instanceof NullPointerException ? 69 : ((Object) stateCaught_33 instanceof Exception ? 70 : 71)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            var26 = (java.lang.reflect.Field) (var14.field_h[var6].field_g);
                            var9 = var26.getInt((Object) null);
                            param1.a(0, -127);
                            param1.b(var9, -1);
                            if (var13 == 0) {
                                statePc = 39;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = ((Object) stateCaught_34 instanceof ClassNotFoundException ? 60 : ((Object) stateCaught_34 instanceof InvalidClassException ? 61 : ((Object) stateCaught_34 instanceof StreamCorruptedException ? 62 : ((Object) stateCaught_34 instanceof OptionalDataException ? 63 : ((Object) stateCaught_34 instanceof IllegalAccessException ? 64 : ((Object) stateCaught_34 instanceof IllegalArgumentException ? 65 : ((Object) stateCaught_34 instanceof java.lang.reflect.InvocationTargetException ? 66 : ((Object) stateCaught_34 instanceof SecurityException ? 67 : ((Object) stateCaught_34 instanceof IOException ? 68 : ((Object) stateCaught_34 instanceof NullPointerException ? 69 : ((Object) stateCaught_34 instanceof Exception ? 70 : 71)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            if (var7_int != 1) {
                                statePc = 37;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = ((Object) stateCaught_35 instanceof ClassNotFoundException ? 60 : ((Object) stateCaught_35 instanceof InvalidClassException ? 61 : ((Object) stateCaught_35 instanceof StreamCorruptedException ? 62 : ((Object) stateCaught_35 instanceof OptionalDataException ? 63 : ((Object) stateCaught_35 instanceof IllegalAccessException ? 64 : ((Object) stateCaught_35 instanceof IllegalArgumentException ? 65 : ((Object) stateCaught_35 instanceof java.lang.reflect.InvocationTargetException ? 66 : ((Object) stateCaught_35 instanceof SecurityException ? 67 : ((Object) stateCaught_35 instanceof IOException ? 68 : ((Object) stateCaught_35 instanceof NullPointerException ? 69 : ((Object) stateCaught_35 instanceof Exception ? 70 : 71)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            var15 = (java.lang.reflect.Field) (var14.field_h[var6].field_g);
                            var8 = var15;
                            var15.setInt((Object) null, var14.field_n[var6]);
                            param1.a(0, -36);
                            if (var13 == 0) {
                                statePc = 39;
                            } else {
                                statePc = 37;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = ((Object) stateCaught_36 instanceof ClassNotFoundException ? 60 : ((Object) stateCaught_36 instanceof InvalidClassException ? 61 : ((Object) stateCaught_36 instanceof StreamCorruptedException ? 62 : ((Object) stateCaught_36 instanceof OptionalDataException ? 63 : ((Object) stateCaught_36 instanceof IllegalAccessException ? 64 : ((Object) stateCaught_36 instanceof IllegalArgumentException ? 65 : ((Object) stateCaught_36 instanceof java.lang.reflect.InvocationTargetException ? 66 : ((Object) stateCaught_36 instanceof SecurityException ? 67 : ((Object) stateCaught_36 instanceof IOException ? 68 : ((Object) stateCaught_36 instanceof NullPointerException ? 69 : ((Object) stateCaught_36 instanceof Exception ? 70 : 71)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            if (2 != var7_int) {
                                statePc = 39;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = ((Object) stateCaught_37 instanceof ClassNotFoundException ? 60 : ((Object) stateCaught_37 instanceof InvalidClassException ? 61 : ((Object) stateCaught_37 instanceof StreamCorruptedException ? 62 : ((Object) stateCaught_37 instanceof OptionalDataException ? 63 : ((Object) stateCaught_37 instanceof IllegalAccessException ? 64 : ((Object) stateCaught_37 instanceof IllegalArgumentException ? 65 : ((Object) stateCaught_37 instanceof java.lang.reflect.InvocationTargetException ? 66 : ((Object) stateCaught_37 instanceof SecurityException ? 67 : ((Object) stateCaught_37 instanceof IOException ? 68 : ((Object) stateCaught_37 instanceof NullPointerException ? 69 : ((Object) stateCaught_37 instanceof Exception ? 70 : 71)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            var27 = (java.lang.reflect.Field) (var14.field_h[var6].field_g);
                            var9 = var27.getModifiers();
                            param1.a(0, -48);
                            param1.b(var9, -1);
                            statePc = 39;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = ((Object) stateCaught_38 instanceof ClassNotFoundException ? 60 : ((Object) stateCaught_38 instanceof InvalidClassException ? 61 : ((Object) stateCaught_38 instanceof StreamCorruptedException ? 62 : ((Object) stateCaught_38 instanceof OptionalDataException ? 63 : ((Object) stateCaught_38 instanceof IllegalAccessException ? 64 : ((Object) stateCaught_38 instanceof IllegalArgumentException ? 65 : ((Object) stateCaught_38 instanceof java.lang.reflect.InvocationTargetException ? 66 : ((Object) stateCaught_38 instanceof SecurityException ? 67 : ((Object) stateCaught_38 instanceof IOException ? 68 : ((Object) stateCaught_38 instanceof NullPointerException ? 69 : ((Object) stateCaught_38 instanceof Exception ? 70 : 71)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            if (var7_int == 3) {
                                statePc = 43;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = ((Object) stateCaught_39 instanceof ClassNotFoundException ? 60 : ((Object) stateCaught_39 instanceof InvalidClassException ? 61 : ((Object) stateCaught_39 instanceof StreamCorruptedException ? 62 : ((Object) stateCaught_39 instanceof OptionalDataException ? 63 : ((Object) stateCaught_39 instanceof IllegalAccessException ? 64 : ((Object) stateCaught_39 instanceof IllegalArgumentException ? 65 : ((Object) stateCaught_39 instanceof java.lang.reflect.InvocationTargetException ? 66 : ((Object) stateCaught_39 instanceof SecurityException ? 67 : ((Object) stateCaught_39 instanceof IOException ? 68 : ((Object) stateCaught_39 instanceof NullPointerException ? 69 : ((Object) stateCaught_39 instanceof Exception ? 70 : 71)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            if ((var7_int ^ -1) == -5) {
                                statePc = 42;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = ((Object) stateCaught_40 instanceof ClassNotFoundException ? 60 : ((Object) stateCaught_40 instanceof InvalidClassException ? 61 : ((Object) stateCaught_40 instanceof StreamCorruptedException ? 62 : ((Object) stateCaught_40 instanceof OptionalDataException ? 63 : ((Object) stateCaught_40 instanceof IllegalAccessException ? 64 : ((Object) stateCaught_40 instanceof IllegalArgumentException ? 65 : ((Object) stateCaught_40 instanceof java.lang.reflect.InvocationTargetException ? 66 : ((Object) stateCaught_40 instanceof SecurityException ? 67 : ((Object) stateCaught_40 instanceof IOException ? 68 : ((Object) stateCaught_40 instanceof NullPointerException ? 69 : ((Object) stateCaught_40 instanceof Exception ? 70 : 71)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = ((Object) stateCaught_41 instanceof ClassNotFoundException ? 60 : ((Object) stateCaught_41 instanceof InvalidClassException ? 61 : ((Object) stateCaught_41 instanceof StreamCorruptedException ? 62 : ((Object) stateCaught_41 instanceof OptionalDataException ? 63 : ((Object) stateCaught_41 instanceof IllegalAccessException ? 64 : ((Object) stateCaught_41 instanceof IllegalArgumentException ? 65 : ((Object) stateCaught_41 instanceof java.lang.reflect.InvocationTargetException ? 66 : ((Object) stateCaught_41 instanceof SecurityException ? 67 : ((Object) stateCaught_41 instanceof IOException ? 68 : ((Object) stateCaught_41 instanceof NullPointerException ? 69 : ((Object) stateCaught_41 instanceof Exception ? 70 : 71)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            var28 = (java.lang.reflect.Method) (var14.field_i[var6].field_g);
                            var9 = var28.getModifiers();
                            param1.a(0, -120);
                            param1.b(var9, -1);
                            if (var13 == 0) {
                                statePc = 72;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = ((Object) stateCaught_42 instanceof ClassNotFoundException ? 60 : ((Object) stateCaught_42 instanceof InvalidClassException ? 61 : ((Object) stateCaught_42 instanceof StreamCorruptedException ? 62 : ((Object) stateCaught_42 instanceof OptionalDataException ? 63 : ((Object) stateCaught_42 instanceof IllegalAccessException ? 64 : ((Object) stateCaught_42 instanceof IllegalArgumentException ? 65 : ((Object) stateCaught_42 instanceof java.lang.reflect.InvocationTargetException ? 66 : ((Object) stateCaught_42 instanceof SecurityException ? 67 : ((Object) stateCaught_42 instanceof IOException ? 68 : ((Object) stateCaught_42 instanceof NullPointerException ? 69 : ((Object) stateCaught_42 instanceof Exception ? 70 : 71)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            var29 = (java.lang.reflect.Method) (var14.field_i[var6].field_g);
                            var25 = var14.field_g[var6];
                            var10 = new Object[var25.length];
                            var11_int = 0;
                            statePc = 44;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = ((Object) stateCaught_43 instanceof ClassNotFoundException ? 60 : ((Object) stateCaught_43 instanceof InvalidClassException ? 61 : ((Object) stateCaught_43 instanceof StreamCorruptedException ? 62 : ((Object) stateCaught_43 instanceof OptionalDataException ? 63 : ((Object) stateCaught_43 instanceof IllegalAccessException ? 64 : ((Object) stateCaught_43 instanceof IllegalArgumentException ? 65 : ((Object) stateCaught_43 instanceof java.lang.reflect.InvocationTargetException ? 66 : ((Object) stateCaught_43 instanceof SecurityException ? 67 : ((Object) stateCaught_43 instanceof IOException ? 68 : ((Object) stateCaught_43 instanceof NullPointerException ? 69 : ((Object) stateCaught_43 instanceof Exception ? 70 : 71)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            if (var25.length <= var11_int) {
                                statePc = 48;
                            } else {
                                statePc = 45;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = ((Object) stateCaught_44 instanceof ClassNotFoundException ? 60 : ((Object) stateCaught_44 instanceof InvalidClassException ? 61 : ((Object) stateCaught_44 instanceof StreamCorruptedException ? 62 : ((Object) stateCaught_44 instanceof OptionalDataException ? 63 : ((Object) stateCaught_44 instanceof IllegalAccessException ? 64 : ((Object) stateCaught_44 instanceof IllegalArgumentException ? 65 : ((Object) stateCaught_44 instanceof java.lang.reflect.InvocationTargetException ? 66 : ((Object) stateCaught_44 instanceof SecurityException ? 67 : ((Object) stateCaught_44 instanceof IOException ? 68 : ((Object) stateCaught_44 instanceof NullPointerException ? 69 : ((Object) stateCaught_44 instanceof Exception ? 70 : 71)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            var12 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var25[var11_int])));
                            var10[var11_int] = var12.readObject();
                            var11_int++;
                            if (var13 != 0) {
                                statePc = 72;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = ((Object) stateCaught_45 instanceof ClassNotFoundException ? 60 : ((Object) stateCaught_45 instanceof InvalidClassException ? 61 : ((Object) stateCaught_45 instanceof StreamCorruptedException ? 62 : ((Object) stateCaught_45 instanceof OptionalDataException ? 63 : ((Object) stateCaught_45 instanceof IllegalAccessException ? 64 : ((Object) stateCaught_45 instanceof IllegalArgumentException ? 65 : ((Object) stateCaught_45 instanceof java.lang.reflect.InvocationTargetException ? 66 : ((Object) stateCaught_45 instanceof SecurityException ? 67 : ((Object) stateCaught_45 instanceof IOException ? 68 : ((Object) stateCaught_45 instanceof NullPointerException ? 69 : ((Object) stateCaught_45 instanceof Exception ? 70 : 71)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            if (var13 == 0) {
                                statePc = 44;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = ((Object) stateCaught_46 instanceof ClassNotFoundException ? 60 : ((Object) stateCaught_46 instanceof InvalidClassException ? 61 : ((Object) stateCaught_46 instanceof StreamCorruptedException ? 62 : ((Object) stateCaught_46 instanceof OptionalDataException ? 63 : ((Object) stateCaught_46 instanceof IllegalAccessException ? 64 : ((Object) stateCaught_46 instanceof IllegalArgumentException ? 65 : ((Object) stateCaught_46 instanceof java.lang.reflect.InvocationTargetException ? 66 : ((Object) stateCaught_46 instanceof SecurityException ? 67 : ((Object) stateCaught_46 instanceof IOException ? 68 : ((Object) stateCaught_46 instanceof NullPointerException ? 69 : ((Object) stateCaught_46 instanceof Exception ? 70 : 71)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            statePc = 48;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = ((Object) stateCaught_47 instanceof ClassNotFoundException ? 60 : ((Object) stateCaught_47 instanceof InvalidClassException ? 61 : ((Object) stateCaught_47 instanceof StreamCorruptedException ? 62 : ((Object) stateCaught_47 instanceof OptionalDataException ? 63 : ((Object) stateCaught_47 instanceof IllegalAccessException ? 64 : ((Object) stateCaught_47 instanceof IllegalArgumentException ? 65 : ((Object) stateCaught_47 instanceof java.lang.reflect.InvocationTargetException ? 66 : ((Object) stateCaught_47 instanceof SecurityException ? 67 : ((Object) stateCaught_47 instanceof IOException ? 68 : ((Object) stateCaught_47 instanceof NullPointerException ? 69 : ((Object) stateCaught_47 instanceof Exception ? 70 : 71)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            var11 = var29.invoke((Object) null, var10);
                            if (var11 != null) {
                                statePc = 51;
                            } else {
                                statePc = 49;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = ((Object) stateCaught_48 instanceof ClassNotFoundException ? 60 : ((Object) stateCaught_48 instanceof InvalidClassException ? 61 : ((Object) stateCaught_48 instanceof StreamCorruptedException ? 62 : ((Object) stateCaught_48 instanceof OptionalDataException ? 63 : ((Object) stateCaught_48 instanceof IllegalAccessException ? 64 : ((Object) stateCaught_48 instanceof IllegalArgumentException ? 65 : ((Object) stateCaught_48 instanceof java.lang.reflect.InvocationTargetException ? 66 : ((Object) stateCaught_48 instanceof SecurityException ? 67 : ((Object) stateCaught_48 instanceof IOException ? 68 : ((Object) stateCaught_48 instanceof NullPointerException ? 69 : ((Object) stateCaught_48 instanceof Exception ? 70 : 71)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            param1.a(0, -76);
                            if (var13 == 0) {
                                statePc = 72;
                            } else {
                                statePc = 50;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = ((Object) stateCaught_49 instanceof ClassNotFoundException ? 60 : ((Object) stateCaught_49 instanceof InvalidClassException ? 61 : ((Object) stateCaught_49 instanceof StreamCorruptedException ? 62 : ((Object) stateCaught_49 instanceof OptionalDataException ? 63 : ((Object) stateCaught_49 instanceof IllegalAccessException ? 64 : ((Object) stateCaught_49 instanceof IllegalArgumentException ? 65 : ((Object) stateCaught_49 instanceof java.lang.reflect.InvocationTargetException ? 66 : ((Object) stateCaught_49 instanceof SecurityException ? 67 : ((Object) stateCaught_49 instanceof IOException ? 68 : ((Object) stateCaught_49 instanceof NullPointerException ? 69 : ((Object) stateCaught_49 instanceof Exception ? 70 : 71)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            statePc = 51;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = ((Object) stateCaught_50 instanceof ClassNotFoundException ? 60 : ((Object) stateCaught_50 instanceof InvalidClassException ? 61 : ((Object) stateCaught_50 instanceof StreamCorruptedException ? 62 : ((Object) stateCaught_50 instanceof OptionalDataException ? 63 : ((Object) stateCaught_50 instanceof IllegalAccessException ? 64 : ((Object) stateCaught_50 instanceof IllegalArgumentException ? 65 : ((Object) stateCaught_50 instanceof java.lang.reflect.InvocationTargetException ? 66 : ((Object) stateCaught_50 instanceof SecurityException ? 67 : ((Object) stateCaught_50 instanceof IOException ? 68 : ((Object) stateCaught_50 instanceof NullPointerException ? 69 : ((Object) stateCaught_50 instanceof Exception ? 70 : 71)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            if (!(var11 instanceof Number)) {
                                statePc = 54;
                            } else {
                                statePc = 52;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = ((Object) stateCaught_51 instanceof ClassNotFoundException ? 60 : ((Object) stateCaught_51 instanceof InvalidClassException ? 61 : ((Object) stateCaught_51 instanceof StreamCorruptedException ? 62 : ((Object) stateCaught_51 instanceof OptionalDataException ? 63 : ((Object) stateCaught_51 instanceof IllegalAccessException ? 64 : ((Object) stateCaught_51 instanceof IllegalArgumentException ? 65 : ((Object) stateCaught_51 instanceof java.lang.reflect.InvocationTargetException ? 66 : ((Object) stateCaught_51 instanceof SecurityException ? 67 : ((Object) stateCaught_51 instanceof IOException ? 68 : ((Object) stateCaught_51 instanceof NullPointerException ? 69 : ((Object) stateCaught_51 instanceof Exception ? 70 : 71)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            param1.a(1, -62);
                            param1.a(((Number) (var11)).longValue(), -16943);
                            if (var13 == 0) {
                                statePc = 72;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = ((Object) stateCaught_52 instanceof ClassNotFoundException ? 60 : ((Object) stateCaught_52 instanceof InvalidClassException ? 61 : ((Object) stateCaught_52 instanceof StreamCorruptedException ? 62 : ((Object) stateCaught_52 instanceof OptionalDataException ? 63 : ((Object) stateCaught_52 instanceof IllegalAccessException ? 64 : ((Object) stateCaught_52 instanceof IllegalArgumentException ? 65 : ((Object) stateCaught_52 instanceof java.lang.reflect.InvocationTargetException ? 66 : ((Object) stateCaught_52 instanceof SecurityException ? 67 : ((Object) stateCaught_52 instanceof IOException ? 68 : ((Object) stateCaught_52 instanceof NullPointerException ? 69 : ((Object) stateCaught_52 instanceof Exception ? 70 : 71)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = ((Object) stateCaught_53 instanceof ClassNotFoundException ? 60 : ((Object) stateCaught_53 instanceof InvalidClassException ? 61 : ((Object) stateCaught_53 instanceof StreamCorruptedException ? 62 : ((Object) stateCaught_53 instanceof OptionalDataException ? 63 : ((Object) stateCaught_53 instanceof IllegalAccessException ? 64 : ((Object) stateCaught_53 instanceof IllegalArgumentException ? 65 : ((Object) stateCaught_53 instanceof java.lang.reflect.InvocationTargetException ? 66 : ((Object) stateCaught_53 instanceof SecurityException ? 67 : ((Object) stateCaught_53 instanceof IOException ? 68 : ((Object) stateCaught_53 instanceof NullPointerException ? 69 : ((Object) stateCaught_53 instanceof Exception ? 70 : 71)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            if (var11 instanceof String) {
                                statePc = 56;
                            } else {
                                statePc = 55;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = ((Object) stateCaught_54 instanceof ClassNotFoundException ? 60 : ((Object) stateCaught_54 instanceof InvalidClassException ? 61 : ((Object) stateCaught_54 instanceof StreamCorruptedException ? 62 : ((Object) stateCaught_54 instanceof OptionalDataException ? 63 : ((Object) stateCaught_54 instanceof IllegalAccessException ? 64 : ((Object) stateCaught_54 instanceof IllegalArgumentException ? 65 : ((Object) stateCaught_54 instanceof java.lang.reflect.InvocationTargetException ? 66 : ((Object) stateCaught_54 instanceof SecurityException ? 67 : ((Object) stateCaught_54 instanceof IOException ? 68 : ((Object) stateCaught_54 instanceof NullPointerException ? 69 : ((Object) stateCaught_54 instanceof Exception ? 70 : 71)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            param1.a(4, -48);
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = ((Object) stateCaught_55 instanceof ClassNotFoundException ? 60 : ((Object) stateCaught_55 instanceof InvalidClassException ? 61 : ((Object) stateCaught_55 instanceof StreamCorruptedException ? 62 : ((Object) stateCaught_55 instanceof OptionalDataException ? 63 : ((Object) stateCaught_55 instanceof IllegalAccessException ? 64 : ((Object) stateCaught_55 instanceof IllegalArgumentException ? 65 : ((Object) stateCaught_55 instanceof java.lang.reflect.InvocationTargetException ? 66 : ((Object) stateCaught_55 instanceof SecurityException ? 67 : ((Object) stateCaught_55 instanceof IOException ? 68 : ((Object) stateCaught_55 instanceof NullPointerException ? 69 : ((Object) stateCaught_55 instanceof Exception ? 70 : 71)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            param1.a(2, -26);
                            param1.a((String) (var11), -6528);
                            if (var13 == 0) {
                                statePc = 72;
                            } else {
                                statePc = 57;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = ((Object) stateCaught_56 instanceof ClassNotFoundException ? 60 : ((Object) stateCaught_56 instanceof InvalidClassException ? 61 : ((Object) stateCaught_56 instanceof StreamCorruptedException ? 62 : ((Object) stateCaught_56 instanceof OptionalDataException ? 63 : ((Object) stateCaught_56 instanceof IllegalAccessException ? 64 : ((Object) stateCaught_56 instanceof IllegalArgumentException ? 65 : ((Object) stateCaught_56 instanceof java.lang.reflect.InvocationTargetException ? 66 : ((Object) stateCaught_56 instanceof SecurityException ? 67 : ((Object) stateCaught_56 instanceof IOException ? 68 : ((Object) stateCaught_56 instanceof NullPointerException ? 69 : ((Object) stateCaught_56 instanceof Exception ? 70 : 71)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = ((Object) stateCaught_57 instanceof ClassNotFoundException ? 60 : ((Object) stateCaught_57 instanceof InvalidClassException ? 61 : ((Object) stateCaught_57 instanceof StreamCorruptedException ? 62 : ((Object) stateCaught_57 instanceof OptionalDataException ? 63 : ((Object) stateCaught_57 instanceof IllegalAccessException ? 64 : ((Object) stateCaught_57 instanceof IllegalArgumentException ? 65 : ((Object) stateCaught_57 instanceof java.lang.reflect.InvocationTargetException ? 66 : ((Object) stateCaught_57 instanceof SecurityException ? 67 : ((Object) stateCaught_57 instanceof IOException ? 68 : ((Object) stateCaught_57 instanceof NullPointerException ? 69 : ((Object) stateCaught_57 instanceof Exception ? 70 : 71)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            param1.a(4, -48);
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = ((Object) stateCaught_58 instanceof ClassNotFoundException ? 60 : ((Object) stateCaught_58 instanceof InvalidClassException ? 61 : ((Object) stateCaught_58 instanceof StreamCorruptedException ? 62 : ((Object) stateCaught_58 instanceof OptionalDataException ? 63 : ((Object) stateCaught_58 instanceof IllegalAccessException ? 64 : ((Object) stateCaught_58 instanceof IllegalArgumentException ? 65 : ((Object) stateCaught_58 instanceof java.lang.reflect.InvocationTargetException ? 66 : ((Object) stateCaught_58 instanceof SecurityException ? 67 : ((Object) stateCaught_58 instanceof IOException ? 68 : ((Object) stateCaught_58 instanceof NullPointerException ? 69 : ((Object) stateCaught_58 instanceof Exception ? 70 : 71)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            var7 = (ClassNotFoundException) ((Object) caughtException);
                            param1.a(-10, -16);
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            var7_ref = (InvalidClassException) ((Object) caughtException);
                            param1.a(-11, -119);
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            var7_ref2 = (StreamCorruptedException) ((Object) caughtException);
                            param1.a(-12, -123);
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            var7_ref3 = (OptionalDataException) ((Object) caughtException);
                            param1.a(-13, -9);
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            var7_ref4 = (IllegalAccessException) ((Object) caughtException);
                            param1.a(-14, -99);
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            var7_ref5 = (IllegalArgumentException) ((Object) caughtException);
                            param1.a(-15, -86);
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            var7_ref6 = (java.lang.reflect.InvocationTargetException) ((Object) caughtException);
                            param1.a(-16, -73);
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            var7_ref7 = (SecurityException) ((Object) caughtException);
                            param1.a(-17, -58);
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            var7_ref8 = (IOException) ((Object) caughtException);
                            param1.a(-18, -96);
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            var7_ref9 = (NullPointerException) ((Object) caughtException);
                            param1.a(-19, -7);
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            var7_ref10 = (Exception) ((Object) caughtException);
                            param1.a(-20, -108);
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            var7_ref11 = caughtException;
                            param1.a(-21, -71);
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            var6++;
                            if (var13 == 0) {
                                statePc = 28;
                            } else {
                                statePc = 73;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            stackIn_74_0 = param1.e(-18951, var5);
                            statePc = 74;
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            var18.b(57);
                            statePc = 75;
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        return;
                    }
                    case 76: {
                        var2 = (RuntimeException) ((Object) caughtException);
                        stackIn_78_0 = (RuntimeException) (var2);
                        stackIn_77_0 = stackIn_78_0;
                        stackIn_78_1 = new StringBuilder().append("dk.A(").append(param0).append(',');
                        stackIn_77_1 = stackIn_78_1;
                        if (param1 == null) {
                            statePc = 78;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    }
                    case 77: {
                        stackIn_79_0 = (RuntimeException) ((Object) stackIn_77_0);
                        stackIn_79_1 = (StringBuilder) ((Object) stackIn_77_1);
                        stackIn_79_2 = "{...}";
                        statePc = 79;
                        continue stateLoop;
                    }
                    case 78: {
                        stackIn_79_0 = (RuntimeException) ((Object) stackIn_78_0);
                        stackIn_79_1 = (StringBuilder) ((Object) stackIn_78_1);
                        stackIn_79_2 = "null";
                        statePc = 79;
                        continue stateLoop;
                    }
                    case 79: {
                        throw dd.a((Throwable) ((Object) stackIn_79_0), stackIn_79_2 + ')');
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
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 5408) {
                break L1;
              } else {
                dk.a(-113);
                break L1;
              }
            }
            stackIn_3_0 = tj.a(false, param1 + -5408, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("dk.D(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static boolean a(int param0, ki param1, ki param2, ki param3) {
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param1.b(-1)) {
                break L1;
              } else {
                if (!param1.b((byte) 104, "commonui")) {
                  break L1;
                } else {
                  L2: {
                    if (param0 == 1) {
                      break L2;
                    } else {
                      field_a = -12;
                      break L2;
                    }
                  }
                  L3: {
                    if (!param3.b(-1)) {
                      break L3;
                    } else {
                      if (!param3.b((byte) 92, "commonui")) {
                        break L3;
                      } else {
                        if (!param2.b(param0 + -2)) {
                          stackIn_16_0 = 0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          if (param2.b((byte) -110, "button.gif")) {
                            stackIn_18_0 = 1;
                            decompiledRegionSelector0 = 3;
                            break L0;
                          } else {
                            return false;
                          }
                        }
                      }
                    }
                  }
                  stackIn_11_0 = 0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            stackIn_4_0 = 0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var4);

            stackIn_21_1 = new StringBuilder().append("dk.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L4;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param2 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L5;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');

            if (param3 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L6;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L6;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_22_0), stackIn_28_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0 != 0;
            } else {
              return stackIn_18_0 != 0;
            }
          }
        }
    }

    static {
        field_b = "End Game";
    }
}
