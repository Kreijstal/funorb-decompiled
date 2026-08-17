/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class bf {
    private int field_B;
    private ag field_q;
    private he[] field_F;
    private nh field_f;
    private int field_G;
    int field_m;
    private ck[] field_L;
    private boolean field_C;
    private int field_E;
    private static int[] field_S;
    private int field_u;
    static he[] field_v;
    int field_O;
    int field_p;
    int field_I;
    double field_N;
    private int field_V;
    boolean field_s;
    static String field_x;
    int field_t;
    int field_d;
    private int field_K;
    private Random field_T;
    private int field_g;
    private he[] field_n;
    static bg field_h;
    private int field_M;
    private int field_c;
    double field_o;
    int field_w;
    double field_l;
    private he[] field_y;
    he field_D;
    private int field_U;
    private he[] field_r;
    private int field_R;
    private int field_e;
    private int field_z;
    private int field_a;
    int field_J;
    private gf field_b;
    private boolean field_A;
    private hi[] field_i;
    int field_k;
    private int field_P;
    int field_H;
    int field_W;
    int field_Q;
    double field_j;

    private final void d(int param0) {
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        bf var6 = null;
        int var7 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (this.field_o < (double)param0) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return;
                }
                case 4: {
                    try {
                        this.field_a = this.field_a - 1;
                        if (-1 > (this.field_a ^ -1)) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return;
                }
                case 6: {
                    try {
                        var2_int = -1;
                        var3 = -1;
                        var4 = (int)(this.field_o + (double)this.field_I);
                        var5 = (int)(this.field_N + (double)this.field_t);
                        var6_int = this.field_Q;
                        if ((var6_int ^ -1) == -6) {
                            statePc = 34;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var6_int != 7) {
                            statePc = 13;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var7 == 0) {
                            statePc = 44;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if ((var6_int ^ -1) != -12) {
                            statePc = 19;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var7 == 0) {
                            statePc = 50;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (-18 == (var6_int ^ -1)) {
                            statePc = 67;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (18 != var6_int) {
                            statePc = 28;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (var7 == 0) {
                            statePc = 75;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if ((var6_int ^ -1) != -62) {
                            statePc = 77;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (var7 == 0) {
                            statePc = 76;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var2_int = 23;
                        if (1 == this.field_J) {
                            statePc = 37;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var2_int = -1;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if ((this.field_J ^ -1) != -3) {
                            statePc = 40;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var3 = 3;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (-4 == (this.field_J ^ -1)) {
                            statePc = 43;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var3 = 4;
                        if (var7 == 0) {
                            statePc = 78;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var4 -= 5;
                        if (this.field_J == 2) {
                            statePc = 48;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var3 = 6;
                        if (var7 == 0) {
                            statePc = 49;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var3 = 37;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var5 -= 16;
                        if (var7 == 0) {
                            statePc = 78;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (-2 == (this.field_J ^ -1)) {
                            statePc = 56;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (this.field_J != 3) {
                            statePc = 66;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        var3 = 37;
                        var6_int = 0;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (-4 >= (var6_int ^ -1)) {
                            statePc = 62;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        sd.field_a.a(hi.a(32, 4, this.field_T) + (var5 + -16), true, var3, hi.a(64, param0 + 4, this.field_T) + (var4 - 32), 0, true);
                        var6_int++;
                        if (var7 != 0) {
                            statePc = 65;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (var7 == 0) {
                            statePc = 57;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if ((var2_int ^ -1) != 0) {
                            statePc = 65;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        th.a(-27610, 32, e.a(param0 + 115, (int)this.field_o), nl.field_r[var2_int]);
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        var2_int = 36;
                        if (var7 == 0) {
                            statePc = 78;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (this.field_J == 1) {
                            statePc = 72;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        var3 = 15;
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        var2_int = 58;
                        if ((this.field_J ^ -1) != -3) {
                            statePc = 78;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        var3 = 16;
                        if (var7 == 0) {
                            statePc = 78;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        var2_int = 64;
                        var3 = 16;
                        if (var7 == 0) {
                            statePc = 78;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        var2_int = 64;
                        var3 = 15;
                        if (var7 == 0) {
                            statePc = 78;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 77: {
                    return;
                }
                case 78: {
                    try {
                        if (var3 == -1) {
                            statePc = 83;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        var6 = sd.field_a.a(var5, true, var3, var4, 0, true);
                        if (61 == this.field_Q) {
                            statePc = 82;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        var6.field_o = var6.field_o - (double)var6.field_I;
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        if ((var2_int ^ -1) != 0) {
                            statePc = 86;
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
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        th.a(-27610, 32, e.a(116, (int)this.field_o), nl.field_r[var2_int]);
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 88: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw ie.a((Throwable) ((Object) var2), "bf.F(" + param0 + ')');
                }
                case 89: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void c(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              field_v = null;
              if (param0 == -114) {
                break L1;
              } else {
                bf.b(-11);
                break L1;
              }
            }
            field_S = null;
            field_h = null;
            field_x = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var1), "bf.G(" + param0 + ')');
        }
    }

    final boolean d(byte param0) {
        int fieldTemp$0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_135_0 = 0;
        int stackIn_143_0 = 0;
        int stackIn_156_0 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        he[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        he var3_ref_he = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (this.field_e != 0) {
                            statePc = 7;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (this.field_q == null) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        od.a(-1630758008, this.field_q);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (param0 >= 35) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        this.field_y = (he[]) null;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        this.field_V = this.field_V + 1;
                        this.field_e = this.field_e + 1;
                        if (!this.field_s) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var2 = this.field_n;
                        this.field_z = this.field_z + 1;
                        if (var6 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var2 = this.field_F;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (this.field_V % qa.field_T[this.field_Q] != 0) {
                            statePc = 19;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        fieldTemp$0 = this.field_E + 1;
                        this.field_E = this.field_E + 1;
                        if (fieldTemp$0 != var2.length) {
                            statePc = 19;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        this.field_E = 0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (this.field_r == null) {
                            statePc = 40;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if ((this.field_u ^ -1) >= -1) {
                            statePc = 26;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        this.field_R = -(this.field_u / qa.field_T[this.field_Q]) + -1 + this.field_r.length;
                        if (var6 == 0) {
                            statePc = 34;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if ((this.field_u ^ -1) > -1) {
                            statePc = 32;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        this.field_u = this.field_r.length - 1;
                        if (var6 == 0) {
                            statePc = 34;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        this.field_R = -(-this.field_u / qa.field_T[this.field_Q]) + (-1 + this.field_r.length);
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (-1 + this.field_r.length >= this.field_R) {
                            statePc = 37;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        this.field_R = this.field_r.length - 1;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if ((this.field_R ^ -1) <= -1) {
                            statePc = 40;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        this.field_R = 0;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (null != this.field_y) {
                            statePc = 43;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        this.field_K = (this.field_y.length - 1) * (this.field_V % this.b((byte) -121, this.field_Q)) / this.b((byte) -123, this.field_Q);
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        this.field_A = false;
                        var5 = this.field_Q;
                        if ((var5 ^ -1) != -6) {
                            statePc = 48;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (var6 == 0) {
                            statePc = 68;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (var5 != 11) {
                            statePc = 54;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (var6 == 0) {
                            statePc = 68;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (var5 == 17) {
                            statePc = 68;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if ((var5 ^ -1) != -19) {
                            statePc = 63;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (var6 == 0) {
                            statePc = 68;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (var5 == 40) {
                            statePc = 75;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        var3 = 1 + this.field_V % this.b((byte) -125, this.field_Q) / 20;
                        var4 = 2097152;
                        var5 = 0;
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if ((this.field_L.length ^ -1) >= (var5 ^ -1)) {
                            statePc = 74;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        var4 += 256;
                        this.field_L[var5].a(-var3 + (int)this.field_N + this.field_t - -hi.a(var3 * 2, 4, this.field_T), var3 / 2, var4, 112, 1, (int)this.field_o - -hi.a(2 * var3, 4, this.field_T) + -var3);
                        var5++;
                        if (var6 != 0) {
                            statePc = 80;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (var6 == 0) {
                            statePc = 69;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (var6 == 0) {
                            statePc = 80;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if (430.0 >= (double)this.field_t + this.field_N) {
                            statePc = 80;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        this.e(63);
                        stackIn_79_0 = 1;
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 79: {
                    return stackIn_79_0 != 0;
                }
                case 80: {
                    try {
                        if (8 == this.field_Q) {
                            statePc = 105;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        if ((this.field_Q ^ -1) == -10) {
                            statePc = 105;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        if (-11 == (this.field_Q ^ -1)) {
                            statePc = 105;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        if (cj.field_c[this.field_Q]) {
                            statePc = 99;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        if (6 == this.field_Q) {
                            statePc = 99;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        if (-1 == (this.field_Q ^ -1)) {
                            statePc = 99;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        if ((this.field_Q ^ -1) != -36) {
                            statePc = 102;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        this.field_N = this.field_N + this.field_j;
                        this.field_o = this.field_o + this.field_l;
                        this.f(-46);
                        if (var6 == 0) {
                            statePc = 107;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        this.a((byte) -123);
                        this.f(-46);
                        this.field_N = this.field_N + this.field_j;
                        this.field_o = this.field_o + this.field_l;
                        if (var6 == 0) {
                            statePc = 107;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        this.field_N = this.field_N + this.field_j;
                        this.field_o = this.field_o + this.field_l;
                        statePc = 107;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        if (2 != hc.field_G) {
                            statePc = 130;
                        } else {
                            statePc = 108;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        if (5 == this.field_Q) {
                            statePc = 120;
                        } else {
                            statePc = 109;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        if (this.field_Q == 11) {
                            statePc = 120;
                        } else {
                            statePc = 112;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        if (-18 == (this.field_Q ^ -1)) {
                            statePc = 120;
                        } else {
                            statePc = 115;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        statePc = 117;
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        if (18 != this.field_Q) {
                            statePc = 130;
                        } else {
                            statePc = 118;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        var3_ref_he = this.b((byte) 55);
                        if (this.field_o >= 0.0) {
                            statePc = 124;
                        } else {
                            statePc = 121;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        this.field_C = true;
                        this.field_g = (640 + var3_ref_he.field_d) / 2;
                        if (var6 == 0) {
                            statePc = 130;
                        } else {
                            statePc = 122;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        statePc = 124;
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        if (this.field_o > (double)((var3_ref_he.field_d + 640) / 2)) {
                            statePc = 129;
                        } else {
                            statePc = 125;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        statePc = 127;
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        this.field_C = false;
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        if (this.field_q == null) {
                            statePc = 133;
                        } else {
                            statePc = 131;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        this.field_q.l(e.a(124, (int)this.field_o));
                        statePc = 133;
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        if (this.field_o >= (double)(-(100 + this.field_m))) {
                            statePc = 136;
                        } else {
                            statePc = 134;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        stackIn_135_0 = 1;
                        statePc = 135;
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 135: {
                    return stackIn_135_0 != 0;
                }
                case 136: {
                    try {
                        if (38 == this.field_Q) {
                            statePc = 144;
                        } else {
                            statePc = 137;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        if (this.field_o > 740.0) {
                            statePc = 142;
                        } else {
                            statePc = 138;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        statePc = 144;
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        stackIn_143_0 = 1;
                        statePc = 143;
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 143: {
                    return stackIn_143_0 != 0;
                }
                case 144: {
                    try {
                        if (-1 != (this.field_V & 1 ^ -1)) {
                            statePc = 154;
                        } else {
                            statePc = 145;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        if (0 == (vg.field_r[this.field_Q] ^ -1)) {
                            statePc = 154;
                        } else {
                            statePc = 146;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        statePc = 148;
                        continue stateLoop;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        var3 = 0;
                        statePc = 149;
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        if (this.field_i.length <= var3) {
                            statePc = 154;
                        } else {
                            statePc = 150;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        this.field_i[var3].a(lb.field_B[this.field_Q], 30, (double)vg.field_r[this.field_Q], (double)(int)((double)dd.field_h[this.field_Q] + this.field_N), 0, -1.0, 1.0, (double)(int)((double)nc.field_L[this.field_Q] + this.field_o), 64);
                        var3++;
                        if (var6 != 0) {
                            statePc = 155;
                        } else {
                            statePc = 151;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_150) {
                        caughtException = stateCaught_150;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        if (var6 == 0) {
                            statePc = 149;
                        } else {
                            statePc = 152;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        statePc = 154;
                        continue stateLoop;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        this.l(-39);
                        statePc = 155;
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        stackIn_156_0 = 0;
                        statePc = 156;
                        continue stateLoop;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 156: {
                    return stackIn_156_0 != 0;
                }
                case 157: {
                    var2_ref = (RuntimeException) ((Object) caughtException);
                    throw ie.a((Throwable) ((Object) var2_ref), "bf.Q(" + param0 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(byte param0, he param1) {
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param0 >= 33) {
                break L1;
              } else {
                this.a(47);
                break L1;
              }
            }
            L2: {
              L3: {
                if (this.field_A) {
                  break L3;
                } else {
                  L4: {
                    param1.a((int)((double)(-param1.field_a) + this.field_o) + this.field_F[this.field_E].field_a, this.field_F[this.field_E].field_f + (int)((double)(-param1.field_f) + this.field_N));
                    if (this.field_y == null) {
                      break L4;
                    } else {
                      this.field_y[this.field_K].a((int)this.field_o, (int)this.field_N);
                      break L4;
                    }
                  }
                  if (null != this.field_r) {
                    this.field_r[this.field_R].a((int)this.field_o, (int)this.field_N);
                    if (!DrPhlogistonSavesTheEarth.field_D) {
                      break L2;
                    } else {
                      break L3;
                    }
                  } else {
                    break L2;
                  }
                }
              }
              L5: {
                param1.c((int)this.field_o, (int)this.field_N, 128, qk.field_b[this.field_Q]);
                if (this.field_y == null) {
                  break L5;
                } else {
                  this.field_y[this.field_K].c((int)this.field_o, (int)this.field_N, 128, qk.field_b[this.field_Q]);
                  break L5;
                }
              }
              if (null != this.field_r) {
                this.field_r[this.field_R].c((int)this.field_o, (int)this.field_N, 128, qk.field_b[this.field_Q]);
                break L2;
              } else {
                break L2;
              }
            }
            L6: {
              if (this.field_f == null) {
                break L6;
              } else {
                if (2 != sd.field_e) {
                  break L6;
                } else {
                  if (0 >= g.field_s[this.field_Q]) {
                    break L6;
                  } else {
                    L7: {
                      if (0 == (1 & this.field_e)) {
                        this.field_f = gm.a(this.field_f, fb.field_c[this.field_Q], g.field_s[this.field_Q], ff.field_Q[this.field_Q][this.field_E], fk.field_t[this.field_Q], true);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    if (this.field_f != null) {
                      this.field_f.a((int)this.field_o, (int)this.field_N, 382);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackIn_43_0 = (RuntimeException) (var3);

            stackIn_43_1 = new StringBuilder().append("bf.CA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "null";
              break L8;
            } else {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "{...}";
              break L8;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_44_0), stackIn_44_2 + ')');
        }
    }

    final boolean m(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 < -94) {
              if (this.field_s) {
                L1: {
                  if (!this.field_s) {
                    break L1;
                  } else {
                    if (th.field_d[this.field_Q]) {
                      stackIn_13_0 = 1;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                stackIn_15_0 = 0;
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                stackIn_5_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var2), "bf.W(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0 != 0;
            } else {
              return stackIn_15_0 != 0;
            }
          }
        }
    }

    final boolean a(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                this.field_e = -20;
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  if ((this.field_Q ^ -1) > -20) {
                    break L4;
                  } else {
                    if (30 >= this.field_Q) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (this.field_Q < 65) {
                    break L5;
                  } else {
                    if (this.field_Q > 76) {
                      break L5;
                    } else {
                      break L3;
                    }
                  }
                }
                stackIn_16_0 = 0;
                break L2;
              }
              stackIn_16_0 = 1;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var2), "bf.C(" + param0 + ')');
        }
        return stackIn_16_0 != 0;
    }

    final int e(byte param0) {
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        double var3 = 0.0;
        int var5 = 0;
        try {
          L0: {
            var2_int = -(int)this.field_N + 430;
            var3 = (double)(this.field_e % k.field_M[this.field_Q]) / (0.5 * (double)k.field_M[this.field_Q]);
            var5 = 126 % ((param0 - 26) / 63);
            stackIn_1_0 = (int)((-var3 + 1.0) * (double)var2_int);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var2), "bf.H(" + param0 + ')');
        }
        return stackIn_1_0;
    }

    private final void l(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = this.field_Q;
              if (40 == var2_int) {
                break L1;
              } else {
                if (-42 == (var2_int ^ -1)) {
                  break L1;
                } else {
                  if ((var2_int ^ -1) == -9) {
                    break L1;
                  } else {
                    if (9 == var2_int) {
                      break L1;
                    } else {
                      L2: {
                        if (var2_int != 10) {
                          break L2;
                        } else {
                          if (var3 == 0) {
                            break L1;
                          } else {
                            break L2;
                          }
                        }
                      }
                      L3: {
                        if ((var2_int ^ -1) != -16) {
                          break L3;
                        } else {
                          if (var3 == 0) {
                            break L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                      if (16 == var2_int) {
                        break L1;
                      } else {
                        if (0.0 <= this.field_N) {
                          break L1;
                        } else {
                          if (!cj.field_c[this.field_Q]) {
                            this.field_j = 0.0;
                            this.field_N = 0.0;
                            break L1;
                          } else {
                            break L1;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            L4: {
              if (param0 == -39) {
                break L4;
              } else {
                this.field_i = (hi[]) null;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var2), "bf.B(" + param0 + ')');
        }
    }

    private final int f(byte param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ek.field_n = (ek.field_n + 1) % 5;
              if (param0 >= 56) {
                break L1;
              } else {
                this.field_T = (Random) null;
                break L1;
              }
            }
            stackIn_4_0 = ek.field_n;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var2), "bf.A(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    private final boolean g(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 < -34) {
              if (null != sd.field_a) {
                L1: {
                  if (this.field_Q == 45) {
                    break L1;
                  } else {
                    if (44 != this.field_Q) {
                      stackIn_18_0 = 1;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                L2: {
                  if (200.0 <= dl.a(true, -sd.field_a.field_N + this.field_o, -sd.field_a.field_D + this.field_N)) {
                    stackIn_16_0 = 0;
                    break L2;
                  } else {
                    stackIn_16_0 = 1;
                    break L2;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var2), "bf.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0 != 0;
            } else {
              return stackIn_18_0 != 0;
            }
          }
        }
    }

    final boolean h(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                var2_int = 33 / ((-20 - param0) / 37);
                if ((this.field_Q ^ -1) == -6) {
                  break L2;
                } else {
                  if (-12 == (this.field_Q ^ -1)) {
                    break L2;
                  } else {
                    if (-18 == (this.field_Q ^ -1)) {
                      break L2;
                    } else {
                      if (18 != this.field_Q) {
                        stackIn_13_0 = 0;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              stackIn_13_0 = 1;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var2), "bf.L(" + param0 + ')');
        }
        return stackIn_13_0 != 0;
    }

    private final void f(int param0) {
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            if (0 <= this.field_H) {
              L1: {
                L2: {
                  L3: {
                    L4: {
                      L5: {
                        L6: {
                          L7: {
                            L8: {
                              L9: {
                                L10: {
                                  L11: {
                                    L12: {
                                      L13: {
                                        L14: {
                                          L15: {
                                            L16: {
                                              L17: {
                                                L18: {
                                                  var4 = this.field_Q;
                                                  if (0 != var4) {
                                                    break L18;
                                                  } else {
                                                    if (var5 == 0) {
                                                      break L17;
                                                    } else {
                                                      break L18;
                                                    }
                                                  }
                                                }
                                                if ((var4 ^ -1) == -36) {
                                                  break L17;
                                                } else {
                                                  L19: {
                                                    if (1 != var4) {
                                                      break L19;
                                                    } else {
                                                      if (var5 == 0) {
                                                        break L1;
                                                      } else {
                                                        break L19;
                                                      }
                                                    }
                                                  }
                                                  if (2 == var4) {
                                                    break L16;
                                                  } else {
                                                    L20: {
                                                      if (-48 != (var4 ^ -1)) {
                                                        break L20;
                                                      } else {
                                                        if (var5 == 0) {
                                                          break L16;
                                                        } else {
                                                          break L20;
                                                        }
                                                      }
                                                    }
                                                    if (4 == var4) {
                                                      break L15;
                                                    } else {
                                                      if (3 == var4) {
                                                        break L14;
                                                      } else {
                                                        if ((var4 ^ -1) == -47) {
                                                          break L13;
                                                        } else {
                                                          if (var4 == 5) {
                                                            break L12;
                                                          } else {
                                                            L21: {
                                                              if (-8 != (var4 ^ -1)) {
                                                                break L21;
                                                              } else {
                                                                if (var5 == 0) {
                                                                  break L11;
                                                                } else {
                                                                  break L21;
                                                                }
                                                              }
                                                            }
                                                            if ((var4 ^ -1) == -13) {
                                                              break L10;
                                                            } else {
                                                              if (var4 == 11) {
                                                                break L9;
                                                              } else {
                                                                if (-14 == (var4 ^ -1)) {
                                                                  break L8;
                                                                } else {
                                                                  L22: {
                                                                    if (-15 != (var4 ^ -1)) {
                                                                      break L22;
                                                                    } else {
                                                                      if (var5 == 0) {
                                                                        break L8;
                                                                      } else {
                                                                        break L22;
                                                                      }
                                                                    }
                                                                  }
                                                                  L23: {
                                                                    if (16 != var4) {
                                                                      break L23;
                                                                    } else {
                                                                      if (var5 == 0) {
                                                                        break L8;
                                                                      } else {
                                                                        break L23;
                                                                      }
                                                                    }
                                                                  }
                                                                  L24: {
                                                                    if (-39 != (var4 ^ -1)) {
                                                                      break L24;
                                                                    } else {
                                                                      if (var5 == 0) {
                                                                        break L8;
                                                                      } else {
                                                                        break L24;
                                                                      }
                                                                    }
                                                                  }
                                                                  if (var4 == 39) {
                                                                    break L8;
                                                                  } else {
                                                                    if (-63 == (var4 ^ -1)) {
                                                                      break L8;
                                                                    } else {
                                                                      if (-64 == (var4 ^ -1)) {
                                                                        break L8;
                                                                      } else {
                                                                        if (-43 == (var4 ^ -1)) {
                                                                          break L7;
                                                                        } else {
                                                                          L25: {
                                                                            if (var4 != 15) {
                                                                              break L25;
                                                                            } else {
                                                                              if (var5 == 0) {
                                                                                break L6;
                                                                              } else {
                                                                                break L25;
                                                                              }
                                                                            }
                                                                          }
                                                                          L26: {
                                                                            if (17 != var4) {
                                                                              break L26;
                                                                            } else {
                                                                              if (var5 == 0) {
                                                                                break L5;
                                                                              } else {
                                                                                break L26;
                                                                              }
                                                                            }
                                                                          }
                                                                          if (-19 == (var4 ^ -1)) {
                                                                            break L4;
                                                                          } else {
                                                                            L27: {
                                                                              if (-62 != (var4 ^ -1)) {
                                                                                break L27;
                                                                              } else {
                                                                                if (var5 == 0) {
                                                                                  break L3;
                                                                                } else {
                                                                                  break L27;
                                                                                }
                                                                              }
                                                                            }
                                                                            L28: {
                                                                              if (-46 != (var4 ^ -1)) {
                                                                                break L28;
                                                                              } else {
                                                                                if (var5 == 0) {
                                                                                  break L2;
                                                                                } else {
                                                                                  break L28;
                                                                                }
                                                                              }
                                                                            }
                                                                            if (44 != var4) {
                                                                              break L1;
                                                                            } else {
                                                                              if (var5 == 0) {
                                                                                break L2;
                                                                              } else {
                                                                                break L17;
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              L29: {
                                                if (-1 > (this.field_c ^ -1)) {
                                                  break L29;
                                                } else {
                                                  if (-1 > (this.field_U ^ -1)) {
                                                    break L29;
                                                  } else {
                                                    if (Math.random() >= (double)(sd.field_a.field_q + 1) / 100.0) {
                                                      break L29;
                                                    } else {
                                                      this.field_c = this.b((byte) -119, this.field_Q);
                                                      this.field_U = 5 + hi.a(8, 4, this.field_T);
                                                      break L29;
                                                    }
                                                  }
                                                }
                                              }
                                              L30: {
                                                this.field_c = this.field_c - 1;
                                                if (0 <= this.field_c) {
                                                  break L30;
                                                } else {
                                                  if (0 >= this.field_U) {
                                                    break L30;
                                                  } else {
                                                    if ((1 & this.field_V) != 0) {
                                                      break L30;
                                                    } else {
                                                      this.field_U = this.field_U - 1;
                                                      this.e(param0 ^ -19);
                                                      break L30;
                                                    }
                                                  }
                                                }
                                              }
                                              L31: {
                                                if (this.field_V % this.a((byte) 79, this.field_Q) == 0) {
                                                  this.k(0);
                                                  break L31;
                                                } else {
                                                  break L31;
                                                }
                                              }
                                              this.field_l = -oi.field_b[this.field_Q];
                                              if (var5 == 0) {
                                                break L1;
                                              } else {
                                                break L16;
                                              }
                                            }
                                            L32: {
                                              if (this.field_c >= 0) {
                                                break L32;
                                              } else {
                                                if (0 < this.field_U) {
                                                  break L32;
                                                } else {
                                                  if (Math.random() < (double)(sd.field_a.field_q + 1) / 100.0) {
                                                    this.field_c = this.b((byte) -127, this.field_Q);
                                                    this.field_U = sd.field_a.field_q + 1;
                                                    break L32;
                                                  } else {
                                                    break L32;
                                                  }
                                                }
                                              }
                                            }
                                            L33: {
                                              this.field_c = this.field_c - 1;
                                              if (0 <= this.field_c) {
                                                break L33;
                                              } else {
                                                if (0 >= this.field_U) {
                                                  break L33;
                                                } else {
                                                  if (0 == this.field_V % (10 + -sd.field_a.field_q)) {
                                                    this.field_U = this.field_U - 1;
                                                    this.e(63);
                                                    break L33;
                                                  } else {
                                                    break L33;
                                                  }
                                                }
                                              }
                                            }
                                            this.field_g = (int)this.field_o;
                                            this.field_l = -oi.field_b[this.field_Q];
                                            if (-48 != (this.field_Q ^ -1)) {
                                              break L1;
                                            } else {
                                              this.field_l = this.field_l * -1.0;
                                              this.field_j = this.field_j - vh.field_a[this.field_Q] * ji.a(65535, (double)this.field_e / 50.0);
                                              if (var5 == 0) {
                                                break L1;
                                              } else {
                                                break L15;
                                              }
                                            }
                                          }
                                          L34: {
                                            if (Math.random() >= 0.01) {
                                              break L34;
                                            } else {
                                              if (0 > this.field_c) {
                                                this.field_c = this.b((byte) -124, this.field_Q);
                                                break L34;
                                              } else {
                                                break L34;
                                              }
                                            }
                                          }
                                          this.field_c = this.field_c - 1;
                                          if ((this.field_c ^ -1) != -1) {
                                            break L14;
                                          } else {
                                            this.e(63);
                                            break L14;
                                          }
                                        }
                                        this.field_g = (int)this.field_o;
                                        this.field_l = -oi.field_b[this.field_Q];
                                        if (var5 == 0) {
                                          break L1;
                                        } else {
                                          break L13;
                                        }
                                      }
                                      this.field_l = -oi.field_b[this.field_Q];
                                      if (var5 == 0) {
                                        break L1;
                                      } else {
                                        break L12;
                                      }
                                    }
                                    L35: {
                                      if (0 == this.field_V % 150) {
                                        this.d(param0 + 46);
                                        break L35;
                                      } else {
                                        break L35;
                                      }
                                    }
                                    L36: {
                                      if ((this.field_V % this.b((byte) -120, this.field_Q) ^ -1) == -1) {
                                        this.e(63);
                                        break L36;
                                      } else {
                                        break L36;
                                      }
                                    }
                                    if (-1 != (this.field_V % 50 ^ -1)) {
                                      break L1;
                                    } else {
                                      this.k(0);
                                      if (var5 == 0) {
                                        break L1;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                  L37: {
                                    var2_int = (int)(-sd.field_a.field_N + this.field_o);
                                    var3 = (int)(this.field_N - sd.field_a.field_D);
                                    if (0 <= this.field_u) {
                                      break L37;
                                    } else {
                                      if (-5626 > (var2_int * var2_int + var3 * var3 ^ -1)) {
                                        this.field_u = this.b((byte) -119, this.field_Q);
                                        if (-3 != (this.field_J ^ -1)) {
                                          break L37;
                                        } else {
                                          this.field_u = this.field_u * 2;
                                          break L37;
                                        }
                                      } else {
                                        break L37;
                                      }
                                    }
                                  }
                                  this.field_u = this.field_u - 1;
                                  if (-1 != (this.field_u ^ -1)) {
                                    break L1;
                                  } else {
                                    this.d(param0 ^ -46);
                                    this.field_u = -1;
                                    if (var5 == 0) {
                                      break L1;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                                if (40 <= this.field_V % k.field_M[this.field_Q]) {
                                  break L1;
                                } else {
                                  if (-1 != (3 & (int)this.field_o ^ -1)) {
                                    break L1;
                                  } else {
                                    this.e(63);
                                    if (var5 == 0) {
                                      break L1;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                              }
                              L38: {
                                if (this.field_u >= 0) {
                                  break L38;
                                } else {
                                  if (this.field_V % 125 == 0) {
                                    this.field_u = this.b((byte) -128, this.field_Q);
                                    break L38;
                                  } else {
                                    break L38;
                                  }
                                }
                              }
                              L39: {
                                if (this.field_V % this.b((byte) -119, this.field_Q) != 0) {
                                  break L39;
                                } else {
                                  this.e(param0 ^ -19);
                                  break L39;
                                }
                              }
                              L40: {
                                this.field_u = this.field_u - 1;
                                if ((this.field_u ^ -1) == -1) {
                                  L41: {
                                    L42: {
                                      if (3 != this.field_J) {
                                        break L42;
                                      } else {
                                        L43: {
                                          if (0.5 <= Math.random()) {
                                            break L43;
                                          } else {
                                            this.d(0);
                                            if (var5 == 0) {
                                              break L41;
                                            } else {
                                              break L43;
                                            }
                                          }
                                        }
                                        this.g(param0 ^ 119);
                                        if (var5 == 0) {
                                          break L41;
                                        } else {
                                          break L42;
                                        }
                                      }
                                    }
                                    this.d(0);
                                    this.g(param0 + -31);
                                    break L41;
                                  }
                                  this.field_u = -1;
                                  break L40;
                                } else {
                                  break L40;
                                }
                              }
                              if (-11 < (this.field_V % 62 ^ -1)) {
                                this.k(0);
                                if (var5 == 0) {
                                  break L1;
                                } else {
                                  break L8;
                                }
                              } else {
                                break L1;
                              }
                            }
                            if (this.field_V % this.b((byte) -121, this.field_Q) != 0) {
                              break L1;
                            } else {
                              if (635.0 > this.field_o) {
                                this.e(63);
                                if (var5 == 0) {
                                  break L1;
                                } else {
                                  break L7;
                                }
                              } else {
                                break L1;
                              }
                            }
                          }
                          if (3 != this.field_J) {
                            break L1;
                          } else {
                            if (-1 != (this.field_V % this.b((byte) -125, this.field_Q) ^ -1)) {
                              break L1;
                            } else {
                              if (this.field_o >= 635.0) {
                                break L1;
                              } else {
                                this.e(param0 ^ -19);
                                if (var5 == 0) {
                                  break L1;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                        }
                        if ((double)(this.field_V % this.b((byte) -118, this.field_Q)) > 10.0 * cd.a((byte) 106)) {
                          break L5;
                        } else {
                          this.e(63);
                          break L5;
                        }
                      }
                      L44: {
                        if (-1 != (this.field_V % 300 ^ -1)) {
                          break L44;
                        } else {
                          this.d(0);
                          break L44;
                        }
                      }
                      L45: {
                        if (0 == this.field_V % this.b((byte) -127, this.field_Q)) {
                          this.e(param0 + 109);
                          break L45;
                        } else {
                          break L45;
                        }
                      }
                      this.k(0);
                      if (var5 == 0) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                    L46: {
                      if (-1 == (this.field_V % 300 ^ -1)) {
                        L47: {
                          if (Math.random() >= 0.5) {
                            break L47;
                          } else {
                            this.d(0);
                            if (var5 == 0) {
                              break L46;
                            } else {
                              break L47;
                            }
                          }
                        }
                        this.g(param0 ^ 13);
                        break L46;
                      } else {
                        break L46;
                      }
                    }
                    L48: {
                      if ((this.field_V % this.b((byte) -123, this.field_Q) ^ -1) >= -101) {
                        this.e(param0 ^ -19);
                        break L48;
                      } else {
                        break L48;
                      }
                    }
                    if ((this.field_V & 11 ^ -1) != -1) {
                      break L1;
                    } else {
                      if (0 == (1 & this.field_V >> 27463462)) {
                        this.k(0);
                        if (var5 == 0) {
                          break L1;
                        } else {
                          break L3;
                        }
                      } else {
                        break L1;
                      }
                    }
                  }
                  if ((this.field_V % 120 ^ -1) == -1) {
                    this.d(0);
                    if (var5 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  } else {
                    break L1;
                  }
                }
                if (!this.g((byte) -125)) {
                  break L1;
                } else {
                  if (0 != (1 & this.field_V)) {
                    break L1;
                  } else {
                    this.e(param0 + 109);
                    break L1;
                  }
                }
              }
              L49: {
                if (param0 == -46) {
                  break L49;
                } else {
                  this.field_J = 51;
                  break L49;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var2), "bf.J(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void j(int param0) {
        Object stackIn_49_0 = null;
        Object stackIn_51_0 = null;
        Object stackIn_52_0 = null;
        he stackIn_52_1 = null;
        int stackIn_143_0 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        he var2 = null;
        RuntimeException var2_ref = null;
        int var3_int = 0;
        double var3 = 0.0;
        int var4 = 0;
        int var5 = 0;
        double var5_double = 0.0;
        int var6_int = 0;
        Random var6 = null;
        double var7_double = 0.0;
        int var7 = 0;
        int var8_int = 0;
        he[] var8 = null;
        double var9_double = 0.0;
        int var9_int = 0;
        he var9 = null;
        int[] var10_ref_int__ = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (sd.field_e == 0) {
                            statePc = 14;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (this.field_s) {
                            statePc = 14;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (-1 < (ta.field_j[this.field_Q] ^ -1)) {
                            statePc = 14;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var2_int = 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (this.field_i.length <= var2_int) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        this.field_i[var2_int].a(param0 ^ 30217);
                        var2_int++;
                        if (var13 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var13 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (param0 == 30325) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 15: {
                    return;
                }
                case 16: {
                    try {
                        var2 = this.b((byte) 55);
                        if ((this.field_Q ^ -1) != -43) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (this.field_s) {
                            statePc = 53;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if ((this.field_Q ^ -1) == -63) {
                            statePc = 26;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (this.field_Q != 63) {
                            statePc = 53;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var3_int = (int)sd.field_a.field_N - -am.field_p;
                        var4 = (int)sd.field_a.field_D - -ri.field_q;
                        var5 = (int)(-this.field_o - (double)this.field_I + (double)var3_int);
                        var6_int = (int)((double)var4 - ((double)this.field_t + this.field_N));
                        var7_double = Math.atan2((double)var5, (double)var6_int) + 3.141592653589793;
                        var9_double = var7_double - 1.5707963267948966;
                        var11 = (int)(32.0 * (0.5 + var7_double / 6.283185307179586));
                        if (0 == this.field_J) {
                            statePc = 39;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (1 == this.field_J) {
                            statePc = 32;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (3.141592653589793 < var9_double) {
                            statePc = 38;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (0.0 > var9_double) {
                            statePc = 38;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var11 = 0;
                        if (var13 == 0) {
                            statePc = 48;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (3.141592653589793 <= var9_double) {
                            statePc = 48;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (0.0 < var9_double) {
                            statePc = 47;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var11 = 16;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var11 = (12 + var11) % 32;
                        stackIn_51_0 = this;
                        stackIn_49_0 = stackIn_51_0;
                        if ((this.field_Q ^ -1) == -63) {
                            statePc = 51;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        stackIn_52_0 = this;
                        stackIn_52_1 = jk.field_I[var11];
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        stackIn_52_0 = this;
                        stackIn_52_1 = lc.field_i[var11];
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        ((bf) (this)).field_D = stackIn_52_1;
                        this.field_p = -this.field_t + (int)this.field_N;
                        this.field_d = 20 + ((int)this.field_o + -this.field_I);
                        this.field_D.a(this.field_d, this.field_p);
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        this.a((byte) 58, var2);
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if ((this.field_Q ^ -1) == -46) {
                            statePc = 58;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (this.field_Q != 44) {
                            statePc = 81;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (this.field_s) {
                            statePc = 81;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var3 = 1.1764705882352942;
                        var5_double = var3 * 255.0 / this.i(param0 + -30232);
                        if (0.0 < var5_double) {
                            statePc = 64;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (var5_double > 1.0) {
                            statePc = 67;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        var5_double = 1.0;
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        var7 = (int)(var5_double * 128.0);
                        var8_int = (int)(64.0 * var5_double);
                        var9_int = (int)(255.0 * var5_double);
                        var10_ref_int__ = new int[128];
                        var11 = 0;
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (var11 >= 128) {
                            statePc = 74;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        var12 = (int)(Math.pow((double)var11, 1.5) / 8.0);
                        var10_ref_int__[var11] = li.a(li.a(var8_int * var12 >> 955301960 << 1607554952, var7 * var12 >> 573199560 << -4231600), var9_int * var12 >> -777792376);
                        var11++;
                        if (var13 != 0) {
                            statePc = 77;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (var13 == 0) {
                            statePc = 69;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (45 == this.field_Q) {
                            statePc = 77;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        wj.a((int)this.field_o - -this.field_I << -2002504060, (int)this.field_N - -41 << -1459260252, 1920, 126, var10_ref_int__);
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if (this.field_Q != 44) {
                            statePc = 81;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        wj.a(41 + (int)this.field_o << 1559008484, this.field_t + (int)this.field_N << 1310863940, 1920, 126, var10_ref_int__);
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        if ((this.b((byte) -123, this.field_Q) ^ -1) >= -1) {
                            statePc = 135;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        var3_int = this.b((byte) -121, this.field_Q) + -(this.field_V % this.b((byte) -123, this.field_Q));
                        var4 = -(255 * var3_int / this.b((byte) -122, this.field_Q)) + 255;
                        var6_int = this.field_Q;
                        if (var6_int == 5) {
                            statePc = 110;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        if (11 != var6_int) {
                            statePc = 89;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        if (var13 == 0) {
                            statePc = 110;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        if (17 != var6_int) {
                            statePc = 95;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        if (var13 == 0) {
                            statePc = 110;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        if (var6_int == 18) {
                            statePc = 110;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        if (-5 != (var6_int ^ -1)) {
                            statePc = 104;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        if (var13 == 0) {
                            statePc = 117;
                        } else {
                            statePc = 102;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        if (42 != var6_int) {
                            statePc = 135;
                        } else {
                            statePc = 105;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        statePc = 107;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        if (var13 == 0) {
                            statePc = 123;
                        } else {
                            statePc = 108;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        var6_int = 0;
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        if (var6_int >= this.field_L.length) {
                            statePc = 116;
                        } else {
                            statePc = 112;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        this.field_L[var6_int].c(-1);
                        var6_int++;
                        if (var13 != 0) {
                            statePc = 135;
                        } else {
                            statePc = 113;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        if (var13 == 0) {
                            statePc = 111;
                        } else {
                            statePc = 114;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        if (var13 == 0) {
                            statePc = 135;
                        } else {
                            statePc = 117;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        if (0 < this.field_c) {
                            statePc = 122;
                        } else {
                            statePc = 118;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        statePc = 135;
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        var3_int = this.field_c;
                        var4 = 255 - var3_int * 255 / this.b((byte) -128, this.field_Q);
                        wj.c((int)this.field_o - -this.field_I, this.field_t + (int)this.field_N, var3_int, 16777215, var4);
                        if (var13 == 0) {
                            statePc = 135;
                        } else {
                            statePc = 123;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        var5 = this.e((byte) 116);
                        if (var5 > 0) {
                            statePc = 126;
                        } else {
                            statePc = 124;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        statePc = 134;
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        var6 = new Random((long)(this.field_V / this.b((byte) -120, this.field_Q)));
                        var7 = hi.a(3, 4, var6);
                        if ((var7 ^ -1) != -1) {
                            statePc = 128;
                        } else {
                            statePc = 127;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        var8 = og.field_e;
                        if (var13 == 0) {
                            statePc = 133;
                        } else {
                            statePc = 128;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        if (-2 != (var7 ^ -1)) {
                            statePc = 132;
                        } else {
                            statePc = 129;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        statePc = 131;
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        var8 = oi.field_a;
                        if (var13 == 0) {
                            statePc = 133;
                        } else {
                            statePc = 132;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        var8 = cc.field_y;
                        statePc = 133;
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        var9 = var8[this.field_V / 5 % var8.length];
                        var10 = this.field_I + ((int)this.field_o - 5);
                        var11 = this.field_t + (int)this.field_N;
                        wj.e(var10, var11, 10, -var11 + 430, 61568, 0);
                        var9.a(var10, var11 + var5);
                        statePc = 134;
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        this.a((byte) 34, var2);
                        statePc = 135;
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        if (!this.h(-76)) {
                            statePc = 151;
                        } else {
                            statePc = 136;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        if (this.field_s) {
                            statePc = 151;
                        } else {
                            statePc = 137;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        statePc = 139;
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        var3 = (double)this.field_H / (double)ql.field_b[this.field_Q];
                        if (this.field_Q == 18) {
                            statePc = 142;
                        } else {
                            statePc = 140;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        stackIn_143_0 = 10;
                        statePc = 143;
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        stackIn_143_0 = 30;
                        statePc = 143;
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        var5 = stackIn_143_0;
                        if (2 == sd.field_e) {
                            statePc = 147;
                        } else {
                            statePc = 144;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        wj.d(160, var5, 320, 10, 16763951);
                        wj.f(161, 1 + var5, 318, 8, 16711680);
                        wj.f(161, 1 + var5, (int)(318.0 * var3), 8, 65280);
                        if (var13 == 0) {
                            statePc = 151;
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
                case 147: {
                    try {
                        wj.a(160, var5, 320, 10, 16763951, 127);
                        wj.d(161, 1 + var5, 318, 8, 16711680, 127);
                        wj.d(161, var5 + 1, (int)(var3 * 318.0), 8, 65280, 127);
                        statePc = 151;
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 150: {
                    var2_ref = (RuntimeException) ((Object) caughtException);
                    throw ie.a((Throwable) ((Object) var2_ref), "bf.V(" + param0 + ')');
                }
                case 151: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            if (param0 == 7769) {
              L1: {
                if (this.field_q != null) {
                  gi.a(this.field_q, 3408);
                  this.field_q.i(-1);
                  break L1;
                } else {
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var2), "bf.O(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            int var3 = 0;
            String var4 = null;
            java.net.URL var5 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            Throwable decompiledCaughtException = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var2 = param1.getDocumentBase().getFile();
                      var3 = var2.indexOf((int) (char)param0);
                      var4 = "reload.ws";
                      if (var3 >= 0) {
                        var4 = var4 + var2.substring(var3);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    var5 = new java.net.URL(param1.getCodeBase(), var4);
                    param1.getAppletContext().showDocument(kk.a(var5, param1, param0 + 4767936), "_self");
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var2_ref = (Exception) (Object) decompiledCaughtException;
                    var2_ref.printStackTrace();
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_11_0 = (RuntimeException) (var2_ref2);

                stackIn_11_1 = new StringBuilder().append("bf.K(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "null";
                  break L4;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "{...}";
                  break L4;
                }
              }
              throw ie.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void c(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 5) {
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  L5: {
                    L6: {
                      L7: {
                        L8: {
                          L9: {
                            L10: {
                              L11: {
                                var3 = this.field_Q;
                                if (var3 == 1) {
                                  break L11;
                                } else {
                                  L12: {
                                    if (-6 != (var3 ^ -1)) {
                                      break L12;
                                    } else {
                                      if (var4 == 0) {
                                        break L10;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                  if ((var3 ^ -1) == -12) {
                                    break L10;
                                  } else {
                                    if (-18 == (var3 ^ -1)) {
                                      break L10;
                                    } else {
                                      L13: {
                                        if (var3 != 18) {
                                          break L13;
                                        } else {
                                          if (var4 == 0) {
                                            break L10;
                                          } else {
                                            break L13;
                                          }
                                        }
                                      }
                                      if (var3 == 15) {
                                        break L9;
                                      } else {
                                        if (-17 == (var3 ^ -1)) {
                                          break L9;
                                        } else {
                                          if (var3 == 7) {
                                            break L9;
                                          } else {
                                            if ((var3 ^ -1) == -43) {
                                              break L8;
                                            } else {
                                              L14: {
                                                if (8 != var3) {
                                                  break L14;
                                                } else {
                                                  if (var4 == 0) {
                                                    break L7;
                                                  } else {
                                                    break L14;
                                                  }
                                                }
                                              }
                                              L15: {
                                                if (-10 != (var3 ^ -1)) {
                                                  break L15;
                                                } else {
                                                  if (var4 == 0) {
                                                    break L7;
                                                  } else {
                                                    break L15;
                                                  }
                                                }
                                              }
                                              if (var3 == 10) {
                                                break L7;
                                              } else {
                                                L16: {
                                                  if ((var3 ^ -1) != -3) {
                                                    break L16;
                                                  } else {
                                                    if (var4 == 0) {
                                                      break L6;
                                                    } else {
                                                      break L16;
                                                    }
                                                  }
                                                }
                                                if (3 == var3) {
                                                  break L5;
                                                } else {
                                                  L17: {
                                                    if ((var3 ^ -1) != -5) {
                                                      break L17;
                                                    } else {
                                                      if (var4 == 0) {
                                                        break L5;
                                                      } else {
                                                        break L17;
                                                      }
                                                    }
                                                  }
                                                  L18: {
                                                    if (-1 != (var3 ^ -1)) {
                                                      break L18;
                                                    } else {
                                                      if (var4 == 0) {
                                                        break L4;
                                                      } else {
                                                        break L18;
                                                      }
                                                    }
                                                  }
                                                  if (35 == var3) {
                                                    break L4;
                                                  } else {
                                                    if (var3 == 13) {
                                                      break L4;
                                                    } else {
                                                      if (-15 == (var3 ^ -1)) {
                                                        break L4;
                                                      } else {
                                                        if ((var3 ^ -1) == -47) {
                                                          break L4;
                                                        } else {
                                                          L19: {
                                                            if (-38 != (var3 ^ -1)) {
                                                              break L19;
                                                            } else {
                                                              if (var4 == 0) {
                                                                break L3;
                                                              } else {
                                                                break L19;
                                                              }
                                                            }
                                                          }
                                                          if ((var3 ^ -1) == -7) {
                                                            break L2;
                                                          } else {
                                                            if (-13 != (var3 ^ -1)) {
                                                              break L2;
                                                            } else {
                                                              if (var4 == 0) {
                                                                break L2;
                                                              } else {
                                                                break L11;
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              L20: {
                                var2_int = (int)(250.0 / cd.a((byte) 103));
                                if (var2_int > this.field_V) {
                                  break L20;
                                } else {
                                  this.field_g = (int)sd.field_a.field_N;
                                  this.field_M = (int)sd.field_a.field_D;
                                  this.field_P = 25;
                                  if (var4 == 0) {
                                    break L2;
                                  } else {
                                    break L20;
                                  }
                                }
                              }
                              this.field_g = this.field_m + hi.a(-(this.field_m * 4) + 640, 4, this.field_T);
                              this.field_M = hi.a(-this.field_O + 425, param0 + -1, this.field_T) + 5;
                              if (var4 == 0) {
                                break L2;
                              } else {
                                break L10;
                              }
                            }
                            this.field_g = hi.a(-this.field_m + 640, 4, this.field_T);
                            this.field_M = hi.a(-this.field_O + 425, 4, this.field_T) + 5;
                            if (!this.field_C) {
                              break L2;
                            } else {
                              L21: {
                                if ((this.field_Q ^ -1) == -19) {
                                  break L21;
                                } else {
                                  this.field_g = (640 + this.field_m) / 2;
                                  if (var4 == 0) {
                                    break L2;
                                  } else {
                                    break L21;
                                  }
                                }
                              }
                              this.field_g = (-this.field_m + 640) / 2;
                              if (var4 == 0) {
                                break L2;
                              } else {
                                break L9;
                              }
                            }
                          }
                          L22: {
                            if (-1 < (this.field_V ^ -1)) {
                              break L22;
                            } else {
                              this.field_g = hi.a(-this.field_m + 640, 4, this.field_T);
                              this.field_M = 5 - -hi.a(425 - this.field_O, param0 + -1, this.field_T);
                              if (var4 == 0) {
                                break L2;
                              } else {
                                break L22;
                              }
                            }
                          }
                          this.field_g = (int)this.field_o - (50 + -hi.a(100, 4, this.field_T));
                          this.field_M = 200;
                          if (var4 == 0) {
                            break L2;
                          } else {
                            break L8;
                          }
                        }
                        this.field_g = hi.a(640 - this.field_m, 4, this.field_T);
                        this.field_M = 5 - -hi.a(-this.field_O + 210, 4, this.field_T);
                        if (var4 == 0) {
                          break L2;
                        } else {
                          break L7;
                        }
                      }
                      this.field_g = 0;
                      this.field_M = hi.a(430 - this.field_O, 4, this.field_T);
                      if (hc.field_G != 2) {
                        break L2;
                      } else {
                        this.field_M = (int)sd.field_a.field_D;
                        if (var4 == 0) {
                          break L2;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L23: {
                      if ((hc.field_G ^ -1) >= (hi.a(3, 4, this.field_T) ^ -1)) {
                        break L23;
                      } else {
                        this.field_M = (int)sd.field_a.field_D + ri.field_q;
                        if (var4 == 0) {
                          break L2;
                        } else {
                          break L23;
                        }
                      }
                    }
                    this.field_M = hi.a(-this.field_O + 425, 4, this.field_T) + 5;
                    if (var4 == 0) {
                      break L2;
                    } else {
                      break L5;
                    }
                  }
                  this.field_M = (int)sd.field_a.field_D;
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L4;
                  }
                }
                this.field_M = (int)this.field_N;
                this.field_g = -this.field_m;
                this.field_j = 0.0;
                if (var4 == 0) {
                  break L2;
                } else {
                  break L3;
                }
              }
              this.field_M = (int)sd.field_a.field_D;
              this.field_g = (int)sd.field_a.field_N;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var2), "bf.AA(" + param0 + ')');
        }
    }

    private final void k(int param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        double var2_double = 0.0;
        RuntimeException var2 = null;
        double var4 = 0.0;
        double var6 = 0.0;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        double var19 = 0.0;
        double var21 = 0.0;
        int var23 = 0;
        int var24 = 0;
        var24 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_double = (double)(int)(this.field_o + (double)this.field_I);
              var4 = (double)(int)(this.field_N + (double)this.field_t);
              var6 = -10.0;
              var8 = (double)((int)this.field_j / 4);
              var14 = 22.0;
              var16 = -1;
              if (param0 == 0) {
                break L1;
              } else {
                this.field_I = -61;
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  L5: {
                    L6: {
                      var23 = this.field_Q;
                      if (-1 != (var23 ^ -1)) {
                        break L6;
                      } else {
                        if (var24 == 0) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    if ((var23 ^ -1) == -36) {
                      break L5;
                    } else {
                      L7: {
                        if (var23 != 5) {
                          break L7;
                        } else {
                          if (var24 == 0) {
                            break L4;
                          } else {
                            break L7;
                          }
                        }
                      }
                      L8: {
                        if (11 != var23) {
                          break L8;
                        } else {
                          if (var24 == 0) {
                            break L3;
                          } else {
                            break L8;
                          }
                        }
                      }
                      L9: {
                        if ((var23 ^ -1) != -18) {
                          break L9;
                        } else {
                          if (var24 == 0) {
                            var16 = 18;
                            var10 = (double)this.field_V / 100.0;
                            var12 = var10 + 3.141592653589793;
                            var10 = var10 + (double)hi.a(10, 4, this.field_T) / 30.0;
                            var12 = var12 + (double)hi.a(10, param0 ^ 4, this.field_T) / 30.0;
                            sd.field_a.a(24, new gf(var16, -60.0 + var2_double, var4, ji.a(param0 ^ 65535, var10) * var14, var14 * pj.a(var10, 32768), -10.0, this.field_N));
                            sd.field_a.a(24, new gf(var16, 60.0 + var2_double, var4, var14 * ji.a(65535, var12), var14 * pj.a(var12, param0 ^ 32768), -10.0, this.field_N));
                            sd.field_a.a(24, new gf(var16, var2_double - 60.0, var4, ji.a(65535, var10) * -var14, pj.a(var10, 32768) * var14, -10.0, this.field_N));
                            sd.field_a.a(24, new gf(var16, 60.0 + var2_double, var4, ji.a(65535, var12) * -var14, pj.a(var12, 32768) * var14, -10.0, this.field_N));
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            break L9;
                          }
                        }
                      }
                      if (var23 == 18) {
                        var16 = 18;
                        var6 = -var2_double + ((double)am.field_p + sd.field_a.field_N);
                        var4 = (double)(int)(this.field_N + 127.0);
                        var8 = -var4 + (sd.field_a.field_D + (double)ri.field_q);
                        var21 = Math.sqrt(var6 * var6 + var8 * var8);
                        var6 = var6 / var21;
                        var8 = var8 / var21;
                        var8 = var8 * 22.0;
                        var6 = var6 * 22.0;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var16 = 12;
                  var17 = (int)sd.field_a.field_N + am.field_p;
                  var18 = ri.field_q + (int)sd.field_a.field_D;
                  var8 = (double)(int)((double)var18 - ((double)this.field_t + this.field_N));
                  var6 = (double)(int)((double)var17 - (this.field_o + (double)this.field_I));
                  var19 = Math.sqrt(var6 * var6 + var8 * var8);
                  var8 = var8 / var19;
                  var6 = var6 / var19;
                  var6 = var6 * 5.0;
                  var8 = var8 * 5.0;
                  var2_double = var2_double + 5.0;
                  var4 = var4 - 80.0;
                  var8 = var8 - 2.0;
                  if (var24 == 0) {
                    break L2;
                  } else {
                    break L4;
                  }
                }
                var16 = 6;
                var6 = -1.0;
                var8 = 0.0;
                if (var24 == 0) {
                  break L2;
                } else {
                  break L3;
                }
              }
              var10 = (double)this.field_V / 10.0;
              var16 = 18;
              var10 = var10 + 1.5707963267948966;
              sd.field_a.a(24, new gf(var16, var2_double - 60.0, var4, var14 * ji.a(65535, var10), pj.a(var10, 32768) * var14, -10.0, this.field_N));
              sd.field_a.a(24, new gf(var16, 60.0 + var2_double, var4, ji.a(65535, -var10) * var14, pj.a(-var10, 32768) * var14, -10.0, this.field_N));
              decompiledRegionSelector0 = 0;
              break L0;
            }
            L10: {
              if (var16 == -1) {
                break L10;
              } else {
                sd.field_a.a(24, new gf(var16, var2_double, var4, var6, var8, -10.0, this.field_N));
                break L10;
              }
            }
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var2), "bf.R(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    private final int a(byte param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 79) {
              stackIn_4_0 = (int)(100.0 / cd.a((byte) 72));
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -10;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var3), "bf.BA(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final void e(int param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        double var2_double = 0.0;
        RuntimeException var2 = null;
        double var4 = 0.0;
        double var6 = 0.0;
        double var8 = 0.0;
        double var10 = 0.0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        double var15 = 0.0;
        double var17 = 0.0;
        double var19 = 0.0;
        double var21 = 0.0;
        int var23 = 0;
        int var24 = 0;
        var24 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            if (0 <= this.field_V) {
              L1: {
                var4 = (double)this.field_I + this.field_o;
                if (param0 == 63) {
                  break L1;
                } else {
                  this.k(45);
                  break L1;
                }
              }
              L2: {
                L3: {
                  L4: {
                    L5: {
                      L6: {
                        L7: {
                          L8: {
                            L9: {
                              L10: {
                                var6 = (double)this.field_t + this.field_N;
                                var8 = -10.0;
                                var10 = this.field_j / 4.0;
                                var12 = bb.field_h[this.field_Q];
                                var13 = (int)sd.field_a.field_N + am.field_p;
                                var14 = (int)sd.field_a.field_D - -ri.field_q;
                                var15 = Math.atan2((double)var14 - var6, (double)var13 - var4);
                                var23 = this.field_Q;
                                if (-48 == (var23 ^ -1)) {
                                  var8 = var8 * -1.0;
                                  if (var24 == 0) {
                                    break L2;
                                  } else {
                                    break L10;
                                  }
                                } else {
                                  if ((var23 ^ -1) == -1) {
                                    break L10;
                                  } else {
                                    if (var23 == 35) {
                                      break L9;
                                    } else {
                                      if (var23 == 12) {
                                        break L8;
                                      } else {
                                        if ((var23 ^ -1) == -6) {
                                          break L7;
                                        } else {
                                          if ((var23 ^ -1) == -12) {
                                            break L7;
                                          } else {
                                            if (-18 == (var23 ^ -1)) {
                                              break L7;
                                            } else {
                                              L11: {
                                                if (var23 != 18) {
                                                  break L11;
                                                } else {
                                                  if (var24 == 0) {
                                                    break L6;
                                                  } else {
                                                    break L11;
                                                  }
                                                }
                                              }
                                              if (var23 == 43) {
                                                break L5;
                                              } else {
                                                if ((var23 ^ -1) == -63) {
                                                  break L5;
                                                } else {
                                                  if (-14 == (var23 ^ -1)) {
                                                    break L4;
                                                  } else {
                                                    L12: {
                                                      if (-15 != (var23 ^ -1)) {
                                                        break L12;
                                                      } else {
                                                        if (var24 == 0) {
                                                          break L4;
                                                        } else {
                                                          break L12;
                                                        }
                                                      }
                                                    }
                                                    L13: {
                                                      if (16 != var23) {
                                                        break L13;
                                                      } else {
                                                        if (var24 == 0) {
                                                          break L4;
                                                        } else {
                                                          break L13;
                                                        }
                                                      }
                                                    }
                                                    L14: {
                                                      if ((var23 ^ -1) != -43) {
                                                        break L14;
                                                      } else {
                                                        if (var24 == 0) {
                                                          break L4;
                                                        } else {
                                                          break L14;
                                                        }
                                                      }
                                                    }
                                                    if (var23 == 63) {
                                                      break L3;
                                                    } else {
                                                      L15: {
                                                        L16: {
                                                          L17: {
                                                            if ((var23 ^ -1) == -16) {
                                                              break L17;
                                                            } else {
                                                              L18: {
                                                                if (-39 != (var23 ^ -1)) {
                                                                  break L18;
                                                                } else {
                                                                  if (var24 == 0) {
                                                                    break L17;
                                                                  } else {
                                                                    break L18;
                                                                  }
                                                                }
                                                              }
                                                              if (-41 == (var23 ^ -1)) {
                                                                break L16;
                                                              } else {
                                                                if (45 == var23) {
                                                                  break L15;
                                                                } else {
                                                                  if ((var23 ^ -1) == -45) {
                                                                    break L15;
                                                                  } else {
                                                                    break L2;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                          var8 = sd.field_a.field_N - this.field_o;
                                                          var10 = sd.field_a.field_D - this.field_N;
                                                          var21 = Math.atan2(var8, var10);
                                                          var21 = var21 + (Math.random() - 0.5) / 32.0;
                                                          var8 = ji.a(65535, var21) * 15.0;
                                                          var10 = pj.a(var21, param0 ^ 32831) * 15.0;
                                                          if (var24 == 0) {
                                                            break L2;
                                                          } else {
                                                            break L16;
                                                          }
                                                        }
                                                        var10 = 0.0;
                                                        var8 = 0.0;
                                                        this.field_b = new gf(var12, var4, var6, 0.0, 0.0, (double)am.field_p + sd.field_a.field_N, sd.field_a.field_D + (double)ri.field_q);
                                                        sd.field_a.a(24, this.field_b);
                                                        if (var24 == 0) {
                                                          break L2;
                                                        } else {
                                                          break L15;
                                                        }
                                                      }
                                                      L19: {
                                                        if (sd.field_a.field_fb < 0) {
                                                          L20: {
                                                            L21: {
                                                              if (45 != this.field_Q) {
                                                                break L21;
                                                              } else {
                                                                var6 = 41.0 + this.field_N;
                                                                if (var24 == 0) {
                                                                  break L20;
                                                                } else {
                                                                  break L21;
                                                                }
                                                              }
                                                            }
                                                            if (44 == this.field_Q) {
                                                              var4 = 41.0 + this.field_o;
                                                              break L20;
                                                            } else {
                                                              break L20;
                                                            }
                                                          }
                                                          this.field_b = new gf(var12, var4, var6, 0.0, 0.0, sd.field_a.field_N + (double)am.field_p, sd.field_a.field_D + (double)ri.field_q);
                                                          this.field_b.field_l = this.field_V;
                                                          sd.field_a.a(-2 + sd.field_a.field_gb, param0 + -63);
                                                          sd.field_a.a(24, this.field_b);
                                                          break L19;
                                                        } else {
                                                          break L19;
                                                        }
                                                      }
                                                      decompiledRegionSelector0 = 6;
                                                      break L0;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              var8 = (Math.random() + 2.0) * -2.0;
                              var10 = (Math.random() + 1.0) * 2.0;
                              var6 = var6 - 23.0;
                              var4 = var4 - 39.0;
                              if (var24 == 0) {
                                break L2;
                              } else {
                                break L9;
                              }
                            }
                            var8 = 2.0 * (2.0 + Math.random());
                            var4 = var4 + 39.0;
                            var10 = (1.0 + Math.random()) * 2.0;
                            var6 = var6 - 23.0;
                            if (var24 == 0) {
                              break L2;
                            } else {
                              break L8;
                            }
                          }
                          var8 = -1.0 + (-0.5 + Math.random());
                          var10 = Math.random() - 0.5 + -5.0;
                          if (var24 == 0) {
                            break L2;
                          } else {
                            break L7;
                          }
                        }
                        L22: {
                          if (-6 == (this.field_Q ^ -1)) {
                            this.field_j = 0.0;
                            this.field_M = (int)this.field_N;
                            this.field_g = (int)this.field_o;
                            this.field_l = -1.0;
                            break L22;
                          } else {
                            break L22;
                          }
                        }
                        var8 = 0.0;
                        var10 = 0.0;
                        this.field_G = (int)(aa.field_c[this.field_Q] - 128.0);
                        if (var24 == 0) {
                          break L2;
                        } else {
                          break L6;
                        }
                      }
                      var8 = (double)(-(15 - -hi.a(5, 4, this.field_T)));
                      var10 = (double)(hi.a(40, 4, this.field_T) + -20);
                      var4 = var4 + (double)(hi.a(100, 4, this.field_T) + -50);
                      this.field_G = (int)(aa.field_c[this.field_Q] - 128.0);
                      if (var24 == 0) {
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                    L23: {
                      if (0 != this.field_J) {
                        break L23;
                      } else {
                        if (var15 >= 3.141592653589793) {
                          break L23;
                        } else {
                          if (0.0 < var15) {
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            break L23;
                          }
                        }
                      }
                    }
                    if (this.field_J != 1) {
                      break L4;
                    } else {
                      L24: {
                        if (var15 > 3.141592653589793) {
                          break L24;
                        } else {
                          if (var15 < 0.0) {
                            break L24;
                          } else {
                            break L4;
                          }
                        }
                      }
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                  L25: {
                    var10 = (double)(int)((double)var14 - ((double)this.field_t + this.field_N));
                    var8 = (double)(int)((double)var13 - ((double)this.field_I + this.field_o));
                    var2_double = Math.sqrt(var8 * var8 + var10 * var10);
                    var8 = var8 / var2_double;
                    var10 = var10 / var2_double;
                    var8 = var8 * 5.0;
                    var10 = var10 * 5.0;
                    if (this.field_Q == 13) {
                      break L25;
                    } else {
                      if (-63 != (this.field_Q ^ -1)) {
                        break L2;
                      } else {
                        var4 = var4 + 12.0 * var8;
                        var4 = var4 + 15.0;
                        var6 = var6 + 12.0 * var10;
                        if (var24 == 0) {
                          break L2;
                        } else {
                          break L25;
                        }
                      }
                    }
                  }
                  var10 = var10 - 2.0;
                  if (var24 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
                L26: {
                  if (0 != this.field_J) {
                    break L26;
                  } else {
                    if (var15 >= 3.141592653589793) {
                      break L26;
                    } else {
                      if (var15 > 0.0) {
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        break L26;
                      }
                    }
                  }
                }
                L27: {
                  if ((this.field_J ^ -1) != -2) {
                    break L27;
                  } else {
                    L28: {
                      if (var15 > 3.141592653589793) {
                        break L28;
                      } else {
                        if (0.0 <= var15) {
                          break L27;
                        } else {
                          break L28;
                        }
                      }
                    }
                    decompiledRegionSelector0 = 4;
                    break L0;
                  }
                }
                var10 = (double)(int)((double)var14 - ((double)this.field_t + this.field_N));
                var8 = (double)(int)(-this.field_o - (double)this.field_I + (double)var13);
                var2_double = Math.sqrt(var8 * var8 + var10 * var10);
                var10 = var10 / var2_double;
                var8 = var8 / var2_double;
                var10 = var10 * 5.0;
                var8 = var8 * 5.0;
                var4 = var4 + 7.0 * var8;
                var17 = var10 * 3.0;
                var6 = var6 + 7.0 * var10;
                var19 = -3.0 * var8;
                var4 = var4 - var17 / 2.0;
                var6 = var6 - var19 / 2.0;
                sd.field_a.a(24, new gf(var12, var4, var6, var8, var10, -10.0, var6, 2));
                sd.field_a.a(param0 ^ 39, new gf(var12, var4 + var17, var6 + var19, var8, var10, -10.0, var6, 2));
                sd.field_a.a(param0 + -39, new gf(var12, -var17 + var4, var6 - var19, var8, var10, -10.0, var6, 2));
                decompiledRegionSelector0 = 5;
                break L0;
              }
              sd.field_a.a(24, new gf(var12, var4, var6, var8, var10, -10.0, var6));
              decompiledRegionSelector0 = 7;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var2), "bf.M(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
            }
          }
        }
    }

    final boolean a(int param0, int param1) {
        int discarded$0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_14_0 = 0;
        Object stackIn_16_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        boolean stackIn_52_0 = false;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        bf var4 = null;
        double var5 = 0.0;
        double var7 = 0.0;
        int var9 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (!wh.field_v[this.field_Q]) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = 0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0 != 0;
                }
                case 4: {
                    try {
                        if (param1 == 10) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        discarded$0 = this.f((byte) -7);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (-1 <= (sd.field_a.field_fb ^ -1)) {
                            statePc = 15;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (this.h(-78)) {
                            statePc = 13;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackIn_14_0 = 0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 14: {
                    return stackIn_14_0 != 0;
                }
                case 15: {
                    try {
                        this.field_A = true;
                        this.field_H = this.field_H - param0;
                        stackIn_18_0 = this;
                        stackIn_16_0 = stackIn_18_0;
                        if ((this.field_H ^ -1) <= -1) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackIn_19_0 = this;
                        stackIn_19_1 = 1;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackIn_19_0 = this;
                        stackIn_19_1 = 0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        ((bf) (this)).field_s = stackIn_19_1 != 0;
                        if (this.field_s) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if ((ga.field_j[this.field_Q] ^ -1) != 0) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var3_int = e.a(param1 + 104, this.field_I + (int)this.field_o);
                        if (-70 != (ga.field_j[this.field_Q] ^ -1)) {
                            statePc = 28;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        th.a(-27610, 48, var3_int, nl.field_r[ga.field_j[this.field_Q]]);
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (-10 != (this.field_Q ^ -1)) {
                            statePc = 37;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var3_int = 0;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if ((var3_int ^ -1) <= -5) {
                            statePc = 36;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var4 = sd.field_a.a((int)(this.field_N + (double)(this.field_t / 2)), true, 8, (int)(this.field_o + (double)(this.field_I / 2)), 0, true);
                        var5 = (1.0 + Math.random()) / 2.0;
                        var7 = Math.random() * 6.283185307179586;
                        var4.field_l = this.field_l + var5 * ji.a(65535, var7);
                        var4.field_j = this.field_j + var5 * pj.a(var7, 32768);
                        var3_int++;
                        if (var9 != 0) {
                            statePc = 46;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (var9 == 0) {
                            statePc = 31;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (var9 == 0) {
                            statePc = 46;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (this.field_Q != 10) {
                            statePc = 46;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var3_int = 0;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (var3_int >= 2) {
                            statePc = 46;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var4 = sd.field_a.a((int)(this.field_N + (double)(this.field_t / 2)), true, 9, (int)(this.field_o + (double)(this.field_I / 2)), 0, true);
                        var5 = (1.0 + Math.random()) / 2.0;
                        var7 = Math.random() * 6.283185307179586;
                        var4.field_l = this.field_l + var5 * ji.a(param1 + 65525, var7);
                        var4.field_j = this.field_j + pj.a(var7, 32768) * var5;
                        var3_int++;
                        if (var9 != 0) {
                            statePc = 49;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (var9 == 0) {
                            statePc = 41;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (th.field_d[this.field_Q]) {
                            statePc = 49;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        this.field_f = this.b((byte) 55).b();
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        this.field_l = -1.0;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        stackIn_52_0 = this.field_s;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 52: {
                    return stackIn_52_0;
                }
                case 53: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    throw ie.a((Throwable) ((Object) var3), "bf.N(" + param0 + ',' + param1 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static String a(long param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ae.field_ib.setTime(new Date(param0));
              var3_int = ae.field_ib.get(7);
              var4 = ae.field_ib.get(5);
              var5 = ae.field_ib.get(2);
              var6 = ae.field_ib.get(1);
              var7 = ae.field_ib.get(11);
              var8 = ae.field_ib.get(12);
              if (param1 == -29) {
                break L1;
              } else {
                bf.a(29, (java.applet.Applet) null);
                break L1;
              }
            }
            var9 = ae.field_ib.get(13);
            stackIn_4_0 = nf.field_q[var3_int - 1] + ", " + var4 / 10 + var4 % 10 + "-" + ka.field_j[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var3), "bf.U(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final he b(byte param0) {
        he stackIn_32_0 = null;
        he stackIn_34_0 = null;
        he stackIn_37_0 = null;
        he stackIn_40_0 = null;
        he stackIn_42_0 = null;
        he stackIn_54_0 = null;
        he stackIn_60_0 = null;
        he stackIn_62_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 55) {
                break L1;
              } else {
                this.field_V = -10;
                break L1;
              }
            }
            L2: {
              var2_int = this.field_Q;
              if (48 == var2_int) {
                break L2;
              } else {
                if ((var2_int ^ -1) == -50) {
                  break L2;
                } else {
                  L3: {
                    if (-51 != (var2_int ^ -1)) {
                      break L3;
                    } else {
                      if (!DrPhlogistonSavesTheEarth.field_D) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (51 == var2_int) {
                    break L2;
                  } else {
                    if (52 == var2_int) {
                      break L2;
                    } else {
                      if (53 == var2_int) {
                        break L2;
                      } else {
                        L4: {
                          if ((var2_int ^ -1) == -46) {
                            break L4;
                          } else {
                            if (var2_int == 44) {
                              break L4;
                            } else {
                              L5: {
                                if (!this.field_s) {
                                  break L5;
                                } else {
                                  L6: {
                                    if (this.field_z > 25) {
                                      break L6;
                                    } else {
                                      if (sd.field_e != 2) {
                                        break L6;
                                      } else {
                                        if (1 <= g.field_s[this.field_Q]) {
                                          break L5;
                                        } else {
                                          break L6;
                                        }
                                      }
                                    }
                                  }
                                  stackIn_54_0 = this.field_n[this.field_E % this.field_n.length];
                                  decompiledRegionSelector0 = 5;
                                  break L0;
                                }
                              }
                              L7: {
                                if (this.field_Q != 12) {
                                  break L7;
                                } else {
                                  if (2 == this.field_J) {
                                    stackIn_62_0 = ib.field_j[this.field_E % ib.field_j.length];
                                    decompiledRegionSelector0 = 7;
                                    break L0;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                              stackIn_60_0 = this.field_F[this.field_E % this.field_F.length];
                              decompiledRegionSelector0 = 6;
                              break L0;
                            }
                          }
                        }
                        if (!this.field_s) {
                          if (!this.g((byte) -78)) {
                            stackIn_42_0 = sh.field_c[this.field_Q][0];
                            decompiledRegionSelector0 = 4;
                            break L0;
                          } else {
                            stackIn_40_0 = sh.field_c[this.field_Q][1];
                            decompiledRegionSelector0 = 3;
                            break L0;
                          }
                        } else {
                          stackIn_37_0 = this.field_n[0];
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    }
                  }
                }
              }
            }
            if (!this.field_s) {
              stackIn_34_0 = this.field_F[this.field_J % this.field_F.length];
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_32_0 = this.field_n[this.field_J % this.field_n.length];
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var2), "bf.S(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_32_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_34_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_37_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_40_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_42_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_54_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_60_0;
                    } else {
                      return stackIn_62_0;
                    }
                  }
                }
              }
            }
          }
        }
    }

    private final int b(byte param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 <= -117) {
              stackIn_4_0 = (int)((double)k.field_M[param1] / cd.a((byte) 116));
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -23;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var3), "bf.I(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final double i(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        double stackIn_2_0 = 0.0;
        double stackIn_4_0 = 0.0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = -32 / ((28 - param0) / 32);
            if (sd.field_a == null) {
              stackIn_4_0 = -1.0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = dl.a(true, this.field_o - sd.field_a.field_N, -sd.field_a.field_D + this.field_N);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var2), "bf.DA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void b(int param0) {
        try {
            if (param0 != 128) {
                field_h = (bg) null;
            }
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "bf.E(" + param0 + ')');
        }
    }

    private final void g(int param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            if (0.0 > this.field_o) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              this.field_a = this.field_a - 1;
              if ((this.field_a ^ -1) < -1) {
                L1: {
                  if (param0 < -20) {
                    break L1;
                  } else {
                    this.field_W = -93;
                    break L1;
                  }
                }
                L2: {
                  L3: {
                    L4: {
                      var2_int = -1;
                      var3 = this.field_Q;
                      if (-12 != (var3 ^ -1)) {
                        break L4;
                      } else {
                        if (var4 == 0) {
                          L5: {
                            L6: {
                              if ((this.field_J ^ -1) == -3) {
                                break L6;
                              } else {
                                if ((this.field_J ^ -1) != -4) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            sd.field_a.a((int)(this.field_N + (double)this.field_t), true, 9, (int)((double)this.field_I + this.field_o), 0, true);
                            break L5;
                          }
                          var2_int = 36;
                          if (var4 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        } else {
                          break L4;
                        }
                      }
                    }
                    if (-19 == (var3 ^ -1)) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                  var2_int = 64;
                  sd.field_a.a((int)((double)this.field_t + this.field_N), true, 4, (int)((double)this.field_I + this.field_o), 0, true);
                  break L2;
                }
                L7: {
                  if (var2_int == -1) {
                    break L7;
                  } else {
                    th.a(-27610, 32, e.a(112, (int)this.field_o), nl.field_r[var2_int]);
                    break L7;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var2), "bf.T(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    private final void a(byte param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        double var3 = 0.0;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        var12 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var2_int = 15 % ((param0 - -90) / 33);
                if (!this.field_C) {
                  break L2;
                } else {
                  var7 = 4.0 * oi.field_b[this.field_Q];
                  var5 = 4.0 * ff.field_N[this.field_Q];
                  var3 = 3.0 * vh.field_a[this.field_Q];
                  if (var12 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var7 = oi.field_b[this.field_Q];
              var5 = ff.field_N[this.field_Q];
              var3 = vh.field_a[this.field_Q];
              break L1;
            }
            var11 = this.field_Q;
            if ((var11 ^ -1) == -2) {
              this.field_l = 0.0;
              this.field_j = 0.0;
              this.field_o = -(0.5 * (double)this.field_e * oi.field_b[this.field_Q]) + (double)(640 + this.field_m);
              this.field_N = 100.0 + 75.0 * ji.a(65535, (double)this.field_e / 18.0);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (var11 == 38) {
                this.field_j = 0.0;
                this.field_l = 0.0;
                this.field_o = (double)(-(this.field_e / 2) + this.field_m - -640 - -160) - 150.0 * ji.a(65535, (double)this.field_e / 60.0);
                this.field_N = 100.0 + ji.a(65535, (double)this.field_e / 18.0) * 75.0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L3: {
                  L4: {
                    L5: {
                      if ((var11 ^ -1) != -43) {
                        break L5;
                      } else {
                        if (var12 == 0) {
                          L6: {
                            if (0 == this.field_V % this.b((byte) -125, this.field_Q)) {
                              this.field_j = 0.0;
                              this.field_G = 0;
                              this.field_l = -1.0;
                              this.field_g = (int)this.field_o;
                              this.field_M = (int)this.field_N;
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          L7: {
                            var9 = (double)(this.field_V % this.b((byte) -124, this.field_Q)) / ((double)this.b((byte) -123, this.field_Q) * 0.5);
                            if (0.0 < -var9 + 1.0) {
                              break L7;
                            } else {
                              if ((double)this.field_P <= -this.field_o + (double)this.field_g) {
                                break L3;
                              } else {
                                if ((double)this.field_M - this.field_N < (double)this.field_P) {
                                  this.c(5);
                                  if (var12 == 0) {
                                    break L3;
                                  } else {
                                    break L7;
                                  }
                                } else {
                                  break L3;
                                }
                              }
                            }
                          }
                          this.field_l = 0.0;
                          this.field_o = this.field_o - 1.0;
                          if (var12 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        } else {
                          break L5;
                        }
                      }
                    }
                    L8: {
                      if (var11 != 39) {
                        break L8;
                      } else {
                        if (var12 == 0) {
                          break L4;
                        } else {
                          break L8;
                        }
                      }
                    }
                    if (40 == var11) {
                      L9: {
                        if ((this.field_e ^ -1) == -2) {
                          this.field_N = (double)(-this.field_O);
                          this.field_o = (double)(-(this.f((byte) 118) * 100) + 570);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      this.field_l = 0.0;
                      this.field_j = var5;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  this.field_j = 0.0;
                  this.field_o = -(var7 * (double)this.field_e) + (double)(this.field_m - -640);
                  this.field_l = 0.0;
                  this.field_N = ji.a(65535, (double)this.field_e / 24.0) * 75.0 + 100.0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
                this.field_l = this.field_l - this.field_l / 10.0;
                this.field_j = this.field_j - this.field_j / 10.0;
                if (this.field_s) {
                  this.field_j = this.field_j + var3;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  L10: {
                    L11: {
                      if (Math.abs((double)(-this.field_g) + this.field_o) >= (double)this.field_P) {
                        break L11;
                      } else {
                        if (Math.abs(this.field_N - (double)this.field_M) >= (double)this.field_P) {
                          break L11;
                        } else {
                          L12: {
                            if (aa.field_c[this.field_Q] > (double)this.field_G) {
                              break L12;
                            } else {
                              this.field_G = 0;
                              this.field_l = -1.0;
                              this.field_j = 0.0;
                              this.c(5);
                              if (var12 == 0) {
                                break L10;
                              } else {
                                break L12;
                              }
                            }
                          }
                          this.field_G = this.field_G + 1;
                          if (var12 == 0) {
                            break L10;
                          } else {
                            break L11;
                          }
                        }
                      }
                    }
                    L13: {
                      L14: {
                        if ((double)this.field_g >= this.field_o) {
                          break L14;
                        } else {
                          L15: {
                            if (-var7 < this.field_l) {
                              this.field_l = this.field_l - var3;
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          if (this.field_l < -var7) {
                            this.field_l = -var7;
                            if (var12 == 0) {
                              break L13;
                            } else {
                              break L14;
                            }
                          } else {
                            break L13;
                          }
                        }
                      }
                      L16: {
                        if (var7 > this.field_l) {
                          this.field_l = this.field_l + var3;
                          break L16;
                        } else {
                          break L16;
                        }
                      }
                      if (this.field_l <= var7) {
                        break L13;
                      } else {
                        this.field_l = var7;
                        break L13;
                      }
                    }
                    L17: {
                      if ((double)this.field_M >= this.field_N) {
                        break L17;
                      } else {
                        L18: {
                          if (this.field_j <= -var5) {
                            break L18;
                          } else {
                            this.field_j = this.field_j - var3;
                            break L18;
                          }
                        }
                        if (-var5 <= this.field_j) {
                          break L10;
                        } else {
                          this.field_j = -var5;
                          if (var12 == 0) {
                            break L10;
                          } else {
                            break L17;
                          }
                        }
                      }
                    }
                    L19: {
                      if (var5 > this.field_j) {
                        this.field_j = this.field_j + var3;
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                    if (var5 < this.field_j) {
                      this.field_j = var5;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  decompiledRegionSelector0 = 4;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var2), "bf.P(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    bf(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        int statePc = 0;
        Throwable caughtException = null;
        int var7_int = 0;
        he var7 = null;
        RuntimeException var7_ref = null;
        double var8 = 0.0;
        int var10 = 0;
        int var11 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
                    this.field_s = false;
                    this.field_L = new ck[4];
                    this.field_a = 200;
                    this.field_A = false;
                    this.field_u = -1;
                    this.field_R = 0;
                    this.field_c = 0;
                    this.field_i = new hi[1];
                    this.field_D = null;
                    this.field_K = 0;
                    this.field_U = 0;
                    this.field_z = 0;
                    this.field_f = null;
                    this.field_E = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_B = param2;
                        this.field_T = new Random((long)this.field_B);
                        this.field_J = param1;
                        this.field_k = param3;
                        this.field_W = param4;
                        this.field_Q = param0;
                        this.field_Q = param0;
                        this.field_H = ql.field_b[this.field_Q];
                        this.field_w = o.field_k[this.field_Q];
                        if (this.field_Q != 12) {
                            statePc = 6;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (0.333 <= Math.random()) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        this.field_V = 0;
                        if (var11 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (k.field_M[this.field_Q] != 0) {
                            statePc = 12;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        this.field_V = 0;
                        if (var11 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        this.field_V = hi.a(k.field_M[this.field_Q], 4, this.field_T);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var7_int = this.field_Q;
                        if (64 != var7_int) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var11 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (-63 == (var7_int ^ -1)) {
                            statePc = 30;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (Math.random() > 0.5) {
                            statePc = 27;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        this.field_n = bh.field_e;
                        this.field_F = ad.field_v;
                        if (var11 == 0) {
                            statePc = 41;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        this.field_F = sh.field_c[this.field_Q];
                        this.field_n = vj.field_g[this.field_Q];
                        if (var11 == 0) {
                            statePc = 41;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if ((this.field_J ^ -1) != -1) {
                            statePc = 36;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        this.field_F = sh.field_c[this.field_Q];
                        this.field_n = vj.field_g[this.field_Q];
                        if (var11 == 0) {
                            statePc = 41;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        this.field_F = bh.field_b;
                        this.field_n = tl.field_I;
                        if (var11 == 0) {
                            statePc = 41;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        this.field_F = sh.field_c[this.field_Q];
                        this.field_n = vj.field_g[this.field_Q];
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var7 = this.b((byte) 55);
                        this.field_t = var7.field_k / 2 - -var7.field_f;
                        this.field_I = var7.field_d / 2 - -var7.field_a;
                        this.field_O = var7.field_c;
                        this.field_m = var7.field_h;
                        if (4 == this.field_Q) {
                            statePc = 48;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (-4 == (this.field_Q ^ -1)) {
                            statePc = 48;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        this.field_P = field_S[this.field_Q];
                        if (var11 == 0) {
                            statePc = 50;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        this.field_P = (int)((double)field_S[this.field_Q] / cd.a((byte) 121));
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (!cj.field_c[this.field_Q]) {
                            statePc = 53;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        this.field_l = -oi.field_b[this.field_Q];
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (0 == (ac.field_j[this.field_Q] ^ -1)) {
                            statePc = 60;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (nl.field_r[ac.field_j[this.field_Q]] != null) {
                            statePc = 59;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        this.field_q = ag.a(nl.field_r[ac.field_j[this.field_Q]], 256, 64);
                        this.field_q.f(-1);
                        this.field_q.c(0, nl.field_r[ac.field_j[this.field_Q]].field_i.length);
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        this.field_i[0] = new hi(ta.field_j[this.field_Q]);
                        this.field_o = 640.0;
                        this.field_e = 0;
                        this.field_N = (double)param4;
                        var10 = this.field_Q;
                        if ((var10 ^ -1) == -1) {
                            statePc = 117;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if ((var10 ^ -1) != -36) {
                            statePc = 67;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (var11 == 0) {
                            statePc = 117;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (var10 == 47) {
                            statePc = 118;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if (var10 != 7) {
                            statePc = 76;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if (var11 == 0) {
                            statePc = 121;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if (11 == var10) {
                            statePc = 124;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        if (8 == var10) {
                            statePc = 131;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        if (9 == var10) {
                            statePc = 131;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        if (var10 == 10) {
                            statePc = 131;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        if (-13 != (var10 ^ -1)) {
                            statePc = 94;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        if (var11 == 0) {
                            statePc = 132;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        if (-16 != (var10 ^ -1)) {
                            statePc = 100;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        if (var11 == 0) {
                            statePc = 141;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        if (-17 == (var10 ^ -1)) {
                            statePc = 141;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        statePc = 103;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        if ((var10 ^ -1) == -6) {
                            statePc = 147;
                        } else {
                            statePc = 104;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        if (17 != var10) {
                            statePc = 112;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        if (var11 == 0) {
                            statePc = 147;
                        } else {
                            statePc = 110;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        if ((var10 ^ -1) == -19) {
                            statePc = 147;
                        } else {
                            statePc = 113;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        statePc = 155;
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        this.field_M = (int)this.field_N;
                        if (var11 == 0) {
                            statePc = 155;
                        } else {
                            statePc = 118;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        this.field_o = (double)(-this.field_m + 5);
                        if (var11 == 0) {
                            statePc = 155;
                        } else {
                            statePc = 119;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        statePc = 121;
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        this.field_r = vd.field_g;
                        if (var11 == 0) {
                            statePc = 155;
                        } else {
                            statePc = 122;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        statePc = 124;
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        this.field_r = mi.field_i;
                        this.field_y = ib.field_r;
                        var10 = 0;
                        statePc = 125;
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        if ((this.field_L.length ^ -1) >= (var10 ^ -1)) {
                            statePc = 130;
                        } else {
                            statePc = 126;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        this.field_L[var10] = new ck();
                        var10++;
                        if (var11 != 0) {
                            statePc = 155;
                        } else {
                            statePc = 127;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        if (var11 == 0) {
                            statePc = 125;
                        } else {
                            statePc = 128;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        if (var11 == 0) {
                            statePc = 155;
                        } else {
                            statePc = 131;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        this.c(5);
                        this.field_l = (-this.field_o + (double)this.field_g) / 640.0 * oi.field_b[this.field_Q];
                        this.field_j = oi.field_b[this.field_Q] * (((double)this.field_M - this.field_N) / 480.0);
                        var8 = Math.random();
                        this.field_l = this.field_l * (0.25 + 0.75 * var8);
                        this.field_j = this.field_j * (0.75 * var8 + 0.25);
                        if (var11 == 0) {
                            statePc = 155;
                        } else {
                            statePc = 132;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        if (0 == hi.a(2, 4, this.field_T)) {
                            statePc = 138;
                        } else {
                            statePc = 133;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        statePc = 135;
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        this.field_J = 0;
                        if (var11 == 0) {
                            statePc = 155;
                        } else {
                            statePc = 136;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        statePc = 138;
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        this.field_J = 2;
                        if (var11 == 0) {
                            statePc = 155;
                        } else {
                            statePc = 139;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        statePc = 141;
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        if (param5) {
                            statePc = 155;
                        } else {
                            statePc = 142;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        statePc = 144;
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        this.field_o = (double)(50 + hi.a(-100 - (this.field_m - 640), 4, this.field_T));
                        this.field_N = (double)(5 + -this.field_O);
                        this.field_j = 2.0 * -ff.field_N[this.field_Q];
                        this.field_l = 0.0;
                        if (var11 == 0) {
                            statePc = 155;
                        } else {
                            statePc = 145;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        statePc = 147;
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        var10 = 0;
                        statePc = 148;
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        if ((var10 ^ -1) <= (this.field_L.length ^ -1)) {
                            statePc = 155;
                        } else {
                            statePc = 149;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        this.field_L[var10] = new ck();
                        var10++;
                        if (var11 != 0) {
                            statePc = 155;
                        } else {
                            statePc = 150;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        if (var11 == 0) {
                            statePc = 148;
                        } else {
                            statePc = 151;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_150) {
                        caughtException = stateCaught_150;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        statePc = 155;
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 154: {
                    var7_ref = (RuntimeException) ((Object) caughtException);
                    throw ie.a((Throwable) ((Object) var7_ref), "bf.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
                }
                case 155: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_x = "The account name you use to access RuneScape and other Jagex.com games";
        field_S = new int[]{100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100};
        field_h = null;
    }
}
