/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kf extends lh {
    static int field_k;
    static String field_l;
    static dd field_i;
    static String field_j;

    private kf() throws Throwable {
        throw new Error();
    }

    final static String a(boolean param0, int param1, boolean param2, boolean param3) {
        int var4;
        L0: {
          var4 = 0;
          if (param3) {
            var4 += 4;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param0) {
            var4 += 2;
            break L1;
          } else {
            break L1;
          }
        }
        if (!param2) {
          if (param1 >= -110) {
            field_l = (String) null;
            return s.field_c[var4];
          } else {
            return s.field_c[var4];
          }
        } else {
          var4++;
          if (param1 < -110) {
            return s.field_c[var4];
          } else {
            field_l = (String) null;
            return s.field_c[var4];
          }
        }
    }

    final static void a(ni param0, int param1, int param2, ce param3) {
        try {
            byte[] array$0 = null;
            RuntimeException stackIn_45_0 = null;
            StringBuilder stackIn_45_1 = null;
            RuntimeException stackIn_46_0 = null;
            StringBuilder stackIn_46_1 = null;
            RuntimeException stackIn_47_0 = null;
            StringBuilder stackIn_47_1 = null;
            String stackIn_47_2 = null;
            RuntimeException stackIn_48_0 = null;
            StringBuilder stackIn_48_1 = null;
            RuntimeException stackIn_49_0 = null;
            StringBuilder stackIn_49_1 = null;
            RuntimeException stackIn_50_0 = null;
            StringBuilder stackIn_50_1 = null;
            String stackIn_50_2 = null;
            int decompiledRegionSelector0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            RuntimeException var4 = null;
            int var5 = 0;
            int var6_int = 0;
            ClassNotFoundException var6 = null;
            SecurityException var6_ref = null;
            NullPointerException var6_ref2 = null;
            Exception var6_ref3 = null;
            Throwable var6_ref4 = null;
            String var8 = null;
            int var9 = 0;
            String[] var10 = null;
            int var11_int = 0;
            byte[][] var11 = null;
            int var12_int = 0;
            Class[] var12 = null;
            int var13 = 0;
            int var14 = 0;
            fg var15 = null;
            byte[][] var16 = null;
            String var17 = null;
            String var18 = null;
            byte[][] var19 = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var14 = fleas.field_A ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var15 = new fg();
                            var15.field_k = param0.e(false);
                            var15.field_v = param0.c((byte) 126);
                            var15.field_w = new byte[var15.field_k][][];
                            var15.field_p = new int[var15.field_k];
                            var15.field_o = new int[var15.field_k];
                            var15.field_n = new od[var15.field_k];
                            var15.field_r = new int[var15.field_k];
                            var15.field_s = new od[var15.field_k];
                            if (param1 == -3) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            kf.a(-63);
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var5 = 0;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (var15.field_k <= var5) {
                                statePc = 42;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var6_int = param0.e(false);
                            if (var14 != 0) {
                                statePc = 51;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = ((Object) stateCaught_5 instanceof ClassNotFoundException ? 36 : ((Object) stateCaught_5 instanceof SecurityException ? 37 : ((Object) stateCaught_5 instanceof NullPointerException ? 38 : ((Object) stateCaught_5 instanceof Exception ? 39 : 40))));
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (var6_int == 0) {
                                statePc = 31;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = ((Object) stateCaught_6 instanceof ClassNotFoundException ? 36 : ((Object) stateCaught_6 instanceof SecurityException ? 37 : ((Object) stateCaught_6 instanceof NullPointerException ? 38 : ((Object) stateCaught_6 instanceof Exception ? 39 : 40))));
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (-2 == (var6_int ^ -1)) {
                                statePc = 31;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = ((Object) stateCaught_7 instanceof ClassNotFoundException ? 36 : ((Object) stateCaught_7 instanceof SecurityException ? 37 : ((Object) stateCaught_7 instanceof NullPointerException ? 38 : ((Object) stateCaught_7 instanceof Exception ? 39 : 40))));
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if ((var6_int ^ -1) == -3) {
                                statePc = 31;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = ((Object) stateCaught_8 instanceof ClassNotFoundException ? 36 : ((Object) stateCaught_8 instanceof SecurityException ? 37 : ((Object) stateCaught_8 instanceof NullPointerException ? 38 : ((Object) stateCaught_8 instanceof Exception ? 39 : 40))));
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            if ((var6_int ^ -1) == -4) {
                                statePc = 12;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = ((Object) stateCaught_9 instanceof ClassNotFoundException ? 36 : ((Object) stateCaught_9 instanceof SecurityException ? 37 : ((Object) stateCaught_9 instanceof NullPointerException ? 38 : ((Object) stateCaught_9 instanceof Exception ? 39 : 40))));
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            if (4 == var6_int) {
                                statePc = 12;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = ((Object) stateCaught_10 instanceof ClassNotFoundException ? 36 : ((Object) stateCaught_10 instanceof SecurityException ? 37 : ((Object) stateCaught_10 instanceof NullPointerException ? 38 : ((Object) stateCaught_10 instanceof Exception ? 39 : 40))));
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = ((Object) stateCaught_11 instanceof ClassNotFoundException ? 36 : ((Object) stateCaught_11 instanceof SecurityException ? 37 : ((Object) stateCaught_11 instanceof NullPointerException ? 38 : ((Object) stateCaught_11 instanceof Exception ? 39 : 40))));
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            var17 = param0.h(0);
                            var8 = param0.h(0);
                            var9 = param0.e(false);
                            var10 = new String[var9];
                            var11_int = 0;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = ((Object) stateCaught_12 instanceof ClassNotFoundException ? 36 : ((Object) stateCaught_12 instanceof SecurityException ? 37 : ((Object) stateCaught_12 instanceof NullPointerException ? 38 : ((Object) stateCaught_12 instanceof Exception ? 39 : 40))));
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            if (var9 <= var11_int) {
                                statePc = 17;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = ((Object) stateCaught_13 instanceof ClassNotFoundException ? 36 : ((Object) stateCaught_13 instanceof SecurityException ? 37 : ((Object) stateCaught_13 instanceof NullPointerException ? 38 : ((Object) stateCaught_13 instanceof Exception ? 39 : 40))));
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            var10[var11_int] = param0.h(df.a(param1, -3));
                            var11_int++;
                            if (var14 != 0) {
                                statePc = 41;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = ((Object) stateCaught_14 instanceof ClassNotFoundException ? 36 : ((Object) stateCaught_14 instanceof SecurityException ? 37 : ((Object) stateCaught_14 instanceof NullPointerException ? 38 : ((Object) stateCaught_14 instanceof Exception ? 39 : 40))));
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (var14 == 0) {
                                statePc = 13;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = ((Object) stateCaught_15 instanceof ClassNotFoundException ? 36 : ((Object) stateCaught_15 instanceof SecurityException ? 37 : ((Object) stateCaught_15 instanceof NullPointerException ? 38 : ((Object) stateCaught_15 instanceof Exception ? 39 : 40))));
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = ((Object) stateCaught_16 instanceof ClassNotFoundException ? 36 : ((Object) stateCaught_16 instanceof SecurityException ? 37 : ((Object) stateCaught_16 instanceof NullPointerException ? 38 : ((Object) stateCaught_16 instanceof Exception ? 39 : 40))));
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            var19 = new byte[var9][];
                            var16 = var19;
                            var11 = var16;
                            if (var6_int != 3) {
                                statePc = 23;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = ((Object) stateCaught_17 instanceof ClassNotFoundException ? 36 : ((Object) stateCaught_17 instanceof SecurityException ? 37 : ((Object) stateCaught_17 instanceof NullPointerException ? 38 : ((Object) stateCaught_17 instanceof Exception ? 39 : 40))));
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            var12_int = 0;
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = ((Object) stateCaught_18 instanceof ClassNotFoundException ? 36 : ((Object) stateCaught_18 instanceof SecurityException ? 37 : ((Object) stateCaught_18 instanceof NullPointerException ? 38 : ((Object) stateCaught_18 instanceof Exception ? 39 : 40))));
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (var12_int >= var9) {
                                statePc = 23;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = ((Object) stateCaught_19 instanceof ClassNotFoundException ? 36 : ((Object) stateCaught_19 instanceof SecurityException ? 37 : ((Object) stateCaught_19 instanceof NullPointerException ? 38 : ((Object) stateCaught_19 instanceof Exception ? 39 : 40))));
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            var13 = param0.c((byte) -92);
                            array$0 = new byte[var13];
                            var11[var12_int] = array$0;
                            param0.b(var19[var12_int], 0, param1 + -103, var13);
                            var12_int++;
                            if (var14 != 0) {
                                statePc = 24;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = ((Object) stateCaught_20 instanceof ClassNotFoundException ? 36 : ((Object) stateCaught_20 instanceof SecurityException ? 37 : ((Object) stateCaught_20 instanceof NullPointerException ? 38 : ((Object) stateCaught_20 instanceof Exception ? 39 : 40))));
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (var14 == 0) {
                                statePc = 19;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = ((Object) stateCaught_21 instanceof ClassNotFoundException ? 36 : ((Object) stateCaught_21 instanceof SecurityException ? 37 : ((Object) stateCaught_21 instanceof NullPointerException ? 38 : ((Object) stateCaught_21 instanceof Exception ? 39 : 40))));
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = ((Object) stateCaught_22 instanceof ClassNotFoundException ? 36 : ((Object) stateCaught_22 instanceof SecurityException ? 37 : ((Object) stateCaught_22 instanceof NullPointerException ? 38 : ((Object) stateCaught_22 instanceof Exception ? 39 : 40))));
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            var15.field_o[var5] = var6_int;
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = ((Object) stateCaught_23 instanceof ClassNotFoundException ? 36 : ((Object) stateCaught_23 instanceof SecurityException ? 37 : ((Object) stateCaught_23 instanceof NullPointerException ? 38 : ((Object) stateCaught_23 instanceof Exception ? 39 : 40))));
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            var12 = new Class[var9];
                            var13 = 0;
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = ((Object) stateCaught_24 instanceof ClassNotFoundException ? 36 : ((Object) stateCaught_24 instanceof SecurityException ? 37 : ((Object) stateCaught_24 instanceof NullPointerException ? 38 : ((Object) stateCaught_24 instanceof Exception ? 39 : 40))));
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            if (var9 <= var13) {
                                statePc = 29;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = ((Object) stateCaught_25 instanceof ClassNotFoundException ? 36 : ((Object) stateCaught_25 instanceof SecurityException ? 37 : ((Object) stateCaught_25 instanceof NullPointerException ? 38 : ((Object) stateCaught_25 instanceof Exception ? 39 : 40))));
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            var12[var13] = nc.a((byte) -121, var10[var13]);
                            var13++;
                            if (var14 != 0) {
                                statePc = 30;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = ((Object) stateCaught_26 instanceof ClassNotFoundException ? 36 : ((Object) stateCaught_26 instanceof SecurityException ? 37 : ((Object) stateCaught_26 instanceof NullPointerException ? 38 : ((Object) stateCaught_26 instanceof Exception ? 39 : 40))));
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            if (var14 == 0) {
                                statePc = 25;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = ((Object) stateCaught_27 instanceof ClassNotFoundException ? 36 : ((Object) stateCaught_27 instanceof SecurityException ? 37 : ((Object) stateCaught_27 instanceof NullPointerException ? 38 : ((Object) stateCaught_27 instanceof Exception ? 39 : 40))));
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = ((Object) stateCaught_28 instanceof ClassNotFoundException ? 36 : ((Object) stateCaught_28 instanceof SecurityException ? 37 : ((Object) stateCaught_28 instanceof NullPointerException ? 38 : ((Object) stateCaught_28 instanceof Exception ? 39 : 40))));
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            var15.field_s[var5] = param3.a(var12, var8, nc.a((byte) -90, var17), 0);
                            var15.field_w[var5] = var19;
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = ((Object) stateCaught_29 instanceof ClassNotFoundException ? 36 : ((Object) stateCaught_29 instanceof SecurityException ? 37 : ((Object) stateCaught_29 instanceof NullPointerException ? 38 : ((Object) stateCaught_29 instanceof Exception ? 39 : 40))));
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if (var14 == 0) {
                                statePc = 41;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = ((Object) stateCaught_30 instanceof ClassNotFoundException ? 36 : ((Object) stateCaught_30 instanceof SecurityException ? 37 : ((Object) stateCaught_30 instanceof NullPointerException ? 38 : ((Object) stateCaught_30 instanceof Exception ? 39 : 40))));
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            var18 = param0.h(param1 + 3);
                            var8 = param0.h(0);
                            var9 = 0;
                            if ((var6_int ^ -1) == -2) {
                                statePc = 33;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = ((Object) stateCaught_31 instanceof ClassNotFoundException ? 36 : ((Object) stateCaught_31 instanceof SecurityException ? 37 : ((Object) stateCaught_31 instanceof NullPointerException ? 38 : ((Object) stateCaught_31 instanceof Exception ? 39 : 40))));
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = ((Object) stateCaught_32 instanceof ClassNotFoundException ? 36 : ((Object) stateCaught_32 instanceof SecurityException ? 37 : ((Object) stateCaught_32 instanceof NullPointerException ? 38 : ((Object) stateCaught_32 instanceof Exception ? 39 : 40))));
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            var9 = param0.c((byte) -120);
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = ((Object) stateCaught_33 instanceof ClassNotFoundException ? 36 : ((Object) stateCaught_33 instanceof SecurityException ? 37 : ((Object) stateCaught_33 instanceof NullPointerException ? 38 : ((Object) stateCaught_33 instanceof Exception ? 39 : 40))));
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            var15.field_o[var5] = var6_int;
                            var15.field_p[var5] = var9;
                            var15.field_n[var5] = param3.a((byte) 109, var8, nc.a((byte) -110, var18));
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = ((Object) stateCaught_34 instanceof ClassNotFoundException ? 36 : ((Object) stateCaught_34 instanceof SecurityException ? 37 : ((Object) stateCaught_34 instanceof NullPointerException ? 38 : ((Object) stateCaught_34 instanceof Exception ? 39 : 40))));
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            var6 = (ClassNotFoundException) ((Object) caughtException);
                            var15.field_r[var5] = -1;
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            var6_ref = (SecurityException) ((Object) caughtException);
                            var15.field_r[var5] = -2;
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            var6_ref2 = (NullPointerException) ((Object) caughtException);
                            var15.field_r[var5] = -3;
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            var6_ref3 = (Exception) ((Object) caughtException);
                            var15.field_r[var5] = -4;
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            var6_ref4 = caughtException;
                            var15.field_r[var5] = -5;
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            var5++;
                            if (var14 == 0) {
                                statePc = 4;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            jk.field_m.a(false, var15);
                            statePc = 51;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        var4 = (RuntimeException) ((Object) caughtException);
                        stackIn_46_0 = (RuntimeException) (var4);
                        stackIn_45_0 = stackIn_46_0;
                        stackIn_46_1 = new StringBuilder().append("kf.B(");
                        stackIn_45_1 = stackIn_46_1;
                        if (param0 == null) {
                            statePc = 46;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    }
                    case 45: {
                        stackIn_47_0 = (RuntimeException) ((Object) stackIn_45_0);
                        stackIn_47_1 = (StringBuilder) ((Object) stackIn_45_1);
                        stackIn_47_2 = "{...}";
                        statePc = 47;
                        continue stateLoop;
                    }
                    case 46: {
                        stackIn_47_0 = (RuntimeException) ((Object) stackIn_46_0);
                        stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
                        stackIn_47_2 = "null";
                        statePc = 47;
                        continue stateLoop;
                    }
                    case 47: {
                        stackIn_49_0 = (RuntimeException) ((Object) stackIn_47_0);
                        stackIn_48_0 = stackIn_49_0;
                        stackIn_49_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_47_2).append(',').append(param1).append(',').append(param2).append(',');
                        stackIn_48_1 = stackIn_49_1;
                        if (param3 == null) {
                            statePc = 49;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    }
                    case 48: {
                        stackIn_50_0 = (RuntimeException) ((Object) stackIn_48_0);
                        stackIn_50_1 = (StringBuilder) ((Object) stackIn_48_1);
                        stackIn_50_2 = "{...}";
                        statePc = 50;
                        continue stateLoop;
                    }
                    case 49: {
                        stackIn_50_0 = (RuntimeException) ((Object) stackIn_49_0);
                        stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
                        stackIn_50_2 = "null";
                        statePc = 50;
                        continue stateLoop;
                    }
                    case 50: {
                        throw pf.a((Throwable) ((Object) stackIn_50_0), stackIn_50_2 + ')');
                    }
                    case 51: {
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

    public static void a(int param0) {
        if (param0 > -88) {
          field_i = (dd) null;
          field_i = null;
          field_j = null;
          field_l = null;
          return;
        } else {
          field_i = null;
          field_j = null;
          field_l = null;
          return;
        }
    }

    static {
        field_k = 64;
        field_l = "Restart Level";
        field_j = "<%0>Exit:<%1> this is where you've got to get the fleas to";
    }
}
