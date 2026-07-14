/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vc {
    private long[] field_k;
    private int field_e;
    static volatile boolean field_a;
    private long[] field_f;
    static String field_n;
    private int field_d;
    static long field_j;
    static String field_i;
    private long[] field_o;
    private long[] field_m;
    private byte[] field_h;
    private long[] field_c;
    static String field_b;
    static int[] field_g;
    private byte[] field_l;

    final void a(byte param0, byte[] param1, long param2) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_31_0 = 0;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        int stackOut_14_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_30_0 = 0;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 >= 2) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        vc.b(101);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var5_int = 0;
                        var6 = 7 & 8 + -((int)param2 & 7);
                        var7 = 7 & ((vc) this).field_e;
                        var9 = param2;
                        var11 = 31;
                        var12 = 0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var11 < 0) {
                            statePc = 12;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var12 = var12 + ((((vc) this).field_l[var11] & 255) - -(255 & (int)var9));
                        ((vc) this).field_l[var11] = (byte)var12;
                        var12 = var12 >>> 8;
                        var9 = var9 >>> 8;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var11--;
                        if (var13 != 0) {
                            statePc = 30;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var13 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if ((param2 ^ -1L) >= -9L) {
                            statePc = 30;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var8 = 255 & param1[var5_int] << var6 | (255 & param1[var5_int - -1]) >>> -var6 + 8;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackOut_14_0 = var8;
                        stackIn_31_0 = stackOut_14_0;
                        stackIn_15_0 = stackOut_14_0;
                        if (var13 != 0) {
                            statePc = 31;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (stackIn_15_0 < 0) {
                            statePc = 24;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackOut_18_0 = -257;
                        stackIn_19_0 = stackOut_18_0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (stackIn_19_0 >= (var8 ^ -1)) {
                            statePc = 24;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        throw new RuntimeException("LOGIC ERROR");
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        ((vc) this).field_h[((vc) this).field_d] = (byte)ge.a((int) ((vc) this).field_h[((vc) this).field_d], var8 >>> var7);
                        ((vc) this).field_d = ((vc) this).field_d + 1;
                        ((vc) this).field_e = ((vc) this).field_e + (8 + -var7);
                        if ((((vc) this).field_e ^ -1) == -513) {
                            statePc = 28;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
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
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        this.a(false);
                        ((vc) this).field_e = 0;
                        ((vc) this).field_d = 0;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        ((vc) this).field_h[((vc) this).field_d] = (byte)vi.a(var8 << 8 + -var7, 255);
                        param2 = param2 - 8L;
                        var5_int++;
                        ((vc) this).field_e = ((vc) this).field_e + var7;
                        if (var13 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackOut_30_0 = (param2 < 0L ? -1 : (param2 == 0L ? 0 : 1));
                        stackIn_31_0 = stackOut_30_0;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (stackIn_31_0 <= 0) {
                            statePc = 33;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var8 = 255 & param1[var5_int] << var6;
                        ((vc) this).field_h[((vc) this).field_d] = (byte)ge.a((int) ((vc) this).field_h[((vc) this).field_d], var8 >>> var7);
                        if (var13 == 0) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var8 = 0;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if ((param2 + (long)var7 ^ -1L) > -9L) {
                            statePc = 41;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        ((vc) this).field_d = ((vc) this).field_d + 1;
                        param2 = param2 - (long)(-var7 + 8);
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        ((vc) this).field_e = ((vc) this).field_e + (-var7 + 8);
                        if (((vc) this).field_e != 512) {
                            statePc = 40;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        this.a(false);
                        ((vc) this).field_e = 0;
                        ((vc) this).field_d = 0;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        ((vc) this).field_h[((vc) this).field_d] = (byte)vi.a(var8 << 8 + -var7, 255);
                        ((vc) this).field_e = ((vc) this).field_e + (int)param2;
                        if (var13 == 0) {
                            statePc = 51;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        ((vc) this).field_e = (int)((long)((vc) this).field_e + param2);
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 45: {
                    var5 = (RuntimeException) (Object) caughtException;
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    try {
                        stackOut_46_0 = (RuntimeException) var5;
                        stackOut_46_1 = new StringBuilder().append("vc.A(").append(param0).append(44);
                        stackIn_49_0 = stackOut_46_0;
                        stackIn_49_1 = stackOut_46_1;
                        stackIn_47_0 = stackOut_46_0;
                        stackIn_47_1 = stackOut_46_1;
                        if (param1 == null) {
                            statePc = 49;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
                        stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
                        stackOut_47_2 = "{...}";
                        stackIn_50_0 = stackOut_47_0;
                        stackIn_50_1 = stackOut_47_1;
                        stackIn_50_2 = stackOut_47_2;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 48: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 49: {
                    stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
                    stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
                    stackOut_49_2 = "null";
                    stackIn_50_0 = stackOut_49_0;
                    stackIn_50_1 = stackOut_49_1;
                    stackIn_50_2 = stackOut_49_2;
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    throw dd.a((Throwable) (Object) stackIn_50_0, stackIn_50_2 + 44 + param2 + 41);
                }
                case 51: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void b(int param0) {
        RuntimeException var1 = null;
        se var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4_int = 0;
        String var4 = null;
        String var5_ref = null;
        int var5 = 0;
        String var6 = null;
        ti var7 = null;
        String var8 = null;
        ti var8_ref = null;
        int var9 = 0;
        int stackIn_13_0 = 0;
        ti stackIn_56_0 = null;
        ti stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        ti stackIn_57_2 = null;
        ti stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        ti stackIn_66_2 = null;
        ti stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        ti stackIn_68_2 = null;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
        ti stackOut_55_0 = null;
        ti stackOut_56_0 = null;
        int stackOut_56_1 = 0;
        ti stackOut_56_2 = null;
        ti stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        ti stackOut_65_2 = null;
        ti stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        ti stackOut_66_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3 = 50 / ((23 - param0) / 46);
                        var1_ref = cd.field_t;
                        var2 = var1_ref.b((byte) 90);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var2 == 0) {
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
                        statePc = 32;
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
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (qb.field_a == null) {
                            statePc = 8;
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
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        qb.field_a = new k(128);
                        rl.field_e = 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (1 != var1_ref.b((byte) 90)) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = 1;
                        stackIn_13_0 = stackOut_10_0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var4_int = stackIn_13_0;
                        var5_ref = var1_ref.g(2);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var4_int == 0) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        String discarded$1 = var1_ref.g(2);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var6 = (String) (Object) tg.a(var5_ref, 256);
                        var7 = (ti) (Object) var1_ref.g(2);
                        var8 = ua.a(-74, (CharSequence) (Object) var5_ref);
                        if (var8 != null) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var8 = var5_ref;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var6 != null) {
                            statePc = 26;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var6 = (String) (Object) tg.a((String) (Object) var7, 256);
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (null == var6) {
                            statePc = 26;
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
                        qb.field_a.a(-1, (o) (Object) var6, (long)var8.hashCode());
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (var6 == null) {
                            statePc = 29;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var6 = (String) (Object) new ti();
                        qb.field_a.a(-1, (o) (Object) var6, (long)var8.hashCode());
                        rl.field_e = rl.field_e + 1;
                        ((ti) (Object) var6).field_ab = rl.field_e;
                        ii.field_c.a(-109, (ca) (Object) var6);
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        ((ti) (Object) var6).field_db = var5_ref;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 31: {
                    return;
                }
                case 32: {
                    try {
                        if (-2 == (var2 ^ -1)) {
                            statePc = 35;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (null == ge.field_c) {
                            statePc = 38;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        ge.field_c = new k(128);
                        tl.field_a = 0;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var4 = var1_ref.g(2);
                        if (!var4.equals((Object) (Object) "")) {
                            statePc = 41;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var4 = null;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var5_ref = var1_ref.g(2);
                        var6 = var1_ref.g(2);
                        var7 = gi.a(var5_ref, -52);
                        if (null != var7) {
                            statePc = 47;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var7 = gi.a(var6, -71);
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (null == var7) {
                            statePc = 47;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        ge.field_c.a(-1, (o) (Object) var7, (long)ua.a(-92, (CharSequence) (Object) var5_ref).hashCode());
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (null == var7) {
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
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var7 = new ti();
                        ge.field_c.a(-1, (o) (Object) var7, (long)ua.a(-94, (CharSequence) (Object) var5_ref).hashCode());
                        tl.field_a = tl.field_a + 1;
                        var7.field_ab = tl.field_a;
                        lf.field_b.a(-107, (ca) (Object) var7);
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (var4 == null) {
                            statePc = 53;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var4 = var4.intern();
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var7.field_Z = var4;
                        var7.field_db = var5_ref;
                        var7.b(57);
                        var8_ref = (ti) (Object) lf.field_b.b((byte) 126);
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (var8_ref == null) {
                            statePc = 61;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        stackOut_55_0 = (ti) var7;
                        stackIn_56_0 = stackOut_55_0;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        stackOut_56_0 = (ti) (Object) stackIn_56_0;
                        stackOut_56_1 = 100;
                        stackOut_56_2 = (ti) var8_ref;
                        stackIn_68_0 = stackOut_56_0;
                        stackIn_68_1 = stackOut_56_1;
                        stackIn_68_2 = stackOut_56_2;
                        stackIn_57_0 = stackOut_56_0;
                        stackIn_57_1 = stackOut_56_1;
                        stackIn_57_2 = stackOut_56_2;
                        if (var9 != 0) {
                            statePc = 68;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (!oj.a(stackIn_57_0, stackIn_57_1, stackIn_57_2)) {
                            statePc = 61;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var8_ref = (ti) (Object) lf.field_b.d(853);
                        if (var9 == 0) {
                            statePc = 54;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (null != var8_ref) {
                            statePc = 65;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        lf.field_b.a(-96, (ca) (Object) var7);
                        if (var9 == 0) {
                            statePc = 69;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        stackOut_65_0 = (ti) var7;
                        stackOut_65_1 = -65;
                        stackOut_65_2 = (ti) var8_ref;
                        stackIn_66_0 = stackOut_65_0;
                        stackIn_66_1 = stackOut_65_1;
                        stackIn_66_2 = stackOut_65_2;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        stackOut_66_0 = (ti) (Object) stackIn_66_0;
                        stackOut_66_1 = stackIn_66_1;
                        stackOut_66_2 = (ti) (Object) stackIn_66_2;
                        stackIn_68_0 = stackOut_66_0;
                        stackIn_68_1 = stackOut_66_1;
                        stackIn_68_2 = stackOut_66_2;
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        vk.a((ca) (Object) stackIn_68_0, (byte) stackIn_68_1, (ca) (Object) stackIn_68_2);
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 69: {
                    return;
                }
                case 70: {
                    try {
                        if (var2 != 2) {
                            statePc = 78;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (ob.field_H == 1) {
                            statePc = 76;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        ob.field_H = 2;
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 77: {
                    return;
                }
                case 78: {
                    try {
                        if (3 != var2) {
                            statePc = 86;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        if (-3 != (ob.field_H ^ -1)) {
                            statePc = 85;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        ob.field_H = 1;
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 85: {
                    return;
                }
                case 86: {
                    try {
                        if (4 == var2) {
                            statePc = 89;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        ob.field_H = 1;
                        var4 = var1_ref.g(2);
                        uc.field_r = var4.intern();
                        var5 = var1_ref.b((byte) 90);
                        lb.a(true, var5);
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 90: {
                    return;
                }
                case 91: {
                    try {
                        pe.a((byte) -13, (Throwable) null, "F1: " + sj.b(true));
                        th.a(113);
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 93: {
                    var1 = (RuntimeException) (Object) caughtException;
                    throw dd.a((Throwable) (Object) var1, "vc.E(" + param0 + 41);
                }
                case 94: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0) {
        int var2_int = 0;
        int var4 = OrbDefence.field_D ? 1 : 0;
        try {
            var2_int = 0;
            do {
                // if_icmpge L28
                ((vc) this).field_l[var2_int] = (byte) 0;
                var2_int++;
            } while (var4 == 0);
            int var3 = -126 / ((param0 - 59) / 36);
            ((vc) this).field_h[0] = (byte) 0;
            ((vc) this).field_e = 0;
            ((vc) this).field_d = 0;
            var2_int = 0;
            do {
                // if_icmple L90
                ((vc) this).field_k[var2_int] = 0L;
                var2_int++;
                // ifne L123
            } while (var4 == 0);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "vc.F(" + param0 + 41);
        }
    }

    public static void a(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            L0: {
              field_i = null;
              field_g = null;
              if (param0 > 68) {
                break L0;
              } else {
                field_b = null;
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          field_b = null;
          field_n = null;
        }
    }

    private final void a(boolean param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_62_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_61_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = 0;
                        var3 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (8 <= var2_int) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ((vc) this).field_m[var2_int] = j.a(j.a(j.a(bm.a((long)((vc) this).field_h[var3 - -5], 255L) << 2051365776, j.a(j.a(bm.a(255L, (long)((vc) this).field_h[3 + var3]) << -425352800, j.a(j.a(bm.a((long)((vc) this).field_h[1 + var3] << -378821776, 71776119061217280L), (long)((vc) this).field_h[var3] << -1378952264), bm.a(280375465082880L, (long)((vc) this).field_h[var3 - -2] << 565649832))), bm.a((long)((vc) this).field_h[var3 + 4], 255L) << 202782232)), bm.a((long)((vc) this).field_h[6 + var3], 255L) << 2010794632), bm.a((long)((vc) this).field_h[7 + var3], 255L));
                        var3 += 8;
                        var2_int++;
                        if (var6 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var6 == 0) {
                            statePc = 2;
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
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (!param0) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        vc.a((byte) -46);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var2_int = 0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (-9 >= (var2_int ^ -1)) {
                            statePc = 17;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        ((vc) this).field_o[var2_int] = ((vc) this).field_k[var2_int];
                        ((vc) this).field_c[var2_int] = j.a(((vc) this).field_m[var2_int], ((vc) this).field_k[var2_int]);
                        var2_int++;
                        if (var6 != 0) {
                            statePc = 18;
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
                        if (var6 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 15;
                        }
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
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var2_int = 1;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if ((var2_int ^ -1) < -11) {
                            statePc = 61;
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
                        stackOut_19_0 = 0;
                        stackIn_62_0 = stackOut_19_0;
                        stackIn_20_0 = stackOut_19_0;
                        if (var6 != 0) {
                            statePc = 62;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackOut_20_0 = stackIn_20_0;
                        stackIn_22_0 = stackOut_20_0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var3 = stackIn_22_0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (-9 >= (var3 ^ -1)) {
                            statePc = 33;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        ((vc) this).field_f[var3] = 0L;
                        var4 = 0;
                        stackOut_24_0 = 56;
                        stackIn_34_0 = stackOut_24_0;
                        stackIn_25_0 = stackOut_24_0;
                        if (var6 != 0) {
                            statePc = 34;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var5 = stackIn_25_0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if ((var4 ^ -1) <= -9) {
                            statePc = 31;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        ((vc) this).field_f[var3] = j.a(((vc) this).field_f[var3], nd.field_c[var4][vi.a((int)(((vc) this).field_o[vi.a(-var4 + var3, 7)] >>> var5), 255)]);
                        var4++;
                        var5 -= 8;
                        if (var6 != 0) {
                            statePc = 32;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (var6 == 0) {
                            statePc = 26;
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
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var3++;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (var6 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackOut_33_0 = 0;
                        stackIn_34_0 = stackOut_33_0;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var3 = stackIn_34_0;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (-9 >= (var3 ^ -1)) {
                            statePc = 40;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        ((vc) this).field_o[var3] = ((vc) this).field_f[var3];
                        var3++;
                        if (var6 != 0) {
                            statePc = 41;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (var6 == 0) {
                            statePc = 35;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        ((vc) this).field_o[0] = j.a(((vc) this).field_o[0], nd.field_d[var2_int]);
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var3 = 0;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if ((var3 ^ -1) <= -9) {
                            statePc = 52;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        ((vc) this).field_f[var3] = ((vc) this).field_o[var3];
                        var4 = 0;
                        stackOut_43_0 = 56;
                        stackIn_53_0 = stackOut_43_0;
                        stackIn_44_0 = stackOut_43_0;
                        if (var6 != 0) {
                            statePc = 53;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var5 = stackIn_44_0;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (var4 >= 8) {
                            statePc = 50;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        ((vc) this).field_f[var3] = j.a(((vc) this).field_f[var3], nd.field_c[var4][vi.a((int)(((vc) this).field_c[vi.a(var3 + -var4, 7)] >>> var5), 255)]);
                        var5 -= 8;
                        var4++;
                        if (var6 != 0) {
                            statePc = 51;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (var6 == 0) {
                            statePc = 45;
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
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var3++;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (var6 == 0) {
                            statePc = 42;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        stackOut_52_0 = 0;
                        stackIn_53_0 = stackOut_52_0;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var3 = stackIn_53_0;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if ((var3 ^ -1) <= -9) {
                            statePc = 59;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        ((vc) this).field_c[var3] = ((vc) this).field_f[var3];
                        var3++;
                        if (var6 != 0) {
                            statePc = 60;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (var6 == 0) {
                            statePc = 54;
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
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var2_int++;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (var6 == 0) {
                            statePc = 18;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        stackOut_61_0 = 0;
                        stackIn_62_0 = stackOut_61_0;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        var2_int = stackIn_62_0;
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (8 <= var2_int) {
                            statePc = 70;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        ((vc) this).field_k[var2_int] = j.a(((vc) this).field_k[var2_int], j.a(((vc) this).field_c[var2_int], ((vc) this).field_m[var2_int]));
                        var2_int++;
                        if (var6 != 0) {
                            statePc = 70;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        if (var6 == 0) {
                            statePc = 63;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 69: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw dd.a((Throwable) (Object) var2, "vc.B(" + param0 + 41);
                }
                case 70: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static int a(boolean param0, int param1, int param2, String param3, boolean param4, String param5) {
        try {
            RuntimeException var6 = null;
            int var6_int = 0;
            String var6_ref = null;
            int var7 = 0;
            Throwable var8_ref_Throwable = null;
            int var8 = 0;
            int var9 = 0;
            int stackIn_9_0 = 0;
            int stackIn_48_0 = 0;
            int stackIn_61_0 = 0;
            int stackIn_64_0 = 0;
            int stackIn_81_0 = 0;
            int stackIn_85_0 = 0;
            int stackIn_132_0 = 0;
            int stackIn_144_0 = 0;
            int stackIn_150_0 = 0;
            int stackIn_165_0 = 0;
            int stackIn_168_0 = 0;
            RuntimeException stackIn_171_0 = null;
            StringBuilder stackIn_171_1 = null;
            RuntimeException stackIn_173_0 = null;
            StringBuilder stackIn_173_1 = null;
            RuntimeException stackIn_174_0 = null;
            StringBuilder stackIn_174_1 = null;
            String stackIn_174_2 = null;
            RuntimeException stackIn_175_0 = null;
            StringBuilder stackIn_175_1 = null;
            RuntimeException stackIn_177_0 = null;
            StringBuilder stackIn_177_1 = null;
            RuntimeException stackIn_178_0 = null;
            StringBuilder stackIn_178_1 = null;
            String stackIn_178_2 = null;
            int stackOut_8_0 = 0;
            int stackOut_47_0 = 0;
            int stackOut_60_0 = 0;
            int stackOut_63_0 = 0;
            int stackOut_78_0 = 0;
            int stackOut_80_0 = 0;
            int stackOut_82_0 = 0;
            int stackOut_84_0 = 0;
            int stackOut_131_0 = 0;
            int stackOut_143_0 = 0;
            int stackOut_149_0 = 0;
            int stackOut_164_0 = 0;
            int stackOut_167_0 = 0;
            RuntimeException stackOut_170_0 = null;
            StringBuilder stackOut_170_1 = null;
            RuntimeException stackOut_171_0 = null;
            StringBuilder stackOut_171_1 = null;
            String stackOut_171_2 = null;
            RuntimeException stackOut_173_0 = null;
            StringBuilder stackOut_173_1 = null;
            String stackOut_173_2 = null;
            RuntimeException stackOut_174_0 = null;
            StringBuilder stackOut_174_1 = null;
            RuntimeException stackOut_175_0 = null;
            StringBuilder stackOut_175_1 = null;
            String stackOut_175_2 = null;
            RuntimeException stackOut_177_0 = null;
            StringBuilder stackOut_177_1 = null;
            String stackOut_177_2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var9 = OrbDefence.field_D ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (null == p.field_d) {
                                statePc = 4;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = (stateCaught_1 instanceof RuntimeException ? 169 : 3);
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = (stateCaught_2 instanceof RuntimeException ? 169 : 3);
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            var6_int = fg.a(param4, -66) ? 1 : 0;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (var6_int == 0) {
                                statePc = 8;
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
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            stackOut_8_0 = -1;
                            stackIn_9_0 = stackOut_8_0;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        return stackIn_9_0;
                    }
                    case 10: {
                        try {
                            if (dh.field_bb != sk.field_E) {
                                statePc = 21;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = (stateCaught_10 instanceof RuntimeException ? 169 : 13);
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            if (param4) {
                                statePc = 17;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            s.field_A = sj.a(true, param3, false, param5);
                            if (var9 == 0) {
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
                            s.field_A = f.a(false, p.field_c, (String) null, 17470, param5);
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
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            uk.field_b.field_i = 0;
                            uk.field_b.a(14, -111);
                            uk.field_b.a(s.field_A.a(10277).field_c, -53);
                            bh.a(-1, -1);
                            dh.field_bb = nh.field_c;
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (nh.field_c == dh.field_bb) {
                                statePc = 24;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 23;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 23;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if (!va.a(true, 1)) {
                                statePc = 34;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            var6_int = cd.field_t.b((byte) 90);
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            if (0 != var6_int) {
                                statePc = 30;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            dh.field_bb = wh.field_c;
                            if (var9 == 0) {
                                statePc = 33;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            ab.field_l = var6_int;
                            tf.field_c = -1;
                            dh.field_bb = hf.field_l;
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            cd.field_t.field_i = 0;
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if (wh.field_c == dh.field_bb) {
                                statePc = 37;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            if (va.a(true, 8)) {
                                statePc = 40;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 39;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            statePc = 41;
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
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            tg.field_a = cd.field_t.c((byte) -89);
                            cd.field_t.field_i = 0;
                            lg.a(3, param1, s.field_A, param4, param0);
                            dh.field_bb = da.field_m;
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            if (da.field_m != dh.field_bb) {
                                statePc = 62;
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
                            if (!va.a(true, 1)) {
                                statePc = 62;
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
                            statePc = 45;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            var6_int = cd.field_t.b((byte) 90);
                            statePc = 46;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            cd.field_t.field_i = 0;
                            ug.field_r = null;
                            ab.field_l = var6_int;
                            if ((var6_int ^ -1) == -1) {
                                statePc = 51;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = 50;
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            stackOut_47_0 = var6_int;
                            stackIn_48_0 = stackOut_47_0;
                            statePc = 48;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = 50;
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            if (stackIn_48_0 != 1) {
                                statePc = 54;
                            } else {
                                statePc = 49;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = 53;
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            statePc = 51;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 53;
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = 53;
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            dh.field_bb = lm.field_e;
                            tf.field_c = -1;
                            if (var9 == 0) {
                                statePc = 62;
                            } else {
                                statePc = 52;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = 56;
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 56;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 56;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            if (-9 == (var6_int ^ -1)) {
                                statePc = 60;
                            } else {
                                statePc = 55;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 59;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 59;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 59;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            dh.field_bb = hf.field_l;
                            tf.field_c = -1;
                            if (var9 == 0) {
                                statePc = 62;
                            } else {
                                statePc = 58;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 59;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            th.a(127);
                            ea.field_a = false;
                            stackOut_60_0 = var6_int;
                            stackIn_61_0 = stackOut_60_0;
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        return stackIn_61_0;
                    }
                    case 62: {
                        try {
                            if (param2 < -18) {
                                statePc = 65;
                            } else {
                                statePc = 63;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            stackOut_63_0 = 87;
                            stackIn_64_0 = stackOut_63_0;
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        return stackIn_64_0;
                    }
                    case 65: {
                        try {
                            if (dh.field_bb == lm.field_e) {
                                statePc = 68;
                            } else {
                                statePc = 66;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = (stateCaught_65 instanceof RuntimeException ? 169 : 67);
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            statePc = 133;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = (stateCaught_66 instanceof RuntimeException ? 169 : 67);
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            if (!ce.a(-60)) {
                                statePc = 133;
                            } else {
                                statePc = 69;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            p.field_c = cd.field_t.c((byte) -89);
                            va.field_d = cd.field_t.b((byte) 90);
                            int discarded$6 = cd.field_t.b((byte) 90);
                            tc.field_b = cd.field_t.j(98203176);
                            var6_ref = cd.field_t.i(-1);
                            var7 = cd.field_t.b((byte) 90);
                            statePc = 70;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            if (-1 != (var7 & 1 ^ -1)) {
                                statePc = 73;
                            } else {
                                statePc = 71;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            statePc = 74;
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            gd.a((byte) 124);
                            statePc = 74;
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            if (!param4) {
                                statePc = 77;
                            } else {
                                statePc = 75;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            statePc = 86;
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = 76;
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            if ((8 & var7) == 0) {
                                statePc = 80;
                            } else {
                                statePc = 78;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = 79;
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            stackOut_78_0 = 1;
                            stackIn_81_0 = stackOut_78_0;
                            statePc = 81;
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = 79;
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            stackOut_80_0 = 0;
                            stackIn_81_0 = stackOut_80_0;
                            statePc = 81;
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            pc.field_Z = stackIn_81_0 != 0;
                            if ((4 & var7 ^ -1) == -1) {
                                statePc = 84;
                            } else {
                                statePc = 82;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = 83;
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            stackOut_82_0 = 1;
                            stackIn_85_0 = stackOut_82_0;
                            statePc = 85;
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = 83;
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            stackOut_84_0 = 0;
                            stackIn_85_0 = stackOut_84_0;
                            statePc = 85;
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            jd.field_b = stackIn_85_0 != 0;
                            if (pc.field_Z) {
                                statePc = 86;
                            } else {
                                statePc = 86;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            if (mg.field_g) {
                                statePc = 89;
                            } else {
                                statePc = 87;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            statePc = 95;
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            int discarded$7 = cd.field_t.b((byte) 90);
                            int discarded$8 = cd.field_t.b((byte) 90);
                            int discarded$9 = cd.field_t.l(0);
                            cf.field_c = cd.field_t.j(98203176);
                            ij.field_h = new byte[cf.field_c];
                            var8 = 0;
                            statePc = 90;
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            if ((cf.field_c ^ -1) >= (var8 ^ -1)) {
                                statePc = 95;
                            } else {
                                statePc = 91;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            ij.field_h[var8] = cd.field_t.d(-20398);
                            var8++;
                            if (var9 != 0) {
                                statePc = 96;
                            } else {
                                statePc = 92;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            if (var9 == 0) {
                                statePc = 90;
                            } else {
                                statePc = 93;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            statePc = 95;
                            continue stateLoop;
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        try {
                            gb.field_h = cd.field_t.g(2);
                            sg.field_E = ua.a(90, (CharSequence) (Object) gb.field_h);
                            cb.field_j = cd.field_t.b((byte) 90);
                            dh.field_bb = da.field_r;
                            statePc = 96;
                            continue stateLoop;
                        } catch (Throwable stateCaught_95) {
                            caughtException = stateCaught_95;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 96: {
                        try {
                            if (s.field_A.a(10277) == ci.field_b) {
                                statePc = 103;
                            } else {
                                statePc = 97;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = 99;
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            if (s.field_A.a(10277) == oj.field_j) {
                                statePc = 102;
                            } else {
                                statePc = 98;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_97) {
                            caughtException = stateCaught_97;
                            statePc = 101;
                            continue stateLoop;
                        }
                    }
                    case 98: {
                        try {
                            statePc = 100;
                            continue stateLoop;
                        } catch (Throwable stateCaught_98) {
                            caughtException = stateCaught_98;
                            statePc = 101;
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = 101;
                            continue stateLoop;
                        }
                    }
                    case 100: {
                        try {
                            statePc = 106;
                            continue stateLoop;
                        } catch (Throwable stateCaught_100) {
                            caughtException = stateCaught_100;
                            statePc = 101;
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_101) {
                            caughtException = stateCaught_101;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 102: {
                        try {
                            vh.field_s.a(12423, uj.b((byte) -120));
                            if (var9 == 0) {
                                statePc = 106;
                            } else {
                                statePc = 103;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_102) {
                            caughtException = stateCaught_102;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 103: {
                        try {
                            mj.field_l.a(12423, uj.b((byte) -120));
                            statePc = 104;
                            continue stateLoop;
                        } catch (Throwable stateCaught_103) {
                            caughtException = stateCaught_103;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 104: {
                        try {
                            statePc = 106;
                            continue stateLoop;
                        } catch (Throwable stateCaught_104) {
                            caughtException = stateCaught_104;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 105: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_105) {
                            caughtException = stateCaught_105;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 106: {
                        try {
                            ea.field_a = false;
                            if (null != var6_ref) {
                                statePc = 109;
                            } else {
                                statePc = 107;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_106) {
                            caughtException = stateCaught_106;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 107: {
                        try {
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_107) {
                            caughtException = stateCaught_107;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 108: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_108) {
                            caughtException = stateCaught_108;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 109: {
                        try {
                            kb.a(uj.b((byte) -120), false, var6_ref);
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_109) {
                            caughtException = stateCaught_109;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 110: {
                        try {
                            if (0 < tc.field_b) {
                                statePc = 117;
                            } else {
                                statePc = 111;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_110) {
                            caughtException = stateCaught_110;
                            statePc = 113;
                            continue stateLoop;
                        }
                    }
                    case 111: {
                        try {
                            if (jd.field_b) {
                                statePc = 117;
                            } else {
                                statePc = 112;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_111) {
                            caughtException = stateCaught_111;
                            statePc = 113;
                            continue stateLoop;
                        }
                    }
                    case 112: {
                        try {
                            statePc = 114;
                            continue stateLoop;
                        } catch (Throwable stateCaught_112) {
                            caughtException = stateCaught_112;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 113: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_113) {
                            caughtException = stateCaught_113;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 114: {
                        try {
                            Object discarded$10 = gm.a(-31183, "unzap", uj.b((byte) -120));
                            statePc = 115;
                            continue stateLoop;
                        } catch (Throwable stateCaught_114) {
                            caughtException = stateCaught_114;
                            statePc = 116;
                            continue stateLoop;
                        }
                    }
                    case 115: {
                        try {
                            statePc = 120;
                            continue stateLoop;
                        } catch (Throwable stateCaught_115) {
                            caughtException = stateCaught_115;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 116: {
                        try {
                            var8_ref_Throwable = caughtException;
                            if (var9 == 0) {
                                statePc = 120;
                            } else {
                                statePc = 117;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_116) {
                            caughtException = stateCaught_116;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 117: {
                        try {
                            Object discarded$11 = gm.a(true, "zap", new Object[1], uj.b((byte) -120));
                            statePc = 118;
                            continue stateLoop;
                        } catch (Throwable stateCaught_117) {
                            caughtException = stateCaught_117;
                            statePc = 119;
                            continue stateLoop;
                        }
                    }
                    case 118: {
                        try {
                            statePc = 120;
                            continue stateLoop;
                        } catch (Throwable stateCaught_118) {
                            caughtException = stateCaught_118;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 119: {
                        try {
                            var8_ref_Throwable = caughtException;
                            statePc = 120;
                            continue stateLoop;
                        } catch (Throwable stateCaught_119) {
                            caughtException = stateCaught_119;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 120: {
                        try {
                            if ((tc.field_b ^ -1) < -1) {
                                statePc = 123;
                            } else {
                                statePc = 121;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_120) {
                            caughtException = stateCaught_120;
                            statePc = 122;
                            continue stateLoop;
                        }
                    }
                    case 121: {
                        try {
                            statePc = 124;
                            continue stateLoop;
                        } catch (Throwable stateCaught_121) {
                            caughtException = stateCaught_121;
                            statePc = 122;
                            continue stateLoop;
                        }
                    }
                    case 122: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_122) {
                            caughtException = stateCaught_122;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 123: {
                        try {
                            jc.field_b = true;
                            statePc = 124;
                            continue stateLoop;
                        } catch (Throwable stateCaught_123) {
                            caughtException = stateCaught_123;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 124: {
                        try {
                            uk.field_b.b(og.field_n, 3777);
                            var8 = 0;
                            statePc = 125;
                            continue stateLoop;
                        } catch (Throwable stateCaught_124) {
                            caughtException = stateCaught_124;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 125: {
                        try {
                            if (4 <= var8) {
                                statePc = 130;
                            } else {
                                statePc = 126;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_125) {
                            caughtException = stateCaught_125;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 126: {
                        try {
                            og.field_n[var8] = og.field_n[var8] + 50;
                            var8++;
                            if (var9 != 0) {
                                statePc = 131;
                            } else {
                                statePc = 127;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_126) {
                            caughtException = stateCaught_126;
                            statePc = 129;
                            continue stateLoop;
                        }
                    }
                    case 127: {
                        try {
                            if (var9 == 0) {
                                statePc = 125;
                            } else {
                                statePc = 128;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_127) {
                            caughtException = stateCaught_127;
                            statePc = 129;
                            continue stateLoop;
                        }
                    }
                    case 128: {
                        try {
                            statePc = 130;
                            continue stateLoop;
                        } catch (Throwable stateCaught_128) {
                            caughtException = stateCaught_128;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 129: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_129) {
                            caughtException = stateCaught_129;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 130: {
                        try {
                            cd.field_t.b(og.field_n, 3777);
                            statePc = 131;
                            continue stateLoop;
                        } catch (Throwable stateCaught_130) {
                            caughtException = stateCaught_130;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 131: {
                        try {
                            stackOut_131_0 = ab.field_l;
                            stackIn_132_0 = stackOut_131_0;
                            statePc = 132;
                            continue stateLoop;
                        } catch (Throwable stateCaught_131) {
                            caughtException = stateCaught_131;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 132: {
                        return stackIn_132_0;
                    }
                    case 133: {
                        try {
                            if (hf.field_l == dh.field_bb) {
                                statePc = 136;
                            } else {
                                statePc = 134;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_133) {
                            caughtException = stateCaught_133;
                            statePc = (stateCaught_133 instanceof RuntimeException ? 169 : 135);
                            continue stateLoop;
                        }
                    }
                    case 134: {
                        try {
                            statePc = 151;
                            continue stateLoop;
                        } catch (Throwable stateCaught_134) {
                            caughtException = stateCaught_134;
                            statePc = (stateCaught_134 instanceof RuntimeException ? 169 : 135);
                            continue stateLoop;
                        }
                    }
                    case 135: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_135) {
                            caughtException = stateCaught_135;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 136: {
                        try {
                            if (!ce.a(-114)) {
                                statePc = 151;
                            } else {
                                statePc = 137;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_136) {
                            caughtException = stateCaught_136;
                            statePc = 139;
                            continue stateLoop;
                        }
                    }
                    case 137: {
                        try {
                            th.a(114);
                            if (7 != ab.field_l) {
                                statePc = 145;
                            } else {
                                statePc = 138;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_137) {
                            caughtException = stateCaught_137;
                            statePc = 142;
                            continue stateLoop;
                        }
                    }
                    case 138: {
                        try {
                            statePc = 140;
                            continue stateLoop;
                        } catch (Throwable stateCaught_138) {
                            caughtException = stateCaught_138;
                            statePc = 142;
                            continue stateLoop;
                        }
                    }
                    case 139: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_139) {
                            caughtException = stateCaught_139;
                            statePc = 142;
                            continue stateLoop;
                        }
                    }
                    case 140: {
                        try {
                            if (ea.field_a) {
                                statePc = 145;
                            } else {
                                statePc = 141;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_140) {
                            caughtException = stateCaught_140;
                            statePc = 142;
                            continue stateLoop;
                        }
                    }
                    case 141: {
                        try {
                            statePc = 143;
                            continue stateLoop;
                        } catch (Throwable stateCaught_141) {
                            caughtException = stateCaught_141;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 142: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_142) {
                            caughtException = stateCaught_142;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 143: {
                        try {
                            ea.field_a = true;
                            stackOut_143_0 = -1;
                            stackIn_144_0 = stackOut_143_0;
                            statePc = 144;
                            continue stateLoop;
                        } catch (Throwable stateCaught_143) {
                            caughtException = stateCaught_143;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 144: {
                        return stackIn_144_0;
                    }
                    case 145: {
                        try {
                            if (-8 == (ab.field_l ^ -1)) {
                                statePc = 148;
                            } else {
                                statePc = 146;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_145) {
                            caughtException = stateCaught_145;
                            statePc = (stateCaught_145 instanceof RuntimeException ? 169 : 147);
                            continue stateLoop;
                        }
                    }
                    case 146: {
                        try {
                            statePc = 149;
                            continue stateLoop;
                        } catch (Throwable stateCaught_146) {
                            caughtException = stateCaught_146;
                            statePc = (stateCaught_146 instanceof RuntimeException ? 169 : 147);
                            continue stateLoop;
                        }
                    }
                    case 147: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_147) {
                            caughtException = stateCaught_147;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 148: {
                        try {
                            ab.field_l = 3;
                            statePc = 149;
                            continue stateLoop;
                        } catch (Throwable stateCaught_148) {
                            caughtException = stateCaught_148;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 149: {
                        try {
                            kk.field_Y = cd.field_t.g(2);
                            ea.field_a = false;
                            stackOut_149_0 = ab.field_l;
                            stackIn_150_0 = stackOut_149_0;
                            statePc = 150;
                            continue stateLoop;
                        } catch (Throwable stateCaught_149) {
                            caughtException = stateCaught_149;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 150: {
                        return stackIn_150_0;
                    }
                    case 151: {
                        try {
                            if (null == p.field_d) {
                                statePc = 154;
                            } else {
                                statePc = 152;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_151) {
                            caughtException = stateCaught_151;
                            statePc = (stateCaught_151 instanceof RuntimeException ? 169 : 153);
                            continue stateLoop;
                        }
                    }
                    case 152: {
                        try {
                            statePc = 167;
                            continue stateLoop;
                        } catch (Throwable stateCaught_152) {
                            caughtException = stateCaught_152;
                            statePc = (stateCaught_152 instanceof RuntimeException ? 169 : 153);
                            continue stateLoop;
                        }
                    }
                    case 153: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_153) {
                            caughtException = stateCaught_153;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 154: {
                        try {
                            if (!ea.field_a) {
                                statePc = 166;
                            } else {
                                statePc = 155;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_154) {
                            caughtException = stateCaught_154;
                            statePc = 157;
                            continue stateLoop;
                        }
                    }
                    case 155: {
                        try {
                            if (30000L >= ed.b(-1)) {
                                statePc = 161;
                            } else {
                                statePc = 156;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_155) {
                            caughtException = stateCaught_155;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 156: {
                        try {
                            statePc = 158;
                            continue stateLoop;
                        } catch (Throwable stateCaught_156) {
                            caughtException = stateCaught_156;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 157: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_157) {
                            caughtException = stateCaught_157;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 158: {
                        try {
                            kk.field_Y = ee.field_c;
                            if (var9 == 0) {
                                statePc = 164;
                            } else {
                                statePc = 159;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_158) {
                            caughtException = stateCaught_158;
                            statePc = 163;
                            continue stateLoop;
                        }
                    }
                    case 159: {
                        try {
                            statePc = 161;
                            continue stateLoop;
                        } catch (Throwable stateCaught_159) {
                            caughtException = stateCaught_159;
                            statePc = 163;
                            continue stateLoop;
                        }
                    }
                    case 160: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_160) {
                            caughtException = stateCaught_160;
                            statePc = 163;
                            continue stateLoop;
                        }
                    }
                    case 161: {
                        try {
                            kk.field_Y = dj.field_j;
                            statePc = 162;
                            continue stateLoop;
                        } catch (Throwable stateCaught_161) {
                            caughtException = stateCaught_161;
                            statePc = 163;
                            continue stateLoop;
                        }
                    }
                    case 162: {
                        try {
                            statePc = 164;
                            continue stateLoop;
                        } catch (Throwable stateCaught_162) {
                            caughtException = stateCaught_162;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 163: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_163) {
                            caughtException = stateCaught_163;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 164: {
                        try {
                            ea.field_a = false;
                            stackOut_164_0 = 3;
                            stackIn_165_0 = stackOut_164_0;
                            statePc = 165;
                            continue stateLoop;
                        } catch (Throwable stateCaught_164) {
                            caughtException = stateCaught_164;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 165: {
                        return stackIn_165_0;
                    }
                    case 166: {
                        try {
                            var6_int = eg.field_v;
                            eg.field_v = sj.field_x;
                            sj.field_x = var6_int;
                            ea.field_a = true;
                            statePc = 167;
                            continue stateLoop;
                        } catch (Throwable stateCaught_166) {
                            caughtException = stateCaught_166;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 167: {
                        try {
                            stackOut_167_0 = -1;
                            stackIn_168_0 = stackOut_167_0;
                            statePc = 168;
                            continue stateLoop;
                        } catch (Throwable stateCaught_167) {
                            caughtException = stateCaught_167;
                            statePc = 169;
                            continue stateLoop;
                        }
                    }
                    case 168: {
                        return stackIn_168_0;
                    }
                    case 169: {
                        var6 = (RuntimeException) (Object) caughtException;
                        statePc = 170;
                        continue stateLoop;
                    }
                    case 170: {
                        try {
                            stackOut_170_0 = (RuntimeException) var6;
                            stackOut_170_1 = new StringBuilder().append("vc.C(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
                            stackIn_173_0 = stackOut_170_0;
                            stackIn_173_1 = stackOut_170_1;
                            stackIn_171_0 = stackOut_170_0;
                            stackIn_171_1 = stackOut_170_1;
                            if (param3 == null) {
                                statePc = 173;
                            } else {
                                statePc = 171;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_170) {
                            caughtException = stateCaught_170;
                            statePc = 172;
                            continue stateLoop;
                        }
                    }
                    case 171: {
                        try {
                            stackOut_171_0 = (RuntimeException) (Object) stackIn_171_0;
                            stackOut_171_1 = (StringBuilder) (Object) stackIn_171_1;
                            stackOut_171_2 = "{...}";
                            stackIn_174_0 = stackOut_171_0;
                            stackIn_174_1 = stackOut_171_1;
                            stackIn_174_2 = stackOut_171_2;
                            statePc = 174;
                            continue stateLoop;
                        } catch (Throwable stateCaught_171) {
                            caughtException = stateCaught_171;
                            statePc = 172;
                            continue stateLoop;
                        }
                    }
                    case 172: {
                        throw (RuntimeException) (Object) caughtException;
                    }
                    case 173: {
                        stackOut_173_0 = (RuntimeException) (Object) stackIn_173_0;
                        stackOut_173_1 = (StringBuilder) (Object) stackIn_173_1;
                        stackOut_173_2 = "null";
                        stackIn_174_0 = stackOut_173_0;
                        stackIn_174_1 = stackOut_173_1;
                        stackIn_174_2 = stackOut_173_2;
                        statePc = 174;
                        continue stateLoop;
                    }
                    case 174: {
                        try {
                            stackOut_174_0 = (RuntimeException) (Object) stackIn_174_0;
                            stackOut_174_1 = ((StringBuilder) (Object) stackIn_174_1).append(stackIn_174_2).append(44).append(param4).append(44);
                            stackIn_177_0 = stackOut_174_0;
                            stackIn_177_1 = stackOut_174_1;
                            stackIn_175_0 = stackOut_174_0;
                            stackIn_175_1 = stackOut_174_1;
                            if (param5 == null) {
                                statePc = 177;
                            } else {
                                statePc = 175;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_174) {
                            caughtException = stateCaught_174;
                            statePc = 176;
                            continue stateLoop;
                        }
                    }
                    case 175: {
                        try {
                            stackOut_175_0 = (RuntimeException) (Object) stackIn_175_0;
                            stackOut_175_1 = (StringBuilder) (Object) stackIn_175_1;
                            stackOut_175_2 = "{...}";
                            stackIn_178_0 = stackOut_175_0;
                            stackIn_178_1 = stackOut_175_1;
                            stackIn_178_2 = stackOut_175_2;
                            statePc = 178;
                            continue stateLoop;
                        } catch (Throwable stateCaught_175) {
                            caughtException = stateCaught_175;
                            statePc = 176;
                            continue stateLoop;
                        }
                    }
                    case 176: {
                        throw (RuntimeException) (Object) caughtException;
                    }
                    case 177: {
                        stackOut_177_0 = (RuntimeException) (Object) stackIn_177_0;
                        stackOut_177_1 = (StringBuilder) (Object) stackIn_177_1;
                        stackOut_177_2 = "null";
                        stackIn_178_0 = stackOut_177_0;
                        stackIn_178_1 = stackOut_177_1;
                        stackIn_178_2 = stackOut_177_2;
                        statePc = 178;
                        continue stateLoop;
                    }
                    case 178: {
                        throw dd.a((Throwable) (Object) stackIn_178_0, stackIn_178_2 + 41);
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

    final void a(byte[] param0, byte param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ((vc) this).field_h[((vc) this).field_d] = (byte)ge.a((int) ((vc) this).field_h[((vc) this).field_d], 128 >>> vi.a(7, ((vc) this).field_e));
                        ((vc) this).field_d = ((vc) this).field_d + 1;
                        if ((((vc) this).field_d ^ -1) >= -33) {
                            statePc = 11;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (((vc) this).field_d >= 64) {
                            statePc = 9;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        ((vc) this).field_d = ((vc) this).field_d + 1;
                        ((vc) this).field_h[((vc) this).field_d] = (byte) 0;
                        if (var8 != 0) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var8 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        this.a(false);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        ((vc) this).field_d = 0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (-33 >= (((vc) this).field_d ^ -1)) {
                            statePc = 16;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        ((vc) this).field_d = ((vc) this).field_d + 1;
                        ((vc) this).field_h[((vc) this).field_d] = (byte) 0;
                        if (var8 != 0) {
                            statePc = 17;
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
                        if (var8 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        mk.a(((vc) this).field_l, 0, ((vc) this).field_h, 32, 32);
                        this.a(false);
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (param1 == 87) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 18: {
                    return;
                }
                case 19: {
                    try {
                        var4_int = 0;
                        var5 = param2;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var4_int >= 8) {
                            statePc = 33;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var6 = ((vc) this).field_k[var4_int];
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        param0[var5] = (byte)(int)(var6 >>> -933256776);
                        param0[var5 + 1] = (byte)(int)(var6 >>> 1274928624);
                        param0[2 + var5] = (byte)(int)(var6 >>> -1748756696);
                        param0[3 + var5] = (byte)(int)(var6 >>> -1833203296);
                        param0[4 + var5] = (byte)(int)(var6 >>> 1717101592);
                        param0[5 + var5] = (byte)(int)(var6 >>> 814108304);
                        param0[var5 + 6] = (byte)(int)(var6 >>> -795935224);
                        param0[7 + var5] = (byte)(int)var6;
                        var5 += 8;
                        var4_int++;
                        if (var8 != 0) {
                            statePc = 33;
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
                        if (var8 == 0) {
                            statePc = 20;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 33;
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
                case 27: {
                    var4 = (RuntimeException) (Object) caughtException;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    try {
                        stackOut_28_0 = (RuntimeException) var4;
                        stackOut_28_1 = new StringBuilder().append("vc.G(");
                        stackIn_31_0 = stackOut_28_0;
                        stackIn_31_1 = stackOut_28_1;
                        stackIn_29_0 = stackOut_28_0;
                        stackIn_29_1 = stackOut_28_1;
                        if (param0 == null) {
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
                        stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
                        stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
                        stackOut_29_2 = "{...}";
                        stackIn_32_0 = stackOut_29_0;
                        stackIn_32_1 = stackOut_29_1;
                        stackIn_32_2 = stackOut_29_2;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 30: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 31: {
                    stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
                    stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
                    stackOut_31_2 = "null";
                    stackIn_32_0 = stackOut_31_0;
                    stackIn_32_1 = stackOut_31_1;
                    stackIn_32_2 = stackOut_31_2;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    throw dd.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + 44 + param1 + 44 + param2 + 41);
                }
                case 33: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    vc() {
        ((vc) this).field_k = new long[8];
        ((vc) this).field_e = 0;
        ((vc) this).field_o = new long[8];
        ((vc) this).field_f = new long[8];
        ((vc) this).field_m = new long[8];
        ((vc) this).field_d = 0;
        ((vc) this).field_c = new long[8];
        ((vc) this).field_h = new byte[64];
        ((vc) this).field_l = new byte[32];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = false;
        field_j = 20000000L;
        field_n = "Reload game";
        field_i = "Back";
        field_b = "Password is valid";
    }
}
