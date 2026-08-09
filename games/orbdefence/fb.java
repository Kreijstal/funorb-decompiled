/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fb extends ca {
    static ba field_i;
    int field_h;
    int[] field_g;
    static int[] field_f;

    public static void a(byte param0) {
        field_f = null;
        if (param0 < 120) {
            field_i = (ba) null;
            field_i = null;
            return;
        }
        field_i = null;
    }

    final static String c(int param0) {
        if (param0 > -44) {
            field_i = (ba) null;
            return cd.field_t.g(2);
        }
        return cd.field_t.g(2);
    }

    final static v c(boolean param0) {
        if (param0) {
            return (v) null;
        }
        return vb.field_f;
    }

    final static void a(mg param0, int param1, int param2, be param3) {
        try {
            byte[] array$0 = null;
            RuntimeException stackIn_43_0 = null;
            StringBuilder stackIn_43_1 = null;
            RuntimeException stackIn_44_0 = null;
            StringBuilder stackIn_44_1 = null;
            RuntimeException stackIn_45_0 = null;
            StringBuilder stackIn_45_1 = null;
            String stackIn_45_2 = null;
            RuntimeException stackIn_46_0 = null;
            StringBuilder stackIn_46_1 = null;
            RuntimeException stackIn_47_0 = null;
            StringBuilder stackIn_47_1 = null;
            RuntimeException stackIn_48_0 = null;
            StringBuilder stackIn_48_1 = null;
            String stackIn_48_2 = null;
            int decompiledRegionSelector0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            RuntimeException var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7_int = 0;
            ClassNotFoundException var7 = null;
            SecurityException var7_ref = null;
            NullPointerException var7_ref2 = null;
            Exception var7_ref3 = null;
            Throwable var7_ref4 = null;
            String var9 = null;
            int var10 = 0;
            String[] var11 = null;
            int var12_int = 0;
            byte[][] var12 = null;
            int var13_int = 0;
            Class[] var13 = null;
            int var14 = 0;
            int var15 = 0;
            ud var16 = null;
            byte[][] var17 = null;
            String var18 = null;
            String var19 = null;
            String var20 = null;
            byte[][] var21 = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var15 = OrbDefence.field_D ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var16 = new ud();
                            var16.field_o = param0.b((byte) 90);
                            var16.field_k = param0.l(0);
                            var16.field_m = new int[var16.field_o];
                            var16.field_n = new int[var16.field_o];
                            var16.field_i = new eb[var16.field_o];
                            var16.field_g = new byte[var16.field_o][][];
                            var5 = 123 % ((param2 - 75) / 46);
                            var16.field_l = new int[var16.field_o];
                            var16.field_h = new eb[var16.field_o];
                            var6 = 0;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 42;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if (var16.field_o <= var6) {
                                statePc = 40;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 42;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var7_int = param0.b((byte) 90);
                            if (var15 != 0) {
                                statePc = 49;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = ((Object) stateCaught_3 instanceof ClassNotFoundException ? 34 : ((Object) stateCaught_3 instanceof SecurityException ? 35 : ((Object) stateCaught_3 instanceof NullPointerException ? 36 : ((Object) stateCaught_3 instanceof Exception ? 37 : 38))));
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (0 == var7_int) {
                                statePc = 29;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = ((Object) stateCaught_4 instanceof ClassNotFoundException ? 34 : ((Object) stateCaught_4 instanceof SecurityException ? 35 : ((Object) stateCaught_4 instanceof NullPointerException ? 36 : ((Object) stateCaught_4 instanceof Exception ? 37 : 38))));
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if ((var7_int ^ -1) == -2) {
                                statePc = 29;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = ((Object) stateCaught_5 instanceof ClassNotFoundException ? 34 : ((Object) stateCaught_5 instanceof SecurityException ? 35 : ((Object) stateCaught_5 instanceof NullPointerException ? 36 : ((Object) stateCaught_5 instanceof Exception ? 37 : 38))));
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if ((var7_int ^ -1) == -3) {
                                statePc = 29;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = ((Object) stateCaught_6 instanceof ClassNotFoundException ? 34 : ((Object) stateCaught_6 instanceof SecurityException ? 35 : ((Object) stateCaught_6 instanceof NullPointerException ? 36 : ((Object) stateCaught_6 instanceof Exception ? 37 : 38))));
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (3 == var7_int) {
                                statePc = 10;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = ((Object) stateCaught_7 instanceof ClassNotFoundException ? 34 : ((Object) stateCaught_7 instanceof SecurityException ? 35 : ((Object) stateCaught_7 instanceof NullPointerException ? 36 : ((Object) stateCaught_7 instanceof Exception ? 37 : 38))));
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if (4 == var7_int) {
                                statePc = 10;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = ((Object) stateCaught_8 instanceof ClassNotFoundException ? 34 : ((Object) stateCaught_8 instanceof SecurityException ? 35 : ((Object) stateCaught_8 instanceof NullPointerException ? 36 : ((Object) stateCaught_8 instanceof Exception ? 37 : 38))));
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            statePc = 39;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = ((Object) stateCaught_9 instanceof ClassNotFoundException ? 34 : ((Object) stateCaught_9 instanceof SecurityException ? 35 : ((Object) stateCaught_9 instanceof NullPointerException ? 36 : ((Object) stateCaught_9 instanceof Exception ? 37 : 38))));
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            var18 = param0.g(2);
                            var9 = param0.g(2);
                            var10 = param0.b((byte) 90);
                            var11 = new String[var10];
                            var12_int = 0;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = ((Object) stateCaught_10 instanceof ClassNotFoundException ? 34 : ((Object) stateCaught_10 instanceof SecurityException ? 35 : ((Object) stateCaught_10 instanceof NullPointerException ? 36 : ((Object) stateCaught_10 instanceof Exception ? 37 : 38))));
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            if (var12_int >= var10) {
                                statePc = 15;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = ((Object) stateCaught_11 instanceof ClassNotFoundException ? 34 : ((Object) stateCaught_11 instanceof SecurityException ? 35 : ((Object) stateCaught_11 instanceof NullPointerException ? 36 : ((Object) stateCaught_11 instanceof Exception ? 37 : 38))));
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            var11[var12_int] = param0.g(2);
                            var12_int++;
                            if (var15 != 0) {
                                statePc = 39;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = ((Object) stateCaught_12 instanceof ClassNotFoundException ? 34 : ((Object) stateCaught_12 instanceof SecurityException ? 35 : ((Object) stateCaught_12 instanceof NullPointerException ? 36 : ((Object) stateCaught_12 instanceof Exception ? 37 : 38))));
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            if (var15 == 0) {
                                statePc = 11;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = ((Object) stateCaught_13 instanceof ClassNotFoundException ? 34 : ((Object) stateCaught_13 instanceof SecurityException ? 35 : ((Object) stateCaught_13 instanceof NullPointerException ? 36 : ((Object) stateCaught_13 instanceof Exception ? 37 : 38))));
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = ((Object) stateCaught_14 instanceof ClassNotFoundException ? 34 : ((Object) stateCaught_14 instanceof SecurityException ? 35 : ((Object) stateCaught_14 instanceof NullPointerException ? 36 : ((Object) stateCaught_14 instanceof Exception ? 37 : 38))));
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            var21 = new byte[var10][];
                            var17 = var21;
                            var12 = var17;
                            if ((var7_int ^ -1) != -4) {
                                statePc = 21;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = ((Object) stateCaught_15 instanceof ClassNotFoundException ? 34 : ((Object) stateCaught_15 instanceof SecurityException ? 35 : ((Object) stateCaught_15 instanceof NullPointerException ? 36 : ((Object) stateCaught_15 instanceof Exception ? 37 : 38))));
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            var13_int = 0;
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = ((Object) stateCaught_16 instanceof ClassNotFoundException ? 34 : ((Object) stateCaught_16 instanceof SecurityException ? 35 : ((Object) stateCaught_16 instanceof NullPointerException ? 36 : ((Object) stateCaught_16 instanceof Exception ? 37 : 38))));
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (var13_int >= var10) {
                                statePc = 21;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = ((Object) stateCaught_17 instanceof ClassNotFoundException ? 34 : ((Object) stateCaught_17 instanceof SecurityException ? 35 : ((Object) stateCaught_17 instanceof NullPointerException ? 36 : ((Object) stateCaught_17 instanceof Exception ? 37 : 38))));
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            var14 = param0.l(0);
                            array$0 = new byte[var14];
                            var12[var13_int] = array$0;
                            param0.a((byte) 115, var21[var13_int], 0, var14);
                            var13_int++;
                            if (var15 != 0) {
                                statePc = 22;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = ((Object) stateCaught_18 instanceof ClassNotFoundException ? 34 : ((Object) stateCaught_18 instanceof SecurityException ? 35 : ((Object) stateCaught_18 instanceof NullPointerException ? 36 : ((Object) stateCaught_18 instanceof Exception ? 37 : 38))));
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (var15 == 0) {
                                statePc = 17;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = ((Object) stateCaught_19 instanceof ClassNotFoundException ? 34 : ((Object) stateCaught_19 instanceof SecurityException ? 35 : ((Object) stateCaught_19 instanceof NullPointerException ? 36 : ((Object) stateCaught_19 instanceof Exception ? 37 : 38))));
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = ((Object) stateCaught_20 instanceof ClassNotFoundException ? 34 : ((Object) stateCaught_20 instanceof SecurityException ? 35 : ((Object) stateCaught_20 instanceof NullPointerException ? 36 : ((Object) stateCaught_20 instanceof Exception ? 37 : 38))));
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            var16.field_l[var6] = var7_int;
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = ((Object) stateCaught_21 instanceof ClassNotFoundException ? 34 : ((Object) stateCaught_21 instanceof SecurityException ? 35 : ((Object) stateCaught_21 instanceof NullPointerException ? 36 : ((Object) stateCaught_21 instanceof Exception ? 37 : 38))));
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            var13 = new Class[var10];
                            var14 = 0;
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = ((Object) stateCaught_22 instanceof ClassNotFoundException ? 34 : ((Object) stateCaught_22 instanceof SecurityException ? 35 : ((Object) stateCaught_22 instanceof NullPointerException ? 36 : ((Object) stateCaught_22 instanceof Exception ? 37 : 38))));
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (var14 >= var10) {
                                statePc = 27;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = ((Object) stateCaught_23 instanceof ClassNotFoundException ? 34 : ((Object) stateCaught_23 instanceof SecurityException ? 35 : ((Object) stateCaught_23 instanceof NullPointerException ? 36 : ((Object) stateCaught_23 instanceof Exception ? 37 : 38))));
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            var13[var14] = ie.a(var11[var14], 73);
                            var14++;
                            if (var15 != 0) {
                                statePc = 28;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = ((Object) stateCaught_24 instanceof ClassNotFoundException ? 34 : ((Object) stateCaught_24 instanceof SecurityException ? 35 : ((Object) stateCaught_24 instanceof NullPointerException ? 36 : ((Object) stateCaught_24 instanceof Exception ? 37 : 38))));
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            if (var15 == 0) {
                                statePc = 23;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = ((Object) stateCaught_25 instanceof ClassNotFoundException ? 34 : ((Object) stateCaught_25 instanceof SecurityException ? 35 : ((Object) stateCaught_25 instanceof NullPointerException ? 36 : ((Object) stateCaught_25 instanceof Exception ? 37 : 38))));
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = ((Object) stateCaught_26 instanceof ClassNotFoundException ? 34 : ((Object) stateCaught_26 instanceof SecurityException ? 35 : ((Object) stateCaught_26 instanceof NullPointerException ? 36 : ((Object) stateCaught_26 instanceof Exception ? 37 : 38))));
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var16.field_i[var6] = param3.a(var13, -334290960, var9, ie.a(var18, 64));
                            var16.field_g[var6] = var21;
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = ((Object) stateCaught_27 instanceof ClassNotFoundException ? 34 : ((Object) stateCaught_27 instanceof SecurityException ? 35 : ((Object) stateCaught_27 instanceof NullPointerException ? 36 : ((Object) stateCaught_27 instanceof Exception ? 37 : 38))));
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            if (var15 == 0) {
                                statePc = 39;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = ((Object) stateCaught_28 instanceof ClassNotFoundException ? 34 : ((Object) stateCaught_28 instanceof SecurityException ? 35 : ((Object) stateCaught_28 instanceof NullPointerException ? 36 : ((Object) stateCaught_28 instanceof Exception ? 37 : 38))));
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            var19 = param0.g(2);
                            var20 = param0.g(2);
                            var10 = 0;
                            if (-2 == (var7_int ^ -1)) {
                                statePc = 31;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = ((Object) stateCaught_29 instanceof ClassNotFoundException ? 34 : ((Object) stateCaught_29 instanceof SecurityException ? 35 : ((Object) stateCaught_29 instanceof NullPointerException ? 36 : ((Object) stateCaught_29 instanceof Exception ? 37 : 38))));
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = ((Object) stateCaught_30 instanceof ClassNotFoundException ? 34 : ((Object) stateCaught_30 instanceof SecurityException ? 35 : ((Object) stateCaught_30 instanceof NullPointerException ? 36 : ((Object) stateCaught_30 instanceof Exception ? 37 : 38))));
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            var10 = param0.l(0);
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = ((Object) stateCaught_31 instanceof ClassNotFoundException ? 34 : ((Object) stateCaught_31 instanceof SecurityException ? 35 : ((Object) stateCaught_31 instanceof NullPointerException ? 36 : ((Object) stateCaught_31 instanceof Exception ? 37 : 38))));
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            var16.field_l[var6] = var7_int;
                            var16.field_n[var6] = var10;
                            var16.field_h[var6] = param3.a(ie.a(var19, 43), var20, -128);
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = ((Object) stateCaught_32 instanceof ClassNotFoundException ? 34 : ((Object) stateCaught_32 instanceof SecurityException ? 35 : ((Object) stateCaught_32 instanceof NullPointerException ? 36 : ((Object) stateCaught_32 instanceof Exception ? 37 : 38))));
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            statePc = 39;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 42;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            var7 = (ClassNotFoundException) ((Object) caughtException);
                            var16.field_m[var6] = -1;
                            statePc = 39;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 42;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            var7_ref = (SecurityException) ((Object) caughtException);
                            var16.field_m[var6] = -2;
                            statePc = 39;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 42;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            var7_ref2 = (NullPointerException) ((Object) caughtException);
                            var16.field_m[var6] = -3;
                            statePc = 39;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 42;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            var7_ref3 = (Exception) ((Object) caughtException);
                            var16.field_m[var6] = -4;
                            statePc = 39;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 42;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            var7_ref4 = caughtException;
                            var16.field_m[var6] = -5;
                            statePc = 39;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 42;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            var6++;
                            if (var15 == 0) {
                                statePc = 2;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 42;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            ab.field_h.a(-78, var16);
                            statePc = 49;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 42;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        var4 = (RuntimeException) ((Object) caughtException);
                        stackIn_44_0 = (RuntimeException) (var4);
                        stackIn_43_0 = stackIn_44_0;
                        stackIn_44_1 = new StringBuilder().append("fb.B(");
                        stackIn_43_1 = stackIn_44_1;
                        if (param0 == null) {
                            statePc = 44;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    }
                    case 43: {
                        stackIn_45_0 = (RuntimeException) ((Object) stackIn_43_0);
                        stackIn_45_1 = (StringBuilder) ((Object) stackIn_43_1);
                        stackIn_45_2 = "{...}";
                        statePc = 45;
                        continue stateLoop;
                    }
                    case 44: {
                        stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
                        stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
                        stackIn_45_2 = "null";
                        statePc = 45;
                        continue stateLoop;
                    }
                    case 45: {
                        stackIn_47_0 = (RuntimeException) ((Object) stackIn_45_0);
                        stackIn_46_0 = stackIn_47_0;
                        stackIn_47_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_45_2).append(',').append(param1).append(',').append(param2).append(',');
                        stackIn_46_1 = stackIn_47_1;
                        if (param3 == null) {
                            statePc = 47;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    }
                    case 46: {
                        stackIn_48_0 = (RuntimeException) ((Object) stackIn_46_0);
                        stackIn_48_1 = (StringBuilder) ((Object) stackIn_46_1);
                        stackIn_48_2 = "{...}";
                        statePc = 48;
                        continue stateLoop;
                    }
                    case 47: {
                        stackIn_48_0 = (RuntimeException) ((Object) stackIn_47_0);
                        stackIn_48_1 = (StringBuilder) ((Object) stackIn_47_1);
                        stackIn_48_2 = "null";
                        statePc = 48;
                        continue stateLoop;
                    }
                    case 48: {
                        throw dd.a((Throwable) ((Object) stackIn_48_0), stackIn_48_2 + ')');
                    }
                    case 49: {
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

    final static void a(int param0, ki param1) {
        nj var2 = null;
        try {
            if (param0 != -2) {
                fb.c(-98);
            }
            nj.b(param1.a("", 1, "headers.packvorbis"));
            var2 = nj.a(param1, "jagex logo2.packvorbis", "");
            var2.a();
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "fb.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static ee b(byte param0) {
        String var1;
        if (param0 >= -9) {
          L0: {
            field_i = (ba) null;
            var1 = am.b(114);
            if (var1 == null) {
              break L0;
            } else {
              if (-1 < (var1.indexOf('@') ^ -1)) {
                break L0;
              } else {
                var1 = "";
                break L0;
              }
            }
          }
          return new ee(am.b(-31), ui.a(true));
        } else {
          L1: {
            var1 = am.b(114);
            if (var1 == null) {
              break L1;
            } else {
              if (-1 < (var1.indexOf('@') ^ -1)) {
                break L1;
              } else {
                var1 = "";
                break L1;
              }
            }
          }
          return new ee(am.b(-31), ui.a(true));
        }
    }

    private fb() throws Throwable {
        throw new Error();
    }

    static {
        field_i = new ba(1, 2, 2, 0);
    }
}
