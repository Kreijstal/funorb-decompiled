/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lb extends ld {
    private boolean field_X;
    private String field_S;
    private boolean field_Z;
    private c field_Y;
    private String field_U;
    static String field_W;
    static int[] field_V;
    static String field_T;

    final void f(byte param0) {
        ((lb) this).field_Z = true;
        int var2 = -94 % ((17 - param0) / 46);
        ((lb) this).field_Y.field_B = false;
    }

    lb(i param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
            ((lb) this).field_S = param1;
            if (null != ((lb) this).field_S) {
                var3_int = uc.field_g.b(((lb) this).field_S, 260, uc.field_g.field_F);
                ((lb) this).b(300, -2038584927, 150 - -var3_int);
            }
            ((lb) this).field_Y = new c(13, 50, 274, 30, 15, 2113632, 4210752);
            ((lb) this).field_Z = false;
            ((lb) this).field_X = false;
            ((lb) this).field_Y.field_B = true;
            ((lb) this).a((rc) (Object) ((lb) this).field_Y, 5411);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "lb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean g() {
        rh.field_f = true;
        kj.field_I = je.a(1) - -15000L;
        return fj.field_i == 11 ? true : false;
    }

    public static void m() {
        field_T = null;
        field_W = null;
        field_V = null;
    }

    final static boolean b(java.applet.Applet param0) {
        try {
            String var2 = null;
            Throwable var2_ref = null;
            RuntimeException var2_ref2 = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_4_0 = 0;
            int stackIn_11_0 = 0;
            int stackIn_18_0 = 0;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            String stackIn_22_2 = null;
            int stackOut_3_0 = 0;
            int stackOut_10_0 = 0;
            int stackOut_16_0 = 0;
            int stackOut_17_0 = 0;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            RuntimeException stackOut_20_0 = null;
            StringBuilder stackOut_20_1 = null;
            String stackOut_20_2 = null;
            RuntimeException stackOut_21_0 = null;
            StringBuilder stackOut_21_1 = null;
            String stackOut_21_2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var7 = SolKnight.field_L ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (me.field_g) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            stackOut_3_0 = 1;
                            stackIn_4_0 = stackOut_3_0;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        return stackIn_4_0 != 0;
                    }
                    case 5: {
                        try {
                            var2 = "tuhstatbut";
                            var3 = (String) fd.a(param0, "getcookies", (byte) 94);
                            int discarded$2 = 1;
                            var4 = b.a(var3, ';');
                            var5 = 0;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (var5 >= var4.length) {
                                statePc = 15;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var6 = var4[var5].indexOf('=');
                            if (0 > var6) {
                                statePc = 12;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if (var4[var5].substring(0, var6).trim().equals((Object) (Object) var2)) {
                                statePc = 10;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            stackOut_10_0 = 1;
                            stackIn_11_0 = stackOut_10_0;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        return stackIn_11_0 != 0;
                    }
                    case 12: {
                        try {
                            var5++;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            var2_ref = caughtException;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (param0.getParameter("tuhstatbut") == null) {
                                statePc = 17;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            stackOut_16_0 = 1;
                            stackIn_18_0 = stackOut_16_0;
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            stackOut_17_0 = 0;
                            stackIn_18_0 = stackOut_17_0;
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        return stackIn_18_0 != 0;
                    }
                    case 19: {
                        var2_ref2 = (RuntimeException) (Object) caughtException;
                        stackOut_19_0 = (RuntimeException) var2_ref2;
                        stackOut_19_1 = new StringBuilder().append("lb.I(");
                        stackIn_21_0 = stackOut_19_0;
                        stackIn_21_1 = stackOut_19_1;
                        stackIn_20_0 = stackOut_19_0;
                        stackIn_20_1 = stackOut_19_1;
                        if (param0 == null) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 20: {
                        stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
                        stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
                        stackOut_20_2 = "{...}";
                        stackIn_22_0 = stackOut_20_0;
                        stackIn_22_1 = stackOut_20_1;
                        stackIn_22_2 = stackOut_20_2;
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 21: {
                        stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
                        stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
                        stackOut_21_2 = "null";
                        stackIn_22_0 = stackOut_21_0;
                        stackIn_22_1 = stackOut_21_1;
                        stackIn_22_2 = stackOut_21_2;
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 22: {
                        throw fc.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + 6669 + ')');
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

    final static o a(int param0, o param1, int param2, int param3, int param4, int param5) {
        o var6 = null;
        RuntimeException var6_ref = null;
        o stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        o stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var6 = new o(0, 0);
            var6.field_t = param1.field_t;
            var6.field_p = param1.field_p;
            var6.field_r = param1.field_r - (-param5 + -param0);
            var6.field_n = param5 + param1.field_n;
            var6.field_q = param3 + param1.field_q - -param2;
            var6.field_v = param1.field_v;
            var6.field_s = param1.field_s - -param2;
            stackOut_0_0 = (o) var6;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var6_ref;
            stackOut_2_1 = new StringBuilder().append("lb.M(").append(param0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + param2 + ',' + param3 + ',' + 0 + ',' + param5 + ')');
        }
        return stackIn_1_0;
    }

    final void a(int param0, byte param1, int param2) {
        int var4 = 90 / ((param1 - -55) / 39);
        super.a(param0, (byte) 52, param2);
        uc.field_g.a(((lb) this).field_U, (((lb) this).field_t >> 1) + param0, param2 - -103, 16777215, -1);
        if (!(((lb) this).field_S == null)) {
            mi.b(param0 + 20, -7 + (120 + param2), 260, 8421504);
            int discarded$0 = uc.field_g.a(((lb) this).field_S, param0 - -20, 120 + (param2 + 8), 260, 100, 16777215, -1, 1, 0, uc.field_g.field_F);
        }
    }

    final void a(String param0, boolean param1, float param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if (param1) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              if (stackIn_3_0 == (((lb) this).field_X ? 1 : 0)) {
                L3: {
                  stackOut_5_0 = this;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_6_0 = stackOut_5_0;
                  if (!param1) {
                    stackOut_7_0 = this;
                    stackOut_7_1 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    break L3;
                  } else {
                    stackOut_6_0 = this;
                    stackOut_6_1 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    break L3;
                  }
                }
                ((lb) this).field_X = stackIn_8_1 != 0;
                if (((lb) this).field_X) {
                  ((lb) this).field_Y.a((byte) 69, 4210752, 8405024);
                  ((lb) this).field_Y.field_B = true;
                  break L2;
                } else {
                  ((lb) this).field_Y.a((byte) -127, 4210752, 2113632);
                  if (((lb) this).field_Z) {
                    ((lb) this).field_Y.field_B = false;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              } else {
                break L2;
              }
            }
            L4: {
              ((lb) this).field_U = param0;
              ((lb) this).field_Y.field_R = (int)(param2 / 100.0f * 65536.0f);
              if (param3 > 124) {
                break L4;
              } else {
                ((lb) this).field_Y = null;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var5;
            stackOut_16_1 = new StringBuilder().append("lb.OA(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_T = "Resume Game";
        field_V = new int[128];
    }
}
