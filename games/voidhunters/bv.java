/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bv {
    private int field_c;
    static int[] field_a;
    static llb field_b;
    static boolean field_d;
    static int field_e;

    private final void a(byte param0, int param1, int param2) {
        try {
            this.a(param1, 127, param2, false);
            if (param0 != 113) {
                field_d = true;
            }
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "bv.F(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
    }

    private final int[] a(int param0, ij param1, int param2, int param3, lta param4, int param5, int param6, int param7) {
        lw var9 = null;
        RuntimeException var9_ref = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int[] stackIn_10_0 = null;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        Object stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int[] stackOut_9_0 = null;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        Object stackOut_17_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = VoidHunters.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var9 = (lw) (Object) param1.d(0);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var9 == null) {
                            statePc = 12;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var10 = var9.field_l;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = param0;
                        stackOut_4_1 = var10;
                        stackIn_13_0 = stackOut_4_0;
                        stackIn_13_1 = stackOut_4_1;
                        stackIn_5_0 = stackOut_4_0;
                        stackIn_5_1 = stackOut_4_1;
                        if (var13 != 0) {
                            statePc = 13;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (stackIn_5_0 == stackIn_5_1) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var11 = var9.field_m;
                        var12 = var9.field_h;
                        stackOut_9_0 = new int[]{var11, var11 + chb.field_a, var12, bhb.field_g + var12};
                        stackIn_10_0 = stackOut_9_0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 10: {
                    return stackIn_10_0;
                }
                case 11: {
                    try {
                        var9 = (lw) (Object) param1.a((byte) 39);
                        if (var13 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = param2;
                        stackOut_12_1 = 30;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (stackIn_13_0 == stackIn_13_1) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        ((bv) this).a(-87, (rsb) null, 37, 98, (sg) null, 100, (lta) null);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackOut_17_0 = null;
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
                    return (int[]) (Object) stackIn_18_0;
                }
                case 19: {
                    var9_ref = (RuntimeException) (Object) caughtException;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    try {
                        stackOut_20_0 = (RuntimeException) var9_ref;
                        stackOut_20_1 = new StringBuilder().append("bv.I(").append(param0).append(44);
                        stackIn_23_0 = stackOut_20_0;
                        stackIn_23_1 = stackOut_20_1;
                        stackIn_21_0 = stackOut_20_0;
                        stackIn_21_1 = stackOut_20_1;
                        if (param1 == null) {
                            statePc = 23;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
                        stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
                        stackOut_21_2 = "{...}";
                        stackIn_24_0 = stackOut_21_0;
                        stackIn_24_1 = stackOut_21_1;
                        stackIn_24_2 = stackOut_21_2;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 22: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 23: {
                    stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
                    stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
                    stackOut_23_2 = "null";
                    stackIn_24_0 = stackOut_23_0;
                    stackIn_24_1 = stackOut_23_1;
                    stackIn_24_2 = stackOut_23_2;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    try {
                        stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
                        stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(44).append(param2).append(44).append(param3).append(44);
                        stackIn_27_0 = stackOut_24_0;
                        stackIn_27_1 = stackOut_24_1;
                        stackIn_25_0 = stackOut_24_0;
                        stackIn_25_1 = stackOut_24_1;
                        if (param4 == null) {
                            statePc = 27;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
                        stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
                        stackOut_25_2 = "{...}";
                        stackIn_28_0 = stackOut_25_0;
                        stackIn_28_1 = stackOut_25_1;
                        stackIn_28_2 = stackOut_25_2;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 26: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 27: {
                    stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
                    stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
                    stackOut_27_2 = "null";
                    stackIn_28_0 = stackOut_27_0;
                    stackIn_28_1 = stackOut_27_1;
                    stackIn_28_2 = stackOut_27_2;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    throw rta.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, int param1) {
        try {
            this.a((byte) 113, 100, param1);
            if (param0 != -26476) {
                this.a((rsb) null, (lta) null, 111, -69, (int[]) null, (String) null, -41);
            }
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "bv.J(" + param0 + 44 + param1 + 41);
        }
    }

    final boolean b(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param1 <= -4) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        stackOut_1_0 = 1;
                        stackIn_2_0 = stackOut_1_0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return stackIn_2_0 != 0;
                }
                case 3: {
                    try {
                        if (lu.field_f[param0] < 50) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = 1;
                        stackIn_7_0 = stackOut_4_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = 0;
                        stackIn_7_0 = stackOut_6_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return stackIn_7_0 != 0;
                }
                case 8: {
                    var3 = (RuntimeException) (Object) caughtException;
                    throw rta.a((Throwable) (Object) var3, "bv.D(" + param0 + 44 + param1 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean b(byte param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int[] stackIn_5_0 = null;
        int stackIn_11_0 = 0;
        int stackOut_1_0 = 0;
        int[] stackOut_4_0 = null;
        int stackOut_8_0 = 0;
        int stackOut_10_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0 == 11) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        stackOut_1_0 = 0;
                        stackIn_2_0 = stackOut_1_0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return stackIn_2_0 != 0;
                }
                case 3: {
                    try {
                        if (!qd.field_a[param1]) {
                            statePc = 10;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = lu.field_f;
                        stackIn_5_0 = stackOut_4_0;
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
                        if (stackIn_5_0[param1] >= 50) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = 1;
                        stackIn_11_0 = stackOut_8_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = 0;
                        stackIn_11_0 = stackOut_10_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    return stackIn_11_0 != 0;
                }
                case 12: {
                    var3 = (RuntimeException) (Object) caughtException;
                    throw rta.a((Throwable) (Object) var3, "bv.K(" + param0 + 44 + param1 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final String a(int param0, int param1, boolean param2) {
        RuntimeException var4 = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_5_0 = null;
        String stackOut_7_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0 == -6448) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        this.a((rsb) null, (lta) null, 32, -33, (int[]) null, (String) null, -106);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (!param2) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = "<col=ffaa00>" + bpb.field_q[param1] + "</col>";
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return stackIn_6_0;
                }
                case 7: {
                    try {
                        stackOut_7_0 = bpb.field_q[param1];
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return stackIn_8_0;
                }
                case 9: {
                    var4 = (RuntimeException) (Object) caughtException;
                    throw rta.a((Throwable) (Object) var4, "bv.C(" + param0 + 44 + param1 + 44 + param2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean a(int param0, boolean param1) {
        RuntimeException var3 = null;
        boolean stackIn_5_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_4_0 = false;
        try {
          try {
            L0: {
              if (param1) {
                break L0;
              } else {
                ((bv) this).field_c = -29;
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_4_0 = qd.field_a[param0];
          stackIn_5_0 = stackOut_4_0;
        }
        return false;
    }

    final void a(byte param0) {
        try {
            int var2_int = -50 / ((55 - param0) / 38);
            m.a(-98);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "bv.B(" + param0 + 41);
        }
    }

    final void a(byte param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            L0: {
              if (param0 > 66) {
                break L0;
              } else {
                ((bv) this).a((byte) -23, 1);
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          qd.field_a[param1] = true;
        }
    }

    public static void a(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            L0: {
              if (param0 == 39) {
                break L0;
              } else {
                bv.a(105);
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          field_a = null;
          field_b = null;
        }
    }

    private final void a(int[] param0, lta param1, boolean param2, int param3, rsb param4, boolean param5, String param6, int param7, byte param8) {
        RuntimeException var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int stackIn_22_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_76_0 = 0;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        String stackIn_89_2 = null;
        RuntimeException stackIn_90_0 = null;
        StringBuilder stackIn_90_1 = null;
        RuntimeException stackIn_92_0 = null;
        StringBuilder stackIn_92_1 = null;
        RuntimeException stackIn_93_0 = null;
        StringBuilder stackIn_93_1 = null;
        String stackIn_93_2 = null;
        RuntimeException stackIn_94_0 = null;
        StringBuilder stackIn_94_1 = null;
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        String stackIn_97_2 = null;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        String stackIn_101_2 = null;
        int stackOut_21_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_75_0 = 0;
        RuntimeException stackOut_85_0 = null;
        StringBuilder stackOut_85_1 = null;
        RuntimeException stackOut_86_0 = null;
        StringBuilder stackOut_86_1 = null;
        String stackOut_86_2 = null;
        RuntimeException stackOut_88_0 = null;
        StringBuilder stackOut_88_1 = null;
        String stackOut_88_2 = null;
        RuntimeException stackOut_89_0 = null;
        StringBuilder stackOut_89_1 = null;
        RuntimeException stackOut_90_0 = null;
        StringBuilder stackOut_90_1 = null;
        String stackOut_90_2 = null;
        RuntimeException stackOut_92_0 = null;
        StringBuilder stackOut_92_1 = null;
        String stackOut_92_2 = null;
        RuntimeException stackOut_93_0 = null;
        StringBuilder stackOut_93_1 = null;
        RuntimeException stackOut_94_0 = null;
        StringBuilder stackOut_94_1 = null;
        String stackOut_94_2 = null;
        RuntimeException stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        String stackOut_96_2 = null;
        RuntimeException stackOut_97_0 = null;
        StringBuilder stackOut_97_1 = null;
        RuntimeException stackOut_98_0 = null;
        StringBuilder stackOut_98_1 = null;
        String stackOut_98_2 = null;
        RuntimeException stackOut_100_0 = null;
        StringBuilder stackOut_100_1 = null;
        String stackOut_100_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var30 = VoidHunters.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var10_int = -16384;
                        var11 = -2048;
                        var12 = tea.a(param7, param6, 13879);
                        var13 = onb.field_a;
                        var14 = lj.field_a;
                        var15 = param0[0];
                        var16 = param0[1];
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param5) {
                            statePc = 5;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (!param2) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var16 = param0[2] + param0[3] >> 246963873;
                        var15 = param0[0] - -param0[1] >> -872091743;
                        if (var30 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var15 = param1.a((param0[1] + param0[0] >> 1869467009) + var10_int, (byte) 124);
                        var16 = param1.b(true, var11 + (param0[2] + param0[3] >> -79720447));
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var17 = pqa.a(false, param7);
                        if (param5) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var16 = var16 - var17 / 2;
                        var15 = var15 - var12 / 2;
                        if (var30 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var16 = var16 - var17;
                        var15 = var15 - var12;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var18 = -105 / ((10 - param8) / 45);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if ((16 + var16 ^ -1) < (var14 ^ -1)) {
                            statePc = 19;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (0 > var16 + (-var17 - 16)) {
                            statePc = 18;
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
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var16 = 16 + var17;
                        if (var30 == 0) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var16 = -16 + var14;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (16 + var15 + var12 <= var13) {
                            statePc = 23;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var15 = -var12 + var13 - 16;
                        stackOut_21_0 = var30;
                        stackIn_22_0 = stackOut_21_0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (stackIn_22_0 == 0) {
                            statePc = 29;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if ((var15 + -16 ^ -1) > -1) {
                            statePc = 28;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var15 = 16;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var19 = 4;
                        var20 = -var19 + var15;
                        var21 = -var17 + var16;
                        var22 = var12 + 2 * var19;
                        var23 = 18;
                        if (!param5) {
                            statePc = 60;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var24 = 0;
                        var25 = 0;
                        if (param2) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var24 = param1.a(param0[0] + param0[1] >> 1680100609, (byte) 120);
                        var25 = param1.b(true, param0[2] + param0[3] >> 599844833);
                        if (var30 == 0) {
                            statePc = 33;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var24 = param0[1] - -param0[0] >> 1025049633;
                        var25 = param0[3] + param0[2] >> 1781805281;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if ((var24 ^ -1) <= (var22 + var15 ^ -1)) {
                            statePc = 42;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        stackOut_34_0 = var25;
                        stackIn_35_0 = stackOut_34_0;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if ((stackIn_35_0 ^ -1) > (var16 - -(var23 / 2) ^ -1)) {
                            statePc = 40;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var26 = param1.b(true, param0[3] - var11);
                        var27 = var23 + var26;
                        var28 = var23 + var27 - var17;
                        if ((var28 - -16 ^ -1) <= (var14 ^ -1)) {
                            statePc = 42;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var16 = var27;
                        var20 = -var19 + var15;
                        var21 = var16 + -var17;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var26 = var24;
                        var27 = 7;
                        var28 = var27 - (1 - var23) + var21;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if ((var27 + var24 ^ -1) < (var22 + var20 ^ -1)) {
                            statePc = 46;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var20 = -var22 + var24 - -var27;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if ((var20 ^ -1) < (-var27 + var24 ^ -1)) {
                            statePc = 50;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var20 = -var27 + var24;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (6 <= -var20 + 1 + (-var27 + var26)) {
                            statePc = 53;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var26 = var20 + (-1 + var27);
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var15 = var20 + var19;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (var27 + (var26 + -var20) + var22 < 6) {
                            statePc = 57;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        var26 = -var27 + (var20 + var22);
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var29 = param3 << 1039338296;
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        opb.a(var20 + -1, -1 + var21, (byte) -128, var23 - -2, param3, 1, 2 + var22);
                        hcb.a(8, -var27 + var28, 1, 1 | var29, var26, -1 + (var26 - var27) - -1, var28 + -var27, var28 + 1, var29 | 1, 1 + (var27 + var26), 1 | var29);
                        hcb.a(8, -var27 + var28, 1, var29 | 236981, var26, var26 + (1 + -var27), -var27 + var28, var28, var29 | 56035, var26 - -var27, 236981 | var29);
                        if (var30 == 0) {
                            statePc = 63;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        opb.a(-1 + var20, var21 + -1, (byte) -128, 2 + var23, param3, 1, 2 + var22);
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        ga.a(param3, false, var20, var21, var23, var22, 236981);
                        var24 = param1.a(0, 4 + var16 + var19);
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (param5) {
                            statePc = 67;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if ((param0[3] ^ -1) > (var24 ^ -1)) {
                            statePc = 70;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if (var24 < param0[2]) {
                            statePc = 72;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        var24 = param1.a(0, -var17 + var16);
                        if (var30 == 0) {
                            statePc = 73;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        var24 = param1.a(0, var16 - var17);
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        var25 = param1.b(true, param0[2] + param0[3] >> -768319071);
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (var25 <= var21) {
                            statePc = 82;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        stackOut_75_0 = var23;
                        stackIn_76_0 = stackOut_75_0;
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if ((stackIn_76_0 + var21 ^ -1) < (var25 ^ -1)) {
                            statePc = 81;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        var24 = param1.a(0, var16);
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        ibb.a(1, param3, -1, param6, (byte) -117, param7, -5 + var16, var15);
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 84: {
                    var10 = (RuntimeException) (Object) caughtException;
                    statePc = 85;
                    continue stateLoop;
                }
                case 85: {
                    try {
                        stackOut_85_0 = (RuntimeException) var10;
                        stackOut_85_1 = new StringBuilder().append("bv.L(");
                        stackIn_88_0 = stackOut_85_0;
                        stackIn_88_1 = stackOut_85_1;
                        stackIn_86_0 = stackOut_85_0;
                        stackIn_86_1 = stackOut_85_1;
                        if (param0 == null) {
                            statePc = 88;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        stackOut_86_0 = (RuntimeException) (Object) stackIn_86_0;
                        stackOut_86_1 = (StringBuilder) (Object) stackIn_86_1;
                        stackOut_86_2 = "{...}";
                        stackIn_89_0 = stackOut_86_0;
                        stackIn_89_1 = stackOut_86_1;
                        stackIn_89_2 = stackOut_86_2;
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 87: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 88: {
                    stackOut_88_0 = (RuntimeException) (Object) stackIn_88_0;
                    stackOut_88_1 = (StringBuilder) (Object) stackIn_88_1;
                    stackOut_88_2 = "null";
                    stackIn_89_0 = stackOut_88_0;
                    stackIn_89_1 = stackOut_88_1;
                    stackIn_89_2 = stackOut_88_2;
                    statePc = 89;
                    continue stateLoop;
                }
                case 89: {
                    try {
                        stackOut_89_0 = (RuntimeException) (Object) stackIn_89_0;
                        stackOut_89_1 = ((StringBuilder) (Object) stackIn_89_1).append(stackIn_89_2).append(44);
                        stackIn_92_0 = stackOut_89_0;
                        stackIn_92_1 = stackOut_89_1;
                        stackIn_90_0 = stackOut_89_0;
                        stackIn_90_1 = stackOut_89_1;
                        if (param1 == null) {
                            statePc = 92;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        stackOut_90_0 = (RuntimeException) (Object) stackIn_90_0;
                        stackOut_90_1 = (StringBuilder) (Object) stackIn_90_1;
                        stackOut_90_2 = "{...}";
                        stackIn_93_0 = stackOut_90_0;
                        stackIn_93_1 = stackOut_90_1;
                        stackIn_93_2 = stackOut_90_2;
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 91: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 92: {
                    stackOut_92_0 = (RuntimeException) (Object) stackIn_92_0;
                    stackOut_92_1 = (StringBuilder) (Object) stackIn_92_1;
                    stackOut_92_2 = "null";
                    stackIn_93_0 = stackOut_92_0;
                    stackIn_93_1 = stackOut_92_1;
                    stackIn_93_2 = stackOut_92_2;
                    statePc = 93;
                    continue stateLoop;
                }
                case 93: {
                    try {
                        stackOut_93_0 = (RuntimeException) (Object) stackIn_93_0;
                        stackOut_93_1 = ((StringBuilder) (Object) stackIn_93_1).append(stackIn_93_2).append(44).append(param2).append(44).append(param3).append(44);
                        stackIn_96_0 = stackOut_93_0;
                        stackIn_96_1 = stackOut_93_1;
                        stackIn_94_0 = stackOut_93_0;
                        stackIn_94_1 = stackOut_93_1;
                        if (param4 == null) {
                            statePc = 96;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        stackOut_94_0 = (RuntimeException) (Object) stackIn_94_0;
                        stackOut_94_1 = (StringBuilder) (Object) stackIn_94_1;
                        stackOut_94_2 = "{...}";
                        stackIn_97_0 = stackOut_94_0;
                        stackIn_97_1 = stackOut_94_1;
                        stackIn_97_2 = stackOut_94_2;
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 95: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 96: {
                    stackOut_96_0 = (RuntimeException) (Object) stackIn_96_0;
                    stackOut_96_1 = (StringBuilder) (Object) stackIn_96_1;
                    stackOut_96_2 = "null";
                    stackIn_97_0 = stackOut_96_0;
                    stackIn_97_1 = stackOut_96_1;
                    stackIn_97_2 = stackOut_96_2;
                    statePc = 97;
                    continue stateLoop;
                }
                case 97: {
                    try {
                        stackOut_97_0 = (RuntimeException) (Object) stackIn_97_0;
                        stackOut_97_1 = ((StringBuilder) (Object) stackIn_97_1).append(stackIn_97_2).append(44).append(param5).append(44);
                        stackIn_100_0 = stackOut_97_0;
                        stackIn_100_1 = stackOut_97_1;
                        stackIn_98_0 = stackOut_97_0;
                        stackIn_98_1 = stackOut_97_1;
                        if (param6 == null) {
                            statePc = 100;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        stackOut_98_0 = (RuntimeException) (Object) stackIn_98_0;
                        stackOut_98_1 = (StringBuilder) (Object) stackIn_98_1;
                        stackOut_98_2 = "{...}";
                        stackIn_101_0 = stackOut_98_0;
                        stackIn_101_1 = stackOut_98_1;
                        stackIn_101_2 = stackOut_98_2;
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 99: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 100: {
                    stackOut_100_0 = (RuntimeException) (Object) stackIn_100_0;
                    stackOut_100_1 = (StringBuilder) (Object) stackIn_100_1;
                    stackOut_100_2 = "null";
                    stackIn_101_0 = stackOut_100_0;
                    stackIn_101_1 = stackOut_100_1;
                    stackIn_101_2 = stackOut_100_2;
                    statePc = 101;
                    continue stateLoop;
                }
                case 101: {
                    throw rta.a((Throwable) (Object) stackIn_101_0, stackIn_101_2 + 44 + param7 + 44 + param8 + 41);
                }
                case 102: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(rsb param0, lta param1, int param2, int param3, int[] param4, String param5, int param6) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        this.a(param4, param1, false, param2, param0, true, param5, param3, (byte) -76);
                        if (param6 == 1619) {
                            statePc = 21;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        String discarded$3 = this.a(-4, -53, false);
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 3: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        stackOut_4_0 = (RuntimeException) runtimeException;
                        stackOut_4_1 = new StringBuilder().append("bv.M(");
                        stackIn_7_0 = stackOut_4_0;
                        stackIn_7_1 = stackOut_4_1;
                        stackIn_5_0 = stackOut_4_0;
                        stackIn_5_1 = stackOut_4_1;
                        if (param0 == null) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
                        stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
                        stackOut_5_2 = "{...}";
                        stackIn_8_0 = stackOut_5_0;
                        stackIn_8_1 = stackOut_5_1;
                        stackIn_8_2 = stackOut_5_2;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 7: {
                    stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                    stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                    stackOut_7_2 = "null";
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    stackIn_8_2 = stackOut_7_2;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    try {
                        stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                        stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
                        stackIn_11_0 = stackOut_8_0;
                        stackIn_11_1 = stackOut_8_1;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        if (param1 == null) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
                        stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
                        stackOut_9_2 = "{...}";
                        stackIn_12_0 = stackOut_9_0;
                        stackIn_12_1 = stackOut_9_1;
                        stackIn_12_2 = stackOut_9_2;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 11: {
                    stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                    stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
                    stackOut_11_2 = "null";
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    stackIn_12_2 = stackOut_11_2;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    try {
                        stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                        stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44).append(param2).append(44).append(param3).append(44);
                        stackIn_15_0 = stackOut_12_0;
                        stackIn_15_1 = stackOut_12_1;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        if (param4 == null) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                        stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                        stackOut_13_2 = "{...}";
                        stackIn_16_0 = stackOut_13_0;
                        stackIn_16_1 = stackOut_13_1;
                        stackIn_16_2 = stackOut_13_2;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 15: {
                    stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                    stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                    stackOut_15_2 = "null";
                    stackIn_16_0 = stackOut_15_0;
                    stackIn_16_1 = stackOut_15_1;
                    stackIn_16_2 = stackOut_15_2;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    try {
                        stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                        stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
                        stackIn_19_0 = stackOut_16_0;
                        stackIn_19_1 = stackOut_16_1;
                        stackIn_17_0 = stackOut_16_0;
                        stackIn_17_1 = stackOut_16_1;
                        if (param5 == null) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                        stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                        stackOut_17_2 = "{...}";
                        stackIn_20_0 = stackOut_17_0;
                        stackIn_20_1 = stackOut_17_1;
                        stackIn_20_2 = stackOut_17_2;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 18: {
                    throw (RuntimeException) (Object) caughtException;
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
                    throw rta.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + param6 + 41);
                }
                case 21: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    bv() {
        ((bv) this).field_c = -1;
    }

    private final void a(int param0, int param1, int param2, boolean param3) {
        RuntimeException var5 = null;
        int[] stackIn_2_0 = null;
        boolean stackIn_6_0 = false;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int[] stackOut_1_0 = null;
        boolean stackOut_5_0 = false;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (qd.field_a[param2]) {
                            statePc = 20;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        stackOut_1_0 = lu.field_f;
                        stackIn_2_0 = stackOut_1_0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (stackIn_2_0[param2] >= param0) {
                            statePc = 20;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = param3;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (stackIn_6_0) {
                            statePc = 17;
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
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = -1;
                        stackIn_10_0 = stackOut_9_0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (stackIn_10_0 == vl.field_o) {
                            statePc = 17;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = param2;
                        stackIn_14_0 = stackOut_13_0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (stackIn_14_0 != vl.field_o) {
                            statePc = 20;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        lu.field_f[param2] = lu.field_f[param2] + 2;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (param1 > 85) {
                            statePc = 26;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        field_a = null;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 25: {
                    var5 = (RuntimeException) (Object) caughtException;
                    throw rta.a((Throwable) (Object) var5, "bv.G(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
                }
                case 26: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, rsb param1, int param2, int param3, sg param4, int param5, lta param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        ij var9 = null;
        tj var10 = null;
        nbb[] var10_array = null;
        nbb[] var11_ref_nbb__ = null;
        int var11 = 0;
        int var12 = 0;
        nbb var13 = null;
        int[] var13_array = null;
        sg var14 = null;
        rca var15 = null;
        bba var16 = null;
        int var17 = 0;
        Object stackIn_13_0 = null;
        int stackIn_32_0 = 0;
        int stackIn_36_0 = 0;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        Object stackOut_12_0 = null;
        int stackOut_29_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_35_0 = 0;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var17 = VoidHunters.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var8_int = -18 % ((94 - param2) / 32);
                        var9 = param1.field_g.c(true);
                        var10 = (tj) (Object) var9.d(0);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var10 == null) {
                            statePc = 8;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if ((var10.e(512) ^ -1) != -1) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var10.b(0, 71);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var10 = (tj) (Object) var9.a((byte) 109);
                        if (var17 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var10_array = param1.field_g.h((byte) -33);
                        var11_ref_nbb__ = var10_array;
                        var12 = 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var11_ref_nbb__.length <= var12) {
                            statePc = 23;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var13 = var11_ref_nbb__[var12];
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var17 != 0) {
                            statePc = 61;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = null;
                        stackIn_13_0 = stackOut_12_0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (stackIn_13_0 != (Object) (Object) var13) {
                            statePc = 18;
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
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if ((var13.field_k.a(27, 0) ^ -1) >= -1) {
                            statePc = 22;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var13.field_k.e(122, 27);
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var12++;
                        if (var17 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (!((bv) this).b((byte) 11, 1)) {
                            statePc = 61;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (param1.field_g.c(0) > 1) {
                            statePc = 61;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var11 = param1.field_e.b(7061, 0);
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (0 != param1.field_g.b(true)) {
                            statePc = 31;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackOut_29_0 = 1;
                        stackIn_32_0 = stackOut_29_0;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        stackOut_31_0 = 0;
                        stackIn_32_0 = stackOut_31_0;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var12 = stackIn_32_0;
                        var13 = null;
                        if (-1 != (var11 ^ -1)) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var13_array = new int[]{9, 1, 38, 2, 30, -1, -1, 3, 13, 12, 15, 14, 15, 23, 13, 25, 39, 3, 30, -1, -1};
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (var11 != 1) {
                            statePc = 42;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        stackOut_35_0 = var12;
                        stackIn_36_0 = stackOut_35_0;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (stackIn_36_0 != 0) {
                            statePc = 41;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var13_array = new int[]{8, 0, 39, 0, 13, 1, 45, 2, 27, 3, 30, 0, 25, -1, -1, 10, 38, 2, 30, 1, 25, 3, 27, 4, 45, 5, 13};
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (var13_array != null) {
                            statePc = 45;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var14 = ae.a(var13_array, (byte) 56);
                        var14.h(17704, 1);
                        var14.a(new aoa(), 4);
                        var15 = param1.field_g.a(0, param1.field_g.m(1) / 2, 0, 0, var14.q((byte) 108), param1.field_g.g((byte) -122) / 2);
                        var14.a(var15.field_c, var15.field_b, (byte) 80);
                        param1.field_g.a(var14, (byte) 72);
                        var14.r(-2);
                        var16 = new bba();
                        var16.a((byte) -106, (wm) (Object) new cc(var14.c(false)));
                        var16.a((rna) (Object) new uoa(0, 1), true);
                        var16.a((rna) (Object) new oca(), true);
                        param1.field_g.a(var16, -38);
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 47: {
                    var8 = (RuntimeException) (Object) caughtException;
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    try {
                        stackOut_48_0 = (RuntimeException) var8;
                        stackOut_48_1 = new StringBuilder().append("bv.O(").append(param0).append(44);
                        stackIn_51_0 = stackOut_48_0;
                        stackIn_51_1 = stackOut_48_1;
                        stackIn_49_0 = stackOut_48_0;
                        stackIn_49_1 = stackOut_48_1;
                        if (param1 == null) {
                            statePc = 51;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
                        stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
                        stackOut_49_2 = "{...}";
                        stackIn_52_0 = stackOut_49_0;
                        stackIn_52_1 = stackOut_49_1;
                        stackIn_52_2 = stackOut_49_2;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 50: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 51: {
                    stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
                    stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
                    stackOut_51_2 = "null";
                    stackIn_52_0 = stackOut_51_0;
                    stackIn_52_1 = stackOut_51_1;
                    stackIn_52_2 = stackOut_51_2;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    try {
                        stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
                        stackOut_52_1 = ((StringBuilder) (Object) stackIn_52_1).append(stackIn_52_2).append(44).append(param2).append(44).append(param3).append(44);
                        stackIn_55_0 = stackOut_52_0;
                        stackIn_55_1 = stackOut_52_1;
                        stackIn_53_0 = stackOut_52_0;
                        stackIn_53_1 = stackOut_52_1;
                        if (param4 == null) {
                            statePc = 55;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
                        stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
                        stackOut_53_2 = "{...}";
                        stackIn_56_0 = stackOut_53_0;
                        stackIn_56_1 = stackOut_53_1;
                        stackIn_56_2 = stackOut_53_2;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 54: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 55: {
                    stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
                    stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
                    stackOut_55_2 = "null";
                    stackIn_56_0 = stackOut_55_0;
                    stackIn_56_1 = stackOut_55_1;
                    stackIn_56_2 = stackOut_55_2;
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    try {
                        stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
                        stackOut_56_1 = ((StringBuilder) (Object) stackIn_56_1).append(stackIn_56_2).append(44).append(param5).append(44);
                        stackIn_59_0 = stackOut_56_0;
                        stackIn_59_1 = stackOut_56_1;
                        stackIn_57_0 = stackOut_56_0;
                        stackIn_57_1 = stackOut_56_1;
                        if (param6 == null) {
                            statePc = 59;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        stackOut_57_0 = (RuntimeException) (Object) stackIn_57_0;
                        stackOut_57_1 = (StringBuilder) (Object) stackIn_57_1;
                        stackOut_57_2 = "{...}";
                        stackIn_60_0 = stackOut_57_0;
                        stackIn_60_1 = stackOut_57_1;
                        stackIn_60_2 = stackOut_57_2;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 58: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 59: {
                    stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
                    stackOut_59_1 = (StringBuilder) (Object) stackIn_59_1;
                    stackOut_59_2 = "null";
                    stackIn_60_0 = stackOut_59_0;
                    stackIn_60_1 = stackOut_59_1;
                    stackIn_60_2 = stackOut_59_2;
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    throw rta.a((Throwable) (Object) stackIn_60_0, stackIn_60_2 + 41);
                }
                case 61: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(rsb param0, int param1, boolean param2, lta param3, int param4, int param5, int param6, int param7, byte param8, ij param9, int param10, int param11, sg param12) {
        int var14_int = 0;
        tfa var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19_int = 0;
        int[] var19 = null;
        String var20 = null;
        int var20_int = 0;
        int var21 = 0;
        int[] var21_ref_int__ = null;
        int var22 = 0;
        int[] var22_ref_int__ = null;
        String var22_ref = null;
        ml var23 = null;
        int var23_int = 0;
        int[] var23_array = null;
        ml var24 = null;
        int var24_int = 0;
        int[] var24_array = null;
        int var25 = 0;
        int var26_int = 0;
        aja var26 = null;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        int var43 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_30_0 = 0;
        boolean stackIn_60_0 = false;
        int stackIn_68_0 = 0;
        boolean stackIn_75_0 = false;
        int stackIn_88_0 = 0;
        int stackIn_172_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_19_0 = 0;
        boolean stackOut_29_0 = false;
        boolean stackOut_59_0 = false;
        int stackOut_67_0 = 0;
        boolean stackOut_74_0 = false;
        int stackOut_87_0 = 0;
        int stackOut_171_0 = 0;
        int stackOut_170_0 = 0;
        L0: {
          var43 = VoidHunters.field_G;
          if (0 > param11) {
            break L0;
          } else {
            if (param0.field_c.length <= param11) {
              break L0;
            } else {
              L1: {
                var14_int = param0.field_e.e(8);
                if (1 == var14_int) {
                  break L1;
                } else {
                  if (-3 != (var14_int ^ -1)) {
                    var15 = param0.a(param11, (byte) 59);
                    var17 = 0;
                    L2: while (true) {
                      L3: {
                        L4: {
                          if ((lu.field_f.length ^ -1) >= (var17 ^ -1)) {
                            break L4;
                          } else {
                            stackOut_11_0 = lu.field_f[var17];
                            stackIn_17_0 = stackOut_11_0;
                            stackIn_12_0 = stackOut_11_0;
                            if (var43 != 0) {
                              break L3;
                            } else {
                              L5: {
                                if (stackIn_12_0 <= 0) {
                                  break L5;
                                } else {
                                  lu.field_f[var17] = lu.field_f[var17] - 1;
                                  break L5;
                                }
                              }
                              var17++;
                              if (var43 == 0) {
                                continue L2;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                        stackOut_16_0 = -68 / ((param8 - 60) / 61);
                        stackIn_17_0 = stackOut_16_0;
                        break L3;
                      }
                      var18 = stackIn_17_0;
                      var16 = 4;
                      var17 = param3.a(true, pk.field_o);
                      var18 = param3.a(0, noa.field_q);
                      vl.field_o = -1;
                      var19_int = 0;
                      L6: while (true) {
                        L7: {
                          L8: {
                            L9: {
                              if (11 <= var19_int) {
                                break L9;
                              } else {
                                stackOut_19_0 = var19_int;
                                stackIn_30_0 = stackOut_19_0;
                                stackIn_20_0 = stackOut_19_0;
                                if (var43 != 0) {
                                  break L8;
                                } else {
                                  L10: {
                                    if (stackIn_20_0 == 4) {
                                      break L10;
                                    } else {
                                      if (-1 <= (lu.field_f[var19_int] ^ -1)) {
                                        break L10;
                                      } else {
                                        vl.field_o = var19_int;
                                        if (var43 == 0) {
                                          break L9;
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                  }
                                  var19_int++;
                                  if (var43 == 0) {
                                    continue L6;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                            }
                            if (param12 == null) {
                              break L7;
                            } else {
                              stackOut_29_0 = param12.d(9, 49);
                              stackIn_30_0 = stackOut_29_0 ? 1 : 0;
                              break L8;
                            }
                          }
                          if (stackIn_30_0 != 0) {
                            break L7;
                          } else {
                            L11: {
                              var19 = param12.f((byte) -66);
                              this.a(-26476, 0);
                              if (!mja.field_o) {
                                break L11;
                              } else {
                                if (!eka.field_b) {
                                  break L11;
                                } else {
                                  if (!bva.field_d) {
                                    break L11;
                                  } else {
                                    if (mfb.field_a) {
                                      ((bv) this).a((byte) 86, 0);
                                      break L11;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                              }
                            }
                            L12: {
                              if ((2 & var15.field_f ^ -1) == -1) {
                                break L12;
                              } else {
                                eka.field_b = true;
                                break L12;
                              }
                            }
                            L13: {
                              if (-1 != (var15.field_f & 8 ^ -1)) {
                                mfb.field_a = true;
                                break L13;
                              } else {
                                break L13;
                              }
                            }
                            L14: {
                              if (0 != (var15.field_f & 1)) {
                                mja.field_o = true;
                                break L14;
                              } else {
                                break L14;
                              }
                            }
                            L15: {
                              if ((var15.field_f & 4 ^ -1) == -1) {
                                break L15;
                              } else {
                                bva.field_d = true;
                                break L15;
                              }
                            }
                            L16: {
                              if (((bv) this).b(0, -116)) {
                                var20 = isa.a(ge.field_b, new String[4], 90);
                                this.a(param0, param3, hlb.a(lu.field_f[0], 255), var16, var19, var20, 1619);
                                break L16;
                              } else {
                                break L16;
                              }
                            }
                            L17: {
                              if (!((bv) this).b((byte) 11, 0)) {
                                break L17;
                              } else {
                                if (!param12.v(32)) {
                                  var20_int = param12.field_k.b(126, 0);
                                  var21 = 0;
                                  var22 = 0;
                                  L18: while (true) {
                                    L19: {
                                      L20: {
                                        if (var22 >= var20_int) {
                                          break L20;
                                        } else {
                                          var23 = lcb.field_q[var22];
                                          stackOut_59_0 = var23.k((byte) 122);
                                          stackIn_68_0 = stackOut_59_0 ? 1 : 0;
                                          stackIn_60_0 = stackOut_59_0;
                                          if (var43 != 0) {
                                            break L19;
                                          } else {
                                            L21: {
                                              if (stackIn_60_0) {
                                                break L21;
                                              } else {
                                                if (!var23.field_c.b((byte) 119)) {
                                                  break L21;
                                                } else {
                                                  var24_int = var23.c(-14);
                                                  if (-1 == (var24_int ^ -1)) {
                                                    break L21;
                                                  } else {
                                                    var21 = 1;
                                                    break L21;
                                                  }
                                                }
                                              }
                                            }
                                            var22++;
                                            if (var43 == 0) {
                                              continue L18;
                                            } else {
                                              break L20;
                                            }
                                          }
                                        }
                                      }
                                      stackOut_67_0 = var21;
                                      stackIn_68_0 = stackOut_67_0;
                                      break L19;
                                    }
                                    L22: {
                                      if (stackIn_68_0 == 0) {
                                        break L22;
                                      } else {
                                        this.a(-26476, 1);
                                        break L22;
                                      }
                                    }
                                    if (((bv) this).b(1, -60)) {
                                      var22 = 0;
                                      var23_int = 0;
                                      L23: while (true) {
                                        L24: {
                                          L25: {
                                            if ((var23_int ^ -1) <= (var20_int ^ -1)) {
                                              break L25;
                                            } else {
                                              var24 = lcb.field_q[var23_int];
                                              stackOut_74_0 = var24.k((byte) 73);
                                              stackIn_88_0 = stackOut_74_0 ? 1 : 0;
                                              stackIn_75_0 = stackOut_74_0;
                                              if (var43 != 0) {
                                                break L24;
                                              } else {
                                                L26: {
                                                  L27: {
                                                    if (!stackIn_75_0) {
                                                      break L27;
                                                    } else {
                                                      if (var43 == 0) {
                                                        break L26;
                                                      } else {
                                                        break L27;
                                                      }
                                                    }
                                                  }
                                                  var25 = var24.c(118);
                                                  if (-1 == (var25 ^ -1)) {
                                                    break L26;
                                                  } else {
                                                    L28: {
                                                      L29: {
                                                        var26_int = rrb.a(22433, var24.g((byte) -127) + -var24.c(-61));
                                                        var27 = rrb.a(22433, var24.g((byte) -127) - -var24.c(-118));
                                                        var28 = var24.a(var24.i((byte) -112), (byte) -69);
                                                        var29 = var24.a(125, var24.i((byte) -112));
                                                        var30 = 8;
                                                        var31 = var28 + (fc.a(var26_int, (byte) -96) * var30 >> -739944543);
                                                        var32 = (eu.a(var26_int, 44) * var30 >> 1877342081) + var29;
                                                        var33 = (var30 * fc.a(var27, (byte) 109) >> -802334943) + var28;
                                                        var34 = (var30 * eu.a(var27, 87) >> 1525799009) + var29;
                                                        var35 = param3.a(var31, (byte) 118);
                                                        var36 = param3.b(true, var32);
                                                        var37 = param3.a(var33, (byte) 115);
                                                        var38 = param3.b(true, var34);
                                                        var39 = param3.a(var28, (byte) 115);
                                                        var40 = param3.b(true, var29);
                                                        var41 = 11142145;
                                                        var42 = hlb.a(lu.field_f[1], 255) >>> -2098323134;
                                                        if (var24.field_c.a(-26772, var18, var17, var24.i((byte) -112), var24)) {
                                                          break L29;
                                                        } else {
                                                          if (-1 == (ds.field_g ^ -1)) {
                                                            break L28;
                                                          } else {
                                                            var41 = 16712705;
                                                            if (var43 == 0) {
                                                              break L28;
                                                            } else {
                                                              break L29;
                                                            }
                                                          }
                                                        }
                                                      }
                                                      var41 = 16712705;
                                                      hha.a(var39, (byte) 66, var35, var40, 11142145, var36, var42);
                                                      var22 = 1;
                                                      hha.a(var39, (byte) 66, var37, var40, 11142145, var38, var42);
                                                      break L28;
                                                    }
                                                    hcb.a(8, var36, 1, 131586, var39, var35, var38, var40, var41 | var42 << -1557213384, var37, 131586);
                                                    break L26;
                                                  }
                                                }
                                                var23_int++;
                                                if (var43 == 0) {
                                                  continue L23;
                                                } else {
                                                  break L25;
                                                }
                                              }
                                            }
                                          }
                                          stackOut_87_0 = pk.field_o ^ -1;
                                          stackIn_88_0 = stackOut_87_0;
                                          break L24;
                                        }
                                        L30: {
                                          L31: {
                                            L32: {
                                              if (stackIn_88_0 == 0) {
                                                break L32;
                                              } else {
                                                if (-1 != noa.field_q) {
                                                  break L31;
                                                } else {
                                                  break L32;
                                                }
                                              }
                                            }
                                            var17 = param12.field_d;
                                            var18 = param12.f((byte) -112)[2];
                                            if (var43 == 0) {
                                              break L30;
                                            } else {
                                              break L31;
                                            }
                                          }
                                          if (var22 == 0) {
                                            break L30;
                                          } else {
                                            var24_int = kc.field_b;
                                            var25 = uia.field_b;
                                            var26 = mmb.field_d[0];
                                            var26.a(-(var26.d() / 2) + var24_int, -(var26.a() / 2) + var25, 0, 16777215 | hlb.a(lu.field_f[1], 255) << 1711121432, 1);
                                            break L30;
                                          }
                                        }
                                        var23_int = 1024;
                                        var24_array = new int[]{-var23_int + var17, var23_int + var17, -var23_int + var18, var23_int + var18};
                                        this.a(param0, param3, hlb.a(lu.field_f[1], 255), var16, var24_array, bhb.field_e, 1619);
                                        break L17;
                                      }
                                    } else {
                                      break L17;
                                    }
                                  }
                                } else {
                                  break L17;
                                }
                              }
                            }
                            L33: {
                              if (!((bv) this).b((byte) 11, 0)) {
                                break L33;
                              } else {
                                if (!((bv) this).b((byte) 11, 1)) {
                                  break L33;
                                } else {
                                  if (param12.d(4, 50)) {
                                    break L33;
                                  } else {
                                    L34: {
                                      L35: {
                                        if (0 == (pk.field_o ^ -1)) {
                                          break L35;
                                        } else {
                                          if (-1 == noa.field_q) {
                                            break L35;
                                          } else {
                                            break L34;
                                          }
                                        }
                                      }
                                      var17 = param12.field_d;
                                      var18 = param12.field_e;
                                      break L34;
                                    }
                                    L36: {
                                      L37: {
                                        var20 = (String) (Object) param0.field_g.b(1, 2147483647, param12.d(false), var17, var18, param12.g((byte) 124));
                                        if (var20 != null) {
                                          break L37;
                                        } else {
                                          if ((param12.x(-96) ^ -1) == 0) {
                                            break L36;
                                          } else {
                                            break L37;
                                          }
                                        }
                                      }
                                      L38: {
                                        this.a(-26476, 3);
                                        if (param2) {
                                          L39: {
                                            if ((param0.field_g.b(true) ^ -1) >= -1) {
                                              break L39;
                                            } else {
                                              if (param0.field_g.b(true) > 1) {
                                                break L38;
                                              } else {
                                                if ((param12.x(46) ^ -1) != 0) {
                                                  break L39;
                                                } else {
                                                  break L38;
                                                }
                                              }
                                            }
                                          }
                                          ((bv) this).a((byte) 99, 3);
                                          lu.field_f[3] = 0;
                                          break L38;
                                        } else {
                                          break L38;
                                        }
                                      }
                                      L40: {
                                        if ((param12.x(-119) ^ -1) == 0) {
                                          break L40;
                                        } else {
                                          L41: {
                                            if (!param2) {
                                              ((bv) this).a((byte) 123, 3);
                                              break L41;
                                            } else {
                                              break L41;
                                            }
                                          }
                                          lu.field_f[3] = 0;
                                          break L40;
                                        }
                                      }
                                      if (!((bv) this).b(3, -123)) {
                                        break L33;
                                      } else {
                                        var21_ref_int__ = ((nbb) (Object) var20).f((byte) -82);
                                        this.a(param0, param3, hlb.a(lu.field_f[3], 255), var16, var21_ref_int__, nr.field_o, 1619);
                                        if (var43 == 0) {
                                          break L33;
                                        } else {
                                          break L36;
                                        }
                                      }
                                    }
                                    if (qd.field_a[3]) {
                                      break L33;
                                    } else {
                                      if (-1 > (lu.field_f[3] ^ -1)) {
                                        lu.field_f[3] = lu.field_f[3] - 1;
                                        break L33;
                                      } else {
                                        break L33;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            L42: {
                              if (!((bv) this).b((byte) 11, 0)) {
                                break L42;
                              } else {
                                if (!((bv) this).b((byte) 11, 1)) {
                                  break L42;
                                } else {
                                  L43: {
                                    L44: {
                                      this.a(-26476, 2);
                                      if (-1 < (tcb.field_o ^ -1)) {
                                        break L44;
                                      } else {
                                        if (si.field_o[baa.field_p]) {
                                          break L44;
                                        } else {
                                          if (!si.field_o[wpa.field_r]) {
                                            break L43;
                                          } else {
                                            break L44;
                                          }
                                        }
                                      }
                                    }
                                    gk.field_p = true;
                                    break L43;
                                  }
                                  L45: {
                                    L46: {
                                      if (-1 > (tcb.field_o ^ -1)) {
                                        break L46;
                                      } else {
                                        if (si.field_o[oeb.field_o]) {
                                          break L46;
                                        } else {
                                          if (si.field_o[hna.field_n]) {
                                            break L46;
                                          } else {
                                            break L45;
                                          }
                                        }
                                      }
                                    }
                                    nqa.field_c = true;
                                    break L45;
                                  }
                                  L47: {
                                    if (!gk.field_p) {
                                      break L47;
                                    } else {
                                      if (!nqa.field_c) {
                                        break L47;
                                      } else {
                                        ((bv) this).a((byte) 83, 2);
                                        break L47;
                                      }
                                    }
                                  }
                                  if (!((bv) this).b(2, -104)) {
                                    break L42;
                                  } else {
                                    var20_int = param10 / 2;
                                    var21 = param5 / 4;
                                    var22_ref_int__ = new int[]{var20_int, var21};
                                    this.a(var22_ref_int__, param3, false, hlb.a(lu.field_f[2], 255), param0, false, ei.field_f, var16, (byte) 116);
                                    break L42;
                                  }
                                }
                              }
                            }
                            if (!((bv) this).b((byte) 11, 0)) {
                              break L7;
                            } else {
                              if (!((bv) this).b((byte) 11, 1)) {
                                break L7;
                              } else {
                                if (var14_int == 5) {
                                  L48: {
                                    L49: {
                                      var20_int = cab.field_p;
                                      var21_ref_int__ = new int[]{param12.d(false) - var20_int, -var20_int + param12.d(false), param12.g((byte) 127), param12.g((byte) 124)};
                                      if (param3.field_f[0] < var21_ref_int__[0]) {
                                        break L49;
                                      } else {
                                        if (param3.field_f[1] > var21_ref_int__[1]) {
                                          break L49;
                                        } else {
                                          if ((var21_ref_int__[2] ^ -1) < (param3.field_f[2] ^ -1)) {
                                            break L49;
                                          } else {
                                            if (var21_ref_int__[3] >= param3.field_f[3]) {
                                              stackOut_171_0 = 0;
                                              stackIn_172_0 = stackOut_171_0;
                                              break L48;
                                            } else {
                                              break L49;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    stackOut_170_0 = 1;
                                    stackIn_172_0 = stackOut_170_0;
                                    break L48;
                                  }
                                  L50: {
                                    var22 = stackIn_172_0;
                                    if (var22 != 0) {
                                      L51: {
                                        var23_int = oq.field_l * 5 + 100;
                                        var24_int = vl.field_o;
                                        vl.field_o = -1;
                                        this.a((byte) 113, var23_int, 4);
                                        if ((lu.field_f[4] ^ -1) != (var23_int ^ -1)) {
                                          break L51;
                                        } else {
                                          ((bv) this).a((byte) 113, 4);
                                          break L51;
                                        }
                                      }
                                      L52: {
                                        if (((bv) this).b(4, -124)) {
                                          this.a(param0, param3, hlb.a(lu.field_f[4], 255), var16, var21_ref_int__, uia.field_a, 1619);
                                          break L52;
                                        } else {
                                          break L52;
                                        }
                                      }
                                      vl.field_o = var24_int;
                                      break L50;
                                    } else {
                                      break L50;
                                    }
                                  }
                                  L53: {
                                    var20 = (String) (Object) new ij();
                                    param12.a((ij) (Object) var20, 9, param2, param0.field_g.d(param12.c(false), (byte) 21));
                                    if (((ij) (Object) var20).c(3) > 1) {
                                      L54: {
                                        this.a(-26476, 9);
                                        if (!si.field_o[81]) {
                                          break L54;
                                        } else {
                                          ((bv) this).a((byte) 127, 9);
                                          break L54;
                                        }
                                      }
                                      if (!((bv) this).b(9, -56)) {
                                        break L53;
                                      } else {
                                        var21 = 172;
                                        var22 = param5 + -58;
                                        var23_array = new int[]{var21, var22};
                                        this.a(var23_array, param3, false, hlb.a(lu.field_f[9], 255), param0, false, slb.field_b, var16, (byte) -47);
                                        break L53;
                                      }
                                    } else {
                                      break L53;
                                    }
                                  }
                                  L55: {
                                    if (((bv) this).b((byte) 11, 9)) {
                                      L56: {
                                        this.a(-26476, 10);
                                        if (null == es.field_b) {
                                          break L56;
                                        } else {
                                          if (es.field_b.field_f == null) {
                                            break L56;
                                          } else {
                                            ((bv) this).a((byte) 123, 10);
                                            break L56;
                                          }
                                        }
                                      }
                                      if (((bv) this).b(10, -61)) {
                                        var21_ref_int__ = this.a(11, param9, 30, param4, param3, param6, param5, param1);
                                        if (null == var21_ref_int__) {
                                          break L55;
                                        } else {
                                          var22_ref = isa.a(vsa.field_o, new String[1], 110);
                                          this.a(var21_ref_int__, param3, true, hlb.a(lu.field_f[10], 255), param0, true, var22_ref, var16, (byte) -50);
                                          break L55;
                                        }
                                      } else {
                                        break L55;
                                      }
                                    } else {
                                      break L55;
                                    }
                                  }
                                  L57: {
                                    if (!ssa.b(2)) {
                                      break L57;
                                    } else {
                                      if (si.field_o[101]) {
                                        ((bv) this).a((byte) 118, 10);
                                        break L57;
                                      } else {
                                        break L57;
                                      }
                                    }
                                  }
                                  L58: {
                                    L59: {
                                      var21_ref_int__ = new int[2];
                                      param12.field_k.a(var21_ref_int__, (byte) -17, true);
                                      var22 = var21_ref_int__[0] * 256 / var21_ref_int__[1];
                                      var21_ref_int__[0] = 0;
                                      var21_ref_int__[1] = 0;
                                      param12.field_k.a(var21_ref_int__, (byte) -17, false);
                                      var23_int = 256 * var21_ref_int__[0] / var21_ref_int__[1];
                                      if (var22 >= var23_int) {
                                        break L59;
                                      } else {
                                        this.a(-26476, 5);
                                        if (var43 == 0) {
                                          break L58;
                                        } else {
                                          break L59;
                                        }
                                      }
                                    }
                                    if (0 < lu.field_f[5]) {
                                      lu.field_f[5] = lu.field_f[5] - 1;
                                      break L58;
                                    } else {
                                      break L58;
                                    }
                                  }
                                  L60: {
                                    if (param12.d(4, 75)) {
                                      ((bv) this).a((byte) 118, 5);
                                      break L60;
                                    } else {
                                      break L60;
                                    }
                                  }
                                  L61: {
                                    if (((bv) this).b(5, -12)) {
                                      var24_array = this.a(4, param9, 30, param4, param3, param6, param5, param1);
                                      if (var24_array != null) {
                                        this.a(var24_array, param3, true, hlb.a(lu.field_f[5], 255), param0, true, oba.field_o, var16, (byte) 98);
                                        break L61;
                                      } else {
                                        break L61;
                                      }
                                    } else {
                                      break L61;
                                    }
                                  }
                                  L62: {
                                    if (!param12.d(4, 72)) {
                                      break L62;
                                    } else {
                                      L63: {
                                        if (!param12.q(-50)) {
                                          break L63;
                                        } else {
                                          this.a(-26476, 6);
                                          break L63;
                                        }
                                      }
                                      if (param12.v(32)) {
                                        break L62;
                                      } else {
                                        ((bv) this).a((byte) 106, 6);
                                        break L62;
                                      }
                                    }
                                  }
                                  L64: {
                                    if (((bv) this).b(6, -88)) {
                                      var21_ref_int__ = this.a(4, param9, 30, param4, param3, param6, param5, param1);
                                      if (var21_ref_int__ == null) {
                                        break L64;
                                      } else {
                                        this.a(var21_ref_int__, param3, true, hlb.a(lu.field_f[6], 255), param0, true, afa.field_p, var16, (byte) 102);
                                        break L64;
                                      }
                                    } else {
                                      break L64;
                                    }
                                  }
                                  L65: {
                                    var21_ref_int__ = this.a(0, param9, 30, param4, param3, param6, param5, param1);
                                    if (null == var21_ref_int__) {
                                      break L65;
                                    } else {
                                      L66: {
                                        this.a(-26476, 7);
                                        if (-1 == (param7 ^ -1)) {
                                          ((bv) this).a((byte) 82, 7);
                                          if (!((bv) this).b((byte) 11, 7)) {
                                            break L66;
                                          } else {
                                            if (0 == (pk.field_o ^ -1)) {
                                              break L66;
                                            } else {
                                              if (0 == (noa.field_q ^ -1)) {
                                                break L66;
                                              } else {
                                                this.a(-26476, 8);
                                                if (((bv) this).b(8, -43)) {
                                                  var22 = 1024;
                                                  var23_array = new int[]{var17 - var22, var17 - -var22, -var22 + var18, var18 + var22};
                                                  this.a(var23_array, param3, false, hlb.a(lu.field_f[8], 255), param0, true, pja.field_i, var16, (byte) -115);
                                                  break L66;
                                                } else {
                                                  break L66;
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          break L66;
                                        }
                                      }
                                      if (((bv) this).b(7, -106)) {
                                        this.a(var21_ref_int__, param3, true, hlb.a(lu.field_f[7], 255), param0, true, gla.field_b, var16, (byte) 60);
                                        break L65;
                                      } else {
                                        break L65;
                                      }
                                    }
                                  }
                                  if (!((bv) this).b((byte) 11, 10)) {
                                    break L7;
                                  } else {
                                    if (param2) {
                                      ((bv) this).field_c = ((bv) this).field_c + 1;
                                      var21 = -100 + ((bv) this).field_c;
                                      if ((var21 ^ -1) < -1) {
                                        L67: {
                                          if (var21 > 200) {
                                            var21 = 200;
                                            break L67;
                                          } else {
                                            break L67;
                                          }
                                        }
                                        int discarded$1 = maa.a(165, (byte) -127, 2, qoa.field_p, var21);
                                        break L7;
                                      } else {
                                        break L7;
                                      }
                                    } else {
                                      break L7;
                                    }
                                  }
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                        }
                        return;
                      }
                    }
                  } else {
                    break L1;
                  }
                }
              }
              return;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = oea.f((byte) -49);
        field_e = 2;
    }
}
