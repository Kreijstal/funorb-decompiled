/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ej implements Runnable {
    private le field_f;
    private sj field_b;
    private java.net.URL field_i;
    private int field_e;
    static oq field_j;
    private le field_a;
    private ge field_d;
    static String field_c;
    private DataInputStream field_h;
    static int field_g;
    private le field_k;
    static boolean field_l;

    final synchronized boolean a(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        IOException var3 = null;
        java.net.Socket var3_ref = null;
        OutputStream var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_57_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_56_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if ((((ej) this).field_e ^ -1) <= -3) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = (stateCaught_0 instanceof RuntimeException ? 58 : 2);
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = (stateCaught_1 instanceof RuntimeException ? 58 : 2);
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 58;
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
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return stackIn_4_0 != 0;
                }
                case 5: {
                    try {
                        if ((((ej) this).field_e ^ -1) != -1) {
                            statePc = 20;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = (stateCaught_5 instanceof RuntimeException ? 58 : 8);
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (((ej) this).field_a != null) {
                            statePc = 12;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = (stateCaught_6 instanceof IOException ? 11 : 58);
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = (stateCaught_7 instanceof IOException ? 11 : 58);
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = (stateCaught_8 instanceof IOException ? 11 : 58);
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        ((ej) this).field_a = ((ej) this).field_b.a(((ej) this).field_i, 1);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = (stateCaught_9 instanceof IOException ? 11 : 58);
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (((ej) this).field_a.field_f != 0) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 14: {
                    return stackIn_14_0 != 0;
                }
                case 15: {
                    try {
                        if ((((ej) this).field_a.field_f ^ -1) != -2) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = (stateCaught_15 instanceof RuntimeException ? 58 : 17);
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = (stateCaught_16 instanceof RuntimeException ? 58 : 17);
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        ((ej) this).field_a = null;
                        ((ej) this).field_e = ((ej) this).field_e + 1;
                        stackOut_18_0 = 0;
                        stackIn_19_0 = stackOut_18_0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 19: {
                    return stackIn_19_0 != 0;
                }
                case 20: {
                    try {
                        if (((ej) this).field_e != 1) {
                            statePc = 33;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = (stateCaught_20 instanceof RuntimeException ? 58 : 23);
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (null != ((ej) this).field_k) {
                            statePc = 27;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = (stateCaught_21 instanceof IOException ? 26 : 58);
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = (stateCaught_22 instanceof IOException ? 26 : 58);
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = (stateCaught_23 instanceof IOException ? 26 : 58);
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        ((ej) this).field_k = ((ej) this).field_b.a(((ej) this).field_i.getHost(), 443, 0);
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = (stateCaught_24 instanceof IOException ? 26 : 58);
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if ((((ej) this).field_k.field_f ^ -1) != -1) {
                            statePc = 30;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackOut_28_0 = 0;
                        stackIn_29_0 = stackOut_28_0;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 29: {
                    return stackIn_29_0 != 0;
                }
                case 30: {
                    try {
                        if ((((ej) this).field_k.field_f ^ -1) == -2) {
                            statePc = 33;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        ((ej) this).field_e = ((ej) this).field_e + 1;
                        ((ej) this).field_k = null;
                        stackOut_31_0 = 0;
                        stackIn_32_0 = stackOut_31_0;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 32: {
                    return stackIn_32_0 != 0;
                }
                case 33: {
                    try {
                        var2_int = 25 % ((-61 - param0) / 46);
                        if (null != ((ej) this).field_h) {
                            statePc = 43;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (0 == ((ej) this).field_e) {
                            statePc = 37;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = (stateCaught_34 instanceof IOException ? 42 : 58);
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = (stateCaught_35 instanceof IOException ? 42 : 58);
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        ((ej) this).field_h = (DataInputStream) ((ej) this).field_a.field_e;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = (stateCaught_37 instanceof IOException ? 42 : 58);
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (1 != ((ej) this).field_e) {
                            statePc = 40;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = (stateCaught_38 instanceof IOException ? 42 : 58);
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var3_ref = (java.net.Socket) ((ej) this).field_k.field_e;
                        var3_ref.setSoTimeout(10000);
                        var4 = var3_ref.getOutputStream();
                        var4.write(17);
                        var4.write(hi.a(-98, (CharSequence) (Object) ("JAGGRAB " + ((ej) this).field_i.getFile() + "\n\n")));
                        ((ej) this).field_h = new DataInputStream(var3_ref.getInputStream());
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = (stateCaught_39 instanceof IOException ? 42 : 58);
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        ((ej) this).field_d.field_v = 0;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = (stateCaught_40 instanceof IOException ? 42 : 58);
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var3 = (IOException) (Object) caughtException;
                        ((ej) this).finalize();
                        ((ej) this).field_e = ((ej) this).field_e + 1;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (null != ((ej) this).field_f) {
                            statePc = 47;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = (stateCaught_43 instanceof IOException ? 46 : 58);
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        ((ej) this).field_f = ((ej) this).field_b.a(45, 5, (Runnable) this);
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = (stateCaught_44 instanceof IOException ? 46 : 58);
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (0 == ((ej) this).field_f.field_f) {
                            statePc = 50;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = (stateCaught_47 instanceof IOException ? 49 : 58);
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = (stateCaught_48 instanceof IOException ? 49 : 58);
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        stackOut_50_0 = 0;
                        stackIn_51_0 = stackOut_50_0;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 51: {
                    return stackIn_51_0 != 0;
                }
                case 52: {
                    try {
                        if (((ej) this).field_f.field_f != 1) {
                            statePc = 55;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = (stateCaught_52 instanceof RuntimeException ? 58 : 54);
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = (stateCaught_53 instanceof RuntimeException ? 58 : 54);
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        ((ej) this).finalize();
                        ((ej) this).field_e = ((ej) this).field_e + 1;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        stackOut_56_0 = 0;
                        stackIn_57_0 = stackOut_56_0;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 57: {
                    return stackIn_57_0 != 0;
                }
                case 58: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw wm.a((Throwable) (Object) var2, "ej.D(" + param0 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, eg param1, int param2, boolean param3, int param4, int param5, int param6, int param7, eg param8, eg param9) {
        RuntimeException var10 = null;
        eg var10_ref = null;
        eg var11 = null;
        eg var12_ref = null;
        int var12 = 0;
        int var13 = 0;
        eg stackIn_7_0 = null;
        eg stackIn_15_0 = null;
        eg stackIn_48_0 = null;
        eg stackIn_56_0 = null;
        eg stackIn_80_0 = null;
        eg stackIn_88_0 = null;
        eg stackIn_113_0 = null;
        eg stackIn_121_0 = null;
        eg stackIn_148_0 = null;
        eg stackIn_156_0 = null;
        eg stackIn_185_0 = null;
        eg stackIn_193_0 = null;
        RuntimeException stackIn_216_0 = null;
        StringBuilder stackIn_216_1 = null;
        RuntimeException stackIn_218_0 = null;
        StringBuilder stackIn_218_1 = null;
        RuntimeException stackIn_219_0 = null;
        StringBuilder stackIn_219_1 = null;
        String stackIn_219_2 = null;
        RuntimeException stackIn_220_0 = null;
        StringBuilder stackIn_220_1 = null;
        RuntimeException stackIn_222_0 = null;
        StringBuilder stackIn_222_1 = null;
        RuntimeException stackIn_223_0 = null;
        StringBuilder stackIn_223_1 = null;
        String stackIn_223_2 = null;
        RuntimeException stackIn_224_0 = null;
        StringBuilder stackIn_224_1 = null;
        RuntimeException stackIn_226_0 = null;
        StringBuilder stackIn_226_1 = null;
        RuntimeException stackIn_227_0 = null;
        StringBuilder stackIn_227_1 = null;
        String stackIn_227_2 = null;
        eg stackOut_6_0 = null;
        eg stackOut_14_0 = null;
        eg stackOut_47_0 = null;
        eg stackOut_55_0 = null;
        eg stackOut_79_0 = null;
        eg stackOut_87_0 = null;
        eg stackOut_112_0 = null;
        eg stackOut_120_0 = null;
        eg stackOut_147_0 = null;
        eg stackOut_155_0 = null;
        eg stackOut_184_0 = null;
        eg stackOut_192_0 = null;
        RuntimeException stackOut_215_0 = null;
        StringBuilder stackOut_215_1 = null;
        RuntimeException stackOut_216_0 = null;
        StringBuilder stackOut_216_1 = null;
        String stackOut_216_2 = null;
        RuntimeException stackOut_218_0 = null;
        StringBuilder stackOut_218_1 = null;
        String stackOut_218_2 = null;
        RuntimeException stackOut_219_0 = null;
        StringBuilder stackOut_219_1 = null;
        RuntimeException stackOut_220_0 = null;
        StringBuilder stackOut_220_1 = null;
        String stackOut_220_2 = null;
        RuntimeException stackOut_222_0 = null;
        StringBuilder stackOut_222_1 = null;
        String stackOut_222_2 = null;
        RuntimeException stackOut_223_0 = null;
        StringBuilder stackOut_223_1 = null;
        RuntimeException stackOut_224_0 = null;
        StringBuilder stackOut_224_1 = null;
        String stackOut_224_2 = null;
        RuntimeException stackOut_226_0 = null;
        StringBuilder stackOut_226_1 = null;
        String stackOut_226_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = Pool.field_O;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        mj.field_a = param1.field_Y;
                        hi.field_k = param8.field_N;
                        vn.field_h = param8.field_v;
                        kp.field_h = param1;
                        nr.field_P = param8.field_X;
                        ro.field_d = param8.field_q;
                        sa.field_r = param8.field_Y;
                        eh.field_w = param1.field_g;
                        gn.field_e = param8;
                        nk.field_b = param1.field_X;
                        wn.field_d = param1.field_N;
                        qp.field_Yb = param8.field_g;
                        sa.field_w = param1.field_q;
                        f.field_b = param1.field_v;
                        u.a(param0, param4, param6, true, (int[]) null, (int[]) null, param9.field_g, param9.field_N, param5, (int[]) null, param9.field_q, param2, param9.field_K, param9.field_Y, param9.field_Q, param9.field_X, (int[]) null, param7, param9.field_v, param9.field_l, (int[]) null, param9, param9.field_B, (int[]) null);
                        var10_ref = param8;
                        param1.field_J = null;
                        var10_ref.field_J = null;
                        var11 = param8;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        param1.field_Z = null;
                        param8.field_X = nr.field_P;
                        param8.field_g = qp.field_Yb;
                        param8.field_B = nk.field_a;
                        param8.field_Y = sa.field_r;
                        param8.field_q = ro.field_d;
                        param8.field_l = ld.field_g;
                        param8.field_M = nj.field_d;
                        param8.field_K = uf.field_W;
                        var11.field_Z = null;
                        param8.field_v = vn.field_h;
                        param8.field_N = hi.field_k;
                        param1.field_N = wn.field_d;
                        param1.field_q = sa.field_w;
                        param1.field_v = f.field_b;
                        param1.field_Y = mj.field_a;
                        param1.field_g = eh.field_w;
                        param1.field_M = vk.field_bb;
                        param1.field_B = de.field_a;
                        param1.field_K = eq.field_R;
                        param1.field_X = nk.field_b;
                        param1.field_l = ja.field_a;
                        if (param9.field_Q == null) {
                            statePc = 36;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (null == param8.field_Q) {
                            statePc = 10;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = (eg) param8;
                        stackIn_7_0 = stackOut_6_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if ((stackIn_7_0.field_Q.length ^ -1) <= (param8.field_K ^ -1)) {
                            statePc = 13;
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
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
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
                        param8.field_Q = new byte[param8.field_K - -100];
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (param1.field_Q == null) {
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
                        stackOut_14_0 = (eg) param1;
                        stackIn_15_0 = stackOut_14_0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if ((stackIn_15_0.field_Q.length ^ -1) <= (param1.field_K ^ -1)) {
                            statePc = 21;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        param1.field_Q = new byte[100 + param1.field_K];
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var12 = 0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (param8.field_K <= var12) {
                            statePc = 27;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        param8.field_Q[var12] = param9.field_Q[hr.field_n[var12]];
                        var12++;
                        if (var13 != 0) {
                            statePc = 28;
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
                        if (var13 == 0) {
                            statePc = 22;
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
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var12 = 0;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if ((var12 ^ -1) <= (param1.field_K ^ -1)) {
                            statePc = 35;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        param1.field_Q[var12] = param9.field_Q[gr.field_B[var12]];
                        var12++;
                        if (var13 != 0) {
                            statePc = 37;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (var13 == 0) {
                            statePc = 28;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (var13 == 0) {
                            statePc = 37;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        param1.field_Q = null;
                        var12_ref = param8;
                        var12_ref.field_Q = null;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (!param3) {
                            statePc = 41;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        field_j = null;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (param9.field_P != null) {
                            statePc = 44;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        param1.field_P = null;
                        var12_ref = param8;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        param1.field_t = param9.field_t;
                        param8.field_t = param9.field_t;
                        var12_ref.field_P = null;
                        if (var13 == 0) {
                            statePc = 76;
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
                        if (param8.field_P == null) {
                            statePc = 51;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        stackOut_47_0 = (eg) param8;
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
                        if ((stackIn_48_0.field_P.length ^ -1) <= (param8.field_K ^ -1)) {
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
                        param8.field_P = new byte[param8.field_K + 100];
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (null == param1.field_P) {
                            statePc = 59;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        stackOut_55_0 = (eg) param1;
                        stackIn_56_0 = stackOut_55_0;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if ((stackIn_56_0.field_K ^ -1) >= (param1.field_P.length ^ -1)) {
                            statePc = 62;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        param1.field_P = new byte[100 + param1.field_K];
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        var12 = 0;
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if ((var12 ^ -1) <= (param8.field_K ^ -1)) {
                            statePc = 68;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        param8.field_P[var12] = param9.field_P[hr.field_n[var12]];
                        var12++;
                        if (var13 != 0) {
                            statePc = 69;
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
                        if (var13 == 0) {
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
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        var12 = 0;
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if ((param1.field_K ^ -1) >= (var12 ^ -1)) {
                            statePc = 76;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        param1.field_P[var12] = param9.field_P[gr.field_B[var12]];
                        var12++;
                        if (var13 != 0) {
                            statePc = 78;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if (var13 == 0) {
                            statePc = 69;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if (null != param9.field_f) {
                            statePc = 78;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        var12_ref = param8;
                        param1.field_f = null;
                        var12_ref.field_f = null;
                        if (var13 == 0) {
                            statePc = 108;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if (null == param8.field_f) {
                            statePc = 83;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        stackOut_79_0 = (eg) param8;
                        stackIn_80_0 = stackOut_79_0;
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if (stackIn_80_0.field_K <= param8.field_f.length) {
                            statePc = 86;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        param8.field_f = new byte[param8.field_K + 100];
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        if (null == param1.field_f) {
                            statePc = 91;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        stackOut_87_0 = (eg) param1;
                        stackIn_88_0 = stackOut_87_0;
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        if (stackIn_88_0.field_f.length >= param1.field_K) {
                            statePc = 94;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        param1.field_f = new byte[param1.field_K + 100];
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        var12 = 0;
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        if (param8.field_K <= var12) {
                            statePc = 100;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        param8.field_f[var12] = param9.field_f[hr.field_n[var12]];
                        var12++;
                        if (var13 != 0) {
                            statePc = 101;
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
                        if (var13 == 0) {
                            statePc = 95;
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
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        var12 = 0;
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        if ((var12 ^ -1) <= (param1.field_K ^ -1)) {
                            statePc = 108;
                        } else {
                            statePc = 102;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        param1.field_f[var12] = param9.field_f[gr.field_B[var12]];
                        var12++;
                        if (var13 != 0) {
                            statePc = 142;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        if (var13 == 0) {
                            statePc = 101;
                        } else {
                            statePc = 106;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        if (null == param9.field_k) {
                            statePc = 142;
                        } else {
                            statePc = 109;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        if (null == param8.field_k) {
                            statePc = 116;
                        } else {
                            statePc = 110;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        stackOut_112_0 = (eg) param8;
                        stackIn_113_0 = stackOut_112_0;
                        statePc = 113;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        if ((stackIn_113_0.field_K ^ -1) >= (param8.field_k.length ^ -1)) {
                            statePc = 119;
                        } else {
                            statePc = 114;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        param8.field_k = new byte[100 + param8.field_K];
                        statePc = 117;
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        statePc = 119;
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        if (null == param1.field_k) {
                            statePc = 124;
                        } else {
                            statePc = 120;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        stackOut_120_0 = (eg) param1;
                        stackIn_121_0 = stackOut_120_0;
                        statePc = 121;
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        if (stackIn_121_0.field_k.length >= param1.field_K) {
                            statePc = 127;
                        } else {
                            statePc = 122;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        statePc = 124;
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        param1.field_k = new byte[100 + param1.field_K];
                        statePc = 125;
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        statePc = 127;
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        var12 = 0;
                        statePc = 128;
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        if ((param8.field_K ^ -1) >= (var12 ^ -1)) {
                            statePc = 133;
                        } else {
                            statePc = 129;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        param8.field_k[var12] = param9.field_k[hr.field_n[var12]];
                        var12++;
                        if (var13 != 0) {
                            statePc = 134;
                        } else {
                            statePc = 130;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        if (var13 == 0) {
                            statePc = 128;
                        } else {
                            statePc = 131;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        statePc = 133;
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        var12 = 0;
                        statePc = 134;
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        if ((param1.field_K ^ -1) >= (var12 ^ -1)) {
                            statePc = 141;
                        } else {
                            statePc = 135;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        param1.field_k[var12] = param9.field_k[gr.field_B[var12]];
                        var12++;
                        if (var13 != 0) {
                            statePc = 143;
                        } else {
                            statePc = 136;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        statePc = 138;
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        if (var13 == 0) {
                            statePc = 134;
                        } else {
                            statePc = 139;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        statePc = 141;
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        if (var13 == 0) {
                            statePc = 143;
                        } else {
                            statePc = 142;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        var12_ref = param8;
                        param1.field_k = null;
                        var12_ref.field_k = null;
                        statePc = 143;
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        if (param9.field_n == null) {
                            statePc = 177;
                        } else {
                            statePc = 144;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        if (param8.field_n == null) {
                            statePc = 153;
                        } else {
                            statePc = 145;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        statePc = 147;
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        stackOut_147_0 = (eg) param8;
                        stackIn_148_0 = stackOut_147_0;
                        statePc = 148;
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        if (stackIn_148_0.field_K > param8.field_n.length) {
                            statePc = 153;
                        } else {
                            statePc = 149;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 152;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        statePc = 151;
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 152;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_150) {
                        caughtException = stateCaught_150;
                        statePc = 152;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        statePc = 154;
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 152;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        param8.field_n = new short[100 + param8.field_K];
                        statePc = 154;
                        continue stateLoop;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        if (param1.field_n == null) {
                            statePc = 159;
                        } else {
                            statePc = 155;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        stackOut_155_0 = (eg) param1;
                        stackIn_156_0 = stackOut_155_0;
                        statePc = 156;
                        continue stateLoop;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        if ((stackIn_156_0.field_K ^ -1) >= (param1.field_n.length ^ -1)) {
                            statePc = 162;
                        } else {
                            statePc = 157;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        statePc = 159;
                        continue stateLoop;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 158: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_158) {
                        caughtException = stateCaught_158;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 159: {
                    try {
                        param1.field_n = new short[param1.field_K + 100];
                        statePc = 160;
                        continue stateLoop;
                    } catch (Throwable stateCaught_159) {
                        caughtException = stateCaught_159;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 160: {
                    try {
                        statePc = 162;
                        continue stateLoop;
                    } catch (Throwable stateCaught_160) {
                        caughtException = stateCaught_160;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 161: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 162: {
                    try {
                        var12 = 0;
                        statePc = 163;
                        continue stateLoop;
                    } catch (Throwable stateCaught_162) {
                        caughtException = stateCaught_162;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 163: {
                    try {
                        if (var12 >= param8.field_K) {
                            statePc = 168;
                        } else {
                            statePc = 164;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 164: {
                    try {
                        param8.field_n[var12] = param9.field_n[hr.field_n[var12]];
                        var12++;
                        if (var13 != 0) {
                            statePc = 169;
                        } else {
                            statePc = 165;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_164) {
                        caughtException = stateCaught_164;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 165: {
                    try {
                        if (var13 == 0) {
                            statePc = 163;
                        } else {
                            statePc = 166;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 166: {
                    try {
                        statePc = 168;
                        continue stateLoop;
                    } catch (Throwable stateCaught_166) {
                        caughtException = stateCaught_166;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 167: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_167) {
                        caughtException = stateCaught_167;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 168: {
                    try {
                        var12 = 0;
                        statePc = 169;
                        continue stateLoop;
                    } catch (Throwable stateCaught_168) {
                        caughtException = stateCaught_168;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 169: {
                    try {
                        if ((param1.field_K ^ -1) >= (var12 ^ -1)) {
                            statePc = 176;
                        } else {
                            statePc = 170;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_169) {
                        caughtException = stateCaught_169;
                        statePc = 172;
                        continue stateLoop;
                    }
                }
                case 170: {
                    try {
                        param1.field_n[var12] = param9.field_n[gr.field_B[var12]];
                        var12++;
                        if (var13 != 0) {
                            statePc = 178;
                        } else {
                            statePc = 171;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_170) {
                        caughtException = stateCaught_170;
                        statePc = 175;
                        continue stateLoop;
                    }
                }
                case 171: {
                    try {
                        statePc = 173;
                        continue stateLoop;
                    } catch (Throwable stateCaught_171) {
                        caughtException = stateCaught_171;
                        statePc = 175;
                        continue stateLoop;
                    }
                }
                case 172: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_172) {
                        caughtException = stateCaught_172;
                        statePc = 175;
                        continue stateLoop;
                    }
                }
                case 173: {
                    try {
                        if (var13 == 0) {
                            statePc = 169;
                        } else {
                            statePc = 174;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_173) {
                        caughtException = stateCaught_173;
                        statePc = 175;
                        continue stateLoop;
                    }
                }
                case 174: {
                    try {
                        statePc = 176;
                        continue stateLoop;
                    } catch (Throwable stateCaught_174) {
                        caughtException = stateCaught_174;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 175: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_175) {
                        caughtException = stateCaught_175;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 176: {
                    try {
                        if (var13 == 0) {
                            statePc = 178;
                        } else {
                            statePc = 177;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_176) {
                        caughtException = stateCaught_176;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 177: {
                    try {
                        param1.field_n = null;
                        var12_ref = param8;
                        var12_ref.field_n = null;
                        statePc = 178;
                        continue stateLoop;
                    } catch (Throwable stateCaught_177) {
                        caughtException = stateCaught_177;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 178: {
                    try {
                        if (param9.field_L != null) {
                            statePc = 181;
                        } else {
                            statePc = 179;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_178) {
                        caughtException = stateCaught_178;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 179: {
                    try {
                        var12_ref = param8;
                        statePc = 180;
                        continue stateLoop;
                    } catch (Throwable stateCaught_179) {
                        caughtException = stateCaught_179;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 180: {
                    try {
                        param1.field_L = null;
                        var12_ref.field_L = null;
                        if (var13 == 0) {
                            statePc = 228;
                        } else {
                            statePc = 181;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_180) {
                        caughtException = stateCaught_180;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 181: {
                    try {
                        if (param8.field_L == null) {
                            statePc = 188;
                        } else {
                            statePc = 182;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_181) {
                        caughtException = stateCaught_181;
                        statePc = 187;
                        continue stateLoop;
                    }
                }
                case 182: {
                    try {
                        statePc = 184;
                        continue stateLoop;
                    } catch (Throwable stateCaught_182) {
                        caughtException = stateCaught_182;
                        statePc = 187;
                        continue stateLoop;
                    }
                }
                case 183: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_183) {
                        caughtException = stateCaught_183;
                        statePc = 187;
                        continue stateLoop;
                    }
                }
                case 184: {
                    try {
                        stackOut_184_0 = (eg) param8;
                        stackIn_185_0 = stackOut_184_0;
                        statePc = 185;
                        continue stateLoop;
                    } catch (Throwable stateCaught_184) {
                        caughtException = stateCaught_184;
                        statePc = 187;
                        continue stateLoop;
                    }
                }
                case 185: {
                    try {
                        if ((stackIn_185_0.field_L.length ^ -1) <= (param8.field_K ^ -1)) {
                            statePc = 191;
                        } else {
                            statePc = 186;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_185) {
                        caughtException = stateCaught_185;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 186: {
                    try {
                        statePc = 188;
                        continue stateLoop;
                    } catch (Throwable stateCaught_186) {
                        caughtException = stateCaught_186;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 187: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_187) {
                        caughtException = stateCaught_187;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 188: {
                    try {
                        param8.field_L = new short[100 + param8.field_K];
                        statePc = 189;
                        continue stateLoop;
                    } catch (Throwable stateCaught_188) {
                        caughtException = stateCaught_188;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 189: {
                    try {
                        statePc = 191;
                        continue stateLoop;
                    } catch (Throwable stateCaught_189) {
                        caughtException = stateCaught_189;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 190: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_190) {
                        caughtException = stateCaught_190;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 191: {
                    try {
                        if (null == param1.field_L) {
                            statePc = 198;
                        } else {
                            statePc = 192;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_191) {
                        caughtException = stateCaught_191;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 192: {
                    try {
                        stackOut_192_0 = (eg) param1;
                        stackIn_193_0 = stackOut_192_0;
                        statePc = 193;
                        continue stateLoop;
                    } catch (Throwable stateCaught_192) {
                        caughtException = stateCaught_192;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 193: {
                    try {
                        if ((stackIn_193_0.field_L.length ^ -1) > (param1.field_K ^ -1)) {
                            statePc = 198;
                        } else {
                            statePc = 194;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_193) {
                        caughtException = stateCaught_193;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 194: {
                    try {
                        statePc = 196;
                        continue stateLoop;
                    } catch (Throwable stateCaught_194) {
                        caughtException = stateCaught_194;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 195: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_195) {
                        caughtException = stateCaught_195;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 196: {
                    try {
                        statePc = 199;
                        continue stateLoop;
                    } catch (Throwable stateCaught_196) {
                        caughtException = stateCaught_196;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 197: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_197) {
                        caughtException = stateCaught_197;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 198: {
                    try {
                        param1.field_L = new short[100 + param1.field_K];
                        statePc = 199;
                        continue stateLoop;
                    } catch (Throwable stateCaught_198) {
                        caughtException = stateCaught_198;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 199: {
                    try {
                        var12 = 0;
                        statePc = 200;
                        continue stateLoop;
                    } catch (Throwable stateCaught_199) {
                        caughtException = stateCaught_199;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 200: {
                    try {
                        if (var12 >= param8.field_K) {
                            statePc = 205;
                        } else {
                            statePc = 201;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_200) {
                        caughtException = stateCaught_200;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 201: {
                    try {
                        param8.field_L[var12] = param9.field_L[hr.field_n[var12]];
                        var12++;
                        if (var13 != 0) {
                            statePc = 206;
                        } else {
                            statePc = 202;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_201) {
                        caughtException = stateCaught_201;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 202: {
                    try {
                        if (var13 == 0) {
                            statePc = 200;
                        } else {
                            statePc = 203;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_202) {
                        caughtException = stateCaught_202;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 203: {
                    try {
                        statePc = 205;
                        continue stateLoop;
                    } catch (Throwable stateCaught_203) {
                        caughtException = stateCaught_203;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 204: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_204) {
                        caughtException = stateCaught_204;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 205: {
                    try {
                        var12 = 0;
                        statePc = 206;
                        continue stateLoop;
                    } catch (Throwable stateCaught_205) {
                        caughtException = stateCaught_205;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 206: {
                    try {
                        if ((param1.field_K ^ -1) >= (var12 ^ -1)) {
                            statePc = 228;
                        } else {
                            statePc = 207;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_206) {
                        caughtException = stateCaught_206;
                        statePc = 209;
                        continue stateLoop;
                    }
                }
                case 207: {
                    try {
                        param1.field_L[var12] = param9.field_L[gr.field_B[var12]];
                        var12++;
                        if (var13 != 0) {
                            statePc = 228;
                        } else {
                            statePc = 208;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_207) {
                        caughtException = stateCaught_207;
                        statePc = 212;
                        continue stateLoop;
                    }
                }
                case 208: {
                    try {
                        statePc = 210;
                        continue stateLoop;
                    } catch (Throwable stateCaught_208) {
                        caughtException = stateCaught_208;
                        statePc = 212;
                        continue stateLoop;
                    }
                }
                case 209: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_209) {
                        caughtException = stateCaught_209;
                        statePc = 212;
                        continue stateLoop;
                    }
                }
                case 210: {
                    try {
                        if (var13 == 0) {
                            statePc = 206;
                        } else {
                            statePc = 211;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_210) {
                        caughtException = stateCaught_210;
                        statePc = 212;
                        continue stateLoop;
                    }
                }
                case 211: {
                    try {
                        statePc = 228;
                        continue stateLoop;
                    } catch (Throwable stateCaught_211) {
                        caughtException = stateCaught_211;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 212: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_212) {
                        caughtException = stateCaught_212;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 214: {
                    var10 = (RuntimeException) (Object) caughtException;
                    statePc = 215;
                    continue stateLoop;
                }
                case 215: {
                    try {
                        stackOut_215_0 = (RuntimeException) var10;
                        stackOut_215_1 = new StringBuilder().append("ej.C(").append(param0).append(44);
                        stackIn_218_0 = stackOut_215_0;
                        stackIn_218_1 = stackOut_215_1;
                        stackIn_216_0 = stackOut_215_0;
                        stackIn_216_1 = stackOut_215_1;
                        if (param1 == null) {
                            statePc = 218;
                        } else {
                            statePc = 216;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_215) {
                        caughtException = stateCaught_215;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 216: {
                    try {
                        stackOut_216_0 = (RuntimeException) (Object) stackIn_216_0;
                        stackOut_216_1 = (StringBuilder) (Object) stackIn_216_1;
                        stackOut_216_2 = "{...}";
                        stackIn_219_0 = stackOut_216_0;
                        stackIn_219_1 = stackOut_216_1;
                        stackIn_219_2 = stackOut_216_2;
                        statePc = 219;
                        continue stateLoop;
                    } catch (Throwable stateCaught_216) {
                        caughtException = stateCaught_216;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 217: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 218: {
                    stackOut_218_0 = (RuntimeException) (Object) stackIn_218_0;
                    stackOut_218_1 = (StringBuilder) (Object) stackIn_218_1;
                    stackOut_218_2 = "null";
                    stackIn_219_0 = stackOut_218_0;
                    stackIn_219_1 = stackOut_218_1;
                    stackIn_219_2 = stackOut_218_2;
                    statePc = 219;
                    continue stateLoop;
                }
                case 219: {
                    try {
                        stackOut_219_0 = (RuntimeException) (Object) stackIn_219_0;
                        stackOut_219_1 = ((StringBuilder) (Object) stackIn_219_1).append(stackIn_219_2).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44).append(param6).append(44).append(param7).append(44);
                        stackIn_222_0 = stackOut_219_0;
                        stackIn_222_1 = stackOut_219_1;
                        stackIn_220_0 = stackOut_219_0;
                        stackIn_220_1 = stackOut_219_1;
                        if (param8 == null) {
                            statePc = 222;
                        } else {
                            statePc = 220;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_219) {
                        caughtException = stateCaught_219;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 220: {
                    try {
                        stackOut_220_0 = (RuntimeException) (Object) stackIn_220_0;
                        stackOut_220_1 = (StringBuilder) (Object) stackIn_220_1;
                        stackOut_220_2 = "{...}";
                        stackIn_223_0 = stackOut_220_0;
                        stackIn_223_1 = stackOut_220_1;
                        stackIn_223_2 = stackOut_220_2;
                        statePc = 223;
                        continue stateLoop;
                    } catch (Throwable stateCaught_220) {
                        caughtException = stateCaught_220;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 221: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 222: {
                    stackOut_222_0 = (RuntimeException) (Object) stackIn_222_0;
                    stackOut_222_1 = (StringBuilder) (Object) stackIn_222_1;
                    stackOut_222_2 = "null";
                    stackIn_223_0 = stackOut_222_0;
                    stackIn_223_1 = stackOut_222_1;
                    stackIn_223_2 = stackOut_222_2;
                    statePc = 223;
                    continue stateLoop;
                }
                case 223: {
                    try {
                        stackOut_223_0 = (RuntimeException) (Object) stackIn_223_0;
                        stackOut_223_1 = ((StringBuilder) (Object) stackIn_223_1).append(stackIn_223_2).append(44);
                        stackIn_226_0 = stackOut_223_0;
                        stackIn_226_1 = stackOut_223_1;
                        stackIn_224_0 = stackOut_223_0;
                        stackIn_224_1 = stackOut_223_1;
                        if (param9 == null) {
                            statePc = 226;
                        } else {
                            statePc = 224;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_223) {
                        caughtException = stateCaught_223;
                        statePc = 225;
                        continue stateLoop;
                    }
                }
                case 224: {
                    try {
                        stackOut_224_0 = (RuntimeException) (Object) stackIn_224_0;
                        stackOut_224_1 = (StringBuilder) (Object) stackIn_224_1;
                        stackOut_224_2 = "{...}";
                        stackIn_227_0 = stackOut_224_0;
                        stackIn_227_1 = stackOut_224_1;
                        stackIn_227_2 = stackOut_224_2;
                        statePc = 227;
                        continue stateLoop;
                    } catch (Throwable stateCaught_224) {
                        caughtException = stateCaught_224;
                        statePc = 225;
                        continue stateLoop;
                    }
                }
                case 225: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 226: {
                    stackOut_226_0 = (RuntimeException) (Object) stackIn_226_0;
                    stackOut_226_1 = (StringBuilder) (Object) stackIn_226_1;
                    stackOut_226_2 = "null";
                    stackIn_227_0 = stackOut_226_0;
                    stackIn_227_1 = stackOut_226_1;
                    stackIn_227_2 = stackOut_226_2;
                    statePc = 227;
                    continue stateLoop;
                }
                case 227: {
                    throw wm.a((Throwable) (Object) stackIn_227_0, stackIn_227_2 + 41);
                }
                case 228: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final ge a(int param0) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        ge stackIn_5_0 = null;
        Object stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        ge stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        Object stackOut_6_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0 == -25955) {
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
                        stackOut_1_0 = null;
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
                    return (ge) (Object) stackIn_2_0;
                }
                case 3: {
                    try {
                        if ((((ej) this).field_e ^ -1) != -4) {
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
                        stackOut_4_0 = ((ej) this).field_d;
                        stackIn_5_0 = stackOut_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return stackIn_5_0;
                }
                case 6: {
                    try {
                        stackOut_6_0 = null;
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
                    return (ge) (Object) stackIn_7_0;
                }
                case 8: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw wm.a((Throwable) (Object) var2, "ej.E(" + param0 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final void run() {
        try {
            Object var1 = null;
            Exception var1_ref = null;
            RuntimeException var1_ref2 = null;
            int var1_int = 0;
            Object var1_ref3 = null;
            Throwable var2 = null;
            Object var2_ref = null;
            Throwable var3 = null;
            int var4 = 0;
            int stackIn_4_0 = 0;
            int stackIn_4_1 = 0;
            int stackIn_14_0 = 0;
            int stackIn_14_1 = 0;
            int stackOut_3_0 = 0;
            int stackOut_3_1 = 0;
            int stackOut_13_0 = 0;
            int stackOut_13_1 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var4 = Pool.field_O;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if ((((ej) this).field_d.field_t.length ^ -1) >= (((ej) this).field_d.field_v ^ -1)) {
                                statePc = 13;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = (stateCaught_1 instanceof Exception ? 23 : 29);
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            var1_int = ((ej) this).field_h.read(((ej) this).field_d.field_t, ((ej) this).field_d.field_v, ((ej) this).field_d.field_t.length + -((ej) this).field_d.field_v);
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = (stateCaught_2 instanceof Exception ? 23 : 29);
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            stackOut_3_0 = -1;
                            stackOut_3_1 = var1_int ^ -1;
                            stackIn_14_0 = stackOut_3_0;
                            stackIn_14_1 = stackOut_3_1;
                            stackIn_4_0 = stackOut_3_0;
                            stackIn_4_1 = stackOut_3_1;
                            if (var4 != 0) {
                                statePc = 14;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = (stateCaught_3 instanceof Exception ? 6 : 29);
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (stackIn_4_0 >= stackIn_4_1) {
                                statePc = 10;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = (stateCaught_4 instanceof Exception ? 6 : 29);
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = (stateCaught_5 instanceof Exception ? 23 : 29);
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = (stateCaught_6 instanceof Exception ? 23 : 29);
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (var4 == 0) {
                                statePc = 13;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = (stateCaught_7 instanceof Exception ? 12 : 29);
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = (stateCaught_8 instanceof Exception ? 12 : 29);
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            ((ej) this).field_d.field_v = ((ej) this).field_d.field_v + var1_int;
                            if (var4 == 0) {
                                statePc = 1;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = (stateCaught_10 instanceof Exception ? 12 : 29);
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = (stateCaught_11 instanceof Exception ? 23 : 29);
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = (stateCaught_12 instanceof Exception ? 23 : 29);
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            stackOut_13_0 = ((ej) this).field_d.field_t.length ^ -1;
                            stackOut_13_1 = ((ej) this).field_d.field_v ^ -1;
                            stackIn_14_0 = stackOut_13_0;
                            stackIn_14_1 = stackOut_13_1;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = (stateCaught_13 instanceof Exception ? 23 : 29);
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            if (stackIn_14_0 != stackIn_14_1) {
                                statePc = 17;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = (stateCaught_14 instanceof Exception ? 16 : 29);
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            throw (RuntimeException) (Object) new Exception("HG1: " + ((ej) this).field_d.field_t.length + " " + ((ej) this).field_i);
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof Exception ? 16 : 29);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof Exception ? 23 : 29);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            var1_ref3 = this;
                            // monitorenter this
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof Exception ? 23 : 29);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            ((ej) this).finalize();
                            ((ej) this).field_e = 3;
                            // monitorexit var1_ref3
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof Exception ? 23 : 29);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            var2 = caughtException;
                            // monitorexit var1_ref3
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            throw (RuntimeException) (Object) var2;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof Exception ? 23 : 29);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            var1_ref = (Exception) (Object) caughtException;
                            var2_ref = this;
                            // monitorenter this
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            ((ej) this).finalize();
                            ((ej) this).field_e = ((ej) this).field_e + 1;
                            // monitorexit var2_ref
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 26;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            var3 = caughtException;
                            // monitorexit var2_ref
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 26;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            throw (RuntimeException) (Object) var3;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        var1_ref2 = (RuntimeException) (Object) caughtException;
                        throw wm.a((Throwable) (Object) var1_ref2, "ej.run()");
                    }
                    case 30: {
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

    final static void a(boolean param0, int param1, int param2, byte param3, oc param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
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
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        oc stackIn_3_0 = null;
        int stackIn_33_0 = 0;
        Object stackIn_45_0 = null;
        oc stackIn_55_0 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        oc stackOut_2_0 = null;
        int stackOut_30_0 = 0;
        int stackOut_32_0 = 0;
        Object stackOut_44_0 = null;
        oc stackOut_54_0 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var7 = 101 / ((-47 - param3) / 46);
                        var5_int = gi.a(3 * (-param2 + param1), 0);
                        var6 = param2 * 3;
                        var8 = -10 + var5_int;
                        statePc = 1;
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        ar.a((byte) 48);
                        if (0 >= param4.field_I) {
                            statePc = 9;
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
                        stackOut_2_0 = (oc) param4;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (stackIn_3_0.field_K == null) {
                            statePc = 9;
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
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        ka.h(0);
                        statePc = 7;
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
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        eh.field_x = 0;
                        var9 = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (param4.field_d <= var9) {
                            statePc = 53;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var10 = param4.field_y[var9];
                        var11 = param4.field_r[var9];
                        var12 = param4.field_u[var9];
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (param0) {
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
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var13 = ch.field_M[var10];
                        var14 = li.field_h[var10];
                        var15 = ch.field_M[var11] - var13;
                        var16 = -var13 + ch.field_M[var12];
                        var17 = -var14 + li.field_h[var11];
                        var18 = li.field_h[var12] - var14;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if ((var15 * var18 + -(var16 * var17) ^ -1) > -1) {
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
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var13 = fe.field_L[var10];
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (-2147483648 != var13) {
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
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var14 = fe.field_L[var11];
                        if (var14 == -2147483648) {
                            statePc = 52;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var15 = fe.field_L[var12];
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if ((var15 ^ -1) != 2147483647) {
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
                        statePc = 52;
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
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var16 = -var6 + (var14 + var13 + var15);
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (0 > var8) {
                            statePc = 32;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackOut_30_0 = var16 >> var8;
                        stackIn_33_0 = stackOut_30_0;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackOut_32_0 = var16 << -var8;
                        stackIn_33_0 = stackOut_32_0;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var17 = -stackIn_33_0 + (lq.field_T.length - 1);
                        var18 = lq.field_T[var17];
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if ((var18 >> -581151548 ^ -1) == -1) {
                            statePc = 42;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var17--;
                        if (var17 < 0) {
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
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        System.err.println("Out of range!");
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var18 = lq.field_T[var17];
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var19 = var18 + (var17 << -1406096316);
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        tl.field_I[var19] = var9;
                        lq.field_T[var17] = 1 + var18;
                        if (-1 <= (param4.field_I ^ -1)) {
                            statePc = 51;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        stackOut_44_0 = null;
                        stackIn_45_0 = stackOut_44_0;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (stackIn_45_0 == (Object) (Object) param4.field_K) {
                            statePc = 51;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        wa.field_ib[param4.field_K[var9]] = wa.field_ib[param4.field_K[var9]] + 1;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        eh.field_x = eh.field_x + 1;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var9++;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (0 >= param4.field_I) {
                            statePc = 70;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        stackOut_54_0 = (oc) param4;
                        stackIn_55_0 = stackOut_54_0;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (stackIn_55_0.field_K != null) {
                            statePc = 60;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var9 = 0;
                        var10 = 0;
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (wa.field_ib.length <= var10) {
                            statePc = 70;
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
                        var11 = wa.field_ib[var10];
                        wa.field_ib[var10] = var9;
                        var9 = var9 + var11;
                        var10++;
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 64: {
                    var5 = (RuntimeException) (Object) caughtException;
                    statePc = 65;
                    continue stateLoop;
                }
                case 65: {
                    try {
                        stackOut_65_0 = (RuntimeException) var5;
                        stackOut_65_1 = new StringBuilder().append("ej.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
                        stackIn_68_0 = stackOut_65_0;
                        stackIn_68_1 = stackOut_65_1;
                        stackIn_66_0 = stackOut_65_0;
                        stackIn_66_1 = stackOut_65_1;
                        if (param4 == null) {
                            statePc = 68;
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
                        stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
                        stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
                        stackOut_66_2 = "{...}";
                        stackIn_69_0 = stackOut_66_0;
                        stackIn_69_1 = stackOut_66_1;
                        stackIn_69_2 = stackOut_66_2;
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 67: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 68: {
                    stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
                    stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
                    stackOut_68_2 = "null";
                    stackIn_69_0 = stackOut_68_0;
                    stackIn_69_1 = stackOut_68_1;
                    stackIn_69_2 = stackOut_68_2;
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    throw wm.a((Throwable) (Object) stackIn_69_0, stackIn_69_2 + 41);
                }
                case 70: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    protected final void finalize() {
        Exception exception = null;
        RuntimeException var1 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (((ej) this).field_a != null) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = (stateCaught_0 instanceof RuntimeException ? 25 : 2);
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = (stateCaught_1 instanceof RuntimeException ? 25 : 2);
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (((ej) this).field_a.field_e != null) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = (stateCaught_3 instanceof Exception ? 5 : 25);
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = (stateCaught_4 instanceof Exception ? 5 : 25);
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        ((DataInputStream) ((ej) this).field_a.field_e).close();
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = (stateCaught_6 instanceof Exception ? 8 : 25);
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        exception = (Exception) (Object) caughtException;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        ((ej) this).field_a = null;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (null == ((ej) this).field_k) {
                            statePc = 18;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = (stateCaught_10 instanceof Exception ? 13 : 25);
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (((ej) this).field_k.field_e == null) {
                            statePc = 17;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = (stateCaught_11 instanceof Exception ? 13 : 25);
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        ((java.net.Socket) ((ej) this).field_k.field_e).close();
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = (stateCaught_14 instanceof Exception ? 16 : 25);
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        exception = (Exception) (Object) caughtException;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        ((ej) this).field_k = null;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (null == ((ej) this).field_h) {
                            statePc = 23;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        ((ej) this).field_h.close();
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = (stateCaught_19 instanceof Exception ? 21 : 25);
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        exception = (Exception) (Object) caughtException;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        ((ej) this).field_h = null;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        ((ej) this).field_f = null;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 25: {
                    var1 = (RuntimeException) (Object) caughtException;
                    throw wm.a((Throwable) (Object) var1, "ej.finalize()");
                }
                case 26: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    ej(sj param0, java.net.URL param1, int param2) {
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
        int statePc = 1;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 1: {
                    try {
                        ((ej) this).field_i = param1;
                        ((ej) this).field_b = param0;
                        ((ej) this).field_d = new ge(param2);
                        statePc = 13;
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
                        stackOut_4_1 = new StringBuilder().append("ej.<init>(");
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
                    throw wm.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param2 + 41);
                }
                case 13: {
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(boolean param0) {
        try {
            field_c = null;
            field_j = null;
            if (!param0) {
                field_l = false;
            }
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "ej.B(" + param0 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Please enter a year between <%0> and <%1>";
    }
}
