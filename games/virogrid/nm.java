/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class nm {
    static char field_d;
    static int[] field_a;
    static int field_b;
    static String field_c;

    final static boolean c() {
        return 250 < kf.field_e;
    }

    public static void a() {
        field_c = null;
        field_a = null;
    }

    final static void b(int param0) {
        la.field_n = false;
        rj.field_d = null;
        de.field_rb = null;
        if (param0 != 1) {
            Object var2 = null;
            nm.a((byte[]) null, (rm[]) null, (int[]) null, (String[][]) null, (byte[]) null, (eh) null, 27, (String[]) null, (String[][]) null, (mg[][]) null, true, (mg[][]) null, -1, (int[]) null, (byte) -43, (String[]) null, (eh) null, (eh) null, 123);
        }
        eh.field_j = null;
        dh.field_o = null;
    }

    final static boolean a(java.applet.Applet param0) {
        try {
            String var2 = null;
            Throwable var2_ref = null;
            RuntimeException var2_ref2 = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_3_0 = 0;
            int stackIn_9_0 = 0;
            int stackIn_16_0 = 0;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            int stackOut_2_0 = 0;
            int stackOut_8_0 = 0;
            int stackOut_14_0 = 0;
            int stackOut_15_0 = 0;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            String stackOut_19_2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var7 = Virogrid.field_F ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (!af.field_i) {
                                statePc = 4;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            stackOut_2_0 = 1;
                            stackIn_3_0 = stackOut_2_0;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        return stackIn_3_0 != 0;
                    }
                    case 4: {
                        try {
                            var2 = "tuhstatbut";
                            var3 = (String) q.b("getcookies", 6168, param0);
                            var4 = ql.a(var3, (byte) -123, ';');
                            var5 = 0;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (var4.length <= var5) {
                                statePc = 13;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var6 = var4[var5].indexOf('=');
                            if (var6 < 0) {
                                statePc = 10;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (!var4[var5].substring(0, var6).trim().equals((Object) (Object) var2)) {
                                statePc = 10;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            stackOut_8_0 = 1;
                            stackIn_9_0 = stackOut_8_0;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        return stackIn_9_0 != 0;
                    }
                    case 10: {
                        try {
                            var5++;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            var2_ref = caughtException;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            if (null == param0.getParameter("tuhstatbut")) {
                                statePc = 15;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            stackOut_14_0 = 1;
                            stackIn_16_0 = stackOut_14_0;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            stackOut_15_0 = 0;
                            stackIn_16_0 = stackOut_15_0;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        return stackIn_16_0 != 0;
                    }
                    case 17: {
                        var2_ref2 = (RuntimeException) (Object) caughtException;
                        stackOut_17_0 = (RuntimeException) var2_ref2;
                        stackOut_17_1 = new StringBuilder().append("nm.E(");
                        stackIn_19_0 = stackOut_17_0;
                        stackIn_19_1 = stackOut_17_1;
                        stackIn_18_0 = stackOut_17_0;
                        stackIn_18_1 = stackOut_17_1;
                        if (param0 == null) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 18: {
                        stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                        stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
                        stackOut_18_2 = "{...}";
                        stackIn_20_0 = stackOut_18_0;
                        stackIn_20_1 = stackOut_18_1;
                        stackIn_20_2 = stackOut_18_2;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 19: {
                        stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
                        stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
                        stackOut_19_2 = "null";
                        stackIn_20_0 = stackOut_19_0;
                        stackIn_20_1 = stackOut_19_1;
                        stackIn_20_2 = stackOut_19_2;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 20: {
                        throw kg.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + 123 + 41);
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

    final static void a(byte[] param0, rm[] param1, int[] param2, String[][] param3, byte[] param4, eh param5, int param6, String[] param7, String[][] param8, mg[][] param9, boolean param10, mg[][] param11, int param12, int[] param13, byte param14, String[] param15, eh param16, eh param17, int param18) {
        RuntimeException var19 = null;
        Object var20 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        try {
          L0: {
            L1: {
              if (param14 <= -65) {
                break L1;
              } else {
                nm.a(true, -102, (byte) 44);
                break L1;
              }
            }
            var20 = null;
            jg.a(param7, (String[]) null, param8, param0, param16, param11, param3, param4, param12, 1, param10, param1, param18, param5, param2, param17, (byte) 99, param13, param15, param9);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var19 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var19;
            stackOut_4_1 = new StringBuilder().append("nm.C(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          L6: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param4 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          L7: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param5 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          L8: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(44).append(param6).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param7 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          L9: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(44);
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param8 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L9;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L9;
            }
          }
          L10: {
            stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(44);
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param9 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L10;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L10;
            }
          }
          L11: {
            stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(44).append(param10).append(44);
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param11 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L11;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L11;
            }
          }
          L12: {
            stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
            stackOut_34_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(44).append(param12).append(44);
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param13 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L12;
            } else {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L12;
            }
          }
          L13: {
            stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
            stackOut_37_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_37_2).append(44).append(param14).append(44);
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param15 == null) {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L13;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L13;
            }
          }
          L14: {
            stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
            stackOut_40_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_40_2).append(44);
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param16 == null) {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L14;
            } else {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "{...}";
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              stackIn_43_2 = stackOut_41_2;
              break L14;
            }
          }
          L15: {
            stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
            stackOut_43_1 = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_43_2).append(44);
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param17 == null) {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L15;
            } else {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "{...}";
              stackIn_46_0 = stackOut_44_0;
              stackIn_46_1 = stackOut_44_1;
              stackIn_46_2 = stackOut_44_2;
              break L15;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_46_0, stackIn_46_2 + 44 + param18 + 41);
        }
    }

    final static void a(boolean param0, int param1, byte param2) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String[] var11 = null;
        String[] var12 = null;
        String var13 = null;
        String var14 = null;
        int stackIn_51_0 = 0;
        int stackIn_54_0 = 0;
        String[] stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        String[] stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        String[] stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        String stackIn_62_2 = null;
        String[] stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        String[] stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        String[] stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        String stackIn_68_2 = null;
        int stackIn_87_0 = 0;
        int stackIn_88_0 = 0;
        int stackIn_89_0 = 0;
        int stackIn_89_1 = 0;
        int stackIn_105_0 = 0;
        int stackIn_106_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_107_1 = 0;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_52_0 = 0;
        String[] stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        String[] stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        String stackOut_67_2 = null;
        String[] stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        String stackOut_66_2 = null;
        String[] stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        String[] stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        String stackOut_61_2 = null;
        String[] stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        String stackOut_60_2 = null;
        int stackOut_104_0 = 0;
        int stackOut_106_0 = 0;
        int stackOut_106_1 = 0;
        int stackOut_105_0 = 0;
        int stackOut_105_1 = 0;
        int stackOut_86_0 = 0;
        int stackOut_88_0 = 0;
        int stackOut_88_1 = 0;
        int stackOut_87_0 = 0;
        int stackOut_87_1 = 0;
        L0: {
          var10 = Virogrid.field_F ? 1 : 0;
          p.field_d = param1;
          var3_int = 120 / ((-14 - param2) / 41);
          la.field_n = true;
          if (p.field_d == 0) {
            var4 = sf.a((byte) 124, re.field_n, j.field_h, rf.field_b, fb.field_l);
            var5 = 3 + var4;
            mn.field_c = new String[var5];
            wg.field_h = new int[var5];
            var6 = 0;
            L1: while (true) {
              if (var5 <= var6) {
                rb.field_a = new int[2];
                var6 = 0;
                L2: while (true) {
                  if (var4 <= var6) {
                    mn.field_c[-3 + var5] = "";
                    mn.field_c[-2 + var5] = vi.field_m;
                    wg.field_h[-2 + var5] = 0;
                    rb.field_a[0] = 4;
                    mn.field_c[-1 + var5] = je.field_I;
                    wg.field_h[var5 - 1] = 1;
                    rb.field_a[1] = 5;
                    break L0;
                  } else {
                    mn.field_c[var6] = fb.field_l[var6];
                    var6++;
                    continue L2;
                  }
                }
              } else {
                wg.field_h[var6] = -1;
                var6++;
                continue L1;
              }
            }
          } else {
            if (1 == p.field_d) {
              var4 = sf.a((byte) 125, re.field_n, j.field_h, rf.field_b, fb.field_l);
              var5 = var4 + 2;
              wg.field_h = new int[var5];
              mn.field_c = new String[var5];
              var6 = 0;
              L3: while (true) {
                if (var5 <= var6) {
                  rb.field_a = new int[1];
                  var6 = 0;
                  L4: while (true) {
                    if (var6 >= var4) {
                      mn.field_c[-2 + var5] = "";
                      mn.field_c[var5 - 1] = je.field_I;
                      wg.field_h[-1 + var5] = 0;
                      rb.field_a[0] = 5;
                      break L0;
                    } else {
                      mn.field_c[var6] = fb.field_l[var6];
                      var6++;
                      continue L4;
                    }
                  }
                } else {
                  wg.field_h[var6] = -1;
                  var6++;
                  continue L3;
                }
              }
            } else {
              if (2 == p.field_d) {
                var4 = sf.a((byte) 121, oi.a(new String[1], ji.field_d, 2), j.field_h, rf.field_b, fb.field_l);
                var5 = -1;
                var6 = 0;
                L5: while (true) {
                  L6: {
                    if (var6 >= var4) {
                      break L6;
                    } else {
                      if ("<%0>".equals((Object) (Object) fb.field_l[var6])) {
                        var5 = var6;
                        break L6;
                      } else {
                        var6++;
                        continue L5;
                      }
                    }
                  }
                  if (var5 != -1) {
                    rj.field_d = new String[var5];
                    ek.a((Object[]) (Object) fb.field_l, 0, (Object[]) (Object) rj.field_d, 0, var5);
                    eh.field_j = new String[-1 + var4 + -var5];
                    ek.a((Object[]) (Object) fb.field_l, 1 + var5, (Object[]) (Object) eh.field_j, 0, -var5 + var4 - 1);
                    var4 = sf.a((byte) 124, oi.a(new String[1], mh.field_e, 2), j.field_h, rf.field_b, fb.field_l);
                    var5 = -1;
                    var6 = 0;
                    L7: while (true) {
                      L8: {
                        if (var4 <= var6) {
                          break L8;
                        } else {
                          if ("<%0>".equals((Object) (Object) fb.field_l[var6])) {
                            var5 = var6;
                            break L8;
                          } else {
                            var6++;
                            continue L7;
                          }
                        }
                      }
                      if (var5 == -1) {
                        throw new IllegalStateException();
                      } else {
                        L9: {
                          dh.field_o = new String[var5];
                          ek.a((Object[]) (Object) fb.field_l, 0, (Object[]) (Object) dh.field_o, 0, var5);
                          de.field_rb = new String[-var5 + var4 + -1];
                          ek.a((Object[]) (Object) fb.field_l, var5 + 1, (Object[]) (Object) de.field_rb, 0, -var5 + (var4 - 1));
                          if (dh.field_o.length > rj.field_d.length) {
                            stackOut_50_0 = dh.field_o.length;
                            stackIn_51_0 = stackOut_50_0;
                            break L9;
                          } else {
                            stackOut_49_0 = rj.field_d.length;
                            stackIn_51_0 = stackOut_49_0;
                            break L9;
                          }
                        }
                        L10: {
                          var6 = stackIn_51_0;
                          if (de.field_rb.length <= eh.field_j.length) {
                            stackOut_53_0 = eh.field_j.length;
                            stackIn_54_0 = stackOut_53_0;
                            break L10;
                          } else {
                            stackOut_52_0 = de.field_rb.length;
                            stackIn_54_0 = stackOut_52_0;
                            break L10;
                          }
                        }
                        var7 = stackIn_54_0;
                        var8 = var7 + (var6 + 7);
                        wg.field_h = new int[var8];
                        mn.field_c = new String[var8];
                        var9 = 0;
                        L11: while (true) {
                          if (var8 <= var9) {
                            rb.field_a = new int[2];
                            mn.field_c[1] = sl.field_c;
                            wg.field_h[1] = 0;
                            mn.field_c[0] = mm.field_b;
                            mn.field_c[4] = ud.field_d;
                            mn.field_c[5] = "";
                            rb.field_a[0] = 5;
                            mn.field_c[2] = dk.field_u;
                            wg.field_h[3] = 1;
                            rb.field_a[1] = 2;
                            mn.field_c[3] = eb.field_a;
                            var9 = 0;
                            L12: while (true) {
                              if (var9 >= var6) {
                                mn.field_c[var6 + 6] = null;
                                wg.field_h[var6 + 6] = -2;
                                var9 = 0;
                                L13: while (true) {
                                  if (var9 >= var7) {
                                    af.field_e = hc.a(-9986);
                                    break L0;
                                  } else {
                                    L14: {
                                      stackOut_65_0 = mn.field_c;
                                      stackOut_65_1 = 7 - (-var6 + -var9);
                                      stackIn_67_0 = stackOut_65_0;
                                      stackIn_67_1 = stackOut_65_1;
                                      stackIn_66_0 = stackOut_65_0;
                                      stackIn_66_1 = stackOut_65_1;
                                      if (de.field_rb.length > var9) {
                                        stackOut_67_0 = (String[]) (Object) stackIn_67_0;
                                        stackOut_67_1 = stackIn_67_1;
                                        stackOut_67_2 = de.field_rb[var9];
                                        stackIn_68_0 = stackOut_67_0;
                                        stackIn_68_1 = stackOut_67_1;
                                        stackIn_68_2 = stackOut_67_2;
                                        break L14;
                                      } else {
                                        stackOut_66_0 = (String[]) (Object) stackIn_66_0;
                                        stackOut_66_1 = stackIn_66_1;
                                        stackOut_66_2 = "";
                                        stackIn_68_0 = stackOut_66_0;
                                        stackIn_68_1 = stackOut_66_1;
                                        stackIn_68_2 = stackOut_66_2;
                                        break L14;
                                      }
                                    }
                                    stackIn_68_0[stackIn_68_1] = stackIn_68_2;
                                    var9++;
                                    continue L13;
                                  }
                                }
                              } else {
                                L15: {
                                  stackOut_59_0 = mn.field_c;
                                  stackOut_59_1 = 6 + var9;
                                  stackIn_61_0 = stackOut_59_0;
                                  stackIn_61_1 = stackOut_59_1;
                                  stackIn_60_0 = stackOut_59_0;
                                  stackIn_60_1 = stackOut_59_1;
                                  if (var9 + dh.field_o.length + -var6 < 0) {
                                    stackOut_61_0 = (String[]) (Object) stackIn_61_0;
                                    stackOut_61_1 = stackIn_61_1;
                                    stackOut_61_2 = "";
                                    stackIn_62_0 = stackOut_61_0;
                                    stackIn_62_1 = stackOut_61_1;
                                    stackIn_62_2 = stackOut_61_2;
                                    break L15;
                                  } else {
                                    stackOut_60_0 = (String[]) (Object) stackIn_60_0;
                                    stackOut_60_1 = stackIn_60_1;
                                    stackOut_60_2 = dh.field_o[-var6 + var9 + dh.field_o.length];
                                    stackIn_62_0 = stackOut_60_0;
                                    stackIn_62_1 = stackOut_60_1;
                                    stackIn_62_2 = stackOut_60_2;
                                    break L15;
                                  }
                                }
                                stackIn_62_0[stackIn_62_1] = stackIn_62_2;
                                var9++;
                                continue L12;
                              }
                            }
                          } else {
                            wg.field_h[var9] = -1;
                            var9++;
                            continue L11;
                          }
                        }
                      }
                    }
                  } else {
                    throw new IllegalStateException();
                  }
                }
              } else {
                if (p.field_d != 3) {
                  if (p.field_d != 4) {
                    if (p.field_d != 5) {
                      throw new IllegalArgumentException();
                    } else {
                      var4 = sf.a((byte) 123, el.field_i, j.field_h, rf.field_b, fb.field_l);
                      var5 = var4 + 3;
                      mn.field_c = new String[var5];
                      wg.field_h = new int[var5];
                      var6 = 0;
                      L16: while (true) {
                        if (var6 >= var5) {
                          rb.field_a = new int[2];
                          var6 = 0;
                          L17: while (true) {
                            if (var6 >= var4) {
                              mn.field_c[-3 + var5] = "";
                              mn.field_c[-2 + var5] = vf.field_a;
                              wg.field_h[-2 + var5] = 0;
                              rb.field_a[0] = 3;
                              mn.field_c[-1 + var5] = je.field_I;
                              wg.field_h[var5 + -1] = 1;
                              rb.field_a[1] = 5;
                              break L0;
                            } else {
                              mn.field_c[var6] = fb.field_l[var6];
                              var6++;
                              continue L17;
                            }
                          }
                        } else {
                          wg.field_h[var6] = -1;
                          var6++;
                          continue L16;
                        }
                      }
                    }
                  } else {
                    var4 = sf.a((byte) 120, tl.field_j, j.field_h, rf.field_b, fb.field_l);
                    var5 = var4 + 2;
                    wg.field_h = new int[var5];
                    mn.field_c = new String[var5];
                    var6 = 0;
                    L18: while (true) {
                      if (var5 <= var6) {
                        rb.field_a = new int[1];
                        var6 = 0;
                        L19: while (true) {
                          if (var6 >= var4) {
                            mn.field_c[-2 + var5] = "";
                            mn.field_c[var5 - 1] = je.field_I;
                            wg.field_h[-1 + var5] = 0;
                            rb.field_a[0] = 5;
                            break L0;
                          } else {
                            mn.field_c[var6] = fb.field_l[var6];
                            var6++;
                            continue L19;
                          }
                        }
                      } else {
                        wg.field_h[var6] = -1;
                        var6++;
                        continue L18;
                      }
                    }
                  }
                } else {
                  L20: {
                    if (!ei.field_c.field_a) {
                      var4 = sf.a((byte) 127, fd.field_x, j.field_h, rf.field_b, fb.field_l);
                      break L20;
                    } else {
                      var4 = sf.a((byte) 120, eh.field_h, j.field_h, rf.field_b, fb.field_l);
                      break L20;
                    }
                  }
                  var5 = 2 + var4;
                  mn.field_c = new String[var5];
                  wg.field_h = new int[var5];
                  var6 = 0;
                  L21: while (true) {
                    if (var6 >= var5) {
                      rb.field_a = new int[1];
                      var6 = 0;
                      L22: while (true) {
                        if (var4 <= var6) {
                          mn.field_c[-2 + var5] = "";
                          mn.field_c[var5 - 1] = je.field_I;
                          wg.field_h[var5 + -1] = 0;
                          rb.field_a[0] = 5;
                          break L0;
                        } else {
                          mn.field_c[var6] = fb.field_l[var6];
                          var6++;
                          continue L22;
                        }
                      }
                    } else {
                      wg.field_h[var6] = -1;
                      var6++;
                      continue L21;
                    }
                  }
                }
              }
            }
          }
        }
        co.field_k.field_o = rb.field_a.length;
        var4 = 0;
        var5 = 0;
        L23: while (true) {
          if (var5 >= mn.field_c.length) {
            L24: {
              if (p.field_d != 2) {
                break L24;
              } else {
                var11 = rj.field_d;
                var6 = 0;
                L25: while (true) {
                  if (var11.length <= var6) {
                    var12 = eh.field_j;
                    var6 = 0;
                    L26: while (true) {
                      if (var12.length <= var6) {
                        break L24;
                      } else {
                        L27: {
                          var14 = var12[var6];
                          var8 = gl.a(1492912648, false, var14);
                          if (var8 > var4) {
                            var4 = var8;
                            break L27;
                          } else {
                            break L27;
                          }
                        }
                        var6++;
                        continue L26;
                      }
                    }
                  } else {
                    L28: {
                      var13 = var11[var6];
                      var8 = gl.a(1492912648, false, var13);
                      if (var4 >= var8) {
                        break L28;
                      } else {
                        break L28;
                      }
                    }
                    var6++;
                    continue L25;
                  }
                }
              }
            }
            sg.field_n = co.field_k.field_o * (bj.field_j - -oh.field_d << 1);
            qg.field_g = var4 + hn.field_q - (var4 >> 1);
            gi.field_c = -(var4 >> 1) + hn.field_q;
            var5 = 0;
            L29: while (true) {
              if (mn.field_c.length <= var5) {
                ih.field_a = -(sg.field_n >> 1) + ad.field_i;
                hn.field_v = new int[mn.field_c.length][];
                var5 = 0;
                var6 = ih.field_a;
                L30: while (true) {
                  if (var5 >= mn.field_c.length) {
                    L31: {
                      if (p.field_d != 2) {
                        co.field_k.a(param0, pn.a(hk.field_Jb, nl.field_u, (byte) 111), -563, 0);
                        break L31;
                      } else {
                        co.field_k.a(param0, -1, -563, -1);
                        break L31;
                      }
                    }
                    return;
                  } else {
                    L32: {
                      var7 = wg.field_h[var5];
                      if (var7 < 0) {
                        var6 = var6 + re.field_m;
                        break L32;
                      } else {
                        var8 = gl.a(1492912648, true, mn.field_c[var5]);
                        var6 = var6 + oh.field_d;
                        var9 = -(var8 >> 1) + hn.field_q;
                        hn.field_v[var5] = new int[4];
                        hn.field_v[var5][0] = var9 + -eh.field_d;
                        hn.field_v[var5][1] = var6;
                        hn.field_v[var5][2] = (eh.field_d << 1) + var8;
                        var6 = var6 + ((bj.field_j << 1) + (oh.field_d - -mi.field_c));
                        hn.field_v[var5][3] = (bj.field_j << 1) + mi.field_c;
                        break L32;
                      }
                    }
                    var5++;
                    continue L30;
                  }
                }
              } else {
                L33: {
                  stackOut_104_0 = sg.field_n;
                  stackIn_106_0 = stackOut_104_0;
                  stackIn_105_0 = stackOut_104_0;
                  if (wg.field_h[var5] >= 0) {
                    stackOut_106_0 = stackIn_106_0;
                    stackOut_106_1 = mi.field_c;
                    stackIn_107_0 = stackOut_106_0;
                    stackIn_107_1 = stackOut_106_1;
                    break L33;
                  } else {
                    stackOut_105_0 = stackIn_105_0;
                    stackOut_105_1 = re.field_m;
                    stackIn_107_0 = stackOut_105_0;
                    stackIn_107_1 = stackOut_105_1;
                    break L33;
                  }
                }
                sg.field_n = stackIn_107_0 + stackIn_107_1;
                var5++;
                continue L29;
              }
            }
          } else {
            L34: {
              stackOut_86_0 = 1492912648;
              stackIn_88_0 = stackOut_86_0;
              stackIn_87_0 = stackOut_86_0;
              if (wg.field_h[var5] < 0) {
                stackOut_88_0 = stackIn_88_0;
                stackOut_88_1 = 0;
                stackIn_89_0 = stackOut_88_0;
                stackIn_89_1 = stackOut_88_1;
                break L34;
              } else {
                stackOut_87_0 = stackIn_87_0;
                stackOut_87_1 = 1;
                stackIn_89_0 = stackOut_87_0;
                stackIn_89_1 = stackOut_87_1;
                break L34;
              }
            }
            L35: {
              var6 = gl.a(stackIn_89_0, stackIn_89_1 != 0, mn.field_c[var5]);
              if (var4 >= var6) {
                break L35;
              } else {
                break L35;
              }
            }
            var5++;
            continue L23;
          }
        }
    }

    final static void d(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (w.field_L == null) {
            break L0;
          } else {
            var1 = (Object) (Object) w.field_L;
            synchronized (var1) {
              L1: {
                w.field_L = null;
                break L1;
              }
            }
            break L0;
          }
        }
        L2: {
          if (param0 >= 109) {
            break L2;
          } else {
            field_c = null;
            break L2;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_a = new int[8192];
        field_c = "You have entered another game.";
    }
}
