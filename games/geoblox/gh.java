/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gh {
    float field_J;
    boolean field_B;
    boolean field_Y;
    private StringBuilder field_X;
    int field_w;
    int field_u;
    private boolean field_R;
    private boolean field_Q;
    boolean field_C;
    private boolean field_j;
    int field_T;
    boolean field_N;
    private int field_a;
    int field_q;
    static volatile int field_P;
    private boolean field_V;
    private int field_r;
    boolean field_K;
    int field_v;
    private int field_U;
    int field_o;
    private boolean field_s;
    private int field_k;
    boolean field_x;
    private boolean field_d;
    private boolean field_f;
    int field_y;
    private int field_G;
    private boolean field_b;
    private int field_t;
    static int[] field_m;
    private Geoblox field_I;
    private int field_p;
    static String field_z;
    private boolean field_h;
    private boolean field_i;
    private int field_l;
    private int field_A;
    private StringBuilder field_g;
    private int field_W;
    private int field_ab;
    boolean field_H;
    private int field_D;
    private boolean field_E;
    private boolean field_n;
    private boolean field_L;
    boolean field_F;
    private kl field_M;
    int field_e;
    private int field_S;
    private boolean field_Z;
    private int field_c;
    int field_bb;

    private final void c(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            L0: {
              ((gh) this).field_Y = false;
              ((gh) this).field_H = true;
              if (param0 == 7000) {
                break L0;
              } else {
                ((gh) this).field_R = true;
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          ((gh) this).field_f = false;
          ((gh) this).field_C = false;
        }
    }

    private final void g(int param0) {
        RuntimeException var2 = null;
        String var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_6_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_65_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_64_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = Geoblox.field_C;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (0 != ((gh) this).field_t) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return;
                }
                case 4: {
                    try {
                        var2_ref = uk.a(((gh) this).field_p, 24146);
                        var3 = fi.field_d.field_o - fi.field_d.field_q + param0;
                        var4 = 460;
                        var5 = 30 + fi.field_d.b(var2_ref, var4) * var3;
                        var6 = 300;
                        if ((((gh) this).field_p ^ -1) != -1) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var6 = 232;
                        stackOut_5_0 = var7;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (stackIn_6_0 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (((gh) this).field_p == 3) {
                            statePc = 16;
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
                        if (1 == ((gh) this).field_p) {
                            statePc = 15;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 17;
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
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var6 = 280;
                        if (var7 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var6 = 270;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        ma.a(var6, 70, 10 + var5, (byte) -92, 500, ll.field_h);
                        int discarded$1 = fi.field_d.a(var2_ref, 95, 15 + var6, var4, 300, 1, -1, 0, 0, var3);
                        if (-6 != (((gh) this).field_p ^ -1)) {
                            statePc = 53;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (-101 <= (qa.field_a ^ -1)) {
                            statePc = 36;
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
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackOut_21_0 = -341;
                        stackIn_22_0 = stackOut_21_0;
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
                        if (stackIn_22_0 >= (qa.field_a ^ -1)) {
                            statePc = 36;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackOut_25_0 = -441;
                        stackIn_26_0 = stackOut_25_0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (stackIn_26_0 <= (ue.field_e ^ -1)) {
                            statePc = 36;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackOut_29_0 = ue.field_e;
                        stackIn_30_0 = stackOut_29_0;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (stackIn_30_0 >= 476) {
                            statePc = 36;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        dd.field_G.field_K[0][wf.field_p] = 15488514;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        ma.a(440, 100, 36, (byte) -92, 240, eb.field_g);
                        dd.field_G.b(cf.field_j, 220, 468, 0, -1);
                        dd.field_G.field_K[0][wf.field_p] = 16689938;
                        ma.a(440, 380, 36, (byte) -92, 160, eb.field_g);
                        if (380 >= qa.field_a) {
                            statePc = 52;
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
                        stackOut_37_0 = 540;
                        stackIn_38_0 = stackOut_37_0;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (stackIn_38_0 <= qa.field_a) {
                            statePc = 52;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
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
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        stackOut_41_0 = ue.field_e;
                        stackIn_42_0 = stackOut_41_0;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (stackIn_42_0 <= 440) {
                            statePc = 52;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        stackOut_45_0 = 476;
                        stackIn_46_0 = stackOut_45_0;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (stackIn_46_0 > ue.field_e) {
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
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        dd.field_G.field_K[0][wf.field_p] = 15488514;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        dd.field_G.b(nk.field_g, var4, 468, 0, -1);
                        dd.field_G.field_K[0][wf.field_p] = 16689938;
                        if (var7 == 0) {
                            statePc = 74;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        ma.a(440, 240, 36, (byte) -92, 160, eb.field_g);
                        if (250 >= qa.field_a) {
                            statePc = 71;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        stackOut_56_0 = -390;
                        stackIn_57_0 = stackOut_56_0;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (stackIn_57_0 >= (qa.field_a ^ -1)) {
                            statePc = 71;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        stackOut_60_0 = ue.field_e;
                        stackIn_61_0 = stackOut_60_0;
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if ((stackIn_61_0 ^ -1) >= -441) {
                            statePc = 71;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        stackOut_64_0 = 476;
                        stackIn_65_0 = stackOut_64_0;
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        if (stackIn_65_0 <= ue.field_e) {
                            statePc = 71;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        dd.field_G.field_K[0][wf.field_p] = 15488514;
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        dd.field_G.b(mi.field_y, 320, 468, 0, -1);
                        dd.field_G.field_K[0][wf.field_p] = 16689938;
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 73: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw t.a((Throwable) (Object) var2, "gh.T(" + param0 + 41);
                }
                case 74: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static boolean a(String param0, boolean param1) {
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int stackOut_2_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_24_0 = 0;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Geoblox.field_C;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (d.field_b.startsWith("win")) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = (stateCaught_1 instanceof Exception ? 24 : 26);
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = 0;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = (stateCaught_2 instanceof Exception ? 24 : 26);
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0 != 0;
                }
                case 4: {
                    try {
                        if (!param1) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = (stateCaught_4 instanceof Exception ? 24 : 26);
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = 1;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = (stateCaught_5 instanceof Exception ? 24 : 26);
                        continue stateLoop;
                    }
                }
                case 6: {
                    return stackIn_6_0 != 0;
                }
                case 7: {
                    try {
                        if (param0.startsWith("http://")) {
                            statePc = 13;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = (stateCaught_7 instanceof Exception ? 24 : 26);
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (param0.startsWith("https://")) {
                            statePc = 13;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = (stateCaught_8 instanceof Exception ? 24 : 26);
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = (stateCaught_9 instanceof Exception ? 24 : 26);
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackOut_11_0 = 0;
                        stackIn_12_0 = stackOut_11_0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = (stateCaught_11 instanceof Exception ? 24 : 26);
                        continue stateLoop;
                    }
                }
                case 12: {
                    return stackIn_12_0 != 0;
                }
                case 13: {
                    try {
                        var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                        var3 = 0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = (stateCaught_13 instanceof Exception ? 24 : 26);
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (param0.length() <= var3) {
                            statePc = 22;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = (stateCaught_14 instanceof Exception ? 24 : 26);
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackOut_15_0 = var2.indexOf((int) param0.charAt(var3));
                        stackIn_23_0 = stackOut_15_0;
                        stackIn_16_0 = stackOut_15_0;
                        if (var4 != 0) {
                            statePc = 23;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = (stateCaught_15 instanceof Exception ? 24 : 26);
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (stackIn_16_0 != -1) {
                            statePc = 21;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = (stateCaught_16 instanceof Exception ? 24 : 26);
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = (stateCaught_17 instanceof Exception ? 24 : 26);
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackOut_19_0 = 0;
                        stackIn_20_0 = stackOut_19_0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = (stateCaught_19 instanceof Exception ? 24 : 26);
                        continue stateLoop;
                    }
                }
                case 20: {
                    return stackIn_20_0 != 0;
                }
                case 21: {
                    try {
                        var3++;
                        if (var4 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = (stateCaught_21 instanceof Exception ? 24 : 26);
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        Process discarded$2 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
                        stackOut_22_0 = 1;
                        stackIn_23_0 = stackOut_22_0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = (stateCaught_22 instanceof Exception ? 24 : 26);
                        continue stateLoop;
                    }
                }
                case 23: {
                    return stackIn_23_0 != 0;
                }
                case 24: {
                    try {
                        var2_ref = (Exception) (Object) caughtException;
                        stackOut_24_0 = 0;
                        stackIn_25_0 = stackOut_24_0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 25: {
                    return stackIn_25_0 != 0;
                }
                case 26: {
                    var2_ref2 = (RuntimeException) (Object) caughtException;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    try {
                        stackOut_27_0 = (RuntimeException) var2_ref2;
                        stackOut_27_1 = new StringBuilder().append("gh.U(");
                        stackIn_30_0 = stackOut_27_0;
                        stackIn_30_1 = stackOut_27_1;
                        stackIn_28_0 = stackOut_27_0;
                        stackIn_28_1 = stackOut_27_1;
                        if (param0 == null) {
                            statePc = 30;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
                        stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
                        stackOut_28_2 = "{...}";
                        stackIn_31_0 = stackOut_28_0;
                        stackIn_31_1 = stackOut_28_1;
                        stackIn_31_2 = stackOut_28_2;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 29: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 30: {
                    stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
                    stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
                    stackOut_30_2 = "null";
                    stackIn_31_0 = stackOut_30_0;
                    stackIn_31_1 = stackOut_30_1;
                    stackIn_31_2 = stackOut_30_2;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    throw t.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + 44 + param1 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(byte param0) {
        String var2 = null;
        int var2_int = 0;
        int var3 = 0;
        String var3_ref = null;
        int var4 = 0;
        float var5_float = 0.0f;
        int var5 = 0;
        float var6_float = 0.0f;
        int var6 = 0;
        float var7_float = 0.0f;
        int var7_int = 0;
        tf var7 = null;
        int var8 = 0;
        ja var8_ref_ja = null;
        float var9_float = 0.0f;
        int var9 = 0;
        float var10_float = 0.0f;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_37_0 = 0;
        int stackIn_96_0 = 0;
        int stackIn_96_1 = 0;
        int stackIn_133_0 = 0;
        int stackIn_133_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_95_0 = 0;
        int stackOut_95_1 = 0;
        int stackOut_132_0 = 0;
        int stackOut_132_1 = 0;
        var14 = Geoblox.field_C;
        if (!ll.field_g[c.field_ab]) {
          L0: {
            L1: {
              L2: {
                L3: {
                  L4: {
                    L5: {
                      L6: {
                        L7: {
                          var3 = c.field_ab;
                          if ((var3 ^ -1) != -5) {
                            break L7;
                          } else {
                            if (var14 == 0) {
                              var2 = "baking";
                              if (var14 == 0) {
                                break L0;
                              } else {
                                break L6;
                              }
                            } else {
                              break L7;
                            }
                          }
                        }
                        L8: {
                          if (-7 != (var3 ^ -1)) {
                            break L8;
                          } else {
                            if (var14 == 0) {
                              break L6;
                            } else {
                              break L8;
                            }
                          }
                        }
                        L9: {
                          if (var3 != 5) {
                            break L9;
                          } else {
                            if (var14 == 0) {
                              break L5;
                            } else {
                              break L9;
                            }
                          }
                        }
                        if (-1 == (var3 ^ -1)) {
                          break L4;
                        } else {
                          L10: {
                            if (3 != var3) {
                              break L10;
                            } else {
                              if (var14 == 0) {
                                break L3;
                              } else {
                                break L10;
                              }
                            }
                          }
                          if (-3 == (var3 ^ -1)) {
                            break L2;
                          } else {
                            break L1;
                          }
                        }
                      }
                      var2 = "space";
                      if (var14 == 0) {
                        break L0;
                      } else {
                        break L5;
                      }
                    }
                    var2 = "sports";
                    if (var14 == 0) {
                      break L0;
                    } else {
                      break L4;
                    }
                  }
                  var2 = "jewels";
                  if (var14 == 0) {
                    break L0;
                  } else {
                    break L3;
                  }
                }
                var2 = "germs";
                if (var14 == 0) {
                  break L0;
                } else {
                  break L2;
                }
              }
              var2 = "sweets";
              if (var14 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
            var2 = "";
            break L0;
          }
          var3_ref = gf.a(ff.field_l, ll.field_f, var2, wi.field_F, true);
          var4 = 30 + dd.field_G.a(var3_ref);
          ma.a(215, 320 - var4 / 2, 50, (byte) -92, var4, ll.field_h);
          dd.field_G.b(var3_ref, 320, 250, 0, -1);
          return;
        } else {
          L11: {
            L12: {
              if (!ih.a(0)) {
                break L12;
              } else {
                if (!((gh) this).field_H) {
                  break L12;
                } else {
                  if (!((gh) this).field_i) {
                    break L12;
                  } else {
                    stackOut_35_0 = 1;
                    stackIn_37_0 = stackOut_35_0;
                    break L11;
                  }
                }
              }
            }
            stackOut_36_0 = 0;
            stackIn_37_0 = stackOut_36_0;
            break L11;
          }
          L13: {
            var2_int = stackIn_37_0;
            if (var2_int != 0) {
              break L13;
            } else {
              L14: {
                if (((gh) this).field_F) {
                  break L14;
                } else {
                  oc.field_d.e();
                  if (!((gh) this).field_V) {
                    gj.f((byte) -63);
                    if (var14 == 0) {
                      break L13;
                    } else {
                      break L14;
                    }
                  } else {
                    break L13;
                  }
                }
              }
              L15: {
                oc.field_d.e();
                vb.c();
                if (!((gh) this).field_V) {
                  dc.a(7838);
                  break L15;
                } else {
                  break L15;
                }
              }
              k.a(10, 90, 460, -27085, 460);
              ((gh) this).field_F = false;
              break L13;
            }
          }
          L16: {
            sh.field_y.a(255);
            mf.field_a.b(0, 0);
            var3 = 4;
            var4 = 4;
            if (param0 < -28) {
              break L16;
            } else {
              ((gh) this).a(-63);
              break L16;
            }
          }
          L17: {
            if (((gh) this).field_L) {
              L18: {
                if (((gh) this).field_D > 266) {
                  break L18;
                } else {
                  var5_float = (float)((gh) this).field_D / 266.0f;
                  var6_float = -var5_float + 1.0f;
                  var7_float = var6_float * var6_float;
                  var3 = (int)(0.5f + (70.0f * (2.0f * var5_float * var6_float) + 10.0f * var7_float + 220.0f * (var5_float * var5_float)));
                  var4 = (int)(170.0f * (var5_float * var5_float) + (var7_float * 10.0f + 140.0f * (var5_float * 2.0f * var6_float)) + 0.5f);
                  if (var14 == 0) {
                    break L17;
                  } else {
                    break L18;
                  }
                }
              }
              var3 = 220;
              var4 = 170;
              break L17;
            } else {
              break L17;
            }
          }
          L19: {
            L20: {
              if (!((gh) this).field_Y) {
                break L20;
              } else {
                L21: {
                  var5 = 176 - ((gh) this).field_v / 2;
                  if (10 > var5) {
                    var5 = 10;
                    break L21;
                  } else {
                    break L21;
                  }
                }
                var6 = -fi.field_d.field_q + fi.field_d.field_o;
                var7_int = fi.field_d.c(v.field_n, 640) + 40;
                var8 = fi.field_d.b(v.field_n, 640) * var6 - -10;
                ma.a(var5, -(var7_int / 2) + 320, 20 + var8, (byte) -92, var7_int, ll.field_h);
                fi.field_d.b(v.field_n, 320, var5 + 28, 1, -1);
                fi.field_d.b(v.field_n, 319, 28 + var5, 1, -1);
                if (var14 == 0) {
                  break L19;
                } else {
                  break L20;
                }
              }
            }
            L22: {
              L23: {
                lj.field_d.b(var3, var4);
                if (0 != ((gh) this).field_bb) {
                  break L23;
                } else {
                  if (!ih.a(0)) {
                    break L22;
                  } else {
                    break L23;
                  }
                }
              }
              vh.field_G.b(446, 410);
              if (var14 == 0) {
                break L19;
              } else {
                break L22;
              }
            }
            g.field_i.b(468, 410);
            break L19;
          }
          L24: {
            if (((gh) this).field_Y) {
              break L24;
            } else {
              L25: {
                if (!ih.a(0)) {
                  break L25;
                } else {
                  if (var2_int == 0) {
                    break L24;
                  } else {
                    if (0 == ((gh) this).field_bb) {
                      break L25;
                    } else {
                      if (-2 != (((gh) this).field_bb ^ -1)) {
                        break L24;
                      } else {
                        break L25;
                      }
                    }
                  }
                }
              }
              this.e(-46);
              break L24;
            }
          }
          L26: {
            if (!((gh) this).field_V) {
              h.c(-1);
              break L26;
            } else {
              break L26;
            }
          }
          L27: {
            if (((gh) this).field_V) {
              break L27;
            } else {
              if (var2_int == 0) {
                oc.field_d.b(0, 0);
                break L27;
              } else {
                break L27;
              }
            }
          }
          L28: {
            ij.h((byte) 18);
            if (!((gh) this).field_V) {
              ni.f(484842465);
              break L28;
            } else {
              break L28;
            }
          }
          L29: {
            jf.field_a.e();
            vb.c();
            ec.field_c.b(ec.field_c.field_s << 1679206499, ec.field_c.field_o << 919227299, jf.field_a.field_s << -122785245, jf.field_a.field_o << 1137750627, (int)(65535.0 * ((double)(-((gh) this).field_J) / 6.283185307179586)), 4096);
            sh.field_y.a(255);
            w.a(jf.field_a, -(jf.field_a.field_s >> -199505663) + 320, -(jf.field_a.field_o >> -1092517823) + 240);
            if (!((gh) this).field_V) {
              uh.d(4740);
              break L29;
            } else {
              break L29;
            }
          }
          L30: {
            if (!((gh) this).field_s) {
              break L30;
            } else {
              af.field_a.e();
              vb.a(0, 0, vb.field_f, vb.field_b, 1118481);
              var5 = 16777215;
              vb.f(160, 120, 115, 16711680);
              var6 = 20;
              var7 = wd.field_e;
              var8_ref_ja = (ja) (Object) var7.a(false);
              L31: while (true) {
                L32: {
                  L33: {
                    if (var8_ref_ja == null) {
                      break L33;
                    } else {
                      var9_float = -320.0f + var8_ref_ja.field_o;
                      var10_float = -240.0f + var8_ref_ja.field_v;
                      var11 = (int)(320.0 + (Math.cos((double)el.field_o.field_J) * (double)var9_float - Math.sin((double)el.field_o.field_J) * (double)var10_float));
                      var12 = (int)(240.0 + ((double)var9_float * Math.sin((double)el.field_o.field_J) + (double)var10_float * Math.cos((double)el.field_o.field_J)));
                      var13 = 255 - var8_ref_ja.field_r * 255 / var8_ref_ja.field_p;
                      stackOut_95_0 = 11;
                      stackOut_95_1 = var13;
                      stackIn_133_0 = stackOut_95_0;
                      stackIn_133_1 = stackOut_95_1;
                      stackIn_96_0 = stackOut_95_0;
                      stackIn_96_1 = stackOut_95_1;
                      if (var14 != 0) {
                        break L32;
                      } else {
                        L34: {
                          if (stackIn_96_0 > stackIn_96_1) {
                            var13 = 11;
                            break L34;
                          } else {
                            break L34;
                          }
                        }
                        L35: {
                          if (-256 > (var13 ^ -1)) {
                            var13 = 255;
                            break L35;
                          } else {
                            break L35;
                          }
                        }
                        vb.d(var11 / 2, var12 / 2, var6, var13 << 269082696 | var13 << -327781456 | var13);
                        var8_ref_ja = (ja) (Object) var7.b(0);
                        if (var14 == 0) {
                          continue L31;
                        } else {
                          break L33;
                        }
                      }
                    }
                  }
                  var7 = ji.field_r;
                  var8_ref_ja = (ja) (Object) var7.g(0);
                  L36: while (true) {
                    L37: {
                      L38: {
                        if (null == var8_ref_ja) {
                          break L38;
                        } else {
                          var9_float = -320.0f + var8_ref_ja.field_o;
                          var10_float = -240.0f + var8_ref_ja.field_v;
                          var11 = (int)(Math.cos((double)el.field_o.field_J) * (double)var9_float - Math.sin((double)el.field_o.field_J) * (double)var10_float + 320.0);
                          var12 = (int)(240.0 + ((double)var9_float * Math.sin((double)el.field_o.field_J) + (double)var10_float * Math.cos((double)el.field_o.field_J)));
                          vb.d(var11 / 2, var12 / 2, var6, var5);
                          var8_ref_ja = (ja) (Object) var7.d(1);
                          if (var14 != 0) {
                            break L37;
                          } else {
                            if (var14 == 0) {
                              continue L36;
                            } else {
                              break L38;
                            }
                          }
                        }
                      }
                      var7 = a.field_d;
                      break L37;
                    }
                    var8_ref_ja = (ja) (Object) var7.g(0);
                    L39: while (true) {
                      L40: {
                        L41: {
                          if (var8_ref_ja == null) {
                            break L41;
                          } else {
                            vb.d((int)(var8_ref_ja.field_o / 2.0f), (int)(var8_ref_ja.field_v / 2.0f), var6, var5);
                            var8_ref_ja = (ja) (Object) var7.d(1);
                            if (var14 != 0) {
                              break L40;
                            } else {
                              if (var14 == 0) {
                                continue L39;
                              } else {
                                break L41;
                              }
                            }
                          }
                        }
                        var7 = bh.field_c;
                        break L40;
                      }
                      var8_ref_ja = (ja) (Object) var7.g(0);
                      L42: while (true) {
                        L43: {
                          L44: {
                            L45: {
                              if (var8_ref_ja == null) {
                                break L45;
                              } else {
                                vb.d((int)(var8_ref_ja.field_o / 2.0f), (int)(var8_ref_ja.field_v / 2.0f), var6, var5);
                                var8_ref_ja = (ja) (Object) var7.d(1);
                                if (var14 != 0) {
                                  break L44;
                                } else {
                                  if (var14 == 0) {
                                    continue L42;
                                  } else {
                                    break L45;
                                  }
                                }
                              }
                            }
                            if (!((gh) this).field_Y) {
                              lj.field_d.a(var3 / 2, var4 / 2, lj.field_d.field_s / 2, lj.field_d.field_o / 2, var5);
                              break L44;
                            } else {
                              L46: {
                                var8 = -(((gh) this).field_v / 2) + 176;
                                if ((var8 ^ -1) <= -11) {
                                  break L46;
                                } else {
                                  var8 = 10;
                                  break L46;
                                }
                              }
                              var9 = fi.field_d.field_o + -fi.field_d.field_q;
                              var10 = fi.field_d.c(v.field_n, 640) + 40;
                              var11 = fi.field_d.b(v.field_n, 640) * var9 - -10;
                              vb.a((320 - var10 / 2) / 2, var8 / 2, var10 / 2, (20 + var11) / 2, var5);
                              break L43;
                            }
                          }
                          L47: {
                            if (((gh) this).field_bb != 0) {
                              break L47;
                            } else {
                              if (ih.a(0)) {
                                break L47;
                              } else {
                                g.field_i.a(234, 205, g.field_i.field_s / 2, g.field_i.field_o / 2, var5);
                                if (var14 == 0) {
                                  break L43;
                                } else {
                                  break L47;
                                }
                              }
                            }
                          }
                          vh.field_G.a(223, 205, vh.field_G.field_s / 2, vh.field_G.field_o / 2, var5);
                          break L43;
                        }
                        vb.d(160, 120, 21, 16777215);
                        vb.e(2, 2, 0, 0, vb.field_f, vb.field_b);
                        sh.field_y.a(255);
                        stackOut_132_0 = vb.field_b;
                        stackOut_132_1 = 1;
                        stackIn_133_0 = stackOut_132_0;
                        stackIn_133_1 = stackOut_132_1;
                        break L32;
                      }
                    }
                  }
                }
                ek.a(stackIn_133_0, stackIn_133_1 != 0, af.field_a, 0, vb.field_f, 0);
                break L30;
              }
            }
          }
          L48: {
            L49: {
              if (((gh) this).field_Y) {
                break L49;
              } else {
                L50: {
                  if ((((gh) this).field_a ^ -1) < -1) {
                    lj.field_d.b(-(lj.field_d.field_s >> -1133369407) + 320, 60 + -(lj.field_d.field_o >> -2072717343) + 240);
                    dd.field_G.b(wl.field_b, 320, 310, 0, -1);
                    break L50;
                  } else {
                    break L50;
                  }
                }
                L51: {
                  eg.field_q[((gh) this).field_l].b(((gh) this).field_T, 4);
                  if (640 <= ((gh) this).field_T) {
                    break L51;
                  } else {
                    if (0 < ((gh) this).field_A) {
                      dd.field_G.a(wj.a(ic.field_a, new String[1], (byte) -79), ((gh) this).field_T + 20, 34, 0, -1);
                      break L51;
                    } else {
                      break L51;
                    }
                  }
                }
                L52: {
                  if (((gh) this).field_h) {
                    dd.field_G.a(wj.a(sh.field_z, new String[1], (byte) -26), 400, 50, 0, -1);
                    dd.field_G.a(wj.a(qg.field_e, new String[1], (byte) -71), 400, 80, 0, -1);
                    break L52;
                  } else {
                    break L52;
                  }
                }
                L53: {
                  bd.a(-117);
                  this.c((byte) 64);
                  if (((gh) this).field_L) {
                    L54: {
                      lj.field_d.b(var3, var4);
                      if (((gh) this).field_D >= 266) {
                        break L54;
                      } else {
                        kh.field_h[6].b(0, (((gh) this).field_D >> 1707498369) + -113);
                        if (var14 == 0) {
                          break L53;
                        } else {
                          break L54;
                        }
                      }
                    }
                    kh.field_h[6].b(0, 20);
                    kh.field_h[6].c(0, 20, (int)(Math.cos((double)(-266 + ((gh) this).field_D) / 40.0) * -64.0 + 64.0));
                    break L53;
                  } else {
                    break L53;
                  }
                }
                L55: {
                  dd.field_G.a(wj.a(pa.field_a, new String[1], (byte) -53), 15 + var3, 30 + var4, 0, -1);
                  if (!ih.a(0)) {
                    break L55;
                  } else {
                    L56: {
                      L57: {
                        if (0 == ((gh) this).field_bb) {
                          break L57;
                        } else {
                          if (((gh) this).field_bb != 1) {
                            break L56;
                          } else {
                            break L57;
                          }
                        }
                      }
                      if (var2_int != 0) {
                        var5 = 35 + (6 * ((gh) this).field_D + -480);
                        sh.field_y.a(255);
                        vb.e(0, var5, 640, 480);
                        oc.field_d.b(0, 0);
                        vb.e(0, 0, 640, 480);
                        qj.field_c.b(0, -480 + 6 * ((gh) this).field_D);
                        if (var14 == 0) {
                          break L55;
                        } else {
                          break L56;
                        }
                      } else {
                        break L55;
                      }
                    }
                    this.a(false);
                    break L55;
                  }
                }
                vc.c(-1);
                if (var14 == 0) {
                  break L48;
                } else {
                  break L49;
                }
              }
            }
            this.g(2);
            break L48;
          }
          return;
        }
    }

    final void a(int param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4_int = 0;
        ja var4 = null;
        int var5 = 0;
        boolean stackIn_162_0 = false;
        boolean stackIn_168_0 = false;
        Object stackIn_175_0 = null;
        Object stackIn_176_0 = null;
        Object stackIn_177_0 = null;
        Object stackIn_178_0 = null;
        Object stackIn_179_0 = null;
        Object stackIn_180_0 = null;
        Object stackIn_181_0 = null;
        int stackIn_181_1 = 0;
        Object stackIn_216_0 = null;
        Object stackIn_217_0 = null;
        Object stackIn_218_0 = null;
        int stackIn_218_1 = 0;
        Object stackIn_257_0 = null;
        Object stackIn_258_0 = null;
        Object stackIn_259_0 = null;
        Object stackIn_260_0 = null;
        int stackIn_260_1 = 0;
        int stackIn_263_0 = 0;
        int stackIn_263_1 = 0;
        Object stackIn_280_0 = null;
        Object stackIn_281_0 = null;
        Object stackIn_282_0 = null;
        int stackIn_282_1 = 0;
        Object stackIn_296_0 = null;
        Object stackIn_297_0 = null;
        Object stackIn_298_0 = null;
        int stackIn_298_1 = 0;
        Object stackIn_301_0 = null;
        Object stackIn_302_0 = null;
        Object stackIn_303_0 = null;
        Object stackIn_304_0 = null;
        int stackIn_304_1 = 0;
        Object stackIn_330_0 = null;
        Object stackIn_331_0 = null;
        Object stackIn_332_0 = null;
        int stackIn_332_1 = 0;
        int stackIn_339_0 = 0;
        int stackIn_339_1 = 0;
        boolean stackOut_161_0 = false;
        boolean stackOut_167_0 = false;
        Object stackOut_174_0 = null;
        Object stackOut_175_0 = null;
        Object stackOut_176_0 = null;
        Object stackOut_177_0 = null;
        Object stackOut_178_0 = null;
        Object stackOut_179_0 = null;
        int stackOut_179_1 = 0;
        Object stackOut_180_0 = null;
        int stackOut_180_1 = 0;
        Object stackOut_215_0 = null;
        Object stackOut_217_0 = null;
        int stackOut_217_1 = 0;
        Object stackOut_216_0 = null;
        int stackOut_216_1 = 0;
        Object stackOut_256_0 = null;
        Object stackOut_259_0 = null;
        int stackOut_259_1 = 0;
        Object stackOut_257_0 = null;
        Object stackOut_258_0 = null;
        int stackOut_258_1 = 0;
        int stackOut_262_0 = 0;
        int stackOut_262_1 = 0;
        Object stackOut_279_0 = null;
        Object stackOut_281_0 = null;
        int stackOut_281_1 = 0;
        Object stackOut_280_0 = null;
        int stackOut_280_1 = 0;
        Object stackOut_295_0 = null;
        Object stackOut_297_0 = null;
        int stackOut_297_1 = 0;
        Object stackOut_296_0 = null;
        int stackOut_296_1 = 0;
        Object stackOut_300_0 = null;
        Object stackOut_303_0 = null;
        int stackOut_303_1 = 0;
        Object stackOut_301_0 = null;
        Object stackOut_302_0 = null;
        int stackOut_302_1 = 0;
        Object stackOut_329_0 = null;
        Object stackOut_331_0 = null;
        int stackOut_331_1 = 0;
        Object stackOut_330_0 = null;
        int stackOut_330_1 = 0;
        int stackOut_338_0 = 0;
        int stackOut_338_1 = 0;
        L0: {
          var5 = Geoblox.field_C;
          lh.a(param0 ^ 1578896222);
          ((gh) this).field_v = ((gh) this).field_v + 1;
          if ((((gh) this).field_v & 15) != 0) {
            break L0;
          } else {
            L1: {
              ((gh) this).field_l = ((gh) this).field_l + ((gh) this).field_k;
              if (7 == ((gh) this).field_l) {
                break L1;
              } else {
                if (-1 == (((gh) this).field_l ^ -1)) {
                  ((gh) this).field_k = 1;
                  if (var5 == 0) {
                    break L0;
                  } else {
                    break L1;
                  }
                } else {
                  break L0;
                }
              }
            }
            ((gh) this).field_k = -1;
            break L0;
          }
        }
        L2: {
          if (0 == (((gh) this).field_v & 1)) {
            L3: {
              L4: {
                if (-1 != ((gh) this).field_y) {
                  break L4;
                } else {
                  if (463 < ((gh) this).field_T) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                L6: {
                  if ((((gh) this).field_y ^ -1) != -2) {
                    break L6;
                  } else {
                    if (((gh) this).field_T < 640) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                if (-464 != (((gh) this).field_T ^ -1)) {
                  break L2;
                } else {
                  if (-1 == (gf.field_f ^ -1)) {
                    ((gh) this).field_y = 1;
                    el.field_o.c(false);
                    if (var5 == 0) {
                      break L2;
                    } else {
                      break L5;
                    }
                  } else {
                    break L2;
                  }
                }
              }
              ((gh) this).field_T = ((gh) this).field_T + 1;
              if (var5 == 0) {
                break L2;
              } else {
                break L3;
              }
            }
            ((gh) this).field_T = ((gh) this).field_T - 1;
            break L2;
          } else {
            break L2;
          }
        }
        L7: {
          L8: {
            if (((gh) this).field_x) {
              break L8;
            } else {
              L9: {
                L10: {
                  L11: {
                    if (!ih.a(0)) {
                      break L11;
                    } else {
                      if (!((gh) this).field_n) {
                        break L10;
                      } else {
                        break L11;
                      }
                    }
                  }
                  if (((gh) this).field_f) {
                    break L9;
                  } else {
                    break L10;
                  }
                }
                if (!((gh) this).b(true)) {
                  break L9;
                } else {
                  L12: {
                    L13: {
                      if (0 == ((gh) this).field_bb) {
                        break L13;
                      } else {
                        if (-6 != (((gh) this).field_bb ^ -1)) {
                          break L12;
                        } else {
                          break L13;
                        }
                      }
                    }
                    if (((gh) this).field_H) {
                      this.b((byte) -80);
                      if (var5 == 0) {
                        break L7;
                      } else {
                        break L12;
                      }
                    } else {
                      break L7;
                    }
                  }
                  this.f(10);
                  if (var5 == 0) {
                    break L7;
                  } else {
                    break L9;
                  }
                }
              }
              if (!ll.field_g[c.field_ab]) {
                return;
              } else {
                L14: {
                  L15: {
                    if (((gh) this).field_E) {
                      break L15;
                    } else {
                      var2_int = 96;
                      var3 = 97;
                      if (var5 == 0) {
                        break L14;
                      } else {
                        break L15;
                      }
                    }
                  }
                  var3 = 96;
                  var2_int = 97;
                  break L14;
                }
                L16: {
                  if (kj.field_o[var2_int]) {
                    L17: {
                      L18: {
                        ((gh) this).field_J = ((gh) this).field_J - rc.field_h;
                        me.a((byte) 38);
                        var4_int = (ki.field_d + kd.field_c + qa.field_a + he.field_d) % 8;
                        if (var4_int != 0) {
                          break L18;
                        } else {
                          oa.field_a = oa.field_a + kb.field_d;
                          gb.field_g = gb.field_g - 1;
                          if (var5 == 0) {
                            break L17;
                          } else {
                            break L18;
                          }
                        }
                      }
                      L19: {
                        if (-2 != (var4_int ^ -1)) {
                          break L19;
                        } else {
                          oa.field_a = oa.field_a + gb.field_g;
                          kb.field_d = kb.field_d - 1;
                          if (var5 == 0) {
                            break L17;
                          } else {
                            break L19;
                          }
                        }
                      }
                      L20: {
                        if ((var4_int ^ -1) == -3) {
                          break L20;
                        } else {
                          L21: {
                            if (3 != var4_int) {
                              break L21;
                            } else {
                              oa.field_a = oa.field_a - gb.field_g;
                              kb.field_d = kb.field_d + 1;
                              if (var5 == 0) {
                                break L17;
                              } else {
                                break L21;
                              }
                            }
                          }
                          L22: {
                            if (4 != var4_int) {
                              break L22;
                            } else {
                              ml.field_r = ml.field_r + kb.field_d;
                              gb.field_g = gb.field_g + 1;
                              if (var5 == 0) {
                                break L17;
                              } else {
                                break L22;
                              }
                            }
                          }
                          L23: {
                            if ((var4_int ^ -1) != -6) {
                              break L23;
                            } else {
                              kb.field_d = kb.field_d + 1;
                              ml.field_r = ml.field_r + gb.field_g;
                              if (var5 == 0) {
                                break L17;
                              } else {
                                break L23;
                              }
                            }
                          }
                          L24: {
                            if (-7 != (var4_int ^ -1)) {
                              break L24;
                            } else {
                              ml.field_r = ml.field_r - kb.field_d;
                              gb.field_g = gb.field_g - 1;
                              if (var5 == 0) {
                                break L17;
                              } else {
                                break L24;
                              }
                            }
                          }
                          if ((var4_int ^ -1) != -8) {
                            break L17;
                          } else {
                            kb.field_d = kb.field_d - 1;
                            ml.field_r = ml.field_r - gb.field_g;
                            if (var5 == 0) {
                              break L17;
                            } else {
                              break L20;
                            }
                          }
                        }
                      }
                      gb.field_g = gb.field_g + 1;
                      oa.field_a = oa.field_a - kb.field_d;
                      break L17;
                    }
                    L25: {
                      L26: {
                        var4_int = (kd.field_c + he.field_d + qa.field_a - -ki.field_d) % 5;
                        if (0 != var4_int) {
                          break L26;
                        } else {
                          dc.field_a = dc.field_a | lb.field_b + el.field_g << -751962927;
                          if (var5 == 0) {
                            break L25;
                          } else {
                            break L26;
                          }
                        }
                      }
                      L27: {
                        if ((var4_int ^ -1) == -2) {
                          break L27;
                        } else {
                          L28: {
                            if (-3 == (var4_int ^ -1)) {
                              break L28;
                            } else {
                              L29: {
                                if (3 != var4_int) {
                                  break L29;
                                } else {
                                  sc.field_f = sc.field_f + 1;
                                  el.field_g = el.field_g + lb.field_b;
                                  if (var5 == 0) {
                                    break L25;
                                  } else {
                                    break L29;
                                  }
                                }
                              }
                              if ((var4_int ^ -1) != -5) {
                                break L25;
                              } else {
                                sc.field_f = sc.field_f - 1;
                                el.field_g = el.field_g - lb.field_b;
                                if (var5 == 0) {
                                  break L25;
                                } else {
                                  break L28;
                                }
                              }
                            }
                          }
                          lb.field_b = lb.field_b - 1;
                          el.field_g = el.field_g - sc.field_f;
                          if (var5 == 0) {
                            break L25;
                          } else {
                            break L27;
                          }
                        }
                      }
                      el.field_g = el.field_g + sc.field_f;
                      lb.field_b = lb.field_b + 1;
                      break L25;
                    }
                    if ((((gh) this).field_p ^ -1) != -1) {
                      break L16;
                    } else {
                      ((gh) this).field_U = ((gh) this).field_U + 1;
                      break L16;
                    }
                  } else {
                    break L16;
                  }
                }
                L30: {
                  if (!kj.field_o[var3]) {
                    break L30;
                  } else {
                    L31: {
                      ((gh) this).field_J = ((gh) this).field_J + rc.field_h;
                      wd.a((byte) 74);
                      if ((((gh) this).field_p ^ -1) != -1) {
                        break L31;
                      } else {
                        ((gh) this).field_U = ((gh) this).field_U + 1;
                        break L31;
                      }
                    }
                    L32: {
                      L33: {
                        var4_int = (he.field_d + (qa.field_a - -kd.field_c) + ki.field_d) % 8;
                        if ((var4_int ^ -1) == -1) {
                          break L33;
                        } else {
                          L34: {
                            if (1 == var4_int) {
                              break L34;
                            } else {
                              L35: {
                                if ((var4_int ^ -1) == -3) {
                                  break L35;
                                } else {
                                  L36: {
                                    if (var4_int != 3) {
                                      break L36;
                                    } else {
                                      kb.field_d = kb.field_d + 1;
                                      oa.field_a = oa.field_a - gb.field_g;
                                      if (var5 == 0) {
                                        break L32;
                                      } else {
                                        break L36;
                                      }
                                    }
                                  }
                                  L37: {
                                    if (4 != var4_int) {
                                      break L37;
                                    } else {
                                      gb.field_g = gb.field_g + 1;
                                      ml.field_r = ml.field_r + kb.field_d;
                                      if (var5 == 0) {
                                        break L32;
                                      } else {
                                        break L37;
                                      }
                                    }
                                  }
                                  L38: {
                                    if (5 != var4_int) {
                                      break L38;
                                    } else {
                                      kb.field_d = kb.field_d + 1;
                                      ml.field_r = ml.field_r + gb.field_g;
                                      if (var5 == 0) {
                                        break L32;
                                      } else {
                                        break L38;
                                      }
                                    }
                                  }
                                  L39: {
                                    if (var4_int != 6) {
                                      break L39;
                                    } else {
                                      ml.field_r = ml.field_r - kb.field_d;
                                      gb.field_g = gb.field_g - 1;
                                      if (var5 == 0) {
                                        break L32;
                                      } else {
                                        break L39;
                                      }
                                    }
                                  }
                                  if (var4_int == 7) {
                                    kb.field_d = kb.field_d - 1;
                                    ml.field_r = ml.field_r - gb.field_g;
                                    if (var5 == 0) {
                                      break L32;
                                    } else {
                                      break L35;
                                    }
                                  } else {
                                    break L32;
                                  }
                                }
                              }
                              gb.field_g = gb.field_g + 1;
                              oa.field_a = oa.field_a - kb.field_d;
                              if (var5 == 0) {
                                break L32;
                              } else {
                                break L34;
                              }
                            }
                          }
                          oa.field_a = oa.field_a + gb.field_g;
                          kb.field_d = kb.field_d - 1;
                          if (var5 == 0) {
                            break L32;
                          } else {
                            break L33;
                          }
                        }
                      }
                      gb.field_g = gb.field_g - 1;
                      oa.field_a = oa.field_a + kb.field_d;
                      break L32;
                    }
                    L40: {
                      var4_int = (kd.field_c + qa.field_a - -he.field_d + ki.field_d) % 5;
                      if (-1 == (var4_int ^ -1)) {
                        break L40;
                      } else {
                        L41: {
                          if (1 == var4_int) {
                            break L41;
                          } else {
                            L42: {
                              if (2 == var4_int) {
                                break L42;
                              } else {
                                L43: {
                                  if (var4_int != 3) {
                                    break L43;
                                  } else {
                                    sc.field_f = sc.field_f + 1;
                                    el.field_g = el.field_g + lb.field_b;
                                    if (var5 == 0) {
                                      break L30;
                                    } else {
                                      break L43;
                                    }
                                  }
                                }
                                if (4 == var4_int) {
                                  el.field_g = el.field_g - lb.field_b;
                                  sc.field_f = sc.field_f - 1;
                                  if (var5 == 0) {
                                    break L30;
                                  } else {
                                    break L42;
                                  }
                                } else {
                                  break L30;
                                }
                              }
                            }
                            lb.field_b = lb.field_b - 1;
                            el.field_g = el.field_g - sc.field_f;
                            if (var5 == 0) {
                              break L30;
                            } else {
                              break L41;
                            }
                          }
                        }
                        lb.field_b = lb.field_b + 1;
                        el.field_g = el.field_g + sc.field_f;
                        if (var5 == 0) {
                          break L30;
                        } else {
                          break L40;
                        }
                      }
                    }
                    dc.field_a = dc.field_a | el.field_g + lb.field_b << -982889103;
                    break L30;
                  }
                }
                L44: {
                  L45: {
                    if (!kj.field_o[99]) {
                      break L45;
                    } else {
                      if (((gh) this).field_C) {
                        break L45;
                      } else {
                        var4 = (ja) (Object) ji.field_r.g(0);
                        L46: while (true) {
                          if (null == var4) {
                            break L45;
                          } else {
                            stackOut_161_0 = var4.field_B;
                            stackIn_168_0 = stackOut_161_0;
                            stackIn_162_0 = stackOut_161_0;
                            if (var5 != 0) {
                              break L44;
                            } else {
                              L47: {
                                if (!stackIn_162_0) {
                                  var4.field_v = var4.field_v + 4.0f * var4.field_F;
                                  var4.field_o = var4.field_o + 4.0f * var4.field_w;
                                  if (var5 == 0) {
                                    break L45;
                                  } else {
                                    break L47;
                                  }
                                } else {
                                  break L47;
                                }
                              }
                              var4 = (ja) (Object) ji.field_r.d(1);
                              if (var5 == 0) {
                                continue L46;
                              } else {
                                break L45;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  stackOut_167_0 = kj.field_o[var3];
                  stackIn_168_0 = stackOut_167_0;
                  break L44;
                }
                L48: {
                  if (stackIn_168_0) {
                    break L48;
                  } else {
                    if (kj.field_o[var2_int]) {
                      break L48;
                    } else {
                      jj.b(-106);
                      break L48;
                    }
                  }
                }
                L49: {
                  ((gh) this).field_a = ((gh) this).field_a - 1;
                  if ((((gh) this).field_a ^ -1) != -1) {
                    break L49;
                  } else {
                    ld.a(310, 320, 123, 100 + 100 * ji.field_h);
                    break L49;
                  }
                }
                L50: {
                  L51: {
                    stackOut_174_0 = this;
                    stackIn_180_0 = stackOut_174_0;
                    stackIn_175_0 = stackOut_174_0;
                    if (fa.field_a) {
                      break L51;
                    } else {
                      stackOut_175_0 = this;
                      stackIn_180_0 = stackOut_175_0;
                      stackIn_176_0 = stackOut_175_0;
                      if (!a.field_d.c(13519)) {
                        break L51;
                      } else {
                        stackOut_176_0 = this;
                        stackIn_177_0 = stackOut_176_0;
                        stackOut_177_0 = this;
                        stackIn_180_0 = stackOut_177_0;
                        stackIn_178_0 = stackOut_177_0;
                        if (0 >= ul.field_b) {
                          break L51;
                        } else {
                          stackOut_178_0 = this;
                          stackIn_179_0 = stackOut_178_0;
                          stackOut_179_0 = this;
                          stackOut_179_1 = 1;
                          stackIn_181_0 = stackOut_179_0;
                          stackIn_181_1 = stackOut_179_1;
                          break L50;
                        }
                      }
                    }
                  }
                  stackOut_180_0 = this;
                  stackOut_180_1 = 0;
                  stackIn_181_0 = stackOut_180_0;
                  stackIn_181_1 = stackOut_180_1;
                  break L50;
                }
                L52: {
                  L53: {
                    ((gh) this).field_b = stackIn_181_1 != 0;
                    if (!((gh) this).field_b) {
                      break L53;
                    } else {
                      if (!((gh) this).field_B) {
                        break L53;
                      } else {
                        ((gh) this).field_B = false;
                        ((gh) this).field_a = 300;
                        ((gh) this).field_b = false;
                        ra.a(le.field_a ^ 255, -88, le.field_a);
                        if (var5 == 0) {
                          break L52;
                        } else {
                          break L53;
                        }
                      }
                    }
                  }
                  ((gh) this).field_B = false;
                  break L52;
                }
                L54: {
                  ((gh) this).field_Z = ab.field_f;
                  ef.b((byte) -15);
                  kc.b(param0 + 1578896101);
                  if (ab.field_f) {
                    ul.b(-2);
                    break L54;
                  } else {
                    break L54;
                  }
                }
                L55: {
                  ((gh) this).field_n = ec.b(-18913);
                  if (((gh) this).field_Z) {
                    boolean discarded$1 = sk.a(param0 ^ 1578896190);
                    break L55;
                  } else {
                    break L55;
                  }
                }
                L56: {
                  cf.d((byte) 27);
                  f.o(600);
                  if (((gh) this).field_Y) {
                    this.b(109);
                    break L56;
                  } else {
                    break L56;
                  }
                }
                if (var5 == 0) {
                  break L7;
                } else {
                  break L8;
                }
              }
            }
          }
          L57: {
            if (-1 != (((gh) this).field_D ^ -1)) {
              break L57;
            } else {
              fi.a(param0 ^ -1578896191, pi.field_S);
              break L57;
            }
          }
          L58: {
            if (!pf.field_D) {
              break L58;
            } else {
              if (!od.a(-3)) {
                break L58;
              } else {
                if (((gh) this).field_D > 1000) {
                  this.d(28809);
                  break L58;
                } else {
                  break L58;
                }
              }
            }
          }
          fc.a(19);
          cf.d((byte) 24);
          f.o(600);
          ((gh) this).field_D = ((gh) this).field_D + 1;
          ((gh) this).field_F = true;
          break L7;
        }
        L59: {
          if (param0 == -1578896191) {
            break L59;
          } else {
            ((gh) this).field_X = null;
            break L59;
          }
        }
        L60: while (true) {
          L61: {
            L62: {
              if (!hh.a(111)) {
                break L62;
              } else {
                L63: {
                  if (-1 > (te.field_a ^ -1)) {
                    L64: {
                      pk.field_r = pk.field_r.substring(1) + te.field_a;
                      if (pk.field_r.equalsIgnoreCase("fog")) {
                        L65: {
                          stackOut_215_0 = this;
                          stackIn_217_0 = stackOut_215_0;
                          stackIn_216_0 = stackOut_215_0;
                          if (((gh) this).field_s) {
                            stackOut_217_0 = this;
                            stackOut_217_1 = 0;
                            stackIn_218_0 = stackOut_217_0;
                            stackIn_218_1 = stackOut_217_1;
                            break L65;
                          } else {
                            stackOut_216_0 = this;
                            stackOut_216_1 = 1;
                            stackIn_218_0 = stackOut_216_0;
                            stackIn_218_1 = stackOut_216_1;
                            break L65;
                          }
                        }
                        ((gh) this).field_s = stackIn_218_1 != 0;
                        break L64;
                      } else {
                        break L64;
                      }
                    }
                    if (oc.field_f < 2) {
                      break L63;
                    } else {
                      if (!pk.field_r.equalsIgnoreCase("brk")) {
                        break L63;
                      } else {
                        ((gh) this).field_I.h((byte) 41);
                        break L63;
                      }
                    }
                  } else {
                    break L63;
                  }
                }
                if ((ki.field_d ^ -1) != -14) {
                  L66: {
                    if (-84 == (ki.field_d ^ -1)) {
                      if (!((gh) this).field_Y) {
                        break L66;
                      } else {
                        this.c(7000);
                        break L66;
                      }
                    } else {
                      break L66;
                    }
                  }
                  L67: {
                    if (ki.field_d != 84) {
                      break L67;
                    } else {
                      if (((gh) this).field_t == 0) {
                        L68: {
                          ((gh) this).field_t = 1;
                          ((gh) this).field_C = false;
                          if (-1 == (((gh) this).field_p ^ -1)) {
                            break L68;
                          } else {
                            L69: {
                              if ((((gh) this).field_p ^ -1) == -2) {
                                break L69;
                              } else {
                                if (-3 == (((gh) this).field_p ^ -1)) {
                                  ((gh) this).field_U = dk.field_b;
                                  if (var5 == 0) {
                                    break L67;
                                  } else {
                                    break L69;
                                  }
                                } else {
                                  break L67;
                                }
                              }
                            }
                            ((gh) this).field_U = dd.field_D;
                            if (var5 == 0) {
                              break L67;
                            } else {
                              break L68;
                            }
                          }
                        }
                        ((gh) this).field_U = 0;
                        break L67;
                      } else {
                        break L67;
                      }
                    }
                  }
                  L70: {
                    if ((ki.field_d ^ -1) != -86) {
                      break L70;
                    } else {
                      if (5 != ((gh) this).field_p) {
                        break L70;
                      } else {
                        if (-1 == (((gh) this).field_t ^ -1)) {
                          this.c(param0 ^ -1578897511);
                          ((gh) this).field_Y = true;
                          ((gh) this).field_p = 0;
                          ((gh) this).field_C = true;
                          break L70;
                        } else {
                          break L70;
                        }
                      }
                    }
                  }
                  L71: {
                    if (jg.field_g != ki.field_d) {
                      break L71;
                    } else {
                      L72: {
                        stackOut_256_0 = this;
                        stackIn_259_0 = stackOut_256_0;
                        stackIn_257_0 = stackOut_256_0;
                        if (((gh) this).field_E) {
                          stackOut_259_0 = this;
                          stackOut_259_1 = 0;
                          stackIn_260_0 = stackOut_259_0;
                          stackIn_260_1 = stackOut_259_1;
                          break L72;
                        } else {
                          stackOut_257_0 = this;
                          stackIn_258_0 = stackOut_257_0;
                          stackOut_258_0 = this;
                          stackOut_258_1 = 1;
                          stackIn_260_0 = stackOut_258_0;
                          stackIn_260_1 = stackOut_258_1;
                          break L72;
                        }
                      }
                      ((gh) this).field_E = stackIn_260_1 != 0;
                      jc.a(7, false);
                      break L71;
                    }
                  }
                  if (2 > oc.field_f) {
                    continue L60;
                  } else {
                    stackOut_262_0 = ki.field_d;
                    stackOut_262_1 = 48;
                    stackIn_339_0 = stackOut_262_0;
                    stackIn_339_1 = stackOut_262_1;
                    stackIn_263_0 = stackOut_262_0;
                    stackIn_263_1 = stackOut_262_1;
                    if (var5 != 0) {
                      break L61;
                    } else {
                      L73: {
                        if (stackIn_263_0 != stackIn_263_1) {
                          break L73;
                        } else {
                          ((gh) this).field_r = ((gh) this).field_r - 1;
                          if ((((gh) this).field_r ^ -1) > -1) {
                            ((gh) this).field_r = 6;
                            break L73;
                          } else {
                            break L73;
                          }
                        }
                      }
                      L74: {
                        if (-50 == (ki.field_d ^ -1)) {
                          ((gh) this).field_r = ((gh) this).field_r + 1;
                          if (((gh) this).field_r != 7) {
                            break L74;
                          } else {
                            ((gh) this).field_r = 0;
                            break L74;
                          }
                        } else {
                          break L74;
                        }
                      }
                      L75: {
                        if (-65 != (ki.field_d ^ -1)) {
                          break L75;
                        } else {
                          ((gh) this).field_G = ((gh) this).field_G - 1;
                          if (-1 >= (((gh) this).field_G ^ -1)) {
                            break L75;
                          } else {
                            ((gh) this).field_G = 6;
                            break L75;
                          }
                        }
                      }
                      L76: {
                        if (32 == ki.field_d) {
                          L77: {
                            stackOut_279_0 = this;
                            stackIn_281_0 = stackOut_279_0;
                            stackIn_280_0 = stackOut_279_0;
                            if (((gh) this).field_Q) {
                              stackOut_281_0 = this;
                              stackOut_281_1 = 0;
                              stackIn_282_0 = stackOut_281_0;
                              stackIn_282_1 = stackOut_281_1;
                              break L77;
                            } else {
                              stackOut_280_0 = this;
                              stackOut_280_1 = 1;
                              stackIn_282_0 = stackOut_280_0;
                              stackIn_282_1 = stackOut_280_1;
                              break L77;
                            }
                          }
                          ((gh) this).field_Q = stackIn_282_1 != 0;
                          break L76;
                        } else {
                          break L76;
                        }
                      }
                      L78: {
                        if (ki.field_d != 65) {
                          break L78;
                        } else {
                          ((gh) this).field_G = ((gh) this).field_G + 1;
                          if ((((gh) this).field_G ^ -1) == -8) {
                            ((gh) this).field_G = 0;
                            break L78;
                          } else {
                            break L78;
                          }
                        }
                      }
                      L79: {
                        if ((ki.field_d ^ -1) == -17) {
                          ((gh) this).field_d = true;
                          break L79;
                        } else {
                          break L79;
                        }
                      }
                      L80: {
                        if (68 != ki.field_d) {
                          break L80;
                        } else {
                          ((gh) this).field_bb = 1;
                          ((gh) this).field_K = true;
                          break L80;
                        }
                      }
                      L81: {
                        if (ki.field_d == 1) {
                          L82: {
                            ((gh) this).field_K = true;
                            stackOut_295_0 = this;
                            stackIn_297_0 = stackOut_295_0;
                            stackIn_296_0 = stackOut_295_0;
                            if (((gh) this).field_j) {
                              stackOut_297_0 = this;
                              stackOut_297_1 = 0;
                              stackIn_298_0 = stackOut_297_0;
                              stackIn_298_1 = stackOut_297_1;
                              break L82;
                            } else {
                              stackOut_296_0 = this;
                              stackOut_296_1 = 1;
                              stackIn_298_0 = stackOut_296_0;
                              stackIn_298_1 = stackOut_296_1;
                              break L82;
                            }
                          }
                          ((gh) this).field_j = stackIn_298_1 != 0;
                          break L81;
                        } else {
                          break L81;
                        }
                      }
                      L83: {
                        if (2 != ki.field_d) {
                          break L83;
                        } else {
                          L84: {
                            stackOut_300_0 = this;
                            stackIn_303_0 = stackOut_300_0;
                            stackIn_301_0 = stackOut_300_0;
                            if (((gh) this).field_N) {
                              stackOut_303_0 = this;
                              stackOut_303_1 = 0;
                              stackIn_304_0 = stackOut_303_0;
                              stackIn_304_1 = stackOut_303_1;
                              break L84;
                            } else {
                              stackOut_301_0 = this;
                              stackIn_302_0 = stackOut_301_0;
                              stackOut_302_0 = this;
                              stackOut_302_1 = 1;
                              stackIn_304_0 = stackOut_302_0;
                              stackIn_304_1 = stackOut_302_1;
                              break L84;
                            }
                          }
                          ((gh) this).field_N = stackIn_304_1 != 0;
                          ((gh) this).field_K = true;
                          break L83;
                        }
                      }
                      L85: {
                        if ((ki.field_d ^ -1) != -4) {
                          break L85;
                        } else {
                          ag.field_k = 7;
                          f.field_qb = 7;
                          break L85;
                        }
                      }
                      L86: {
                        if ((ki.field_d ^ -1) == -5) {
                          hd.f(2);
                          ((gh) this).field_K = true;
                          break L86;
                        } else {
                          break L86;
                        }
                      }
                      L87: {
                        if ((ki.field_d ^ -1) != -6) {
                          break L87;
                        } else {
                          c.field_ab = 1;
                          hf.a(param0 ^ 1578896207, c.field_ab);
                          cd.a((byte) 110);
                          break L87;
                        }
                      }
                      L88: {
                        if ((ki.field_d ^ -1) != -7) {
                          break L88;
                        } else {
                          c.field_ab = 0;
                          hf.a(-126, c.field_ab);
                          cd.a((byte) 126);
                          break L88;
                        }
                      }
                      L89: {
                        if (7 == ki.field_d) {
                          c.field_ab = 6;
                          hf.a(-99, c.field_ab);
                          cd.a((byte) 113);
                          break L89;
                        } else {
                          break L89;
                        }
                      }
                      L90: {
                        if (ki.field_d == 8) {
                          c.field_ab = 5;
                          hf.a(-124, c.field_ab);
                          cd.a((byte) 115);
                          break L90;
                        } else {
                          break L90;
                        }
                      }
                      L91: {
                        if (-10 != (ki.field_d ^ -1)) {
                          break L91;
                        } else {
                          c.field_ab = 3;
                          hf.a(-98, c.field_ab);
                          cd.a((byte) 122);
                          break L91;
                        }
                      }
                      L92: {
                        if (10 != ki.field_d) {
                          break L92;
                        } else {
                          c.field_ab = 4;
                          hf.a(param0 ^ 1578896198, c.field_ab);
                          cd.a((byte) 101);
                          break L92;
                        }
                      }
                      L93: {
                        if ((ki.field_d ^ -1) == -12) {
                          c.field_ab = 2;
                          hf.a(-118, c.field_ab);
                          cd.a((byte) 82);
                          break L93;
                        } else {
                          break L93;
                        }
                      }
                      L94: {
                        if (ki.field_d == 12) {
                          L95: {
                            stackOut_329_0 = this;
                            stackIn_331_0 = stackOut_329_0;
                            stackIn_330_0 = stackOut_329_0;
                            if (((gh) this).field_V) {
                              stackOut_331_0 = this;
                              stackOut_331_1 = 0;
                              stackIn_332_0 = stackOut_331_0;
                              stackIn_332_1 = stackOut_331_1;
                              break L95;
                            } else {
                              stackOut_330_0 = this;
                              stackOut_330_1 = 1;
                              stackIn_332_0 = stackOut_330_0;
                              stackIn_332_1 = stackOut_330_1;
                              break L95;
                            }
                          }
                          ((gh) this).field_V = stackIn_332_1 != 0;
                          break L94;
                        } else {
                          break L94;
                        }
                      }
                      L96: {
                        if (36 != ki.field_d) {
                          break L96;
                        } else {
                          c.field_ab = c.field_ab + 1;
                          c.field_ab = c.field_ab % 7;
                          cd.a((byte) 108);
                          break L96;
                        }
                      }
                      if ((ki.field_d ^ -1) == -40) {
                        ((gh) this).field_h = true;
                        if (var5 == 0) {
                          continue L60;
                        } else {
                          break L62;
                        }
                      } else {
                        continue L60;
                      }
                    }
                  }
                } else {
                  L97: {
                    L98: {
                      if (((gh) this).field_x) {
                        break L98;
                      } else {
                        ai.field_p = 1;
                        if (var5 == 0) {
                          break L97;
                        } else {
                          break L98;
                        }
                      }
                    }
                    this.d(28809);
                    break L97;
                  }
                  return;
                }
              }
            }
            stackOut_338_0 = bi.field_g ^ -1;
            stackOut_338_1 = -1;
            stackIn_339_0 = stackOut_338_0;
            stackIn_339_1 = stackOut_338_1;
            break L61;
          }
          L99: {
            if (stackIn_339_0 == stackIn_339_1) {
              break L99;
            } else {
              L100: {
                if (!((gh) this).field_j) {
                  break L100;
                } else {
                  if ((oc.field_f ^ -1) > -3) {
                    break L100;
                  } else {
                    nb.a(-28195, mc.field_a, ((gh) this).field_G, he.field_d, ((gh) this).field_r, ((gh) this).field_Q);
                    break L100;
                  }
                }
              }
              if (!((gh) this).field_Y) {
                break L99;
              } else {
                if ((((gh) this).field_t ^ -1) != -1) {
                  break L99;
                } else {
                  L101: {
                    if (-6 == (((gh) this).field_p ^ -1)) {
                      break L101;
                    } else {
                      L102: {
                        ((gh) this).field_C = false;
                        ((gh) this).field_t = 1;
                        if (((gh) this).field_p != 0) {
                          break L102;
                        } else {
                          ((gh) this).field_U = 0;
                          if (var5 == 0) {
                            break L99;
                          } else {
                            break L102;
                          }
                        }
                      }
                      L103: {
                        if ((((gh) this).field_p ^ -1) != -2) {
                          break L103;
                        } else {
                          ((gh) this).field_U = dd.field_D;
                          if (var5 == 0) {
                            break L99;
                          } else {
                            break L103;
                          }
                        }
                      }
                      if ((((gh) this).field_p ^ -1) == -3) {
                        ((gh) this).field_U = dk.field_b;
                        if (var5 == 0) {
                          break L99;
                        } else {
                          break L101;
                        }
                      } else {
                        break L99;
                      }
                    }
                  }
                  L104: {
                    if (-101 <= (mc.field_a ^ -1)) {
                      break L104;
                    } else {
                      if (340 <= mc.field_a) {
                        break L104;
                      } else {
                        if (-441 <= (he.field_d ^ -1)) {
                          break L104;
                        } else {
                          if (476 > he.field_d) {
                            this.c(param0 ^ -1578897511);
                            ((gh) this).field_p = 0;
                            ((gh) this).field_Y = true;
                            ((gh) this).field_C = true;
                            break L104;
                          } else {
                            break L104;
                          }
                        }
                      }
                    }
                  }
                  if (mc.field_a <= 380) {
                    break L99;
                  } else {
                    if (540 <= mc.field_a) {
                      break L99;
                    } else {
                      if (he.field_d <= 440) {
                        break L99;
                      } else {
                        if ((he.field_d ^ -1) > -477) {
                          ((gh) this).field_C = false;
                          ((gh) this).field_t = 1;
                          break L99;
                        } else {
                          break L99;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          return;
        }
    }

    final void a(byte param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object stackIn_30_0 = null;
        Object stackOut_29_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = Geoblox.field_C;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (!((gh) this).field_Y) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        ((gh) this).field_o = ((gh) this).field_o + param1;
                        if ((((gh) this).field_o ^ -1) >= -10000000) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        StringBuilder discarded$2 = td.a((CharSequence) (Object) Integer.toString(9999999), ((gh) this).field_X, 0, 47);
                        if (var6 == 0) {
                            statePc = 10;
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
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        StringBuilder discarded$3 = td.a((CharSequence) (Object) Integer.toString(((gh) this).field_o), ((gh) this).field_X, 0, 69);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var3_int = param1;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (param0 == 127) {
                            statePc = 15;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        this.e(-17);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var4 = kd.field_c % 3;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if ((var4 ^ -1) == -1) {
                            statePc = 25;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var4 != 1) {
                            statePc = 23;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        ml.field_r = ml.field_r - var3_int;
                        if (var6 == 0) {
                            statePc = 28;
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
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var5 = var3_int / 3;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        oa.field_a = oa.field_a + var5;
                        ml.field_r = ml.field_r - (var3_int - var5);
                        if (var6 == 0) {
                            statePc = 28;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        oa.field_a = oa.field_a + var3_int;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (!da.a(0, -117)) {
                            statePc = 38;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackOut_29_0 = this;
                        stackIn_30_0 = stackOut_29_0;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (((gh) this).field_o < 7000) {
                            statePc = 38;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        ra.a(239, -120, 16);
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 37: {
                    var3 = (RuntimeException) (Object) caughtException;
                    throw t.a((Throwable) (Object) var3, "gh.P(" + param0 + 44 + param1 + 41);
                }
                case 38: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void i(int param0) {
        try {
            field_m = null;
            field_z = null;
            if (param0 != -17199) {
                field_P = 53;
            }
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "gh.F(" + param0 + 41);
        }
    }

    final void d(byte param0) {
        RuntimeException var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0 == 116) {
                            statePc = 4;
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
                        ((gh) this).field_o = -46;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (((gh) this).field_Y) {
                            statePc = 8;
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
                        ((gh) this).field_x = true;
                        ((gh) this).field_L = true;
                        ((gh) this).c(false);
                        ((gh) this).a((byte) 127, wa.a(-25866));
                        ((gh) this).e((byte) -70);
                        if (Geoblox.field_C == 0) {
                            statePc = 13;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        ((gh) this).field_p = 5;
                        ((gh) this).field_t = 0;
                        ((gh) this).field_C = true;
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
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw t.a((Throwable) (Object) var2, "gh.Q(" + param0 + 41);
                }
                case 13: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean b(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_10_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0) {
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
                        stackOut_1_0 = 1;
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
                        if (((gh) this).field_H) {
                            statePc = 8;
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
                        stackOut_4_0 = 0;
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
                        if (stackIn_5_0 == ((gh) this).field_bb) {
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
                    var2 = (RuntimeException) (Object) caughtException;
                    throw t.a((Throwable) (Object) var2, "gh.K(" + param0 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void b(int param0) {
        RuntimeException var2 = null;
        int var3 = 0;
        Object stackIn_12_0 = null;
        int stackIn_24_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_41_0 = 0;
        Object stackOut_11_0 = null;
        int stackOut_23_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_40_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = Geoblox.field_C;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (-3 != (((gh) this).field_t ^ -1)) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ((gh) this).field_p = ((gh) this).field_p + 1;
                        ((gh) this).field_C = true;
                        ((gh) this).field_t = 0;
                        if (var3 == 0) {
                            statePc = 50;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (1 != ((gh) this).field_t) {
                            statePc = 50;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if ((((gh) this).field_p ^ -1) == -4) {
                            statePc = 15;
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
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackOut_11_0 = this;
                        stackIn_12_0 = stackOut_11_0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (((gh) this).field_p != 5) {
                            statePc = 18;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        this.c(7000);
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
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (!((gh) this).field_d) {
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
                        ((gh) this).field_d = false;
                        ((gh) this).field_t = 2;
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
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (-1 != (((gh) this).field_p ^ -1)) {
                            statePc = 30;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackOut_23_0 = -451;
                        stackIn_24_0 = stackOut_23_0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (stackIn_24_0 <= (((gh) this).field_U ^ -1)) {
                            statePc = 30;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        ((gh) this).field_t = 2;
                        if (var3 == 0) {
                            statePc = 50;
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
                        if (((gh) this).field_p != 1) {
                            statePc = 37;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 36;
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
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (stackIn_34_0 < dd.field_D + -((gh) this).field_U) {
                            statePc = 47;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (((gh) this).field_p != 2) {
                            statePc = 50;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        stackOut_40_0 = dk.field_b;
                        stackIn_41_0 = stackOut_40_0;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if ((stackIn_41_0 + -((gh) this).field_U ^ -1) >= -1) {
                            statePc = 50;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        ((gh) this).field_t = 2;
                        if (var3 == 0) {
                            statePc = 50;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        ((gh) this).field_t = 2;
                        statePc = 48;
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
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (param0 >= 59) {
                            statePc = 56;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        ((gh) this).field_N = true;
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
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 55: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw t.a((Throwable) (Object) var2, "gh.C(" + param0 + 41);
                }
                case 56: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void b(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Geoblox.field_C;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (-1 == (((gh) this).field_D ^ -1)) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (((gh) this).field_f) {
                            statePc = 8;
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
                        this.h(122);
                        if (var4 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        this.j(867);
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
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        ((gh) this).field_i = true;
                        sf.a(sh.field_y.field_d, 0, oc.field_d.field_v, 0, sh.field_y.field_d.length);
                        le.a((byte) -39);
                        bk.field_a.e();
                        vb.c();
                        i.field_a.a(((gh) this).field_w + 320, ((gh) this).field_u + 240, 16777215);
                        sh.field_y.a(255);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        ((gh) this).field_D = ((gh) this).field_D + 1;
                        if (160 != ((gh) this).field_D + 1) {
                            statePc = 96;
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
                        if (!((gh) this).field_f) {
                            statePc = 92;
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
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var2_int = 0;
                        var3 = 0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (7 <= var3) {
                            statePc = 30;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackOut_18_0 = c.field_ab ^ -1;
                        stackOut_18_1 = ee.field_B[var3] ^ -1;
                        stackIn_31_0 = stackOut_18_0;
                        stackIn_31_1 = stackOut_18_1;
                        stackIn_19_0 = stackOut_18_0;
                        stackIn_19_1 = stackOut_18_1;
                        if (var4 != 0) {
                            statePc = 31;
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
                        if (stackIn_19_0 == stackIn_19_1) {
                            statePc = 23;
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
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (0 >= var3) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var2_int = ee.field_B[var3 + -1];
                        if (var4 == 0) {
                            statePc = 30;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var2_int = ee.field_B[6];
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (var4 == 0) {
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
                        var3++;
                        if (var4 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var3 = var2_int;
                        stackOut_30_0 = 4;
                        stackOut_30_1 = var3;
                        stackIn_31_0 = stackOut_30_0;
                        stackIn_31_1 = stackOut_30_1;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (stackIn_31_0 != stackIn_31_1) {
                            statePc = 35;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (var4 == 0) {
                            statePc = 68;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (-2 != (var3 ^ -1)) {
                            statePc = 41;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (var4 == 0) {
                            statePc = 71;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (-4 != (var3 ^ -1)) {
                            statePc = 47;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (var4 == 0) {
                            statePc = 74;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (-1 != (var3 ^ -1)) {
                            statePc = 53;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (var4 == 0) {
                            statePc = 77;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (-7 == (var3 ^ -1)) {
                            statePc = 80;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (5 != var3) {
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
                        if (var4 == 0) {
                            statePc = 83;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (2 != var3) {
                            statePc = 89;
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
                        if (var4 == 0) {
                            statePc = 86;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        ra.a(fa.field_f ^ 255, -61, fa.field_f);
                        if (var4 == 0) {
                            statePc = 92;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        ra.a(255 ^ hj.field_b, -84, hj.field_b);
                        if (var4 == 0) {
                            statePc = 92;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        ra.a(255 ^ ac.field_u, -50, ac.field_u);
                        if (var4 == 0) {
                            statePc = 92;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        ra.a(255 ^ kf.field_d, -71, kf.field_d);
                        if (var4 == 0) {
                            statePc = 92;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        ra.a(255 ^ vi.field_E, -115, vi.field_E);
                        if (var4 == 0) {
                            statePc = 92;
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
                        ra.a(255 ^ jj.field_g, -92, jj.field_g);
                        if (var4 == 0) {
                            statePc = 92;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        ra.a(255 ^ jg.field_a, -121, jg.field_a);
                        if (var4 == 0) {
                            statePc = 92;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        ra.a(hj.field_b ^ 255, -95, hj.field_b);
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        ((gh) this).field_B = false;
                        ((gh) this).field_F = true;
                        ((gh) this).field_i = false;
                        ((gh) this).field_f = true;
                        ((gh) this).field_H = false;
                        ((gh) this).field_D = 0;
                        if (-1 > (ji.field_h ^ -1)) {
                            statePc = 95;
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
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        qe.b(10);
                        ld.b(false);
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        if (param0 <= -76) {
                            statePc = 102;
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
                        ((gh) this).field_h = true;
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        statePc = 102;
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
                case 101: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw t.a((Throwable) (Object) var2, "gh.D(" + param0 + 41);
                }
                case 102: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(boolean param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        String var3 = null;
        int var4 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Geoblox.field_C;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (!param0) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ((gh) this).a((byte) 71, 49);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (2 != ((gh) this).field_bb) {
                            statePc = 9;
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
                        pk.field_k.b(320 + -(((gh) this).field_D >> 883830849), 240 + -(((gh) this).field_D >> -1807064447), ((gh) this).field_D, ((gh) this).field_D, 150);
                        lj.field_d.b(((gh) this).field_ab, -(lj.field_d.field_o >> -129235807) + 240 - -60);
                        dd.field_G.a(sg.field_f, 15 + ((gh) this).field_ab, 312, 0, -1);
                        if (var4 == 0) {
                            statePc = 21;
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
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var2_int = -((gh) this).field_D + 460 + 460;
                        if (((gh) this).field_bb != 3) {
                            statePc = 16;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        pk.field_k.b(-(var2_int >> 1946680609) + 320, 240 - (var2_int >> -835172863), var2_int, var2_int, 150);
                        lj.field_d.b(-(lj.field_d.field_s >> -1714325343) + 320, -(lj.field_d.field_o >> -174520511) + 240 + 60);
                        var3 = Integer.toString(((gh) this).field_q);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        dd.field_G.b(var3, 320, 312, 0, -1);
                        if (!((gh) this).field_R) {
                            statePc = 15;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        dd.field_G.b(ld.field_a, 320, 352, 0, -1);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var4 == 0) {
                            statePc = 21;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        k.field_a.d(-(k.field_a.field_s >> 2015782145) + 320, 240 - (k.field_a.field_o >> 738361857), ((gh) this).field_S - 150 + 150);
                        lj.field_d.b(-(lj.field_d.field_s >> 1731342273) + 320, 300 + -(lj.field_d.field_o >> -1256391423));
                        var3 = Integer.toString(((gh) this).field_q);
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        dd.field_G.b(var3, 320, 312, 0, -1);
                        if (!((gh) this).field_R) {
                            statePc = 21;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        dd.field_G.b(ld.field_a, 320, 352, 0, -1);
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
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        int discarded$1 = dd.field_G.a(kd.field_d, 426, 404, 200, 100, 0, -1, 2, 0, 30);
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 23: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw t.a((Throwable) (Object) var2, "gh.S(" + param0 + 41);
                }
                case 24: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void f(int param0) {
        RuntimeException var2 = null;
        ja var2_ref = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_26_0 = 0;
        Object stackIn_61_0 = null;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_25_0 = 0;
        Object stackOut_60_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = Geoblox.field_C;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (0 == ((gh) this).field_D) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        gf.field_f = 0;
                        if (!sk.a(param0 + -11)) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        ((gh) this).field_y = 0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return;
                }
                case 7: {
                    try {
                        ((gh) this).field_q = ((gh) this).field_q + 179;
                        ((gh) this).field_R = a.field_d.c(13519);
                        ((gh) this).field_S = 150;
                        var2_ref = i.a((byte) -128);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (null != var2_ref) {
                            statePc = 12;
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
                        ((gh) this).field_c = 29;
                        if (var11 == 0) {
                            statePc = 25;
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
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        vf.field_L.e();
                        vb.c();
                        var2_ref.field_J.a(var2_ref.field_J.field_s << -907967581, var2_ref.field_J.field_o << -2077405885, vf.field_L.field_s << -1078669405, vf.field_L.field_o << -1697489437, (int)(65535.0 * ((double)var2_ref.field_u / 6.283185307179586)), 4096);
                        sh.field_y.a(255);
                        var3 = 0;
                        var4 = (int)(var2_ref.field_o + 0.5f) + (-(vf.field_L.field_r >> 585464481) + -320);
                        var5 = -240 + ((int)(var2_ref.field_v + 0.5f) + -(vf.field_L.field_m >> -846006463));
                        var6 = 0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = var6;
                        stackOut_13_1 = vf.field_L.field_r;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (stackIn_14_0 >= stackIn_14_1) {
                            statePc = 24;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackOut_15_0 = 0;
                        stackIn_26_0 = stackOut_15_0;
                        stackIn_16_0 = stackOut_15_0;
                        if (var11 != 0) {
                            statePc = 26;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var7 = stackIn_16_0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (vf.field_L.field_m <= var7) {
                            statePc = 23;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackOut_18_0 = 0;
                        stackOut_18_1 = vf.field_L.field_v[vf.field_L.field_r * var7 + var6];
                        stackIn_14_0 = stackOut_18_0;
                        stackIn_14_1 = stackOut_18_1;
                        stackIn_19_0 = stackOut_18_0;
                        stackIn_19_1 = stackOut_18_1;
                        if (var11 != 0) {
                            statePc = 14;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (stackIn_19_0 == stackIn_19_1) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var8 = var4 + var6;
                        var9 = var7 + var5;
                        var10 = var8 * var8 - -(var9 * var9);
                        if (var10 <= var3) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var3 = var10;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var7++;
                        if (var11 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var6++;
                        if (var11 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        ((gh) this).field_c = (int)(0.5 + Math.sqrt((double)var3));
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        ((gh) this).field_W = 920 + (-(2 * ((gh) this).field_c) - 58 - 1);
                        stackOut_25_0 = param0 ^ 10;
                        stackIn_26_0 = stackOut_25_0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        ra.a(stackIn_26_0, qf.field_bb);
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        ((gh) this).field_D = ((gh) this).field_D + 1;
                        if (((gh) this).field_D + 1 == 150 + ((gh) this).field_W) {
                            statePc = 71;
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
                        if (460 <= ((gh) this).field_D) {
                            statePc = 34;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        ((gh) this).field_bb = 2;
                        if (var11 == 0) {
                            statePc = 43;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if ((460 + -((gh) this).field_D + 460 ^ -1) <= (((gh) this).field_c * 2 ^ -1)) {
                            statePc = 40;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        ((gh) this).field_bb = 4;
                        if (var11 == 0) {
                            statePc = 43;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        ((gh) this).field_bb = 3;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (3 != ((gh) this).field_bb) {
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
                        ((gh) this).field_q = ((gh) this).field_q + 7;
                        if (var11 == 0) {
                            statePc = 78;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (-3 == (((gh) this).field_bb ^ -1)) {
                            statePc = 57;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if ((((gh) this).field_S ^ -1) != -151) {
                            statePc = 56;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        td.a(-348, fl.field_c[28]);
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        ((gh) this).field_S = ((gh) this).field_S - 1;
                        if (var11 == 0) {
                            statePc = 78;
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
                        if (((gh) this).field_M == null) {
                            statePc = 66;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        stackOut_60_0 = this;
                        stackIn_61_0 = stackOut_60_0;
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (((gh) this).field_M.l()) {
                            statePc = 66;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        var2_int = ((gh) this).field_D * 100 / 460;
                        ((gh) this).field_M = kl.a(fl.field_c[28], 2 * var2_int - -200, 45);
                        ja.a(false, ((gh) this).field_M);
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (((gh) this).field_ab <= 320 + -(lj.field_d.field_s >> -1578896191)) {
                            statePc = 78;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        ((gh) this).field_ab = ((gh) this).field_ab - 1;
                        if (var11 == 0) {
                            statePc = 78;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        ((gh) this).field_H = true;
                        ((gh) this).field_D = 0;
                        ((gh) this).field_bb = 5;
                        if (!((gh) this).field_R) {
                            statePc = 77;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        ld.a(350, 320, 66, 2000);
                        ra.a(eb.field_i ^ 255, param0 + -101, eb.field_i);
                        ((gh) this).field_B = false;
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        ld.a(310, 320, 90, ((gh) this).field_q);
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        cf.d((byte) 33);
                        f.o(600);
                        if (param0 == 10) {
                            statePc = 84;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        gh.i(-70);
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 83: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw t.a((Throwable) (Object) var2, "gh.B(" + param0 + 41);
                }
                case 84: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void e(byte param0) {
        RuntimeException var2 = null;
        Object stackIn_4_0 = null;
        int stackIn_8_0 = 0;
        Object stackOut_3_0 = null;
        int stackOut_7_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0 == -70) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 1: {
                    return;
                }
                case 2: {
                    try {
                        if (0 >= ((gh) this).field_o) {
                            statePc = 14;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = this;
                        stackIn_4_0 = stackOut_3_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (((gh) this).field_K) {
                            statePc = 14;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = -102;
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (fh.c(stackIn_8_0)) {
                            statePc = 14;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        ai discarded$2 = qf.a(oa.field_a, 22, kb.field_d, 25134, new int[1], ml.field_r, 65513, 3, gb.field_g);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
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
                        ca.field_f = null;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw t.a((Throwable) (Object) var2, "gh.O(" + param0 + 41);
                }
                case 17: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (((gh) this).field_Y) {
                            statePc = 2;
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
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        ((gh) this).field_A = ((gh) this).field_A + param0;
                        if (-100000 <= (((gh) this).field_A ^ -1)) {
                            statePc = 7;
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
                        StringBuilder discarded$5 = td.a((CharSequence) (Object) Integer.toString(99999), ((gh) this).field_g, 0, 26);
                        if (Geoblox.field_C == 0) {
                            statePc = 10;
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
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        StringBuilder discarded$6 = td.a((CharSequence) (Object) Integer.toString(((gh) this).field_A), ((gh) this).field_g, 0, 73);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
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
                        var3_int = -83 % ((-19 - param1) / 54);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    var3 = (RuntimeException) (Object) caughtException;
                    throw t.a((Throwable) (Object) var3, "gh.R(" + param0 + 44 + param1 + 41);
                }
                case 13: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void e(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = Geoblox.field_C;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (!((gh) this).field_f) {
                            statePc = 3;
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
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return;
                }
                case 4: {
                    try {
                        if (-1 == (((gh) this).field_bb ^ -1)) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        int discarded$1 = dd.field_G.a(tj.field_a, 426, 404, 200, 100, 0, -1, 2, 0, 30);
                        if (var3 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var2_int = -ul.field_b + fa.field_b;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        dd.field_G.field_K[0][wf.field_p] = 15488514;
                        dd.field_G.c(w.field_e, 621, 441, 0, -1);
                        dd.field_G.field_K[0][wf.field_p] = 16689938;
                        dd.field_G.c(od.field_b, 621, 468, 0, -1);
                        if ((var2_int ^ -1) < -11) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        dd.field_G.field_K[0][wf.field_p] = mk.field_k[var2_int % 5];
                        dd.field_G.c(Integer.toString(var2_int), 515, 468, 0, -1);
                        dd.field_G.field_K[0][wf.field_p] = 16689938;
                        if (var3 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var2_int > 99999) {
                            statePc = 19;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        dd.field_G.c(Integer.toString(var2_int), 515, 468, 0, -1);
                        if (var3 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        dd.field_G.c(Integer.toString(99999), 515, 468, 0, -1);
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
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (param0 < -39) {
                            statePc = 28;
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
                        ((gh) this).field_q = 7;
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
                        statePc = 28;
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
                    var2 = (RuntimeException) (Object) caughtException;
                    throw t.a((Throwable) (Object) var2, "gh.E(" + param0 + 41);
                }
                case 28: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void d(int param0) {
        RuntimeException var2 = null;
        int var3 = 0;
        Object stackIn_25_0 = null;
        Object stackOut_24_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = Geoblox.field_C;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 == 28809) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ((gh) this).field_j = true;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (fh.c(-93)) {
                            statePc = 21;
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
                        if (((gh) this).field_e > 0) {
                            statePc = 18;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (((gh) this).field_o <= 0) {
                            statePc = 15;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        ai.field_p = 2;
                        if (var3 == 0) {
                            statePc = 34;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        ai.field_p = 0;
                        if (var3 == 0) {
                            statePc = 34;
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
                        ai.field_p = 6;
                        if (var3 == 0) {
                            statePc = 34;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (((gh) this).field_o > 0) {
                            statePc = 28;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackOut_24_0 = this;
                        stackIn_25_0 = stackOut_24_0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if ((((gh) this).field_e ^ -1) >= -1) {
                            statePc = 31;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        ai.field_p = 4;
                        if (var3 == 0) {
                            statePc = 34;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        ai.field_p = 0;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        fi.a(0, ll.field_d);
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 36: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw t.a((Throwable) (Object) var2, "gh.J(" + param0 + 41);
                }
                case 37: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void h(int param0) {
        try {
            ((gh) this).field_o = 0;
            ((gh) this).field_A = 0;
            sc.field_f = 3382;
            el.field_g = 8801;
            ml.field_r = 1385;
            dc.field_a = 0;
            oa.field_a = 4703;
            gb.field_g = 5997;
            kb.field_d = 275;
            lb.field_b = 935;
            ((gh) this).a((byte) 127, 0);
            ((gh) this).a(0, -96);
            gf.field_f = 1;
            ((gh) this).field_y = 1;
            ((gh) this).field_T = 640;
            td.a((byte) -93);
            if (param0 < 104) {
                gh.i(-111);
            }
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "gh.L(" + param0 + 41);
        }
    }

    private final void c(byte param0) {
        try {
            if (param0 <= 40) {
                gh.i(100);
            }
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "gh.I(" + param0 + 41);
        }
    }

    private final void j(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        ((gh) this).field_bb = 0;
                        ((gh) this).field_ab = 640;
                        ((gh) this).field_q = 0;
                        ((gh) this).field_c = 0;
                        if (param0 == 867) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        this.g(20);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (ji.field_h < 41) {
                            statePc = 8;
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
                        ra.a(255 ^ pk.field_m, -103, pk.field_m);
                        statePc = 6;
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
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var2_int = uh.b(16);
                        c.field_ab = var2_int;
                        cd.a((byte) 116);
                        hf.a(param0 ^ -796, var2_int);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw t.a((Throwable) (Object) var2, "gh.H(" + param0 + 41);
                }
                case 11: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void c(boolean param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if ((((gh) this).field_A ^ -1) != -1) {
            try {
              L0: {
                if (!param0) {
                  break L0;
                } else {
                  ((gh) this).field_K = true;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            throw decompiledCaughtException;
          } else {
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          ld.a(34, 20 + (((gh) this).field_T - -60), 79, ((gh) this).field_A);
          td.a(-348, fl.field_c[32]);
          ((gh) this).field_A = 0;
        }
    }

    gh(Geoblox param0, boolean param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    ((gh) this).field_R = false;
                    ((gh) this).field_T = 640;
                    ((gh) this).field_a = 0;
                    ((gh) this).field_K = false;
                    ((gh) this).field_C = false;
                    ((gh) this).field_Q = false;
                    ((gh) this).field_k = 1;
                    ((gh) this).field_y = 0;
                    ((gh) this).field_N = false;
                    ((gh) this).field_b = false;
                    ((gh) this).field_o = 0;
                    ((gh) this).field_x = false;
                    ((gh) this).field_j = false;
                    ((gh) this).field_d = false;
                    ((gh) this).field_q = 0;
                    ((gh) this).field_f = true;
                    ((gh) this).field_p = 0;
                    ((gh) this).field_t = 0;
                    ((gh) this).field_B = false;
                    ((gh) this).field_h = false;
                    ((gh) this).field_i = false;
                    ((gh) this).field_X = new StringBuilder(5);
                    ((gh) this).field_A = 0;
                    ((gh) this).field_g = new StringBuilder(5);
                    ((gh) this).field_L = false;
                    ((gh) this).field_D = 0;
                    ((gh) this).field_F = false;
                    ((gh) this).field_H = false;
                    ((gh) this).field_ab = 640;
                    ((gh) this).field_S = 150;
                    ((gh) this).field_W = 0;
                    ((gh) this).field_c = 0;
                    ((gh) this).field_bb = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ((gh) this).field_I = param0;
                        ug.field_c = 0;
                        pb.field_t.c((byte) -126);
                        ((gh) this).field_A = 0;
                        ((gh) this).field_w = -(i.field_a.field_r >> -724246015);
                        ((gh) this).field_Y = param1;
                        ((gh) this).field_C = param1;
                        ((gh) this).field_o = 0;
                        ((gh) this).field_u = -(i.field_a.field_m >> 30070753);
                        ((gh) this).field_J = 0.0f;
                        bk.field_a.e();
                        vb.c();
                        i.field_a.a(320 + ((gh) this).field_w, ((gh) this).field_u + 240, 16777215);
                        oc.field_d.e();
                        vb.c();
                        sh.field_y.a(255);
                        ((gh) this).field_H = false;
                        ((gh) this).field_D = 0;
                        ((gh) this).field_F = true;
                        ((gh) this).field_bb = 0;
                        ((gh) this).field_x = false;
                        ((gh) this).a((byte) 127, 0);
                        if (!da.a(0, 111)) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        uf.field_h[0] = 14788623;
                        uf.field_h[1] = 15439657;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        td.a((byte) -93);
                        ja.h(0);
                        c.field_ab = ee.field_B[0];
                        cd.a((byte) 104);
                        ((gh) this).field_j = false;
                        ((gh) this).field_K = false;
                        ((gh) this).field_N = false;
                        ((gh) this).field_L = false;
                        hf.a(-116, 1);
                        if (jf.field_a == null) {
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
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        jf.field_a = new dm(ec.field_c.field_r, ec.field_c.field_m);
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
                        oa.field_a = 4703;
                        kb.field_d = 275;
                        lb.field_b = 935;
                        dc.field_a = 0;
                        ml.field_r = 1385;
                        el.field_g = 8801;
                        sc.field_f = 3382;
                        gb.field_g = 5997;
                        ((gh) this).field_e = 0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    var3 = (RuntimeException) (Object) caughtException;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    try {
                        stackOut_10_0 = (RuntimeException) var3;
                        stackOut_10_1 = new StringBuilder().append("gh.<init>(");
                        stackIn_13_0 = stackOut_10_0;
                        stackIn_13_1 = stackOut_10_1;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        if (param0 == null) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                        stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
                        stackOut_11_2 = "{...}";
                        stackIn_14_0 = stackOut_11_0;
                        stackIn_14_1 = stackOut_11_1;
                        stackIn_14_2 = stackOut_11_2;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 13: {
                    stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                    stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                    stackOut_13_2 = "null";
                    stackIn_14_0 = stackOut_13_0;
                    stackIn_14_1 = stackOut_13_1;
                    stackIn_14_2 = stackOut_13_2;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    throw t.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 41);
                }
                case 15: {
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_P = 0;
    }
}
