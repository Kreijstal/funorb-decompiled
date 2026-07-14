/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bn extends IOException {
    static String field_a;
    static ve field_b;
    static r field_c;

    final static boolean a(int param0, int[] param1) {
        RuntimeException var2 = null;
        long var2_long = 0L;
        tc var4_ref_tc = null;
        int var4 = 0;
        tc var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_5_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_31_0 = 0;
        boolean stackIn_34_0 = false;
        int stackIn_39_0 = 0;
        boolean stackIn_42_0 = false;
        int stackIn_45_0 = 0;
        int stackIn_62_0 = 0;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
        int stackOut_4_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_30_0 = 0;
        boolean stackOut_33_0 = false;
        int stackOut_38_0 = 0;
        boolean stackOut_41_0 = false;
        int stackOut_44_0 = 0;
        int stackOut_61_0 = 0;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = TetraLink.field_J;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (li.field_a != qi.field_p) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = 0;
                        stackIn_5_0 = stackOut_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return stackIn_5_0 != 0;
                }
                case 6: {
                    try {
                        var2_long = k.a(0);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (param0 == -19161) {
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
                        boolean discarded$1 = bn.a(-56, 104);
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
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (i.field_f == 0) {
                            statePc = 32;
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
                        stackOut_12_0 = -1;
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
                        if (stackIn_13_0 < (ti.field_e ^ -1)) {
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
                        statePc = 32;
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
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var4_ref_tc = (tc) (Object) v.field_z.c(false);
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (null == var4_ref_tc) {
                            statePc = 32;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var4_ref_tc.field_r >= var2_long) {
                            statePc = 32;
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
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var4_ref_tc.b(false);
                        rl.field_d = var4_ref_tc.field_o.length;
                        kb.field_q.field_t = 0;
                        var5_int = 0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (rl.field_d <= var5_int) {
                            statePc = 29;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        kb.field_q.field_u[var5_int] = var4_ref_tc.field_o[var5_int];
                        var5_int++;
                        if (var7 != 0) {
                            statePc = 30;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (var7 == 0) {
                            statePc = 24;
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
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        mh.field_g = lk.field_sb;
                        lk.field_sb = md.field_A;
                        md.field_A = ua.field_c;
                        ua.field_c = var4_ref_tc.field_u;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackOut_30_0 = 1;
                        stackIn_31_0 = stackOut_30_0;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 31: {
                    return stackIn_31_0 != 0;
                }
                case 32: {
                    try {
                        if ((ti.field_e ^ -1) <= -1) {
                            statePc = 41;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        kb.field_q.field_t = 0;
                        stackOut_33_0 = en.b(97, 1);
                        stackIn_42_0 = stackOut_33_0;
                        stackIn_34_0 = stackOut_33_0;
                        if (var7 != 0) {
                            statePc = 42;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (!stackIn_34_0) {
                            statePc = 38;
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
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackOut_38_0 = 0;
                        stackIn_39_0 = stackOut_38_0;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 39: {
                    return stackIn_39_0 != 0;
                }
                case 40: {
                    try {
                        ti.field_e = kb.field_q.d(false);
                        kb.field_q.field_t = 0;
                        rl.field_d = param1[ti.field_e];
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        stackOut_41_0 = ua.b(-73);
                        stackIn_42_0 = stackOut_41_0;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (!stackIn_42_0) {
                            statePc = 44;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        stackOut_44_0 = 0;
                        stackIn_45_0 = stackOut_44_0;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 45: {
                    return stackIn_45_0 != 0;
                }
                case 46: {
                    try {
                        if (i.field_f == 0) {
                            statePc = 61;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var4 = i.field_f;
                        if (0.0 == jg.field_f) {
                            statePc = 53;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var4 = (int)((double)var4 + ca.field_i.nextGaussian() * jg.field_f);
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (var4 < 0) {
                            statePc = 52;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var4 = 0;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var5 = new tc(var2_long + (long)var4, ti.field_e, new byte[rl.field_d]);
                        var6 = 0;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if ((var6 ^ -1) <= (rl.field_d ^ -1)) {
                            statePc = 59;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var5.field_o[var6] = kb.field_q.field_u[var6];
                        var6++;
                        if (var7 != 0) {
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
                        if (var7 == 0) {
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
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        v.field_z.a((mc) (Object) var5, false);
                        ti.field_e = -1;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (var7 == 0) {
                            statePc = 32;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        mh.field_g = lk.field_sb;
                        lk.field_sb = md.field_A;
                        md.field_A = ua.field_c;
                        ua.field_c = ti.field_e;
                        ti.field_e = -1;
                        stackOut_61_0 = 1;
                        stackIn_62_0 = stackOut_61_0;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 62: {
                    return stackIn_62_0 != 0;
                }
                case 63: {
                    var2 = (RuntimeException) (Object) caughtException;
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    try {
                        stackOut_64_0 = (RuntimeException) var2;
                        stackOut_64_1 = new StringBuilder().append("bn.B(").append(param0).append(44);
                        stackIn_67_0 = stackOut_64_0;
                        stackIn_67_1 = stackOut_64_1;
                        stackIn_65_0 = stackOut_64_0;
                        stackIn_65_1 = stackOut_64_1;
                        if (param1 == null) {
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
                        stackOut_65_0 = (RuntimeException) (Object) stackIn_65_0;
                        stackOut_65_1 = (StringBuilder) (Object) stackIn_65_1;
                        stackOut_65_2 = "{...}";
                        stackIn_68_0 = stackOut_65_0;
                        stackIn_68_1 = stackOut_65_1;
                        stackIn_68_2 = stackOut_65_2;
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 66: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 67: {
                    stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
                    stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
                    stackOut_67_2 = "null";
                    stackIn_68_0 = stackOut_67_0;
                    stackIn_68_1 = stackOut_67_1;
                    stackIn_68_2 = stackOut_67_2;
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    throw oi.a((Throwable) (Object) stackIn_68_0, stackIn_68_2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    bn(String param0) {
        super(param0);
    }

    final static boolean a(int param0) {
        RuntimeException var1 = null;
        boolean stackIn_5_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_4_0 = false;
        try {
          try {
            L0: {
              if (param0 == 21747) {
                break L0;
              } else {
                bn.a(-95, 3, (int[]) null, -127, 20, (int[]) null, (kc) null, 45, (int[]) null, -111, -45, (int[]) null, (int[]) null, 93, -71, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, 104, (byte[]) null, (int[]) null);
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_4_0 = mb.field_u.a(param0 + -21738);
          stackIn_5_0 = stackOut_4_0;
        }
        return false;
    }

    final static boolean a(int param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_30_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_29_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param1 >= 0) {
                            statePc = 8;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        if (((param1 + 1) % 4 ^ -1) != -1) {
                            statePc = 6;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 5;
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
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 31;
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
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return stackIn_7_0 != 0;
                }
                case 8: {
                    try {
                        if (1582 <= param1) {
                            statePc = 16;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (param1 % 4 != 0) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = 1;
                        stackIn_15_0 = stackOut_12_0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackOut_14_0 = 0;
                        stackIn_15_0 = stackOut_14_0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 15: {
                    return stackIn_15_0 != 0;
                }
                case 16: {
                    try {
                        if ((param1 % 4 ^ -1) == -1) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 31;
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
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 18: {
                    return stackIn_18_0 != 0;
                }
                case 19: {
                    try {
                        if ((param1 % 100 ^ -1) == -1) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackOut_20_0 = 1;
                        stackIn_21_0 = stackOut_20_0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 21: {
                    return stackIn_21_0 != 0;
                }
                case 22: {
                    try {
                        if ((param1 % 400 ^ -1) == -1) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackOut_23_0 = 0;
                        stackIn_24_0 = stackOut_23_0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 24: {
                    return stackIn_24_0 != 0;
                }
                case 25: {
                    try {
                        if (param0 == 1) {
                            statePc = 29;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        field_b = null;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackOut_29_0 = 1;
                        stackIn_30_0 = stackOut_29_0;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 30: {
                    return stackIn_30_0 != 0;
                }
                case 31: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw oi.a((Throwable) (Object) var2, "bn.D(" + param0 + 44 + param1 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void b(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            L0: {
              if (param0 == -26623) {
                break L0;
              } else {
                field_c = null;
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
          field_c = null;
          field_b = null;
        }
    }

    final static void a(int param0, int param1, int[] param2, int param3, int param4, int[] param5, kc param6, int param7, int[] param8, int param9, int param10, int[] param11, int[] param12, int param13, int param14, int[] param15, int[] param16, int[] param17, int[] param18, int[] param19, int[] param20, int param21, byte[] param22, int[] param23) {
        int var24_int = 0;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
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
        int var44 = 0;
        int var45 = 0;
        int var46 = 0;
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        int var52 = 0;
        int var53 = 0;
        int[] var54 = null;
        int var55 = 0;
        int var56 = 0;
        int var57 = 0;
        int var58 = 0;
        int var59 = 0;
        int var60 = 0;
        int var61 = 0;
        int var62 = 0;
        int var63 = 0;
        int var64 = 0;
        int var65 = 0;
        int stackIn_53_0 = 0;
        int stackIn_53_1 = 0;
        int stackIn_72_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_190_0 = 0;
        int stackIn_190_1 = 0;
        int stackOut_52_0 = 0;
        int stackOut_52_1 = 0;
        int stackOut_70_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_189_0 = 0;
        int stackOut_189_1 = 0;
        L0: {
          L1: {
            var65 = TetraLink.field_J;
            if (a.field_b == null) {
              break L1;
            } else {
              if ((param21 ^ -1) < (a.field_b.length ^ -1)) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          var24_int = 100 + param21;
          uj.field_q = new int[var24_int];
          a.field_b = new int[var24_int];
          break L0;
        }
        L2: {
          L3: {
            if (rl.field_c == null) {
              break L3;
            } else {
              if ((rl.field_c.length ^ -1) <= (param7 * 2 ^ -1)) {
                break L2;
              } else {
                break L3;
              }
            }
          }
          var24_int = 2 * param7 + 100;
          rl.field_c = new int[var24_int];
          gm.field_b = new int[var24_int];
          break L2;
        }
        L4: {
          var24 = a.field_b;
          if (lm.field_f != null) {
            break L4;
          } else {
            lm.field_f = new int[16];
            break L4;
          }
        }
        L5: {
          L6: {
            var25 = uj.field_q;
            var26 = lm.field_f;
            var27 = rl.field_c;
            mf.field_u = 0;
            var28 = gm.field_b;
            k.field_e = 0;
            fh.field_g = 0;
            le.field_Xb = 0;
            if (null == ic.field_c) {
              break L6;
            } else {
              if ((ic.field_c.length ^ -1) > (param21 ^ -1)) {
                break L6;
              } else {
                break L5;
              }
            }
          }
          ic.field_c = new int[param21 - -100];
          bd.field_a = new int[100 + param21];
          nn.field_S = new int[100 + param21];
          break L5;
        }
        L7: {
          L8: {
            if (null == ja.field_l) {
              break L8;
            } else {
              if (ja.field_l.length >= param7) {
                break L7;
              } else {
                break L8;
              }
            }
          }
          ja.field_l = new int[100 + param7];
          db.field_f = new int[param7 + 100];
          wk.field_b = new int[param7 + 100];
          break L7;
        }
        L9: {
          if (null == param18) {
            break L9;
          } else {
            L10: {
              if (mc.field_m == null) {
                break L10;
              } else {
                if (mc.field_m.length >= param7) {
                  break L9;
                } else {
                  break L10;
                }
              }
            }
            rk.field_b = new int[100 + param7];
            mc.field_m = new int[param7 + 100];
            tc.field_w = new int[100 + param7];
            break L9;
          }
        }
        L11: {
          L12: {
            if (null == am.field_b) {
              break L12;
            } else {
              if ((param21 ^ -1) >= (am.field_b.length ^ -1)) {
                break L11;
              } else {
                break L12;
              }
            }
          }
          cm.field_q = new int[100 + param21];
          am.field_b = new int[100 + param21];
          gd.field_Zb = new int[param21 - -100];
          break L11;
        }
        L13: {
          L14: {
            if (null == ve.field_a) {
              break L14;
            } else {
              if (ve.field_a.length < param7) {
                break L14;
              } else {
                break L13;
              }
            }
          }
          kj.field_d = new int[100 + param7];
          ve.field_a = new int[100 + param7];
          hd.field_D = new int[100 + param7];
          break L13;
        }
        L15: {
          if (null == param18) {
            break L15;
          } else {
            L16: {
              if (ga.field_b == null) {
                break L16;
              } else {
                if (param7 > ga.field_b.length) {
                  break L16;
                } else {
                  break L15;
                }
              }
            }
            ga.field_b = new int[param7 - -100];
            fj.field_p = new int[param7 - -100];
            om.field_Yb = new int[param7 + 100];
            break L15;
          }
        }
        var29 = 0;
        var30 = 0;
        var31 = 0;
        var33 = 0;
        L17: while (true) {
          L18: {
            if ((param21 ^ -1) >= (var33 ^ -1)) {
              break L18;
            } else {
              var24[var33] = -1;
              var33++;
              if (var65 == 0) {
                continue L17;
              } else {
                break L18;
              }
            }
          }
          var32 = 0;
          if (param13 > 18) {
            var33 = 0;
            L19: while (true) {
              L20: {
                if (param21 <= var33) {
                  break L20;
                } else {
                  var25[var33] = -1;
                  var33++;
                  if (var65 == 0) {
                    continue L19;
                  } else {
                    break L20;
                  }
                }
              }
              var35 = 0;
              var36 = 0;
              var37 = 0;
              var38 = 0;
              L21: while (true) {
                L22: {
                  L23: {
                    if ((var38 ^ -1) <= (param7 ^ -1)) {
                      break L23;
                    } else {
                      var39 = param2[var38];
                      var40 = param23[var38];
                      var41 = param20[var38];
                      var42 = param12[var39];
                      var43 = param5[var39];
                      var44 = param11[var39];
                      var45 = param12[var40];
                      var46 = param5[var40];
                      var47 = param11[var40];
                      var48 = param12[var41];
                      var49 = param5[var41];
                      var50 = param11[var41];
                      var51 = param3 * (-param14 + var44) + param4 * (-param1 + var42) - -((-param0 + var43) * param9);
                      var52 = param9 * (var46 + -param0) + ((-param1 + var45) * param4 + param3 * (var47 + -param14));
                      var53 = param4 * (-param1 + var48) - -(param9 * (var49 + -param0)) + param3 * (-param14 + var50);
                      stackOut_52_0 = (var53 | (var52 | var51)) ^ -1;
                      stackOut_52_1 = -1;
                      stackIn_190_0 = stackOut_52_0;
                      stackIn_190_1 = stackOut_52_1;
                      stackIn_53_0 = stackOut_52_0;
                      stackIn_53_1 = stackOut_52_1;
                      if (var65 != 0) {
                        break L22;
                      } else {
                        L24: {
                          L25: {
                            if (stackIn_53_0 <= stackIn_53_1) {
                              break L25;
                            } else {
                              L26: {
                                if (((-var53 | (-var52 | -var51)) ^ -1) <= -1) {
                                  break L26;
                                } else {
                                  L27: {
                                    if ((ic.field_c.length ^ -1) <= (4 + (param21 - -var29) ^ -1)) {
                                      break L27;
                                    } else {
                                      var54 = new int[param21 + var29 + 104];
                                      rd.a(ic.field_c, 0, var54, 0, k.field_e);
                                      ic.field_c = var54;
                                      var54 = new int[var29 + (param21 + 104)];
                                      rd.a(nn.field_S, 0, var54, 0, k.field_e);
                                      nn.field_S = var54;
                                      var54 = new int[104 + param21 - -var29];
                                      rd.a(bd.field_a, 0, var54, 0, k.field_e);
                                      bd.field_a = var54;
                                      break L27;
                                    }
                                  }
                                  L28: {
                                    if ((am.field_b.length ^ -1) <= (var31 + (param21 + 4) ^ -1)) {
                                      break L28;
                                    } else {
                                      var54 = new int[104 + param21 - -var31];
                                      rd.a(am.field_b, 0, var54, 0, mf.field_u);
                                      am.field_b = var54;
                                      var54 = new int[104 + param21 + var31];
                                      rd.a(gd.field_Zb, 0, var54, 0, mf.field_u);
                                      gd.field_Zb = var54;
                                      var54 = new int[104 + (var31 + param21)];
                                      rd.a(cm.field_q, 0, var54, 0, mf.field_u);
                                      cm.field_q = var54;
                                      break L28;
                                    }
                                  }
                                  L29: {
                                    L30: {
                                      var55 = k.field_e;
                                      var56 = mf.field_u;
                                      var57 = 0;
                                      var58 = 0;
                                      if (param22 != null) {
                                        break L30;
                                      } else {
                                        L31: {
                                          if (null != param17) {
                                            break L31;
                                          } else {
                                            var64 = 1;
                                            if (var65 == 0) {
                                              break L29;
                                            } else {
                                              break L31;
                                            }
                                          }
                                        }
                                        L32: {
                                          L33: {
                                            if ((param17[var38] ^ -1) == 0) {
                                              break L33;
                                            } else {
                                              if (1 == (param17[var38] ^ -1)) {
                                                break L33;
                                              } else {
                                                stackOut_70_0 = 1;
                                                stackIn_72_0 = stackOut_70_0;
                                                break L32;
                                              }
                                            }
                                          }
                                          stackOut_71_0 = 0;
                                          stackIn_72_0 = stackOut_71_0;
                                          break L32;
                                        }
                                        var64 = stackIn_72_0;
                                        if (var65 == 0) {
                                          break L29;
                                        } else {
                                          break L30;
                                        }
                                      }
                                    }
                                    L34: {
                                      if (-1 != (1 & param22[var38] ^ -1)) {
                                        stackOut_76_0 = 0;
                                        stackIn_77_0 = stackOut_76_0;
                                        break L34;
                                      } else {
                                        stackOut_75_0 = 1;
                                        stackIn_77_0 = stackOut_75_0;
                                        break L34;
                                      }
                                    }
                                    var64 = stackIn_77_0;
                                    break L29;
                                  }
                                  L35: {
                                    if (param18 == null) {
                                      break L35;
                                    } else {
                                      L36: {
                                        if (var64 == 0) {
                                          break L36;
                                        } else {
                                          var36 = 65535 & param8[var38];
                                          var37 = 65535 & param17[var38];
                                          var35 = param18[var38] & 65535;
                                          if (var65 == 0) {
                                            break L35;
                                          } else {
                                            break L36;
                                          }
                                        }
                                      }
                                      var37 = param17[var38];
                                      var36 = param8[var38];
                                      var35 = param18[var38];
                                      break L35;
                                    }
                                  }
                                  L37: {
                                    if (0 <= var51) {
                                      L38: {
                                        var34 = var24[var39];
                                        if ((var34 ^ -1) <= -1) {
                                          break L38;
                                        } else {
                                          var55++;
                                          var34 = var55;
                                          var24[var39] = var55;
                                          ic.field_c[var34] = var42;
                                          nn.field_S[var34] = var43;
                                          bd.field_a[var34] = var44;
                                          break L38;
                                        }
                                      }
                                      var26[var57 + 0] = var34;
                                      var26[8 - -var57] = var35;
                                      var57++;
                                      break L37;
                                    } else {
                                      break L37;
                                    }
                                  }
                                  L39: {
                                    if (0 < var51) {
                                      break L39;
                                    } else {
                                      L40: {
                                        var34 = var25[var39];
                                        if ((var34 ^ -1) > -1) {
                                          var56++;
                                          var34 = var56;
                                          var25[var39] = var56;
                                          am.field_b[var34] = var42;
                                          gd.field_Zb[var34] = var43;
                                          cm.field_q[var34] = var44;
                                          break L40;
                                        } else {
                                          break L40;
                                        }
                                      }
                                      var26[4 - -var58] = var34;
                                      var26[var58 + 12] = var35;
                                      var58++;
                                      break L39;
                                    }
                                  }
                                  L41: {
                                    if (var51 == 0) {
                                      break L41;
                                    } else {
                                      if ((var52 ^ -1) == -1) {
                                        break L41;
                                      } else {
                                        if ((var52 ^ var51 ^ -1) <= -1) {
                                          break L41;
                                        } else {
                                          var63 = -var51 + var52;
                                          var61 = (var44 * var52 + -(var51 * var47)) / var63;
                                          var55++;
                                          var34 = var55;
                                          var60 = (var52 * var43 + -(var51 * var46)) / var63;
                                          var59 = (-(var51 * var45) + var42 * var52) / var63;
                                          var62 = (var52 * var35 - var51 * var36) / var63;
                                          ic.field_c[var34] = var59;
                                          nn.field_S[var34] = var60;
                                          bd.field_a[var34] = var61;
                                          var26[0 + var57] = var34;
                                          var26[var57 + 8] = var62;
                                          var57++;
                                          var56++;
                                          var34 = var56;
                                          am.field_b[var34] = var59;
                                          gd.field_Zb[var34] = var60;
                                          cm.field_q[var34] = var61;
                                          var26[var58 + 4] = var34;
                                          var26[12 + var58] = var62;
                                          var58++;
                                          break L41;
                                        }
                                      }
                                    }
                                  }
                                  L42: {
                                    if (var52 < 0) {
                                      break L42;
                                    } else {
                                      L43: {
                                        var34 = var24[var40];
                                        if (-1 >= (var34 ^ -1)) {
                                          break L43;
                                        } else {
                                          var55++;
                                          var34 = var55;
                                          var24[var40] = var55;
                                          ic.field_c[var34] = var45;
                                          nn.field_S[var34] = var46;
                                          bd.field_a[var34] = var47;
                                          break L43;
                                        }
                                      }
                                      var26[0 + var57] = var34;
                                      var26[8 - -var57] = var36;
                                      var57++;
                                      break L42;
                                    }
                                  }
                                  L44: {
                                    if (var52 > 0) {
                                      break L44;
                                    } else {
                                      L45: {
                                        var34 = var25[var40];
                                        if ((var34 ^ -1) <= -1) {
                                          break L45;
                                        } else {
                                          var56++;
                                          var34 = var56;
                                          var25[var40] = var56;
                                          am.field_b[var34] = var45;
                                          gd.field_Zb[var34] = var46;
                                          cm.field_q[var34] = var47;
                                          break L45;
                                        }
                                      }
                                      var26[var58 + 4] = var34;
                                      var26[12 + var58] = var36;
                                      var58++;
                                      break L44;
                                    }
                                  }
                                  L46: {
                                    if (0 == var52) {
                                      break L46;
                                    } else {
                                      if (0 == var53) {
                                        break L46;
                                      } else {
                                        if ((var52 ^ var53 ^ -1) <= -1) {
                                          break L46;
                                        } else {
                                          var63 = -var52 + var53;
                                          var59 = (var45 * var53 - var48 * var52) / var63;
                                          var62 = (-(var52 * var37) + var53 * var36) / var63;
                                          var60 = (var46 * var53 + -(var52 * var49)) / var63;
                                          var61 = (-(var50 * var52) + var47 * var53) / var63;
                                          var55++;
                                          var34 = var55;
                                          ic.field_c[var34] = var59;
                                          nn.field_S[var34] = var60;
                                          bd.field_a[var34] = var61;
                                          var26[0 + var57] = var34;
                                          var26[var57 + 8] = var62;
                                          var57++;
                                          var56++;
                                          var34 = var56;
                                          am.field_b[var34] = var59;
                                          gd.field_Zb[var34] = var60;
                                          cm.field_q[var34] = var61;
                                          var26[4 + var58] = var34;
                                          var26[12 - -var58] = var62;
                                          var58++;
                                          break L46;
                                        }
                                      }
                                    }
                                  }
                                  L47: {
                                    if (var53 < 0) {
                                      break L47;
                                    } else {
                                      L48: {
                                        var34 = var24[var41];
                                        if ((var34 ^ -1) > -1) {
                                          var55++;
                                          var34 = var55;
                                          var24[var41] = var55;
                                          ic.field_c[var34] = var48;
                                          nn.field_S[var34] = var49;
                                          bd.field_a[var34] = var50;
                                          break L48;
                                        } else {
                                          break L48;
                                        }
                                      }
                                      var26[0 + var57] = var34;
                                      var26[8 + var57] = var37;
                                      var57++;
                                      break L47;
                                    }
                                  }
                                  L49: {
                                    if (-1 > (var53 ^ -1)) {
                                      break L49;
                                    } else {
                                      L50: {
                                        var34 = var25[var41];
                                        if (0 > var34) {
                                          var56++;
                                          var34 = var56;
                                          var25[var41] = var56;
                                          am.field_b[var34] = var48;
                                          gd.field_Zb[var34] = var49;
                                          cm.field_q[var34] = var50;
                                          break L50;
                                        } else {
                                          break L50;
                                        }
                                      }
                                      var26[var58 + 4] = var34;
                                      var26[var58 + 12] = var37;
                                      var58++;
                                      break L49;
                                    }
                                  }
                                  L51: {
                                    if (0 == (var51 | var53)) {
                                      break L51;
                                    } else {
                                      if ((var51 ^ var53 ^ -1) > -1) {
                                        var63 = -var53 + var51;
                                        var60 = (-(var53 * var43) + var51 * var49) / var63;
                                        var55++;
                                        var34 = var55;
                                        var61 = (-(var53 * var44) + var50 * var51) / var63;
                                        var62 = (-(var53 * var35) + var51 * var37) / var63;
                                        var59 = (-(var53 * var42) + var51 * var48) / var63;
                                        ic.field_c[var34] = var59;
                                        nn.field_S[var34] = var60;
                                        bd.field_a[var34] = var61;
                                        var26[var57 + 0] = var34;
                                        var26[8 - -var57] = var62;
                                        var57++;
                                        var56++;
                                        var34 = var56;
                                        am.field_b[var34] = var59;
                                        gd.field_Zb[var34] = var60;
                                        cm.field_q[var34] = var61;
                                        var26[var58 + 4] = var34;
                                        var26[12 + var58] = var62;
                                        var58++;
                                        break L51;
                                      } else {
                                        break L51;
                                      }
                                    }
                                  }
                                  L52: {
                                    var29 = var29 + (-k.field_e + var55);
                                    var33 = fh.field_g;
                                    k.field_e = var55;
                                    if ((ja.field_l.length ^ -1) <= (-2 + var57 + var30 + param7 ^ -1)) {
                                      break L52;
                                    } else {
                                      var54 = new int[param7 + var30 + (var57 + 98)];
                                      rd.a(ja.field_l, 0, var54, 0, var33);
                                      ja.field_l = var54;
                                      var54 = new int[var57 + (param7 - -var30) + 98];
                                      rd.a(db.field_f, 0, var54, 0, var33);
                                      db.field_f = var54;
                                      var54 = new int[98 + var57 + (var30 + param7)];
                                      rd.a(wk.field_b, 0, var54, 0, var33);
                                      wk.field_b = var54;
                                      if (null != param18) {
                                        var54 = new int[98 + (var30 + (param7 + var57))];
                                        rd.a(mc.field_m, 0, var54, 0, var33);
                                        mc.field_m = var54;
                                        var54 = new int[var30 + (param7 + var57 - -98)];
                                        rd.a(tc.field_w, 0, var54, 0, var33);
                                        tc.field_w = var54;
                                        var54 = new int[98 + var57 + (var30 + param7)];
                                        rd.a(rk.field_b, 0, var54, 0, var33);
                                        rk.field_b = var54;
                                        break L52;
                                      } else {
                                        break L52;
                                      }
                                    }
                                  }
                                  L53: {
                                    ja.field_l[var33] = var26[0];
                                    db.field_f[var33] = var26[1];
                                    wk.field_b[var33] = var26[2];
                                    if (param18 != null) {
                                      L54: {
                                        if (var64 != 0) {
                                          break L54;
                                        } else {
                                          mc.field_m[var33] = var35;
                                          rk.field_b[var33] = var37;
                                          if (var65 == 0) {
                                            break L53;
                                          } else {
                                            break L54;
                                          }
                                        }
                                      }
                                      mc.field_m[var33] = var26[8];
                                      tc.field_w[var33] = var26[9];
                                      rk.field_b[var33] = var26[10];
                                      break L53;
                                    } else {
                                      break L53;
                                    }
                                  }
                                  L55: {
                                    var33++;
                                    var27[var33] = var38;
                                    if (4 != var57) {
                                      break L55;
                                    } else {
                                      L56: {
                                        ja.field_l[var33] = var26[2];
                                        db.field_f[var33] = var26[3];
                                        wk.field_b[var33] = var26[0];
                                        if (param18 != null) {
                                          L57: {
                                            if (var64 == 0) {
                                              break L57;
                                            } else {
                                              mc.field_m[var33] = var26[10];
                                              tc.field_w[var33] = var26[11];
                                              rk.field_b[var33] = var26[8];
                                              if (var65 == 0) {
                                                break L56;
                                              } else {
                                                break L57;
                                              }
                                            }
                                          }
                                          mc.field_m[var33] = var35;
                                          rk.field_b[var33] = var37;
                                          break L56;
                                        } else {
                                          break L56;
                                        }
                                      }
                                      var30++;
                                      var33++;
                                      var27[var33] = var38;
                                      break L55;
                                    }
                                  }
                                  L58: {
                                    fh.field_g = var33;
                                    var31 = var31 + (-mf.field_u + var56);
                                    mf.field_u = var56;
                                    var33 = le.field_Xb;
                                    if ((var58 + param7 - (-var32 - -2) ^ -1) < (ve.field_a.length ^ -1)) {
                                      var54 = new int[var58 + (var32 + (param7 + 98))];
                                      rd.a(ve.field_a, 0, var54, 0, var33);
                                      ve.field_a = var54;
                                      var54 = new int[98 + var58 + (param7 + var32)];
                                      rd.a(hd.field_D, 0, var54, 0, var33);
                                      hd.field_D = var54;
                                      var54 = new int[param7 - (-var32 + -var58) - -98];
                                      rd.a(kj.field_d, 0, var54, 0, var33);
                                      kj.field_d = var54;
                                      if (null == param18) {
                                        break L58;
                                      } else {
                                        var54 = new int[param7 + var32 + (var58 + 98)];
                                        rd.a(ga.field_b, 0, var54, 0, var33);
                                        ga.field_b = var54;
                                        var54 = new int[98 + var58 + (param7 + var32)];
                                        rd.a(fj.field_p, 0, var54, 0, var33);
                                        fj.field_p = var54;
                                        var54 = new int[98 + (param7 + var32) - -var58];
                                        rd.a(om.field_Yb, 0, var54, 0, var33);
                                        om.field_Yb = var54;
                                        break L58;
                                      }
                                    } else {
                                      break L58;
                                    }
                                  }
                                  L59: {
                                    ve.field_a[var33] = var26[4];
                                    hd.field_D[var33] = var26[5];
                                    kj.field_d[var33] = var26[6];
                                    if (null == param18) {
                                      break L59;
                                    } else {
                                      L60: {
                                        if (var64 == 0) {
                                          break L60;
                                        } else {
                                          ga.field_b[var33] = var26[12];
                                          fj.field_p[var33] = var26[13];
                                          om.field_Yb[var33] = var26[14];
                                          if (var65 == 0) {
                                            break L59;
                                          } else {
                                            break L60;
                                          }
                                        }
                                      }
                                      ga.field_b[var33] = var35;
                                      om.field_Yb[var33] = var37;
                                      break L59;
                                    }
                                  }
                                  L61: {
                                    var33++;
                                    var28[var33] = var38;
                                    if (var58 == 4) {
                                      L62: {
                                        ve.field_a[var33] = var26[6];
                                        hd.field_D[var33] = var26[7];
                                        kj.field_d[var33] = var26[4];
                                        if (param18 != null) {
                                          L63: {
                                            if (var64 != 0) {
                                              break L63;
                                            } else {
                                              ga.field_b[var33] = var35;
                                              om.field_Yb[var33] = var37;
                                              if (var65 == 0) {
                                                break L62;
                                              } else {
                                                break L63;
                                              }
                                            }
                                          }
                                          ga.field_b[var33] = var26[14];
                                          fj.field_p[var33] = var26[15];
                                          om.field_Yb[var33] = var26[12];
                                          break L62;
                                        } else {
                                          break L62;
                                        }
                                      }
                                      var33++;
                                      var28[var33] = var38;
                                      var32++;
                                      break L61;
                                    } else {
                                      break L61;
                                    }
                                  }
                                  le.field_Xb = var33;
                                  if (var65 == 0) {
                                    break L24;
                                  } else {
                                    break L26;
                                  }
                                }
                              }
                              L64: {
                                le.field_Xb = le.field_Xb + 1;
                                var33 = le.field_Xb;
                                var34 = var25[var39];
                                if (-1 >= (var34 ^ -1)) {
                                  break L64;
                                } else {
                                  mf.field_u = mf.field_u + 1;
                                  var34 = mf.field_u;
                                  var25[var39] = mf.field_u;
                                  am.field_b[var34] = var42;
                                  gd.field_Zb[var34] = var43;
                                  cm.field_q[var34] = var44;
                                  break L64;
                                }
                              }
                              L65: {
                                ve.field_a[var33] = var34;
                                var34 = var25[var40];
                                if ((var34 ^ -1) > -1) {
                                  mf.field_u = mf.field_u + 1;
                                  var34 = mf.field_u;
                                  var25[var40] = mf.field_u;
                                  am.field_b[var34] = var45;
                                  gd.field_Zb[var34] = var46;
                                  cm.field_q[var34] = var47;
                                  break L65;
                                } else {
                                  break L65;
                                }
                              }
                              L66: {
                                hd.field_D[var33] = var34;
                                var34 = var25[var41];
                                if ((var34 ^ -1) <= -1) {
                                  break L66;
                                } else {
                                  mf.field_u = mf.field_u + 1;
                                  var34 = mf.field_u;
                                  var25[var41] = mf.field_u;
                                  am.field_b[var34] = var48;
                                  gd.field_Zb[var34] = var49;
                                  cm.field_q[var34] = var50;
                                  break L66;
                                }
                              }
                              L67: {
                                kj.field_d[var33] = var34;
                                if (param18 != null) {
                                  ga.field_b[var33] = param18[var38];
                                  fj.field_p[var33] = param8[var38];
                                  om.field_Yb[var33] = param17[var38];
                                  break L67;
                                } else {
                                  break L67;
                                }
                              }
                              var28[var33] = var38;
                              if (var65 == 0) {
                                break L24;
                              } else {
                                break L25;
                              }
                            }
                          }
                          L68: {
                            fh.field_g = fh.field_g + 1;
                            var33 = fh.field_g;
                            var34 = var24[var39];
                            if ((var34 ^ -1) <= -1) {
                              break L68;
                            } else {
                              k.field_e = k.field_e + 1;
                              var34 = k.field_e;
                              var24[var39] = k.field_e;
                              ic.field_c[var34] = var42;
                              nn.field_S[var34] = var43;
                              bd.field_a[var34] = var44;
                              break L68;
                            }
                          }
                          L69: {
                            ja.field_l[var33] = var34;
                            var34 = var24[var40];
                            if (0 > var34) {
                              k.field_e = k.field_e + 1;
                              var34 = k.field_e;
                              var24[var40] = k.field_e;
                              ic.field_c[var34] = var45;
                              nn.field_S[var34] = var46;
                              bd.field_a[var34] = var47;
                              break L69;
                            } else {
                              break L69;
                            }
                          }
                          L70: {
                            db.field_f[var33] = var34;
                            var34 = var24[var41];
                            if (var34 >= 0) {
                              break L70;
                            } else {
                              k.field_e = k.field_e + 1;
                              var34 = k.field_e;
                              var24[var41] = k.field_e;
                              ic.field_c[var34] = var48;
                              nn.field_S[var34] = var49;
                              bd.field_a[var34] = var50;
                              break L70;
                            }
                          }
                          L71: {
                            wk.field_b[var33] = var34;
                            if (null == param18) {
                              break L71;
                            } else {
                              mc.field_m[var33] = param18[var38];
                              tc.field_w[var33] = param8[var38];
                              rk.field_b[var33] = param17[var38];
                              break L71;
                            }
                          }
                          var27[var33] = var38;
                          break L24;
                        }
                        var38++;
                        if (var65 == 0) {
                          continue L21;
                        } else {
                          break L23;
                        }
                      }
                    }
                  }
                  bm.field_p = param10;
                  hb.field_d = param10;
                  d.field_b = mf.field_u;
                  ea.field_e = k.field_e;
                  stackOut_189_0 = 0;
                  stackOut_189_1 = param10;
                  stackIn_190_0 = stackOut_189_0;
                  stackIn_190_1 = stackOut_189_1;
                  break L22;
                }
                L72: {
                  L73: {
                    if (stackIn_190_0 < stackIn_190_1) {
                      L74: {
                        if (null == param6) {
                          break L74;
                        } else {
                          L75: {
                            L76: {
                              va.field_q.field_v = param6.field_v;
                              fl.field_o.field_v = param6.field_v;
                              if (fl.field_o.field_k == null) {
                                break L76;
                              } else {
                                if (fl.field_o.field_k.length < param10) {
                                  break L76;
                                } else {
                                  break L75;
                                }
                              }
                            }
                            fl.field_o.field_Q = new short[param10];
                            fl.field_o.field_k = new short[param10];
                            fl.field_o.field_N = new short[param10];
                            break L75;
                          }
                          L77: {
                            L78: {
                              if (va.field_q.field_k == null) {
                                break L78;
                              } else {
                                if ((param10 ^ -1) < (va.field_q.field_k.length ^ -1)) {
                                  break L78;
                                } else {
                                  break L77;
                                }
                              }
                            }
                            va.field_q.field_Q = new short[param10];
                            va.field_q.field_N = new short[param10];
                            va.field_q.field_k = new short[param10];
                            break L77;
                          }
                          var38 = 0;
                          L79: while (true) {
                            L80: {
                              L81: {
                                if (param10 <= var38) {
                                  break L81;
                                } else {
                                  if (var65 != 0) {
                                    break L80;
                                  } else {
                                    L82: {
                                      L83: {
                                        if (-1 == (param6.field_v[var38] ^ -1)) {
                                          break L83;
                                        } else {
                                          va.field_q.field_k[var38] = param6.field_k[var38];
                                          fl.field_o.field_k[var38] = param6.field_k[var38];
                                          va.field_q.field_N[var38] = param6.field_N[var38];
                                          fl.field_o.field_N[var38] = param6.field_N[var38];
                                          va.field_q.field_Q[var38] = param6.field_Q[var38];
                                          fl.field_o.field_Q[var38] = param6.field_Q[var38];
                                          if (var65 == 0) {
                                            break L82;
                                          } else {
                                            break L83;
                                          }
                                        }
                                      }
                                      L84: {
                                        var33 = param6.field_k[var38];
                                        var34 = var24[var33];
                                        if ((var34 ^ -1) <= -1) {
                                          break L84;
                                        } else {
                                          k.field_e = k.field_e + 1;
                                          var34 = k.field_e;
                                          var24[var33] = k.field_e;
                                          ic.field_c[var34] = param12[var33];
                                          nn.field_S[var34] = param5[var33];
                                          bd.field_a[var34] = param11[var33];
                                          break L84;
                                        }
                                      }
                                      L85: {
                                        fl.field_o.field_k[var38] = (short)var34;
                                        var34 = var25[var33];
                                        if ((var34 ^ -1) > -1) {
                                          mf.field_u = mf.field_u + 1;
                                          var34 = mf.field_u;
                                          var25[var33] = mf.field_u;
                                          am.field_b[var34] = param12[var33];
                                          gd.field_Zb[var34] = param5[var33];
                                          cm.field_q[var34] = param11[var33];
                                          break L85;
                                        } else {
                                          break L85;
                                        }
                                      }
                                      L86: {
                                        va.field_q.field_k[var38] = (short)var34;
                                        var33 = param6.field_N[var38];
                                        var34 = var24[var33];
                                        if (-1 >= (var34 ^ -1)) {
                                          break L86;
                                        } else {
                                          k.field_e = k.field_e + 1;
                                          var34 = k.field_e;
                                          var24[var33] = k.field_e;
                                          ic.field_c[var34] = param12[var33];
                                          nn.field_S[var34] = param5[var33];
                                          bd.field_a[var34] = param11[var33];
                                          break L86;
                                        }
                                      }
                                      L87: {
                                        fl.field_o.field_N[var38] = (short)var34;
                                        var34 = var25[var33];
                                        if (-1 < (var34 ^ -1)) {
                                          mf.field_u = mf.field_u + 1;
                                          var34 = mf.field_u;
                                          var25[var33] = mf.field_u;
                                          am.field_b[var34] = param12[var33];
                                          gd.field_Zb[var34] = param5[var33];
                                          cm.field_q[var34] = param11[var33];
                                          break L87;
                                        } else {
                                          break L87;
                                        }
                                      }
                                      L88: {
                                        va.field_q.field_N[var38] = (short)var34;
                                        var33 = param6.field_Q[var38];
                                        var34 = var24[var33];
                                        if (var34 >= 0) {
                                          break L88;
                                        } else {
                                          k.field_e = k.field_e + 1;
                                          var34 = k.field_e;
                                          var24[var33] = k.field_e;
                                          ic.field_c[var34] = param12[var33];
                                          nn.field_S[var34] = param5[var33];
                                          bd.field_a[var34] = param11[var33];
                                          break L88;
                                        }
                                      }
                                      L89: {
                                        fl.field_o.field_Q[var38] = (short)var34;
                                        var34 = var25[var33];
                                        if (0 <= var34) {
                                          break L89;
                                        } else {
                                          mf.field_u = mf.field_u + 1;
                                          var34 = mf.field_u;
                                          var25[var33] = mf.field_u;
                                          am.field_b[var34] = param12[var33];
                                          gd.field_Zb[var34] = param5[var33];
                                          cm.field_q[var34] = param11[var33];
                                          break L89;
                                        }
                                      }
                                      va.field_q.field_Q[var38] = (short)var34;
                                      break L82;
                                    }
                                    var38++;
                                    if (var65 == 0) {
                                      continue L79;
                                    } else {
                                      break L81;
                                    }
                                  }
                                }
                              }
                              va.field_q.field_S = param6.field_S;
                              fl.field_o.field_S = param6.field_S;
                              va.field_q.field_x = param6.field_x;
                              fl.field_o.field_x = param6.field_x;
                              va.field_q.field_D = param6.field_D;
                              fl.field_o.field_D = param6.field_D;
                              va.field_q.field_n = param6.field_n;
                              fl.field_o.field_n = param6.field_n;
                              va.field_q.field_M = param6.field_M;
                              fl.field_o.field_M = param6.field_M;
                              va.field_q.field_F = param6.field_F;
                              fl.field_o.field_F = param6.field_F;
                              va.field_q.field_L = param6.field_L;
                              fl.field_o.field_L = param6.field_L;
                              va.field_q.field_l = param6.field_l;
                              fl.field_o.field_l = param6.field_l;
                              break L80;
                            }
                            if (var65 == 0) {
                              break L73;
                            } else {
                              break L74;
                            }
                          }
                        }
                      }
                      L90: {
                        L91: {
                          if (bg.field_f == null) {
                            break L91;
                          } else {
                            if ((param10 ^ -1) < (bg.field_f.length ^ -1)) {
                              break L91;
                            } else {
                              break L90;
                            }
                          }
                        }
                        gb.field_r = new int[param10];
                        bg.field_f = new int[param10];
                        ch.field_s = new int[param10];
                        break L90;
                      }
                      L92: {
                        L93: {
                          if (nh.field_Mb == null) {
                            break L93;
                          } else {
                            if (param10 <= nh.field_Mb.length) {
                              break L92;
                            } else {
                              break L93;
                            }
                          }
                        }
                        nh.field_Mb = new int[param10];
                        li.field_m = new int[param10];
                        gk.field_c = new int[param10];
                        break L92;
                      }
                      var38 = 0;
                      L94: while (true) {
                        if ((var38 ^ -1) <= (param10 ^ -1)) {
                          break L73;
                        } else {
                          var33 = param19[var38];
                          var34 = var24[var33];
                          if (var65 != 0) {
                            break L72;
                          } else {
                            L95: {
                              if (0 <= var34) {
                                break L95;
                              } else {
                                k.field_e = k.field_e + 1;
                                var34 = k.field_e;
                                var24[var33] = k.field_e;
                                ic.field_c[var34] = param12[var33];
                                nn.field_S[var34] = param5[var33];
                                bd.field_a[var34] = param11[var33];
                                break L95;
                              }
                            }
                            L96: {
                              bg.field_f[var38] = var34;
                              var34 = var25[var33];
                              if ((var34 ^ -1) <= -1) {
                                break L96;
                              } else {
                                mf.field_u = mf.field_u + 1;
                                var34 = mf.field_u;
                                var25[var33] = mf.field_u;
                                am.field_b[var34] = param12[var33];
                                gd.field_Zb[var34] = param5[var33];
                                cm.field_q[var34] = param11[var33];
                                break L96;
                              }
                            }
                            L97: {
                              nh.field_Mb[var38] = var34;
                              var33 = param16[var38];
                              var34 = var24[var33];
                              if (var34 < 0) {
                                k.field_e = k.field_e + 1;
                                var34 = k.field_e;
                                var24[var33] = k.field_e;
                                ic.field_c[var34] = param12[var33];
                                nn.field_S[var34] = param5[var33];
                                bd.field_a[var34] = param11[var33];
                                break L97;
                              } else {
                                break L97;
                              }
                            }
                            L98: {
                              gb.field_r[var38] = var34;
                              var34 = var25[var33];
                              if (-1 >= (var34 ^ -1)) {
                                break L98;
                              } else {
                                mf.field_u = mf.field_u + 1;
                                var34 = mf.field_u;
                                var25[var33] = mf.field_u;
                                am.field_b[var34] = param12[var33];
                                gd.field_Zb[var34] = param5[var33];
                                cm.field_q[var34] = param11[var33];
                                break L98;
                              }
                            }
                            L99: {
                              li.field_m[var38] = var34;
                              var33 = param15[var38];
                              var34 = var24[var33];
                              if (0 > var34) {
                                k.field_e = k.field_e + 1;
                                var34 = k.field_e;
                                var24[var33] = k.field_e;
                                ic.field_c[var34] = param12[var33];
                                nn.field_S[var34] = param5[var33];
                                bd.field_a[var34] = param11[var33];
                                break L99;
                              } else {
                                break L99;
                              }
                            }
                            L100: {
                              ch.field_s[var38] = var34;
                              var34 = var25[var33];
                              if ((var34 ^ -1) > -1) {
                                mf.field_u = mf.field_u + 1;
                                var34 = mf.field_u;
                                var25[var33] = mf.field_u;
                                am.field_b[var34] = param12[var33];
                                gd.field_Zb[var34] = param5[var33];
                                cm.field_q[var34] = param11[var33];
                                break L100;
                              } else {
                                break L100;
                              }
                            }
                            gk.field_c[var38] = var34;
                            var38++;
                            if (var65 == 0) {
                              continue L94;
                            } else {
                              break L73;
                            }
                          }
                        }
                      }
                    } else {
                      break L73;
                    }
                  }
                  break L72;
                }
                return;
              }
            }
          } else {
            return;
          }
        }
    }

    static {
    }
}
