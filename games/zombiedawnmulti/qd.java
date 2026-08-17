/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qd {
    static int field_N;
    static String field_K;
    static String field_v;
    static int field_e;
    static ja field_s;
    static String field_r;
    static String field_E;
    static String field_V;
    private th field_hb;
    private boolean field_ab;
    static boolean field_bb;
    private int field_h;
    private int field_Z;
    private int field_R;
    fh field_u;
    ko field_I;
    private qe field_G;
    int field_j;
    private uf field_J;
    nm field_k;
    int field_Y;
    private int field_p;
    private long field_a;
    int field_M;
    private th field_X;
    private th field_kb;
    private th field_cb;
    private int field_q;
    private th field_O;
    private ja field_L;
    lq field_Q;
    private gm field_x;
    private boolean field_lb;
    private int field_d;
    private boolean field_db;
    private wb field_mb;
    private int field_F;
    private ja field_y;
    th field_H;
    private ea field_S;
    private int field_fb;
    private th field_T;
    private lq field_c;
    private ja field_B;
    private th field_C;
    private boolean field_eb;
    private boolean field_w;
    private boolean field_f;
    private int field_n;
    private h field_o;
    private int field_l;
    private int field_ib;
    private boolean field_z;
    private int field_gb;
    private float field_D;
    private int field_A;
    private int field_jb;
    private int field_m;
    private int field_U;
    private jj field_b;
    long field_t;
    int field_W;
    private int field_g;
    private int[] field_i;

    private final void e(int param0) {
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        boolean stackIn_66_0 = false;
        boolean stackIn_78_0 = false;
        int stackIn_84_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_86_1 = 0;
        boolean stackIn_110_0 = false;
        Object stackIn_123_0 = null;
        Object stackIn_125_0 = null;
        Object stackIn_126_0 = null;
        int stackIn_126_1 = 0;
        int stackIn_140_0 = 0;
        int stackIn_142_0 = 0;
        int stackIn_143_0 = 0;
        int stackIn_143_1 = 0;
        boolean stackIn_176_0 = false;
        int stackIn_232_0 = 0;
        boolean stackOut_109_0;
        boolean stackOut_175_0;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        float var3_float = 0.0f;
        int var3 = 0;
        id var3_ref_id = null;
        int var4 = 0;
        h var5 = null;
        id var5_ref = null;
        int var6_int = 0;
        wb var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = 0;
                        if (!this.field_z) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var2_int = t.field_d;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (!iq.field_f) {
                            statePc = 12;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (!sq.field_N) {
                            statePc = 12;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (re.field_b) {
                            statePc = 27;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (lc.field_m[26]) {
                            statePc = 18;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (!lc.field_m[88]) {
                            statePc = 20;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var2_int++;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (lc.field_m[27]) {
                            statePc = 26;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (lc.field_m[87]) {
                            statePc = 26;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var2_int--;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        bk.field_g = false;
                        if (0 != var2_int) {
                            statePc = 30;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var3_float = (1.0f + (float)var2_int * 0.03999999910593033f) * this.field_k.field_d;
                        if (var3_float > 2.0f) {
                            statePc = 33;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var3_float = 2.0f;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (1.0f <= var3_float) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var3_float = 1.0f;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (var3_float == this.field_k.field_d) {
                            statePc = 45;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if ((float)this.field_u.field_r < 640.0f * var3_float) {
                            statePc = 45;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (var3_float * 480.0f > (float)this.field_u.field_c) {
                            statePc = 45;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        this.field_k.field_d = var3_float;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (!this.c((byte) 124)) {
                            statePc = 85;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (!gf.field_h) {
                            statePc = 51;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var3 = this.field_k.a(bd.field_g, 2);
                        var4 = this.field_k.a(true, bo.field_d);
                        bk.field_g = true;
                        var5 = (h) ((Object) this.field_c.c((byte) 97));
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (null == var5) {
                            statePc = 62;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        stackIn_86_0 = var5.field_I ^ -1;
                        stackIn_54_0 = stackIn_86_0;
                        stackIn_86_1 = this.field_M ^ -1;
                        stackIn_54_1 = stackIn_86_1;
                        if (var10 != 0) {
                            statePc = 86;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (stackIn_54_0 == stackIn_54_1) {
                            statePc = 61;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        var6_int = var5.g(-73) - var3;
                        var7 = var5.h(126) - var4;
                        var8 = 350;
                        if (var7 * var7 + var6_int * var6_int < var8 * var8) {
                            statePc = 60;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        bk.field_g = false;
                        if (var10 == 0) {
                            statePc = 62;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var5 = (h) ((Object) this.field_c.b((byte) 102));
                        if (var10 == 0) {
                            statePc = 52;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (!bk.field_g) {
                            statePc = 85;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        bk.field_g = false;
                        var5_ref = (id) ((Object) this.field_H.c(112));
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (var5_ref == null) {
                            statePc = 77;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        stackIn_78_0 = var5_ref instanceof wb;
                        stackIn_66_0 = stackIn_78_0;
                        if (var10 != 0) {
                            statePc = 78;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (!stackIn_66_0) {
                            statePc = 76;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        var6 = (wb) ((Object) var5_ref);
                        if (var6.i((byte) -43)) {
                            statePc = 72;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        var7 = var6.g(88) - var3;
                        var8 = -var4 + var6.h(120);
                        var9 = var6.l(-113);
                        if (var7 * var7 - -(var8 * var8) < var9 * var9) {
                            statePc = 75;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        bk.field_g = true;
                        if (var10 == 0) {
                            statePc = 77;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        var5_ref = (id) ((Object) this.field_H.b(6));
                        if (var10 == 0) {
                            statePc = 64;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        stackIn_78_0 = bk.field_g;
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if (!stackIn_78_0) {
                            statePc = 80;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        var5 = this.field_o;
                        var6_int = -var3 + var5.g(88);
                        var7 = -var4 + var5.h(123);
                        var8 = 350;
                        if ((var8 * var8 ^ -1) >= (var6_int * var6_int - -(var7 * var7) ^ -1)) {
                            statePc = 83;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        stackIn_84_0 = 1;
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        stackIn_84_0 = 0;
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        bk.field_g = stackIn_84_0 != 0;
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        stackIn_86_0 = kd.field_b;
                        stackIn_86_1 = 1;
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        if (stackIn_86_0 == stackIn_86_1) {
                            statePc = 90;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        if (kd.field_b != 2) {
                            statePc = 127;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        if (!this.field_z) {
                            statePc = 95;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        statePc = 231;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        if ((kd.field_b ^ -1) != -3) {
                            statePc = 122;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        if (!this.field_db) {
                            statePc = 122;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        if (!this.field_eb) {
                            statePc = 122;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        if (this.field_w) {
                            statePc = 107;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        var3_ref_id = (id) ((Object) this.field_H.c(83));
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        if (null == var3_ref_id) {
                            statePc = 122;
                        } else {
                            statePc = 109;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        stackOut_109_0 = var3_ref_id instanceof wb;
                        stackIn_232_0 = stackOut_109_0 ? 1 : 0;
                        stackIn_110_0 = stackOut_109_0;
                        if (var10 != 0) {
                            statePc = 232;
                        } else {
                            statePc = 110;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        if (!stackIn_110_0) {
                            statePc = 121;
                        } else {
                            statePc = 111;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        statePc = 113;
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        if (((wb) ((Object) var3_ref_id)).field_Lb == this.field_M) {
                            statePc = 119;
                        } else {
                            statePc = 114;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        if (var10 == 0) {
                            statePc = 121;
                        } else {
                            statePc = 117;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        statePc = 119;
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        ((wb) ((Object) var3_ref_id)).field_eb = false;
                        statePc = 121;
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        var3_ref_id = (id) ((Object) this.field_H.b(6));
                        if (var10 == 0) {
                            statePc = 108;
                        } else {
                            statePc = 122;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        this.field_eb = false;
                        stackIn_125_0 = this;
                        stackIn_123_0 = stackIn_125_0;
                        if (1 != kd.field_b) {
                            statePc = 125;
                        } else {
                            statePc = 123;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        stackIn_126_0 = this;
                        stackIn_126_1 = 1;
                        statePc = 126;
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        stackIn_126_0 = this;
                        stackIn_126_1 = 0;
                        statePc = 126;
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        ((qd) (this)).field_w = stackIn_126_1 != 0;
                        this.field_p = bo.field_d;
                        this.field_F = bd.field_g;
                        this.field_db = true;
                        if (var10 == 0) {
                            statePc = 231;
                        } else {
                            statePc = 127;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        if (!this.field_db) {
                            statePc = 194;
                        } else {
                            statePc = 128;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        if ((pq.field_f ^ -1) == -2) {
                            statePc = 136;
                        } else {
                            statePc = 131;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        statePc = 133;
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        if (-3 != (pq.field_f ^ -1)) {
                            statePc = 194;
                        } else {
                            statePc = 134;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        statePc = 136;
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        var3 = bd.field_g + -this.field_F;
                        var4 = -this.field_p + bo.field_d;
                        if (!this.field_eb) {
                            statePc = 139;
                        } else {
                            statePc = 137;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        statePc = 163;
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        stackIn_142_0 = Math.abs(var3) - -Math.abs(var4) ^ -1;
                        stackIn_140_0 = stackIn_142_0;
                        if (this.field_w) {
                            statePc = 142;
                        } else {
                            statePc = 140;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        stackIn_143_0 = stackIn_140_0;
                        stackIn_143_1 = 5;
                        statePc = 143;
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        stackIn_143_0 = stackIn_142_0;
                        stackIn_143_1 = 20;
                        statePc = 143;
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        if (stackIn_143_0 >= (stackIn_143_1 ^ -1)) {
                            statePc = 163;
                        } else {
                            statePc = 144;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        if (!this.c((byte) 106)) {
                            statePc = 162;
                        } else {
                            statePc = 145;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        statePc = 147;
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        if (!this.field_w) {
                            statePc = 162;
                        } else {
                            statePc = 148;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        statePc = 150;
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        if (gf.field_h) {
                            statePc = 162;
                        } else {
                            statePc = 151;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_150) {
                        caughtException = stateCaught_150;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        statePc = 153;
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        this.field_I.h(1);
                        if (lc.field_m[81]) {
                            statePc = 162;
                        } else {
                            statePc = 154;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        statePc = 156;
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        if (!lc.field_m[82]) {
                            statePc = 161;
                        } else {
                            statePc = 157;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        statePc = 159;
                        continue stateLoop;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 159: {
                    try {
                        statePc = 162;
                        continue stateLoop;
                    } catch (Throwable stateCaught_159) {
                        caughtException = stateCaught_159;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 161: {
                    try {
                        this.b(-57);
                        statePc = 162;
                        continue stateLoop;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 162: {
                    try {
                        this.field_eb = true;
                        statePc = 163;
                        continue stateLoop;
                    } catch (Throwable stateCaught_162) {
                        caughtException = stateCaught_162;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 163: {
                    try {
                        if (!this.field_eb) {
                            statePc = 193;
                        } else {
                            statePc = 164;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 164: {
                    try {
                        if (!this.c((byte) 101)) {
                            statePc = 187;
                        } else {
                            statePc = 165;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_164) {
                        caughtException = stateCaught_164;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 165: {
                    try {
                        statePc = 167;
                        continue stateLoop;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 167: {
                    try {
                        if (!this.field_w) {
                            statePc = 187;
                        } else {
                            statePc = 168;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_167) {
                        caughtException = stateCaught_167;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 168: {
                    try {
                        statePc = 170;
                        continue stateLoop;
                    } catch (Throwable stateCaught_168) {
                        caughtException = stateCaught_168;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 170: {
                    try {
                        if (gf.field_h) {
                            statePc = 187;
                        } else {
                            statePc = 171;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_170) {
                        caughtException = stateCaught_170;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 171: {
                    try {
                        statePc = 173;
                        continue stateLoop;
                    } catch (Throwable stateCaught_171) {
                        caughtException = stateCaught_171;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 173: {
                    try {
                        var5_ref = (id) ((Object) this.field_H.c(69));
                        statePc = 174;
                        continue stateLoop;
                    } catch (Throwable stateCaught_173) {
                        caughtException = stateCaught_173;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 174: {
                    try {
                        if (var5_ref == null) {
                            statePc = 186;
                        } else {
                            statePc = 175;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_174) {
                        caughtException = stateCaught_174;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 175: {
                    try {
                        stackOut_175_0 = var5_ref instanceof wb;
                        stackIn_232_0 = stackOut_175_0 ? 1 : 0;
                        stackIn_176_0 = stackOut_175_0;
                        if (var10 != 0) {
                            statePc = 232;
                        } else {
                            statePc = 176;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_175) {
                        caughtException = stateCaught_175;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 176: {
                    try {
                        if (!stackIn_176_0) {
                            statePc = 185;
                        } else {
                            statePc = 177;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_176) {
                        caughtException = stateCaught_176;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 177: {
                    try {
                        statePc = 179;
                        continue stateLoop;
                    } catch (Throwable stateCaught_177) {
                        caughtException = stateCaught_177;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 179: {
                    try {
                        var6 = (wb) ((Object) var5_ref);
                        if (this.field_M == var6.field_Lb) {
                            statePc = 183;
                        } else {
                            statePc = 180;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_179) {
                        caughtException = stateCaught_179;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 180: {
                    try {
                        if (var10 == 0) {
                            statePc = 185;
                        } else {
                            statePc = 181;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_180) {
                        caughtException = stateCaught_180;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 181: {
                    try {
                        statePc = 183;
                        continue stateLoop;
                    } catch (Throwable stateCaught_181) {
                        caughtException = stateCaught_181;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 183: {
                    try {
                        var6.field_eb = var6.a(this.field_k.a(bd.field_g, 2), this.field_k.a(true, this.field_p), this.field_k.a(true, bo.field_d), 48, this.field_k.a(this.field_F, 2));
                        statePc = 185;
                        continue stateLoop;
                    } catch (Throwable stateCaught_183) {
                        caughtException = stateCaught_183;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 185: {
                    try {
                        var5_ref = (id) ((Object) this.field_H.b(6));
                        if (var10 == 0) {
                            statePc = 174;
                        } else {
                            statePc = 186;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_185) {
                        caughtException = stateCaught_185;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 186: {
                    try {
                        if (var10 == 0) {
                            statePc = 193;
                        } else {
                            statePc = 187;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_186) {
                        caughtException = stateCaught_186;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 187: {
                    try {
                        if (-1 != this.field_q) {
                            statePc = 192;
                        } else {
                            statePc = 188;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_187) {
                        caughtException = stateCaught_187;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 188: {
                    try {
                        statePc = 190;
                        continue stateLoop;
                    } catch (Throwable stateCaught_188) {
                        caughtException = stateCaught_188;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 190: {
                    try {
                        this.field_q = this.field_F;
                        statePc = 192;
                        continue stateLoop;
                    } catch (Throwable stateCaught_190) {
                        caughtException = stateCaught_190;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 192: {
                    try {
                        this.field_k.a(var3, var4, 25992);
                        this.field_p = bo.field_d;
                        this.field_F = bd.field_g;
                        statePc = 193;
                        continue stateLoop;
                    } catch (Throwable stateCaught_192) {
                        caughtException = stateCaught_192;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 193: {
                    try {
                        if (var10 == 0) {
                            statePc = 231;
                        } else {
                            statePc = 194;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_193) {
                        caughtException = stateCaught_193;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 194: {
                    try {
                        if (this.field_db) {
                            statePc = 199;
                        } else {
                            statePc = 195;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_194) {
                        caughtException = stateCaught_194;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 195: {
                    try {
                        statePc = 197;
                        continue stateLoop;
                    } catch (Throwable stateCaught_195) {
                        caughtException = stateCaught_195;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 197: {
                    try {
                        statePc = 231;
                        continue stateLoop;
                    } catch (Throwable stateCaught_197) {
                        caughtException = stateCaught_197;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 199: {
                    try {
                        if (this.c((byte) 113)) {
                            statePc = 202;
                        } else {
                            statePc = 200;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_199) {
                        caughtException = stateCaught_199;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 200: {
                    try {
                        statePc = 230;
                        continue stateLoop;
                    } catch (Throwable stateCaught_200) {
                        caughtException = stateCaught_200;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 202: {
                    try {
                        if (!this.field_eb) {
                            statePc = 219;
                        } else {
                            statePc = 203;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_202) {
                        caughtException = stateCaught_202;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 203: {
                    try {
                        if (this.field_w) {
                            statePc = 208;
                        } else {
                            statePc = 204;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_203) {
                        caughtException = stateCaught_203;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 204: {
                    try {
                        statePc = 206;
                        continue stateLoop;
                    } catch (Throwable stateCaught_204) {
                        caughtException = stateCaught_204;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 206: {
                    try {
                        statePc = 230;
                        continue stateLoop;
                    } catch (Throwable stateCaught_206) {
                        caughtException = stateCaught_206;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 208: {
                    try {
                        if (lc.field_m[81]) {
                            statePc = 215;
                        } else {
                            statePc = 209;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_208) {
                        caughtException = stateCaught_208;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 209: {
                    try {
                        if (!lc.field_m[82]) {
                            statePc = 214;
                        } else {
                            statePc = 210;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_209) {
                        caughtException = stateCaught_209;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 210: {
                    try {
                        statePc = 212;
                        continue stateLoop;
                    } catch (Throwable stateCaught_210) {
                        caughtException = stateCaught_210;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 212: {
                    try {
                        statePc = 215;
                        continue stateLoop;
                    } catch (Throwable stateCaught_212) {
                        caughtException = stateCaught_212;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 214: {
                    try {
                        this.b(-75);
                        statePc = 215;
                        continue stateLoop;
                    } catch (Throwable stateCaught_214) {
                        caughtException = stateCaught_214;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 215: {
                    try {
                        this.a(this.field_k.a(this.field_F, 2), this.field_k.a(true, this.field_p), this.field_k.a(true, bo.field_d), this.field_k.a(bd.field_g, 2), (byte) 5);
                        if (this.field_Q.a((byte) 98) > 0) {
                            statePc = 218;
                        } else {
                            statePc = 216;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_215) {
                        caughtException = stateCaught_215;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 216: {
                    try {
                        statePc = 230;
                        continue stateLoop;
                    } catch (Throwable stateCaught_216) {
                        caughtException = stateCaught_216;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 218: {
                    try {
                        iq.a(-3, (byte) 99);
                        if (var10 == 0) {
                            statePc = 230;
                        } else {
                            statePc = 219;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_218) {
                        caughtException = stateCaught_218;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 219: {
                    try {
                        if (!gf.field_h) {
                            statePc = 224;
                        } else {
                            statePc = 220;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_219) {
                        caughtException = stateCaught_219;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 220: {
                    try {
                        statePc = 222;
                        continue stateLoop;
                    } catch (Throwable stateCaught_220) {
                        caughtException = stateCaught_220;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 222: {
                    try {
                        statePc = 230;
                        continue stateLoop;
                    } catch (Throwable stateCaught_222) {
                        caughtException = stateCaught_222;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 224: {
                    try {
                        if (this.field_w) {
                            statePc = 228;
                        } else {
                            statePc = 225;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_224) {
                        caughtException = stateCaught_224;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 225: {
                    try {
                        this.a(true, bo.field_d, bd.field_g);
                        if (var10 == 0) {
                            statePc = 230;
                        } else {
                            statePc = 226;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_225) {
                        caughtException = stateCaught_225;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 226: {
                    try {
                        statePc = 228;
                        continue stateLoop;
                    } catch (Throwable stateCaught_226) {
                        caughtException = stateCaught_226;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 228: {
                    try {
                        this.a(bo.field_d, (byte) -112, bd.field_g);
                        statePc = 230;
                        continue stateLoop;
                    } catch (Throwable stateCaught_228) {
                        caughtException = stateCaught_228;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 230: {
                    try {
                        this.field_eb = false;
                        this.field_db = false;
                        statePc = 231;
                        continue stateLoop;
                    } catch (Throwable stateCaught_230) {
                        caughtException = stateCaught_230;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 231: {
                    try {
                        stackIn_232_0 = pq.field_f ^ -1;
                        statePc = 232;
                        continue stateLoop;
                    } catch (Throwable stateCaught_231) {
                        caughtException = stateCaught_231;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 232: {
                    try {
                        if (stackIn_232_0 == -3) {
                            statePc = 235;
                        } else {
                            statePc = 233;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_232) {
                        caughtException = stateCaught_232;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 233: {
                    try {
                        this.field_q = -1;
                        statePc = 235;
                        continue stateLoop;
                    } catch (Throwable stateCaught_233) {
                        caughtException = stateCaught_233;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 235: {
                    try {
                        var3 = -105 % ((-52 - param0) / 52);
                        statePc = 238;
                        continue stateLoop;
                    } catch (Throwable stateCaught_235) {
                        caughtException = stateCaught_235;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 237: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw fa.a((Throwable) ((Object) var2), "qd.VA(" + param0 + ')');
                }
                case 238: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, boolean param5, int param6) {
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        wb var8 = null;
        Exception var8_ref = null;
        RuntimeException var8_ref2 = null;
        wb var9 = null;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  var8 = op.field_m.a(param3, false);
                  var9 = op.field_m.a(param1, false);
                  if (null == var8) {
                    break L2;
                  } else {
                    if (null == var9) {
                      break L2;
                    } else {
                      var8.field_V = param4 << -1103276912;
                      var8.field_L = param2 << 89326544;
                      var9.field_L = param6 << 2037832816;
                      var9.field_V = param0 << 267078256;
                      var8.a(param5, var9);
                      decompiledRegionSelector0 = 1;
                      break L1;
                    }
                  }
                }
                decompiledRegionSelector0 = 0;
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var8_ref = (Exception) (Object) decompiledCaughtException;
              return;
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 0;
              break L0;
            } else {
              decompiledRegionSelector1 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var8_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var8_ref2), "qd.R(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return;
        } else {
          return;
        }
    }

    final int a(int param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 >= 107) {
              stackIn_4_0 = op.field_m.a(tg.field_e.field_f[param0], tg.field_e.field_d[param0], this.field_M, false);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 126;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3), "qd.KA(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final void a(byte param0, boolean param1) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_4_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_31_0 = 0;
        nm stackIn_76_0 = null;
        nm stackIn_78_0 = null;
        nm stackIn_79_0 = null;
        nm stackIn_81_0 = null;
        nm stackIn_82_0 = null;
        nm stackIn_84_0 = null;
        nm stackIn_86_0 = null;
        nm stackIn_87_0 = null;
        int stackIn_87_1 = 0;
        nm stackIn_88_0 = null;
        int stackIn_88_1 = 0;
        boolean stackIn_88_2 = false;
        nm stackIn_89_0 = null;
        int stackIn_89_1 = 0;
        boolean stackIn_89_2 = false;
        nm stackIn_91_0 = null;
        int stackIn_91_1 = 0;
        boolean stackIn_91_2 = false;
        nm stackIn_93_0 = null;
        int stackIn_93_1 = 0;
        boolean stackIn_93_2 = false;
        nm stackIn_94_0 = null;
        int stackIn_94_1 = 0;
        boolean stackIn_94_2 = false;
        int stackIn_94_3 = 0;
        nm stackIn_95_0 = null;
        int stackIn_95_1 = 0;
        boolean stackIn_95_2 = false;
        int stackIn_95_3 = 0;
        nm stackIn_96_0 = null;
        int stackIn_96_1 = 0;
        boolean stackIn_96_2 = false;
        int stackIn_96_3 = 0;
        nm stackIn_98_0 = null;
        int stackIn_98_1 = 0;
        boolean stackIn_98_2 = false;
        int stackIn_98_3 = 0;
        nm stackIn_100_0 = null;
        int stackIn_100_1 = 0;
        boolean stackIn_100_2 = false;
        int stackIn_100_3 = 0;
        nm stackIn_101_0 = null;
        int stackIn_101_1 = 0;
        boolean stackIn_101_2 = false;
        int stackIn_101_3 = 0;
        int stackIn_101_4 = 0;
        nm stackIn_102_0 = null;
        int stackIn_102_1 = 0;
        boolean stackIn_102_2 = false;
        int stackIn_102_3 = 0;
        int stackIn_102_4 = 0;
        int stackIn_102_5 = 0;
        nm stackIn_103_0 = null;
        int stackIn_103_1 = 0;
        boolean stackIn_103_2 = false;
        int stackIn_103_3 = 0;
        int stackIn_103_4 = 0;
        int stackIn_103_5 = 0;
        nm stackIn_105_0 = null;
        int stackIn_105_1 = 0;
        boolean stackIn_105_2 = false;
        int stackIn_105_3 = 0;
        int stackIn_105_4 = 0;
        int stackIn_105_5 = 0;
        nm stackIn_107_0 = null;
        int stackIn_107_1 = 0;
        boolean stackIn_107_2 = false;
        int stackIn_107_3 = 0;
        int stackIn_107_4 = 0;
        int stackIn_107_5 = 0;
        nm stackIn_108_0 = null;
        int stackIn_108_1 = 0;
        boolean stackIn_108_2 = false;
        int stackIn_108_3 = 0;
        int stackIn_108_4 = 0;
        int stackIn_108_5 = 0;
        int stackIn_108_6 = 0;
        int stackIn_164_0 = 0;
        int stackIn_164_1 = 0;
        int stackIn_167_0 = 0;
        int stackIn_167_1 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        float var6 = 0.0f;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var14 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3_int = 0;
                        var4 = this.field_k.field_k;
                        var5 = this.field_k.field_g;
                        var6 = this.field_k.field_d;
                        var7 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var7 >= op.field_m.field_a.length) {
                            statePc = 13;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_14_0 = op.field_m.field_a[var7];
                        stackIn_4_0 = stackIn_14_0;
                        if (var14 != 0) {
                            statePc = 14;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (stackIn_4_0 <= 0) {
                            statePc = 10;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        op.field_m.field_a[var7] = op.field_m.field_a[var7] - 1;
                        if (var14 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        op.field_m.field_a[var7] = 0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var7++;
                        if (var14 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 192;
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
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var7 = stackIn_14_0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (op.field_m.field_z.length <= var7) {
                            statePc = 26;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackIn_27_0 = 0;
                        stackIn_17_0 = stackIn_27_0;
                        stackIn_27_1 = op.field_m.field_z[var7];
                        stackIn_17_1 = stackIn_27_1;
                        if (var14 != 0) {
                            statePc = 27;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (stackIn_17_0 >= stackIn_17_1) {
                            statePc = 23;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        op.field_m.field_z[var7] = op.field_m.field_z[var7] - 1;
                        if (var14 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        op.field_m.field_z[var7] = 0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var7++;
                        if (var14 == 0) {
                            statePc = 15;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackIn_27_0 = 2;
                        stackIn_27_1 = ll.field_k.field_k;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (stackIn_27_0 != stackIn_27_1) {
                            statePc = 30;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackIn_31_0 = 1;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackIn_31_0 = 16;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        ke.field_b = stackIn_31_0;
                        if (!gf.field_h) {
                            statePc = 35;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        this.e(-106);
                        if (var14 == 0) {
                            statePc = 56;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (!this.c((byte) 104)) {
                            statePc = 44;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (!param1) {
                            statePc = 49;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        this.d(15);
                        this.e(107);
                        if (var14 == 0) {
                            statePc = 49;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (op.field_m.field_l != 0) {
                            statePc = 49;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        this.e(-121);
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        this.field_J.a(-29987);
                        if (!this.field_eb) {
                            statePc = 53;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        this.field_I.a(-1, -1, (byte) 101);
                        if (var14 == 0) {
                            statePc = 55;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        this.field_I.a(bo.field_d, bd.field_g, (byte) 113);
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var3_int = er.a(-802) ? 1 : 0;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        var7 = this.field_k.field_k;
                        var8 = this.field_k.field_g;
                        if (this.field_k.field_f) {
                            statePc = 63;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (!this.field_f) {
                            statePc = 62;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        this.field_k.a(this.field_h, (byte) -86, this.field_R);
                        this.field_f = true;
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (param0 > 113) {
                            statePc = 65;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 64: {
                    return;
                }
                case 65: {
                    try {
                        if (!param1) {
                            statePc = 112;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (!iq.field_f) {
                            statePc = 75;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (!sq.field_N) {
                            statePc = 75;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if (re.field_b) {
                            statePc = 109;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        stackIn_84_0 = this.field_k;
                        stackIn_76_0 = stackIn_84_0;
                        if (lc.field_m[96]) {
                            statePc = 84;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        stackIn_78_0 = (nm) ((Object) stackIn_76_0);
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        stackIn_86_0 = (nm) ((Object) stackIn_78_0);
                        stackIn_79_0 = stackIn_86_0;
                        if (!lc.field_m[field_e]) {
                            statePc = 86;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        stackIn_81_0 = (nm) ((Object) stackIn_79_0);
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        stackIn_86_0 = (nm) ((Object) stackIn_81_0);
                        stackIn_82_0 = stackIn_86_0;
                        if (lc.field_m[82]) {
                            statePc = 86;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        stackIn_84_0 = (nm) ((Object) stackIn_82_0);
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        stackIn_87_0 = (nm) ((Object) stackIn_84_0);
                        stackIn_87_1 = 1;
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        stackIn_87_0 = (nm) ((Object) stackIn_86_0);
                        stackIn_87_1 = 0;
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        stackIn_91_0 = (nm) ((Object) stackIn_87_0);
                        stackIn_88_0 = stackIn_91_0;
                        stackIn_91_1 = stackIn_87_1;
                        stackIn_88_1 = stackIn_91_1;
                        stackIn_91_2 = lc.field_m[81];
                        stackIn_88_2 = stackIn_91_2;
                        if (lc.field_m[98]) {
                            statePc = 91;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        stackIn_93_0 = (nm) ((Object) stackIn_88_0);
                        stackIn_89_0 = stackIn_93_0;
                        stackIn_93_1 = stackIn_88_1;
                        stackIn_89_1 = stackIn_93_1;
                        stackIn_93_2 = stackIn_88_2;
                        stackIn_89_2 = stackIn_93_2;
                        if (!lc.field_m[rp.field_d]) {
                            statePc = 93;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        stackIn_91_0 = (nm) ((Object) stackIn_89_0);
                        stackIn_91_1 = stackIn_89_1;
                        stackIn_91_2 = stackIn_89_2;
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        stackIn_94_0 = (nm) ((Object) stackIn_91_0);
                        stackIn_94_1 = stackIn_91_1;
                        stackIn_94_2 = stackIn_91_2;
                        stackIn_94_3 = 1;
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        stackIn_94_0 = (nm) ((Object) stackIn_93_0);
                        stackIn_94_1 = stackIn_93_1;
                        stackIn_94_2 = stackIn_93_2;
                        stackIn_94_3 = 0;
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        stackIn_98_0 = (nm) ((Object) stackIn_94_0);
                        stackIn_95_0 = stackIn_98_0;
                        stackIn_98_1 = stackIn_94_1;
                        stackIn_95_1 = stackIn_98_1;
                        stackIn_98_2 = stackIn_94_2;
                        stackIn_95_2 = stackIn_98_2;
                        stackIn_98_3 = stackIn_94_3;
                        stackIn_95_3 = stackIn_98_3;
                        if (lc.field_m[97]) {
                            statePc = 98;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        stackIn_100_0 = (nm) ((Object) stackIn_95_0);
                        stackIn_96_0 = stackIn_100_0;
                        stackIn_100_1 = stackIn_95_1;
                        stackIn_96_1 = stackIn_100_1;
                        stackIn_100_2 = stackIn_95_2;
                        stackIn_96_2 = stackIn_100_2;
                        stackIn_100_3 = stackIn_95_3;
                        stackIn_96_3 = stackIn_100_3;
                        if (!lc.field_m[bd.field_d]) {
                            statePc = 100;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        stackIn_98_0 = (nm) ((Object) stackIn_96_0);
                        stackIn_98_1 = stackIn_96_1;
                        stackIn_98_2 = stackIn_96_2;
                        stackIn_98_3 = stackIn_96_3;
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        stackIn_101_0 = (nm) ((Object) stackIn_98_0);
                        stackIn_101_1 = stackIn_98_1;
                        stackIn_101_2 = stackIn_98_2;
                        stackIn_101_3 = stackIn_98_3;
                        stackIn_101_4 = 1;
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        stackIn_101_0 = (nm) ((Object) stackIn_100_0);
                        stackIn_101_1 = stackIn_100_1;
                        stackIn_101_2 = stackIn_100_2;
                        stackIn_101_3 = stackIn_100_3;
                        stackIn_101_4 = 0;
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        stackIn_105_0 = (nm) ((Object) stackIn_101_0);
                        stackIn_102_0 = stackIn_105_0;
                        stackIn_105_1 = stackIn_101_1;
                        stackIn_102_1 = stackIn_105_1;
                        stackIn_105_2 = stackIn_101_2;
                        stackIn_102_2 = stackIn_105_2;
                        stackIn_105_3 = stackIn_101_3;
                        stackIn_102_3 = stackIn_105_3;
                        stackIn_105_4 = stackIn_101_4;
                        stackIn_102_4 = stackIn_105_4;
                        stackIn_105_5 = -91;
                        stackIn_102_5 = stackIn_105_5;
                        if (lc.field_m[99]) {
                            statePc = 105;
                        } else {
                            statePc = 102;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        stackIn_107_0 = (nm) ((Object) stackIn_102_0);
                        stackIn_103_0 = stackIn_107_0;
                        stackIn_107_1 = stackIn_102_1;
                        stackIn_103_1 = stackIn_107_1;
                        stackIn_107_2 = stackIn_102_2;
                        stackIn_103_2 = stackIn_107_2;
                        stackIn_107_3 = stackIn_102_3;
                        stackIn_103_3 = stackIn_107_3;
                        stackIn_107_4 = stackIn_102_4;
                        stackIn_103_4 = stackIn_107_4;
                        stackIn_107_5 = stackIn_102_5;
                        stackIn_103_5 = stackIn_107_5;
                        if (!lc.field_m[uq.field_g]) {
                            statePc = 107;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        stackIn_105_0 = (nm) ((Object) stackIn_103_0);
                        stackIn_105_1 = stackIn_103_1;
                        stackIn_105_2 = stackIn_103_2;
                        stackIn_105_3 = stackIn_103_3;
                        stackIn_105_4 = stackIn_103_4;
                        stackIn_105_5 = stackIn_103_5;
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        stackIn_108_0 = (nm) ((Object) stackIn_105_0);
                        stackIn_108_1 = stackIn_105_1;
                        stackIn_108_2 = stackIn_105_2;
                        stackIn_108_3 = stackIn_105_3;
                        stackIn_108_4 = stackIn_105_4;
                        stackIn_108_5 = stackIn_105_5;
                        stackIn_108_6 = 1;
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        stackIn_108_0 = (nm) ((Object) stackIn_107_0);
                        stackIn_108_1 = stackIn_107_1;
                        stackIn_108_2 = stackIn_107_2;
                        stackIn_108_3 = stackIn_107_3;
                        stackIn_108_4 = stackIn_107_4;
                        stackIn_108_5 = stackIn_107_5;
                        stackIn_108_6 = 0;
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        ((nm) (Object) stackIn_108_0).a(stackIn_108_1 != 0, stackIn_108_2, stackIn_108_3 != 0, stackIn_108_4 != 0, (byte) stackIn_108_5, stackIn_108_6 != 0);
                        if (var14 == 0) {
                            statePc = 114;
                        } else {
                            statePc = 109;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        this.field_k.a(lc.field_m[96], lc.field_m[81], lc.field_m[98], lc.field_m[97], (byte) -91, lc.field_m[99]);
                        if (var14 == 0) {
                            statePc = 114;
                        } else {
                            statePc = 110;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        this.field_k.a(false, false, false, false, (byte) -91, false);
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        if (0 >= this.field_l) {
                            statePc = 129;
                        } else {
                            statePc = 115;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        if (this.field_l < 640) {
                            statePc = 127;
                        } else {
                            statePc = 116;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        statePc = 118;
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        if ((op.field_m.field_l ^ -1) != -1) {
                            statePc = 127;
                        } else {
                            statePc = 119;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        statePc = 121;
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        if (-1 != (op.field_m.field_l ^ -1)) {
                            statePc = 129;
                        } else {
                            statePc = 122;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        statePc = 124;
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        if (0.95 >= (double)this.field_k.field_t) {
                            statePc = 129;
                        } else {
                            statePc = 125;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        statePc = 127;
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        this.field_l = this.field_l - 15;
                        statePc = 129;
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        if (!gf.field_h) {
                            statePc = 132;
                        } else {
                            statePc = 130;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        statePc = 142;
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        if (!this.field_eb) {
                            statePc = 142;
                        } else {
                            statePc = 133;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        if (1 == pq.field_f) {
                            statePc = 138;
                        } else {
                            statePc = 134;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        statePc = 136;
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        statePc = 142;
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        this.field_p = this.field_p - (this.field_k.field_g - var8);
                        this.field_F = this.field_F - (this.field_k.field_k + -var7);
                        if (-1 == this.field_F) {
                            statePc = 141;
                        } else {
                            statePc = 139;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        statePc = 142;
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        this.field_F = this.field_F - 1;
                        statePc = 142;
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        if (var3_int != 0) {
                            statePc = 178;
                        } else {
                            statePc = 143;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        var9 = bl.a((byte) 87);
                        if (-1L != (this.field_a ^ -1L)) {
                            statePc = 146;
                        } else {
                            statePc = 144;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        this.field_a = var9 - 20L;
                        statePc = 146;
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        var11 = this.field_W - -(int)((-this.field_t + var9) / 20L);
                        if (!df.field_I) {
                            statePc = 148;
                        } else {
                            statePc = 147;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        var11 = op.field_m.field_H;
                        statePc = 148;
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        var12 = var11 + -op.field_m.field_H;
                        var13 = 0;
                        if (-1 >= (var12 ^ -1)) {
                            statePc = 158;
                        } else {
                            statePc = 149;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        fieldTemp$0 = this.field_U - 1;
                        this.field_U = this.field_U - 1;
                        if (fieldTemp$0 < 0) {
                            statePc = 155;
                        } else {
                            statePc = 150;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        statePc = 152;
                        continue stateLoop;
                    } catch (Throwable stateCaught_150) {
                        caughtException = stateCaught_150;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        this.field_a = this.field_a + 20L;
                        vd.a(false, 20L);
                        if (var14 == 0) {
                            statePc = 172;
                        } else {
                            statePc = 153;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        statePc = 155;
                        continue stateLoop;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        this.a((byte) -91);
                        this.field_U = -var12 / 8 + 1;
                        this.field_a = this.field_a + 20L;
                        if (var14 == 0) {
                            statePc = 172;
                        } else {
                            statePc = 156;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        statePc = 158;
                        continue stateLoop;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 158: {
                    try {
                        if (-21L < (var9 - this.field_a ^ -1L)) {
                            statePc = 162;
                        } else {
                            statePc = 159;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_158) {
                        caughtException = stateCaught_158;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 159: {
                    try {
                        statePc = 161;
                        continue stateLoop;
                    } catch (Throwable stateCaught_159) {
                        caughtException = stateCaught_159;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 161: {
                    try {
                        if (var11 == op.field_m.field_H) {
                            statePc = 165;
                        } else {
                            statePc = 162;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 162: {
                    try {
                        stackIn_164_0 = var11;
                        stackIn_164_1 = op.field_m.field_H;
                        statePc = 164;
                        continue stateLoop;
                    } catch (Throwable stateCaught_162) {
                        caughtException = stateCaught_162;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 164: {
                    try {
                        if (stackIn_164_0 <= stackIn_164_1) {
                            statePc = 169;
                        } else {
                            statePc = 165;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_164) {
                        caughtException = stateCaught_164;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 165: {
                    try {
                        var13++;
                        this.a((byte) 51);
                        this.field_a = this.field_a + 20L;
                        fieldTemp$1 = this.field_gb - 1;
                        this.field_gb = this.field_gb - 1;
                        if (-1 < (fieldTemp$1 ^ -1)) {
                            statePc = 158;
                        } else {
                            statePc = 166;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 166: {
                    try {
                        stackIn_164_0 = this.field_g;
                        stackIn_167_0 = stackIn_164_0;
                        stackIn_164_1 = var13;
                        stackIn_167_1 = stackIn_164_1;
                        if (var14 != 0) {
                            statePc = 164;
                        } else {
                            statePc = 167;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_166) {
                        caughtException = stateCaught_166;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 167: {
                    try {
                        if (stackIn_167_0 >= stackIn_167_1) {
                            statePc = 158;
                        } else {
                            statePc = 168;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_167) {
                        caughtException = stateCaught_167;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 168: {
                    try {
                        statePc = 169;
                        continue stateLoop;
                    } catch (Throwable stateCaught_168) {
                        caughtException = stateCaught_168;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 169: {
                    try {
                        if (-2 <= (var13 ^ -1)) {
                            statePc = 172;
                        } else {
                            statePc = 170;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_169) {
                        caughtException = stateCaught_169;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 170: {
                    try {
                        this.field_gb = this.field_m;
                        statePc = 172;
                        continue stateLoop;
                    } catch (Throwable stateCaught_170) {
                        caughtException = stateCaught_170;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 172: {
                    try {
                        if (!this.c((byte) 120)) {
                            statePc = 176;
                        } else {
                            statePc = 173;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_172) {
                        caughtException = stateCaught_172;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 173: {
                    try {
                        this.field_G.b((byte) 105, -op.field_m.field_H + op.field_m.field_C);
                        if (var14 == 0) {
                            statePc = 178;
                        } else {
                            statePc = 174;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_173) {
                        caughtException = stateCaught_173;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 174: {
                    try {
                        statePc = 176;
                        continue stateLoop;
                    } catch (Throwable stateCaught_174) {
                        caughtException = stateCaught_174;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 176: {
                    try {
                        this.field_G.c(0);
                        statePc = 178;
                        continue stateLoop;
                    } catch (Throwable stateCaught_176) {
                        caughtException = stateCaught_176;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 178: {
                    try {
                        if (!pp.field_n) {
                            statePc = 190;
                        } else {
                            statePc = 179;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_178) {
                        caughtException = stateCaught_178;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 179: {
                    try {
                        if (!this.field_k.field_f) {
                            statePc = 184;
                        } else {
                            statePc = 180;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_179) {
                        caughtException = stateCaught_179;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 180: {
                    try {
                        statePc = 182;
                        continue stateLoop;
                    } catch (Throwable stateCaught_180) {
                        caughtException = stateCaught_180;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 182: {
                    try {
                        statePc = 190;
                        continue stateLoop;
                    } catch (Throwable stateCaught_182) {
                        caughtException = stateCaught_182;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 184: {
                    try {
                        this.field_A = this.field_A + Math.abs(-var4 + this.field_k.field_k);
                        this.field_jb = this.field_jb + Math.abs(this.field_k.field_g + -var5);
                        this.field_D = this.field_D + Math.abs(-var6 + this.field_k.field_d);
                        if (-1101 <= (this.field_A - -this.field_jb ^ -1)) {
                            statePc = 187;
                        } else {
                            statePc = 185;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_184) {
                        caughtException = stateCaught_184;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 185: {
                    try {
                        iq.a(-8, (byte) 99);
                        statePc = 187;
                        continue stateLoop;
                    } catch (Throwable stateCaught_185) {
                        caughtException = stateCaught_185;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 187: {
                    try {
                        if (this.field_D <= 2.200000047683716f) {
                            statePc = 190;
                        } else {
                            statePc = 188;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_187) {
                        caughtException = stateCaught_187;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 188: {
                    try {
                        iq.a(-7, (byte) 99);
                        statePc = 190;
                        continue stateLoop;
                    } catch (Throwable stateCaught_188) {
                        caughtException = stateCaught_188;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 190: {
                    try {
                        this.b(true);
                        g.a(this.field_H);
                        this.a(param1, 15978);
                        statePc = 193;
                        continue stateLoop;
                    } catch (Throwable stateCaught_190) {
                        caughtException = stateCaught_190;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 192: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    throw fa.a((Throwable) ((Object) var3), "qd.L(" + param0 + ',' + param1 + ')');
                }
                case 193: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void b(byte param0, int param1, int param2) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int stackIn_35_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_39_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_78_1 = 0;
        int stackIn_80_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_83_1 = 0;
        int stackIn_89_0 = 0;
        int stackIn_103_0 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        lq var5 = null;
        wb var6 = null;
        int var6_int = 0;
        th var7_ref_th = null;
        int var7 = 0;
        wb var8 = null;
        int[][] var8_array = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15_int = 0;
        wb var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var20 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_J.a(0, param2, param1);
                        if (-2 <= (this.field_Q.a((byte) 98) ^ -1)) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        param2 = po.d(12949) + -(param2 % 24) + param2;
                        param1 = po.d(12949) + (-(param1 % 24) + param1);
                        if (var20 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        param1 += 6;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var4_int = 1;
                        var5 = new lq();
                        var6 = (wb) ((Object) this.field_Q.c((byte) 121));
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var6 == null) {
                            statePc = 16;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var7_ref_th = this.field_u.b(var6.g(124), param1, var6.h(119), param2, 8760);
                        if (var20 != 0) {
                            statePc = 20;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (null != var7_ref_th) {
                            statePc = 14;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var6.a(-4564);
                        var5.a(29664, var6);
                        if (var20 == 0) {
                            statePc = 15;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var4_int = 0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var6 = (wb) ((Object) this.field_Q.b((byte) 100));
                        if (var20 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var4_int == 0) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        this.field_Q = var5;
                        this.field_J.a(true);
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 18: {
                    return;
                }
                case 19: {
                    try {
                        this.field_J.b(true);
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (!this.field_o.a(param1, param2, (byte) -69)) {
                            statePc = 32;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        param2 = -6 + this.field_o.g(-115);
                        param1 = this.field_o.h(-110) - -15;
                        var6_int = 8192;
                        if ((this.field_Q.a((byte) 98) ^ -1) >= -1) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var6_int = var6_int / this.field_Q.a((byte) 98);
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if ((var6_int ^ -1) != -1) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var6_int = 1;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var7 = 0;
                        var8 = (wb) ((Object) this.field_Q.c((byte) 88));
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (var8 == null) {
                            statePc = 31;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var9 = param2 - -(wn.a(-128, var7) * 48 >> 470081360);
                        var10 = (on.a(var7, -18924) * 48 >> 1661881648) + param1;
                        var7 = var7 + var6_int;
                        var8.a((byte) 68, op.field_m.field_H - -100, var9, var10);
                        wd.a(var8.field_y, op.field_m.field_H, ma.field_a, param2, 65, param1);
                        var8 = (wb) ((Object) this.field_Q.b((byte) 117));
                        if (var20 != 0) {
                            statePc = 107;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (var20 == 0) {
                            statePc = 26;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 107;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var6_int = param2 / 24;
                        var7 = param1 / 24;
                        var8_array = this.field_u.d(114);
                        var8_array[var7][var6_int] = 1;
                        var9 = 2;
                        var10 = 1;
                        var11 = this.field_Q.a((byte) 98);
                        var12 = -1;
                        var13 = -1;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (var11 < var9) {
                            statePc = 72;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var14 = -1;
                        var15_int = -1;
                        stackIn_73_0 = 0;
                        stackIn_35_0 = stackIn_73_0;
                        if (var20 != 0) {
                            statePc = 73;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var16 = stackIn_35_0;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        stackIn_37_0 = var8_array.length ^ -1;
                        stackIn_37_1 = var16 ^ -1;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (stackIn_37_0 >= stackIn_37_1) {
                            statePc = 47;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackIn_48_0 = 0;
                        stackIn_39_0 = stackIn_48_0;
                        if (var20 != 0) {
                            statePc = 48;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var17 = stackIn_39_0;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (var8_array[0].length <= var17) {
                            statePc = 46;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        stackIn_37_0 = var10 ^ -1;
                        stackIn_42_0 = stackIn_37_0;
                        stackIn_37_1 = var8_array[var16][var17] ^ -1;
                        stackIn_42_1 = stackIn_37_1;
                        if (var20 != 0) {
                            statePc = 37;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (stackIn_42_0 == stackIn_42_1) {
                            statePc = 44;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var14 = var17;
                        var15_int = var16;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var17++;
                        if (var20 == 0) {
                            statePc = 40;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var16++;
                        if (var20 == 0) {
                            statePc = 36;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        stackIn_48_0 = var14;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (stackIn_48_0 != -1) {
                            statePc = 54;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (0 != (var15_int ^ -1)) {
                            statePc = 54;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        this.field_J.a(true);
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 53: {
                    return;
                }
                case 54: {
                    try {
                        if ((jk.a((byte) 123, var14, var8_array, var15_int - 1) ^ -1) != -1) {
                            statePc = 57;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        incrementValue$0 = var9;
                        var9++;
                        var8_array[var15_int - 1][var14] = incrementValue$0;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (jk.a((byte) -82, var14 - -1, var8_array, var15_int) == 0) {
                            statePc = 60;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        incrementValue$1 = var9;
                        var9++;
                        var8_array[var15_int][var14 + 1] = incrementValue$1;
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (-1 != (jk.a((byte) -97, var14, var8_array, 1 + var15_int) ^ -1)) {
                            statePc = 64;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        incrementValue$2 = var9;
                        var9++;
                        var8_array[1 + var15_int][var14] = incrementValue$2;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (jk.a((byte) 25, var14 + -1, var8_array, var15_int) != 0) {
                            statePc = 67;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        incrementValue$3 = var9;
                        var9++;
                        var8_array[var15_int][var14 + -1] = incrementValue$3;
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        var10++;
                        if (!this.field_o.b(var14, var15_int, 19024)) {
                            statePc = 69;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        var13 = var15_int;
                        var12 = var14;
                        if (var20 == 0) {
                            statePc = 72;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (var20 == 0) {
                            statePc = 33;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        stackIn_73_0 = 0;
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        var14 = stackIn_73_0;
                        var15 = (wb) ((Object) this.field_Q.c((byte) 109));
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (var15 == null) {
                            statePc = 102;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        var14++;
                        var16 = -1;
                        var17 = -1;
                        stackIn_103_0 = 0;
                        stackIn_76_0 = stackIn_103_0;
                        if (var20 != 0) {
                            statePc = 103;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        var18 = stackIn_76_0;
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        stackIn_78_0 = var8_array.length;
                        stackIn_78_1 = var18;
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if (stackIn_78_0 <= stackIn_78_1) {
                            statePc = 88;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        stackIn_89_0 = 0;
                        stackIn_80_0 = stackIn_89_0;
                        if (var20 != 0) {
                            statePc = 89;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        var19 = stackIn_80_0;
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        if ((var19 ^ -1) <= (var8_array[0].length ^ -1)) {
                            statePc = 87;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        stackIn_78_0 = var14;
                        stackIn_83_0 = stackIn_78_0;
                        stackIn_78_1 = var8_array[var18][var19];
                        stackIn_83_1 = stackIn_78_1;
                        if (var20 != 0) {
                            statePc = 78;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        if (stackIn_83_0 == stackIn_83_1) {
                            statePc = 85;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        var17 = var18;
                        var16 = var19;
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        var19++;
                        if (var20 == 0) {
                            statePc = 81;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        var18++;
                        if (var20 == 0) {
                            statePc = 77;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        stackIn_89_0 = 0;
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        if (stackIn_89_0 != (var16 ^ -1)) {
                            statePc = 94;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        if (var17 != -1) {
                            statePc = 94;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        var16 = var12;
                        var17 = var13;
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        if (-1 != var16) {
                            statePc = 101;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        if (-1 == var17) {
                            statePc = 100;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 100: {
                    return;
                }
                case 101: {
                    try {
                        var18 = po.d(12949) + 24 * var16;
                        var19 = 24 * var17 + po.d(12949);
                        var15.a((byte) 95, 100 + op.field_m.field_H, var18, var19);
                        wd.a(var15.field_y, op.field_m.field_H, ma.field_a, var18, 61, var19);
                        var15 = (wb) ((Object) this.field_Q.b((byte) 108));
                        if (var20 == 0) {
                            statePc = 74;
                        } else {
                            statePc = 102;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        stackIn_103_0 = 0;
                        statePc = 103;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        if (stackIn_103_0 < var14) {
                            statePc = 106;
                        } else {
                            statePc = 104;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        statePc = 107;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        iq.a(-13, (byte) 99);
                        statePc = 107;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        if (param0 > 14) {
                            statePc = 110;
                        } else {
                            statePc = 108;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        this.b(false, -51, -45, 16);
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        var6 = (wb) ((Object) var5.c((byte) 98));
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        if (null == var6) {
                            statePc = 118;
                        } else {
                            statePc = 112;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        var6.a(-4564);
                        this.field_Q.a(29664, var6);
                        var6 = (wb) ((Object) var5.b((byte) 126));
                        if (var20 != 0) {
                            statePc = 118;
                        } else {
                            statePc = 113;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        if (var20 == 0) {
                            statePc = 111;
                        } else {
                            statePc = 114;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        statePc = 118;
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 117: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    throw fa.a((Throwable) ((Object) var4), "qd.M(" + param0 + ',' + param1 + ',' + param2 + ')');
                }
                case 118: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(byte param0, int param1, int param2, int param3, int param4) {
        kb stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        kb stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          L0: {
            L1: {
              if (param0 < -103) {
                break L1;
              } else {
                this.a((byte) -73, false);
                break L1;
              }
            }
            L2: {
              stackIn_6_0 = op.field_m;

              stackIn_6_1 = param4;

              if (param2 == 9) {
                stackIn_7_0 = (kb) ((Object) stackIn_6_0);
                stackIn_7_1 = stackIn_6_1;
                stackIn_7_2 = 1;
                break L2;
              } else {
                stackIn_7_0 = (kb) ((Object) stackIn_6_0);
                stackIn_7_1 = stackIn_6_1;
                stackIn_7_2 = 0;
                break L2;
              }
            }
            ((kb) (Object) stackIn_7_0).a(stackIn_7_1, stackIn_7_2, 118, param1, param3, this.field_u);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var6), "qd.HB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void a(boolean param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (param0) {
              L1: {
                L2: {
                  if (he.field_a) {
                    break L2;
                  } else {
                    oo.h(0, 40, 640, 440);
                    if (var4 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                oo.c();
                break L1;
              }
              L3: {
                L4: {
                  if (1.0f != this.field_k.field_d) {
                    break L4;
                  } else {
                    ki.field_k.c(0, 0);
                    if (var4 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                var2_int = (int)(1280.0f / this.field_k.field_d);
                var3 = (int)(960.0f / this.field_k.field_d);
                ki.field_k.f(0, 0, var2_int, var3);
                if (1.2999999523162842f < this.field_k.field_d) {
                  break L3;
                } else {
                  break L3;
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
          throw fa.a((Throwable) ((Object) var2), "qd.GB(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void e(int param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4_int = (-this.field_k.field_k + param2) / 4;
              var5 = (-this.field_k.field_g + param0) / 4;
              this.field_k.a(var5 + this.field_k.field_g, -var4_int + param2, param2, this.field_k.field_k, this.field_k.field_g, param0, 0, param0 - var5, this.field_k.field_k - -var4_int);
              this.field_k.a((byte) 47);
              this.field_k.field_i = this.field_k.field_i * 6.0f;
              if (param1 < -36) {
                break L1;
              } else {
                field_N = 59;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) runtimeException), "qd.BB(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(fm param0, int param1, String param2, int param3, td param4) {
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_35_1 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        StringBuilder stackIn_39_1 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            var6 = -1;
            var7 = 1;
            if (param3 > 82) {
              L1: while (true) {
                L2: {
                  L3: {
                    if ((param2.length() ^ -1) >= (var7 ^ -1)) {
                      break L3;
                    } else {
                      var8 = param2.charAt(var7);
                      if (var9 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (60 == var8) {
                            var6 = param4.field_e[0] + ((var5_int >> 1012378856) - -param0.a(param2.substring(0, var7)));
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        L5: {
                          L6: {
                            if (-1 == var6) {
                              break L6;
                            } else {
                              param4.field_e[var7] = var6;
                              if (var9 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          L7: {
                            if ((var8 ^ -1) == -33) {
                              var5_int = var5_int + param1;
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          param4.field_e[var7] = param4.field_e[0] + (var5_int >> -539974776) + (param0.a(param2.substring(0, 1 + var7)) - param0.a((char) var8));
                          break L5;
                        }
                        L8: {
                          if (62 == var8) {
                            var6 = -1;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        var7++;
                        if (var9 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  break L2;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var5);

            stackIn_31_1 = new StringBuilder().append("qd.KB(");

            if (param0 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L9;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L10;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_39_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_36_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "null";
              break L11;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "{...}";
              break L11;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_32_0), stackIn_40_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void d(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              pq.b(false);
              if (param1 == 3) {
                break L1;
              } else {
                this.field_kb = (th) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (-1 == (param0 ^ -1)) {
                  break L3;
                } else {
                  L4: {
                    if (param0 != 1) {
                      break L4;
                    } else {
                      h.b(param1 + -113, 1);
                      ck.a(77, -23838);
                      ck.a(110, -23838);
                      ck.a(111, -23838);
                      ck.a(173, -23838);
                      ck.a(174, -23838);
                      ck.a(175, param1 ^ -23839);
                      sj.a(189, 173, (byte) -66);
                      sj.a(190, 174, (byte) -66);
                      sj.a(191, 175, (byte) -66);
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (param0 != 2) {
                      break L5;
                    } else {
                      h.b(-101, 2);
                      ck.a(132, -23838);
                      ck.a(133, -23838);
                      ck.a(70, -23838);
                      ck.a(264, -23838);
                      ck.a(265, -23838);
                      ck.a(266, -23838);
                      ck.a(267, -23838);
                      sj.a(132, 133, (byte) -66);
                      sj.a(268, 264, (byte) -66);
                      sj.a(269, 265, (byte) -66);
                      sj.a(270, 266, (byte) -66);
                      sj.a(271, 267, (byte) -66);
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L6: {
                    if ((param0 ^ -1) != -4) {
                      break L6;
                    } else {
                      h.b(-74, 3);
                      ck.a(163, -23838);
                      ck.a(164, -23838);
                      ck.a(165, -23838);
                      ck.a(213, -23838);
                      ck.a(214, -23838);
                      ck.a(215, param1 ^ -23839);
                      sj.a(213, 163, (byte) -66);
                      sj.a(214, 164, (byte) -66);
                      sj.a(215, 165, (byte) -66);
                      ck.a(230, -23838);
                      ck.a(246, -23838);
                      sj.a(246, 230, (byte) -66);
                      ck.a(247, -23838);
                      ck.a(263, -23838);
                      sj.a(263, 247, (byte) -66);
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L6;
                      }
                    }
                  }
                  if (param0 != 4) {
                    break L2;
                  } else {
                    h.b(param1 ^ -89, 4);
                    if (var4 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              pj.a(0, 16, -16384, 22, 21, (byte) -27, 3);
              pj.a(0, 21, 16384, 23, 16, (byte) 122, 3);
              ge.s(9);
              ck.a(59, -23838);
              ck.a(60, -23838);
              ck.a(61, -23838);
              ck.a(71, param1 + -23841);
              ck.a(70, -23838);
              ck.a(110, -23838);
              ck.a(111, param1 ^ -23839);
              ck.a(120, -23838);
              ck.a(121, -23838);
              ck.a(122, -23838);
              ck.a(156, param1 ^ -23839);
              ck.a(157, -23838);
              ck.a(158, -23838);
              ck.a(276, -23838);
              ck.a(277, -23838);
              ck.a(278, -23838);
              sj.a(276, 120, (byte) -66);
              sj.a(277, 121, (byte) -66);
              sj.a(278, 122, (byte) -66);
              h.b(-70, 0);
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3), "qd.DB(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1) {
        int stackIn_28_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_158_0 = 0;
        int stackIn_166_0 = 0;
        int stackIn_174_0 = 0;
        int stackIn_182_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (-14 != (param1 ^ -1)) {
              L1: {
                if (gf.field_h) {
                  break L1;
                } else {
                  if (!this.c((byte) 124)) {
                    break L1;
                  } else {
                    L2: {
                      L3: {
                        if (df.field_I) {
                          break L3;
                        } else {
                          L4: {
                            if ((param1 ^ -1) != -85) {
                              break L4;
                            } else {
                              L5: {
                                if (iq.field_f) {
                                  stackIn_28_0 = 0;
                                  break L5;
                                } else {
                                  stackIn_28_0 = 1;
                                  break L5;
                                }
                              }
                              iq.field_f = stackIn_28_0 != 0;
                              break L4;
                            }
                          }
                          if ((param1 ^ -1) != -81) {
                            break L2;
                          } else {
                            if (iq.field_f) {
                              break L2;
                            } else {
                              sq.field_N = true;
                              iq.field_f = true;
                              if (var4 == 0) {
                                break L2;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                      }
                      L6: {
                        if (83 == param1) {
                          break L6;
                        } else {
                          if (-85 != (param1 ^ -1)) {
                            break L2;
                          } else {
                            break L6;
                          }
                        }
                      }
                      iq.a(-14, (byte) 99);
                      break L2;
                    }
                    L7: {
                      if (this.field_ab) {
                        L8: {
                          if ((param1 ^ -1) != -42) {
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        L9: {
                          if (40 == param1) {
                            L10: {
                              if (po.field_p) {
                                stackIn_55_0 = 0;
                                break L10;
                              } else {
                                stackIn_55_0 = 1;
                                break L10;
                              }
                            }
                            po.field_p = stackIn_55_0 != 0;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        L11: {
                          if (32 != param1) {
                            break L11;
                          } else {
                            L12: {
                              if (wh.field_c) {
                                stackIn_63_0 = 0;
                                break L12;
                              } else {
                                stackIn_63_0 = 1;
                                break L12;
                              }
                            }
                            wh.field_c = stackIn_63_0 != 0;
                            break L11;
                          }
                        }
                        L13: {
                          if (param1 != 85) {
                            break L13;
                          } else {
                            L14: {
                              if (vk.field_E) {
                                stackIn_71_0 = 0;
                                break L14;
                              } else {
                                stackIn_71_0 = 1;
                                break L14;
                              }
                            }
                            vk.field_E = stackIn_71_0 != 0;
                            break L13;
                          }
                        }
                        L15: {
                          if (lc.field_m[86]) {
                            L16: {
                              if (lc.field_m[81]) {
                                break L16;
                              } else {
                                L17: {
                                  if (-17 != (param1 ^ -1)) {
                                    break L17;
                                  } else {
                                    this.field_g = 1;
                                    break L17;
                                  }
                                }
                                L18: {
                                  if ((param1 ^ -1) != -18) {
                                    break L18;
                                  } else {
                                    this.field_g = 2;
                                    break L18;
                                  }
                                }
                                L19: {
                                  if (param1 == 18) {
                                    this.field_g = 4;
                                    break L19;
                                  } else {
                                    break L19;
                                  }
                                }
                                L20: {
                                  if (-20 == (param1 ^ -1)) {
                                    this.field_g = 8;
                                    break L20;
                                  } else {
                                    break L20;
                                  }
                                }
                                L21: {
                                  if ((param1 ^ -1) != -21) {
                                    break L21;
                                  } else {
                                    this.field_g = 16;
                                    break L21;
                                  }
                                }
                                L22: {
                                  if (21 == param1) {
                                    this.field_g = 32;
                                    break L22;
                                  } else {
                                    break L22;
                                  }
                                }
                                L23: {
                                  if (22 == param1) {
                                    this.field_g = 64;
                                    break L23;
                                  } else {
                                    break L23;
                                  }
                                }
                                L24: {
                                  if ((param1 ^ -1) != -24) {
                                    break L24;
                                  } else {
                                    this.field_g = 128;
                                    break L24;
                                  }
                                }
                                L25: {
                                  if (param1 == 24) {
                                    this.field_g = 256;
                                    break L25;
                                  } else {
                                    break L25;
                                  }
                                }
                                if (25 != param1) {
                                  break L15;
                                } else {
                                  this.field_g = 0;
                                  if (var4 == 0) {
                                    break L15;
                                  } else {
                                    break L16;
                                  }
                                }
                              }
                            }
                            L26: {
                              if (-17 == (param1 ^ -1)) {
                                this.field_m = 1;
                                break L26;
                              } else {
                                break L26;
                              }
                            }
                            L27: {
                              if ((param1 ^ -1) != -18) {
                                break L27;
                              } else {
                                this.field_m = 2;
                                break L27;
                              }
                            }
                            L28: {
                              if ((param1 ^ -1) != -19) {
                                break L28;
                              } else {
                                this.field_m = 4;
                                break L28;
                              }
                            }
                            L29: {
                              if (19 == param1) {
                                this.field_m = 8;
                                break L29;
                              } else {
                                break L29;
                              }
                            }
                            L30: {
                              if ((param1 ^ -1) == -21) {
                                this.field_m = 16;
                                break L30;
                              } else {
                                break L30;
                              }
                            }
                            L31: {
                              if (21 != param1) {
                                break L31;
                              } else {
                                this.field_m = 32;
                                break L31;
                              }
                            }
                            L32: {
                              if (param1 != 22) {
                                break L32;
                              } else {
                                this.field_m = 64;
                                break L32;
                              }
                            }
                            L33: {
                              if (-24 != (param1 ^ -1)) {
                                break L33;
                              } else {
                                this.field_m = 128;
                                break L33;
                              }
                            }
                            L34: {
                              if (24 == param1) {
                                this.field_m = 256;
                                break L34;
                              } else {
                                break L34;
                              }
                            }
                            if (25 == param1) {
                              this.field_m = 0;
                              break L15;
                            } else {
                              break L15;
                            }
                          } else {
                            break L15;
                          }
                        }
                        L35: {
                          if (-38 != (param1 ^ -1)) {
                            break L35;
                          } else {
                            L36: {
                              if (wj.field_n) {
                                stackIn_158_0 = 0;
                                break L36;
                              } else {
                                stackIn_158_0 = 1;
                                break L36;
                              }
                            }
                            wj.field_n = stackIn_158_0 != 0;
                            break L35;
                          }
                        }
                        L37: {
                          if ((param1 ^ -1) == -35) {
                            L38: {
                              if (qq.field_h) {
                                stackIn_166_0 = 0;
                                break L38;
                              } else {
                                stackIn_166_0 = 1;
                                break L38;
                              }
                            }
                            qq.field_h = stackIn_166_0 != 0;
                            break L37;
                          } else {
                            break L37;
                          }
                        }
                        L39: {
                          if ((param1 ^ -1) != -39) {
                            break L39;
                          } else {
                            L40: {
                              if (n.field_g) {
                                stackIn_174_0 = 0;
                                break L40;
                              } else {
                                stackIn_174_0 = 1;
                                break L40;
                              }
                            }
                            n.field_g = stackIn_174_0 != 0;
                            break L39;
                          }
                        }
                        L41: {
                          if (-37 == (param1 ^ -1)) {
                            L42: {
                              if (sc.field_a) {
                                stackIn_182_0 = 0;
                                break L42;
                              } else {
                                stackIn_182_0 = 1;
                                break L42;
                              }
                            }
                            sc.field_a = stackIn_182_0 != 0;
                            break L41;
                          } else {
                            break L41;
                          }
                        }
                        L43: {
                          if (-42 != (param1 ^ -1)) {
                            break L43;
                          } else {
                            tl.a(2, (byte) -11, ma.field_a, 0, this.field_M, 0);
                            if (gf.field_h) {
                              break L43;
                            } else {
                              this.field_I.b(113);
                              break L43;
                            }
                          }
                        }
                        L44: {
                          if (2 == param1) {
                            tl.a(0, (byte) -11, ma.field_a, this.field_k.a(true, bo.field_d), 0, this.field_k.a(bd.field_g, 2));
                            break L44;
                          } else {
                            break L44;
                          }
                        }
                        L45: {
                          if (param1 != 4) {
                            break L45;
                          } else {
                            tl.a(1, (byte) -11, ma.field_a, 0, this.field_M, 0);
                            break L45;
                          }
                        }
                        L46: {
                          if (5 != param1) {
                            break L46;
                          } else {
                            tl.a(1, (byte) -11, ma.field_a, 0, (this.field_M + 1) % op.field_m.field_t, 0);
                            break L46;
                          }
                        }
                        L47: {
                          if (6 == param1) {
                            nk.a(120, la.field_n, 120, 0, si.field_C);
                            break L47;
                          } else {
                            break L47;
                          }
                        }
                        L48: {
                          if (7 == param1) {
                            nk.a(1500, la.field_n, 1500, 0, si.field_C);
                            break L48;
                          } else {
                            break L48;
                          }
                        }
                        if (-9 != (param1 ^ -1)) {
                          break L7;
                        } else {
                          tl.a(3, (byte) -11, ma.field_a, 0, 0, 2);
                          break L7;
                        }
                      } else {
                        break L7;
                      }
                    }
                    L49: {
                      var3_int = -34 % ((param0 - 63) / 56);
                      if (!lc.field_m[82]) {
                        break L49;
                      } else {
                        if ((param1 ^ -1) != -49) {
                          break L49;
                        } else {
                          this.a(this.field_u.field_r, this.field_u.field_c, 0, 0, (byte) 5);
                          break L49;
                        }
                      }
                    }
                    L50: {
                      if ((eg.field_C ^ -1) == (param1 ^ -1)) {
                        this.field_I.a(0, -1);
                        break L50;
                      } else {
                        break L50;
                      }
                    }
                    L51: {
                      if ((param1 ^ -1) != (tl.field_v ^ -1)) {
                        break L51;
                      } else {
                        this.field_I.a(1, -1);
                        break L51;
                      }
                    }
                    L52: {
                      if (tp.field_s == param1) {
                        this.field_I.a(2, -1);
                        break L52;
                      } else {
                        break L52;
                      }
                    }
                    L53: {
                      if ((param1 ^ -1) != (pd.field_c ^ -1)) {
                        break L53;
                      } else {
                        this.field_I.a(3, -1);
                        break L53;
                      }
                    }
                    L54: {
                      if (mg.field_F != param1) {
                        break L54;
                      } else {
                        this.field_I.a(4, -1);
                        break L54;
                      }
                    }
                    L55: {
                      if (op.field_m.b((byte) -67, 51, this.field_M)) {
                        L56: {
                          if (-36 == (param1 ^ -1)) {
                            this.a(this.field_k.a(640, 2), this.field_k.a(true, 480), this.field_k.a(true, 0), this.field_k.a(0, 2), (byte) 5);
                            break L56;
                          } else {
                            break L56;
                          }
                        }
                        L57: {
                          L58: {
                            if (!lc.field_m[82]) {
                              break L58;
                            } else {
                              L59: {
                                if (param1 == 16) {
                                  break L59;
                                } else {
                                  L60: {
                                    if ((param1 ^ -1) == -18) {
                                      break L60;
                                    } else {
                                      if (param1 != 18) {
                                        break L57;
                                      } else {
                                        this.a((byte) 44, 3);
                                        if (var4 == 0) {
                                          break L57;
                                        } else {
                                          break L60;
                                        }
                                      }
                                    }
                                  }
                                  this.a((byte) 84, 2);
                                  if (var4 == 0) {
                                    break L57;
                                  } else {
                                    break L59;
                                  }
                                }
                              }
                              this.a((byte) 114, 1);
                              if (var4 == 0) {
                                break L57;
                              } else {
                                break L58;
                              }
                            }
                          }
                          L61: {
                            if ((param1 ^ -1) != -17) {
                              break L61;
                            } else {
                              this.a(1, 1782, lc.field_m[81]);
                              if (var4 == 0) {
                                break L57;
                              } else {
                                break L61;
                              }
                            }
                          }
                          L62: {
                            if (17 == param1) {
                              break L62;
                            } else {
                              if (-19 != (param1 ^ -1)) {
                                break L57;
                              } else {
                                this.a(3, 1782, lc.field_m[81]);
                                if (var4 == 0) {
                                  break L57;
                                } else {
                                  break L62;
                                }
                              }
                            }
                          }
                          this.a(2, 1782, lc.field_m[81]);
                          break L57;
                        }
                        if (-54 != (param1 ^ -1)) {
                          break L55;
                        } else {
                          this.e(this.field_o.h(-85), -108, this.field_o.g(63));
                          break L55;
                        }
                      } else {
                        break L55;
                      }
                    }
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              L63: {
                L64: {
                  if (iq.field_f) {
                    break L64;
                  } else {
                    bm.a(false, 2, 126, sp.field_g);
                    if (var4 == 0) {
                      break L63;
                    } else {
                      break L64;
                    }
                  }
                }
                iq.field_f = false;
                break L63;
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3), "qd.J(" + param0 + ',' + param1 + ')');
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

    private final void a(int param0, int param1, int param2, int param3, byte param4) {
        br var6 = null;
        wb var7 = null;
        int var8 = 0;
        boolean stackIn_7_0 = false;
        int stackIn_19_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0;
        RuntimeException var6_ref = null;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param4 == 5) {
                break L1;
              } else {
                this.a((byte) -83, -17, -19, -39, -124);
                break L1;
              }
            }
            var6 = this.field_H.c(param4 ^ 120);
            L2: while (true) {
              L3: {
                L4: {
                  if (!(var6 instanceof id)) {
                    break L4;
                  } else {
                    stackOut_6_0 = var6 instanceof wb;
                    stackIn_19_0 = stackOut_6_0 ? 1 : 0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var8 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (!stackIn_7_0) {
                          break L5;
                        } else {
                          var7 = (wb) ((Object) var6);
                          if (this.field_M != var7.field_Lb) {
                            break L5;
                          } else {
                            var7.field_eb = false;
                            if (var7.a(param3, param1, param2, 48, param0)) {
                              this.field_Q.a(29664, var7);
                              var7.r(0);
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      var6 = var6.field_d;
                      if (var8 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackIn_19_0 = this.field_Q.a((byte) 98);
                break L3;
              }
              L6: {
                if (stackIn_19_0 > 1) {
                  iq.a(-5, (byte) 99);
                  break L6;
                } else {
                  break L6;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var6_ref), "qd.W(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void b(boolean param0, int param1, int param2, int param3) {
        if (param1 != 0) {
            return;
        }
        try {
            this.field_O.a(new lj(param3, param2, param0), false);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "qd.UA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean b(int param0, int param1, int param2, int param3) {
        cg stackIn_4_0 = null;
        int stackIn_10_0 = 0;
        Object stackIn_13_0 = null;
        boolean stackIn_16_0 = false;
        int stackIn_20_0 = 0;
        boolean stackIn_25_0 = false;
        boolean stackIn_34_0 = false;
        int stackIn_43_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_82_0 = 0;
        int decompiledRegionSelector0 = 0;
        cg stackOut_3_0;
        boolean stackOut_15_0;
        boolean stackOut_24_0;
        boolean stackOut_33_0;
        int statePc = 0;
        Throwable caughtException = null;
        Object var5 = null;
        br var5_ref = null;
        RuntimeException var5_ref2 = null;
        cg var6_ref_cg = null;
        pq var6_ref_pq = null;
        ce var6_ref_ce = null;
        br var6_ref_br = null;
        int var6 = 0;
        jj var7_ref_jj = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5 = null;
                        var6_ref_cg = (cg) ((Object) op.field_m.field_A.c(49));
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var6_ref_cg == null) {
                            statePc = 12;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = (cg) (var6_ref_cg);
                        stackIn_13_0 = stackOut_3_0;
                        stackIn_4_0 = stackOut_3_0;
                        if (var9 != 0) {
                            statePc = 13;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (((cg) (Object) stackIn_4_0).a((byte) 60, param2, param0)) {
                            statePc = 9;
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
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var6_ref_cg.a(-1);
                        stackIn_10_0 = 1;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 10: {
                    return stackIn_10_0 != 0;
                }
                case 11: {
                    try {
                        var6_ref_cg = (cg) ((Object) op.field_m.field_A.b(6));
                        if (var9 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackIn_13_0 = op.field_m.field_G.c(98);
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
                        var6_ref_pq = (pq) ((Object) stackIn_13_0);
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
                        if (var6_ref_pq == null) {
                            statePc = 22;
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
                        var5_ref = op.field_m.field_G.b(6);
                        stackOut_15_0 = var6_ref_pq.a(param0, false, param2);
                        stackIn_43_0 = stackOut_15_0 ? 1 : 0;
                        stackIn_16_0 = stackOut_15_0;
                        if (var9 != 0) {
                            statePc = 43;
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
                        if (!stackIn_16_0) {
                            statePc = 21;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var6_ref_pq.c(-24421);
                        var6_ref_pq.a(true);
                        stackIn_20_0 = 1;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 20: {
                    return stackIn_20_0 != 0;
                }
                case 21: {
                    try {
                        var6_ref_pq = (pq) ((Object) var5_ref);
                        if (var9 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var6_ref_ce = (ce) ((Object) op.field_m.field_s.c(39));
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var6_ref_ce == null) {
                            statePc = 31;
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
                        var5_ref = op.field_m.field_s.b(6);
                        stackOut_24_0 = var6_ref_ce.a(param0, param2, -1);
                        stackIn_43_0 = stackOut_24_0 ? 1 : 0;
                        stackIn_25_0 = stackOut_24_0;
                        if (var9 != 0) {
                            statePc = 43;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (stackIn_25_0) {
                            statePc = 29;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var6_ref_ce.c(-28188);
                        if (var9 == 0) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var6_ref_ce = (ce) ((Object) var5_ref);
                        if (var9 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var6_ref_br = op.field_m.field_K.c(125);
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (var6_ref_br == null) {
                            statePc = 42;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackOut_33_0 = var6_ref_br instanceof jj;
                        stackIn_43_0 = stackOut_33_0 ? 1 : 0;
                        stackIn_34_0 = stackOut_33_0;
                        if (var9 != 0) {
                            statePc = 43;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (!stackIn_34_0) {
                            statePc = 41;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var7_ref_jj = (jj) ((Object) var6_ref_br);
                        if (var7_ref_jj.a(7, param0, param2)) {
                            statePc = 40;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var7_ref_jj.field_P = 1;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var6_ref_br = op.field_m.field_K.b(6);
                        if (var9 == 0) {
                            statePc = 32;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        stackIn_43_0 = 0;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var6 = stackIn_43_0;
                        var7 = 0;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (op.field_m.field_a.length <= var7) {
                            statePc = 56;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        stackIn_57_0 = var6;
                        stackIn_46_0 = stackIn_57_0;
                        if (var9 != 0) {
                            statePc = 57;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (stackIn_46_0 != 0) {
                            statePc = 52;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if ((op.field_m.field_a[var7] ^ -1) >= -1) {
                            statePc = 54;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        stackIn_55_0 = 1;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        stackIn_55_0 = 0;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var6 = stackIn_55_0;
                        op.field_m.field_a[var7] = 0;
                        var7++;
                        if (var9 == 0) {
                            statePc = 44;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        stackIn_57_0 = var6;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (stackIn_57_0 != 0) {
                            statePc = 59;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        stackIn_60_0 = 1;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 60: {
                    return stackIn_60_0 != 0;
                }
                case 61: {
                    try {
                        var7 = 0;
                        var8 = 0;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (op.field_m.field_z.length <= var8) {
                            statePc = 74;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        stackIn_75_0 = var7;
                        stackIn_64_0 = stackIn_75_0;
                        if (var9 != 0) {
                            statePc = 75;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (stackIn_64_0 != 0) {
                            statePc = 70;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (op.field_m.field_z[var8] <= 0) {
                            statePc = 72;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        stackIn_73_0 = 1;
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        stackIn_73_0 = 0;
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        var7 = stackIn_73_0;
                        op.field_m.field_z[var8] = 0;
                        var8++;
                        if (var9 == 0) {
                            statePc = 62;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        stackIn_75_0 = param1;
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if (stackIn_75_0 <= -100) {
                            statePc = 78;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        this.field_T = (th) null;
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if (var7 == 0) {
                            statePc = 81;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        stackIn_80_0 = 1;
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 80: {
                    return stackIn_80_0 != 0;
                }
                case 81: {
                    try {
                        stackIn_82_0 = 0;
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 82: {
                    return stackIn_82_0 != 0;
                }
                case 83: {
                    var5_ref2 = (RuntimeException) ((Object) caughtException);
                    throw fa.a((Throwable) ((Object) var5_ref2), "qd.MA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(byte param0, int param1) {
        RuntimeException runtimeException = null;
        br var3 = null;
        int var4 = 0;
        wb var5 = null;
        int var6 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3 = op.field_m.field_K.c(40);
                        var4 = -123 % ((-35 - param0) / 45);
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
                        if (null == var3) {
                            statePc = 20;
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
                        if (var6 != 0) {
                            statePc = 20;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (!(var3 instanceof wb)) {
                            statePc = 17;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var5 = (wb) ((Object) var3);
                        if (!var5.field_Bb) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var5.field_Kb = param1;
                        if (var6 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (param1 == var5.field_Kb) {
                            statePc = 16;
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
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var5.field_Kb = 0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var3 = op.field_m.field_K.b(6);
                        if (var6 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 19: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw fa.a((Throwable) ((Object) runtimeException), "qd.E(" + param0 + ',' + param1 + ')');
                }
                case 20: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void b(int param0, byte param1, int param2) {
        int stackIn_22_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ti var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (param1 == 127) {
              L1: {
                var4 = (ti) ((Object) op.field_m.a(param2, (byte) 33));
                if (var4 == null) {
                  System.out.println("*** character oid " + param2 + "is null!");
                  break L1;
                } else {
                  break L1;
                }
              }
              if (21 != var4.field_K) {
                L2: {
                  L3: {
                    if (!(var4 instanceof gm)) {
                      break L3;
                    } else {
                      L4: {
                        op.field_m.field_J[param0] = op.field_m.field_J[param0] + 1;
                        var5 = 10;
                        this.f(27);
                        if (!op.field_m.b((byte) -88, 60, param0)) {
                          break L4;
                        } else {
                          var5 = var5 + var5 / 2;
                          break L4;
                        }
                      }
                      L5: {
                        if (this.field_M == param0) {
                          break L5;
                        } else {
                          pb.a((byte) 62, 79);
                          if (var6 == 0) {
                            break L2;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L6: {
                        stackIn_22_0 = 62;

                        if (((gm) ((Object) var4)).m(param1 + 15557)) {
                          stackIn_23_0 = stackIn_22_0;
                          stackIn_23_1 = 77;
                          break L6;
                        } else {

                          stackIn_23_0 = stackIn_22_0;
                          stackIn_23_1 = 76;
                          break L6;
                        }
                      }
                      pb.a((byte) stackIn_23_0, stackIn_23_1);
                      if (var6 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L7: {
                    var5 = 4;
                    if (!op.field_m.b((byte) -124, 53, param0)) {
                      break L7;
                    } else {
                      var5 = var5 + var5 / 2;
                      break L7;
                    }
                  }
                  L8: {
                    if ((this.field_M ^ -1) != (param0 ^ -1)) {
                      break L8;
                    } else {
                      qq.b(1481485697, 78);
                      if (var6 == 0) {
                        break L2;
                      } else {
                        break L8;
                      }
                    }
                  }
                  qq.b(1481485697, 79);
                  break L2;
                }
                this.field_T.a(new wc(var4.g(-78), -30 + var4.h(-66), var5, true), false);
                var4.b(21, -27655);
                op.field_m.field_d[param0] = op.field_m.field_d[param0] + var5;
                iq.a(-9, (byte) 99);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                System.out.println("*** tried to enter portal twice!");
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var4_ref), "qd.V(" + param0 + ',' + param1 + ',' + param2 + ')');
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

    final void c(byte param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        id var4 = null;
        id var5 = null;
        gm var6 = null;
        wb var7 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = op.field_m.a(param2, (byte) 33);
            if (var4 != null) {
              L1: {
                if (param0 == 118) {
                  break L1;
                } else {
                  this.field_lb = false;
                  break L1;
                }
              }
              if (!(var4 instanceof wb)) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var5 = op.field_m.a(param1, (byte) 33);
                if (var4 != null) {
                  var6 = (gm) ((Object) var5);
                  var7 = (wb) ((Object) var4);
                  var7.field_Eb = var6;
                  var7.b(7, param0 ^ -27761);
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) runtimeException), "qd.GA(" + param0 + ',' + param1 + ',' + param2 + ')');
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
              return;
            }
          }
        }
    }

    final wb a(int param0, wb param1, gm param2, boolean param3, qk param4) {
        wb stackIn_3_0;
        wb stackIn_3_1;
        int stackIn_3_2;
        int stackIn_3_3;
        wb stackIn_4_0 = null;
        wb stackIn_4_1 = null;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        int stackIn_4_4 = 0;
        int stackIn_15_0 = 0;
        wb stackIn_17_0 = null;
        wb stackIn_33_0 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        StringBuilder stackIn_41_1 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        StringBuilder stackIn_45_1 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        wb var8 = null;
        int var9 = 0;
        try {
          L0: {
            L1: {
              var6_int = param4.field_g >> -544405104;
              var7 = param4.field_h >> 746949808;
              stackIn_3_0 = null;

              stackIn_3_1 = null;

              stackIn_3_2 = var6_int;

              stackIn_3_3 = var7;

              if (null == param2) {
                stackIn_4_0 = null;
                stackIn_4_1 = null;
                stackIn_4_2 = stackIn_3_2;
                stackIn_4_3 = stackIn_3_3;
                stackIn_4_4 = 1;
                break L1;
              } else {
                stackIn_4_0 = null;
                stackIn_4_1 = null;
                stackIn_4_2 = stackIn_3_2;
                stackIn_4_3 = stackIn_3_3;
                stackIn_4_4 = param2.m(15684) ? 1 : 0;
                break L1;
              }
            }
            L2: {
              var8 = new wb(stackIn_4_2, stackIn_4_3, stackIn_4_4 != 0);
              var8.field_Lb = param0;
              this.a(1, var6_int, var7);
              this.field_H.a(var8, false);
              g.a(this.field_H);
              if (null == param1) {
                break L2;
              } else {
                L3: {
                  if (!param1.field_Bb) {
                    break L3;
                  } else {
                    var8.r(0);
                    this.field_Q.a(29664, var8);
                    break L3;
                  }
                }
                var8.field_Kb = param1.field_Kb;
                break L2;
              }
            }
            L4: {
              if (param2 == null) {
                stackIn_15_0 = 0;
                break L4;
              } else {
                stackIn_15_0 = param2.q(-5183);
                break L4;
              }
            }
            var9 = stackIn_15_0;
            if (param3) {
              L5: {
                op.field_m.field_d[param0] = op.field_m.field_d[param0] + var9;
                if (0 == var9) {
                  break L5;
                } else {
                  if (this.field_M != param0) {
                    break L5;
                  } else {
                    this.field_T.a(new wc(param2.g(104), param2.h(86) - 30, var9, true), false);
                    break L5;
                  }
                }
              }
              L6: {
                if (!this.field_G.b((byte) 31)) {
                  var8.p(72);
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                iq.a(-4, (byte) 99);
                if (param2 != null) {
                  param2.b(false);
                  break L7;
                } else {
                  break L7;
                }
              }
              stackIn_33_0 = (wb) (var8);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_17_0 = (wb) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var6 = decompiledCaughtException;
            stackIn_37_0 = (RuntimeException) (var6);

            stackIn_37_1 = new StringBuilder().append("qd.LB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "null";
              break L8;
            } else {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_41_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_38_2).append(',');

            if (param2 == null) {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "null";
              break L9;
            } else {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_45_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_42_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "null";
              break L10;
            } else {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "{...}";
              break L10;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_38_0), stackIn_46_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_17_0;
        } else {
          return stackIn_33_0;
        }
    }

    final void f(int param0) {
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              op.field_m.c(-122);
              this.field_G.h(2);
              if ((op.field_m.field_l ^ -1) != -2) {
                break L1;
              } else {
                this.field_G.field_n = 2.0f;
                break L1;
              }
            }
            var2_int = 66 % ((param0 - 78) / 48);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "qd.DA(" + param0 + ')');
        }
    }

    private final ti a(boolean param0, int param1, int param2, int param3) {
        ti stackIn_3_0 = null;
        Object stackIn_37_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        id var9 = null;
        ti var10 = null;
        jj var10_ref = null;
        int var11 = 0;
        var11 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var5_int = this.field_k.a(param3, 2);
            var6 = this.field_k.a(true, param2);
            if (param1 > 35) {
              var7 = null;
              var8 = -1;
              var9 = (id) ((Object) this.field_H.c(48));
              L1: while (true) {
                L2: {
                  if (var9 == null) {
                    break L2;
                  } else {
                    L3: {
                      L4: {
                        L5: {
                          if (!param0) {
                            break L5;
                          } else {
                            if (var9 instanceof gm) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        if (param0) {
                          break L3;
                        } else {
                          if (!(var9 instanceof wb)) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var10 = (ti) ((Object) var9);
                      if (!var10.a(var5_int, true, var6)) {
                        break L3;
                      } else {
                        if ((var8 ^ -1) > (var10.h(-90) ^ -1)) {
                          var8 = var10.h(124);
                          var7 = var10;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                    L6: {
                      if (param0) {
                        break L6;
                      } else {
                        if (var9 instanceof jj) {
                          var10_ref = (jj) ((Object) var9);
                          if ((var10_ref.field_Q ^ -1) == (this.field_M ^ -1)) {
                            break L6;
                          } else {
                            if (!var10_ref.a(7, var5_int, var6)) {
                              break L6;
                            } else {
                              this.field_b = var10_ref;
                              break L6;
                            }
                          }
                        } else {
                          break L6;
                        }
                      }
                    }
                    var9 = (id) ((Object) this.field_H.b(6));
                    if (var11 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
                stackIn_37_0 = var7;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = (ti) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var5), "qd.WA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return (ti) ((Object) stackIn_37_0);
        }
    }

    private final void a(int param0, byte param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        ja var5 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var5 = am.a(0, op.field_m.field_D[param3][1], 0, 1, op.field_m.field_D[param3][0]);
              og.h((byte) 116);
              oo.h(320 - this.field_l / 2, 0, 320 - -(this.field_l / 2), 480);
              if (param1 == -99) {
                break L1;
              } else {
                this.b(95, (byte) 85, -97);
                break L1;
              }
            }
            L2: {
              L3: {
                if (320 <= param0) {
                  break L3;
                } else {
                  var5.g(param0 - 24, param2);
                  ah.field_e.c(op.field_m.field_b[param3], param0 - -24, 48 + param2, 0, 0);
                  if (!ZombieDawnMulti.field_E) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var5.b(param0 - 24, param2);
              ah.field_e.a(op.field_m.field_b[param3], param0 - 24, 48 + param2, 0, 0);
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) runtimeException), "qd.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void b(int param0, int param1) {
        RuntimeException runtimeException = null;
        wb var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = op.field_m.a(param0, false);
              if (null != var3) {
                var3.e(false);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 == 10) {
                break L2;
              } else {
                this.c((byte) -13, 20, 111);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) runtimeException), "qd.NA(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(boolean param0, ae param1) {
        ae var3 = null;
        int var4 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!(param1 instanceof fq)) {
                break L1;
              } else {
                this.d(((fq) ((Object) param1)).field_l, param1.field_f, -30305);
                break L1;
              }
            }
            if (!this.field_hb.f(28113)) {
              if (!param0) {
                var3 = (ae) ((Object) this.field_hb.a((byte) -84));
                L2: while (true) {
                  L3: {
                    L4: {
                      if (null == var3) {
                        break L4;
                      } else {
                        if (var4 != 0) {
                          break L3;
                        } else {
                          if ((param1.field_f ^ -1) >= (var3.field_f ^ -1)) {
                            var3 = (ae) ((Object) this.field_hb.c((byte) 97));
                            if (var4 == 0) {
                              continue L2;
                            } else {
                              break L4;
                            }
                          } else {
                            qc.a(param1, var3, 0);
                            decompiledRegionSelector0 = 2;
                            break L0;
                          }
                        }
                      }
                    }
                    this.field_hb.a(-25612, param1);
                    break L3;
                  }
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              this.field_hb.a(-25612, param1);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var3_ref);

            stackIn_23_1 = new StringBuilder().append("qd.U(").append(param0).append(',');

            if (param1 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L5;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L5;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
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
              return;
            }
          }
        }
    }

    final void a(boolean param0, wb param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              param1.c((byte) -70);
              param1.a(-4564);
              param1.a(param0);
              if (param0) {
                break L1;
              } else {
                this.a(112, true, -72, (byte) -98, 26);
                break L1;
              }
            }
            this.field_G.h(2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("qd.OA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        lc var5 = null;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var5 = (lc) ((Object) this.field_X.g(106));
              if (null == var5) {
                var5 = new lc();
                break L1;
              } else {
                break L1;
              }
            }
            var5.a(param1, param3, op.field_m.a(param2, (byte) 33), (byte) 108);
            this.field_C.a(-25612, var5);
            g.a(this.field_C);
            var6 = -116 / ((param0 - -36) / 61);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) runtimeException), "qd.TA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void c(boolean param0, int param1) {
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        br var3 = null;
        RuntimeException var3_ref = null;
        wb var4 = null;
        gm var4_ref = null;
        int var5 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        wd.field_G = null;
                        if (param0) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.a((byte) 76, false);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var3_int = param1;
                        if (-10 != (var3_int ^ -1)) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var5 == 0) {
                            statePc = 31;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (3 == var3_int) {
                            statePc = 38;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if ((var3_int ^ -1) != -1) {
                            statePc = 17;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var5 == 0) {
                            statePc = 52;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (-9 == (var3_int ^ -1)) {
                            statePc = 53;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (5 != var3_int) {
                            statePc = 26;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var5 == 0) {
                            statePc = 56;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (11 == var3_int) {
                            statePc = 68;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (this.field_I.b(17, 0)) {
                            statePc = 35;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        this.field_I.a(81, 0, 255);
                        if (var5 == 0) {
                            statePc = 71;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        this.field_I.b(17, 0);
                        if (var5 == 0) {
                            statePc = 71;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var3 = op.field_m.field_K.c(47);
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (var3 == null) {
                            statePc = 51;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (var5 != 0) {
                            statePc = 71;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (var3 instanceof wb) {
                            statePc = 46;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var4 = (wb) ((Object) var3);
                        if (var4.field_Lb == this.field_M) {
                            statePc = 49;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        this.e(var4.h(87), -61, var4.g(73));
                        wd.field_G = (id) ((Object) var4);
                        if (var5 == 0) {
                            statePc = 51;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var3 = op.field_m.field_K.b(6);
                        if (var5 == 0) {
                            statePc = 39;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        this.e(gk.field_c, -81, hc.field_c);
                        if (var5 == 0) {
                            statePc = 71;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        this.e(this.field_o.h(-102), -92, this.field_o.g(61));
                        wd.field_G = (id) ((Object) this.field_o);
                        if (var5 == 0) {
                            statePc = 71;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        var3 = op.field_m.field_K.c(89);
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (var3 == null) {
                            statePc = 67;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (var5 != 0) {
                            statePc = 71;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (!(var3 instanceof gm)) {
                            statePc = 66;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        var4_ref = (gm) ((Object) var3);
                        if ((var4_ref.field_C ^ -1) == -5) {
                            statePc = 65;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        this.e(var4_ref.h(-96), -49, var4_ref.g(63));
                        wd.field_G = (id) ((Object) var4_ref);
                        if (var5 == 0) {
                            statePc = 67;
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
                        var3 = op.field_m.field_K.b(6);
                        if (var5 == 0) {
                            statePc = 57;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        we.field_g[7] = se.field_D;
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 70: {
                    var3_ref = (RuntimeException) ((Object) caughtException);
                    throw fa.a((Throwable) ((Object) var3_ref), "qd.IB(" + param0 + ',' + param1 + ')');
                }
                case 71: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, fc param1) {
        boolean stackIn_38_0 = false;
        boolean stackIn_112_0 = false;
        boolean stackIn_125_0 = false;
        int stackIn_132_0 = 0;
        RuntimeException stackIn_178_0 = null;
        StringBuilder stackIn_178_1 = null;
        RuntimeException stackIn_180_0 = null;
        StringBuilder stackIn_180_1 = null;
        RuntimeException stackIn_181_0 = null;
        StringBuilder stackIn_181_1 = null;
        String stackIn_181_2 = null;
        boolean stackOut_124_0;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        th var7 = null;
        id var8 = null;
        cg var8_ref = null;
        ce var8_ref2 = null;
        rp var8_ref3 = null;
        String var8_ref4 = null;
        h var9 = null;
        wb var9_ref = null;
        int var9_int = 0;
        sl var9_ref2 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var14 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        iq.field_f = false;
                        this.field_f = false;
                        this.field_Q.d(-1);
                        this.field_jb = 0;
                        this.field_A = 0;
                        on.j((byte) 113);
                        if (df.field_I) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (pp.field_n) {
                            statePc = 14;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (op.field_m.b((byte) -128, 45, this.field_M)) {
                            statePc = 11;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        ah.a((byte) -86, 19);
                        if (var14 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        ah.a((byte) -86, 20);
                        if (var14 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        ah.a((byte) -86, 21);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        iq.a(-1, (byte) 99);
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        this.field_w = true;
                        this.field_mb = null;
                        if (pp.field_n) {
                            statePc = 33;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (df.field_I) {
                            statePc = 30;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (!gf.field_h) {
                            statePc = 27;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        we.field_g[7] = pi.field_b;
                        if (var14 == 0) {
                            statePc = 35;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        we.field_g[7] = kb.field_B;
                        if (var14 == 0) {
                            statePc = 35;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        we.field_g[7] = se.field_D;
                        if (var14 == 0) {
                            statePc = 35;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        we.field_g[7] = e.field_b;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        this.field_eb = false;
                        this.field_db = false;
                        this.field_J = new uf();
                        this.field_Y = 0;
                        this.field_u = new fh(param1);
                        ip.b((byte) 111);
                        gj.a(param0 + 6956);
                        this.field_k = new nm(this.field_u.field_r, this.field_u.field_c);
                        this.field_k.field_f = false;
                        this.d(param1.field_j, 3);
                        this.field_fb = op.field_m.field_r;
                        this.field_ib = 1;
                        this.field_O = new th();
                        this.field_cb = new th();
                        this.field_kb = new th();
                        this.field_T = new th();
                        this.field_hb = new th();
                        this.field_C = new th();
                        this.field_X = new th();
                        this.field_c = new lq();
                        var3_int = -2147483647;
                        var4 = -2147483647;
                        var5 = 2147483647;
                        var6 = 2147483647;
                        var7 = param1.a(-120);
                        var8 = (id) ((Object) var7.c(param0 + 38));
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (var8 == null) {
                            statePc = 111;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        stackIn_112_0 = var8 instanceof h;
                        stackIn_38_0 = stackIn_112_0;
                        if (var14 != 0) {
                            statePc = 112;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (!stackIn_38_0) {
                            statePc = 70;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var9 = (h) ((Object) var8);
                        if (op.field_m.field_t <= var9.field_I) {
                            statePc = 69;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var9.field_I = op.field_m.field_y[var9.field_I];
                        this.field_H.a(var8, false);
                        this.field_c.a(29664, var8);
                        if (var9.field_I != this.field_M) {
                            statePc = 69;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var10 = var8.g(param0 + 83);
                        var11 = var8.h(74);
                        this.field_o = var9;
                        var12 = var10 - (var5 + var3_int) / 2;
                        var13 = -((var6 + var4) / 2) + var11;
                        if ((var3_int ^ -1) == -2147483648) {
                            statePc = 52;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (-641 >= (Math.abs(var12) ^ -1)) {
                            statePc = 68;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if ((Math.abs(var13) ^ -1) <= -481) {
                            statePc = 68;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (var11 < var6) {
                            statePc = 57;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        var6 = var11;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if ((var11 ^ -1) >= (var4 ^ -1)) {
                            statePc = 60;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var4 = var11;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if ((var10 ^ -1) > (var5 ^ -1)) {
                            statePc = 63;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        var5 = var10;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if ((var10 ^ -1) < (var3_int ^ -1)) {
                            statePc = 67;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        var3_int = var10;
                        if (var14 == 0) {
                            statePc = 69;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        var5 = var10;
                        var3_int = var10;
                        var6 = var11;
                        var4 = var11;
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (var14 == 0) {
                            statePc = 110;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if (var8 instanceof wb) {
                            statePc = 79;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if (var8 instanceof fd) {
                            statePc = 78;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        this.field_H.a(var8, false);
                        if (var14 == 0) {
                            statePc = 110;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        var9_ref = (wb) ((Object) var8);
                        if ((op.field_m.field_t ^ -1) < (var9_ref.field_Lb ^ -1)) {
                            statePc = 82;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        if (op.field_m.field_y[var9_ref.field_Lb] == this.field_M) {
                            statePc = 85;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        var10 = var8.g(param0 ^ -37);
                        var11 = var8.h(-56);
                        var12 = var10 + -((var3_int + var5) / 2);
                        var13 = -((var4 + var6) / 2) + var11;
                        if (-2147483648 == (var3_int ^ -1)) {
                            statePc = 94;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        if (-641 >= (Math.abs(var12) ^ -1)) {
                            statePc = 106;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        if (Math.abs(var13) < 480) {
                            statePc = 94;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        if ((var5 ^ -1) < (var10 ^ -1)) {
                            statePc = 97;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        var5 = var10;
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        if (var11 <= var4) {
                            statePc = 100;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        var4 = var11;
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        if (var3_int >= var10) {
                            statePc = 102;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        var3_int = var10;
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        if (var6 > var11) {
                            statePc = 105;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        var6 = var11;
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        if (df.field_I) {
                            statePc = 109;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        gk.field_c = var11;
                        hc.field_c = var10;
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        var8 = (id) ((Object) var7.b(6));
                        if (var14 == 0) {
                            statePc = 36;
                        } else {
                            statePc = 111;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        this.field_h = (var6 - -var4) / 2;
                        this.field_R = (var5 + var3_int) / 2;
                        stackIn_112_0 = gf.field_h;
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        if (stackIn_112_0) {
                            statePc = 116;
                        } else {
                            statePc = 113;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        if (!df.field_I) {
                            statePc = 118;
                        } else {
                            statePc = 114;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        this.field_h = this.field_u.field_c / 2;
                        this.field_R = this.field_u.field_r / 2;
                        statePc = 118;
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        this.field_k.a(this.field_h, (byte) -69, this.field_R);
                        if (gf.field_h) {
                            statePc = 121;
                        } else {
                            statePc = 119;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        this.field_k.a(false);
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        g.a(this.field_H);
                        this.field_j = 0;
                        var8 = (id) ((Object) this.field_H.c(46));
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        if (null == var8) {
                            statePc = 131;
                        } else {
                            statePc = 124;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        stackOut_124_0 = var8 instanceof gm;
                        stackIn_132_0 = stackOut_124_0 ? 1 : 0;
                        stackIn_125_0 = stackOut_124_0;
                        if (var14 != 0) {
                            statePc = 132;
                        } else {
                            statePc = 125;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        if (!stackIn_125_0) {
                            statePc = 130;
                        } else {
                            statePc = 126;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        statePc = 128;
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        this.field_j = this.field_j + 1;
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        var8 = (id) ((Object) this.field_H.b(6));
                        if (var14 == 0) {
                            statePc = 123;
                        } else {
                            statePc = 131;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        stackIn_132_0 = -125;
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        ho.a((byte) stackIn_132_0, this.field_u);
                        var8_ref = (cg) ((Object) op.field_m.field_A.c(108));
                        statePc = 133;
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        if (var8_ref == null) {
                            statePc = 138;
                        } else {
                            statePc = 134;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        var8_ref.a((byte) -85);
                        var8_ref = (cg) ((Object) op.field_m.field_A.b(6));
                        if (var14 != 0) {
                            statePc = 139;
                        } else {
                            statePc = 135;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        if (var14 == 0) {
                            statePc = 133;
                        } else {
                            statePc = 136;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        statePc = 138;
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        na.a((byte) 127, this.field_u);
                        ih.a(256);
                        statePc = 139;
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        var8_ref2 = (ce) ((Object) op.field_m.field_s.c(72));
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        if (var8_ref2 == null) {
                            statePc = 145;
                        } else {
                            statePc = 141;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        var8_ref2.a(this.field_u, -54);
                        var8_ref2 = (ce) ((Object) op.field_m.field_s.b(6));
                        if (var14 != 0) {
                            statePc = 156;
                        } else {
                            statePc = 142;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        if (var14 == 0) {
                            statePc = 140;
                        } else {
                            statePc = 143;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        statePc = 145;
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        if (gf.field_h) {
                            statePc = 155;
                        } else {
                            statePc = 146;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        this.field_I = new ko();
                        if (pp.field_n) {
                            statePc = 155;
                        } else {
                            statePc = 147;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        statePc = 149;
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        var8_ref3 = ll.field_k;
                        var9_int = var8_ref3.g((byte) -116);
                        var10 = 0;
                        statePc = 150;
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        if (var9_int <= var10) {
                            statePc = 155;
                        } else {
                            statePc = 151;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_150) {
                        caughtException = stateCaught_150;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        this.field_I.a(87, tg.field_e.field_d[var10], tg.field_e.field_f[var10]);
                        var10++;
                        if (var14 != 0) {
                            statePc = 156;
                        } else {
                            statePc = 152;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        if (var14 == 0) {
                            statePc = 150;
                        } else {
                            statePc = 153;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        statePc = 155;
                        continue stateLoop;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        this.field_G = new qe();
                        statePc = 156;
                        continue stateLoop;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        var8_ref4 = gm.field_pb[hp.a((byte) -90, g.field_a, gm.field_pb.length)];
                        var9_ref2 = ah.field_e;
                        this.field_y = new ja(var9_ref2.a(var8_ref4), var9_ref2.field_C + var9_ref2.field_r);
                        this.field_L = new ja(12 + this.field_y.field_x, this.field_y.field_w - -12);
                        g.c(this.field_y);
                        this.field_l = 640;
                        var9_ref2.b(var8_ref4, this.field_y.field_x / 2, this.field_y.field_w + -var9_ref2.field_r, 2, -1);
                        this.field_L.a();
                        oo.b(0, 0, this.field_L.field_x, this.field_L.field_w, 12, 8421504, 80);
                        this.field_y.f(6, param0, 16777215);
                        oo.i(4, 4, 0, 0, oo.field_b, oo.field_l);
                        this.field_y.f(6, 6, 0);
                        g.d();
                        if (-2 == (op.field_m.field_t ^ -1)) {
                            statePc = 159;
                        } else {
                            statePc = 157;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        statePc = 160;
                        continue stateLoop;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 159: {
                    try {
                        this.field_l = 0;
                        statePc = 160;
                        continue stateLoop;
                    } catch (Throwable stateCaught_159) {
                        caughtException = stateCaught_159;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 160: {
                    try {
                        this.field_G.c(0);
                        if (df.field_I) {
                            statePc = 173;
                        } else {
                            statePc = 161;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_160) {
                        caughtException = stateCaught_160;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 161: {
                    try {
                        if (!gf.field_h) {
                            statePc = 167;
                        } else {
                            statePc = 162;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 162: {
                    try {
                        statePc = 164;
                        continue stateLoop;
                    } catch (Throwable stateCaught_162) {
                        caughtException = stateCaught_162;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 164: {
                    try {
                        if (-1 == (op.field_m.field_l ^ -1)) {
                            statePc = 170;
                        } else {
                            statePc = 165;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_164) {
                        caughtException = stateCaught_164;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 165: {
                    try {
                        statePc = 167;
                        continue stateLoop;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 167: {
                    try {
                        this.a((byte) -110, op.field_m.field_l, op.field_m.field_C);
                        if (var14 == 0) {
                            statePc = 175;
                        } else {
                            statePc = 168;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_167) {
                        caughtException = stateCaught_167;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 168: {
                    try {
                        statePc = 170;
                        continue stateLoop;
                    } catch (Throwable stateCaught_168) {
                        caughtException = stateCaught_168;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 170: {
                    try {
                        this.a((byte) -36, 1, 0);
                        if (var14 == 0) {
                            statePc = 175;
                        } else {
                            statePc = 171;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_170) {
                        caughtException = stateCaught_170;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 171: {
                    try {
                        statePc = 173;
                        continue stateLoop;
                    } catch (Throwable stateCaught_171) {
                        caughtException = stateCaught_171;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 173: {
                    try {
                        this.field_k.field_f = false;
                        op.field_m.field_l = 1;
                        statePc = 175;
                        continue stateLoop;
                    } catch (Throwable stateCaught_173) {
                        caughtException = stateCaught_173;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 175: {
                    try {
                        this.field_W = op.field_m.field_H - 50;
                        this.field_t = bl.a((byte) 43);
                        this.field_G.a(this.field_Z, false);
                        this.a(21);
                        op.field_m.field_D = new int[4][2];
                        op.field_m.field_D[0][0] = 9089042;
                        op.field_m.field_D[0][1] = 2473480;
                        op.field_m.field_D[1][0] = 11498997;
                        op.field_m.field_D[1][1] = 8165621;
                        op.field_m.field_D[2][0] = 13542477;
                        op.field_m.field_D[2][1] = 13843485;
                        op.field_m.field_D[3][1] = 16054670;
                        op.field_m.field_D[3][0] = 9796207;
                        statePc = 182;
                        continue stateLoop;
                    } catch (Throwable stateCaught_175) {
                        caughtException = stateCaught_175;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 177: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_180_0 = (RuntimeException) (var3);
                    stackIn_178_0 = stackIn_180_0;
                    stackIn_180_1 = new StringBuilder().append("qd.FB(").append(param0).append(',');
                    stackIn_178_1 = stackIn_180_1;
                    if (param1 == null) {
                        statePc = 180;
                    } else {
                        statePc = 178;
                    }
                    continue stateLoop;
                }
                case 178: {
                    stackIn_181_0 = (RuntimeException) ((Object) stackIn_178_0);
                    stackIn_181_1 = (StringBuilder) ((Object) stackIn_178_1);
                    stackIn_181_2 = "{...}";
                    statePc = 181;
                    continue stateLoop;
                }
                case 180: {
                    stackIn_181_0 = (RuntimeException) ((Object) stackIn_180_0);
                    stackIn_181_1 = (StringBuilder) ((Object) stackIn_180_1);
                    stackIn_181_2 = "null";
                    statePc = 181;
                    continue stateLoop;
                }
                case 181: {
                    throw fa.a((Throwable) ((Object) stackIn_181_0), stackIn_181_2 + ')');
                }
                case 182: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = -11 % ((param0 - -61) / 43);
              if (!df.field_I) {
                lb.a(this.field_ib, false, this.field_fb);
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) runtimeException), "qd.QA(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, byte param2, int[] param3) {
        si var5 = null;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        ug[] stackIn_6_2 = null;
        int stackIn_7_0;
        int stackIn_7_1;
        ug[] stackIn_7_2;
        int stackIn_7_3;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        try {
          L0: {
            L1: {
              if (param2 >= 116) {
                break L1;
              } else {
                this.e(95, -38, -6);
                break L1;
              }
            }
            L2: {
              this.field_lb = true;
              op.field_m.field_c = true;
              this.a((byte) -57, 3, 0);
              this.field_d = 450;
              var5 = (si) ((Object) gk.a(2, 10));
              var5.a(param1, 0, param0, param3, op.field_m);
              stackIn_6_0 = 0;

              stackIn_6_1 = 256;

              stackIn_6_2 = hl.field_d;

              if ((param0 ^ -1) == (this.field_M ^ -1)) {
                stackIn_7_0 = stackIn_6_0;
                stackIn_7_1 = stackIn_6_1;
                stackIn_7_2 = (ug[]) ((Object) stackIn_6_2);
                stackIn_7_3 = 13;
                break L2;
              } else {
                stackIn_7_0 = stackIn_6_0;
                stackIn_7_1 = stackIn_6_1;
                stackIn_7_2 = (ug[]) ((Object) stackIn_6_2);
                stackIn_7_3 = 14;
                break L2;
              }
            }
            ih.a(stackIn_7_0 != 0, stackIn_7_1, stackIn_7_2[stackIn_7_3]);
            td.field_b = hl.field_d[11];
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5_ref);

            stackIn_12_1 = new StringBuilder().append("qd.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    private final void b(int param0) {
        RuntimeException runtimeException = null;
        wb var2 = null;
        int var3 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (-1 != (this.field_Q.a((byte) 98) ^ -1)) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        var2 = (wb) ((Object) this.field_Q.c((byte) 112));
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var2 == null) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var2.t(16);
                        var2 = (wb) ((Object) this.field_Q.b((byte) 88));
                        if (var3 != 0) {
                            statePc = 15;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var3 == 0) {
                            statePc = 4;
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
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (param0 <= -50) {
                            statePc = 12;
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
                        this.a((int[]) null, false);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        this.field_Q.d(-1);
                        iq.a(-6, (byte) 99);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw fa.a((Throwable) ((Object) runtimeException), "qd.H(" + param0 + ')');
                }
                case 15: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void c(int param0, int param1, int param2) {
        try {
            op.field_m.field_a[param0] = param1;
            if (param2 != -2) {
                this.field_O = (th) null;
            }
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "qd.EA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        wb var6 = null;
        gm var7 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6_ref = null;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  var6 = op.field_m.a(param2, false);
                  var7 = op.field_m.a(param4, -81);
                  if (var6 == null) {
                    break L2;
                  } else {
                    if (null != var7) {
                      L3: {
                        if (param0 == -1181) {
                          break L3;
                        } else {
                          field_r = (String) null;
                          break L3;
                        }
                      }
                      var6.field_z = param3 << 132771312;
                      var6.field_Eb = var7;
                      var6.field_E = param1 << 602554864;
                      var7.n(20);
                      var6.b(8, param0 ^ 26778);
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                decompiledRegionSelector0 = 0;
                break L1;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6_ref = decompiledCaughtException;
              return;
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 0;
              break L0;
            } else {
              decompiledRegionSelector1 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var6_ref), "qd.PA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void b(boolean param0) {
        int fieldTemp$0 = 0;
        int stackIn_28_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        wb var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (param0) {
              L1: {
                L2: {
                  if (op.field_m.field_l != 0) {
                    break L2;
                  } else {
                    if ((this.field_W ^ -1) <= -401) {
                      this.a((byte) -25, 1, op.field_m.field_C);
                      if (var3 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                L3: {
                  if (op.field_m.field_l == 3) {
                    break L3;
                  } else {
                    if (op.field_m.field_c) {
                      break L3;
                    } else {
                      L4: {
                        if (-3 != (op.field_m.field_l ^ -1)) {
                          break L4;
                        } else {
                          if ((op.field_m.field_C - 1550 ^ -1) < (op.field_m.field_H ^ -1)) {
                            break L1;
                          } else {
                            L5: {
                              if (param0) {
                                stackIn_28_0 = 0;
                                break L5;
                              } else {
                                stackIn_28_0 = 1;
                                break L5;
                              }
                            }
                            cj.d(stackIn_28_0 != 0, 12);
                            if (var3 == 0) {
                              break L1;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      if (!df.field_I) {
                        break L1;
                      } else {
                        if (0 == op.field_m.field_m[this.field_M]) {
                          L6: {
                            if (!pp.field_n) {
                              break L6;
                            } else {
                              if (hg.field_rb == 11) {
                                break L6;
                              } else {
                                var2 = new wb(hc.field_c, gk.field_c, 0);
                                var2.field_Lb = this.field_M;
                                var2.field_y = op.field_m.a(-16777216);
                                op.field_m.field_K.a(-25612, var2);
                                op.field_m.field_m[this.field_M] = op.field_m.field_m[this.field_M] + 1;
                                var2 = new wb(hc.field_c, gk.field_c + -30, 1);
                                var2.field_Lb = this.field_M;
                                var2.field_y = op.field_m.a(-16777216);
                                op.field_m.field_K.a(-25612, var2);
                                op.field_m.field_m[this.field_M] = op.field_m.field_m[this.field_M] + 1;
                                iq.a(-12, (byte) 99);
                                if (var3 == 0) {
                                  break L1;
                                } else {
                                  break L3;
                                }
                              }
                            }
                          }
                          L7: {
                            L8: {
                              L9: {
                                if (-22 != (ai.field_b ^ -1)) {
                                  break L9;
                                } else {
                                  if ((hg.field_rb ^ -1) == -12) {
                                    break L8;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              ec.field_c = false;
                              if (var3 == 0) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                            ud.field_S = true;
                            ec.field_c = true;
                            break L7;
                          }
                          wb.l((byte) 123);
                          bm.a(false, 15, 126, sp.field_g);
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                }
                this.field_eb = false;
                fieldTemp$0 = this.field_d;
                this.field_d = this.field_d - 1;
                if (0 == fieldTemp$0) {
                  bm.a(false, 10, 126, sp.field_g);
                  break L1;
                } else {
                  break L1;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2_ref), "qd.CB(" + param0 + ')');
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

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        wb var9 = null;
        RuntimeException var9_ref = null;
        try {
          L0: {
            var9 = op.field_m.a(param0, false);
            if (var9 == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                L2: {
                  if (23 == param7) {
                    break L2;
                  } else {
                    if ((param7 ^ -1) == -29) {
                      break L2;
                    } else {
                      if (param7 == 15) {
                        break L2;
                      } else {
                        if (27 == param7) {
                          break L2;
                        } else {
                          if (17 == param7) {
                            break L2;
                          } else {
                            if (25 == param7) {
                              break L2;
                            } else {
                              if (-14 == (param7 ^ -1)) {
                                break L2;
                              } else {
                                if (29 == param7) {
                                  break L2;
                                } else {
                                  if ((param7 ^ -1) == -34) {
                                    break L2;
                                  } else {
                                    L3: {
                                      if (var9.field_K != 5) {
                                        break L3;
                                      } else {
                                        if (-5 == (param7 ^ -1)) {
                                          decompiledRegionSelector0 = 1;
                                          break L0;
                                        } else {
                                          break L3;
                                        }
                                      }
                                    }
                                    L4: {
                                      if ((param7 ^ -1) != (var9.field_K ^ -1)) {
                                        var9.b(param7, -27655);
                                        break L4;
                                      } else {
                                        break L4;
                                      }
                                    }
                                    var9.field_E = param6;
                                    var9.field_z = param1;
                                    var9.a(this.field_u.b(var9.g(-116), param4, var9.h(param2 + -65), param5, 8760), 88);
                                    var9.d(6, param3);
                                    if (!ZombieDawnMulti.field_E) {
                                      break L1;
                                    } else {
                                      break L2;
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
                var9.b(param7, -27655);
                break L1;
              }
              L5: {
                if (param2 == -34) {
                  break L5;
                } else {
                  this.c(false, -121);
                  break L5;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var9_ref), "qd.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
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

    private final void a(boolean param0, int param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  L4: {
                    en.a(-1, 0);
                    var4_int = this.field_n;
                    if (var4_int != 0) {
                      break L4;
                    } else {
                      if (var5 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (-2 != (var4_int ^ -1)) {
                    break L1;
                  } else {
                    if (var5 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (this.field_I.h(1)) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  this.b(-93);
                  if (var5 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (!this.field_I.h(1)) {
                if (0 >= this.field_Q.a((byte) 98)) {
                  break L1;
                } else {
                  if (40 >= param1) {
                    break L1;
                  } else {
                    if (param1 >= 440) {
                      break L1;
                    } else {
                      this.b((byte) 104, this.field_k.a(true, param1), this.field_k.a(param2, 2));
                      break L1;
                    }
                  }
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
            L5: {
              if (param0) {
                break L5;
              } else {
                this.field_i = (int[]) null;
                break L5;
              }
            }
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var4), "qd.A(" + param0 + ',' + param1 + ',' + param2 + ')');
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

    final int g(int param0) {
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          L0: {
            var2_int = 25 / ((-72 - param0) / 49);
            stackIn_1_0 = wq.field_a;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "qd.IA(" + param0 + ')');
        }
        return stackIn_1_0;
    }

    private final void d(int param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 == -30305) {
              L1: {
                L2: {
                  var4_int = param0;
                  if (1 == var4_int) {
                    break L2;
                  } else {
                    if (-3 != (var4_int ^ -1)) {
                      break L1;
                    } else {
                      if (!ZombieDawnMulti.field_E) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                op.field_m.field_H = param1;
                break L1;
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
          runtimeException = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) runtimeException), "qd.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final boolean c(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                var2_int = -104 % ((param0 - 59) / 39);
                if ((op.field_m.field_l ^ -1) == -2) {
                  break L2;
                } else {
                  if (-3 != (op.field_m.field_l ^ -1)) {
                    stackIn_7_0 = 0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackIn_7_0 = 1;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "qd.EB(" + param0 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final static cj a(int param0, fm param1, int param2, int param3, int param4, int param5, int param6, byte param7, int param8, int param9, int param10, int param11, int param12) {
        cj var13 = null;
        RuntimeException var13_ref = null;
        int var14 = 0;
        cj stackIn_1_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var13 = new cj(0L, (cj) null);
            var14 = -121 % ((param7 - 81) / 36);
            var13.field_ab = bk.a(param3, param6, (byte) 28);
            var13.field_X = bk.a(param4, param11, (byte) 28);
            var13.field_S = bk.a(param9, param0, (byte) 28);
            var13.field_gb = bk.a(param12, param5, (byte) 28);
            var13.field_Bb = bk.a(param2, param10, (byte) 28);
            var13.field_yb = param1;
            var13.field_M = param8;
            stackIn_1_0 = (cj) (var13);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var13_ref = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var13_ref);

            stackIn_5_1 = new StringBuilder().append("qd.N(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
        return stackIn_1_0;
    }

    final void b(byte param0) {
        try {
            this.field_n = ll.field_k.b((byte) -1);
            int var2_int = -91 % ((param0 - -12) / 44);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "qd.JA(" + param0 + ')');
        }
    }

    final void a(int param0, boolean param1, int param2, byte param3, int param4) {
        boolean stackIn_6_0 = false;
        int stackIn_30_0 = 0;
        int decompiledRegionSelector0 = 0;
        boolean stackOut_5_0;
        int statePc = 0;
        Throwable caughtException = null;
        ti[] var6 = null;
        RuntimeException var6_ref = null;
        int[] var7 = null;
        int var8 = 0;
        br var9_ref_br = null;
        int var9 = 0;
        ti var10 = null;
        int var11 = 0;
        int var12 = 0;
        wb var13 = null;
        int var14 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var14 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        g.field_a.setSeed((long)(param4 + ((param2 << 1155952741) + param0)));
                        if (param3 == -40) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        var6 = new ti[this.field_H.a(0)];
                        var7 = new int[this.field_H.a(0)];
                        d.a(var7, 0, var7.length, 32767);
                        var8 = 0;
                        var9_ref_br = this.field_H.c(94);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (!(var9_ref_br instanceof id)) {
                            statePc = 29;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = var9_ref_br instanceof ti;
                        stackIn_30_0 = stackOut_5_0 ? 1 : 0;
                        stackIn_6_0 = stackOut_5_0;
                        if (var14 != 0) {
                            statePc = 30;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (stackIn_6_0) {
                            statePc = 12;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var14 == 0) {
                            statePc = 28;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var10 = (ti) ((Object) var9_ref_br);
                        var11 = var10.g(108) + -param0;
                        var12 = -param2 + var10.h(-102);
                        if (14400 < var12 * var12 + var11 * var11) {
                            statePc = 28;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (!param1) {
                            statePc = 19;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var10 instanceof wb) {
                            statePc = 25;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var10 instanceof gm) {
                            statePc = 24;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var6[var8] = var10;
                        var7[var8] = var10.field_y;
                        var8++;
                        if (var14 == 0) {
                            statePc = 28;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var13 = (wb) ((Object) var10);
                        if ((var13.field_Lb ^ -1) == (param4 ^ -1)) {
                            statePc = 28;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var6[var8] = (ti) ((Object) var13);
                        var7[var8] = var13.field_y;
                        var8++;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var9_ref_br = this.field_H.b(6);
                        if (var14 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        vh.a(-7255, var7, var6);
                        stackIn_30_0 = 0;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var9 = stackIn_30_0;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (var8 <= var9) {
                            statePc = 44;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var10 = var6[var9];
                        if (var14 != 0) {
                            statePc = 44;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (!(var10 instanceof wb)) {
                            statePc = 39;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (op.field_m.b(param3 ^ -40, ((wb) ((Object) var10)).field_Lb)) {
                            statePc = 41;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var6[var9].e(param4, 2);
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var9++;
                        if (var14 == 0) {
                            statePc = 31;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 43: {
                    var6_ref = (RuntimeException) ((Object) caughtException);
                    throw fa.a((Throwable) ((Object) var6_ref), "qd.BA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
                }
                case 44: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void c(int param0) {
        try {
            ki.field_e = new no(wa.field_a, kc.field_c, jf.field_a, vo.field_m, jk.field_h, cm.field_b);
            if (param0 != 4024) {
                qd.a(-96, (fm) null, 119, -9, -35, -122, 29, (byte) 90, -18, -112, -60, -50, 117);
            }
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "qd.Q(" + param0 + ')');
        }
    }

    final void a(boolean param0, int param1, boolean param2) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            gj.a(param1 + -17333);
            if (this.field_lb) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                this.field_lb = true;
                if (param1 == 24295) {
                  break L1;
                } else {
                  this.d(27, 73);
                  break L1;
                }
              }
              bm.a(false, 10, 126, sp.field_g);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var4), "qd.LA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, byte param1, int param2) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (!na.b(param2, 20, param0)) {
              L1: {
                L2: {
                  if (iq.field_f) {
                    break L2;
                  } else {
                    if (this.field_I.b(param0, 0, param2)) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  L4: {
                    if (!this.field_I.a(20)) {
                      break L4;
                    } else {
                      if (this.field_mb == null) {
                        break L4;
                      } else {
                        if (!this.field_mb.i((byte) -15)) {
                          this.field_I.a(this.field_k.a(true, param0), this.field_mb, this.field_k.a(param2, 2), 122);
                          if (var5 == 0) {
                            break L3;
                          } else {
                            break L1;
                          }
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  L5: {
                    if (!this.field_I.a(20)) {
                      break L5;
                    } else {
                      if (this.field_b == null) {
                        break L5;
                      } else {
                        this.field_I.a(this.field_k.a(true, param0), this.field_b, this.field_k.a(param2, 2), 123);
                        if (var5 == 0) {
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  L6: {
                    if (!this.field_I.a(true)) {
                      break L6;
                    } else {
                      if (this.field_mb == null) {
                        break L6;
                      } else {
                        if (this.field_mb.i((byte) -58)) {
                          L7: {
                            if (this.field_I.a((byte) -126)) {
                              break L7;
                            } else {
                              this.b(-70);
                              break L7;
                            }
                          }
                          L8: {
                            this.field_Q.a(29664, this.field_mb);
                            if (!this.field_I.a((byte) -115)) {
                              this.field_mb.r(0);
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          this.field_I.a(this.field_k.a(true, param0), this.field_mb, this.field_k.a(param2, 2), 122);
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  L9: {
                    L10: {
                      if (!this.field_I.g(13)) {
                        break L10;
                      } else {
                        if (this.field_x != null) {
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                    if (!this.field_I.f(0)) {
                      L11: {
                        if (this.field_mb == null) {
                          break L11;
                        } else {
                          if (!this.field_mb.i((byte) -86)) {
                            break L11;
                          } else {
                            L12: {
                              if (lc.field_m[81]) {
                                break L12;
                              } else {
                                this.b(-51);
                                break L12;
                              }
                            }
                            this.field_mb.r(0);
                            this.field_Q.a(29664, this.field_mb);
                            iq.a(-3, (byte) 99);
                            if (var5 == 0) {
                              break L3;
                            } else {
                              break L11;
                            }
                          }
                        }
                      }
                      L13: {
                        L14: {
                          if ((this.field_n ^ -1) != -1) {
                            break L14;
                          } else {
                            if (-1 > (this.field_Q.a((byte) 98) ^ -1)) {
                              break L13;
                            } else {
                              break L14;
                            }
                          }
                        }
                        if (this.field_n == 1) {
                          this.b(-128);
                          if (var5 == 0) {
                            break L3;
                          } else {
                            break L13;
                          }
                        } else {
                          break L3;
                        }
                      }
                      if (this.field_I.a((byte) -127)) {
                        break L3;
                      } else {
                        if (-41 <= (param0 ^ -1)) {
                          break L3;
                        } else {
                          if (440 <= param0) {
                            break L3;
                          } else {
                            this.b((byte) 57, this.field_k.a(true, param0), this.field_k.a(param2, 2));
                            if (var5 == 0) {
                              break L3;
                            } else {
                              break L9;
                            }
                          }
                        }
                      }
                    } else {
                      if (bk.field_g) {
                        this.field_I.a(this.field_k.a(true, param0), this.field_x, this.field_k.a(param2, 2), 127);
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                  this.b(-56);
                  this.field_I.a(this.field_k.a(true, param0), this.field_x, this.field_k.a(param2, 2), 117);
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
                L15: {
                  if (param1 <= -97) {
                    break L15;
                  } else {
                    this.field_I = (ko) null;
                    break L15;
                  }
                }
                decompiledRegionSelector0 = 6;
                break L0;
              }
              en.a(-1, 1);
              decompiledRegionSelector0 = 5;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var4), "qd.CA(" + param0 + ',' + param1 + ',' + param2 + ')');
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
                    return;
                  }
                }
              }
            }
          }
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        boolean discarded$0 = false;
        try {
            op.field_m.field_A.a(new cg(param3, param1, param2), false);
            if (param0 < 79) {
                discarded$0 = this.c((byte) -123);
            }
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "qd.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(byte param0, int param1, int param2) {
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var4_int = 0;
        id var4 = null;
        br var4_ref = null;
        RuntimeException var4_ref2 = null;
        wb var5 = null;
        int var6 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        op.field_m.field_l = param1;
                        if (param0 <= -8) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.b((byte) -48);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var4_int = op.field_m.field_l;
                        if (var4_int == 0) {
                            statePc = 44;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (2 == var4_int) {
                            statePc = 17;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var4_int == 1) {
                            statePc = 44;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (3 != var4_int) {
                            statePc = 44;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var6 == 0) {
                            statePc = 32;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (df.field_I) {
                            statePc = 22;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        wb.l((byte) -68);
                        bm.a(false, 15, 125, sp.field_g);
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 23: {
                    return;
                }
                case 24: {
                    try {
                        var4 = (id) ((Object) this.field_c.c((byte) 91));
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (null == var4) {
                            statePc = 30;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        ((h) ((Object) var4)).c(2, 49951);
                        var4 = (id) ((Object) this.field_c.b((byte) 117));
                        if (var6 != 0) {
                            statePc = 31;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (var6 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        op.field_m.field_C = param2;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        we.field_g[7] = pi.field_b;
                        var4_ref = op.field_m.field_K.c(86);
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (null == var4_ref) {
                            statePc = 44;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (var6 != 0) {
                            statePc = 44;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (!(var4_ref instanceof wb)) {
                            statePc = 41;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var5 = (wb) ((Object) var4_ref);
                        if (var5.field_K == 21) {
                            statePc = 41;
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
                        var5.b(4, -27655);
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var4_ref = op.field_m.field_K.b(6);
                        if (var6 == 0) {
                            statePc = 33;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 43: {
                    var4_ref2 = (RuntimeException) ((Object) caughtException);
                    throw fa.a((Throwable) ((Object) var4_ref2), "qd.AA(" + param0 + ',' + param1 + ',' + param2 + ')');
                }
                case 44: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void b(boolean param0, int param1) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        boolean stackIn_71_0 = false;
        boolean stackIn_78_0 = false;
        int stackIn_89_0 = 0;
        int stackIn_103_0 = 0;
        int stackIn_103_1 = 0;
        int stackIn_105_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_108_1 = 0;
        int stackIn_110_0 = 0;
        int stackIn_110_1 = 0;
        int stackIn_110_2 = 0;
        int stackIn_110_3 = 0;
        int stackIn_112_0 = 0;
        int stackIn_112_1 = 0;
        int stackIn_112_2 = 0;
        int stackIn_112_3 = 0;
        int stackIn_113_0 = 0;
        int stackIn_113_1 = 0;
        int stackIn_113_2 = 0;
        int stackIn_113_3 = 0;
        int stackIn_113_4 = 0;
        int stackIn_117_0 = 0;
        int stackIn_121_0 = 0;
        boolean stackIn_153_0 = false;
        boolean stackIn_155_0 = false;
        int stackIn_164_0 = 0;
        boolean stackIn_191_0 = false;
        int stackIn_241_0 = 0;
        int stackIn_245_0 = 0;
        int stackIn_245_1 = 0;
        int stackIn_260_0 = 0;
        int stackIn_261_0 = 0;
        int stackIn_261_1 = 0;
        int stackIn_348_0 = 0;
        int stackIn_349_0 = 0;
        int stackIn_349_1 = 0;
        int stackIn_351_0 = 0;
        int stackIn_351_1 = 0;
        int stackIn_352_0 = 0;
        int stackIn_352_1 = 0;
        int stackIn_352_2 = 0;
        Throwable caughtException = null;
        boolean stackOut_152_0;
        boolean stackOut_190_0;
        int statePc = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        lc var7_ref_lc = null;
        int var7 = 0;
        wb var7_ref_wb = null;
        int var8_int = 0;
        sl var8 = null;
        int var9_int = 0;
        int[] var9 = null;
        String var9_ref = null;
        ae var9_ref2 = null;
        int var10 = 0;
        wb var10_ref_wb = null;
        h var10_ref_h = null;
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
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var20 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    g.c(ki.field_k);
                    if (he.field_a) {
                        statePc = 5;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    oo.h(0, 40, (int)(640.0f * this.field_k.field_d), (int)(480.0f * this.field_k.field_d) + -40);
                    if (var20 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    oo.c();
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    var3_int = 0;
                    var4 = 0;
                    var5 = oa.a((byte) 71);
                    if ((var5 ^ -1) < -1) {
                        statePc = 12;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var3_int = this.field_k.field_k;
                    var4 = this.field_k.field_g;
                    if (null == lp.field_k) {
                        statePc = 18;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    aa.a(true, lp.field_k);
                    lp.field_k = null;
                    if (var20 == 0) {
                        statePc = 18;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (null != lp.field_k) {
                        statePc = 17;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    lp.field_k = wc.b(-1, 89);
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    lp.field_k.h(20 * var5 * db.field_c / 256);
                    var3_int = -(var5 / 2) + (this.field_k.field_k + hp.a((byte) -123, qf.field_a, var5));
                    var4 = -(var5 / 2) + (this.field_k.field_g + hp.a((byte) 36, qf.field_a, var5));
                    this.field_k.field_g = var4;
                    this.field_k.field_k = var3_int;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    this.field_u.a((byte) 111, this.field_k);
                    var6 = op.field_m.field_A.c(98);
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if (null == var6) {
                        statePc = 24;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    ((cg) (var6)).a(this.field_k, param1 + 58);
                    var6 = op.field_m.field_A.b(6);
                    if (var20 != 0) {
                        statePc = 25;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if (var20 == 0) {
                        statePc = 19;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    var6 = this.field_cb.c(122);
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    if (var6 == null) {
                        statePc = 30;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    ((rj) (var6)).a(-10136, this.field_k);
                    var6 = this.field_cb.b(6);
                    if (var20 != 0) {
                        statePc = 37;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    if (var20 == 0) {
                        statePc = 25;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    var6 = this.field_c.c((byte) 104);
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    if (null == var6) {
                        statePc = 36;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    ((h) (var6)).a(this.field_k, 13542477);
                    var6 = this.field_c.b((byte) 101);
                    if (var20 != 0) {
                        statePc = 37;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    if (var20 == 0) {
                        statePc = 31;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    var6 = op.field_m.field_G.c(113);
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    if (var6 == null) {
                        statePc = 42;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    ((pq) (var6)).a(255, this.field_k);
                    var6 = op.field_m.field_G.b(param1 ^ 7);
                    if (var20 != 0) {
                        statePc = 43;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    if (var20 == 0) {
                        statePc = 37;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    this.field_u.a(param1, false, this.field_k, -1);
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    var6 = op.field_m.field_s.c(param1 ^ 116);
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    if (var6 == null) {
                        statePc = 49;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    ((ce) (var6)).a((byte) 19, this.field_k);
                    var6 = op.field_m.field_s.b(param1 ^ 7);
                    if (var20 != 0) {
                        statePc = 50;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    if (var20 == 0) {
                        statePc = 44;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    var6 = this.field_H.c(48);
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    if (var6 == null) {
                        statePc = 55;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    ((id) (var6)).a(-10136, this.field_k);
                    var6 = this.field_H.b(param1 ^ 7);
                    if (var20 != 0) {
                        statePc = 56;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    if (var20 == 0) {
                        statePc = 50;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    var6 = this.field_kb.c(103);
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    if (null == var6) {
                        statePc = 61;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    ((mg) (var6)).a(-10136, this.field_k);
                    var6 = this.field_kb.b(6);
                    if (var20 != 0) {
                        statePc = 62;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    if (var20 == 0) {
                        statePc = 56;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    var6 = this.field_O.c(88);
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    if (var6 == null) {
                        statePc = 67;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    ((lj) (var6)).a((byte) 103, this.field_k);
                    var6 = this.field_O.b(6);
                    if (var20 != 0) {
                        statePc = 68;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    if (var20 == 0) {
                        statePc = 62;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    this.field_u.a(2, false, this.field_k, -1);
                    this.field_u.a(3, false, this.field_k, -1);
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    var6 = this.field_C.c(param1 + 107);
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    if (var6 == null) {
                        statePc = 77;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    var7_ref_lc = (lc) (var6);
                    stackIn_78_0 = var7_ref_lc.a(16711680, this.field_k);
                    stackIn_71_0 = stackIn_78_0;
                    if (var20 != 0) {
                        statePc = 78;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    if (stackIn_71_0) {
                        statePc = 76;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    var7_ref_lc.a(true);
                    this.field_X.a(var7_ref_lc, false);
                    statePc = 76;
                    continue stateLoop;
                }
                case 76: {
                    var6 = this.field_C.b(6);
                    if (var20 == 0) {
                        statePc = 69;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    stackIn_78_0 = gf.field_h;
                    statePc = 78;
                    continue stateLoop;
                }
                case 78: {
                    if (stackIn_78_0) {
                        statePc = 135;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    var7 = this.field_I.b(false);
                    if (-1 <= (var7 ^ -1)) {
                        statePc = 116;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    if (6 == wf.field_t) {
                        statePc = 116;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    if ((this.field_I.e(-1) ^ -1) != -10) {
                        statePc = 88;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    stackIn_89_0 = 1;
                    statePc = 89;
                    continue stateLoop;
                }
                case 88: {
                    stackIn_89_0 = 0;
                    statePc = 89;
                    continue stateLoop;
                }
                case 89: {
                    var8_int = stackIn_89_0;
                    var9_int = this.field_k.a(-(int)((float)(24 * var7) / this.field_k.field_d) + bd.field_g, 2);
                    var10 = this.field_k.a(true, bo.field_d - (int)((float)(var7 * 24) / this.field_k.field_d));
                    var11 = var9_int / 24;
                    var12 = var10 / 24;
                    var13 = var12 - -(2 * var7);
                    var14 = var11 - -(2 * var7);
                    if (var13 > this.field_u.field_i.field_e) {
                        statePc = 92;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 92: {
                    var13 = this.field_u.field_i.field_e;
                    statePc = 93;
                    continue stateLoop;
                }
                case 93: {
                    if (-1 >= (var12 ^ -1)) {
                        statePc = 95;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    var12 = 0;
                    statePc = 95;
                    continue stateLoop;
                }
                case 95: {
                    if (0 > var11) {
                        statePc = 98;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 98: {
                    var11 = 0;
                    statePc = 99;
                    continue stateLoop;
                }
                case 99: {
                    if ((this.field_u.field_i.field_d ^ -1) <= (var14 ^ -1)) {
                        statePc = 101;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 100: {
                    var14 = this.field_u.field_i.field_d;
                    statePc = 101;
                    continue stateLoop;
                }
                case 101: {
                    var15 = var12;
                    statePc = 102;
                    continue stateLoop;
                }
                case 102: {
                    stackIn_103_0 = var15 ^ -1;
                    stackIn_103_1 = var13 ^ -1;
                    statePc = 103;
                    continue stateLoop;
                }
                case 103: {
                    if (stackIn_103_0 <= stackIn_103_1) {
                        statePc = 116;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    stackIn_117_0 = var11;
                    stackIn_105_0 = stackIn_117_0;
                    if (var20 != 0) {
                        statePc = 117;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 105: {
                    var16 = stackIn_105_0;
                    statePc = 106;
                    continue stateLoop;
                }
                case 106: {
                    if ((var14 ^ -1) >= (var16 ^ -1)) {
                        statePc = 115;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    var17 = this.field_u.a(var16, var15, (byte) -116);
                    stackIn_103_0 = 0;
                    stackIn_108_0 = stackIn_103_0;
                    stackIn_103_1 = -2147483648 & var17;
                    stackIn_108_1 = stackIn_103_1;
                    if (var20 != 0) {
                        statePc = 103;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    if (stackIn_108_0 != stackIn_108_1) {
                        statePc = 114;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    var18 = this.field_k.c(24 * var16, -20126);
                    var19 = this.field_k.d(24 * var15, param1 + 107);
                    stackIn_112_0 = var18;
                    stackIn_110_0 = stackIn_112_0;
                    stackIn_112_1 = var19;
                    stackIn_110_1 = stackIn_112_1;
                    stackIn_112_2 = 24;
                    stackIn_110_2 = stackIn_112_2;
                    stackIn_112_3 = 24;
                    stackIn_110_3 = stackIn_112_3;
                    if (var8_int != 0) {
                        statePc = 112;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    stackIn_113_0 = stackIn_110_0;
                    stackIn_113_1 = stackIn_110_1;
                    stackIn_113_2 = stackIn_110_2;
                    stackIn_113_3 = stackIn_110_3;
                    stackIn_113_4 = 3390259;
                    statePc = 113;
                    continue stateLoop;
                }
                case 112: {
                    stackIn_113_0 = stackIn_112_0;
                    stackIn_113_1 = stackIn_112_1;
                    stackIn_113_2 = stackIn_112_2;
                    stackIn_113_3 = stackIn_112_3;
                    stackIn_113_4 = 12272691;
                    statePc = 113;
                    continue stateLoop;
                }
                case 113: {
                    oo.f(stackIn_113_0, stackIn_113_1, stackIn_113_2, stackIn_113_3, stackIn_113_4, 128);
                    statePc = 114;
                    continue stateLoop;
                }
                case 114: {
                    var16++;
                    if (var20 == 0) {
                        statePc = 106;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    var15++;
                    if (var20 == 0) {
                        statePc = 102;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 116: {
                    stackIn_117_0 = 15;
                    statePc = 117;
                    continue stateLoop;
                }
                case 117: {
                    if (stackIn_117_0 != this.field_I.e(-1)) {
                        statePc = 120;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 118: {
                    stackIn_121_0 = 1;
                    statePc = 121;
                    continue stateLoop;
                }
                case 120: {
                    stackIn_121_0 = 0;
                    statePc = 121;
                    continue stateLoop;
                }
                case 121: {
                    var8_int = stackIn_121_0;
                    if (var8_int == 0) {
                        statePc = 135;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    var9_int = this.field_k.a(bd.field_g + -(int)((float)(var7 * 24) / this.field_k.field_d), 2);
                    var10 = this.field_k.a(true, bo.field_d - (int)((float)(24 * var7) / this.field_k.field_d));
                    var11 = var9_int / 24;
                    var12 = var10 / 24;
                    var13 = var7 * 2 + var12;
                    if ((var13 ^ -1) < (this.field_u.field_i.field_e ^ -1)) {
                        statePc = 125;
                    } else {
                        statePc = 126;
                    }
                    continue stateLoop;
                }
                case 125: {
                    var13 = this.field_u.field_i.field_e;
                    statePc = 126;
                    continue stateLoop;
                }
                case 126: {
                    var14 = 2 * var7 + var11;
                    if (0 <= var12) {
                        statePc = 128;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 127: {
                    var12 = 0;
                    statePc = 128;
                    continue stateLoop;
                }
                case 128: {
                    if (var11 >= 0) {
                        statePc = 130;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    var11 = 0;
                    statePc = 130;
                    continue stateLoop;
                }
                case 130: {
                    if ((this.field_u.field_i.field_d ^ -1) > (var14 ^ -1)) {
                        statePc = 133;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 133: {
                    var14 = this.field_u.field_i.field_d;
                    statePc = 134;
                    continue stateLoop;
                }
                case 134: {
                    var15 = var14 + var11 >> 651265057;
                    var16 = var12 - -var13 >> -2065404287;
                    var17 = this.field_k.c(24 * var15, -20126);
                    var18 = this.field_k.d(var16 * 24, 126);
                    oo.d(var17, var18, 120, 0, 128);
                    statePc = 135;
                    continue stateLoop;
                }
                case 135: {
                    if ((1280 / ke.field_b ^ -1) == (so.field_l.field_x ^ -1)) {
                        statePc = 143;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 136: {
                    if (-3 >= (kj.field_q ^ -1)) {
                        statePc = 141;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 141: {
                    System.out.println("realloc influence buffer, detail " + ke.field_b);
                    statePc = 142;
                    continue stateLoop;
                }
                case 142: {
                    so.field_l = new ja(1280 / ke.field_b, 960 / ke.field_b);
                    statePc = 143;
                    continue stateLoop;
                }
                case 143: {
                    if (!gf.field_h) {
                        statePc = 160;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    var7 = 0;
                    statePc = 145;
                    continue stateLoop;
                }
                case 145: {
                    if ((op.field_m.field_m.length ^ -1) >= (var7 ^ -1)) {
                        statePc = 150;
                    } else {
                        statePc = 146;
                    }
                    continue stateLoop;
                }
                case 146: {
                    op.field_m.field_m[var7] = 0;
                    var7++;
                    if (var20 != 0) {
                        statePc = 151;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    if (var20 == 0) {
                        statePc = 145;
                    } else {
                        statePc = 150;
                    }
                    continue stateLoop;
                }
                case 150: {
                    var6 = this.field_H.c(123);
                    statePc = 151;
                    continue stateLoop;
                }
                case 151: {
                    if (var6 == null) {
                        statePc = 252;
                    } else {
                        statePc = 152;
                    }
                    continue stateLoop;
                }
                case 152: {
                    stackOut_152_0 = var6 instanceof wb;
                    stackIn_260_0 = stackOut_152_0 ? 1 : 0;
                    stackIn_153_0 = stackOut_152_0;
                    if (var20 != 0) {
                        statePc = 260;
                    } else {
                        statePc = 153;
                    }
                    continue stateLoop;
                }
                case 153: {
                    stackIn_155_0 = stackIn_153_0;
                    statePc = 155;
                    continue stateLoop;
                }
                case 155: {
                    if (!stackIn_155_0) {
                        statePc = 159;
                    } else {
                        statePc = 158;
                    }
                    continue stateLoop;
                }
                case 158: {
                    var7_ref_wb = (wb) (var6);
                    op.field_m.field_m[var7_ref_wb.field_Lb] = op.field_m.field_m[var7_ref_wb.field_Lb] + 1;
                    statePc = 159;
                    continue stateLoop;
                }
                case 159: {
                    var6 = this.field_H.b(6);
                    if (var20 == 0) {
                        statePc = 151;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                case 160: {
                    var7 = 4210753;
                    if (-2 == (ll.field_k.field_k ^ -1)) {
                        statePc = 163;
                    } else {
                        statePc = 161;
                    }
                    continue stateLoop;
                }
                case 161: {
                    stackIn_164_0 = 1;
                    statePc = 164;
                    continue stateLoop;
                }
                case 163: {
                    stackIn_164_0 = 0;
                    statePc = 164;
                    continue stateLoop;
                }
                case 164: {
                    var8_int = stackIn_164_0;
                    if (var8_int != 0) {
                        statePc = 167;
                    } else {
                        statePc = 181;
                    }
                    continue stateLoop;
                }
                case 167: {
                    var9 = so.field_l.field_B;
                    var10 = 0;
                    var11 = so.field_l.field_x * so.field_l.field_w - 7;
                    statePc = 168;
                    continue stateLoop;
                }
                case 168: {
                    if (var10 >= var11) {
                        statePc = 173;
                    } else {
                        statePc = 169;
                    }
                    continue stateLoop;
                }
                case 169: {
                    incrementValue$0 = var10;
                    var10++;
                    var9[incrementValue$0] = var7;
                    incrementValue$1 = var10;
                    var10++;
                    var9[incrementValue$1] = var7;
                    incrementValue$2 = var10;
                    var10++;
                    var9[incrementValue$2] = var7;
                    incrementValue$3 = var10;
                    var10++;
                    var9[incrementValue$3] = var7;
                    incrementValue$4 = var10;
                    var10++;
                    var9[incrementValue$4] = var7;
                    incrementValue$5 = var10;
                    var10++;
                    var9[incrementValue$5] = var7;
                    incrementValue$6 = var10;
                    var10++;
                    var9[incrementValue$6] = var7;
                    incrementValue$7 = var10;
                    var10++;
                    var9[incrementValue$7] = var7;
                    if (var20 != 0) {
                        statePc = 174;
                    } else {
                        statePc = 170;
                    }
                    continue stateLoop;
                }
                case 170: {
                    if (var20 == 0) {
                        statePc = 168;
                    } else {
                        statePc = 173;
                    }
                    continue stateLoop;
                }
                case 173: {
                    var11 += 7;
                    statePc = 174;
                    continue stateLoop;
                }
                case 174: {
                    if (var10 >= var11) {
                        statePc = 181;
                    } else {
                        statePc = 175;
                    }
                    continue stateLoop;
                }
                case 175: {
                    incrementValue$8 = var10;
                    var10++;
                    var9[incrementValue$8] = var7;
                    if (var20 != 0) {
                        statePc = 252;
                    } else {
                        statePc = 178;
                    }
                    continue stateLoop;
                }
                case 178: {
                    if (var20 == 0) {
                        statePc = 174;
                    } else {
                        statePc = 181;
                    }
                    continue stateLoop;
                }
                case 181: {
                    var9_int = 0;
                    statePc = 182;
                    continue stateLoop;
                }
                case 182: {
                    if ((op.field_m.field_m.length ^ -1) >= (var9_int ^ -1)) {
                        statePc = 187;
                    } else {
                        statePc = 183;
                    }
                    continue stateLoop;
                }
                case 183: {
                    op.field_m.field_m[var9_int] = 0;
                    var9_int++;
                    if (var20 != 0) {
                        statePc = 188;
                    } else {
                        statePc = 184;
                    }
                    continue stateLoop;
                }
                case 184: {
                    if (var20 == 0) {
                        statePc = 182;
                    } else {
                        statePc = 187;
                    }
                    continue stateLoop;
                }
                case 187: {
                    var9_int = 350;
                    var9_int = var9_int / ke.field_b;
                    statePc = 188;
                    continue stateLoop;
                }
                case 188: {
                    var6 = this.field_H.c(param1 + 113);
                    statePc = 189;
                    continue stateLoop;
                }
                case 189: {
                    if (null == var6) {
                        statePc = 240;
                    } else {
                        statePc = 190;
                    }
                    continue stateLoop;
                }
                case 190: {
                    stackOut_190_0 = var6 instanceof wb;
                    stackIn_241_0 = stackOut_190_0 ? 1 : 0;
                    stackIn_191_0 = stackOut_190_0;
                    if (var20 != 0) {
                        statePc = 241;
                    } else {
                        statePc = 191;
                    }
                    continue stateLoop;
                }
                case 191: {
                    if (!stackIn_191_0) {
                        statePc = 239;
                    } else {
                        statePc = 194;
                    }
                    continue stateLoop;
                }
                case 194: {
                    var10_ref_wb = (wb) (var6);
                    var11 = this.field_k.c(var10_ref_wb.g(-79), -20126);
                    var12 = this.field_k.d(var10_ref_wb.h(-71), 114);
                    op.field_m.field_m[var10_ref_wb.field_Lb] = op.field_m.field_m[var10_ref_wb.field_Lb] + 1;
                    if (var10_ref_wb.field_K == 4) {
                        statePc = 204;
                    } else {
                        statePc = 195;
                    }
                    continue stateLoop;
                }
                case 195: {
                    if (-6 == (var10_ref_wb.field_K ^ -1)) {
                        statePc = 204;
                    } else {
                        statePc = 198;
                    }
                    continue stateLoop;
                }
                case 198: {
                    if (22 == var10_ref_wb.field_K) {
                        statePc = 204;
                    } else {
                        statePc = 201;
                    }
                    continue stateLoop;
                }
                case 201: {
                    if ((var10_ref_wb.field_Ib ^ -1) >= (op.field_m.field_H ^ -1)) {
                        statePc = 226;
                    } else {
                        statePc = 204;
                    }
                    continue stateLoop;
                }
                case 204: {
                    var10_ref_wb.a(true, this.field_k);
                    if (-1 != ((var10_ref_wb.field_Ib + var10_ref_wb.field_y) % 7 ^ -1)) {
                        statePc = 226;
                    } else {
                        statePc = 207;
                    }
                    continue stateLoop;
                }
                case 207: {
                    if ((var10_ref_wb.field_K ^ -1) != -6) {
                        statePc = 226;
                    } else {
                        statePc = 210;
                    }
                    continue stateLoop;
                }
                case 210: {
                    if ((var10_ref_wb.field_Ib ^ -1) >= (op.field_m.field_H ^ -1)) {
                        statePc = 226;
                    } else {
                        statePc = 213;
                    }
                    continue stateLoop;
                }
                case 213: {
                    var13 = (3 + var10_ref_wb.field_y) * var10_ref_wb.field_Ib % he.field_b.length;
                    if (0 != var13) {
                        statePc = 217;
                    } else {
                        statePc = 214;
                    }
                    continue stateLoop;
                }
                case 214: {
                    if (!q.field_b) {
                        statePc = 224;
                    } else {
                        statePc = 217;
                    }
                    continue stateLoop;
                }
                case 217: {
                    if ((var13 ^ -1) != -2) {
                        statePc = 225;
                    } else {
                        statePc = 220;
                    }
                    continue stateLoop;
                }
                case 220: {
                    if (!q.field_b) {
                        statePc = 225;
                    } else {
                        statePc = 223;
                    }
                    continue stateLoop;
                }
                case 223: {
                    var13 = 0;
                    if (var20 == 0) {
                        statePc = 225;
                    } else {
                        statePc = 224;
                    }
                    continue stateLoop;
                }
                case 224: {
                    var13 = 1;
                    statePc = 225;
                    continue stateLoop;
                }
                case 225: {
                    pb.field_e.a(he.field_b[var13], var11, -48 + var12, 14540253, 0, 253);
                    statePc = 226;
                    continue stateLoop;
                }
                case 226: {
                    if (var8_int != 0) {
                        statePc = 229;
                    } else {
                        statePc = 239;
                    }
                    continue stateLoop;
                }
                case 229: {
                    if (var10_ref_wb.field_K == 9) {
                        statePc = 239;
                    } else {
                        statePc = 230;
                    }
                    continue stateLoop;
                }
                case 230: {
                    if (var10_ref_wb.field_K == 21) {
                        statePc = 239;
                    } else {
                        statePc = 233;
                    }
                    continue stateLoop;
                }
                case 233: {
                    if (var10_ref_wb.i((byte) 0)) {
                        statePc = 238;
                    } else {
                        statePc = 239;
                    }
                    continue stateLoop;
                }
                case 238: {
                    g.c(so.field_l);
                    oo.d(var11 / ke.field_b, var12 / ke.field_b, var9_int, 0);
                    g.d();
                    statePc = 239;
                    continue stateLoop;
                }
                case 239: {
                    var6 = this.field_H.b(6);
                    if (var20 == 0) {
                        statePc = 189;
                    } else {
                        statePc = 240;
                    }
                    continue stateLoop;
                }
                case 240: {
                    stackIn_241_0 = var8_int;
                    statePc = 241;
                    continue stateLoop;
                }
                case 241: {
                    if (stackIn_241_0 == 0) {
                        statePc = 251;
                    } else {
                        statePc = 242;
                    }
                    continue stateLoop;
                }
                case 242: {
                    g.c(so.field_l);
                    var10_ref_h = this.field_o;
                    var11 = this.field_k.c(var10_ref_h.g(param1 + -97), param1 + -20127);
                    var12 = this.field_k.d(var10_ref_h.h(-51), 108);
                    oo.d(var11 / ke.field_b, var12 / ke.field_b, var9_int, 0);
                    var6 = this.field_c.c((byte) 127);
                    statePc = 243;
                    continue stateLoop;
                }
                case 243: {
                    if (var6 == null) {
                        statePc = 250;
                    } else {
                        statePc = 244;
                    }
                    continue stateLoop;
                }
                case 244: {
                    var10_ref_h = (h) (var6);
                    stackIn_261_0 = var10_ref_h.field_I ^ -1;
                    stackIn_245_0 = stackIn_261_0;
                    stackIn_261_1 = this.field_M ^ -1;
                    stackIn_245_1 = stackIn_261_1;
                    if (var20 != 0) {
                        statePc = 261;
                    } else {
                        statePc = 245;
                    }
                    continue stateLoop;
                }
                case 245: {
                    if (stackIn_245_0 == stackIn_245_1) {
                        statePc = 249;
                    } else {
                        statePc = 248;
                    }
                    continue stateLoop;
                }
                case 248: {
                    var11 = this.field_k.c(var10_ref_h.g(param1 ^ -82), -20126);
                    var12 = this.field_k.d(var10_ref_h.h(103), 121);
                    oo.d(var11 / ke.field_b, var12 / ke.field_b, var9_int, var7);
                    statePc = 249;
                    continue stateLoop;
                }
                case 249: {
                    var6 = this.field_c.b((byte) 96);
                    if (var20 == 0) {
                        statePc = 243;
                    } else {
                        statePc = 250;
                    }
                    continue stateLoop;
                }
                case 250: {
                    g.d();
                    so.field_l.a(0, 0, 1280, 960, 104);
                    statePc = 251;
                    continue stateLoop;
                }
                case 251: {
                    this.field_J.a(this.field_k, (byte) 36);
                    statePc = 252;
                    continue stateLoop;
                }
                case 252: {
                    var6 = this.field_T.c(104);
                    statePc = 253;
                    continue stateLoop;
                }
                case 253: {
                    if (null == var6) {
                        statePc = 258;
                    } else {
                        statePc = 254;
                    }
                    continue stateLoop;
                }
                case 254: {
                    ((wc) (var6)).a(-10136, this.field_k);
                    var6 = this.field_T.b(6);
                    if (var20 != 0) {
                        statePc = 259;
                    } else {
                        statePc = 255;
                    }
                    continue stateLoop;
                }
                case 255: {
                    if (var20 == 0) {
                        statePc = 253;
                    } else {
                        statePc = 258;
                    }
                    continue stateLoop;
                }
                case 258: {
                    g.d();
                    g.c();
                    this.a(true);
                    g.b();
                    statePc = 259;
                    continue stateLoop;
                }
                case 259: {
                    stackIn_260_0 = ub.p(-91);
                    statePc = 260;
                    continue stateLoop;
                }
                case 260: {
                    var7 = stackIn_260_0;
                    stackIn_261_0 = -1;
                    stackIn_261_1 = var7 ^ -1;
                    statePc = 261;
                    continue stateLoop;
                }
                case 261: {
                    if (stackIn_261_0 <= stackIn_261_1) {
                        statePc = 275;
                    } else {
                        statePc = 262;
                    }
                    continue stateLoop;
                }
                case 262: {
                    if (this.field_S == null) {
                        statePc = 267;
                    } else {
                        statePc = 268;
                    }
                    continue stateLoop;
                }
                case 267: {
                    g.c(this.field_B);
                    this.field_S = new ea();
                    g.d();
                    this.field_i = nk.a(16777215, param1 + 455739623, 8401072);
                    statePc = 268;
                    continue stateLoop;
                }
                case 268: {
                    if (0 == (wf.field_m & 1)) {
                        statePc = 271;
                    } else {
                        statePc = 272;
                    }
                    continue stateLoop;
                }
                case 271: {
                    g.c(this.field_B);
                    this.field_i = nk.a(2154560, 455739624, 16724223);
                    oo.b();
                    oo.e(0, 0, oo.field_b, oo.field_l, 1);
                    this.field_S.a(1, (double)wf.field_m / 6.25, this.field_i);
                    g.d();
                    statePc = 272;
                    continue stateLoop;
                }
                case 272: {
                    var8_int = 132;
                    if ((var8_int ^ -1) >= (var7 * 3 ^ -1)) {
                        statePc = 274;
                    } else {
                        statePc = 273;
                    }
                    continue stateLoop;
                }
                case 273: {
                    var8_int = var7 * 3;
                    statePc = 274;
                    continue stateLoop;
                }
                case 274: {
                    this.field_B.a(5, 40, 630, 400, 32 - -var8_int);
                    statePc = 275;
                    continue stateLoop;
                }
                case 275: {
                    if (!this.field_eb) {
                        statePc = 281;
                    } else {
                        statePc = 276;
                    }
                    continue stateLoop;
                }
                case 276: {
                    if (this.field_w) {
                        statePc = 281;
                    } else {
                        statePc = 279;
                    }
                    continue stateLoop;
                }
                case 279: {
                    pp.field_q[8].a(bd.field_g - 12, -12 + bo.field_d);
                    statePc = 281;
                    continue stateLoop;
                }
                case 281: {
                    if (!this.field_eb) {
                        statePc = 292;
                    } else {
                        statePc = 282;
                    }
                    continue stateLoop;
                }
                case 282: {
                    if (!this.field_w) {
                        statePc = 292;
                    } else {
                        statePc = 285;
                    }
                    continue stateLoop;
                }
                case 285: {
                    var10 = bd.field_g - this.field_F;
                    var11 = -this.field_p + bo.field_d;
                    if (-1 >= (var10 ^ -1)) {
                        statePc = 287;
                    } else {
                        statePc = 286;
                    }
                    continue stateLoop;
                }
                case 286: {
                    var10 = -var10;
                    var8_int = bd.field_g;
                    if (var20 == 0) {
                        statePc = 288;
                    } else {
                        statePc = 287;
                    }
                    continue stateLoop;
                }
                case 287: {
                    var8_int = this.field_F;
                    statePc = 288;
                    continue stateLoop;
                }
                case 288: {
                    if (-1 >= (var11 ^ -1)) {
                        statePc = 290;
                    } else {
                        statePc = 289;
                    }
                    continue stateLoop;
                }
                case 289: {
                    var11 = -var11;
                    var9_int = bo.field_d;
                    if (var20 == 0) {
                        statePc = 291;
                    } else {
                        statePc = 290;
                    }
                    continue stateLoop;
                }
                case 290: {
                    var9_int = this.field_p;
                    statePc = 291;
                    continue stateLoop;
                }
                case 291: {
                    oo.a(var8_int, var9_int, var10, var11, 16777215);
                    oo.h(var8_int + 1, 1 + var9_int, -2 + var10, var11 - 2, 10066431, 32);
                    oo.f(2 + var8_int, var9_int - -2, -4 + var10, -4 + var11, 3355647, 32);
                    statePc = 292;
                    continue stateLoop;
                }
                case 292: {
                    var8 = ah.field_e;
                    if (0 == op.field_m.field_l) {
                        statePc = 340;
                    } else {
                        statePc = 293;
                    }
                    continue stateLoop;
                }
                case 293: {
                    if (3 != op.field_m.field_l) {
                        statePc = 302;
                    } else {
                        statePc = 296;
                    }
                    continue stateLoop;
                }
                case 296: {
                    if (-226 < (this.field_d ^ -1)) {
                        statePc = 301;
                    } else {
                        statePc = 357;
                    }
                    continue stateLoop;
                }
                case 301: {
                    var8.b(tm.field_g, 320, 240, 2, -1);
                    if (var20 == 0) {
                        statePc = 357;
                    } else {
                        statePc = 302;
                    }
                    continue stateLoop;
                }
                case 302: {
                    if (gf.field_h) {
                        statePc = 314;
                    } else {
                        statePc = 305;
                    }
                    continue stateLoop;
                }
                case 305: {
                    if ((op.field_m.field_l ^ -1) != -2) {
                        statePc = 314;
                    } else {
                        statePc = 308;
                    }
                    continue stateLoop;
                }
                case 308: {
                    if (op.field_m.field_H >= 500) {
                        statePc = 314;
                    } else {
                        statePc = 311;
                    }
                    continue stateLoop;
                }
                case 311: {
                    var8.b(up.field_c, 320, 240, 0, -1);
                    this.field_k.field_f = false;
                    if (var20 == 0) {
                        statePc = 357;
                    } else {
                        statePc = 314;
                    }
                    continue stateLoop;
                }
                case 314: {
                    if ((op.field_m.field_l ^ -1) != -3) {
                        statePc = 357;
                    } else {
                        statePc = 317;
                    }
                    continue stateLoop;
                }
                case 317: {
                    var9_int = op.field_m.field_C + -op.field_m.field_H;
                    if (-1551 >= (var9_int ^ -1)) {
                        statePc = 327;
                    } else {
                        statePc = 318;
                    }
                    continue stateLoop;
                }
                case 318: {
                    if (!gf.field_h) {
                        statePc = 324;
                    } else {
                        statePc = 321;
                    }
                    continue stateLoop;
                }
                case 321: {
                    var8.b(gn.field_E, 320, 120, 0, -1);
                    if (var20 == 0) {
                        statePc = 339;
                    } else {
                        statePc = 324;
                    }
                    continue stateLoop;
                }
                case 324: {
                    var8.b(sm.field_f, 320, 120, 0, -1);
                    if (var20 == 0) {
                        statePc = 339;
                    } else {
                        statePc = 327;
                    }
                    continue stateLoop;
                }
                case 327: {
                    if (-2751 <= (var9_int ^ -1)) {
                        statePc = 339;
                    } else {
                        statePc = 330;
                    }
                    continue stateLoop;
                }
                case 330: {
                    if (var9_int >= 2950) {
                        statePc = 339;
                    } else {
                        statePc = 333;
                    }
                    continue stateLoop;
                }
                case 333: {
                    if (!gf.field_h) {
                        statePc = 338;
                    } else {
                        statePc = 339;
                    }
                    continue stateLoop;
                }
                case 338: {
                    var8.b(ng.field_c, 320, 120, 0, -1);
                    statePc = 339;
                    continue stateLoop;
                }
                case 339: {
                    if (var20 == 0) {
                        statePc = 357;
                    } else {
                        statePc = 340;
                    }
                    continue stateLoop;
                }
                case 340: {
                    if (this.field_l > 0) {
                        statePc = 344;
                    } else {
                        statePc = 343;
                    }
                    continue stateLoop;
                }
                case 343: {
                    var9_ref = pj.field_J;
                    ah.field_e.b(var9_ref, 320, 240, 0, -1);
                    if (var20 == 0) {
                        statePc = 357;
                    } else {
                        statePc = 344;
                    }
                    continue stateLoop;
                }
                case 344: {
                    var9_int = -(this.field_l / 2) + 320;
                    var10 = 320 + this.field_l / 2;
                    oo.h(var9_int, 0, var10, 480);
                    var11 = 140;
                    oo.b(var11, 80, 640 - 2 * var11, 260, 1, 3355443, 120);
                    if ((-5 + var11 ^ -1) < (var9_int ^ -1)) {
                        statePc = 347;
                    } else {
                        statePc = 345;
                    }
                    continue stateLoop;
                }
                case 345: {
                    stackIn_348_0 = var9_int;
                    statePc = 348;
                    continue stateLoop;
                }
                case 347: {
                    stackIn_348_0 = -5 + var11;
                    statePc = 348;
                    continue stateLoop;
                }
                case 348: {
                    stackIn_351_0 = stackIn_348_0;
                    stackIn_349_0 = stackIn_351_0;
                    stackIn_351_1 = 75;
                    stackIn_349_1 = stackIn_351_1;
                    if (var10 > 640 - var11) {
                        statePc = 351;
                    } else {
                        statePc = 349;
                    }
                    continue stateLoop;
                }
                case 349: {
                    stackIn_352_0 = stackIn_349_0;
                    stackIn_352_1 = stackIn_349_1;
                    stackIn_352_2 = var10;
                    statePc = 352;
                    continue stateLoop;
                }
                case 351: {
                    stackIn_352_0 = stackIn_351_0;
                    stackIn_352_1 = stackIn_351_1;
                    stackIn_352_2 = -var11 + 640;
                    statePc = 352;
                    continue stateLoop;
                }
                case 352: {
                    oo.h(stackIn_352_0, stackIn_352_1, stackIn_352_2, 345);
                    sj.field_j.c(var11 + -5, 75);
                    sj.field_j.a(-5 + var11, 340);
                    lm.field_fb.c(var11 - 5, 75);
                    lm.field_fb.b(-5 + -var11 + 640, 75);
                    rp.field_r[0].c(var11 - 5, 75);
                    rp.field_r[1].c(635 - var11, 75);
                    rp.field_r[2].c(var11 - 5, 340);
                    rp.field_r[3].c(635 + -var11, 340);
                    var12 = 0;
                    var13 = 160;
                    var14 = 90;
                    this.a(var13, (byte) -99, var14, var12);
                    if (-2 <= (op.field_m.field_t ^ -1)) {
                        statePc = 356;
                    } else {
                        statePc = 353;
                    }
                    continue stateLoop;
                }
                case 353: {
                    var12++;
                    var14 = 270;
                    var13 = 640 + -var13;
                    this.a(var13, (byte) -99, var14, var12);
                    if (2 >= op.field_m.field_t) {
                        statePc = 356;
                    } else {
                        statePc = 354;
                    }
                    continue stateLoop;
                }
                case 354: {
                    var13 = 640 + -var13;
                    var14 = 230;
                    var12++;
                    this.a(var13, (byte) -99, var14, var12);
                    if (3 >= op.field_m.field_t) {
                        statePc = 356;
                    } else {
                        statePc = 355;
                    }
                    continue stateLoop;
                }
                case 355: {
                    var12++;
                    var13 = 640 - var13;
                    var14 = 130;
                    this.a(var13, (byte) -99, var14, var12);
                    statePc = 356;
                    continue stateLoop;
                }
                case 356: {
                    this.field_y.g(-(this.field_y.field_x / 2) + 320, 235 + -this.field_y.field_w);
                    g.a(this.field_L, -(this.field_y.field_x / 2) + 320 + -6, 235 + (-this.field_y.field_w + -6));
                    oo.c();
                    statePc = 357;
                    continue stateLoop;
                }
                case 357: {
                    if (!param0) {
                        statePc = 364;
                    } else {
                        statePc = 358;
                    }
                    continue stateLoop;
                }
                case 358: {
                    this.field_G.g(-27635);
                    if (!gf.field_h) {
                        statePc = 363;
                    } else {
                        statePc = 364;
                    }
                    continue stateLoop;
                }
                case 363: {
                    this.field_I.c(-118);
                    rq.a(9);
                    statePc = 364;
                    continue stateLoop;
                }
                case 364: {
                    jq.field_e.e(0, 0);
                    if (sc.field_a) {
                        statePc = 373;
                    } else {
                        statePc = 365;
                    }
                    continue stateLoop;
                }
                case 365: {
                    if (wj.field_n) {
                        statePc = 373;
                    } else {
                        statePc = 368;
                    }
                    continue stateLoop;
                }
                case 368: {
                    if (n.field_g) {
                        statePc = 373;
                    } else {
                        statePc = 374;
                    }
                    continue stateLoop;
                }
                case 373: {
                    oo.f(0, 0, 640, 17, 0, 100);
                    statePc = 374;
                    continue stateLoop;
                }
                case 374: {
                    if (!sc.field_a) {
                        statePc = 377;
                    } else {
                        statePc = 375;
                    }
                    continue stateLoop;
                }
                case 375: {
                    qp.field_w.c("cam=(" + this.field_k.field_k + ", " + this.field_k.field_g + ") bk=" + kd.field_b + " k=" + pq.field_f + " mouse=(" + bd.field_g + "," + bo.field_d + ")", 5, 13, 16777215, 0);
                    statePc = 377;
                    continue stateLoop;
                }
                case 377: {
                    if (vk.field_E) {
                        statePc = 380;
                    } else {
                        statePc = 388;
                    }
                    continue stateLoop;
                }
                case 380: {
                    var8.c(Integer.toString(ji.field_b), 10, 40, 2, -1);
                    var8.c(Integer.toString(ei.field_b), 10, 40, 2, -1);
                    var8.c(Integer.toString(op.field_m.field_H), 10, 80, 2, -1);
                    var9_ref2 = (ae) ((Object) this.field_hb.c(106));
                    statePc = 381;
                    continue stateLoop;
                }
                case 381: {
                    if (null == var9_ref2) {
                        statePc = 388;
                    } else {
                        statePc = 382;
                    }
                    continue stateLoop;
                }
                case 382: {
                    var9_ref2.a(-240 + this.field_k.field_g, true, -320 + this.field_k.field_k, op.field_m.field_H);
                    var9_ref2 = (ae) ((Object) this.field_hb.b(6));
                    if (var20 != 0) {
                        statePc = 388;
                    } else {
                        statePc = 383;
                    }
                    continue stateLoop;
                }
                case 383: {
                    if (var20 == 0) {
                        statePc = 381;
                    } else {
                        statePc = 388;
                    }
                    continue stateLoop;
                }
                case 388: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException runtimeException = null;
        lc var6 = null;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var6 = (lc) ((Object) this.field_X.g(55));
              if (null == var6) {
                var6 = new lc();
                break L1;
              } else {
                break L1;
              }
            }
            var6.a(param3, param2, param1, param0, (byte) 114);
            this.field_C.a(-25612, var6);
            g.a(this.field_C);
            var7 = 74 % ((11 - param4) / 34);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) runtimeException), "qd.JB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void a(int param0, int param1, boolean param2) {
        int stackIn_8_0 = 0;
        boolean stackIn_17_0 = false;
        int stackIn_54_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_16_0;
        int var4_int = 0;
        RuntimeException var4 = null;
        wb var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        br var12 = null;
        wb var13 = null;
        int var14 = 0;
        var14 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = 0;
              var5 = (wb) ((Object) this.field_Q.c((byte) 92));
              if (null == var5) {
                break L1;
              } else {
                L2: {
                  if ((param0 ^ -1) != (var5.field_Kb ^ -1)) {
                    stackIn_8_0 = 0;
                    break L2;
                  } else {
                    stackIn_8_0 = 1;
                    break L2;
                  }
                }
                var4_int = stackIn_8_0;
                break L1;
              }
            }
            L3: {
              if (param2) {
                break L3;
              } else {
                this.b(-60);
                break L3;
              }
            }
            if (param1 == 1782) {
              var6 = this.field_u.field_r << 913213104;
              var7 = 0;
              var8 = this.field_u.field_c << 1649482672;
              var9 = 0;
              var10 = 41943040;
              var11 = 31457280;
              var12 = op.field_m.field_K.c(78);
              L4: while (true) {
                L5: {
                  L6: {
                    L7: {
                      if (var12 == null) {
                        break L7;
                      } else {
                        stackOut_16_0 = var12 instanceof wb;
                        stackIn_54_0 = stackOut_16_0 ? 1 : 0;
                        stackIn_17_0 = stackOut_16_0;
                        if (var14 != 0) {
                          break L6;
                        } else {
                          L8: {
                            if (stackIn_17_0) {
                              var13 = (wb) ((Object) var12);
                              if ((param0 ^ -1) == (var13.field_Kb ^ -1)) {
                                L9: {
                                  var5 = var13;
                                  var13.r(0);
                                  this.field_Q.a(29664, var13);
                                  if (var7 >= var13.field_z) {
                                    break L9;
                                  } else {
                                    if (-var6 + var13.field_z < var10) {
                                      var7 = var13.field_z;
                                      break L9;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                                L10: {
                                  if (var6 <= var13.field_z) {
                                    break L10;
                                  } else {
                                    if ((var10 ^ -1) < (var7 + -var13.field_z ^ -1)) {
                                      var6 = var13.field_z;
                                      break L10;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                                L11: {
                                  if (var9 >= var13.field_E) {
                                    break L11;
                                  } else {
                                    if ((var11 ^ -1) >= (var13.field_E - var8 ^ -1)) {
                                      break L11;
                                    } else {
                                      var9 = var13.field_E;
                                      break L11;
                                    }
                                  }
                                }
                                if (var8 <= var13.field_E) {
                                  break L8;
                                } else {
                                  if ((var9 + -var13.field_E ^ -1) > (var11 ^ -1)) {
                                    var8 = var13.field_E;
                                    break L8;
                                  } else {
                                    break L8;
                                  }
                                }
                              } else {
                                break L8;
                              }
                            } else {
                              break L8;
                            }
                          }
                          var12 = op.field_m.field_K.b(6);
                          if (var14 == 0) {
                            continue L4;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                    if (null == var5) {
                      break L5;
                    } else {
                      stackIn_54_0 = var4_int;
                      break L6;
                    }
                  }
                  if (stackIn_54_0 == 0) {
                    break L5;
                  } else {
                    this.e(var8 + var9 >> 89717457, -108, var6 + var7 >> -954055311);
                    break L5;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var4), "qd.RA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void c(int param0, int param1) {
        RuntimeException runtimeException = null;
        id var4 = null;
        ti var5 = null;
        int var6 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        wb var3 = null;
        try {
          L0: {
            var4 = op.field_m.a(param0, (byte) 33);
            if (var4 instanceof ti) {
              if (null != var4) {
                L1: {
                  var6 = 83 % ((param1 - -73) / 51);
                  var5 = (ti) ((Object) var4);
                  var5.j(0);
                  if (var5 instanceof wb) {
                    var3 = (wb) ((Object) var5);
                    var3.j((byte) -13);
                    var3.d(false);
                    if (-30 != (var3.field_K ^ -1)) {
                      break L1;
                    } else {
                      var3.b(4, -27655);
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) runtimeException), "qd.G(" + param0 + ',' + param1 + ')');
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

    private final void d(int param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 15) {
                break L1;
              } else {
                qd.a((fm) null, 30, (String) null, 93, (td) null);
                break L1;
              }
            }
            L2: {
              if (!this.c((byte) 106)) {
                break L2;
              } else {
                L3: {
                  if (this.field_b == null) {
                    break L3;
                  } else {
                    this.field_b.field_O = false;
                    this.field_b = null;
                    break L3;
                  }
                }
                L4: {
                  L5: {
                    if (null != this.field_mb) {
                      break L5;
                    } else {
                      if (this.field_x == null) {
                        break L4;
                      } else {
                        this.field_x.field_jb = false;
                        this.field_x = null;
                        if (var3 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  this.field_mb.field_zb = false;
                  this.field_mb.field_eb = false;
                  this.field_mb = null;
                  break L4;
                }
                L6: {
                  if (!this.field_I.a((byte) -119)) {
                    en.a(-1, 0);
                    break L6;
                  } else {
                    L7: {
                      if (!bk.field_g) {
                        break L7;
                      } else {
                        en.a(param0 + -16, 1);
                        if (var3 == 0) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    en.a(-1, 6);
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
                L8: {
                  if (!this.field_I.g(param0 ^ 2)) {
                    break L8;
                  } else {
                    this.field_x = (gm) ((Object) this.a(true, 54, bo.field_d, bd.field_g));
                    if (this.field_x == null) {
                      break L8;
                    } else {
                      this.field_x.field_jb = true;
                      break L8;
                    }
                  }
                }
                L9: {
                  this.field_mb = (wb) ((Object) this.a(false, 124, bo.field_d, bd.field_g));
                  if (null != this.field_mb) {
                    L10: {
                      L11: {
                        if (!this.field_I.a(true)) {
                          break L11;
                        } else {
                          if (this.field_mb.i((byte) 116)) {
                            break L10;
                          } else {
                            break L11;
                          }
                        }
                      }
                      L12: {
                        if (!this.field_I.a(param0 + 5)) {
                          break L12;
                        } else {
                          if (!this.field_mb.i((byte) -59)) {
                            break L10;
                          } else {
                            break L12;
                          }
                        }
                      }
                      if (this.field_mb.i((byte) -36)) {
                        this.field_mb.field_eb = true;
                        if (var3 == 0) {
                          break L9;
                        } else {
                          break L10;
                        }
                      } else {
                        break L9;
                      }
                    }
                    L13: {
                      if (!bk.field_g) {
                        break L13;
                      } else {
                        this.field_mb.field_zb = true;
                        if (var3 == 0) {
                          break L9;
                        } else {
                          break L13;
                        }
                      }
                    }
                    this.field_mb = null;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                if (!this.field_I.a(20)) {
                  break L2;
                } else {
                  if (null == this.field_b) {
                    break L2;
                  } else {
                    this.field_b.field_O = true;
                    break L2;
                  }
                }
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "qd.AB(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean a(boolean param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        ja[] stackIn_56_0 = null;
        int stackIn_79_0 = 0;
        Object stackIn_89_0 = null;
        Object stackIn_91_0 = null;
        boolean stackIn_91_1 = false;
        Object stackIn_92_0 = null;
        boolean stackIn_92_1 = false;
        int stackIn_92_2 = 0;
        int stackIn_100_0 = 0;
        boolean stackIn_102_0 = false;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4_int = 0;
        ja[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_z = false;
              if (-11 != (pl.field_I ^ -1)) {
                stackIn_5_0 = 0;
                break L1;
              } else {
                stackIn_5_0 = 1;
                break L1;
              }
            }
            L2: {
              var3_int = stackIn_5_0;
              if (!df.field_I) {
                L3: {
                  L4: {
                    pb.field_i = id.field_x;
                    if (!iq.field_f) {
                      break L4;
                    } else {
                      if (var3_int == 0) {
                        break L3;
                      } else {
                        pb.field_i = be.field_m;
                        if (var6 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  L5: {
                    if (-2 <= (id.field_D ^ -1)) {
                      break L5;
                    } else {
                      pb.field_i = vl.a(rq.field_q, new String[]{Integer.toString(id.field_D)}, 2);
                      if (var6 == 0) {
                        break L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L6: {
                    if (-2 == (id.field_D ^ -1)) {
                      break L6;
                    } else {
                      pb.field_i = ll.field_d;
                      if (var6 == 0) {
                        break L3;
                      } else {
                        break L6;
                      }
                    }
                  }
                  pb.field_i = ma.field_c;
                  break L3;
                }
                var4_int = qp.field_w.a(pb.field_i);
                nf.field_d = (int)((float)nf.field_d + (float)(var4_int + -nf.field_d) * 0.05000000074505806f);
                if ((nf.field_d ^ -1) != (var4_int ^ -1)) {
                  L7: {
                    stackIn_35_0 = nf.field_d;

                    if (var4_int > nf.field_d) {
                      stackIn_36_0 = stackIn_35_0;
                      stackIn_36_1 = 1;
                      break L7;
                    } else {
                      stackIn_36_0 = stackIn_35_0;
                      stackIn_36_1 = -1;
                      break L7;
                    }
                  }
                  nf.field_d = stackIn_36_0 + stackIn_36_1;
                  break L2;
                } else {
                  break L2;
                }
              } else {
                break L2;
              }
            }
            L8: {
              L9: {
                if (df.field_I) {
                  break L9;
                } else {
                  if (!param0) {
                    break L9;
                  } else {
                    L10: {
                      if (!re.field_b) {
                        break L10;
                      } else {
                        if (!sq.field_N) {
                          break L10;
                        } else {
                          if (!gf.field_h) {
                            break L9;
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                    L11: {
                      if (!tj.field_f) {
                        stackIn_56_0 = oi.field_h;
                        break L11;
                      } else {
                        stackIn_56_0 = rl.field_a;
                        break L11;
                      }
                    }
                    L12: {
                      var4 = stackIn_56_0;
                      tj.field_f = false;
                      var5 = var4[0].field_w - (-var4[6].field_w + -qp.field_w.field_C);
                      if ((bd.field_g ^ -1) > (635 + -nf.field_d ^ -1)) {
                        break L12;
                      } else {
                        if (640 <= bd.field_g) {
                          break L12;
                        } else {
                          if (-var5 + dq.field_k.field_qb > bo.field_d) {
                            break L12;
                          } else {
                            if ((dq.field_k.field_qb ^ -1) < (bo.field_d ^ -1)) {
                              this.field_z = true;
                              tj.field_f = true;
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                        }
                      }
                    }
                    L13: {
                      if (kd.field_b != 1) {
                        break L13;
                      } else {
                        if (tj.field_f) {
                          L14: {
                            if (iq.field_f) {
                              stackIn_79_0 = 0;
                              break L14;
                            } else {
                              stackIn_79_0 = 1;
                              break L14;
                            }
                          }
                          iq.field_f = stackIn_79_0 != 0;
                          if (!iq.field_f) {
                            break L13;
                          } else {
                            id.field_D = 0;
                            break L13;
                          }
                        } else {
                          break L13;
                        }
                      }
                    }
                    if (var6 == 0) {
                      break L8;
                    } else {
                      break L9;
                    }
                  }
                }
              }
              tj.field_f = false;
              break L8;
            }
            L15: {
              if (!iq.field_f) {
                break L15;
              } else {
                L16: {
                  stackIn_91_0 = this;

                  stackIn_91_1 = this.field_z;

                  if ((dq.field_k.field_qb ^ -1) < (bo.field_d ^ -1)) {
                    stackIn_92_0 = this;
                    stackIn_92_1 = stackIn_91_1;
                    stackIn_92_2 = 0;
                    break L16;
                  } else {
                    stackIn_89_0 = this;

                    stackIn_92_0 = this;
                    stackIn_92_1 = stackIn_91_1;
                    stackIn_92_2 = 1;
                    break L16;
                  }
                }
                ((qd) (this)).field_z = stackIn_92_1 | stackIn_92_2 != 0;
                if (!sq.field_N) {
                  break L15;
                } else {
                  if (!re.field_b) {
                    break L15;
                  } else {
                    this.field_z = true;
                    break L15;
                  }
                }
              }
            }
            this.field_z = this.field_z | tj.field_f;
            if (param1 == 15978) {
              stackIn_102_0 = this.field_z;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_100_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3), "qd.T(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_100_0 != 0;
        } else {
          return stackIn_102_0;
        }
    }

    public static void h(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              field_v = null;
              field_E = null;
              field_s = null;
              field_r = null;
              field_V = null;
              if (param0 == 256) {
                break L1;
              } else {
                field_E = (String) null;
                break L1;
              }
            }
            field_K = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1), "qd.P(" + param0 + ')');
        }
    }

    private final void a(byte param0) {
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        br stackIn_31_0 = null;
        br stackIn_33_0 = null;
        lj stackIn_36_0 = null;
        Object stackIn_38_0 = null;
        cg stackIn_41_0 = null;
        Object stackIn_43_0 = null;
        pq stackIn_46_0 = null;
        Object stackIn_48_0 = null;
        wc stackIn_51_0 = null;
        Object stackIn_53_0 = null;
        boolean stackIn_56_0 = false;
        int stackIn_63_0 = 0;
        boolean stackIn_66_0 = false;
        int stackIn_73_0 = 0;
        lj stackOut_35_0;
        cg stackOut_40_0;
        pq stackOut_45_0;
        wc stackOut_50_0;
        boolean stackOut_55_0;
        boolean stackOut_65_0;
        int statePc = 0;
        Throwable caughtException = null;
        Object var2 = null;
        ae var3_ref_ae = null;
        int var3 = 0;
        br var3_ref_br = null;
        lj var3_ref_lj = null;
        cg var3_ref_cg = null;
        pq var3_ref_pq = null;
        wc var3_ref_wc = null;
        lc var3_ref_lc = null;
        ae var4 = null;
        br var4_ref = null;
        Object var4_ref2 = null;
        ce var4_ref3 = null;
        Exception var5 = null;
        ce var5_ref = null;
        int var6 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        op.field_m.field_H = op.field_m.field_H + 1;
                        var2 = null;
                        var3_ref_ae = (ae) ((Object) this.field_hb.c(50));
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var3_ref_ae == null) {
                            statePc = 8;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (var2 == null) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (((ae) (var2)).field_f <= var3_ref_ae.field_f) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var2 = var3_ref_ae;
                        var3_ref_ae = (ae) ((Object) this.field_hb.b(6));
                        if (var6 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var3 = 10 % ((-25 - param0) / 61);
                        var4 = (ae) ((Object) this.field_hb.c(114));
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var4 == null) {
                            statePc = 21;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackIn_22_0 = op.field_m.field_H;
                        stackIn_11_0 = stackIn_22_0;
                        stackIn_22_1 = var4.field_f;
                        stackIn_11_1 = stackIn_22_1;
                        if (var6 != 0) {
                            statePc = 22;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (stackIn_11_0 >= stackIn_11_1) {
                            statePc = 17;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var6 == 0) {
                            statePc = 21;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var4.a((byte) -84);
                        var4.a(0, (qd) (this));
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = ((Object) stateCaught_17 instanceof Exception ? 19 : 82);
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var5 = (Exception) ((Object) caughtException);
                        bd.a(op.field_m.field_H + ": error executing message of tick " + var4.field_f + ": " + var5.getMessage(), (Throwable) ((Object) var5), false);
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var4 = (ae) ((Object) this.field_hb.c(78));
                        if (var6 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackIn_22_0 = op.field_m.field_l ^ -1;
                        stackIn_22_1 = -1;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (stackIn_22_0 != stackIn_22_1) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        this.field_G.a(-21991);
                        if ((op.field_m.field_l ^ -1) != -4) {
                            statePc = 27;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        this.field_G.a(this.field_Z, false);
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var3_ref_br = this.field_H.c(61);
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (!(var3_ref_br instanceof id)) {
                            statePc = 32;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var4_ref = var3_ref_br.field_d;
                        ((id) ((Object) var3_ref_br)).f((byte) -117);
                        stackIn_33_0 = (br) (var4_ref);
                        stackIn_31_0 = stackIn_33_0;
                        if (var6 != 0) {
                            statePc = 33;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var3_ref_br = stackIn_31_0;
                        if (var6 == 0) {
                            statePc = 29;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackIn_33_0 = this.field_O.c(127);
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var3_ref_lj = (lj) ((Object) stackIn_33_0);
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (null == var3_ref_lj) {
                            statePc = 37;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var3_ref_lj.a(-20587);
                        stackOut_35_0 = (lj) ((Object) this.field_O.b(6));
                        stackIn_38_0 = stackOut_35_0;
                        stackIn_36_0 = stackOut_35_0;
                        if (var6 != 0) {
                            statePc = 38;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var3_ref_lj = stackIn_36_0;
                        if (var6 == 0) {
                            statePc = 34;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        stackIn_38_0 = op.field_m.field_A.c(81);
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var3_ref_cg = (cg) ((Object) stackIn_38_0);
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (var3_ref_cg == null) {
                            statePc = 42;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var3_ref_cg.b(false);
                        stackOut_40_0 = (cg) ((Object) op.field_m.field_A.b(6));
                        stackIn_43_0 = stackOut_40_0;
                        stackIn_41_0 = stackOut_40_0;
                        if (var6 != 0) {
                            statePc = 43;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var3_ref_cg = stackIn_41_0;
                        if (var6 == 0) {
                            statePc = 39;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        stackIn_43_0 = op.field_m.field_G.c(42);
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var3_ref_pq = (pq) ((Object) stackIn_43_0);
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (var3_ref_pq == null) {
                            statePc = 47;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var3_ref_pq.a(100);
                        stackOut_45_0 = (pq) ((Object) op.field_m.field_G.b(6));
                        stackIn_48_0 = stackOut_45_0;
                        stackIn_46_0 = stackOut_45_0;
                        if (var6 != 0) {
                            statePc = 48;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var3_ref_pq = stackIn_46_0;
                        if (var6 == 0) {
                            statePc = 44;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        stackIn_48_0 = this.field_T.c(61);
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var3_ref_wc = (wc) ((Object) stackIn_48_0);
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (null == var3_ref_wc) {
                            statePc = 52;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var3_ref_wc.f((byte) -122);
                        stackOut_50_0 = (wc) ((Object) this.field_T.b(6));
                        stackIn_53_0 = stackOut_50_0;
                        stackIn_51_0 = stackOut_50_0;
                        if (var6 != 0) {
                            statePc = 53;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var3_ref_wc = stackIn_51_0;
                        if (var6 == 0) {
                            statePc = 49;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        stackIn_53_0 = this.field_C.c(57);
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var3_ref_lc = (lc) ((Object) stackIn_53_0);
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (var3_ref_lc == null) {
                            statePc = 62;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var3_ref_lc.d((byte) 76);
                        stackOut_55_0 = var3_ref_lc.field_q;
                        stackIn_63_0 = stackOut_55_0 ? 1 : 0;
                        stackIn_56_0 = stackOut_55_0;
                        if (var6 != 0) {
                            statePc = 63;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (stackIn_56_0) {
                            statePc = 60;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var3_ref_lc.a(true);
                        this.field_X.a(var3_ref_lc, false);
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var3_ref_lc = (lc) ((Object) this.field_C.b(6));
                        if (var6 == 0) {
                            statePc = 54;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        g.a(this.field_C);
                        stackIn_63_0 = 0;
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        var3 = stackIn_63_0;
                        var4_ref2 = null;
                        var5_ref = (ce) ((Object) op.field_m.field_s.c(63));
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (null == var5_ref) {
                            statePc = 72;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var4_ref3 = (ce) ((Object) op.field_m.field_s.b(6));
                        stackOut_65_0 = var5_ref.d(-20232);
                        stackIn_73_0 = stackOut_65_0 ? 1 : 0;
                        stackIn_66_0 = stackOut_65_0;
                        if (var6 != 0) {
                            statePc = 73;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (stackIn_66_0) {
                            statePc = 70;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        var3 = 1;
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        var5_ref = var4_ref3;
                        if (var6 == 0) {
                            statePc = 64;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        stackIn_73_0 = var3;
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if (stackIn_73_0 == 0) {
                            statePc = 83;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        var5_ref = (ce) ((Object) op.field_m.field_s.c(85));
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if (null == var5_ref) {
                            statePc = 80;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        var5_ref.a((byte) -60);
                        var5_ref = (ce) ((Object) op.field_m.field_s.b(6));
                        if (var6 != 0) {
                            statePc = 83;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        if (var6 == 0) {
                            statePc = 75;
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
                case 80: {
                    try {
                        this.field_u.a(48);
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 82: {
                    var2 = caughtException;
                    throw fa.a((Throwable) (var2), "qd.HA(" + param0 + ')');
                }
                case 83: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, int param1, int param2) {
        int statePc = 0;
        Throwable caughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (this.field_cb.a(param0 + -1) <= 200) {
                            statePc = 8;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var4_int = 0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (-6 >= (var4_int ^ -1)) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        this.field_cb.g(80);
                        var4_int++;
                        if (var5 != 0) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var5 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        this.field_cb.a(new rj(param1, param2, hp.a((byte) -98, g.field_a, 6)), false);
                        this.field_cb.a(new rj(param1 + 15, param2, hp.a((byte) 99, g.field_a, 6)), false);
                        this.field_cb.a(new rj(param1 - 15, param2, hp.a((byte) 126, g.field_a, 6)), false);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (param0 == 1) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        this.field_o = (h) null;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        this.field_cb.a(new rj(param1, param2 - 15, hp.a((byte) 9, g.field_a, 6)), false);
                        this.field_cb.a(new rj(param1, param2 - -15, hp.a((byte) -86, g.field_a, 6)), false);
                        if (this.field_u.a(param1, true, true, param2 + -24)) {
                            statePc = 27;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (this.field_u.a(param1 + 24, true, true, -24 + param2)) {
                            statePc = 27;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (this.field_u.a(param1 + -24, true, true, -24 + param2)) {
                            statePc = 27;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (this.field_u.a(param1, true, true, param2)) {
                            statePc = 24;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        param2 = param2 - (param2 % 24 + 24);
                        this.field_H.a(new rj(param1, param2, hp.a((byte) -100, g.field_a, 6) + 6), false);
                        this.field_cb.a(new rj(param1, 24 + param2, hp.a((byte) -93, g.field_a, 6)), false);
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 26: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    throw fa.a((Throwable) ((Object) var4), "qd.SA(" + param0 + ',' + param1 + ',' + param2 + ')');
                }
                case 27: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int[] param0, boolean param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                this.field_A = 96;
                break L1;
              }
            }
            d.a(param0, 0, op.field_m.field_d, 0, param0.length);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("qd.I(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, boolean param2, int param3, int param4, int param5, int param6, int param7) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        id var9 = null;
        RuntimeException var9_ref = null;
        ti var10 = null;
        try {
          L0: {
            if (!param2) {
              var9 = op.field_m.a(param0, (byte) 33);
              if (var9 == null) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (var9 instanceof ti) {
                  L1: {
                    L2: {
                      var10 = (ti) ((Object) var9);
                      if (23 == param6) {
                        break L2;
                      } else {
                        if (-29 == (param6 ^ -1)) {
                          break L2;
                        } else {
                          if (-16 == (param6 ^ -1)) {
                            break L2;
                          } else {
                            if ((param6 ^ -1) == -28) {
                              break L2;
                            } else {
                              if (param6 == 17) {
                                break L2;
                              } else {
                                if (25 == param6) {
                                  break L2;
                                } else {
                                  if (13 == param6) {
                                    break L2;
                                  } else {
                                    if (29 == param6) {
                                      break L2;
                                    } else {
                                      if (31 == param6) {
                                        break L2;
                                      } else {
                                        if (param6 == 33) {
                                          break L2;
                                        } else {
                                          L3: {
                                            if (-6 != (var10.field_K ^ -1)) {
                                              break L3;
                                            } else {
                                              if (param6 != 4) {
                                                break L3;
                                              } else {
                                                decompiledRegionSelector0 = 2;
                                                break L0;
                                              }
                                            }
                                          }
                                          L4: {
                                            if ((var10.field_K ^ -1) == (param6 ^ -1)) {
                                              break L4;
                                            } else {
                                              var10.b(param6, -27655);
                                              break L4;
                                            }
                                          }
                                          var10.a(param1, param5, param3, (byte) 109, param4, param7);
                                          if (!ZombieDawnMulti.field_E) {
                                            break L1;
                                          } else {
                                            break L2;
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
                    var10.b(param6, -27655);
                    break L1;
                  }
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  throw new IllegalArgumentException("oid " + param0 + " is not a character");
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var9_ref), "qd.K(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
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
              return;
            }
          }
        }
    }

    final void b(int param0, int param1, int param2) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                this.a(118, (byte) -12, -22);
                break L1;
              }
            }
            op.field_m.field_z[param0] = param2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var4), "qd.O(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    qd(kb param0, hk param1, int param2) {
        th discarded$0 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int[] var4 = null;
        RuntimeException var4_ref = null;
        int var5_int = 0;
        int[] var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = ZombieDawnMulti.field_E ? 1 : 0;
                    discarded$0 = new th();
                    this.field_Z = 0;
                    this.field_Y = 0;
                    this.field_J = new uf();
                    this.field_q = -1;
                    this.field_x = null;
                    this.field_p = -1;
                    this.field_mb = null;
                    this.field_fb = 0;
                    this.field_d = 0;
                    this.field_eb = false;
                    this.field_n = 0;
                    this.field_w = true;
                    this.field_F = -1;
                    this.field_db = false;
                    this.field_ib = 0;
                    this.field_B = new ja(157, 100);
                    this.field_z = false;
                    this.field_m = 2;
                    this.field_i = new int[256];
                    this.field_g = 1;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        fb.field_e = (qd) (this);
                        mj.field_Hb[2].field_g.field_d = 0;
                        if ((param2 ^ -1) <= -1) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_4_0 = 1;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_4_0 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        gf.field_h = stackIn_4_0 != 0;
                        tg.field_e = param1;
                        if ((((int)(bl.a((byte) 124) / 86400000L) + -11745) % 7 ^ -1) != -6) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_8_0 = 1;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackIn_8_0 = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        q.field_b = stackIn_8_0 != 0;
                        op.field_m = param0;
                        this.field_M = param2;
                        stackIn_11_0 = this;
                        stackIn_9_0 = stackIn_11_0;
                        if (kj.field_q < 2) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackIn_12_0 = this;
                        stackIn_12_1 = 1;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackIn_12_0 = this;
                        stackIn_12_1 = 0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        ((qd) (this)).field_ab = stackIn_12_1 != 0;
                        this.b((byte) 72);
                        this.field_Q = new lq();
                        this.field_W = -50 + param0.field_H;
                        var4 = fc.field_m;
                        var5_int = 0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var5_int >= 8) {
                            statePc = 18;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var4[var5_int] = 0;
                        var5_int++;
                        if (var9 != 0) {
                            statePc = 19;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var9 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        this.field_H = param0.a((byte) 114);
                        this.a(6, param0.field_h);
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (null != so.field_l) {
                            statePc = 27;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (-3 == (ll.field_k.field_k ^ -1)) {
                            statePc = 25;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackIn_26_0 = 16;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackIn_26_0 = 1;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        ke.field_b = stackIn_26_0;
                        so.field_l = new ja(1280 / ke.field_b, 960 / ke.field_b);
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (gf.field_h) {
                            statePc = 49;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var4 = new int[param0.field_t - -3];
                        var5 = new int[3 + param0.field_t];
                        var6 = new int[param0.field_t + 2];
                        var7 = 0;
                        var8 = 0;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if ((var6.length ^ -1) >= (var8 ^ -1)) {
                            statePc = 37;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var5[var8] = param0.field_D[var7][1];
                        var4[var8] = param0.field_D[var7][0];
                        var6[var8] = 25;
                        if (var9 != 0) {
                            statePc = 38;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if ((var7 ^ -1) != (fb.field_e.field_M ^ -1)) {
                            statePc = 36;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var8++;
                        var5[var8] = param0.field_D[var7][1];
                        var4[var8] = param0.field_D[var7][0];
                        var6[var8] = 75;
                        var8++;
                        var5[var8] = param0.field_D[var7][1];
                        var4[var8] = param0.field_D[var7][0];
                        var6[var8] = 25;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var7++;
                        var8++;
                        if (var9 == 0) {
                            statePc = 29;
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
                        var5[var5.length - 1] = var5[0];
                        var4[var5.length + -1] = var4[0];
                        ej.field_p = ao.a(var5, -837539512, var6);
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
                        fb.field_d = ao.a(var4, -837539512, var6);
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 40: {
                    var4_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_43_0 = (RuntimeException) (var4_ref);
                    stackIn_41_0 = stackIn_43_0;
                    stackIn_43_1 = new StringBuilder().append("qd.<init>(");
                    stackIn_41_1 = stackIn_43_1;
                    if (param0 == null) {
                        statePc = 43;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    stackIn_44_0 = (RuntimeException) ((Object) stackIn_41_0);
                    stackIn_44_1 = (StringBuilder) ((Object) stackIn_41_1);
                    stackIn_44_2 = "{...}";
                    statePc = 44;
                    continue stateLoop;
                }
                case 43: {
                    stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
                    stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
                    stackIn_44_2 = "null";
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    stackIn_47_0 = (RuntimeException) ((Object) stackIn_44_0);
                    stackIn_45_0 = stackIn_47_0;
                    stackIn_47_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_44_2).append(',');
                    stackIn_45_1 = stackIn_47_1;
                    if (param1 == null) {
                        statePc = 47;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    stackIn_48_0 = (RuntimeException) ((Object) stackIn_45_0);
                    stackIn_48_1 = (StringBuilder) ((Object) stackIn_45_1);
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
                    throw fa.a((Throwable) ((Object) stackIn_48_0), stackIn_48_2 + ',' + param2 + ')');
                }
                case 49: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_e = 48;
        field_r = "Name";
        field_E = "No spectators";
        field_v = "Press F10 to open Quick Chat.";
        field_K = "Please wait while we search.<br>Games usually start within a minute, provided the server is busy enough.<br><br>The longer you are forced to wait, the earlier in the list of players you are likely to appear.<br><br>If the game doesn't start, click 'Cancel' and then try choosing 'Don't mind' for more options or switching to a busier lobby.";
        field_V = "Sorry, you were removed from the game you were in. This can happen if you are disconnected for too long or if the server is updated.";
    }
}
