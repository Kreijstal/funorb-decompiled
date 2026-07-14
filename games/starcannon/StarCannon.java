/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.awt.Canvas;

public final class StarCannon extends ag {
    private int field_D;
    static int[] field_y;
    static String field_C;
    static int field_z;
    private int field_B;
    static char field_E;
    public static int field_A;

    private final void t(int param0) {
        // if_acmpne L11
        lj.field_h = b.a(false, 1);
        nd.field_p = b.a(false, 2);
        if (param0 != -23523) {
            return;
        }
        try {
            se.field_l = b.a(false, 3);
            jg.field_F = b.a(false, 4);
            cb.field_c = b.a(false, 5);
            ej.a(fi.field_f, lf.field_eb, param0 + 23396);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "StarCannon.AA(" + param0 + 41);
        }
    }

    private final void b(int param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        bf var3_ref = null;
        String var4_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        id[] var10_ref_id__ = null;
        String var10_ref = null;
        int var11 = 0;
        int[] var12 = null;
        int var13 = 0;
        d stackIn_4_0 = null;
        int stackIn_8_0 = 0;
        d stackIn_23_0 = null;
        int stackIn_27_0 = 0;
        Object stackIn_42_0 = null;
        d stackIn_42_1 = null;
        d[] stackIn_46_0 = null;
        d[] stackIn_50_0 = null;
        d[] stackIn_54_0 = null;
        d stackIn_64_0 = null;
        int stackIn_68_0 = 0;
        Object stackIn_83_0 = null;
        d stackIn_83_1 = null;
        Object stackIn_85_0 = null;
        d stackIn_85_1 = null;
        int stackIn_87_0 = 0;
        d stackIn_93_0 = null;
        int stackIn_118_0 = 0;
        int stackIn_118_1 = 0;
        int stackIn_129_0 = 0;
        int stackIn_129_1 = 0;
        int stackIn_151_0 = 0;
        bf stackIn_155_0 = null;
        int stackIn_202_0 = 0;
        int stackIn_202_1 = 0;
        int stackIn_206_0 = 0;
        int stackIn_221_0 = 0;
        int stackIn_221_1 = 0;
        int stackIn_223_0 = 0;
        int stackIn_230_0 = 0;
        Throwable caughtException = null;
        d stackOut_3_0 = null;
        int stackOut_7_0 = 0;
        d stackOut_22_0 = null;
        int stackOut_26_0 = 0;
        Object stackOut_41_0 = null;
        d stackOut_41_1 = null;
        d[] stackOut_45_0 = null;
        d[] stackOut_49_0 = null;
        d[] stackOut_53_0 = null;
        d stackOut_63_0 = null;
        int stackOut_67_0 = 0;
        Object stackOut_82_0 = null;
        d stackOut_82_1 = null;
        Object stackOut_83_0 = null;
        d stackOut_83_1 = null;
        int stackOut_86_0 = 0;
        d stackOut_92_0 = null;
        int stackOut_117_0 = 0;
        int stackOut_117_1 = 0;
        int stackOut_128_0 = 0;
        int stackOut_128_1 = 0;
        int stackOut_150_0 = 0;
        bf stackOut_154_0 = null;
        int stackOut_201_0 = 0;
        int stackOut_201_1 = 0;
        int stackOut_205_0 = 0;
        int stackOut_220_0 = 0;
        int stackOut_220_1 = 0;
        int stackOut_222_0 = 0;
        int stackOut_229_0 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = field_A;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    var3_int = 0;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (-4001 >= (var3_int ^ -1)) {
                        statePc = 15;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    stackOut_3_0 = qc.field_c[var3_int];
                    stackIn_93_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var13 != 0) {
                        statePc = 93;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (stackIn_4_0 == null) {
                        statePc = 14;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    stackOut_7_0 = -5;
                    stackIn_8_0 = stackOut_7_0;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (stackIn_8_0 == (qc.field_c[var3_int].field_h ^ -1)) {
                        statePc = 13;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 13: {
                    qc.field_c[var3_int].a(320 + -fi.field_e.field_f, 123);
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    var3_int++;
                    if (var13 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    param0 = 100 + -param0 >> 2113265346;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    if ((qc.field_d ^ -1) > -2) {
                        statePc = 20;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    fh.field_q.d(0, vd.field_j, 640, 480, 128);
                    fh.field_q.d(0, -480 + vd.field_j, 640, 480, 128);
                    if (var13 == 0) {
                        statePc = 34;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var3_int = 0;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    if (-4001 >= (var3_int ^ -1)) {
                        statePc = 34;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    stackOut_22_0 = qc.field_c[var3_int];
                    stackIn_93_0 = stackOut_22_0;
                    stackIn_23_0 = stackOut_22_0;
                    if (var13 != 0) {
                        statePc = 93;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (stackIn_23_0 == null) {
                        statePc = 33;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    stackOut_26_0 = -4;
                    stackIn_27_0 = stackOut_26_0;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    if (stackIn_27_0 == (qc.field_c[var3_int].field_h ^ -1)) {
                        statePc = 32;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 32: {
                    qc.field_c[var3_int].a(320 + -fi.field_e.field_f, -91);
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    var3_int++;
                    if (var13 == 0) {
                        statePc = 21;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    if (param1 == 7306) {
                        statePc = 36;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    return;
                }
                case 36: {
                    var3_ref = (bf) (Object) kh.field_y.c(-3905);
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    if (null == var3_ref) {
                        statePc = 39;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    var3_ref.a(65535, 320 - fi.field_e.field_f);
                    var3_ref = (bf) (Object) kh.field_y.a(-16913);
                    if (var13 == 0) {
                        statePc = 37;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    var3_int = 0;
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    if (-4001 >= (var3_int ^ -1)) {
                        statePc = 61;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    stackOut_41_0 = null;
                    stackOut_41_1 = qc.field_c[var3_int];
                    stackIn_85_0 = stackOut_41_0;
                    stackIn_85_1 = stackOut_41_1;
                    stackIn_42_0 = stackOut_41_0;
                    stackIn_42_1 = stackOut_41_1;
                    if (var13 != 0) {
                        statePc = 85;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if (stackIn_42_0 == (Object) (Object) stackIn_42_1) {
                        statePc = 60;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    stackOut_45_0 = qc.field_c;
                    stackIn_46_0 = stackOut_45_0;
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    if (stackIn_46_0[var3_int].field_h == 2) {
                        statePc = 60;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    stackOut_49_0 = qc.field_c;
                    stackIn_50_0 = stackOut_49_0;
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    if (stackIn_50_0[var3_int].field_h == 3) {
                        statePc = 60;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    stackOut_53_0 = qc.field_c;
                    stackIn_54_0 = stackOut_53_0;
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    if (stackIn_54_0[var3_int].field_h != 4) {
                        statePc = 59;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 59: {
                    qc.field_c[var3_int].a(-fi.field_e.field_f + 320, 54);
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    var3_int++;
                    if (var13 == 0) {
                        statePc = 40;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    var3_int = 0;
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    if (-4001 >= (var3_int ^ -1)) {
                        statePc = 75;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    stackOut_63_0 = qc.field_c[var3_int];
                    stackIn_93_0 = stackOut_63_0;
                    stackIn_64_0 = stackOut_63_0;
                    if (var13 != 0) {
                        statePc = 93;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    if (stackIn_64_0 == null) {
                        statePc = 74;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    stackOut_67_0 = -3;
                    stackIn_68_0 = stackOut_67_0;
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    if (stackIn_68_0 == (qc.field_c[var3_int].field_h ^ -1)) {
                        statePc = 73;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 73: {
                    qc.field_c[var3_int].b(-fi.field_e.field_f + 320, 128);
                    qc.field_c[var3_int].a(-fi.field_e.field_f + 320, param1 ^ 7322);
                    statePc = 74;
                    continue stateLoop;
                }
                case 74: {
                    var3_int++;
                    if (var13 == 0) {
                        statePc = 62;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    if (-3 == (qc.field_d ^ -1)) {
                        statePc = 78;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 78: {
                    gi.a(param1 + -7302);
                    statePc = 79;
                    continue stateLoop;
                }
                case 79: {
                    var3_int = 0;
                    statePc = 80;
                    continue stateLoop;
                }
                case 80: {
                    if ((var3_int ^ -1) <= -4001) {
                        statePc = 95;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    if (var13 != 0) {
                        statePc = 99;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    stackOut_82_0 = null;
                    stackOut_82_1 = qc.field_c[var3_int];
                    stackIn_83_0 = stackOut_82_0;
                    stackIn_83_1 = stackOut_82_1;
                    statePc = 83;
                    continue stateLoop;
                }
                case 83: {
                    stackOut_83_0 = stackIn_83_0;
                    stackOut_83_1 = (d) (Object) stackIn_83_1;
                    stackIn_85_0 = stackOut_83_0;
                    stackIn_85_1 = stackOut_83_1;
                    statePc = 85;
                    continue stateLoop;
                }
                case 85: {
                    if (stackIn_85_0 == (Object) (Object) stackIn_85_1) {
                        statePc = 94;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    stackOut_86_0 = 2;
                    stackIn_87_0 = stackOut_86_0;
                    statePc = 87;
                    continue stateLoop;
                }
                case 87: {
                    if (stackIn_87_0 == qc.field_c[var3_int].field_h) {
                        statePc = 92;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 92: {
                    qc.field_c[var3_int].b(-fi.field_e.field_f + 320, param1 ^ 7178);
                    stackOut_92_0 = qc.field_c[var3_int];
                    stackIn_93_0 = stackOut_92_0;
                    statePc = 93;
                    continue stateLoop;
                }
                case 93: {
                    ((d) (Object) stackIn_93_0).a(320 - fi.field_e.field_f, -56);
                    statePc = 94;
                    continue stateLoop;
                }
                case 94: {
                    var3_int++;
                    if (var13 == 0) {
                        statePc = 80;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    if ((gj.field_c ^ -1) < 0) {
                        statePc = 98;
                    } else {
                        statePc = 193;
                    }
                    continue stateLoop;
                }
                case 98: {
                    var3_int = af.field_y.a(vk.field_w);
                    ba.a(24, gb.field_v, (byte) -127, -var3_int + 604 - 17, 17 + var3_int, 455 + param0);
                    nb.a(param0 + 455, (byte) 122, var3_int - -17, ma.field_e, -17 + -var3_int + 604, 128, 24);
                    af.field_y.c(vk.field_w, 596, 472 + param0, 16777215, -1);
                    ba.a(24, ma.field_a, (byte) 21, 604, 35, 455 - -param0);
                    nb.a(455 - -param0, (byte) 122, 35, ha.field_a, 604, 128, 24);
                    vb.field_l.e(609, param0 + 460);
                    af.field_y.a(Integer.toString(gj.field_c), 626, 472 - -param0, 16777215, -1);
                    statePc = 99;
                    continue stateLoop;
                }
                case 99: {
                    var4_ref = be.field_b;
                    var5 = 65535;
                    var6 = 32896;
                    if ((qb.field_e ^ -1) != -2) {
                        statePc = 101;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 100: {
                    var5 = 65280;
                    var6 = 32768;
                    var4_ref = b.field_d;
                    statePc = 101;
                    continue stateLoop;
                }
                case 101: {
                    if ((qb.field_e ^ -1) == -3) {
                        statePc = 104;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 104: {
                    var4_ref = ve.field_g;
                    var5 = 16776960;
                    var6 = 16711680;
                    statePc = 105;
                    continue stateLoop;
                }
                case 105: {
                    var7 = 6;
                    if (-2 != (rj.field_h ^ -1)) {
                        statePc = 107;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    var7 = 10;
                    statePc = 107;
                    continue stateLoop;
                }
                case 107: {
                    if ((rj.field_h ^ -1) == -3) {
                        statePc = 110;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 110: {
                    var7 = 16;
                    statePc = 111;
                    continue stateLoop;
                }
                case 111: {
                    if (3 == rj.field_h) {
                        statePc = 114;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 114: {
                    var7 = 17;
                    statePc = 115;
                    continue stateLoop;
                }
                case 115: {
                    var3_int = af.field_y.a(var4_ref);
                    ba.a(24, gb.field_v, (byte) -122, 1, var3_int - -17, 455 - -param0);
                    nb.a(param0 + 455, (byte) 122, var3_int + 17, ma.field_e, 1, 128, 24);
                    af.field_y.a(var4_ref, 10, 472 - -param0, 16777215, -1);
                    var8 = 23 + var3_int;
                    ba.a(24, ma.field_a, (byte) -115, var8 - 5, 10 + var7 * 5, param0 + 455);
                    nb.a(param0 + 455, (byte) 122, 10 + var7 * 5, ha.field_a, var8 + -5, 128, 24);
                    var9 = 0;
                    statePc = 116;
                    continue stateLoop;
                }
                case 116: {
                    if (var7 <= var9) {
                        statePc = 128;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 117: {
                    stackOut_117_0 = var9 ^ -1;
                    stackOut_117_1 = sd.field_c ^ -1;
                    stackIn_129_0 = stackOut_117_0;
                    stackIn_129_1 = stackOut_117_1;
                    stackIn_118_0 = stackOut_117_0;
                    stackIn_118_1 = stackOut_117_1;
                    if (var13 != 0) {
                        statePc = 129;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 118: {
                    if (stackIn_118_0 <= stackIn_118_1) {
                        statePc = 124;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 121: {
                    ki.d(var8, 460 - -param0, 4, 14, var5);
                    if (var13 == 0) {
                        statePc = 127;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    ki.d(var8, 465 + param0, 4, 4, var5);
                    statePc = 127;
                    continue stateLoop;
                }
                case 127: {
                    var8 += 5;
                    var9++;
                    if (var13 == 0) {
                        statePc = 116;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    stackOut_128_0 = ie.field_C ^ -1;
                    stackOut_128_1 = -1;
                    stackIn_129_0 = stackOut_128_0;
                    stackIn_129_1 = stackOut_128_1;
                    statePc = 129;
                    continue stateLoop;
                }
                case 129: {
                    if (stackIn_129_0 >= stackIn_129_1) {
                        statePc = 131;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 130: {
                    var9 = -(af.field_y.field_p / 2) + af.field_w[16 + qb.field_e].field_e + -16;
                    af.field_w[qb.field_e + 16].field_f = af.field_w[qb.field_e + 16].field_f + var9;
                    var4_ref = p.field_e;
                    var10_ref_id__ = new id[1];
                    var10_ref_id__[0] = af.field_w[16 + qb.field_e];
                    af.field_y.a((ne[]) (Object) var10_ref_id__, (int[]) null);
                    af.field_y.a(var4_ref, 319, 48, var6, -1, 256 - param0 * 10);
                    af.field_y.a(var4_ref, 321, 48, var5, -1, -(param0 * 10) + 256);
                    af.field_y.a(var4_ref, 320, 47, var5, -1, -(10 * param0) + 256);
                    af.field_y.a(var4_ref, 320, 49, var6, -1, -(param0 * 10) + 256);
                    af.field_y.a(var4_ref, 320, 48, 16777215, -1, -(param0 * 10) + 256);
                    af.field_w[qb.field_e + 16].field_f = af.field_w[qb.field_e + 16].field_f - var9;
                    statePc = 131;
                    continue stateLoop;
                }
                case 131: {
                    var9 = 10 * ia.field_k;
                    statePc = 132;
                    continue stateLoop;
                }
                case 132: {
                    if (nf.field_l == 0) {
                        statePc = 135;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 135: {
                    var9 = var9 >> 2;
                    statePc = 136;
                    continue stateLoop;
                }
                case 136: {
                    if (nf.field_l == 2) {
                        statePc = 139;
                    } else {
                        statePc = 140;
                    }
                    continue stateLoop;
                }
                case 139: {
                    var9 = var9 << 1;
                    statePc = 140;
                    continue stateLoop;
                }
                case 140: {
                    if (!a.field_a) {
                        statePc = 143;
                    } else {
                        statePc = 149;
                    }
                    continue stateLoop;
                }
                case 143: {
                    var3_int = af.field_y.a(rd.field_o);
                    ba.a(24, gb.field_v, (byte) -118, -var3_int + 311, 17 + var3_int, -param0 + 1);
                    nb.a(1 + -param0, (byte) 122, var3_int + 17, ma.field_e, 311 - var3_int, 128, 24);
                    af.field_y.c(rd.field_o, 320, -param0 + 18, 16777215, -1);
                    var10_ref = Integer.toString(var9);
                    var3_int = 11 + af.field_y.a(var10_ref);
                    var11 = 5 - var3_int % 5;
                    statePc = 144;
                    continue stateLoop;
                }
                case 144: {
                    if ((var11 ^ -1) > -6) {
                        statePc = 147;
                    } else {
                        statePc = 148;
                    }
                    continue stateLoop;
                }
                case 147: {
                    var3_int = var3_int + var11;
                    statePc = 148;
                    continue stateLoop;
                }
                case 148: {
                    ba.a(24, ma.field_a, (byte) -113, 328, var3_int, -param0 + 1);
                    nb.a(-param0 + 1, (byte) 122, var3_int, ha.field_a, 328, 128, 24);
                    af.field_y.a(var10_ref, 333, -param0 + 18, 16777215, -1);
                    statePc = 149;
                    continue stateLoop;
                }
                case 149: {
                    if (ua.field_c >= -2) {
                        statePc = 193;
                    } else {
                        statePc = 150;
                    }
                    continue stateLoop;
                }
                case 150: {
                    stackOut_150_0 = -1;
                    stackIn_151_0 = stackOut_150_0;
                    statePc = 151;
                    continue stateLoop;
                }
                case 151: {
                    if (stackIn_151_0 != (gj.field_c ^ -1)) {
                        statePc = 160;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 154: {
                    stackOut_154_0 = fi.field_e;
                    stackIn_155_0 = stackOut_154_0;
                    statePc = 155;
                    continue stateLoop;
                }
                case 155: {
                    if ((stackIn_155_0.field_k ^ -1) != -1) {
                        statePc = 160;
                    } else {
                        statePc = 193;
                    }
                    continue stateLoop;
                }
                case 160: {
                    var10_ref = "";
                    statePc = 161;
                    continue stateLoop;
                }
                case 161: {
                    if (-1 == (rj.field_h ^ -1)) {
                        statePc = 164;
                    } else {
                        statePc = 165;
                    }
                    continue stateLoop;
                }
                case 164: {
                    var10_ref = eg.field_i;
                    statePc = 165;
                    continue stateLoop;
                }
                case 165: {
                    if (-2 == (rj.field_h ^ -1)) {
                        statePc = 168;
                    } else {
                        statePc = 169;
                    }
                    continue stateLoop;
                }
                case 168: {
                    var10_ref = ig.field_c;
                    statePc = 169;
                    continue stateLoop;
                }
                case 169: {
                    if (2 == rj.field_h) {
                        statePc = 172;
                    } else {
                        statePc = 173;
                    }
                    continue stateLoop;
                }
                case 172: {
                    var10_ref = qc.field_a;
                    statePc = 173;
                    continue stateLoop;
                }
                case 173: {
                    if (3 != rj.field_h) {
                        statePc = 178;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 174: {
                    if (-3 != (nf.field_l ^ -1)) {
                        statePc = 178;
                    } else {
                        statePc = 177;
                    }
                    continue stateLoop;
                }
                case 177: {
                    var10_ref = vf.field_a;
                    statePc = 178;
                    continue stateLoop;
                }
                case 178: {
                    if (rj.field_h != 4) {
                        statePc = 192;
                    } else {
                        statePc = 179;
                    }
                    continue stateLoop;
                }
                case 179: {
                    if ((u.field_d ^ -1) >= -1) {
                        statePc = 191;
                    } else {
                        statePc = 182;
                    }
                    continue stateLoop;
                }
                case 182: {
                    if ((nf.field_l ^ -1) == -1) {
                        statePc = 190;
                    } else {
                        statePc = 185;
                    }
                    continue stateLoop;
                }
                case 185: {
                    if (1 == nf.field_l) {
                        statePc = 189;
                    } else {
                        statePc = 188;
                    }
                    continue stateLoop;
                }
                case 188: {
                    var10_ref = jg.field_I + var9;
                    if (var13 == 0) {
                        statePc = 192;
                    } else {
                        statePc = 189;
                    }
                    continue stateLoop;
                }
                case 189: {
                    var10_ref = d.field_n + var9 + eh.field_c;
                    if (var13 == 0) {
                        statePc = 192;
                    } else {
                        statePc = 190;
                    }
                    continue stateLoop;
                }
                case 190: {
                    var10_ref = d.field_n + var9 + jf.field_b;
                    if (var13 == 0) {
                        statePc = 192;
                    } else {
                        statePc = 191;
                    }
                    continue stateLoop;
                }
                case 191: {
                    var10_ref = bc.field_l + var9 + sb.field_o;
                    statePc = 192;
                    continue stateLoop;
                }
                case 192: {
                    int discarded$1 = af.field_y.a(var10_ref, 0, 0, 640, 480, 16777215, -1, -(10 * param0) + 256, 1, 1, af.field_y.field_p);
                    statePc = 193;
                    continue stateLoop;
                }
                case 193: {
                    if (tj.field_C > 0) {
                        statePc = 196;
                    } else {
                        statePc = 220;
                    }
                    continue stateLoop;
                }
                case 196: {
                    var3_int = 255 * dl.field_a / tj.field_C;
                    var4 = 0;
                    var5 = 0;
                    var6 = 0;
                    if ((var3_int ^ -1) <= -129) {
                        statePc = 198;
                    } else {
                        statePc = 197;
                    }
                    continue stateLoop;
                }
                case 197: {
                    var4 = 255;
                    var5 = var3_int * 2;
                    if (var13 == 0) {
                        statePc = 199;
                    } else {
                        statePc = 198;
                    }
                    continue stateLoop;
                }
                case 198: {
                    var5 = 255;
                    var4 = -(var3_int * 2) + 256 + 255;
                    statePc = 199;
                    continue stateLoop;
                }
                case 199: {
                    var6 = (var4 << -303548560) - -(var5 << 590704456);
                    var7 = 0;
                    statePc = 200;
                    continue stateLoop;
                }
                case 200: {
                    if (var7 >= var3_int) {
                        statePc = 219;
                    } else {
                        statePc = 201;
                    }
                    continue stateLoop;
                }
                case 201: {
                    stackOut_201_0 = var7 ^ -1;
                    stackOut_201_1 = -11;
                    stackIn_221_0 = stackOut_201_0;
                    stackIn_221_1 = stackOut_201_1;
                    stackIn_202_0 = stackOut_201_0;
                    stackIn_202_1 = stackOut_201_1;
                    if (var13 != 0) {
                        statePc = 221;
                    } else {
                        statePc = 202;
                    }
                    continue stateLoop;
                }
                case 202: {
                    if (stackIn_202_0 > stackIn_202_1) {
                        statePc = 215;
                    } else {
                        statePc = 205;
                    }
                    continue stateLoop;
                }
                case 205: {
                    stackOut_205_0 = var7;
                    stackIn_206_0 = stackOut_205_0;
                    statePc = 206;
                    continue stateLoop;
                }
                case 206: {
                    if (stackIn_206_0 > -10 + var3_int) {
                        statePc = 215;
                    } else {
                        statePc = 209;
                    }
                    continue stateLoop;
                }
                case 209: {
                    if (10 != var7) {
                        statePc = 218;
                    } else {
                        statePc = 212;
                    }
                    continue stateLoop;
                }
                case 212: {
                    ki.d(-(var3_int >> -1169524703) + (320 - -var7) - 5, 27, 10 + (var3_int - 20), 11, var6);
                    if (var13 == 0) {
                        statePc = 218;
                    } else {
                        statePc = 215;
                    }
                    continue stateLoop;
                }
                case 215: {
                    ki.c(320 + (var7 - (var3_int >> -964598463)), 32, 5, var6, 255 - Math.abs(var7 + -(var3_int >> -1593881151)));
                    statePc = 218;
                    continue stateLoop;
                }
                case 218: {
                    var7++;
                    if (var13 == 0) {
                        statePc = 200;
                    } else {
                        statePc = 219;
                    }
                    continue stateLoop;
                }
                case 219: {
                    af.field_y.a(s.field_h, 319, 38, 0, -1, var3_int);
                    af.field_y.a(s.field_h, 321, 38, 0, -1, var3_int);
                    af.field_y.a(s.field_h, 320, 37, 0, -1, var3_int);
                    af.field_y.a(s.field_h, 320, 39, 0, -1, var3_int);
                    af.field_y.a(s.field_h, 320, 38, 16777215, -1, var3_int);
                    statePc = 220;
                    continue stateLoop;
                }
                case 220: {
                    stackOut_220_0 = 0;
                    stackOut_220_1 = fi.field_e.field_k;
                    stackIn_221_0 = stackOut_220_0;
                    stackIn_221_1 = stackOut_220_1;
                    statePc = 221;
                    continue stateLoop;
                }
                case 221: {
                    if (stackIn_221_0 != stackIn_221_1) {
                        statePc = 240;
                    } else {
                        statePc = 222;
                    }
                    continue stateLoop;
                }
                case 222: {
                    stackOut_222_0 = gj.field_c;
                    stackIn_223_0 = stackOut_222_0;
                    statePc = 223;
                    continue stateLoop;
                }
                case 223: {
                    if (stackIn_223_0 != 0) {
                        statePc = 240;
                    } else {
                        statePc = 226;
                    }
                    continue stateLoop;
                }
                case 226: {
                    if (fi.field_e.field_r >= 25) {
                        statePc = 231;
                    } else {
                        statePc = 229;
                    }
                    continue stateLoop;
                }
                case 229: {
                    var3_int = fi.field_e.field_r << -1364493758;
                    stackOut_229_0 = var13;
                    stackIn_230_0 = stackOut_229_0;
                    statePc = 230;
                    continue stateLoop;
                }
                case 230: {
                    if (stackIn_230_0 == 0) {
                        statePc = 236;
                    } else {
                        statePc = 231;
                    }
                    continue stateLoop;
                }
                case 231: {
                    if (165 >= fi.field_e.field_r) {
                        statePc = 235;
                    } else {
                        statePc = 234;
                    }
                    continue stateLoop;
                }
                case 234: {
                    var3_int = 190 + -fi.field_e.field_r << 1456085122;
                    if (var13 == 0) {
                        statePc = 236;
                    } else {
                        statePc = 235;
                    }
                    continue stateLoop;
                }
                case 235: {
                    var3_int = 100;
                    statePc = 236;
                    continue stateLoop;
                }
                case 236: {
                    var4 = a.field_b.a(ne.field_i);
                    var5 = -60 + (-var4 + 640) >> 1811619073;
                    var6 = -var5 + 640;
                    var7 = var6 + -var5;
                    var8 = 210;
                    var9 = 270;
                    var10 = var9 + var8 >> 1317138177;
                    var9 = (var10 * (-var3_int + 100) - -(var3_int * var9)) / 100;
                    var8 = (var8 * var3_int + var10 * (100 - var3_int)) / 100;
                    var11 = var9 + (-var8 + 5);
                    if (var11 <= 0) {
                        statePc = 240;
                    } else {
                        statePc = 237;
                    }
                    continue stateLoop;
                }
                case 237: {
                    var12 = new int[4];
                    ki.a(var12);
                    ki.c(var5, var8, var5 + var7, var8 - -var11);
                    ki.b(var5 - -19, 14 + var8, var7 - 38, -28 + var11, 0, 128);
                    ba.a(var11, rd.field_p, (byte) 115, var5, var7, var8);
                    sb.a(true, var7, 10596798, 0, var8, 16711680, var5, var11 >> -162264255);
                    sb.a(true, var7, 0, 10596798, (var11 >> -679206815) + var8, 16711680, var5, -(var11 >> 278882529) + var11);
                    ki.c(var5 + 19, var8 + 14, var7 + (var5 + -19), -14 + (var11 + var8));
                    a.field_b.b(ne.field_i, 320, (a.field_b.field_p + -a.field_b.field_q >> -93328063) + 240, 16777215, -1);
                    ki.b(var12);
                    statePc = 240;
                    continue stateLoop;
                }
                case 240: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void c(boolean param0) {
        try {
            gj.field_c = gj.field_c + 1;
            dg.field_l = 0;
            mj.a(96, 12, 0, 23, 100);
            mj.a(255, 12, 1200, 45, 100);
            if (!param0) {
                ((StarCannon) this).q(-66);
            }
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "StarCannon.Q(" + param0 + 41);
        }
    }

    final static String a(boolean param0, boolean param1, boolean param2, boolean param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        String stackIn_18_0 = null;
        String stackOut_17_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var4_int = 0;
                        statePc = 1;
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        if (!param1) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var4_int += 4;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (param3) {
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
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var4_int += 2;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (!param0) {
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
                        field_E = 'B';
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
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (!param2) {
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
                        var4_int++;
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
                        stackOut_17_0 = el.field_A[var4_int];
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
                    return stackIn_18_0;
                }
                case 19: {
                    var4 = (RuntimeException) (Object) caughtException;
                    throw sd.a((Throwable) (Object) var4, "StarCannon.FA(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void n(int param0) {
        RuntimeException var2 = null;
        int var3 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = field_A;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if ((ha.field_c ^ -1) != -1) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        pf.field_d = pf.field_d + 1;
                        ha.field_c = 1;
                        li.a(-119, new bf(0, -128, -24, 6));
                        li.a(param0 ^ -124, new bf(0, -128, 24, 6));
                        dg.field_l = 0;
                        mj.a(96, 12, 0, 31, 100);
                        mj.a(255, 12, 1200, 36, 100);
                        if (var3 == 0) {
                            statePc = 24;
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
                        if (ha.field_c == 1) {
                            statePc = 21;
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
                        if (1 < ha.field_c) {
                            statePc = 13;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
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
                case 11: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        ha.field_c = ha.field_c + 1;
                        pf.field_d = pf.field_d + 1;
                        if (ha.field_c != 5) {
                            statePc = 20;
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
                        li.a(-115, new bf(0, -128, -40, 14));
                        li.a(-126, new bf(0, -128, 40, 14));
                        if (hh.field_c == 1) {
                            statePc = 19;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 20;
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
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        ph.a(249, false, 6);
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        dg.field_l = 0;
                        mj.a(96, param0 + 12, 0, 31, 100);
                        mj.a(255, 12, 1200, 36, 100);
                        if (var3 == 0) {
                            statePc = 24;
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
                        pf.field_d = pf.field_d + 1;
                        dg.field_l = 0;
                        ha.field_c = 2;
                        mj.a(96, 12, 0, 31, 100);
                        mj.a(255, 12, 1200, 36, 100);
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
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (param0 == 0) {
                            statePc = 30;
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
                        field_E = 'ﾌ';
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
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 29: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw sd.a((Throwable) (Object) var2, "StarCannon.DA(" + param0 + 41);
                }
                case 30: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void q(int param0) {
        RuntimeException var2 = null;
        int var3 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = field_A;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 == -19049) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        StarCannon.a((ue) null, false, 0, (ue) null, (ue) null);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((bf.field_w ^ -1) != -1) {
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
                        bf.field_w = 1;
                        pf.field_d = pf.field_d + 1;
                        li.a(-121, new bf(0, -128, 0, 8));
                        dg.field_l = 0;
                        mj.a(96, 12, 0, 29, 100);
                        mj.a(255, param0 ^ -19045, 1200, 40, 100);
                        if (var3 == 0) {
                            statePc = 32;
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
                        if ((bf.field_w ^ -1) != -2) {
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
                        bf.field_w = 2;
                        dg.field_l = 0;
                        pf.field_d = pf.field_d + 1;
                        mj.a(96, 12, 0, 29, 100);
                        mj.a(255, 12, 1200, 40, 100);
                        if (var3 == 0) {
                            statePc = 32;
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
                        if ((bf.field_w ^ -1) <= -5) {
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
                        bf.field_w = bf.field_w + 1;
                        dg.field_l = 0;
                        pf.field_d = pf.field_d + 1;
                        mj.a(96, 12, 0, 29, 100);
                        mj.a(255, 12, 1200, 40, 100);
                        if (var3 == 0) {
                            statePc = 32;
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
                        if ((hh.field_c ^ -1) == -1) {
                            statePc = 26;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
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
                case 24: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        hh.field_c = 1;
                        li.a(param0 ^ 18960, new bf(0, -128, 0, 13));
                        dg.field_l = 0;
                        mj.a(96, 12, 0, 46, 100);
                        mj.a(255, param0 ^ -19045, 1200, 38, 100);
                        if (ha.field_c != 5) {
                            statePc = 32;
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
                        ph.a(249, false, 6);
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 31: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw sd.a((Throwable) (Object) var2, "StarCannon.P(" + param0 + 41);
                }
                case 32: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final void init() {
        try {
            ((StarCannon) this).a(-15028, 10, "starcannon");
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "StarCannon.init()");
        }
    }

    private final void p(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        bf var5 = null;
        bf var6 = null;
        int var7 = 0;
        bf var7_ref = null;
        bf var8 = null;
        int var9 = 0;
        bf stackIn_86_0 = null;
        bf stackIn_87_0 = null;
        bf stackIn_89_0 = null;
        bf stackIn_90_0 = null;
        int stackIn_90_1 = 0;
        bf stackIn_91_0 = null;
        bf stackIn_93_0 = null;
        bf stackIn_95_0 = null;
        bf stackIn_96_0 = null;
        int stackIn_96_1 = 0;
        bf stackIn_104_0 = null;
        bf stackIn_105_0 = null;
        int stackIn_105_1 = 0;
        bf stackIn_106_0 = null;
        bf stackIn_108_0 = null;
        bf stackIn_110_0 = null;
        bf stackIn_111_0 = null;
        int stackIn_111_1 = 0;
        bf stackIn_119_0 = null;
        bf stackIn_120_0 = null;
        int stackIn_120_1 = 0;
        bf stackIn_121_0 = null;
        bf stackIn_123_0 = null;
        bf stackIn_125_0 = null;
        bf stackIn_126_0 = null;
        int stackIn_126_1 = 0;
        bf stackIn_133_0 = null;
        bf stackIn_134_0 = null;
        bf stackIn_136_0 = null;
        bf stackIn_137_0 = null;
        int stackIn_137_1 = 0;
        bf stackIn_138_0 = null;
        bf stackIn_140_0 = null;
        bf stackIn_142_0 = null;
        bf stackIn_143_0 = null;
        int stackIn_143_1 = 0;
        bf stackOut_85_0 = null;
        bf stackOut_86_0 = null;
        bf stackOut_87_0 = null;
        bf stackOut_89_0 = null;
        int stackOut_89_1 = 0;
        bf stackOut_90_0 = null;
        bf stackOut_91_0 = null;
        bf stackOut_93_0 = null;
        int stackOut_93_1 = 0;
        bf stackOut_95_0 = null;
        int stackOut_95_1 = 0;
        bf stackOut_103_0 = null;
        bf stackOut_104_0 = null;
        int stackOut_104_1 = 0;
        bf stackOut_105_0 = null;
        bf stackOut_106_0 = null;
        bf stackOut_108_0 = null;
        int stackOut_108_1 = 0;
        bf stackOut_110_0 = null;
        int stackOut_110_1 = 0;
        bf stackOut_118_0 = null;
        bf stackOut_119_0 = null;
        int stackOut_119_1 = 0;
        bf stackOut_120_0 = null;
        bf stackOut_121_0 = null;
        bf stackOut_123_0 = null;
        int stackOut_123_1 = 0;
        bf stackOut_125_0 = null;
        int stackOut_125_1 = 0;
        bf stackOut_132_0 = null;
        bf stackOut_133_0 = null;
        bf stackOut_134_0 = null;
        bf stackOut_136_0 = null;
        int stackOut_136_1 = 0;
        bf stackOut_137_0 = null;
        bf stackOut_138_0 = null;
        bf stackOut_140_0 = null;
        int stackOut_140_1 = 0;
        bf stackOut_142_0 = null;
        int stackOut_142_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = field_A;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = ua.field_c - -5;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((5 + ue.field_c[rj.field_h] ^ -1) <= (var2_int ^ -1)) {
                            statePc = 7;
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
                        if ((ue.field_c[rj.field_h] ^ -1) > (ua.field_c ^ -1)) {
                            statePc = 7;
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
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var2_int = 5 + ue.field_c[rj.field_h];
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var3 = sh.b(-126, 640);
                        var4 = -64 + fi.field_e.field_f - -sh.b(38, 128);
                        var5 = null;
                        var7 = var2_int;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (-2 == (var7 ^ -1)) {
                            statePc = 78;
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
                        if ((var7 ^ -1) == -3) {
                            statePc = 78;
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
                        if ((var7 ^ -1) == -4) {
                            statePc = 78;
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
                        if (4 != var7) {
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
                        if (var9 == 0) {
                            statePc = 78;
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
                        if (var7 != 5) {
                            statePc = 27;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (var9 == 0) {
                            statePc = 81;
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
                        if (9 != var7) {
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
                        if (var9 == 0) {
                            statePc = 100;
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
                        if (11 != var7) {
                            statePc = 39;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (var9 == 0) {
                            statePc = 100;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (-7 != (var7 ^ -1)) {
                            statePc = 45;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (var9 == 0) {
                            statePc = 113;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 47;
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
                        if ((var7 ^ -1) == -11) {
                            statePc = 114;
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
                        if (7 != var7) {
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
                        if (var9 == 0) {
                            statePc = 115;
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
                        if (-9 != (var7 ^ -1)) {
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
                        if (var9 == 0) {
                            statePc = 128;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if ((var7 ^ -1) != -14) {
                            statePc = 66;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (var9 == 0) {
                            statePc = 128;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (var7 == 12) {
                            statePc = 147;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (14 == var7) {
                            statePc = 147;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if (-16 != (var7 ^ -1)) {
                            statePc = 149;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if (var9 == 0) {
                            statePc = 148;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        nf.field_e = var2_int * 25 + 75;
                        kh.field_y.b(122, (rf) (Object) new bf(var3, -64, var4, 4));
                        if (var9 == 0) {
                            statePc = 149;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        nf.field_e = 0;
                        var4 = sh.b(param0 + 129, 128) + (var3 + -64);
                        var7 = 0;
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        if ((var7 ^ -1) <= -6) {
                            statePc = 99;
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
                        var8 = new bf(var3, 64 * -var7 - 64, var4, 2);
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        var8.field_h = var5;
                        if (var9 != 0) {
                            statePc = 149;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        stackOut_85_0 = (bf) var8;
                        stackIn_86_0 = stackOut_85_0;
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        stackOut_86_0 = (bf) (Object) stackIn_86_0;
                        stackIn_95_0 = stackOut_86_0;
                        stackIn_87_0 = stackOut_86_0;
                        if (var7 == 1) {
                            statePc = 95;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        stackOut_87_0 = (bf) (Object) stackIn_87_0;
                        stackIn_89_0 = stackOut_87_0;
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        stackOut_89_0 = (bf) (Object) stackIn_89_0;
                        stackOut_89_1 = -5;
                        stackIn_90_0 = stackOut_89_0;
                        stackIn_90_1 = stackOut_89_1;
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        stackOut_90_0 = (bf) (Object) stackIn_90_0;
                        stackIn_95_0 = stackOut_90_0;
                        stackIn_91_0 = stackOut_90_0;
                        if (stackIn_90_1 == (var7 ^ -1)) {
                            statePc = 95;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        stackOut_91_0 = (bf) (Object) stackIn_91_0;
                        stackIn_93_0 = stackOut_91_0;
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        stackOut_93_0 = (bf) (Object) stackIn_93_0;
                        stackOut_93_1 = 1;
                        stackIn_96_0 = stackOut_93_0;
                        stackIn_96_1 = stackOut_93_1;
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
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        stackOut_95_0 = (bf) (Object) stackIn_95_0;
                        stackOut_95_1 = 0;
                        stackIn_96_0 = stackOut_95_0;
                        stackIn_96_1 = stackOut_95_1;
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        stackIn_96_0.field_p = stackIn_96_1 != 0;
                        if ((var7 ^ -1) != -1) {
                            statePc = 98;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        var5 = var8;
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        kh.field_y.b(param0 ^ -138, (rf) (Object) var8);
                        var7++;
                        if (var9 == 0) {
                            statePc = 82;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        statePc = 149;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        nf.field_e = 0;
                        var7 = -8;
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        if (-9 >= (var7 ^ -1)) {
                            statePc = 112;
                        } else {
                            statePc = 102;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        var8 = new bf(var7 * 24 + 320, -Math.abs(-64 + var7 * 64), 320 - -(var7 * 24), 1);
                        statePc = 103;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        stackOut_103_0 = (bf) var8;
                        stackIn_110_0 = stackOut_103_0;
                        stackIn_104_0 = stackOut_103_0;
                        if (1 == var7) {
                            statePc = 110;
                        } else {
                            statePc = 104;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        stackOut_104_0 = (bf) (Object) stackIn_104_0;
                        stackOut_104_1 = -5;
                        stackIn_105_0 = stackOut_104_0;
                        stackIn_105_1 = stackOut_104_1;
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        stackOut_105_0 = (bf) (Object) stackIn_105_0;
                        stackIn_110_0 = stackOut_105_0;
                        stackIn_106_0 = stackOut_105_0;
                        if (stackIn_105_1 == (var7 ^ -1)) {
                            statePc = 110;
                        } else {
                            statePc = 106;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        stackOut_106_0 = (bf) (Object) stackIn_106_0;
                        stackIn_108_0 = stackOut_106_0;
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        stackOut_108_0 = (bf) (Object) stackIn_108_0;
                        stackOut_108_1 = 1;
                        stackIn_111_0 = stackOut_108_0;
                        stackIn_111_1 = stackOut_108_1;
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        stackOut_110_0 = (bf) (Object) stackIn_110_0;
                        stackOut_110_1 = 0;
                        stackIn_111_0 = stackOut_110_0;
                        stackIn_111_1 = stackOut_110_1;
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        stackIn_111_0.field_p = stackIn_111_1 != 0;
                        kh.field_y.b(123, (rf) (Object) var8);
                        var7++;
                        if (var9 == 0) {
                            statePc = 101;
                        } else {
                            statePc = 112;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        if (var9 == 0) {
                            statePc = 149;
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
                        nf.field_e = nf.field_e + 250;
                        var7_ref = new bf(320, -256, var4, 11);
                        kh.field_y.b(param0 ^ -170, (rf) (Object) var7_ref);
                        dg.field_l = 0;
                        ua.field_c = 2;
                        mj.a(255, 12, 0, 41, 100);
                        ti.field_f.a((oa) (Object) kc.field_P);
                        kc.field_P.f();
                        kc.field_P = fl.field_h;
                        ti.field_f.b((oa) (Object) kc.field_P);
                        kc.field_P.a(mc.field_b);
                        statePc = 149;
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        nf.field_e = nf.field_e + 250;
                        var7_ref = new bf(320, -256, var4, 15);
                        kh.field_y.b(69, (rf) (Object) var7_ref);
                        dg.field_l = 0;
                        ua.field_c = 6;
                        mj.a(255, 12, 0, 41, 100);
                        ti.field_f.a((oa) (Object) kc.field_P);
                        kc.field_P.f();
                        kc.field_P = fl.field_h;
                        ti.field_f.b((oa) (Object) kc.field_P);
                        kc.field_P.a(mc.field_b);
                        statePc = 149;
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        nf.field_e = 0;
                        var7 = 0;
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        if (-6 >= (var7 ^ -1)) {
                            statePc = 127;
                        } else {
                            statePc = 117;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        var8 = new bf(var3, 64 * -var7 + -64, var4, 1);
                        statePc = 118;
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        stackOut_118_0 = (bf) var8;
                        stackIn_125_0 = stackOut_118_0;
                        stackIn_119_0 = stackOut_118_0;
                        if (-2 == (var7 ^ -1)) {
                            statePc = 125;
                        } else {
                            statePc = 119;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 122;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        stackOut_119_0 = (bf) (Object) stackIn_119_0;
                        stackOut_119_1 = var7;
                        stackIn_120_0 = stackOut_119_0;
                        stackIn_120_1 = stackOut_119_1;
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 122;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        stackOut_120_0 = (bf) (Object) stackIn_120_0;
                        stackIn_125_0 = stackOut_120_0;
                        stackIn_121_0 = stackOut_120_0;
                        if ((stackIn_120_1 ^ -1) == -5) {
                            statePc = 125;
                        } else {
                            statePc = 121;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        stackOut_121_0 = (bf) (Object) stackIn_121_0;
                        stackIn_123_0 = stackOut_121_0;
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        stackOut_123_0 = (bf) (Object) stackIn_123_0;
                        stackOut_123_1 = 1;
                        stackIn_126_0 = stackOut_123_0;
                        stackIn_126_1 = stackOut_123_1;
                        statePc = 126;
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        stackOut_125_0 = (bf) (Object) stackIn_125_0;
                        stackOut_125_1 = 0;
                        stackIn_126_0 = stackOut_125_0;
                        stackIn_126_1 = stackOut_125_1;
                        statePc = 126;
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        stackIn_126_0.field_p = stackIn_126_1 != 0;
                        kh.field_y.b(101, (rf) (Object) var8);
                        var7++;
                        if (var9 == 0) {
                            statePc = 116;
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
                        if (var9 == 0) {
                            statePc = 149;
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
                        nf.field_e = 0;
                        var4 = sh.b(-128, 128) + (var3 + -64);
                        var7 = 0;
                        statePc = 129;
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        if (5 <= var7) {
                            statePc = 146;
                        } else {
                            statePc = 130;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        var8 = new bf(var3, 64 * -var7 + -64, var4, 2);
                        statePc = 131;
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        if (var9 != 0) {
                            statePc = 149;
                        } else {
                            statePc = 132;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        stackOut_132_0 = (bf) var8;
                        stackIn_133_0 = stackOut_132_0;
                        statePc = 133;
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        stackOut_133_0 = (bf) (Object) stackIn_133_0;
                        stackIn_142_0 = stackOut_133_0;
                        stackIn_134_0 = stackOut_133_0;
                        if (1 == var7) {
                            statePc = 142;
                        } else {
                            statePc = 134;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        stackOut_134_0 = (bf) (Object) stackIn_134_0;
                        stackIn_136_0 = stackOut_134_0;
                        statePc = 136;
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        stackOut_136_0 = (bf) (Object) stackIn_136_0;
                        stackOut_136_1 = -5;
                        stackIn_137_0 = stackOut_136_0;
                        stackIn_137_1 = stackOut_136_1;
                        statePc = 137;
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        stackOut_137_0 = (bf) (Object) stackIn_137_0;
                        stackIn_142_0 = stackOut_137_0;
                        stackIn_138_0 = stackOut_137_0;
                        if (stackIn_137_1 == (var7 ^ -1)) {
                            statePc = 142;
                        } else {
                            statePc = 138;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 141;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        stackOut_138_0 = (bf) (Object) stackIn_138_0;
                        stackIn_140_0 = stackOut_138_0;
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 141;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 141;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        stackOut_140_0 = (bf) (Object) stackIn_140_0;
                        stackOut_140_1 = 1;
                        stackIn_143_0 = stackOut_140_0;
                        stackIn_143_1 = stackOut_140_1;
                        statePc = 143;
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 141;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        stackOut_142_0 = (bf) (Object) stackIn_142_0;
                        stackOut_142_1 = 0;
                        stackIn_143_0 = stackOut_142_0;
                        stackIn_143_1 = stackOut_142_1;
                        statePc = 143;
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        stackIn_143_0.field_p = stackIn_143_1 != 0;
                        var8.field_h = var5;
                        if (-1 != (var7 ^ -1)) {
                            statePc = 145;
                        } else {
                            statePc = 144;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        var5 = var8;
                        statePc = 145;
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        kh.field_y.b(param0 ^ -145, (rf) (Object) var8);
                        var7++;
                        if (var9 == 0) {
                            statePc = 129;
                        } else {
                            statePc = 146;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        statePc = 149;
                        continue stateLoop;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        nf.field_e = 175;
                        kh.field_y.b(82, (rf) (Object) new bf(var3, -64, var4, 4));
                        if (var9 == 0) {
                            statePc = 149;
                        } else {
                            statePc = 148;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        var6 = new bf(320, -256, var4, 16);
                        kh.field_y.b(97, (rf) (Object) var6);
                        tj.field_C = var6.field_k;
                        ua.field_c = 1 + ue.field_c[rj.field_h];
                        dg.field_l = 0;
                        pf.field_d = pf.field_d + 1;
                        mj.a(255, param0 ^ -244, 0, 41, 100);
                        ti.field_f.a((oa) (Object) kc.field_P);
                        kc.field_P.f();
                        kc.field_P = fl.field_h;
                        ti.field_f.b((oa) (Object) kc.field_P);
                        kc.field_P.a(mc.field_b);
                        statePc = 149;
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        if (param0 == -256) {
                            statePc = 155;
                        } else {
                            statePc = 150;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 152;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        field_y = null;
                        statePc = 151;
                        continue stateLoop;
                    } catch (Throwable stateCaught_150) {
                        caughtException = stateCaught_150;
                        statePc = 152;
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
                case 152: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 154: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw sd.a((Throwable) (Object) var2, "StarCannon.R(" + param0 + 41);
                }
                case 155: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void o(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        bf var5 = null;
        bf var6 = null;
        int var7 = 0;
        bf var7_ref = null;
        bf var8 = null;
        int var8_int = 0;
        bf var9 = null;
        int var10 = 0;
        int stackIn_101_0 = 0;
        int stackIn_102_0 = 0;
        int stackIn_102_1 = 0;
        int stackIn_103_0 = 0;
        int stackIn_103_1 = 0;
        int stackIn_105_0 = 0;
        int stackIn_106_0 = 0;
        int stackIn_106_1 = 0;
        int stackIn_107_0 = 0;
        int stackIn_107_1 = 0;
        int stackIn_132_0 = 0;
        int stackIn_133_0 = 0;
        int stackIn_133_1 = 0;
        int stackIn_134_0 = 0;
        int stackIn_134_1 = 0;
        int stackIn_136_0 = 0;
        int stackIn_137_0 = 0;
        int stackIn_137_1 = 0;
        int stackIn_149_0 = 0;
        int stackIn_150_0 = 0;
        int stackIn_150_1 = 0;
        int stackIn_151_0 = 0;
        int stackIn_151_1 = 0;
        int stackIn_153_0 = 0;
        int stackIn_154_0 = 0;
        int stackIn_154_1 = 0;
        int stackIn_155_0 = 0;
        int stackIn_155_1 = 0;
        int stackOut_100_0 = 0;
        int stackOut_101_0 = 0;
        int stackOut_101_1 = 0;
        int stackOut_102_0 = 0;
        int stackOut_102_1 = 0;
        int stackOut_103_0 = 0;
        int stackOut_103_1 = 0;
        int stackOut_105_0 = 0;
        int stackOut_105_1 = 0;
        int stackOut_106_0 = 0;
        int stackOut_106_1 = 0;
        int stackOut_131_0 = 0;
        int stackOut_132_0 = 0;
        int stackOut_132_1 = 0;
        int stackOut_133_0 = 0;
        int stackOut_133_1 = 0;
        int stackOut_134_0 = 0;
        int stackOut_134_1 = 0;
        int stackOut_136_0 = 0;
        int stackOut_136_1 = 0;
        int stackOut_148_0 = 0;
        int stackOut_149_0 = 0;
        int stackOut_149_1 = 0;
        int stackOut_150_0 = 0;
        int stackOut_150_1 = 0;
        int stackOut_151_0 = 0;
        int stackOut_151_1 = 0;
        int stackOut_153_0 = 0;
        int stackOut_153_1 = 0;
        int stackOut_154_0 = 0;
        int stackOut_154_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = field_A;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = sh.b(-128, 3) + ua.field_c;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (ue.field_c[rj.field_h] >= var2_int) {
                            statePc = 7;
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
                        if (ue.field_c[rj.field_h] < ua.field_c) {
                            statePc = 7;
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
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var2_int = ue.field_c[rj.field_h];
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (param0 == 0) {
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
                        field_C = null;
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
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var3 = sh.b(-126, 640);
                        var4 = -64 + (fi.field_e.field_f - -sh.b(91, 128));
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var2_int != 6) {
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
                        if (!gi.field_g) {
                            statePc = 17;
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
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var2_int = 12;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var7 = var2_int;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (0 == var7) {
                            statePc = 90;
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
                        if ((var7 ^ -1) == -2) {
                            statePc = 91;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var7 == 2) {
                            statePc = 99;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (-6 == (var7 ^ -1)) {
                            statePc = 99;
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
                        if ((var7 ^ -1) == -4) {
                            statePc = 115;
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
                        if (var7 == 9) {
                            statePc = 115;
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
                        if ((var7 ^ -1) != -12) {
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
                        if (var10 == 0) {
                            statePc = 115;
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
                        if (4 == var7) {
                            statePc = 123;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (10 != var7) {
                            statePc = 49;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (var10 == 0) {
                            statePc = 123;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (var7 != 6) {
                            statePc = 55;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (var10 == 0) {
                            statePc = 130;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if ((var7 ^ -1) != -8) {
                            statePc = 61;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (var10 == 0) {
                            statePc = 140;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (-9 != (var7 ^ -1)) {
                            statePc = 67;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (var10 == 0) {
                            statePc = 147;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (var7 != 13) {
                            statePc = 73;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if (var10 == 0) {
                            statePc = 147;
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
                        if (-13 != (var7 ^ -1)) {
                            statePc = 79;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if (var10 == 0) {
                            statePc = 163;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        if ((var7 ^ -1) != -15) {
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
                case 81: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        if (var10 == 0) {
                            statePc = 163;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        if (-16 == (var7 ^ -1)) {
                            statePc = 166;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        statePc = 169;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        var4 = var3;
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        nf.field_e = 0;
                        var7 = 0;
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        if ((var7 ^ -1) <= -6) {
                            statePc = 98;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        var8 = new bf(var3, -64 + 64 * -var7, var4, 1);
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        var8.field_p = true;
                        kh.field_y.b(65, (rf) (Object) var8);
                        var7++;
                        if (var10 != 0) {
                            statePc = 169;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        if (var10 == 0) {
                            statePc = 92;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        if (var10 == 0) {
                            statePc = 169;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        nf.field_e = 0;
                        var7_ref = null;
                        var8_int = 0;
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        stackOut_100_0 = var8_int ^ -1;
                        stackIn_105_0 = stackOut_100_0;
                        stackIn_101_0 = stackOut_100_0;
                        if (-3 == (nf.field_l ^ -1)) {
                            statePc = 105;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        stackOut_101_0 = stackIn_101_0;
                        stackOut_101_1 = 5;
                        stackIn_102_0 = stackOut_101_0;
                        stackIn_102_1 = stackOut_101_1;
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        stackOut_102_0 = stackIn_102_0;
                        stackOut_102_1 = stackIn_102_1;
                        stackIn_107_0 = stackOut_102_0;
                        stackIn_107_1 = stackOut_102_1;
                        stackIn_103_0 = stackOut_102_0;
                        stackIn_103_1 = stackOut_102_1;
                        if (var10 != 0) {
                            statePc = 107;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        stackOut_103_0 = stackIn_103_0;
                        stackOut_103_1 = stackIn_103_1;
                        stackIn_106_0 = stackOut_103_0;
                        stackIn_106_1 = stackOut_103_1;
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        stackOut_105_0 = stackIn_105_0;
                        stackOut_105_1 = 10;
                        stackIn_106_0 = stackOut_105_0;
                        stackIn_106_1 = stackOut_105_1;
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        stackOut_106_0 = stackIn_106_0;
                        stackOut_106_1 = stackIn_106_1 ^ -1;
                        stackIn_107_0 = stackOut_106_0;
                        stackIn_107_1 = stackOut_106_1;
                        statePc = 107;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        if (stackIn_107_0 <= stackIn_107_1) {
                            statePc = 114;
                        } else {
                            statePc = 108;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        var9 = new bf(var3, -var8_int * 64 + -64, var4, 2);
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        var9.field_h = var7_ref;
                        var9.field_p = true;
                        kh.field_y.b(param0 ^ 102, (rf) (Object) var9);
                        if (var8_int == 0) {
                            statePc = 112;
                        } else {
                            statePc = 110;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        statePc = 113;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        var7_ref = var9;
                        statePc = 113;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        var8_int++;
                        if (var10 == 0) {
                            statePc = 100;
                        } else {
                            statePc = 114;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        statePc = 169;
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        nf.field_e = 0;
                        var7 = -8;
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        if ((var7 ^ -1) <= -9) {
                            statePc = 122;
                        } else {
                            statePc = 117;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        var8 = new bf(var7 * 24 + 320, -Math.abs(-64 + var7 * 64), 320 - -(var7 * 24), 1);
                        statePc = 118;
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        var8.field_p = true;
                        kh.field_y.b(107, (rf) (Object) var8);
                        var7++;
                        if (var10 != 0) {
                            statePc = 169;
                        } else {
                            statePc = 119;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        if (var10 == 0) {
                            statePc = 116;
                        } else {
                            statePc = 120;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        if (var10 == 0) {
                            statePc = 169;
                        } else {
                            statePc = 123;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        nf.field_e = 0;
                        var7 = 0;
                        statePc = 124;
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        if ((var7 ^ -1) <= -6) {
                            statePc = 129;
                        } else {
                            statePc = 125;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        kh.field_y.b(param0 ^ 74, (rf) (Object) new bf(var3, -var7 * 64 - 64, var3, 1));
                        var7++;
                        if (var10 != 0) {
                            statePc = 169;
                        } else {
                            statePc = 126;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        if (var10 == 0) {
                            statePc = 124;
                        } else {
                            statePc = 127;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        statePc = 129;
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        if (var10 == 0) {
                            statePc = 169;
                        } else {
                            statePc = 130;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        nf.field_e = 100;
                        var7_ref = null;
                        var8_int = 0;
                        statePc = 131;
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        stackOut_131_0 = var8_int;
                        stackIn_136_0 = stackOut_131_0;
                        stackIn_132_0 = stackOut_131_0;
                        if (-3 == (nf.field_l ^ -1)) {
                            statePc = 136;
                        } else {
                            statePc = 132;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        stackOut_132_0 = stackIn_132_0;
                        stackOut_132_1 = 1;
                        stackIn_133_0 = stackOut_132_0;
                        stackIn_133_1 = stackOut_132_1;
                        statePc = 133;
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        stackOut_133_0 = stackIn_133_0;
                        stackOut_133_1 = stackIn_133_1;
                        stackIn_137_0 = stackOut_133_0;
                        stackIn_137_1 = stackOut_133_1;
                        stackIn_134_0 = stackOut_133_0;
                        stackIn_134_1 = stackOut_133_1;
                        if (var10 != 0) {
                            statePc = 137;
                        } else {
                            statePc = 134;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        stackOut_134_0 = stackIn_134_0;
                        stackOut_134_1 = stackIn_134_1;
                        stackIn_137_0 = stackOut_134_0;
                        stackIn_137_1 = stackOut_134_1;
                        statePc = 137;
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        stackOut_136_0 = stackIn_136_0;
                        stackOut_136_1 = 2;
                        stackIn_137_0 = stackOut_136_0;
                        stackIn_137_1 = stackOut_136_1;
                        statePc = 137;
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        if (stackIn_137_0 >= stackIn_137_1) {
                            statePc = 139;
                        } else {
                            statePc = 138;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        var9 = new bf(var3, -var8_int * 64 + -64, sh.b(param0 + 76, 128) - 64, 5);
                        var9.field_h = var7_ref;
                        var9.field_p = true;
                        kh.field_y.b(125, (rf) (Object) var9);
                        var7_ref = var9;
                        var8_int++;
                        if (var10 == 0) {
                            statePc = 131;
                        } else {
                            statePc = 139;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        statePc = 169;
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        nf.field_e = 0;
                        var7 = 0;
                        statePc = 141;
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        if (var7 >= 5) {
                            statePc = 146;
                        } else {
                            statePc = 142;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        kh.field_y.b(126, (rf) (Object) new bf(var3, -64 + 64 * -var7, var4, 1));
                        var7++;
                        if (var10 != 0) {
                            statePc = 169;
                        } else {
                            statePc = 143;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        if (var10 == 0) {
                            statePc = 141;
                        } else {
                            statePc = 144;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        statePc = 146;
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        if (var10 == 0) {
                            statePc = 169;
                        } else {
                            statePc = 147;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        var5 = null;
                        nf.field_e = 0;
                        var4 = -64 + var3 - -sh.b(-127, 128);
                        var7 = 0;
                        statePc = 148;
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        stackOut_148_0 = var7 ^ -1;
                        stackIn_153_0 = stackOut_148_0;
                        stackIn_149_0 = stackOut_148_0;
                        if (2 == nf.field_l) {
                            statePc = 153;
                        } else {
                            statePc = 149;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        stackOut_149_0 = stackIn_149_0;
                        stackOut_149_1 = 5;
                        stackIn_150_0 = stackOut_149_0;
                        stackIn_150_1 = stackOut_149_1;
                        statePc = 150;
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        stackOut_150_0 = stackIn_150_0;
                        stackOut_150_1 = stackIn_150_1;
                        stackIn_155_0 = stackOut_150_0;
                        stackIn_155_1 = stackOut_150_1;
                        stackIn_151_0 = stackOut_150_0;
                        stackIn_151_1 = stackOut_150_1;
                        if (var10 != 0) {
                            statePc = 155;
                        } else {
                            statePc = 151;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_150) {
                        caughtException = stateCaught_150;
                        statePc = 152;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        stackOut_151_0 = stackIn_151_0;
                        stackOut_151_1 = stackIn_151_1;
                        stackIn_154_0 = stackOut_151_0;
                        stackIn_154_1 = stackOut_151_1;
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
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        stackOut_153_0 = stackIn_153_0;
                        stackOut_153_1 = 10;
                        stackIn_154_0 = stackOut_153_0;
                        stackIn_154_1 = stackOut_153_1;
                        statePc = 154;
                        continue stateLoop;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        stackOut_154_0 = stackIn_154_0;
                        stackOut_154_1 = stackIn_154_1 ^ -1;
                        stackIn_155_0 = stackOut_154_0;
                        stackIn_155_1 = stackOut_154_1;
                        statePc = 155;
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        if (stackIn_155_0 <= stackIn_155_1) {
                            statePc = 162;
                        } else {
                            statePc = 156;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        var8 = new bf(var3, -var7 * 64 - 64, var4, 2);
                        statePc = 157;
                        continue stateLoop;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        var8.field_h = var5;
                        if ((var7 ^ -1) == -1) {
                            statePc = 160;
                        } else {
                            statePc = 158;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 158: {
                    try {
                        statePc = 161;
                        continue stateLoop;
                    } catch (Throwable stateCaught_158) {
                        caughtException = stateCaught_158;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 159: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_159) {
                        caughtException = stateCaught_159;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 160: {
                    try {
                        var5 = var8;
                        statePc = 161;
                        continue stateLoop;
                    } catch (Throwable stateCaught_160) {
                        caughtException = stateCaught_160;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 161: {
                    try {
                        kh.field_y.b(param0 + 69, (rf) (Object) var8);
                        var7++;
                        if (var10 == 0) {
                            statePc = 148;
                        } else {
                            statePc = 162;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 162: {
                    try {
                        if (var10 == 0) {
                            statePc = 169;
                        } else {
                            statePc = 163;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_162) {
                        caughtException = stateCaught_162;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 163: {
                    try {
                        nf.field_e = 175;
                        kh.field_y.b(77, (rf) (Object) new bf(var3, -64, var4, 4));
                        if (var10 == 0) {
                            statePc = 169;
                        } else {
                            statePc = 164;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 164: {
                    try {
                        statePc = 166;
                        continue stateLoop;
                    } catch (Throwable stateCaught_164) {
                        caughtException = stateCaught_164;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 165: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 166: {
                    try {
                        var6 = new bf(320, -256, var4, 11);
                        kh.field_y.b(101, (rf) (Object) var6);
                        tj.field_C = var6.field_k;
                        ua.field_c = 1 + ue.field_c[rj.field_h];
                        pf.field_d = pf.field_d + 1;
                        dg.field_l = 0;
                        mj.a(255, 12, 0, 41, 100);
                        ti.field_f.a((oa) (Object) kc.field_P);
                        kc.field_P.f();
                        kc.field_P = fl.field_h;
                        ti.field_f.b((oa) (Object) kc.field_P);
                        kc.field_P.a(mc.field_b);
                        statePc = 169;
                        continue stateLoop;
                    } catch (Throwable stateCaught_166) {
                        caughtException = stateCaught_166;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 168: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw sd.a((Throwable) (Object) var2, "StarCannon.GA(" + param0 + 41);
                }
                case 169: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void b(int param0) {
        RuntimeException var2 = null;
        hb var2_ref = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        qc stackIn_3_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackIn_70_0 = null;
        Object stackIn_72_0 = null;
        Object stackIn_74_0 = null;
        Object stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        int stackIn_100_0 = 0;
        int stackIn_115_0 = 0;
        qc stackOut_2_0 = null;
        Object stackOut_9_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_69_0 = null;
        Object stackOut_70_0 = null;
        Object stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        Object stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        int stackOut_99_0 = 0;
        int stackOut_114_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = field_A;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        nb.field_f.d();
                        ea.field_d.d();
                        if (null == n.field_a) {
                            statePc = 9;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = n.field_a;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (!stackIn_3_0.field_b) {
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
                case 6: {
                    try {
                        re.a(0);
                        le.b(-36);
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
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = this;
                        stackIn_12_0 = stackOut_9_0;
                        stackIn_10_0 = stackOut_9_0;
                        if (n.field_a == null) {
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
                        stackOut_10_0 = this;
                        stackOut_10_1 = 1;
                        stackIn_13_0 = stackOut_10_0;
                        stackIn_13_1 = stackOut_10_1;
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
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = this;
                        stackOut_12_1 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        ((StarCannon) this).b(stackIn_13_1 != 0, -1);
                        if (param0 == 320) {
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
                        ((StarCannon) this).a(-100);
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
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (fa.field_E) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        this.t(-23523);
                        fa.field_E = false;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (!le.c(4)) {
                            statePc = 32;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        ((StarCannon) this).f((byte) -90);
                        if (le.c(4)) {
                            statePc = 27;
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
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (!ai.a((byte) -78)) {
                            statePc = 31;
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
                        this.c(false, -1444);
                        statePc = 29;
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
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 31: {
                    return;
                }
                case 32: {
                    try {
                        if (!ld.field_ib) {
                            statePc = 106;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (null != oh.field_a) {
                            statePc = 93;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (!gh.f(-23093)) {
                            statePc = 63;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (-1 != (nh.field_e ^ -1)) {
                            statePc = 60;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var2_int = bd.b(31380);
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if ((var2_int ^ -1) != -3) {
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
                        re.a(0);
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
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (var2_int != 3) {
                            statePc = 51;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        hf.a(240, 12, 22, jk.field_f, 18, 320, jk.field_f, 12, (qe) (Object) a.field_b, param0 + -331, 12, true);
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
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (var2_int == 4) {
                            statePc = 54;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        vc.a(0, (byte) 60, 0);
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (gh.f(param0 + -23413)) {
                            statePc = 59;
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
                        fg.field_a[field_z].b(true, 0);
                        statePc = 57;
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
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (var4 == 0) {
                            statePc = 109;
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
                        this.b(true);
                        if (var4 == 0) {
                            statePc = 109;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (cb.a(false)) {
                            statePc = 69;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        this.b(true);
                        if (var4 == 0) {
                            statePc = 109;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        stackOut_69_0 = this;
                        stackIn_74_0 = stackOut_69_0;
                        stackIn_70_0 = stackOut_69_0;
                        if (null == n.field_a) {
                            statePc = 74;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        stackOut_70_0 = this;
                        stackIn_72_0 = stackOut_70_0;
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        stackOut_72_0 = this;
                        stackOut_72_1 = 1;
                        stackIn_75_0 = stackOut_72_0;
                        stackIn_75_1 = stackOut_72_1;
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        stackOut_74_0 = this;
                        stackOut_74_1 = 0;
                        stackIn_75_0 = stackOut_74_0;
                        stackIn_75_1 = stackOut_74_1;
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        var2_int = u.a((ag) this, stackIn_75_1 != 0, (byte) 112);
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if ((var2_int ^ -1) == -2) {
                            statePc = 79;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        re.a(0);
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if (-3 != (var2_int ^ -1)) {
                            statePc = 88;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        if (null != n.field_a) {
                            statePc = 86;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        re.a(0);
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        nh.a(ll.b(72), 337033697);
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        if (2364824 == var2_int) {
                            statePc = 91;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        ie.g(-1);
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        if (var4 == 0) {
                            statePc = 109;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        if (oh.field_a.field_n) {
                            statePc = 98;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        eb.field_c = eb.field_c | oh.field_a.field_k;
                        jg.field_H = jg.field_H & (oh.field_a.field_k ^ -1);
                        oh.field_a = null;
                        jj.i(122);
                        cf.e((byte) -117);
                        if (field_z != 5) {
                            statePc = 109;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        stackOut_99_0 = -1;
                        stackIn_100_0 = stackOut_99_0;
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        if (stackIn_100_0 != (jg.field_H ^ -1)) {
                            statePc = 109;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        statePc = 103;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        field_z = 2;
                        od.a(param0 ^ -312, 2, false);
                        if (var4 == 0) {
                            statePc = 109;
                        } else {
                            statePc = 104;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        this.c(true, param0 ^ -1252);
                        statePc = 107;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        if (!wk.a(34)) {
                            statePc = 112;
                        } else {
                            statePc = 110;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        var2_ref = (hb) (Object) bh.field_e.a((byte) 39);
                        if (null != var2_ref) {
                            statePc = 118;
                        } else {
                            statePc = 113;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        if (var4 != 0) {
                            statePc = 121;
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
                        stackOut_114_0 = var4;
                        stackIn_115_0 = stackOut_114_0;
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        if (stackIn_115_0 == 0) {
                            statePc = 122;
                        } else {
                            statePc = 116;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        statePc = 118;
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        sb.a(4, (byte) -41, var2_ref);
                        statePc = 119;
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        statePc = 121;
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        if (var4 == 0) {
                            statePc = 112;
                        } else {
                            statePc = 122;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        nf.a(0, (byte) 95);
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        if (!ll.a(s.field_k, (byte) -99)) {
                            statePc = 125;
                        } else {
                            statePc = 124;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        ((StarCannon) this).a(true);
                        if (var4 == 0) {
                            statePc = 123;
                        } else {
                            statePc = 125;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        var2_int = 0;
                        if (!se.b((byte) -91)) {
                            statePc = 131;
                        } else {
                            statePc = 126;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        var3 = ((StarCannon) this).h((byte) 58);
                        statePc = 127;
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        if (-3 == (var3 ^ -1)) {
                            statePc = 130;
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
                        statePc = 131;
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        var2_int = 1;
                        statePc = 131;
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        if (var2_int != 0) {
                            statePc = 134;
                        } else {
                            statePc = 132;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        statePc = 137;
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        ai.a(10, (hl[]) null, 240, af.field_y.field_r, (hl[]) null, a.field_b.field_q + a.field_b.field_r, (qe) (Object) a.field_b, 10, (qe) (Object) af.field_y, 320, 10, af.field_y.field_q + af.field_y.field_r, 25574, a.field_b.field_r);
                        statePc = 137;
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 136: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw sd.a((Throwable) (Object) var2, "StarCannon.K(" + param0 + 41);
                }
                case 137: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void c(boolean param0, int param1) {
        ja var3 = null;
        hl[] var3_array = null;
        int var4_int = 0;
        id[] var4 = null;
        hl[] var4_array = null;
        hl var5 = null;
        int var5_int = 0;
        hl var5_ref = null;
        int var6 = 0;
        hl var6_ref_hl = null;
        hl[] var7_ref_hl__ = null;
        int var7 = 0;
        hl var7_ref_hl = null;
        int var8 = 0;
        hl var8_ref_hl = null;
        hl var9 = null;
        hl[] var9_array = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        L0: {
          var12 = field_A;
          if (param1 == -1444) {
            break L0;
          } else {
            ((StarCannon) this).b(66);
            break L0;
          }
        }
        L1: {
          o.a(false);
          if (param0) {
            ne.b(lh.field_I, 150);
            break L1;
          } else {
            break L1;
          }
        }
        if (null != gf.field_c) {
          if (null == se.field_l) {
            if (fl.field_f == null) {
              ma.a(sj.field_C, -13923, 80.0f);
              ((StarCannon) this).d((byte) 22);
              gg.field_f = ob.a("smlships", 126, "", jg.field_F);
              nd.field_j = ob.a("destroyer", -121, "", jg.field_F);
              qc.field_e = ob.a("cruiser", param1 ^ -1484, "", jg.field_F);
              gf.field_a = ob.a("cannoneer", 116, "", jg.field_F);
              dl.field_c = ob.a("playership", param1 + 1407, "", jg.field_F);
              vc.field_m = ob.a("addons", 126, "", jg.field_F);
              hl[] discarded$4 = ob.a("glows", 118, "", jg.field_F);
              sj.field_E = ob.a("boss", -36, "", jg.field_F);
              fg.field_c = ob.a("boss2", param1 ^ 1474, "", jg.field_F);
              v.field_d = ob.a("boss3", 95, "", jg.field_F);
              af.field_w = fg.a(jg.field_F, "powerorbs", "", false);
              var3_array = ob.a("shots", -75, "", jg.field_F);
              var4_int = 0;
              L2: while (true) {
                L3: {
                  L4: {
                    if (5 <= var4_int) {
                      break L4;
                    } else {
                      jg.field_C[var4_int] = var3_array[var4_int];
                      var4_int++;
                      if (var12 != 0) {
                        break L3;
                      } else {
                        if (var12 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  var3_array = ob.a("shots2", -120, "", jg.field_F);
                  break L3;
                }
                var4_int = 0;
                L5: while (true) {
                  L6: {
                    if ((var4_int ^ -1) <= -6) {
                      break L6;
                    } else {
                      jg.field_C[var4_int + 5] = var3_array[var4_int];
                      var4_int++;
                      if (var12 == 0) {
                        continue L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var3_array = null;
                  ie.field_B = ob.a("explosion", 120, "", jg.field_F);
                  ad.field_z = ob.a("explosionb", -63, "", jg.field_F);
                  oh.field_d = ob.a("explosionc", -105, "", jg.field_F);
                  el.field_H = new hl[5];
                  var4_int = 0;
                  L7: while (true) {
                    L8: {
                      L9: {
                        if (var4_int >= 5) {
                          break L9;
                        } else {
                          el.field_H[var4_int] = new hl(32, 32);
                          var5 = new hl(32, 32);
                          var5.e();
                          gg.field_f[-var4_int + 24].b(0, 0);
                          var5.d();
                          var4_int++;
                          if (var12 != 0) {
                            break L8;
                          } else {
                            if (var12 == 0) {
                              continue L7;
                            } else {
                              break L9;
                            }
                          }
                        }
                      }
                      hg.field_y.b(param1 + 1333);
                      fl.field_f = ob.a("debris", 96, "", jg.field_F);
                      break L8;
                    }
                    var4_array = new hl[40];
                    var5_int = 0;
                    L10: while (true) {
                      L11: {
                        L12: {
                          if ((var5_int ^ -1) <= -5) {
                            break L12;
                          } else {
                            var4_array[36 + var5_int] = fl.field_f[var5_int - -12];
                            var5_int++;
                            if (var12 != 0) {
                              break L11;
                            } else {
                              if (var12 == 0) {
                                continue L10;
                              } else {
                                break L12;
                              }
                            }
                          }
                        }
                        var5_int = 0;
                        break L11;
                      }
                      L13: while (true) {
                        L14: {
                          L15: {
                            if (-13 >= (var5_int ^ -1)) {
                              break L15;
                            } else {
                              var4_array[var5_int] = fl.field_f[var5_int];
                              var4_array[12 + var5_int] = fl.field_f[var5_int].c();
                              var4_array[12 + var5_int].a();
                              var4_array[24 + var5_int] = fl.field_f[var5_int].c();
                              var4_array[24 + var5_int].b();
                              var5_int++;
                              if (var12 != 0) {
                                break L14;
                              } else {
                                if (var12 == 0) {
                                  continue L13;
                                } else {
                                  break L15;
                                }
                              }
                            }
                          }
                          fl.field_f = var4_array;
                          ma.field_e = ob.a("fr_thin_sqr_in", -49, "", jg.field_F);
                          gb.field_v = ob.a("fr_thin_sqr_ex", 119, "", jg.field_F);
                          ha.field_a = ob.a("fr_grid_sql_in", 119, "", jg.field_F);
                          ma.field_a = ob.a("fr_grid_sql_ex", 119, "", jg.field_F);
                          break L14;
                        }
                        var5_ref = ma.field_a[6];
                        var6_ref_hl = ma.field_a[7];
                        ma.field_a[8].field_q = 4;
                        var6_ref_hl.field_q = 4;
                        var5_ref.field_q = 4;
                        var7_ref_hl = ha.field_a[6];
                        ha.field_a[8].field_q = 4;
                        var8_ref_hl = ha.field_a[7];
                        var8_ref_hl.field_q = 4;
                        var7_ref_hl.field_q = 4;
                        vb.field_l = vk.a("", param1 ^ -1534, "life_icon", jg.field_F);
                        pk.field_e = vk.a("", 41, "main_border", jg.field_F);
                        hf.field_i = vk.a("", 45, "main_inner", jg.field_F);
                        rd.field_p = ob.a("menu_border", param1 ^ -1532, "", jg.field_F);
                        jk.field_f = ob.a("menu_innerborder", 98, "", jg.field_F);
                        var9_array = ob.a("headers", 117, "", jg.field_F);
                        fh.field_r[0] = var9_array[0];
                        fh.field_r[3] = var9_array[3];
                        fh.field_r[4] = var9_array[4];
                        fh.field_r[2] = var9_array[2];
                        fh.field_r[1] = var9_array[1];
                        fh.field_r[5] = var9_array[5];
                        var10 = new int[256];
                        var11 = 0;
                        L16: while (true) {
                          L17: {
                            L18: {
                              if (256 <= var11) {
                                break L18;
                              } else {
                                var10[var11] = w.a(var11 << -1286819065, 65303) + var11;
                                var11++;
                                if (var12 != 0) {
                                  break L17;
                                } else {
                                  if (var12 == 0) {
                                    continue L16;
                                  } else {
                                    break L18;
                                  }
                                }
                              }
                            }
                            var11 = 0;
                            break L17;
                          }
                          L19: while (true) {
                            L20: {
                              L21: {
                                if (-9 >= (var11 ^ -1)) {
                                  break L21;
                                } else {
                                  if (var12 != 0) {
                                    break L20;
                                  } else {
                                    L22: {
                                      if (fh.field_r[var11] != null) {
                                        rh.field_f[var11] = cl.a(5, fh.field_r[var11], true, false, var10, 255);
                                        break L22;
                                      } else {
                                        break L22;
                                      }
                                    }
                                    var11++;
                                    if (var12 == 0) {
                                      continue L19;
                                    } else {
                                      break L21;
                                    }
                                  }
                                }
                              }
                              tc.j(param1 + 1476);
                              break L20;
                            }
                            return;
                          }
                        }
                      }
                    }
                  }
                }
              }
            } else {
              if (null == kj.field_y[3]) {
                ma.a(sj.field_C, -13923, 90.0f);
                ((StarCannon) this).d((byte) 22);
                hl discarded$5 = vk.a("", 93, "mainmenubar", jg.field_F);
                ie.field_A = ob.a("zenon", 102, "", jg.field_F);
                hl discarded$6 = vk.a("", 120, "moon", jg.field_F);
                hl discarded$7 = vk.a("", param1 ^ -1487, "stars", jg.field_F);
                fh.field_q = vk.a("", param1 + 1531, "nebula", jg.field_F);
                gj.field_e = vk.a("", 125, "titlepic", jg.field_F);
                gb.field_r = vk.a("", 91, "title2", jg.field_F);
                ea.field_b[0] = vk.a("", 54, "sp0", jg.field_F);
                ea.field_b[1] = vk.a("", 116, "sp1", jg.field_F);
                ea.field_b[2] = vk.a("", 52, "sp2", jg.field_F);
                ea.field_b[3] = vk.a("", param1 + 1531, "sp3", jg.field_F);
                ea.field_b[4] = vk.a("", 43, "sp4", jg.field_F);
                ea.field_b[5] = vk.a("", 44, "sp5", jg.field_F);
                ea.field_b[6] = vk.a("", 93, "sp6", jg.field_F);
                ea.field_b[7] = vk.a("", param1 + 1497, "sp7", jg.field_F);
                ea.field_b[8] = vk.a("", 36, "sp8", jg.field_F);
                eb.field_b[0] = vk.a("", 47, "s0", jg.field_F);
                eb.field_b[1] = vk.a("", 107, "s1", jg.field_F);
                eb.field_b[2] = vk.a("", 86, "s2", jg.field_F);
                eb.field_b[3] = vk.a("", 23, "s3", jg.field_F);
                eb.field_b[4] = vk.a("", 20, "s4", jg.field_F);
                eb.field_b[5] = vk.a("", 82, "s5", jg.field_F);
                eb.field_b[6] = vk.a("", dg.a(param1, -1506), "s6", jg.field_F);
                eb.field_b[7] = vk.a("", dg.a(param1, -1419), "s7", jg.field_F);
                eb.field_b[8] = vk.a("", dg.a(param1, -1423), "s8", jg.field_F);
                eb.field_b[9] = vk.a("", 124, "s9", jg.field_F);
                eb.field_b[10] = vk.a("", param1 + 1532, "s10", jg.field_F);
                eb.field_b[11] = vk.a("", 21, "s11", jg.field_F);
                eb.field_b[12] = vk.a("", dg.a(param1, -1478), "s12", jg.field_F);
                eb.field_b[13] = vk.a("", param1 + 1523, "s13", jg.field_F);
                kj.field_y[0] = vk.a("", 76, "ap0", jg.field_F);
                kj.field_y[1] = vk.a("", 69, "ap1", jg.field_F);
                kj.field_y[2] = vk.a("", dg.a(param1, -1497), "ap2", jg.field_F);
                kj.field_y[3] = vk.a("", 100, "ap3", jg.field_F);
                tc.j(32);
                return;
              } else {
                ma.a(sj.field_C, -13923, 95.0f);
                ((StarCannon) this).d((byte) 22);
                af.field_y = od.a("", jg.field_F, "b12", param1 + 1443, cb.field_c);
                a.field_b = od.a("", jg.field_F, "font", -1, cb.field_c);
                var3_array = ob.a("screenshots", -105, "", jg.field_F);
                kk.a(vk.a("", 59, "mbfg", jg.field_F), -60, wc.field_g);
                ta.a(vk.a("", param1 ^ -1510, "mb_logo", jg.field_F), param1 + 1319);
                ed.a(0, 125, 123, (qe) (Object) a.field_b, 1500, -52, 9, 9, 16777215, 0, vk.a("", 60, "mbpb", jg.field_F));
                te.a(126, var3_array);
                lf.field_eb = null;
                var4 = new id[1];
                var4[0] = af.field_w[16 - -qb.field_e];
                af.field_y.a((ne[]) (Object) var4, (int[]) null);
                lf.field_V = vk.a("basic", 111, "unachieved", fi.field_f);
                li.a(lf.field_V, (byte) -100);
                sc.field_a = vk.a("basic", param1 ^ -1517, "locked", fi.field_f);
                li.a(sc.field_a, (byte) -100);
                var5 = vk.a("basic", 104, "orbcoin", fi.field_f);
                var6 = a.field_b.field_p - -a.field_b.field_q;
                el.field_J = new hl(var6, var6);
                el.field_J.e();
                var5.d(0, 0, var6, var6);
                j.field_c = ob.a("achievements_lrg", param1 + 1366, "", jg.field_F);
                var5 = null;
                var7_ref_hl__ = j.field_c;
                var8 = 0;
                L23: while (true) {
                  L24: {
                    L25: {
                      if (var8 >= var7_ref_hl__.length) {
                        break L25;
                      } else {
                        var9 = var7_ref_hl__[var8];
                        li.a(var9, (byte) -100);
                        var8++;
                        if (var12 != 0) {
                          break L24;
                        } else {
                          if (var12 == 0) {
                            continue L23;
                          } else {
                            break L25;
                          }
                        }
                      }
                    }
                    hg.field_y.b(-83);
                    jl.field_j = 5;
                    fi.field_f = null;
                    ia.field_k = 0;
                    jg.field_F = null;
                    tg.field_y = 10;
                    tj.field_G = 0;
                    pf.field_d = 1;
                    bf.field_w = 0;
                    ha.field_c = 0;
                    gj.field_c = -1;
                    jk.field_j = 0;
                    eg.field_l = 128;
                    ua.field_c = -2;
                    ha.field_d = 0;
                    vb.field_m = 1;
                    cg.field_e = 0;
                    ui.field_p = 0;
                    kd.field_C = -1;
                    fi.field_e = new bf(256, 256, 256, 0);
                    fi.field_e.field_r = 256;
                    fi.field_e.field_k = 0;
                    kh.field_y.a(-71, (rf) (Object) fi.field_e);
                    u.field_b = 0;
                    ed.field_n = 0;
                    ig.field_h = 0;
                    hc.field_c = 0;
                    nf.field_e = 0;
                    eg.field_f = new wd(fb.field_t);
                    gd.field_a = new wd(qf.field_i);
                    fl.field_h = new wd(r.field_b);
                    kc.field_P = eg.field_f;
                    kc.field_P.a(mc.field_b);
                    ti.field_f.b((oa) (Object) kc.field_P);
                    ne.a(50, 39);
                    qd.a(1, 50);
                    fg.field_a = new jl[8];
                    pc.a(-5695);
                    break L24;
                  }
                  var7 = 0;
                  L26: while (true) {
                    L27: {
                      L28: {
                        L29: {
                          if (-9 >= (var7 ^ -1)) {
                            break L29;
                          } else {
                            fg.field_a[var7] = new jl(var7);
                            var7++;
                            if (var12 != 0) {
                              break L28;
                            } else {
                              if (var12 == 0) {
                                continue L26;
                              } else {
                                break L29;
                              }
                            }
                          }
                        }
                        if (!wk.a(45)) {
                          break L28;
                        } else {
                          break L27;
                        }
                      }
                      oh.field_a = og.a(4, (byte) 113);
                      break L27;
                    }
                    ld.field_ib = true;
                    tc.j(param1 + 1476);
                    return;
                  }
                }
              }
            }
          } else {
            ma.a(nc.field_d, -13923, 75.0f);
            ((StarCannon) this).d((byte) 22);
            var3 = new ja(lj.field_h, nd.field_p);
            fb.field_t = dl.a(var3, (byte) 84, "music/star cannon level 1 final", "", se.field_l);
            qf.field_i = dl.a(var3, (byte) 66, "music/star cannon level 2 final", "", se.field_l);
            r.field_b = dl.a(var3, (byte) -82, "music/star cannon boss final", "", se.field_l);
            nd.field_p = null;
            se.field_l = null;
            lj.field_h = null;
            tc.j(32);
            return;
          }
        } else {
          L30: {
            if (!lj.field_h.b((byte) 118)) {
              break L30;
            } else {
              if (!lj.field_h.a(param1 + 31185)) {
                break L30;
              } else {
                L31: {
                  if (!nd.field_p.b((byte) 95)) {
                    break L31;
                  } else {
                    if (nd.field_p.a(29741)) {
                      L32: {
                        if (!se.field_l.b((byte) 109)) {
                          break L32;
                        } else {
                          if (se.field_l.a(29741)) {
                            L33: {
                              if (!jg.field_F.b((byte) 119)) {
                                break L33;
                              } else {
                                if (jg.field_F.a(29741)) {
                                  L34: {
                                    if (!cb.field_c.b((byte) 127)) {
                                      break L34;
                                    } else {
                                      if (!cb.field_c.a(29741)) {
                                        break L34;
                                      } else {
                                        L35: {
                                          if (!fi.field_f.b((byte) 103)) {
                                            break L35;
                                          } else {
                                            if (fi.field_f.a("basic", -9883)) {
                                              ma.a(fa.field_z, -13923, 70.0f);
                                              ((StarCannon) this).d((byte) 22);
                                              if (!param0) {
                                                return;
                                              } else {
                                                jj.i(param1 ^ -1478);
                                                gf.field_c = new ud[48];
                                                gf.field_c[0] = aj.a(lj.field_h, "", "SC_bossdamage").a();
                                                gf.field_c[1] = aj.a(lj.field_h, "", "SC_bossdestroy").a();
                                                gf.field_c[2] = aj.a(lj.field_h, "", "SC_collect1").a();
                                                gf.field_c[7] = aj.a(lj.field_h, "", "SC_enemydamage2").a();
                                                gf.field_c[8] = aj.a(lj.field_h, "", "SC_enemydamage3").a();
                                                gf.field_c[9] = aj.a(lj.field_h, "", "SC_enemydestroy3").a();
                                                gf.field_c[10] = aj.a(lj.field_h, "", "SC_enemydestroy4").a();
                                                gf.field_c[3] = aj.a(lj.field_h, "", "SC_enemyfire1").a();
                                                gf.field_c[4] = aj.a(lj.field_h, "", "SC_enemyfire2").a();
                                                gf.field_c[5] = aj.a(lj.field_h, "", "SC_enemyfire3").a();
                                                gf.field_c[6] = aj.a(lj.field_h, "", "SC_enemyfire4").a();
                                                gf.field_c[19] = aj.a(lj.field_h, "", "SC_playerdestroy").a();
                                                gf.field_c[20] = aj.a(lj.field_h, "", "SC_backcannon").a();
                                                gf.field_c[21] = aj.a(lj.field_h, "", "SC_FOLLOWERFIRE").a();
                                                gf.field_c[11] = aj.a(lj.field_h, "", "SC_playerfire1").a();
                                                gf.field_c[12] = aj.a(lj.field_h, "", "SC_playerfire2").a();
                                                gf.field_c[13] = aj.a(lj.field_h, "", "SC_helix_1").a();
                                                gf.field_c[14] = aj.a(lj.field_h, "", "SC_helix_2").a();
                                                gf.field_c[15] = aj.a(lj.field_h, "", "SC_helix_3").a();
                                                gf.field_c[16] = aj.a(lj.field_h, "", "SC_lance_1").a();
                                                gf.field_c[17] = aj.a(lj.field_h, "", "SC_lance_2").a();
                                                gf.field_c[18] = aj.a(lj.field_h, "", "SC_lance_3").a();
                                                gf.field_c[22] = aj.a(lj.field_h, "", "SC_rewind_activated_part1").a();
                                                gf.field_c[23] = aj.a(lj.field_h, "", "SC_rewind_installed").a();
                                                gf.field_c[24] = aj.a(lj.field_h, "", "SC_seekermine_explode").a();
                                                gf.field_c[25] = aj.a(lj.field_h, "", "SC_shield_discharged").a();
                                                gf.field_c[26] = aj.a(lj.field_h, "", "SC_shield_rearm").a();
                                                gf.field_c[27] = aj.a(lj.field_h, "", "SC_shieldburst").a();
                                                gf.field_c[28] = aj.a(lj.field_h, "", "SC_thruster_upgrade").a();
                                                gf.field_c[29] = aj.a(lj.field_h, "", "SC_rearcannon_upgrade").a();
                                                gf.field_c[30] = aj.a(lj.field_h, "", "SC_shield_upgraded").a();
                                                gf.field_c[31] = aj.a(lj.field_h, "", "SC_sidecannons_upgrade").a();
                                                gf.field_c[46] = aj.a(lj.field_h, "", "SC_xenon_operational").a();
                                                gf.field_c[47] = aj.a(lj.field_h, "", "SC_xenonbeamshot").a();
                                                gf.field_c[32] = nj.a(nd.field_p, "", "SC_systems malfunction").c();
                                                gf.field_c[39] = nj.a(nd.field_p, "", "SC_VOC_54321").c();
                                                gf.field_c[40] = nj.a(nd.field_p, "", "SC_VOC_back cannons upgraded").c();
                                                gf.field_c[41] = nj.a(nd.field_p, "", "SC_VOC_hostile mothership approaching").c();
                                                gf.field_c[42] = nj.a(nd.field_p, "", "SC_VOC_powerup collected").c();
                                                gf.field_c[43] = nj.a(nd.field_p, "", "SC_VOC_returning to normal space").c();
                                                gf.field_c[44] = nj.a(nd.field_p, "", "SC_VOC_rewind module activated").c();
                                                gf.field_c[45] = nj.a(nd.field_p, "", "SC_VOC_rewind module installed").c();
                                                gf.field_c[33] = nj.a(nd.field_p, "", "SC_VOC_shield discharged").c();
                                                gf.field_c[34] = nj.a(nd.field_p, "", "SC_VOC_shield rearmed").c();
                                                gf.field_c[35] = nj.a(nd.field_p, "", "SC_VOC_shields upgraded").c();
                                                gf.field_c[36] = nj.a(nd.field_p, "", "SC_VOC_side cannons upgraded").c();
                                                gf.field_c[37] = nj.a(nd.field_p, "", "SC_VOC_thrusters upgraded").c();
                                                gf.field_c[38] = nj.a(nd.field_p, "", "SC_VOC_zenon beam operational").c();
                                                nd.a(272, -3763, 3278, 39);
                                                nd.a(0, -3763, 300, 11);
                                                nd.a(0, -3763, 300, 12);
                                                nd.a(50, -3763, 300, 16);
                                                nd.a(0, param1 + -2319, 100, 17);
                                                nd.a(0, param1 ^ 2833, 100, 18);
                                                tc.j(param1 ^ -1412);
                                                return;
                                              }
                                            } else {
                                              break L35;
                                            }
                                          }
                                        }
                                        ma.a(bh.a(n.field_f, fi.field_f, (byte) -38, ae.field_a, "basic"), -13923, 60.0f);
                                        return;
                                      }
                                    }
                                  }
                                  ma.a(bh.a(s.field_g, cb.field_c, (byte) -38, sj.field_D, ""), -13923, 50.0f);
                                  return;
                                } else {
                                  break L33;
                                }
                              }
                            }
                            ma.a(bh.a(n.field_f, jg.field_F, (byte) -38, ae.field_a, ""), param1 + -12479, 40.0f);
                            return;
                          } else {
                            break L32;
                          }
                        }
                      }
                      ma.a(bh.a(kc.field_U, se.field_l, (byte) -38, ia.field_l, ""), -13923, 30.0f);
                      return;
                    } else {
                      break L31;
                    }
                  }
                }
                ma.a(bh.a(lc.field_ib, nd.field_p, (byte) -38, bd.field_g, ""), -13923, 20.0f);
                return;
              }
            }
          }
          ma.a(bh.a(lc.field_ib, lj.field_h, (byte) -38, bd.field_g, ""), param1 ^ 13249, 10.0f);
          return;
        }
    }

    private final void m(byte param0) {
        int var2_int = 0;
        bf var2 = null;
        bf var2_ref = null;
        int var3 = 0;
        bf var3_ref = null;
        int[] var3_ref_int__ = null;
        bf var3_ref_bf = null;
        int var4_int = 0;
        ud var4 = null;
        bf var4_ref = null;
        bf var4_ref2 = null;
        int var5_int = 0;
        fj var5 = null;
        int var6_int = 0;
        bf var6 = null;
        int var7 = 0;
        int var8 = 0;
        bf stackIn_55_0 = null;
        bf stackIn_55_1 = null;
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
        bf stackIn_121_0 = null;
        bf stackIn_121_1 = null;
        int stackIn_126_0 = 0;
        int stackIn_126_1 = 0;
        bf stackIn_129_0 = null;
        bf stackIn_129_1 = null;
        int stackIn_180_0 = 0;
        int stackIn_180_1 = 0;
        int stackIn_184_0 = 0;
        int stackIn_187_0 = 0;
        int stackIn_189_0 = 0;
        int stackIn_189_1 = 0;
        boolean stackIn_408_0 = false;
        int stackIn_414_0 = 0;
        int stackIn_531_0 = 0;
        int stackIn_531_1 = 0;
        int stackIn_603_0 = 0;
        int stackIn_603_1 = 0;
        int stackIn_612_0 = 0;
        int stackIn_612_1 = 0;
        int stackIn_641_0 = 0;
        int stackIn_641_1 = 0;
        bf stackOut_54_0 = null;
        bf stackOut_54_1 = null;
        int stackOut_59_0 = 0;
        int stackOut_59_1 = 0;
        bf stackOut_120_0 = null;
        bf stackOut_120_1 = null;
        int stackOut_125_0 = 0;
        int stackOut_125_1 = 0;
        bf stackOut_128_0 = null;
        bf stackOut_128_1 = null;
        int stackOut_179_0 = 0;
        int stackOut_179_1 = 0;
        int stackOut_183_0 = 0;
        int stackOut_182_0 = 0;
        int stackOut_186_0 = 0;
        int stackOut_185_0 = 0;
        int stackOut_188_0 = 0;
        int stackOut_188_1 = 0;
        boolean stackOut_407_0 = false;
        int stackOut_413_0 = 0;
        int stackOut_530_0 = 0;
        int stackOut_530_1 = 0;
        int stackOut_602_0 = 0;
        int stackOut_602_1 = 0;
        int stackOut_611_0 = 0;
        int stackOut_611_1 = 0;
        int stackOut_640_0 = 0;
        int stackOut_640_1 = 0;
        L0: {
          var8 = field_A;
          if ((ie.field_C ^ -1) < -1) {
            ie.field_C = ie.field_C - 1;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (0 == (gj.field_c ^ -1)) {
            L2: {
              var2_int = 0;
              if (0 != ia.field_k) {
                break L2;
              } else {
                if (0 != jg.field_H) {
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              L4: {
                if (!wk.a(86)) {
                  break L4;
                } else {
                  L5: {
                    if (ia.field_k > 0) {
                      break L5;
                    } else {
                      if (jg.field_H > 0) {
                        break L5;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var2_int = 6;
                  if (var8 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              L6: {
                if (0 >= jg.field_H) {
                  break L6;
                } else {
                  var2_int = 5;
                  if (var8 == 0) {
                    break L3;
                  } else {
                    break L6;
                  }
                }
              }
              if (0 < kd.field_C) {
                var2_int = 2;
                break L3;
              } else {
                break L3;
              }
            }
            od.a(-126, var2_int, false);
            break L1;
          } else {
            break L1;
          }
        }
        L7: {
          if (tj.field_G <= 0) {
            break L7;
          } else {
            fi.field_e.field_k = 1;
            ha.field_d = 0;
            ui.field_p = eg.field_l + -32;
            tj.field_G = tj.field_G - 1;
            if (0 >= tj.field_G) {
              ui.field_p = 0;
              mj.a(255, 12, 0, 43, 100);
              break L7;
            } else {
              break L7;
            }
          }
        }
        L8: {
          L9: {
            L10: {
              L11: {
                L12: {
                  if (-1 <= (fi.field_e.field_k ^ -1)) {
                    break L12;
                  } else {
                    L13: {
                      if (!gi.field_g) {
                        break L13;
                      } else {
                        if (2 > ua.field_c) {
                          break L13;
                        } else {
                          if (-1 == (rj.field_h ^ -1)) {
                            ia.field_k = ia.field_k + 1;
                            fc.field_e = fc.field_e + 2;
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                      }
                    }
                    L14: {
                      if (ui.field_p <= 0) {
                        break L14;
                      } else {
                        L15: {
                          ui.field_p = ui.field_p + 8;
                          if ((ui.field_p ^ -1) >= (eg.field_l ^ -1)) {
                            break L15;
                          } else {
                            dg.field_l = 0;
                            ui.field_p = 0;
                            mj.a(96, 12, 0, 25, 100);
                            mj.a(255, 12, 0, 33, 100);
                            break L15;
                          }
                        }
                        var2_int = 0;
                        L16: while (true) {
                          L17: {
                            if (-4001 >= (var2_int ^ -1)) {
                              break L17;
                            } else {
                              if (var8 != 0) {
                                break L11;
                              } else {
                                L18: {
                                  if (qc.field_c[var2_int] == null) {
                                    break L18;
                                  } else {
                                    if (-3 != (qc.field_c[var2_int].field_h ^ -1)) {
                                      break L18;
                                    } else {
                                      var3 = qc.field_c[var2_int].field_d + -fi.field_e.field_f;
                                      var4_int = qc.field_c[var2_int].field_q + -fi.field_e.field_u;
                                      var5_int = (int)Math.sqrt((double)(var4_int * var4_int + var3 * var3));
                                      if ((var5_int ^ -1) > (ui.field_p ^ -1)) {
                                        qc.field_c[var2_int].field_h = 0;
                                        qc.field_c[var2_int].field_p = 64;
                                        break L18;
                                      } else {
                                        break L18;
                                      }
                                    }
                                  }
                                }
                                var2_int++;
                                if (var8 == 0) {
                                  continue L16;
                                } else {
                                  break L17;
                                }
                              }
                            }
                          }
                          var2_ref = (bf) (Object) kh.field_y.c(-3905);
                          L19: while (true) {
                            L20: {
                              if (null == var2_ref) {
                                break L20;
                              } else {
                                stackOut_54_0 = fi.field_e;
                                stackOut_54_1 = (bf) var2_ref;
                                stackIn_129_0 = stackOut_54_0;
                                stackIn_129_1 = stackOut_54_1;
                                stackIn_55_0 = stackOut_54_0;
                                stackIn_55_1 = stackOut_54_1;
                                if (var8 != 0) {
                                  break L9;
                                } else {
                                  L21: {
                                    if (stackIn_55_0 == stackIn_55_1) {
                                      break L21;
                                    } else {
                                      var3 = var2_ref.field_f + -fi.field_e.field_f;
                                      var4_int = -fi.field_e.field_u + var2_ref.field_u;
                                      var5_int = (int)Math.sqrt((double)(var4_int * var4_int + var3 * var3));
                                      var6_int = 0;
                                      L22: while (true) {
                                        if ((ui.field_p ^ -1) >= (var6_int ^ -1)) {
                                          break L21;
                                        } else {
                                          stackOut_59_0 = var6_int;
                                          stackOut_59_1 = var5_int;
                                          stackIn_126_0 = stackOut_59_0;
                                          stackIn_126_1 = stackOut_59_1;
                                          stackIn_60_0 = stackOut_59_0;
                                          stackIn_60_1 = stackOut_59_1;
                                          if (var8 != 0) {
                                            break L10;
                                          } else {
                                            L23: {
                                              if (stackIn_60_0 <= stackIn_60_1) {
                                                break L23;
                                              } else {
                                                if (-11 != (var2_ref.field_q ^ -1)) {
                                                  L24: {
                                                    if (var2_ref.field_q != 22) {
                                                      break L24;
                                                    } else {
                                                      if (var2_ref.field_l < 36) {
                                                        break L24;
                                                      } else {
                                                        if (39 < var2_ref.field_l) {
                                                          break L24;
                                                        } else {
                                                          break L23;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  L25: {
                                                    if (-1 < (var3 ^ -1)) {
                                                      var2_ref.field_f = var2_ref.field_f - 1;
                                                      break L25;
                                                    } else {
                                                      break L25;
                                                    }
                                                  }
                                                  L26: {
                                                    if (0 >= var3) {
                                                      break L26;
                                                    } else {
                                                      var2_ref.field_f = var2_ref.field_f + 1;
                                                      break L26;
                                                    }
                                                  }
                                                  L27: {
                                                    if (-1 < (var4_int ^ -1)) {
                                                      var2_ref.field_u = var2_ref.field_u - 1;
                                                      break L27;
                                                    } else {
                                                      break L27;
                                                    }
                                                  }
                                                  if (0 >= var4_int) {
                                                    break L23;
                                                  } else {
                                                    var2_ref.field_u = var2_ref.field_u + 1;
                                                    break L23;
                                                  }
                                                } else {
                                                  break L23;
                                                }
                                              }
                                            }
                                            var6_int++;
                                            if (var8 == 0) {
                                              continue L22;
                                            } else {
                                              break L21;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var2_ref = (bf) (Object) kh.field_y.a(-16913);
                                  if (var8 == 0) {
                                    continue L19;
                                  } else {
                                    break L20;
                                  }
                                }
                              }
                            }
                            if (var8 == 0) {
                              break L11;
                            } else {
                              break L14;
                            }
                          }
                        }
                      }
                    }
                    if (ha.field_d > 0) {
                      L28: {
                        var2_int = vb.field_m + 1;
                        if (4 == vb.field_m) {
                          var2_int++;
                          break L28;
                        } else {
                          break L28;
                        }
                      }
                      L29: {
                        if (vb.field_m == 5) {
                          var2_int += 2;
                          break L29;
                        } else {
                          break L29;
                        }
                      }
                      L30: {
                        ha.field_d = ha.field_d - var2_int;
                        if (null != ah.field_a) {
                          break L30;
                        } else {
                          if (-5 < (vb.field_m ^ -1)) {
                            L31: {
                              var3 = 0;
                              if (-3 == (vb.field_m ^ -1)) {
                                var3 = 28665;
                                break L31;
                              } else {
                                break L31;
                              }
                            }
                            L32: {
                              if (3 == vb.field_m) {
                                var3 = 42997;
                                break L32;
                              } else {
                                break L32;
                              }
                            }
                            L33: {
                              var4 = gf.field_c[39];
                              var5 = fj.a(var4, 100, 255 * nb.field_g / 100);
                              ah.field_a = fj.a(var4, 100, 255 * nb.field_g / 100);
                              var5.d(var3);
                              var6_int = (var2_int + ha.field_d + -1) / var2_int;
                              var7 = -300 + (var6_int * 20 + -((var4.field_i.length + -var3) * 1000 / var4.field_j));
                              if ((var7 ^ -1) < -1) {
                                break L33;
                              } else {
                                jk.field_k.b((c) (Object) ah.field_a);
                                if (var8 == 0) {
                                  break L30;
                                } else {
                                  break L33;
                                }
                              }
                            }
                            ok.field_tb = eg.a(29723, var7, (c) (Object) ah.field_a);
                            jk.field_k.b((c) (Object) ok.field_tb);
                            break L30;
                          } else {
                            break L30;
                          }
                        }
                      }
                      L34: {
                        if (ha.field_d <= 0) {
                          ha.field_d = 0;
                          dg.field_l = 0;
                          mj.a(255, 12, 0, 34, 100);
                          mj.a(96, 12, 0, 26, 100);
                          ok.field_tb = null;
                          ah.field_a = null;
                          break L34;
                        } else {
                          break L34;
                        }
                      }
                      if (var8 == 0) {
                        break L11;
                      } else {
                        break L12;
                      }
                    } else {
                      break L11;
                    }
                  }
                }
                if (gj.field_c >= 0) {
                  break L11;
                } else {
                  var2_int = 0;
                  L35: while (true) {
                    L36: {
                      if (var2_int >= 4000) {
                        break L36;
                      } else {
                        qc.field_c[var2_int] = null;
                        var2_int++;
                        if (var8 != 0) {
                          break L11;
                        } else {
                          if (var8 == 0) {
                            continue L35;
                          } else {
                            break L36;
                          }
                        }
                      }
                    }
                    var2_ref = (bf) (Object) kh.field_y.c(-3905);
                    L37: while (true) {
                      if (null == var2_ref) {
                        break L11;
                      } else {
                        stackOut_120_0 = fi.field_e;
                        stackOut_120_1 = (bf) var2_ref;
                        stackIn_129_0 = stackOut_120_0;
                        stackIn_129_1 = stackOut_120_1;
                        stackIn_121_0 = stackOut_120_0;
                        stackIn_121_1 = stackOut_120_1;
                        if (var8 != 0) {
                          break L9;
                        } else {
                          L38: {
                            if (stackIn_121_0 == stackIn_121_1) {
                              break L38;
                            } else {
                              var2_ref.b(4);
                              break L38;
                            }
                          }
                          var2_ref = (bf) (Object) kh.field_y.a(-16913);
                          if (var8 == 0) {
                            continue L37;
                          } else {
                            break L11;
                          }
                        }
                      }
                    }
                  }
                }
              }
              var2 = fi.field_e;
              stackOut_125_0 = 10;
              stackOut_125_1 = u.field_b;
              stackIn_126_0 = stackOut_125_0;
              stackIn_126_1 = stackOut_125_1;
              break L10;
            }
            if (stackIn_126_0 < stackIn_126_1) {
              u.field_b = 0;
              stackOut_128_0 = (bf) var2;
              stackOut_128_1 = (bf) var2;
              stackIn_129_0 = stackOut_128_0;
              stackIn_129_1 = stackOut_128_1;
              break L9;
            } else {
              break L8;
            }
          }
          stackIn_129_0.field_k = stackIn_129_1.field_k + 1;
          break L8;
        }
        L39: {
          if (0 > var2.field_f) {
            var2.field_f = 0;
            var2.field_n = 50;
            break L39;
          } else {
            break L39;
          }
        }
        L40: {
          if (99 < (u.field_b ^ -1)) {
            u.field_b = -100;
            break L40;
          } else {
            break L40;
          }
        }
        L41: {
          if (var2.field_f > 640) {
            var2.field_f = 640;
            var2.field_n = -50;
            break L41;
          } else {
            break L41;
          }
        }
        L42: {
          if ((var2.field_u ^ -1) <= -1) {
            break L42;
          } else {
            var2.field_z = 50;
            var2.field_u = 0;
            break L42;
          }
        }
        L43: {
          if (var2.field_u > 448) {
            var2.field_z = -50;
            var2.field_u = 448;
            break L43;
          } else {
            break L43;
          }
        }
        L44: {
          if (-9 <= (ig.field_h ^ -1)) {
            break L44;
          } else {
            ig.field_h = sh.b(-6, 4);
            break L44;
          }
        }
        L45: {
          L46: {
            vd.field_j = vd.field_j + 3;
            hc.field_c = hc.field_c + 1;
            ed.field_n = ed.field_n + 1;
            if ((ge.field_c[0] ^ -1) == -3) {
              break L46;
            } else {
              if (ge.field_c[0] == 7) {
                break L46;
              } else {
                if ((ge.field_c[0] ^ -1) == -13) {
                  break L46;
                } else {
                  if (ua.field_c < -2) {
                    break L46;
                  } else {
                    break L45;
                  }
                }
              }
            }
          }
          vd.field_j = vd.field_j + 9;
          hc.field_c = hc.field_c + 3;
          if ((ua.field_c ^ -1) > 1) {
            hc.field_c = hc.field_c + 3;
            ed.field_n = ed.field_n + 2;
            vd.field_j = vd.field_j + 9;
            break L45;
          } else {
            break L45;
          }
        }
        L47: {
          if (-1029 <= (ed.field_n ^ -1)) {
            break L47;
          } else {
            L48: {
              L49: {
                if (ua.field_c < ue.field_c[rj.field_h]) {
                  L50: {
                    ua.field_c = ua.field_c + 1;
                    if (-10 == (ua.field_c ^ -1)) {
                      var3_ref = new bf(fi.field_e.field_f, -32, fi.field_e.field_f, 10);
                      var3_ref.field_l = 5;
                      kh.field_y.b(97, (rf) (Object) var3_ref);
                      break L50;
                    } else {
                      break L50;
                    }
                  }
                  L51: {
                    L52: {
                      L53: {
                        L54: {
                          L55: {
                            L56: {
                              if ((rj.field_h ^ -1) != -1) {
                                break L56;
                              } else {
                                L57: {
                                  nf.field_e = -50;
                                  if (10 == ua.field_c) {
                                    break L57;
                                  } else {
                                    if (-13 != (ua.field_c ^ -1)) {
                                      break L56;
                                    } else {
                                      break L57;
                                    }
                                  }
                                }
                                var3 = sh.b(113, 640);
                                var4_int = -64 + (fi.field_e.field_f + sh.b(-126, 128));
                                var5_int = 0;
                                L58: while (true) {
                                  if (-6 >= (var5_int ^ -1)) {
                                    break L56;
                                  } else {
                                    var6 = new bf(var3, -var5_int * 64 + -64, var4_int, 17);
                                    var6.field_o = sh.b(-127, 32);
                                    kh.field_y.b(114, (rf) (Object) var6);
                                    var5_int++;
                                    if (var8 != 0) {
                                      break L55;
                                    } else {
                                      if (var8 == 0) {
                                        continue L58;
                                      } else {
                                        break L56;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            if ((rj.field_h ^ -1) == -2) {
                              break L55;
                            } else {
                              break L54;
                            }
                          }
                          L59: {
                            L60: {
                              if ((ua.field_c ^ -1) != -5) {
                                break L60;
                              } else {
                                var3 = 36;
                                L61: while (true) {
                                  if ((var3 ^ -1) <= -41) {
                                    break L60;
                                  } else {
                                    stackOut_179_0 = -1;
                                    stackOut_179_1 = 1 & var3 ^ -1;
                                    stackIn_189_0 = stackOut_179_0;
                                    stackIn_189_1 = stackOut_179_1;
                                    stackIn_180_0 = stackOut_179_0;
                                    stackIn_180_1 = stackOut_179_1;
                                    if (var8 != 0) {
                                      break L59;
                                    } else {
                                      L62: {
                                        if (stackIn_180_0 != stackIn_180_1) {
                                          stackOut_183_0 = 424;
                                          stackIn_184_0 = stackOut_183_0;
                                          break L62;
                                        } else {
                                          stackOut_182_0 = 296;
                                          stackIn_184_0 = stackOut_182_0;
                                          break L62;
                                        }
                                      }
                                      L63: {
                                        var4_int = stackIn_184_0;
                                        if ((var3 ^ -1) <= -39) {
                                          stackOut_186_0 = -128;
                                          stackIn_187_0 = stackOut_186_0;
                                          break L63;
                                        } else {
                                          stackOut_185_0 = -256;
                                          stackIn_187_0 = stackOut_185_0;
                                          break L63;
                                        }
                                      }
                                      var5_int = stackIn_187_0;
                                      var6 = new bf(var4_int, var5_int, var4_int, 22);
                                      li.a(-126, var6);
                                      var6.field_l = var3;
                                      var6.field_n = 0;
                                      var6.field_z = 32;
                                      var3++;
                                      if (var8 == 0) {
                                        continue L61;
                                      } else {
                                        break L60;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_188_0 = 5;
                            stackOut_188_1 = ua.field_c;
                            stackIn_189_0 = stackOut_188_0;
                            stackIn_189_1 = stackOut_188_1;
                            break L59;
                          }
                          L64: {
                            L65: {
                              L66: {
                                if (stackIn_189_0 == stackIn_189_1) {
                                  break L66;
                                } else {
                                  if (ua.field_c == 15) {
                                    break L66;
                                  } else {
                                    break L65;
                                  }
                                }
                              }
                              nf.field_e = -250;
                              var3 = 0;
                              L67: while (true) {
                                if (25 <= var3) {
                                  break L65;
                                } else {
                                  kh.field_y.b(99, (rf) (Object) new bf(sh.b(-128, 640), -var3 * 25 + -128, sh.b(60, 128) + fi.field_e.field_f - 64, 18));
                                  var3++;
                                  if (var8 != 0) {
                                    break L64;
                                  } else {
                                    if (var8 == 0) {
                                      continue L67;
                                    } else {
                                      break L65;
                                    }
                                  }
                                }
                              }
                            }
                            L68: {
                              if (4 == ua.field_c) {
                                break L68;
                              } else {
                                if ((ua.field_c ^ -1) == -7) {
                                  break L68;
                                } else {
                                  if (ua.field_c == 8) {
                                    break L68;
                                  } else {
                                    if (ua.field_c == 10) {
                                      break L68;
                                    } else {
                                      if ((ua.field_c ^ -1) == -13) {
                                        break L68;
                                      } else {
                                        if (ua.field_c == 14) {
                                          break L68;
                                        } else {
                                          break L54;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            var3 = -300 + (900 * sh.b(45, 2) + 320);
                            break L64;
                          }
                          var4_int = 0;
                          L69: while (true) {
                            if (var4_int >= 5) {
                              break L54;
                            } else {
                              var5 = (fj) (Object) new bf(var3, 64 * -var4_int - 64, var3, 17);
                              ((bf) (Object) var5).field_o = sh.b(-127, 32);
                              kh.field_y.b(121, (rf) (Object) var5);
                              var4_int++;
                              if (var8 != 0) {
                                break L53;
                              } else {
                                if (var8 == 0) {
                                  continue L69;
                                } else {
                                  break L54;
                                }
                              }
                            }
                          }
                        }
                        if (2 != rj.field_h) {
                          break L53;
                        } else {
                          L70: {
                            L71: {
                              L72: {
                                if (-6 == (ua.field_c ^ -1)) {
                                  break L72;
                                } else {
                                  if (10 == ua.field_c) {
                                    break L72;
                                  } else {
                                    if (ua.field_c == 15) {
                                      break L72;
                                    } else {
                                      break L71;
                                    }
                                  }
                                }
                              }
                              nf.field_e = -150;
                              var3 = 0;
                              L73: while (true) {
                                if (25 <= var3) {
                                  break L71;
                                } else {
                                  kh.field_y.b(119, (rf) (Object) new bf(sh.b(76, 640), -128 + -var3 * 25, -64 + sh.b(-30, 128) + fi.field_e.field_f, 18));
                                  var3++;
                                  if (var8 != 0) {
                                    break L70;
                                  } else {
                                    if (var8 == 0) {
                                      continue L73;
                                    } else {
                                      break L71;
                                    }
                                  }
                                }
                              }
                            }
                            if (ua.field_c != 16) {
                              break L70;
                            } else {
                              var3 = 48;
                              L74: while (true) {
                                if (var3 >= 640) {
                                  break L70;
                                } else {
                                  var4_ref2 = new bf(var3, -64 - Math.abs(-320 + var3), var3, 21);
                                  var4_ref2.field_o = sh.b(-127, 32);
                                  kh.field_y.b(57, (rf) (Object) var4_ref2);
                                  var3 += 96;
                                  if (var8 != 0) {
                                    break L53;
                                  } else {
                                    if (var8 == 0) {
                                      continue L74;
                                    } else {
                                      break L70;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          if (ua.field_c < 4) {
                            break L53;
                          } else {
                            if (ua.field_c > 14) {
                              break L53;
                            } else {
                              if (0 == (ua.field_c & 1)) {
                                var3 = sh.b(-128, 2) * 900 + 20;
                                var4_int = 0;
                                L75: while (true) {
                                  if (var4_int >= 5) {
                                    break L53;
                                  } else {
                                    var5 = (fj) (Object) new bf(var3, -var4_int * 64 - 64, var3, 17);
                                    ((bf) (Object) var5).field_o = sh.b(-126, 32);
                                    kh.field_y.b(89, (rf) (Object) var5);
                                    var4_int++;
                                    if (var8 != 0) {
                                      break L52;
                                    } else {
                                      if (var8 == 0) {
                                        continue L75;
                                      } else {
                                        break L53;
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L53;
                              }
                            }
                          }
                        }
                      }
                      if (3 == rj.field_h) {
                        break L52;
                      } else {
                        break L51;
                      }
                    }
                    L76: {
                      if (ua.field_c == 5) {
                        break L76;
                      } else {
                        if (ua.field_c == 10) {
                          break L76;
                        } else {
                          break L51;
                        }
                      }
                    }
                    var3 = 0;
                    L77: while (true) {
                      if (-26 >= (var3 ^ -1)) {
                        break L51;
                      } else {
                        kh.field_y.b(115, (rf) (Object) new bf(sh.b(-126, 640), -128 + 25 * -var3, sh.b(8, 128) - (-fi.field_e.field_f + 64), 18));
                        var3++;
                        if (var8 != 0) {
                          break L48;
                        } else {
                          if (var8 == 0) {
                            continue L77;
                          } else {
                            break L51;
                          }
                        }
                      }
                    }
                  }
                  if ((ua.field_c ^ -1) != 1) {
                    break L49;
                  } else {
                    if (-1 > (rj.field_h ^ -1)) {
                      dg.field_l = 0;
                      mj.a(255, 12, 0, 43, 100);
                      break L49;
                    } else {
                      break L49;
                    }
                  }
                } else {
                  break L49;
                }
              }
              ed.field_n = sh.b(64, 640);
              break L48;
            }
            L78: {
              L79: {
                if (0 == rj.field_h) {
                  break L79;
                } else {
                  if (rj.field_h != 3) {
                    break L78;
                  } else {
                    break L79;
                  }
                }
              }
              L80: {
                if ((ua.field_c ^ -1) >= -1) {
                  L81: {
                    if (2 != ge.field_c[0]) {
                      break L81;
                    } else {
                      var3_ref_int__ = ge.field_c;
                      ge.field_c[1] = 1;
                      var3_ref_int__[0] = 1;
                      break L81;
                    }
                  }
                  L82: {
                    if (ge.field_c[0] != 7) {
                      break L82;
                    } else {
                      ge.field_c[1] = 6;
                      var3_ref_int__ = ge.field_c;
                      var3_ref_int__[0] = 6;
                      break L82;
                    }
                  }
                  if (12 == ge.field_c[0]) {
                    ge.field_c[1] = 11;
                    var3_ref_int__ = ge.field_c;
                    var3_ref_int__[0] = 11;
                    break L80;
                  } else {
                    break L80;
                  }
                } else {
                  break L80;
                }
              }
              L83: {
                if (0 > ua.field_c) {
                  break L83;
                } else {
                  if (-13 > (ua.field_c ^ -1)) {
                    break L83;
                  } else {
                    if (-1 == (1 & ua.field_c ^ -1)) {
                      gd.field_d = (ua.field_c >> -985950047) + 2;
                      boolean discarded$5 = v.a(new d(sh.b(-127, 640), -156, 0, 128 + sh.b(-127, 256), 16777215, 4), -4001);
                      break L83;
                    } else {
                      break L83;
                    }
                  }
                }
              }
              L84: {
                if (ua.field_c == 12) {
                  ge.field_c[1] = 3;
                  var3_ref_int__ = ge.field_c;
                  var3_ref_int__[0] = 3;
                  break L84;
                } else {
                  break L84;
                }
              }
              if (13 != ua.field_c) {
                break L78;
              } else {
                ge.field_c[1] = 1;
                var3_ref_int__ = ge.field_c;
                var3_ref_int__[0] = 1;
                break L78;
              }
            }
            L85: {
              if (-2 == (rj.field_h ^ -1)) {
                L86: {
                  if (-1 <= (ua.field_c ^ -1)) {
                    L87: {
                      if (ge.field_c[0] == 2) {
                        var3_ref_int__ = ge.field_c;
                        ge.field_c[1] = 1;
                        var3_ref_int__[0] = 1;
                        break L87;
                      } else {
                        break L87;
                      }
                    }
                    L88: {
                      if (-8 == (ge.field_c[0] ^ -1)) {
                        ge.field_c[1] = 6;
                        var3_ref_int__ = ge.field_c;
                        var3_ref_int__[0] = 6;
                        break L88;
                      } else {
                        break L88;
                      }
                    }
                    if (ge.field_c[0] == 12) {
                      var3_ref_int__ = ge.field_c;
                      ge.field_c[1] = 11;
                      var3_ref_int__[0] = 11;
                      break L86;
                    } else {
                      break L86;
                    }
                  } else {
                    break L86;
                  }
                }
                L89: {
                  if (1 != ua.field_c) {
                    break L89;
                  } else {
                    ge.field_c[0] = 4;
                    break L89;
                  }
                }
                L90: {
                  if (3 == ua.field_c) {
                    var3_ref_int__ = ge.field_c;
                    ge.field_c[1] = 3;
                    var3_ref_int__[0] = 3;
                    break L90;
                  } else {
                    break L90;
                  }
                }
                L91: {
                  if (-7 != (ua.field_c ^ -1)) {
                    break L91;
                  } else {
                    ge.field_c[1] = 1;
                    var3_ref_int__ = ge.field_c;
                    var3_ref_int__[0] = 1;
                    break L91;
                  }
                }
                L92: {
                  if (ua.field_c == 8) {
                    ge.field_c[1] = 5;
                    break L92;
                  } else {
                    break L92;
                  }
                }
                L93: {
                  if (9 != ua.field_c) {
                    break L93;
                  } else {
                    var3_ref_int__ = ge.field_c;
                    ge.field_c[1] = 13;
                    var3_ref_int__[0] = 13;
                    break L93;
                  }
                }
                L94: {
                  if ((ua.field_c ^ -1) == -13) {
                    ge.field_c[1] = 11;
                    var3_ref_int__ = ge.field_c;
                    var3_ref_int__[0] = 11;
                    break L94;
                  } else {
                    break L94;
                  }
                }
                L95: {
                  if (ua.field_c == 14) {
                    ge.field_c[1] = 9;
                    break L95;
                  } else {
                    break L95;
                  }
                }
                L96: {
                  if (ua.field_c == 15) {
                    ge.field_c[1] = 8;
                    var3_ref_int__ = ge.field_c;
                    var3_ref_int__[0] = 8;
                    break L96;
                  } else {
                    break L96;
                  }
                }
                L97: {
                  if (-19 == (ua.field_c ^ -1)) {
                    ge.field_c[1] = 6;
                    var3_ref_int__ = ge.field_c;
                    var3_ref_int__[0] = 6;
                    break L97;
                  } else {
                    break L97;
                  }
                }
                if ((ua.field_c ^ -1) != -21) {
                  break L85;
                } else {
                  ge.field_c[0] = 10;
                  break L85;
                }
              } else {
                break L85;
              }
            }
            if ((rj.field_h ^ -1) != -3) {
              break L47;
            } else {
              L98: {
                if (0 >= ua.field_c) {
                  L99: {
                    if (2 != ge.field_c[0]) {
                      break L99;
                    } else {
                      ge.field_c[1] = 1;
                      var3_ref_int__ = ge.field_c;
                      var3_ref_int__[0] = 1;
                      break L99;
                    }
                  }
                  L100: {
                    if (7 == ge.field_c[0]) {
                      var3_ref_int__ = ge.field_c;
                      ge.field_c[1] = 6;
                      var3_ref_int__[0] = 6;
                      break L100;
                    } else {
                      break L100;
                    }
                  }
                  if (ge.field_c[0] != 12) {
                    break L98;
                  } else {
                    ge.field_c[1] = 11;
                    var3_ref_int__ = ge.field_c;
                    var3_ref_int__[0] = 11;
                    break L98;
                  }
                } else {
                  break L98;
                }
              }
              L101: {
                if (4 == ua.field_c) {
                  gd.field_d = 9;
                  boolean discarded$6 = v.a(new d(sh.b(-128, 640), -156, 0, sh.b(107, 256) - -128, 16777215, 4), -4001);
                  break L101;
                } else {
                  break L101;
                }
              }
              L102: {
                if ((ua.field_c ^ -1) != -6) {
                  break L102;
                } else {
                  ge.field_c[1] = 8;
                  var3_ref_int__ = ge.field_c;
                  var3_ref_int__[0] = 8;
                  break L102;
                }
              }
              L103: {
                if (ua.field_c != 9) {
                  break L103;
                } else {
                  var3_ref_int__ = ge.field_c;
                  ge.field_c[1] = 6;
                  var3_ref_int__[0] = 6;
                  break L103;
                }
              }
              L104: {
                if (-11 == (ua.field_c ^ -1)) {
                  gd.field_d = 10;
                  boolean discarded$7 = v.a(new d(sh.b(8, 640), -156, 0, sh.b(-128, 256) - -128, 16777215, 4), -4001);
                  break L104;
                } else {
                  break L104;
                }
              }
              L105: {
                if (ua.field_c != 11) {
                  break L105;
                } else {
                  var3_ref_int__ = ge.field_c;
                  ge.field_c[1] = 13;
                  var3_ref_int__[0] = 13;
                  break L105;
                }
              }
              L106: {
                if (-16 != (ua.field_c ^ -1)) {
                  break L106;
                } else {
                  var3_ref_int__ = ge.field_c;
                  ge.field_c[1] = 11;
                  var3_ref_int__[0] = 11;
                  break L106;
                }
              }
              L107: {
                if (ua.field_c != 16) {
                  break L107;
                } else {
                  gd.field_d = 11;
                  boolean discarded$8 = v.a(new d(sh.b(-8, 640), -156, 0, sh.b(118, 256) + 128, 16777215, 4), -4001);
                  break L107;
                }
              }
              if (19 == ua.field_c) {
                gd.field_d = 12;
                boolean discarded$9 = v.a(new d(sh.b(-128, 640), -156, 0, 128 + sh.b(2, 256), 16777215, 4), -4001);
                break L47;
              } else {
                break L47;
              }
            }
          }
        }
        L108: {
          if ((gf.field_b ^ -1) >= -1) {
            break L108;
          } else {
            if ((rj.field_h ^ -1) > -4) {
              kk.field_d = kk.field_d - 1;
              if (kk.field_d > 0) {
                break L108;
              } else {
                L109: {
                  kk.field_d = 50;
                  gf.field_b = gf.field_b - 1;
                  var3_ref = new bf(fi.field_e.field_f, -32, fi.field_e.field_f, 10);
                  if (-1 == (gf.field_b ^ -1)) {
                    var3_ref.field_l = 4;
                    break L109;
                  } else {
                    break L109;
                  }
                }
                L110: {
                  if (-2 != (gf.field_b ^ -1)) {
                    break L110;
                  } else {
                    var3_ref.field_l = 0;
                    break L110;
                  }
                }
                kh.field_y.b(69, (rf) (Object) var3_ref);
                break L108;
              }
            } else {
              break L108;
            }
          }
        }
        L111: {
          if (ia.field_k >= tg.field_y) {
            L112: {
              L113: {
                if (tg.field_y < 1000) {
                  break L113;
                } else {
                  var3 = 500 + tg.field_y;
                  if (var8 == 0) {
                    break L112;
                  } else {
                    break L113;
                  }
                }
              }
              L114: {
                if (-1 <= (tg.field_y ^ -1)) {
                  break L114;
                } else {
                  var3 = tg.field_y + (tg.field_y << 373460929) / 3;
                  if (var8 == 0) {
                    break L112;
                  } else {
                    break L114;
                  }
                }
              }
              var3 = tg.field_y - -10;
              break L112;
            }
            var4_int = sh.b(-128, 640);
            tg.field_y = var3;
            kh.field_y.b(60, (rf) (Object) new bf(var4_int, -32, var4_int, 10));
            break L111;
          } else {
            break L111;
          }
        }
        L115: {
          L116: {
            if (-3 == (rj.field_h ^ -1)) {
              break L116;
            } else {
              if ((rj.field_h ^ -1) != -4) {
                break L115;
              } else {
                break L116;
              }
            }
          }
          if (0 >= u.field_d) {
            il.field_i = il.field_i + (rj.field_h - 4);
            rj.field_h = 4;
            break L115;
          } else {
            break L115;
          }
        }
        L117: {
          if (-4 != (rj.field_h ^ -1)) {
            break L117;
          } else {
            if ((nf.field_l ^ -1) > -3) {
              il.field_i = il.field_i + (-4 + rj.field_h);
              rj.field_h = 4;
              break L117;
            } else {
              break L117;
            }
          }
        }
        L118: {
          if ((ua.field_c ^ -1) < (ue.field_c[rj.field_h] ^ -1)) {
            break L118;
          } else {
            if (fi.field_e.field_k <= 0) {
              break L118;
            } else {
              nf.field_e = nf.field_e + 2;
              break L118;
            }
          }
        }
        L119: {
          if (nf.field_e > 200) {
            L120: {
              if (rj.field_h != 0) {
                break L120;
              } else {
                this.o(0);
                break L120;
              }
            }
            L121: {
              if (rj.field_h != 1) {
                break L121;
              } else {
                this.l((byte) 91);
                break L121;
              }
            }
            L122: {
              if (2 != rj.field_h) {
                break L122;
              } else {
                this.k((byte) 104);
                break L122;
              }
            }
            if (-4 != (rj.field_h ^ -1)) {
              break L119;
            } else {
              this.p(-256);
              break L119;
            }
          } else {
            break L119;
          }
        }
        L123: {
          if ((dg.field_l ^ -1) <= -97) {
            break L123;
          } else {
            dg.field_l = dg.field_l + 1;
            break L123;
          }
        }
        dl.field_a = 0;
        var3 = -64 / ((38 - param0) / 48);
        var4_ref = (bf) (Object) kh.field_y.c(-3905);
        L124: while (true) {
          L125: {
            L126: {
              if (var4_ref == null) {
                break L126;
              } else {
                stackOut_407_0 = var4_ref.a(qc.field_c, (StarCannon) this, 114);
                stackIn_414_0 = stackOut_407_0 ? 1 : 0;
                stackIn_408_0 = stackOut_407_0;
                if (var8 != 0) {
                  break L125;
                } else {
                  L127: {
                    if (!stackIn_408_0) {
                      var4_ref.b(4);
                      break L127;
                    } else {
                      break L127;
                    }
                  }
                  var4_ref = (bf) (Object) kh.field_y.a(-16913);
                  if (var8 == 0) {
                    continue L124;
                  } else {
                    break L126;
                  }
                }
              }
            }
            stackOut_413_0 = -1;
            stackIn_414_0 = stackOut_413_0;
            break L125;
          }
          L128: {
            if (stackIn_414_0 > (tj.field_G ^ -1)) {
              fi.field_e.field_k = 1;
              break L128;
            } else {
              break L128;
            }
          }
          var3 = 0;
          L129: while (true) {
            L130: {
              L131: {
                if (4000 <= var3) {
                  break L131;
                } else {
                  if (var8 != 0) {
                    break L130;
                  } else {
                    L132: {
                      if (null == qc.field_c[var3]) {
                        break L132;
                      } else {
                        if (null == qc.field_c[var3].a((byte) 108)) {
                          qc.field_c[var3] = null;
                          if ((var3 ^ -1) > (fi.field_d ^ -1)) {
                            fi.field_d = var3;
                            break L132;
                          } else {
                            break L132;
                          }
                        } else {
                          break L132;
                        }
                      }
                    }
                    var3++;
                    if (var8 == 0) {
                      continue L129;
                    } else {
                      break L131;
                    }
                  }
                }
              }
              if (-1 <= (vb.field_m ^ -1)) {
                break L130;
              } else {
                L133: {
                  var2 = fi.field_e;
                  if ((rj.field_h ^ -1) > -5) {
                    break L133;
                  } else {
                    L134: {
                      var2.field_z = var2.field_z - (jl.field_j - -3);
                      if (249 >= (var2.field_z ^ -1)) {
                        break L134;
                      } else {
                        var2.field_z = -250;
                        break L134;
                      }
                    }
                    L135: {
                      var2.field_f = (9 * var2.field_f - -320) / 10;
                      if (-1 <= (var2.field_z ^ -1)) {
                        break L135;
                      } else {
                        var2.field_z = -(95 * var2.field_z) / 100;
                        break L135;
                      }
                    }
                    L136: {
                      if (((StarCannon) this).field_D >= 250) {
                        break L136;
                      } else {
                        ((StarCannon) this).field_D = ((StarCannon) this).field_D + 1;
                        var2.field_u = (320 + var2.field_u * 9) / 10;
                        var2.field_z = 0;
                        break L136;
                      }
                    }
                    if (((StarCannon) this).field_D < 250) {
                      break L130;
                    } else {
                      if (64 <= var2.field_u) {
                        break L130;
                      } else {
                        tj.field_G = 0;
                        gj.field_c = -1;
                        il.field_i = il.field_i + rj.field_h;
                        var2.field_k = -1;
                        ((StarCannon) this).field_D = 0;
                        rj.field_h = 0;
                        if ((field_z ^ -1) != 0) {
                          break L130;
                        } else {
                          var3 = 0;
                          L137: while (true) {
                            L138: {
                              L139: {
                                if (var3 >= 4000) {
                                  break L139;
                                } else {
                                  qc.field_c[var3] = null;
                                  var3++;
                                  if (var8 != 0) {
                                    break L138;
                                  } else {
                                    if (var8 == 0) {
                                      continue L137;
                                    } else {
                                      break L139;
                                    }
                                  }
                                }
                              }
                              var3_ref_bf = (bf) (Object) kh.field_y.c(-3905);
                              L140: while (true) {
                                L141: {
                                  L142: {
                                    if (var3_ref_bf == null) {
                                      break L142;
                                    } else {
                                      if (var8 != 0) {
                                        break L141;
                                      } else {
                                        L143: {
                                          if (fi.field_e != var3_ref_bf) {
                                            var3_ref_bf.b(4);
                                            break L143;
                                          } else {
                                            break L143;
                                          }
                                        }
                                        var3_ref_bf = (bf) (Object) kh.field_y.a(-16913);
                                        if (var8 == 0) {
                                          continue L140;
                                        } else {
                                          break L142;
                                        }
                                      }
                                    }
                                  }
                                  L144: {
                                    if ((kd.field_C ^ -1) != -1) {
                                      break L144;
                                    } else {
                                      if (-1 == (jg.field_H ^ -1)) {
                                        break L144;
                                      } else {
                                        break L144;
                                      }
                                    }
                                  }
                                  hh.field_c = 0;
                                  bf.field_w = 0;
                                  ha.field_c = 0;
                                  jl.field_j = 5;
                                  vb.field_m = 2;
                                  break L141;
                                }
                                var3 = 0;
                                break L138;
                              }
                            }
                            L145: {
                              L146: {
                                if (wk.a(108)) {
                                  break L146;
                                } else {
                                  L147: {
                                    pg.a(true, (byte) -121);
                                    sa.a(nf.field_l + na.field_a * 3, 23820);
                                    fc.field_e = fc.field_e - (ia.field_k << 751856385);
                                    ia.field_k = 0;
                                    if (-1 <= (jg.field_H ^ -1)) {
                                      break L147;
                                    } else {
                                      var3 = 5;
                                      if (var8 == 0) {
                                        break L145;
                                      } else {
                                        break L147;
                                      }
                                    }
                                  }
                                  if (kd.field_C <= 0) {
                                    break L145;
                                  } else {
                                    var3 = 2;
                                    if (var8 == 0) {
                                      break L145;
                                    } else {
                                      break L146;
                                    }
                                  }
                                }
                              }
                              L148: {
                                if (kd.field_C > 0) {
                                  break L148;
                                } else {
                                  if (0 >= jg.field_H) {
                                    break L145;
                                  } else {
                                    break L148;
                                  }
                                }
                              }
                              var3 = 6;
                              break L145;
                            }
                            od.a(-106, var3, false);
                            if (var8 == 0) {
                              break L130;
                            } else {
                              break L133;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                if (-1 > (fi.field_e.field_k ^ -1)) {
                  L149: {
                    if (!wc.field_c[96]) {
                      break L149;
                    } else {
                      L150: {
                        var2.field_n = var2.field_n - (jl.field_j - -3);
                        if (249 >= (var2.field_n ^ -1)) {
                          break L150;
                        } else {
                          var2.field_n = -250;
                          break L150;
                        }
                      }
                      if (var2.field_n > 0) {
                        var2.field_n = var2.field_n * 95 / 100;
                        break L149;
                      } else {
                        break L149;
                      }
                    }
                  }
                  L151: {
                    if (wc.field_c[98]) {
                      L152: {
                        var2.field_z = var2.field_z - (jl.field_j - -3);
                        if (var2.field_z < -250) {
                          var2.field_z = -250;
                          break L152;
                        } else {
                          break L152;
                        }
                      }
                      if (0 >= var2.field_z) {
                        break L151;
                      } else {
                        var2.field_z = -(var2.field_z * 95) / 100;
                        break L151;
                      }
                    } else {
                      break L151;
                    }
                  }
                  L153: {
                    if (wc.field_c[97]) {
                      L154: {
                        var2.field_n = var2.field_n + (3 + jl.field_j);
                        if (-251 <= (var2.field_n ^ -1)) {
                          break L154;
                        } else {
                          var2.field_n = 250;
                          break L154;
                        }
                      }
                      if ((var2.field_n ^ -1) <= -1) {
                        break L153;
                      } else {
                        var2.field_n = 95 * var2.field_n / 100;
                        break L153;
                      }
                    } else {
                      break L153;
                    }
                  }
                  L155: {
                    if (wc.field_c[96]) {
                      break L155;
                    } else {
                      if (!wc.field_c[97]) {
                        var2.field_n = 90 * var2.field_n / 100;
                        break L155;
                      } else {
                        break L155;
                      }
                    }
                  }
                  L156: {
                    if (!wc.field_c[99]) {
                      break L156;
                    } else {
                      L157: {
                        var2.field_z = var2.field_z + (3 + jl.field_j);
                        if (var2.field_z <= 120) {
                          break L157;
                        } else {
                          var2.field_z = 120;
                          break L157;
                        }
                      }
                      if (0 <= var2.field_z) {
                        break L156;
                      } else {
                        var2.field_z = 95 * var2.field_z / 100;
                        break L156;
                      }
                    }
                  }
                  L158: {
                    L159: {
                      if (wc.field_c[82]) {
                        break L159;
                      } else {
                        if (!wc.field_c[83]) {
                          break L158;
                        } else {
                          break L159;
                        }
                      }
                    }
                    if (var2.field_j == 0) {
                      gi.field_g = false;
                      u.field_b = u.field_b - 2;
                      var2.field_j = 1;
                      break L158;
                    } else {
                      break L158;
                    }
                  }
                  if (wc.field_c[98]) {
                    break L130;
                  } else {
                    if (!wc.field_c[99]) {
                      var2.field_z = var2.field_z * 90 / 100;
                      break L130;
                    } else {
                      break L130;
                    }
                  }
                } else {
                  break L130;
                }
              }
            }
            L160: {
              L161: {
                L162: {
                  if (tj.field_G <= 1000) {
                    break L162;
                  } else {
                    if (se.field_m > 2) {
                      break L161;
                    } else {
                      break L162;
                    }
                  }
                }
                if (2 != se.field_m) {
                  break L160;
                } else {
                  if (-21 == (ua.field_c ^ -1)) {
                    break L161;
                  } else {
                    break L160;
                  }
                }
              }
              tj.field_G = 0;
              hc.field_e = "hahahah";
              break L160;
            }
            L163: while (true) {
              L164: {
                L165: {
                  if (!ad.e((byte) 103)) {
                    break L165;
                  } else {
                    stackOut_530_0 = field_E ^ -1;
                    stackOut_530_1 = -1;
                    stackIn_603_0 = stackOut_530_0;
                    stackIn_603_1 = stackOut_530_1;
                    stackIn_531_0 = stackOut_530_0;
                    stackIn_531_1 = stackOut_530_1;
                    if (var8 != 0) {
                      break L164;
                    } else {
                      L166: {
                        if (stackIn_531_0 >= stackIn_531_1) {
                          break L166;
                        } else {
                          L167: {
                            hc.field_e = hc.field_e.substring(1) + field_E;
                            if ((se.field_m ^ -1) > -3) {
                              break L167;
                            } else {
                              if ((ua.field_c ^ -1) <= -21) {
                                break L166;
                              } else {
                                if (2 == se.field_m) {
                                  break L167;
                                } else {
                                  break L166;
                                }
                              }
                            }
                          }
                          if (2 <= ad.field_y) {
                            L168: {
                              var3 = a.field_a ? 1 : 0;
                              if (!hc.field_e.equalsIgnoreCase("thunder")) {
                                break L168;
                              } else {
                                cg.field_e = 7;
                                a.field_a = true;
                                break L168;
                              }
                            }
                            L169: {
                              if (!hc.field_e.equalsIgnoreCase("beeswax")) {
                                break L169;
                              } else {
                                tj.field_G = 10000;
                                a.field_a = true;
                                break L169;
                              }
                            }
                            L170: {
                              if (hc.field_e.equalsIgnoreCase("diewell")) {
                                ua.field_c = -1 + ue.field_c[rj.field_h];
                                a.field_a = true;
                                hc.field_e = "hahahah";
                                break L170;
                              } else {
                                break L170;
                              }
                            }
                            L171: {
                              if (hc.field_e.equalsIgnoreCase("donefor")) {
                                pf.field_d = 1000;
                                a.field_a = true;
                                jk.field_j = 0;
                                break L171;
                              } else {
                                break L171;
                              }
                            }
                            L172: {
                              if (!hc.field_e.equalsIgnoreCase("xebeams")) {
                                break L172;
                              } else {
                                hh.field_c = 1;
                                kh.field_y.b(70, (rf) (Object) new bf(0, -128, 0, 13));
                                a.field_a = true;
                                break L172;
                              }
                            }
                            L173: {
                              if (!hc.field_e.equalsIgnoreCase("levskip")) {
                                break L173;
                              } else {
                                il.field_i = il.field_i + (rj.field_h - 2);
                                u.field_d = 1;
                                rj.field_h = 2;
                                a.field_a = true;
                                hc.field_e = "hahahah";
                                break L173;
                              }
                            }
                            if (!a.field_a) {
                              break L166;
                            } else {
                              if (var3 != 0) {
                                break L166;
                              } else {
                                fc.field_e = fc.field_e + 1;
                                il.field_i = il.field_i + 1;
                                break L166;
                              }
                            }
                          } else {
                            break L166;
                          }
                        }
                      }
                      L174: {
                        if (13 != lb.field_B) {
                          break L174;
                        } else {
                          L175: {
                            if (rj.field_h != 4) {
                              break L175;
                            } else {
                              fi.field_e.field_u = 32;
                              if (var8 == 0) {
                                break L174;
                              } else {
                                break L175;
                              }
                            }
                          }
                          L176: {
                            L177: {
                              if (fi.field_e.field_k != 0) {
                                break L177;
                              } else {
                                if (gj.field_c != 0) {
                                  break L177;
                                } else {
                                  L178: {
                                    if (25 <= fi.field_e.field_r) {
                                      break L178;
                                    } else {
                                      fi.field_e.field_r = -fi.field_e.field_r + 192;
                                      if (var8 == 0) {
                                        break L176;
                                      } else {
                                        break L178;
                                      }
                                    }
                                  }
                                  if ((fi.field_e.field_r ^ -1) > -168) {
                                    fi.field_e.field_r = 167;
                                    if (var8 == 0) {
                                      break L176;
                                    } else {
                                      break L177;
                                    }
                                  } else {
                                    break L176;
                                  }
                                }
                              }
                            }
                            od.a(-99, 1, false);
                            break L176;
                          }
                          pg.a(true, (byte) -87);
                          return;
                        }
                      }
                      L179: {
                        if (-3 < (ad.field_y ^ -1)) {
                          break L179;
                        } else {
                          L180: {
                            if (lb.field_B == 32) {
                              L181: {
                                if ((qb.field_e ^ -1) != -1) {
                                  break L181;
                                } else {
                                  sd.field_c = sd.field_c + 1;
                                  if (var8 == 0) {
                                    break L180;
                                  } else {
                                    break L181;
                                  }
                                }
                              }
                              sd.field_c = 0;
                              qb.field_e = 0;
                              break L180;
                            } else {
                              break L180;
                            }
                          }
                          L182: {
                            if ((lb.field_B ^ -1) != -34) {
                              break L182;
                            } else {
                              L183: {
                                if ((qb.field_e ^ -1) != -2) {
                                  break L183;
                                } else {
                                  sd.field_c = sd.field_c + 1;
                                  if (var8 == 0) {
                                    break L182;
                                  } else {
                                    break L183;
                                  }
                                }
                              }
                              sd.field_c = 0;
                              qb.field_e = 1;
                              break L182;
                            }
                          }
                          if ((lb.field_B ^ -1) == -35) {
                            L184: {
                              if (2 == qb.field_e) {
                                break L184;
                              } else {
                                sd.field_c = 0;
                                qb.field_e = 2;
                                if (var8 == 0) {
                                  break L179;
                                } else {
                                  break L184;
                                }
                              }
                            }
                            sd.field_c = sd.field_c + 1;
                            break L179;
                          } else {
                            break L179;
                          }
                        }
                      }
                      if ((gj.field_c ^ -1) == 0) {
                        hc.field_e = "hahahah";
                        cg.field_e = 0;
                        if (var8 == 0) {
                          continue L163;
                        } else {
                          break L165;
                        }
                      } else {
                        continue L163;
                      }
                    }
                  }
                }
                hc.field_c = hc.field_c + 1;
                vd.field_j = vd.field_j + 3;
                stackOut_602_0 = 2;
                stackOut_602_1 = ad.field_y;
                stackIn_603_0 = stackOut_602_0;
                stackIn_603_1 = stackOut_602_1;
                break L164;
              }
              L185: {
                if (stackIn_603_0 > stackIn_603_1) {
                  break L185;
                } else {
                  if (-8 != (cg.field_e ^ -1)) {
                    break L185;
                  } else {
                    jl.field_j = 20;
                    il.field_i = il.field_i + 1;
                    fc.field_e = fc.field_e + 1;
                    vb.field_m = 20;
                    a.field_a = true;
                    break L185;
                  }
                }
              }
              L186: {
                L187: {
                  if ((hc.field_c ^ -1) < -241) {
                    qd.field_E[2] = qd.field_E[1];
                    hc.field_c = hc.field_c - 240;
                    qd.field_E[1] = qd.field_E[0];
                    qd.field_E[0] = ge.field_c[0];
                    qd.field_E[5] = qd.field_E[4];
                    qd.field_E[4] = qd.field_E[3];
                    qd.field_E[3] = ge.field_c[1];
                    var3 = 0;
                    L188: while (true) {
                      if (var3 >= 2) {
                        break L187;
                      } else {
                        stackOut_611_0 = ge.field_c[var3];
                        stackOut_611_1 = 1;
                        stackIn_641_0 = stackOut_611_0;
                        stackIn_641_1 = stackOut_611_1;
                        stackIn_612_0 = stackOut_611_0;
                        stackIn_612_1 = stackOut_611_1;
                        if (var8 != 0) {
                          break L186;
                        } else {
                          L189: {
                            if (stackIn_612_0 == stackIn_612_1) {
                              ge.field_c[var3] = 0;
                              break L189;
                            } else {
                              break L189;
                            }
                          }
                          L190: {
                            if (ge.field_c[var3] != 3) {
                              break L190;
                            } else {
                              ge.field_c[var3] = 2;
                              break L190;
                            }
                          }
                          L191: {
                            if (-5 == (ge.field_c[var3] ^ -1)) {
                              ge.field_c[var3] = 0;
                              break L191;
                            } else {
                              break L191;
                            }
                          }
                          L192: {
                            if (-6 == (ge.field_c[var3] ^ -1)) {
                              ge.field_c[var3] = 0;
                              break L192;
                            } else {
                              break L192;
                            }
                          }
                          L193: {
                            if (-7 == (ge.field_c[var3] ^ -1)) {
                              ge.field_c[var3] = 0;
                              break L193;
                            } else {
                              break L193;
                            }
                          }
                          L194: {
                            if (8 != ge.field_c[var3]) {
                              break L194;
                            } else {
                              ge.field_c[var3] = 7;
                              break L194;
                            }
                          }
                          L195: {
                            if (-10 == (ge.field_c[var3] ^ -1)) {
                              ge.field_c[var3] = 0;
                              break L195;
                            } else {
                              break L195;
                            }
                          }
                          L196: {
                            if (10 != ge.field_c[var3]) {
                              break L196;
                            } else {
                              ge.field_c[var3] = 0;
                              break L196;
                            }
                          }
                          L197: {
                            if (-12 == (ge.field_c[var3] ^ -1)) {
                              ge.field_c[var3] = 0;
                              break L197;
                            } else {
                              break L197;
                            }
                          }
                          L198: {
                            if (-14 != (ge.field_c[var3] ^ -1)) {
                              break L198;
                            } else {
                              ge.field_c[var3] = 12;
                              break L198;
                            }
                          }
                          var3++;
                          if (var8 == 0) {
                            continue L188;
                          } else {
                            break L187;
                          }
                        }
                      }
                    }
                  } else {
                    break L187;
                  }
                }
                stackOut_640_0 = vd.field_j;
                stackOut_640_1 = 480;
                stackIn_641_0 = stackOut_640_0;
                stackIn_641_1 = stackOut_640_1;
                break L186;
              }
              L199: {
                if (stackIn_641_0 <= stackIn_641_1) {
                  break L199;
                } else {
                  vd.field_j = vd.field_j - 480;
                  break L199;
                }
              }
              L200: {
                if (0 > gj.field_c) {
                  if (!bi.field_b) {
                    lc.field_gb = lc.field_gb + 1;
                    if (1280 >= lc.field_gb) {
                      break L200;
                    } else {
                      lc.field_gb = -640;
                      break L200;
                    }
                  } else {
                    break L200;
                  }
                } else {
                  break L200;
                }
              }
              pg.a(true, (byte) -104);
              return;
            }
          }
        }
    }

    final void s(int param0) {
        jl.field_j = jl.field_j + 5;
        dg.field_l = 0;
        mj.a(96, 12, 0, 28, 100);
        if (param0 != -9) {
            return;
        }
        try {
            mj.a(255, 12, 1200, 37, 100);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "StarCannon.N(" + param0 + 41);
        }
    }

    final void u(int param0) {
        try {
            vb.field_m = vb.field_m + 1;
            dg.field_l = 0;
            mj.a(96, param0 + -88, 0, 30, 100);
            mj.a(255, param0 ^ 104, 1200, 35, param0);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "StarCannon.W(" + param0 + 41);
        }
    }

    private final void l(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        bf var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        bf var9 = null;
        int var10 = 0;
        bf var10_ref = null;
        int var11_int = 0;
        bf var11 = null;
        int var12 = 0;
        int stackIn_105_0 = 0;
        int stackIn_117_0 = 0;
        int stackIn_118_0 = 0;
        int stackIn_121_0 = 0;
        bf stackIn_127_0 = null;
        bf stackIn_129_0 = null;
        bf stackIn_130_0 = null;
        int stackIn_130_1 = 0;
        int stackIn_141_0 = 0;
        int stackIn_142_0 = 0;
        int stackIn_142_1 = 0;
        int stackIn_143_0 = 0;
        int stackIn_143_1 = 0;
        int stackIn_145_0 = 0;
        int stackIn_146_0 = 0;
        int stackIn_146_1 = 0;
        int stackIn_147_0 = 0;
        int stackIn_147_1 = 0;
        bf stackIn_151_0 = null;
        bf stackIn_153_0 = null;
        bf stackIn_155_0 = null;
        bf stackIn_156_0 = null;
        int stackIn_156_1 = 0;
        int stackIn_179_0 = 0;
        int stackIn_180_0 = 0;
        int stackIn_180_1 = 0;
        int stackIn_181_0 = 0;
        int stackIn_181_1 = 0;
        int stackIn_183_0 = 0;
        int stackIn_184_0 = 0;
        int stackIn_184_1 = 0;
        int stackOut_102_0 = 0;
        int stackOut_104_0 = 0;
        int stackOut_116_0 = 0;
        int stackOut_117_0 = 0;
        int stackOut_118_0 = 0;
        int stackOut_120_0 = 0;
        bf stackOut_126_0 = null;
        bf stackOut_127_0 = null;
        int stackOut_127_1 = 0;
        bf stackOut_129_0 = null;
        int stackOut_129_1 = 0;
        int stackOut_140_0 = 0;
        int stackOut_141_0 = 0;
        int stackOut_141_1 = 0;
        int stackOut_142_0 = 0;
        int stackOut_142_1 = 0;
        int stackOut_143_0 = 0;
        int stackOut_143_1 = 0;
        int stackOut_145_0 = 0;
        int stackOut_145_1 = 0;
        int stackOut_146_0 = 0;
        int stackOut_146_1 = 0;
        bf stackOut_150_0 = null;
        bf stackOut_151_0 = null;
        bf stackOut_153_0 = null;
        int stackOut_153_1 = 0;
        bf stackOut_155_0 = null;
        int stackOut_155_1 = 0;
        int stackOut_178_0 = 0;
        int stackOut_179_0 = 0;
        int stackOut_179_1 = 0;
        int stackOut_180_0 = 0;
        int stackOut_180_1 = 0;
        int stackOut_181_0 = 0;
        int stackOut_181_1 = 0;
        int stackOut_183_0 = 0;
        int stackOut_183_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = field_A;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = sh.b(param0 + -31, 3) - -ua.field_c;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((var2_int ^ -1) >= (ue.field_c[rj.field_h] ^ -1)) {
                            statePc = 7;
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
                        if ((ua.field_c ^ -1) < (ue.field_c[rj.field_h] ^ -1)) {
                            statePc = 7;
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
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var2_int = ue.field_c[rj.field_h];
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (param0 == 91) {
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
                        this.l((byte) 51);
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
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var3 = sh.b(35, 640);
                        var4 = -64 + fi.field_e.field_f + sh.b(param0 ^ -39, 128);
                        var5 = null;
                        var10 = var2_int;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if ((var10 ^ -1) != -1) {
                            statePc = 16;
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
                        if (var12 == 0) {
                            statePc = 99;
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
                        if (1 == var10) {
                            statePc = 99;
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
                        if (-5 != (var10 ^ -1)) {
                            statePc = 25;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var12 == 0) {
                            statePc = 99;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if ((var10 ^ -1) != -6) {
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
                        if (var12 == 0) {
                            statePc = 110;
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
                        if (2 == var10) {
                            statePc = 114;
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
                        if (var10 == 6) {
                            statePc = 114;
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
                        if (var10 == 11) {
                            statePc = 114;
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
                        if ((var10 ^ -1) != -14) {
                            statePc = 46;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (var12 == 0) {
                            statePc = 114;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (-4 == (var10 ^ -1)) {
                            statePc = 139;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if ((var10 ^ -1) == -17) {
                            statePc = 139;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (var10 == 8) {
                            statePc = 159;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if ((var10 ^ -1) == -19) {
                            statePc = 163;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (7 != var10) {
                            statePc = 64;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (var12 == 0) {
                            statePc = 170;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if ((var10 ^ -1) != -16) {
                            statePc = 70;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (var12 == 0) {
                            statePc = 170;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if ((var10 ^ -1) != -20) {
                            statePc = 76;
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
                        if (var12 == 0) {
                            statePc = 170;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if (-10 != (var10 ^ -1)) {
                            statePc = 82;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        if (var12 == 0) {
                            statePc = 173;
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
                case 81: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        if (-15 == (var10 ^ -1)) {
                            statePc = 173;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        if (10 == var10) {
                            statePc = 177;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        if (-13 == (var10 ^ -1)) {
                            statePc = 189;
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
                        if (var10 == 17) {
                            statePc = 192;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        if (20 == var10) {
                            statePc = 195;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        statePc = 198;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        if (ua.field_c >= 4) {
                            statePc = 106;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        var10_ref = new bf(var3, -64, var4, 22);
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        li.a(param0 + -207, var10_ref);
                        var10_ref.field_n = sh.b(-128, 16) + -8;
                        var10_ref.field_z = sh.b(-127, 64) + 32;
                        var10_ref.field_l = sh.b(param0 + -219, 36);
                        if ((sh.b(26, 2) ^ -1) != -1) {
                            statePc = 104;
                        } else {
                            statePc = 102;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        stackOut_102_0 = sh.b(param0 + -217, 128);
                        stackIn_105_0 = stackOut_102_0;
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        stackOut_104_0 = 640 - sh.b(-128, 128);
                        stackIn_105_0 = stackOut_104_0;
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        var11_int = stackIn_105_0;
                        var10_ref = new bf(var11_int, -128, var4, 22);
                        li.a(-120, var10_ref);
                        var10_ref.field_n = sh.b(51, 16) + -8;
                        var10_ref.field_z = sh.b(-126, 64) + 32;
                        var10_ref.field_l = sh.b(-126, 36);
                        nf.field_e = var2_int * 30 - (-25 - 50 * nf.field_l);
                        kh.field_y.b(param0 + 3, (rf) (Object) new bf(128 + sh.b(11, 384), -128, fi.field_e.field_f, 1));
                        statePc = 198;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        nf.field_e = 0;
                        var10 = -3;
                        statePc = 107;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        if (var10 >= 4) {
                            statePc = 109;
                        } else {
                            statePc = 108;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        kh.field_y.b(param0 ^ 5, (rf) (Object) new bf(24 * var10 + 320, -Math.abs(var10 * 64 + -64), var10 * 7680, 1));
                        var10++;
                        if (var12 == 0) {
                            statePc = 107;
                        } else {
                            statePc = 109;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        if (var12 == 0) {
                            statePc = 198;
                        } else {
                            statePc = 110;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        nf.field_e = 0;
                        var10 = 0;
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        if (-6 >= (var10 ^ -1)) {
                            statePc = 113;
                        } else {
                            statePc = 112;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        kh.field_y.b(108, (rf) (Object) new bf(var3, 64 * -var10 + -64, var4, 1));
                        var10++;
                        if (var12 == 0) {
                            statePc = 111;
                        } else {
                            statePc = 113;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        if (var12 == 0) {
                            statePc = 198;
                        } else {
                            statePc = 114;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        nf.field_e = 0;
                        var10 = 0;
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        if (2 == nf.field_l) {
                            statePc = 120;
                        } else {
                            statePc = 116;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        stackOut_116_0 = 5;
                        stackIn_117_0 = stackOut_116_0;
                        statePc = 117;
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        stackOut_117_0 = stackIn_117_0;
                        stackIn_121_0 = stackOut_117_0;
                        stackIn_118_0 = stackOut_117_0;
                        if (var12 != 0) {
                            statePc = 121;
                        } else {
                            statePc = 118;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        stackOut_118_0 = stackIn_118_0;
                        stackIn_121_0 = stackOut_118_0;
                        statePc = 121;
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        stackOut_120_0 = 10;
                        stackIn_121_0 = stackOut_120_0;
                        statePc = 121;
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        if (stackIn_121_0 <= var10) {
                            statePc = 138;
                        } else {
                            statePc = 122;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        var11 = new bf(var3, -64 + -var10 * 64, var4, 2);
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        if (2 == var2_int) {
                            statePc = 126;
                        } else {
                            statePc = 124;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        statePc = 131;
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        stackOut_126_0 = (bf) var11;
                        stackIn_129_0 = stackOut_126_0;
                        stackIn_127_0 = stackOut_126_0;
                        if ((nf.field_l ^ -1) == -3) {
                            statePc = 129;
                        } else {
                            statePc = 127;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        stackOut_127_0 = (bf) (Object) stackIn_127_0;
                        stackOut_127_1 = 1;
                        stackIn_130_0 = stackOut_127_0;
                        stackIn_130_1 = stackOut_127_1;
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        stackOut_129_0 = (bf) (Object) stackIn_129_0;
                        stackOut_129_1 = 0;
                        stackIn_130_0 = stackOut_129_0;
                        stackIn_130_1 = stackOut_129_1;
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        stackIn_130_0.field_p = stackIn_130_1 != 0;
                        statePc = 131;
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        var11.field_h = var5;
                        if ((var10 ^ -1) != -1) {
                            statePc = 133;
                        } else {
                            statePc = 132;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        var5 = var11;
                        statePc = 133;
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        if (!var11.field_p) {
                            statePc = 136;
                        } else {
                            statePc = 134;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        statePc = 137;
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        var11.field_i = -64 + (var3 - -sh.b(-127, 128));
                        statePc = 137;
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        kh.field_y.b(param0 ^ 22, (rf) (Object) var11);
                        var10++;
                        if (var12 == 0) {
                            statePc = 115;
                        } else {
                            statePc = 138;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        statePc = 198;
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        nf.field_e = 100;
                        var10 = 0;
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        stackOut_140_0 = var10 ^ -1;
                        stackIn_145_0 = stackOut_140_0;
                        stackIn_141_0 = stackOut_140_0;
                        if (2 == nf.field_l) {
                            statePc = 145;
                        } else {
                            statePc = 141;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        stackOut_141_0 = stackIn_141_0;
                        stackOut_141_1 = 1;
                        stackIn_142_0 = stackOut_141_0;
                        stackIn_142_1 = stackOut_141_1;
                        statePc = 142;
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        stackOut_142_0 = stackIn_142_0;
                        stackOut_142_1 = stackIn_142_1;
                        stackIn_147_0 = stackOut_142_0;
                        stackIn_147_1 = stackOut_142_1;
                        stackIn_143_0 = stackOut_142_0;
                        stackIn_143_1 = stackOut_142_1;
                        if (var12 != 0) {
                            statePc = 147;
                        } else {
                            statePc = 143;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 144;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        stackOut_143_0 = stackIn_143_0;
                        stackOut_143_1 = stackIn_143_1;
                        stackIn_146_0 = stackOut_143_0;
                        stackIn_146_1 = stackOut_143_1;
                        statePc = 146;
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 144;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        stackOut_145_0 = stackIn_145_0;
                        stackOut_145_1 = 2;
                        stackIn_146_0 = stackOut_145_0;
                        stackIn_146_1 = stackOut_145_1;
                        statePc = 146;
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        stackOut_146_0 = stackIn_146_0;
                        stackOut_146_1 = stackIn_146_1 ^ -1;
                        stackIn_147_0 = stackOut_146_0;
                        stackIn_147_1 = stackOut_146_1;
                        statePc = 147;
                        continue stateLoop;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        if (stackIn_147_0 <= stackIn_147_1) {
                            statePc = 158;
                        } else {
                            statePc = 148;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        var11 = new bf(var3, -64 + -var10 * 64, sh.b(77, 128) - 64, 5);
                        statePc = 149;
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        var11.field_h = var5;
                        if (3 != var2_int) {
                            statePc = 157;
                        } else {
                            statePc = 150;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 152;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        stackOut_150_0 = (bf) var11;
                        stackIn_155_0 = stackOut_150_0;
                        stackIn_151_0 = stackOut_150_0;
                        if (nf.field_l == 2) {
                            statePc = 155;
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
                        stackOut_151_0 = (bf) (Object) stackIn_151_0;
                        stackIn_153_0 = stackOut_151_0;
                        statePc = 153;
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        stackOut_153_0 = (bf) (Object) stackIn_153_0;
                        stackOut_153_1 = 1;
                        stackIn_156_0 = stackOut_153_0;
                        stackIn_156_1 = stackOut_153_1;
                        statePc = 156;
                        continue stateLoop;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        stackOut_155_0 = (bf) (Object) stackIn_155_0;
                        stackOut_155_1 = 0;
                        stackIn_156_0 = stackOut_155_0;
                        stackIn_156_1 = stackOut_155_1;
                        statePc = 156;
                        continue stateLoop;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        stackIn_156_0.field_p = stackIn_156_1 != 0;
                        statePc = 157;
                        continue stateLoop;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        var5 = var11;
                        kh.field_y.b(59, (rf) (Object) var11);
                        var10++;
                        if (var12 == 0) {
                            statePc = 140;
                        } else {
                            statePc = 158;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 158: {
                    try {
                        statePc = 198;
                        continue stateLoop;
                    } catch (Throwable stateCaught_158) {
                        caughtException = stateCaught_158;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 159: {
                    try {
                        nf.field_e = 0;
                        var10 = -8;
                        statePc = 160;
                        continue stateLoop;
                    } catch (Throwable stateCaught_159) {
                        caughtException = stateCaught_159;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 160: {
                    try {
                        if ((var10 ^ -1) < -9) {
                            statePc = 162;
                        } else {
                            statePc = 161;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_160) {
                        caughtException = stateCaught_160;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 161: {
                    try {
                        kh.field_y.b(86, (rf) (Object) new bf(320 + var10 * 24, -Math.abs(-64 + 64 * var10), 320 - -(24 * var10), 1));
                        var10++;
                        if (var12 == 0) {
                            statePc = 160;
                        } else {
                            statePc = 162;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 162: {
                    try {
                        if (var12 == 0) {
                            statePc = 198;
                        } else {
                            statePc = 163;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_162) {
                        caughtException = stateCaught_162;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 163: {
                    try {
                        var6 = -64;
                        nf.field_e = 0;
                        if ((sh.b(param0 + 31, 2) ^ -1) == -1) {
                            statePc = 165;
                        } else {
                            statePc = 164;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 164: {
                    try {
                        var7 = 560;
                        var8 = -24;
                        if (var12 == 0) {
                            statePc = 166;
                        } else {
                            statePc = 165;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_164) {
                        caughtException = stateCaught_164;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 165: {
                    try {
                        var8 = 24;
                        var7 = 80;
                        statePc = 166;
                        continue stateLoop;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 166: {
                    try {
                        var10 = -10;
                        statePc = 167;
                        continue stateLoop;
                    } catch (Throwable stateCaught_166) {
                        caughtException = stateCaught_166;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 167: {
                    try {
                        if ((var10 ^ -1) < -11) {
                            statePc = 169;
                        } else {
                            statePc = 168;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_167) {
                        caughtException = stateCaught_167;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 168: {
                    try {
                        var11 = new bf(var7, var6, 640 + -var7, 17);
                        var11.field_p = true;
                        var7 = var7 + var8;
                        var6 -= 16;
                        kh.field_y.b(param0 ^ 29, (rf) (Object) var11);
                        var10++;
                        if (var12 == 0) {
                            statePc = 167;
                        } else {
                            statePc = 169;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_168) {
                        caughtException = stateCaught_168;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 169: {
                    try {
                        if (var12 == 0) {
                            statePc = 198;
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
                        nf.field_e = 150;
                        kh.field_y.b(81, (rf) (Object) new bf(var3, -64, var4, 3));
                        if (var12 == 0) {
                            statePc = 198;
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
                        statePc = 173;
                        continue stateLoop;
                    } catch (Throwable stateCaught_171) {
                        caughtException = stateCaught_171;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 172: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_172) {
                        caughtException = stateCaught_172;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 173: {
                    try {
                        nf.field_e = 0;
                        var10 = 0;
                        statePc = 174;
                        continue stateLoop;
                    } catch (Throwable stateCaught_173) {
                        caughtException = stateCaught_173;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 174: {
                    try {
                        if (-6 >= (var10 ^ -1)) {
                            statePc = 176;
                        } else {
                            statePc = 175;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_174) {
                        caughtException = stateCaught_174;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 175: {
                    try {
                        kh.field_y.b(95, (rf) (Object) new bf(var3, -64 + -var10 * 64, var4, 1));
                        kh.field_y.b(94, (rf) (Object) new bf(-var3 + 640, 64 * -var10 - 64, -var4 + 640, 1));
                        var10++;
                        if (var12 == 0) {
                            statePc = 174;
                        } else {
                            statePc = 176;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_175) {
                        caughtException = stateCaught_175;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 176: {
                    try {
                        if (var12 == 0) {
                            statePc = 198;
                        } else {
                            statePc = 177;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_176) {
                        caughtException = stateCaught_176;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 177: {
                    try {
                        nf.field_e = 50;
                        var10 = 0;
                        statePc = 178;
                        continue stateLoop;
                    } catch (Throwable stateCaught_177) {
                        caughtException = stateCaught_177;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 178: {
                    try {
                        stackOut_178_0 = var10;
                        stackIn_183_0 = stackOut_178_0;
                        stackIn_179_0 = stackOut_178_0;
                        if ((nf.field_l ^ -1) == -3) {
                            statePc = 183;
                        } else {
                            statePc = 179;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_178) {
                        caughtException = stateCaught_178;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 179: {
                    try {
                        stackOut_179_0 = stackIn_179_0;
                        stackOut_179_1 = 5;
                        stackIn_180_0 = stackOut_179_0;
                        stackIn_180_1 = stackOut_179_1;
                        statePc = 180;
                        continue stateLoop;
                    } catch (Throwable stateCaught_179) {
                        caughtException = stateCaught_179;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 180: {
                    try {
                        stackOut_180_0 = stackIn_180_0;
                        stackOut_180_1 = stackIn_180_1;
                        stackIn_184_0 = stackOut_180_0;
                        stackIn_184_1 = stackOut_180_1;
                        stackIn_181_0 = stackOut_180_0;
                        stackIn_181_1 = stackOut_180_1;
                        if (var12 != 0) {
                            statePc = 184;
                        } else {
                            statePc = 181;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_180) {
                        caughtException = stateCaught_180;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 181: {
                    try {
                        stackOut_181_0 = stackIn_181_0;
                        stackOut_181_1 = stackIn_181_1;
                        stackIn_184_0 = stackOut_181_0;
                        stackIn_184_1 = stackOut_181_1;
                        statePc = 184;
                        continue stateLoop;
                    } catch (Throwable stateCaught_181) {
                        caughtException = stateCaught_181;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 182: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_182) {
                        caughtException = stateCaught_182;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 183: {
                    try {
                        stackOut_183_0 = stackIn_183_0;
                        stackOut_183_1 = 10;
                        stackIn_184_0 = stackOut_183_0;
                        stackIn_184_1 = stackOut_183_1;
                        statePc = 184;
                        continue stateLoop;
                    } catch (Throwable stateCaught_183) {
                        caughtException = stateCaught_183;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 184: {
                    try {
                        if (stackIn_184_0 >= stackIn_184_1) {
                            statePc = 188;
                        } else {
                            statePc = 185;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_184) {
                        caughtException = stateCaught_184;
                        statePc = 187;
                        continue stateLoop;
                    }
                }
                case 185: {
                    try {
                        kh.field_y.b(70, (rf) (Object) new bf(var3, -64 + -var10 * 64, var4, 4));
                        var10++;
                        if (var12 == 0) {
                            statePc = 178;
                        } else {
                            statePc = 186;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_185) {
                        caughtException = stateCaught_185;
                        statePc = 187;
                        continue stateLoop;
                    }
                }
                case 186: {
                    try {
                        statePc = 188;
                        continue stateLoop;
                    } catch (Throwable stateCaught_186) {
                        caughtException = stateCaught_186;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 187: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_187) {
                        caughtException = stateCaught_187;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 188: {
                    try {
                        if (var12 == 0) {
                            statePc = 198;
                        } else {
                            statePc = 189;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_188) {
                        caughtException = stateCaught_188;
                        statePc = 191;
                        continue stateLoop;
                    }
                }
                case 189: {
                    try {
                        nf.field_e = -50;
                        kh.field_y.b(78, (rf) (Object) new bf(var3, -64, var3, 12));
                        if (var12 == 0) {
                            statePc = 198;
                        } else {
                            statePc = 190;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_189) {
                        caughtException = stateCaught_189;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 190: {
                    try {
                        statePc = 192;
                        continue stateLoop;
                    } catch (Throwable stateCaught_190) {
                        caughtException = stateCaught_190;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 191: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_191) {
                        caughtException = stateCaught_191;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 192: {
                    try {
                        nf.field_e = -50;
                        kh.field_y.b(61, (rf) (Object) new bf(32, -64, 32, 12));
                        kh.field_y.b(84, (rf) (Object) new bf(608, -64, 608, 12));
                        if (var12 == 0) {
                            statePc = 198;
                        } else {
                            statePc = 193;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_192) {
                        caughtException = stateCaught_192;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 193: {
                    try {
                        statePc = 195;
                        continue stateLoop;
                    } catch (Throwable stateCaught_193) {
                        caughtException = stateCaught_193;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 194: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_194) {
                        caughtException = stateCaught_194;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 195: {
                    try {
                        var9 = new bf(320, -256, var4, 15);
                        kh.field_y.b(param0 + -7, (rf) (Object) var9);
                        tj.field_C = var9.field_k;
                        ua.field_c = ue.field_c[rj.field_h] + 1;
                        pf.field_d = pf.field_d + 1;
                        dg.field_l = 0;
                        mj.a(255, 12, 0, 41, 100);
                        ti.field_f.a((oa) (Object) kc.field_P);
                        kc.field_P.f();
                        kc.field_P = fl.field_h;
                        ti.field_f.b((oa) (Object) kc.field_P);
                        kc.field_P.a(mc.field_b);
                        statePc = 198;
                        continue stateLoop;
                    } catch (Throwable stateCaught_195) {
                        caughtException = stateCaught_195;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 197: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw sd.a((Throwable) (Object) var2, "StarCannon.T(" + param0 + 41);
                }
                case 198: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void c(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          StarCannon.r(122);
          bj.a(-1);
          eb.a(true);
          pb.a(91);
          rd.e(-29826);
          bg.a(-115);
          lj.b(87);
          pc.b(-76);
          ag.j((byte) 39);
          ii.b((byte) 70);
          th.c(1719);
          gg.b((byte) 121);
          wk.a(true);
          gj.a(15686);
          ki.a();
          ue.b(0);
          qe.a();
          oh.a(-1);
          ec.a(82);
          rb.g((byte) -59);
          dd.a(-121);
          qa.a(-5504);
          mf.a(23675);
          kg.a((byte) 103);
          r.a(-76);
          ce.a(30518);
          j.a(-3);
          ri.a(-15552);
          fb.a(-113);
          nb.a(572996488);
          pk.a(4);
          qi.b(0);
          vf.a(false);
          fi.a(0);
          tk.a(-124);
          cg.a(89);
          qc.a(-1);
          bb.b(2);
          bf.a(15415);
          d.a(32);
          jl.a(0);
          m.b(-98);
          lh.a((byte) -113);
          wd.c();
          df.a();
          eh.g((byte) 101);
          ef.a((byte) 27);
          td.c(-12539);
          sb.b(105);
          ed.b((byte) -61);
          rf.b(false);
          ui.d((byte) -80);
          uh.b((byte) -115);
          md.a(-27240);
          var2_int = 82 / ((param0 - -63) / 62);
          n.f(0);
          gi.b(640);
          wc.c(-1);
          bi.b(0);
          ck.a(false);
          gf.a((byte) -126);
          sd.a(false);
          sc.a(0);
          wg.a((byte) -117);
          be.a(20342);
          tc.g(-14528);
          ok.i((byte) -90);
          lf.e(false);
          lc.m(-11147);
          ph.m(-1);
          kh.h((byte) 126);
          db.a(-117);
          rg.k(-128);
          hg.a(false);
          ma.a((byte) 67);
          sg.a(false);
          g.b(-12837);
          ak.a((byte) 94);
          nc.b((byte) 59);
          ti.a((byte) 13);
          je.a();
          nj.a();
          l.a();
          ja.a((byte) 80);
          ih.b((byte) -125);
          jf.a(true);
          ua.a(128);
          ne.a(-109);
          ia.k(36);
          fc.a(20811);
          u.a(2);
          hc.a(false);
          sa.a(30334);
          v.a((byte) -63);
          s.a((byte) -104);
          hh.a((byte) -22);
          vh.h((byte) -98);
          jh.b(126);
          ra.d((byte) 108);
          tg.h(-64);
          t.c((byte) 113);
          cb.b(0);
          la.a((byte) 1);
          ik.d(0);
          jb.a(-730625660);
          pd.a((byte) 98);
          vj.e(true);
          fg.a((byte) 6);
          hd.a((byte) 125);
          gl.a();
          fd.a(-12241);
          kl.a(21367);
          lb.a((byte) -49);
          ll.a(-1);
          ee.a((byte) 79);
          wi.b(64);
          bl.a(-29584);
          ac.a((byte) -77);
          a.a(-1);
          pe.a((byte) 93);
          ca.a(true);
          ai.a(0);
          hi.a((byte) 56);
          te.a(-1);
          dl.a(true);
          kk.a((byte) 63);
          nk.a();
          fk.a(-4918);
          va.b((byte) 80);
          mc.a((byte) 40);
          ea.a((byte) 48);
          ni.a(-81);
          w.b(3);
          eg.a((byte) -118);
          ci.a(-124);
          bd.a((byte) -74);
          uj.c((byte) -44);
          dk.a(-115);
          kf.a(0);
          kc.a(false);
          qd.h((byte) -37);
          vk.e((byte) 73);
          ba.c(125);
          dh.a((byte) -107);
          na.a(426388817);
          ff.f(-75);
          rc.a((byte) -14);
          ta.a(-32769);
          gd.a((byte) 123);
          ha.a((byte) -62);
          b.a(true);
          ic.a((byte) -120);
          wj.a(false);
          oe.b(12);
          le.a(-11434);
          hf.b(-22720);
          mg.c(0);
          jk.a(-124);
          nf.b(-109);
          ad.f((byte) -95);
          fe.f((byte) 73);
          qj.l(-102);
          fa.a(1851621384);
          kd.a(-16);
          ab.e((byte) 119);
          jg.e(934716193);
          pa.f(-200);
          gh.e(13329);
          qf.d((byte) 100);
          vg.b(-117);
          jj.a(0);
          el.e((byte) 115);
          sj.f((byte) 126);
          h.a();
          li.b(-23);
          se.c((byte) -2);
          ij.b(20756);
          ve.a(32729);
          tj.g(-123);
          af.g(9392);
          o.a(4432);
          ek.a(false);
          bh.a(-110);
          mi.d(1);
          ej.f(99);
          fl.e(115);
          cd.a(8192);
          wh.a(true);
          ob.d(-18147);
          rh.a(false);
          gb.b(122);
          fh.b((byte) -46);
          sh.b(4);
          tf.a(18172);
          ie.h(24288);
          vc.b((byte) 35);
          re.d(0);
          hj.a((byte) -45);
          ld.g(8240);
          oj.d(-113);
          ah.a(-91);
          rj.a(-1);
          hb.a(9681);
          pf.a(true);
          ig.a(-1);
          qb.a(-115);
          ge.a(45);
          q.b((byte) 119);
          kj.a(0);
          mj.a(true);
          od.a(83);
          cl.d((byte) 121);
          vd.a(32);
          ae.a((byte) 64);
          bc.b((byte) -128);
          we.b((byte) 95);
          dg.d(124);
          of.a(true);
          il.b(2147483647);
          nh.a(false);
          nd.g(0);
          cc.e((byte) -98);
          cf.f(1);
          di.f(24979);
          vb.e((byte) 114);
          og.a((byte) 92);
          oi.a(false);
          p.a(11);
          uc.e(1);
          sk.a(false);
          ((StarCannon) this).field_u = null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
        }
        var2 = decompiledCaughtException;
        throw sd.a((Throwable) (Object) var2, "StarCannon.E(" + param0 + 41);
    }

    final void d(byte param0) {
        Object var2_ref = null;
        RuntimeException var2 = null;
        int var3_int = 0;
        wf var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object stackIn_5_0 = null;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_10_1 = null;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_12_1 = null;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_13_1 = null;
        int stackIn_13_2 = 0;
        int stackIn_41_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_92_0 = 0;
        int stackIn_100_0 = 0;
        int stackIn_125_0 = 0;
        int stackIn_133_0 = 0;
        int stackIn_143_0 = 0;
        byte stackIn_164_0 = 0;
        int stackIn_173_0 = 0;
        java.awt.Canvas stackOut_2_0 = null;
        qc stackOut_4_0 = null;
        int stackOut_9_0 = 0;
        Object stackOut_9_1 = null;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_10_1 = null;
        boolean stackOut_10_2 = false;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_12_1 = null;
        int stackOut_12_2 = 0;
        int stackOut_40_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_91_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_124_0 = 0;
        int stackOut_132_0 = 0;
        int stackOut_142_0 = 0;
        byte stackOut_163_0 = 0;
        int stackOut_170_0 = 0;
        int stackOut_172_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        var2_ref = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = field_A;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (n.field_a != null) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = kj.field_E;
                        stackIn_5_0 = (Object) (Object) stackOut_2_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = n.field_a;
                        stackIn_5_0 = (Object) (Object) stackOut_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var2_ref = stackIn_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (le.c(4)) {
                            statePc = 9;
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
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = 320;
                        stackOut_9_1 = var2_ref;
                        stackIn_12_0 = stackOut_9_0;
                        stackIn_12_1 = (RuntimeException) (Object) stackOut_9_1;
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = (RuntimeException) (Object) stackOut_9_1;
                        if (n.field_a != null) {
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
                        stackOut_10_0 = stackIn_10_0;
                        stackOut_10_1 = (RuntimeException) (Object) stackIn_10_1;
                        stackOut_10_2 = dl.field_d;
                        stackIn_13_0 = stackOut_10_0;
                        stackIn_13_1 = stackOut_10_1;
                        stackIn_13_2 = stackOut_10_2 ? 1 : 0;
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
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = stackIn_12_0;
                        stackOut_12_1 = (RuntimeException) (Object) stackIn_12_1;
                        stackOut_12_2 = 1;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        stackIn_13_2 = stackOut_12_2;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        ee.a(stackIn_13_0, (java.awt.Canvas) (Object) stackIn_13_1, stackIn_13_2 != 0);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 14: {
                    return;
                }
                case 15: {
                    try {
                        if (param0 == 22) {
                            statePc = 19;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        this.l((byte) -102);
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (ld.field_ib) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        oi.a((java.awt.Canvas) var2_ref, (byte) -128);
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 21: {
                    return;
                }
                case 22: {
                    try {
                        if (oh.field_a != null) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        ma.a(q.field_i, -13923, 100.0f);
                        oi.a((java.awt.Canvas) var2_ref, (byte) 72);
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 26: {
                    return;
                }
                case 27: {
                    try {
                        if (qc.field_d == 0) {
                            statePc = 30;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var3_int = (320 + -fi.field_e.field_f) / 48;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        eb.field_b[qd.field_E[2]].a(var3_int, 240 + hc.field_c, 320, 240);
                        eb.field_b[qd.field_E[1]].a(var3_int, hc.field_c, 320, 240);
                        eb.field_b[qd.field_E[0]].a(var3_int, -240 + hc.field_c, 320, 240);
                        // wide iinc 3 320
                        eb.field_b[qd.field_E[5]].a(var3_int, hc.field_c + 240, 320, 240);
                        eb.field_b[qd.field_E[4]].a(var3_int, hc.field_c, 320, 240);
                        eb.field_b[qd.field_E[3]].a(var3_int, -240 + hc.field_c, 320, 240);
                        // wide iinc 3 320
                        eb.field_b[qd.field_E[2]].a(var3_int, 240 + hc.field_c, 320, 240);
                        eb.field_b[qd.field_E[1]].a(var3_int, hc.field_c, 320, 240);
                        eb.field_b[qd.field_E[0]].a(var3_int, -240 + hc.field_c, 320, 240);
                        // wide iinc 3 -960
                        eb.field_b[qd.field_E[5]].a(var3_int, 240 + hc.field_c, 320, 240);
                        eb.field_b[qd.field_E[4]].a(var3_int, hc.field_c, 320, 240);
                        eb.field_b[qd.field_E[3]].a(var3_int, -240 + hc.field_c, 320, 240);
                        if (var6 == 0) {
                            statePc = 33;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        ki.b();
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
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if ((gj.field_c ^ -1) != 0) {
                            statePc = 54;
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
                        if (50 <= cd.field_c) {
                            statePc = 51;
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
                        gj.field_e.d(-gj.field_e.field_x + 640 >> 2143672641, 0);
                        if (25 < cd.field_c) {
                            statePc = 47;
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
                        stackOut_40_0 = field_z;
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
                        if (stackIn_41_0 == -2) {
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
                        gb.field_r.e(640 - gb.field_r.field_x >> -1364140095, 0, -(cd.field_c * 10) + 250);
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
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (-26 > (cd.field_c ^ -1)) {
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
                        statePc = 54;
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
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        gb.field_r.e(-gb.field_r.field_x + 640 >> -534476095, 0, -250 + 10 * cd.field_c);
                        if (var6 == 0) {
                            statePc = 54;
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
                        gb.field_r.d(-gb.field_r.field_x + 640 >> 1958122657, 0);
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
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (pa.field_L != field_z) {
                            statePc = 76;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (field_z == -1) {
                            statePc = 73;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (-2 != (field_z ^ -1)) {
                            statePc = 64;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        this.b(0, 7306);
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (3 != field_z) {
                            statePc = 72;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        stackOut_65_0 = lf.field_cb;
                        stackIn_66_0 = stackOut_65_0;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if ((stackIn_66_0 ^ -1) != -2) {
                            statePc = 72;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        this.b(0, 7306);
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        fg.field_a[field_z].a(320, 100);
                        if (var6 == 0) {
                            statePc = 140;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        this.b(100, 7306);
                        if (var6 == 0) {
                            statePc = 140;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if ((cd.field_c ^ -1) >= -26) {
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
                        statePc = 110;
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
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        var3_int = -cd.field_c + 25 << -1386168606;
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        if (-1 != field_z) {
                            statePc = 86;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        this.b(var3_int, 7306);
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
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        if ((pa.field_L ^ -1) == 0) {
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
                        statePc = 90;
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
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        this.b(-var3_int + 100, 7306);
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        if (3 != pa.field_L) {
                            statePc = 98;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        stackOut_91_0 = 1;
                        stackIn_92_0 = stackOut_91_0;
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        if (stackIn_92_0 != field_z) {
                            statePc = 98;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        this.b(0, 7306);
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        if (pa.field_L != 1) {
                            statePc = 106;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        stackOut_99_0 = field_z;
                        stackIn_100_0 = stackOut_99_0;
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        if (stackIn_100_0 == 3) {
                            statePc = 105;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        statePc = 103;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        this.b(0, param0 + 7284);
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        if ((field_z ^ -1) > -1) {
                            statePc = 110;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        fg.field_a[field_z].a(320, var3_int);
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        if (cd.field_c <= 25) {
                            statePc = 140;
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
                        if (pa.field_L < 0) {
                            statePc = 140;
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
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        var3_int = -25 + cd.field_c << 1791309058;
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        if ((pa.field_L ^ -1) != 0) {
                            statePc = 119;
                        } else {
                            statePc = 116;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        this.b(var3_int, 7306);
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
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        if (field_z != -1) {
                            statePc = 123;
                        } else {
                            statePc = 120;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 122;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        this.b(-var3_int + 100, 7306);
                        statePc = 121;
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 122;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        if (-4 != (pa.field_L ^ -1)) {
                            statePc = 131;
                        } else {
                            statePc = 124;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        stackOut_124_0 = field_z;
                        stackIn_125_0 = stackOut_124_0;
                        statePc = 125;
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        if (stackIn_125_0 != 1) {
                            statePc = 131;
                        } else {
                            statePc = 126;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 130;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        statePc = 128;
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 130;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 130;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        this.b(0, 7306);
                        statePc = 129;
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 130;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        statePc = 131;
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        if (1 != pa.field_L) {
                            statePc = 139;
                        } else {
                            statePc = 132;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        stackOut_132_0 = 3;
                        stackIn_133_0 = stackOut_132_0;
                        statePc = 133;
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        if (stackIn_133_0 == field_z) {
                            statePc = 138;
                        } else {
                            statePc = 134;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        statePc = 136;
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        statePc = 139;
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        this.b(0, 7306);
                        statePc = 139;
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        fg.field_a[pa.field_L].a(320, var3_int);
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        var3 = (wf) (Object) pk.field_a.c(-3905);
                        if (null == var3) {
                            statePc = 150;
                        } else {
                            statePc = 141;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        var5 = ((StarCannon) this).field_B;
                        if (80 <= var5) {
                            statePc = 144;
                        } else {
                            statePc = 142;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        var4 = var5 / 2 + -32;
                        stackOut_142_0 = var6;
                        stackIn_143_0 = stackOut_142_0;
                        statePc = 143;
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        if (stackIn_143_0 == 0) {
                            statePc = 149;
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
                        if (230 <= var5) {
                            statePc = 148;
                        } else {
                            statePc = 145;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        statePc = 147;
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        var4 = 8;
                        if (var6 == 0) {
                            statePc = 149;
                        } else {
                            statePc = 148;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        var4 = -(var5 / 2) + 123;
                        statePc = 149;
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        j.field_c[var3.field_g].c(8, var4);
                        af.field_y.a(di.field_j[var3.field_g], 48, var4 - -af.field_y.field_p, 65535, -1);
                        statePc = 150;
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        if (-1 != (nh.field_e ^ -1)) {
                            statePc = 153;
                        } else {
                            statePc = 151;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_150) {
                        caughtException = stateCaught_150;
                        statePc = 152;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        statePc = 158;
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
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        var4 = 256 * jb.field_e / 50;
                        statePc = 154;
                        continue stateLoop;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        if (0 < var4) {
                            statePc = 157;
                        } else {
                            statePc = 155;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        statePc = 158;
                        continue stateLoop;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        ki.b(0, 0, ki.field_j, ki.field_f, 0, var4);
                        statePc = 158;
                        continue stateLoop;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 158: {
                    try {
                        if (!gh.f(-23093)) {
                            statePc = 162;
                        } else {
                            statePc = 159;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_158) {
                        caughtException = stateCaught_158;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 159: {
                    try {
                        ki.b(0, 0, 640, 480, 0, 128);
                        ki.d(-12 + (-(ii.a(6940) / 2) + 320), -12 + -(wc.d(20) / 2) + 240, 24 - -ii.a(6940), 24 - -wc.d(20), 0);
                        fg.a(32513, jk.field_f, 12, 12);
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
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 161: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 162: {
                    try {
                        if (!cb.a(false)) {
                            statePc = 174;
                        } else {
                            statePc = 163;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_162) {
                        caughtException = stateCaught_162;
                        statePc = 166;
                        continue stateLoop;
                    }
                }
                case 163: {
                    try {
                        stackOut_163_0 = param0;
                        stackIn_164_0 = stackOut_163_0;
                        statePc = 164;
                        continue stateLoop;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = 166;
                        continue stateLoop;
                    }
                }
                case 164: {
                    try {
                        if (!gh.f(stackIn_164_0 ^ -23075)) {
                            statePc = 169;
                        } else {
                            statePc = 165;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_164) {
                        caughtException = stateCaught_164;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 165: {
                    try {
                        statePc = 167;
                        continue stateLoop;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 166: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_166) {
                        caughtException = stateCaught_166;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 167: {
                    try {
                        statePc = 174;
                        continue stateLoop;
                    } catch (Throwable stateCaught_167) {
                        caughtException = stateCaught_167;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 168: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_168) {
                        caughtException = stateCaught_168;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 169: {
                    try {
                        if (n.field_a != null) {
                            statePc = 172;
                        } else {
                            statePc = 170;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_169) {
                        caughtException = stateCaught_169;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 170: {
                    try {
                        stackOut_170_0 = 0;
                        stackIn_173_0 = stackOut_170_0;
                        statePc = 173;
                        continue stateLoop;
                    } catch (Throwable stateCaught_170) {
                        caughtException = stateCaught_170;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 171: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_171) {
                        caughtException = stateCaught_171;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 172: {
                    try {
                        stackOut_172_0 = 1;
                        stackIn_173_0 = stackOut_172_0;
                        statePc = 173;
                        continue stateLoop;
                    } catch (Throwable stateCaught_172) {
                        caughtException = stateCaught_172;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 173: {
                    try {
                        jf.a(stackIn_173_0 != 0, param0 ^ 106);
                        statePc = 174;
                        continue stateLoop;
                    } catch (Throwable stateCaught_173) {
                        caughtException = stateCaught_173;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 174: {
                    try {
                        dd.a((java.awt.Canvas) var2_ref, 0, 0, -23466);
                        statePc = 177;
                        continue stateLoop;
                    } catch (Throwable stateCaught_174) {
                        caughtException = stateCaught_174;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 176: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw sd.a((Throwable) (Object) var2, "StarCannon.J(" + param0 + 41);
                }
                case 177: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void f(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = field_A;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ((StarCannon) this).a(9, 9, 0, 8, true, 6, false, 7);
                        hh.field_b = new hl[9];
                        var2_int = 0;
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
                        if (var2_int >= 9) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        hh.field_b[var2_int] = new hl(1, 1);
                        hh.field_b[var2_int].field_B[0] = 65535;
                        var2_int++;
                        if (var3 != 0) {
                            statePc = 10;
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
                        if (var3 == 0) {
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
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var2_int = 60 % ((param0 - -23) / 47);
                        sb.field_m = 33023;
                        hh.field_b[4] = null;
                        ig.field_b = 16777215;
                        sd.field_a = 33023;
                        df.a(22050, false, 10);
                        nb.field_f = df.a(nb.field_e, (java.awt.Component) (Object) kj.field_E, 0, 512);
                        ea.field_d = df.a(nb.field_e, (java.awt.Component) (Object) kj.field_E, 1, 22050);
                        jk.field_k = new vi();
                        ti.field_f = new vi();
                        nb.field_f.a((c) (Object) jk.field_k);
                        ea.field_d.a((c) (Object) ti.field_f);
                        se.field_m = 0;
                        bi.field_b = false;
                        mc.field_b = 128;
                        dg.field_l = 0;
                        nb.field_g = 64;
                        lc.field_gb = -2048;
                        nf.field_l = 0;
                        ua.field_c = -2;
                        qc.field_d = 2;
                        ((StarCannon) this).a(false, false, false, true, -752);
                        wa.a(0, -75, 16777215, 0, rj.field_l, (java.applet.Applet) this);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw sd.a((Throwable) (Object) var2, "StarCannon.I(" + param0 + 41);
                }
                case 10: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0) {
        RuntimeException var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (n.field_a == null) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        re.a(param0 ^ -25109);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (null != nb.field_f) {
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
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        nb.field_f.b();
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (null == ea.field_d) {
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
                        ea.field_d.b();
                        statePc = 10;
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
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        la.a(2);
                        if (param0 == -25109) {
                            statePc = 18;
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
                        this.m((byte) 25);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 18;
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
                case 17: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw sd.a((Throwable) (Object) var2, "StarCannon.C(" + param0 + 41);
                }
                case 18: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void r(int param0) {
        field_C = null;
        if (param0 <= 121) {
            return;
        }
        try {
            field_y = null;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "StarCannon.O(" + param0 + 41);
        }
    }

    private final void b(boolean param0) {
        RuntimeException var2 = null;
        int var3 = 0;
        Object stackIn_26_0 = null;
        int stackIn_40_0 = 0;
        Object stackOut_25_0 = null;
        int stackOut_39_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = field_A;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        oe.field_a = oe.field_a - 1;
                        ja.field_d = ja.field_d + 1;
                        if (-1 != (kg.field_a ^ -1)) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        na.field_d = na.field_d + fc.field_e;
                        il.field_i = il.field_i + 2;
                        oe.field_a = oe.field_a + 1;
                        ja.field_d = ja.field_d + 1;
                        fc.field_e = fc.field_e - jl.field_d * fc.field_e;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (wc.field_c[98]) {
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
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        jl.field_d = jl.field_d + pe.field_d;
                        ja.field_d = ja.field_d + 5;
                        oe.field_a = oe.field_a + 5;
                        il.field_i = il.field_i + 10;
                        fc.field_e = fc.field_e - pe.field_d * na.field_d;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (wc.field_c[99]) {
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
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        oe.field_a = oe.field_a + 3;
                        na.field_d = na.field_d - kc.field_Q;
                        fc.field_e = fc.field_e + jl.field_d * kc.field_Q;
                        ja.field_d = ja.field_d + 7;
                        il.field_i = il.field_i + 10;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (!wc.field_c[84]) {
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
                        fc.field_e = fc.field_e - na.field_d;
                        jl.field_d = jl.field_d + 1;
                        oe.field_a = oe.field_a + 10;
                        ja.field_d = ja.field_d - 10;
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
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        va.field_f = va.field_f + 1;
                        se.field_u = 256;
                        if (5 >= va.field_f) {
                            statePc = 24;
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
                        va.field_f = va.field_f - 5;
                        pd.field_a = pd.field_a + 1;
                        if (-6 >= (pd.field_a ^ -1)) {
                            statePc = 23;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 24;
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
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        pd.field_a = pd.field_a - 5;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (null == pk.field_a.c(-3905)) {
                            statePc = 32;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackOut_25_0 = this;
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
                        ((StarCannon) this).field_B = ((StarCannon) this).field_B + 1;
                        if (((StarCannon) this).field_B + 1 == 335) {
                            statePc = 31;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
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
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        ((StarCannon) this).field_B = 0;
                        rf discarded$1 = pk.field_a.a((byte) 39);
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if ((nh.field_e ^ -1) != -1) {
                            statePc = 59;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (pa.field_L == field_z) {
                            statePc = 50;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        cd.field_c = cd.field_c + 1;
                        if (25 > cd.field_c) {
                            statePc = 46;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        stackOut_39_0 = -1;
                        stackIn_40_0 = stackOut_39_0;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (stackIn_40_0 == pa.field_L) {
                            statePc = 45;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 46;
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
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        cd.field_c = 50;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (cd.field_c >= 50) {
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
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        field_z = pa.field_L;
                        if (var3 == 0) {
                            statePc = 98;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if ((field_z ^ -1) != 0) {
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
                        this.m((byte) 110);
                        if (var3 == 0) {
                            statePc = 98;
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
                        fg.field_a[field_z].b(0);
                        if (var3 == 0) {
                            statePc = 98;
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
                        if (1 == nh.field_e) {
                            statePc = 85;
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
                        if (-3 != (nh.field_e ^ -1)) {
                            statePc = 79;
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
                        if (wk.a(77)) {
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
                        oh.field_a = og.a(4, (byte) 113);
                        sa.a(nf.field_l + na.field_a * 3, 23820);
                        field_z = ff.field_o;
                        if (var3 == 0) {
                            statePc = 74;
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
                        field_z = vj.field_ab;
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (gh.f(-23093)) {
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
                        statePc = 78;
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
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        hf.a(240, 12, 22, jk.field_f, 18, 320, jk.field_f, 12, (qe) (Object) a.field_b, -11, 12, false);
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        nh.field_e = 3;
                        pa.field_L = field_z;
                        if (var3 == 0) {
                            statePc = 98;
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
                        jb.field_e = jb.field_e - 1;
                        if (-1 == (jb.field_e ^ -1)) {
                            statePc = 84;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        statePc = 82;
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
                case 82: {
                    try {
                        statePc = 98;
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
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        nh.field_e = 0;
                        if (var3 == 0) {
                            statePc = 98;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        jb.field_e = jb.field_e + 1;
                        if (-51 == (jb.field_e ^ -1)) {
                            statePc = 90;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        if (!gh.f(-23093)) {
                            statePc = 94;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        mf.a((byte) -58);
                        if (var3 == 0) {
                            statePc = 97;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        pk.b(0);
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        nh.field_e = 2;
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        if (param0) {
                            statePc = 104;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        this.t(-117);
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 103: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw sd.a((Throwable) (Object) var2, "StarCannon.EA(" + param0 + 41);
                }
                case 104: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public StarCannon() {
        ((StarCannon) this).field_D = 0;
        ((StarCannon) this).field_B = 0;
    }

    final static void a(ue param0, boolean param1, int param2, ue param3, ue param4) {
        RuntimeException var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        qa.field_a = uf.a("", 15);
                        if (param2 == -20169) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        field_E = 's';
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        qa.field_a.a(false, false);
                        fc.a(param0, param4, (byte) 95, param3);
                        td.b(30000);
                        ie.field_x = cl.field_k;
                        uh.field_k = cl.field_k;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    var5 = (RuntimeException) (Object) caughtException;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    try {
                        stackOut_7_0 = (RuntimeException) var5;
                        stackOut_7_1 = new StringBuilder().append("StarCannon.V(");
                        stackIn_10_0 = stackOut_7_0;
                        stackIn_10_1 = stackOut_7_1;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        if (param0 == null) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                        stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                        stackOut_8_2 = "{...}";
                        stackIn_11_0 = stackOut_8_0;
                        stackIn_11_1 = stackOut_8_1;
                        stackIn_11_2 = stackOut_8_2;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 10: {
                    stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                    stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
                    stackOut_10_2 = "null";
                    stackIn_11_0 = stackOut_10_0;
                    stackIn_11_1 = stackOut_10_1;
                    stackIn_11_2 = stackOut_10_2;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    try {
                        stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                        stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44).append(param1).append(44).append(param2).append(44);
                        stackIn_14_0 = stackOut_11_0;
                        stackIn_14_1 = stackOut_11_1;
                        stackIn_12_0 = stackOut_11_0;
                        stackIn_12_1 = stackOut_11_1;
                        if (param3 == null) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                        stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
                        stackOut_12_2 = "{...}";
                        stackIn_15_0 = stackOut_12_0;
                        stackIn_15_1 = stackOut_12_1;
                        stackIn_15_2 = stackOut_12_2;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 14: {
                    stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                    stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                    stackOut_14_2 = "null";
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    stackIn_15_2 = stackOut_14_2;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    try {
                        stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                        stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44);
                        stackIn_18_0 = stackOut_15_0;
                        stackIn_18_1 = stackOut_15_1;
                        stackIn_16_0 = stackOut_15_0;
                        stackIn_16_1 = stackOut_15_1;
                        if (param4 == null) {
                            statePc = 18;
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
                        stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                        stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                        stackOut_16_2 = "{...}";
                        stackIn_19_0 = stackOut_16_0;
                        stackIn_19_1 = stackOut_16_1;
                        stackIn_19_2 = stackOut_16_2;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 18: {
                    stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                    stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
                    stackOut_18_2 = "null";
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    stackIn_19_2 = stackOut_18_2;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    throw sd.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
                }
                case 20: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void k(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        bf var5 = null;
        bf var6 = null;
        int var7 = 0;
        int var8 = 0;
        bf var8_ref = null;
        int var9 = 0;
        int var10 = 0;
        bf var11 = null;
        int var12 = 0;
        int stackIn_4_0 = 0;
        int stackIn_114_0 = 0;
        int stackIn_115_0 = 0;
        int stackIn_115_1 = 0;
        int stackIn_116_0 = 0;
        int stackIn_116_1 = 0;
        int stackIn_118_0 = 0;
        int stackIn_119_0 = 0;
        int stackIn_119_1 = 0;
        int stackIn_120_0 = 0;
        int stackIn_120_1 = 0;
        int stackIn_127_0 = 0;
        int stackIn_128_0 = 0;
        int stackIn_128_1 = 0;
        int stackIn_129_0 = 0;
        int stackIn_129_1 = 0;
        int stackIn_131_0 = 0;
        int stackIn_132_0 = 0;
        int stackIn_132_1 = 0;
        int stackIn_186_0 = 0;
        int stackIn_187_0 = 0;
        int stackIn_190_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_113_0 = 0;
        int stackOut_114_0 = 0;
        int stackOut_114_1 = 0;
        int stackOut_115_0 = 0;
        int stackOut_115_1 = 0;
        int stackOut_116_0 = 0;
        int stackOut_116_1 = 0;
        int stackOut_118_0 = 0;
        int stackOut_118_1 = 0;
        int stackOut_119_0 = 0;
        int stackOut_119_1 = 0;
        int stackOut_126_0 = 0;
        int stackOut_127_0 = 0;
        int stackOut_127_1 = 0;
        int stackOut_128_0 = 0;
        int stackOut_128_1 = 0;
        int stackOut_129_0 = 0;
        int stackOut_129_1 = 0;
        int stackOut_131_0 = 0;
        int stackOut_131_1 = 0;
        int stackOut_185_0 = 0;
        int stackOut_186_0 = 0;
        int stackOut_187_0 = 0;
        int stackOut_189_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = field_A;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = sh.b(-127, 3) + ua.field_c;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (ue.field_c[rj.field_h] >= var2_int) {
                            statePc = 10;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = ua.field_c;
                        stackIn_4_0 = stackOut_3_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (stackIn_4_0 <= ue.field_c[rj.field_h]) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var2_int = ue.field_c[rj.field_h];
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var3 = sh.b(-126, 640);
                        var4 = -64 + fi.field_e.field_f + sh.b(-127, 128);
                        var5 = null;
                        var7 = var2_int;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if ((var7 ^ -1) == -1) {
                            statePc = 101;
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
                        if (3 != var7) {
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
                        if (var12 == 0) {
                            statePc = 101;
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
                        if (-11 != (var7 ^ -1)) {
                            statePc = 24;
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
                        if (var12 == 0) {
                            statePc = 105;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (var7 != 1) {
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
                        if (var12 == 0) {
                            statePc = 112;
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
                        if (11 == var7) {
                            statePc = 112;
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
                        if (var7 != 5) {
                            statePc = 39;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (var12 == 0) {
                            statePc = 112;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (2 != var7) {
                            statePc = 45;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (var12 == 0) {
                            statePc = 125;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 47;
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
                        if (var7 != 9) {
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
                        if (var12 == 0) {
                            statePc = 125;
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
                        if ((var7 ^ -1) == -5) {
                            statePc = 137;
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
                        if ((var7 ^ -1) != -16) {
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
                        if (var12 == 0) {
                            statePc = 137;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (-7 != (var7 ^ -1)) {
                            statePc = 66;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (var12 == 0) {
                            statePc = 145;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (19 == var7) {
                            statePc = 145;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (7 == var7) {
                            statePc = 153;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if ((var7 ^ -1) == -9) {
                            statePc = 156;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if ((var7 ^ -1) == -15) {
                            statePc = 156;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if (var7 == 12) {
                            statePc = 168;
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
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        if ((var7 ^ -1) != -17) {
                            statePc = 87;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        if (var12 == 0) {
                            statePc = 168;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        if (13 == var7) {
                            statePc = 171;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        if ((var7 ^ -1) == -18) {
                            statePc = 173;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        if (18 == var7) {
                            statePc = 183;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        if (20 == var7) {
                            statePc = 195;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        statePc = 196;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        nf.field_e = 0;
                        var7 = -8;
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        if ((var7 ^ -1) <= -9) {
                            statePc = 104;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        kh.field_y.b(88, (rf) (Object) new bf(320 - -(var7 * 24), -Math.abs(-64 + var7 * 64), 24 * var7 + 320, 1));
                        var7++;
                        if (var12 == 0) {
                            statePc = 102;
                        } else {
                            statePc = 104;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        if (var12 == 0) {
                            statePc = 196;
                        } else {
                            statePc = 105;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        nf.field_e = 0;
                        var7 = -64;
                        if (sh.b(-126, 2) == 0) {
                            statePc = 107;
                        } else {
                            statePc = 106;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        var9 = -24;
                        var8 = 560;
                        if (var12 == 0) {
                            statePc = 108;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        var8 = 80;
                        var9 = 24;
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        var10 = -10;
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        if (10 < var10) {
                            statePc = 111;
                        } else {
                            statePc = 110;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        var11 = new bf(var8, var7, 640 - var8, 17);
                        var7 -= 16;
                        var11.field_p = true;
                        var8 = var8 + var9;
                        kh.field_y.b(107, (rf) (Object) var11);
                        var10++;
                        if (var12 == 0) {
                            statePc = 109;
                        } else {
                            statePc = 111;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        if (var12 == 0) {
                            statePc = 196;
                        } else {
                            statePc = 112;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        nf.field_e = 0;
                        var4 = var3 - -sh.b(-24, 128) - 64;
                        var7 = 0;
                        statePc = 113;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        stackOut_113_0 = var7 ^ -1;
                        stackIn_118_0 = stackOut_113_0;
                        stackIn_114_0 = stackOut_113_0;
                        if (nf.field_l == 2) {
                            statePc = 118;
                        } else {
                            statePc = 114;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        stackOut_114_0 = stackIn_114_0;
                        stackOut_114_1 = 5;
                        stackIn_115_0 = stackOut_114_0;
                        stackIn_115_1 = stackOut_114_1;
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        stackOut_115_0 = stackIn_115_0;
                        stackOut_115_1 = stackIn_115_1;
                        stackIn_120_0 = stackOut_115_0;
                        stackIn_120_1 = stackOut_115_1;
                        stackIn_116_0 = stackOut_115_0;
                        stackIn_116_1 = stackOut_115_1;
                        if (var12 != 0) {
                            statePc = 120;
                        } else {
                            statePc = 116;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        stackOut_116_0 = stackIn_116_0;
                        stackOut_116_1 = stackIn_116_1;
                        stackIn_119_0 = stackOut_116_0;
                        stackIn_119_1 = stackOut_116_1;
                        statePc = 119;
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        stackOut_118_0 = stackIn_118_0;
                        stackOut_118_1 = 10;
                        stackIn_119_0 = stackOut_118_0;
                        stackIn_119_1 = stackOut_118_1;
                        statePc = 119;
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        stackOut_119_0 = stackIn_119_0;
                        stackOut_119_1 = stackIn_119_1 ^ -1;
                        stackIn_120_0 = stackOut_119_0;
                        stackIn_120_1 = stackOut_119_1;
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        if (stackIn_120_0 <= stackIn_120_1) {
                            statePc = 124;
                        } else {
                            statePc = 121;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        var8_ref = new bf(var3, -64 + 64 * -var7, var4, 2);
                        var8_ref.field_h = var5;
                        kh.field_y.b(115, (rf) (Object) var8_ref);
                        if (var7 != 0) {
                            statePc = 123;
                        } else {
                            statePc = 122;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        var5 = var8_ref;
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        var7++;
                        if (var12 == 0) {
                            statePc = 113;
                        } else {
                            statePc = 124;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        statePc = 196;
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        nf.field_e = 175;
                        var7 = 0;
                        statePc = 126;
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        stackOut_126_0 = var7;
                        stackIn_131_0 = stackOut_126_0;
                        stackIn_127_0 = stackOut_126_0;
                        if (2 != nf.field_l) {
                            statePc = 131;
                        } else {
                            statePc = 127;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        stackOut_127_0 = stackIn_127_0;
                        stackOut_127_1 = 10;
                        stackIn_128_0 = stackOut_127_0;
                        stackIn_128_1 = stackOut_127_1;
                        statePc = 128;
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        stackOut_128_0 = stackIn_128_0;
                        stackOut_128_1 = stackIn_128_1;
                        stackIn_132_0 = stackOut_128_0;
                        stackIn_132_1 = stackOut_128_1;
                        stackIn_129_0 = stackOut_128_0;
                        stackIn_129_1 = stackOut_128_1;
                        if (var12 != 0) {
                            statePc = 132;
                        } else {
                            statePc = 129;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 130;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        stackOut_129_0 = stackIn_129_0;
                        stackOut_129_1 = stackIn_129_1;
                        stackIn_132_0 = stackOut_129_0;
                        stackIn_132_1 = stackOut_129_1;
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 130;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        stackOut_131_0 = stackIn_131_0;
                        stackOut_131_1 = 5;
                        stackIn_132_0 = stackOut_131_0;
                        stackIn_132_1 = stackOut_131_1;
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        if (stackIn_132_0 >= stackIn_132_1) {
                            statePc = 136;
                        } else {
                            statePc = 133;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        kh.field_y.b(63, (rf) (Object) new bf(var3, -64 + 64 * -var7, var4, 4));
                        var7++;
                        if (var12 == 0) {
                            statePc = 126;
                        } else {
                            statePc = 134;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        statePc = 136;
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        if (var12 == 0) {
                            statePc = 196;
                        } else {
                            statePc = 137;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        nf.field_e = 0;
                        var7 = 0;
                        statePc = 138;
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        if (5 <= var7) {
                            statePc = 143;
                        } else {
                            statePc = 139;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        kh.field_y.b(81, (rf) (Object) new bf(var3, -64 + -var7 * 64, var4, 1));
                        var7++;
                        if (var12 != 0) {
                            statePc = 144;
                        } else {
                            statePc = 140;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        if (var12 == 0) {
                            statePc = 138;
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
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        kh.field_y.b(57, (rf) (Object) new bf(640 - var3, -64, -var4 + 640, 3));
                        statePc = 144;
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        if (var12 == 0) {
                            statePc = 196;
                        } else {
                            statePc = 145;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        nf.field_e = 0;
                        var7 = 0;
                        statePc = 146;
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        if (5 <= var7) {
                            statePc = 151;
                        } else {
                            statePc = 147;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        kh.field_y.b(117, (rf) (Object) new bf(var3, -64 + -var7 * 64, var4, 1));
                        var7++;
                        if (var12 != 0) {
                            statePc = 152;
                        } else {
                            statePc = 148;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        if (var12 == 0) {
                            statePc = 146;
                        } else {
                            statePc = 149;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        statePc = 151;
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_150) {
                        caughtException = stateCaught_150;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        kh.field_y.b(122, (rf) (Object) new bf(-var3 + 640, -64, -var3 + 640, 21));
                        statePc = 152;
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        if (var12 == 0) {
                            statePc = 196;
                        } else {
                            statePc = 153;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 155;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        nf.field_e = 0;
                        kh.field_y.b(73, (rf) (Object) new bf(var3, -64, var4, 3));
                        kh.field_y.b(64, (rf) (Object) new bf(640 + -var3, -64, 640 + -var3, 21));
                        if (var12 == 0) {
                            statePc = 196;
                        } else {
                            statePc = 154;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 155;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        statePc = 156;
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        nf.field_e = 0;
                        var7 = 0;
                        if ((sh.b(62, 2) ^ -1) != -1) {
                            statePc = 158;
                        } else {
                            statePc = 157;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        var8 = 80;
                        var9 = 24;
                        if (var12 == 0) {
                            statePc = 159;
                        } else {
                            statePc = 158;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 158: {
                    try {
                        var9 = -24;
                        var8 = 560;
                        statePc = 159;
                        continue stateLoop;
                    } catch (Throwable stateCaught_158) {
                        caughtException = stateCaught_158;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 159: {
                    try {
                        var10 = -10;
                        statePc = 160;
                        continue stateLoop;
                    } catch (Throwable stateCaught_159) {
                        caughtException = stateCaught_159;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 160: {
                    try {
                        if ((var10 ^ -1) < -11) {
                            statePc = 166;
                        } else {
                            statePc = 161;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_160) {
                        caughtException = stateCaught_160;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 161: {
                    try {
                        var11 = new bf(var8, var7, 640 + -var8, 17);
                        var7 -= 16;
                        var11.field_p = true;
                        var8 = var8 + var9;
                        statePc = 162;
                        continue stateLoop;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 162: {
                    try {
                        kh.field_y.b(100, (rf) (Object) var11);
                        var10++;
                        if (var12 != 0) {
                            statePc = 167;
                        } else {
                            statePc = 163;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_162) {
                        caughtException = stateCaught_162;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 163: {
                    try {
                        if (var12 == 0) {
                            statePc = 160;
                        } else {
                            statePc = 164;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 164: {
                    try {
                        statePc = 166;
                        continue stateLoop;
                    } catch (Throwable stateCaught_164) {
                        caughtException = stateCaught_164;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 165: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 166: {
                    try {
                        var8 = 64 + sh.b(100, 512);
                        kh.field_y.b(95, (rf) (Object) new bf(var8, -96, var8, 21));
                        statePc = 167;
                        continue stateLoop;
                    } catch (Throwable stateCaught_166) {
                        caughtException = stateCaught_166;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 167: {
                    try {
                        if (var12 == 0) {
                            statePc = 196;
                        } else {
                            statePc = 168;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_167) {
                        caughtException = stateCaught_167;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 168: {
                    try {
                        nf.field_e = 100;
                        kh.field_y.b(75, (rf) (Object) new bf(var3, -64, -64 + sh.b(-1, 128), 5));
                        if (var12 == 0) {
                            statePc = 196;
                        } else {
                            statePc = 169;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_168) {
                        caughtException = stateCaught_168;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 169: {
                    try {
                        statePc = 171;
                        continue stateLoop;
                    } catch (Throwable stateCaught_169) {
                        caughtException = stateCaught_169;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 170: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_170) {
                        caughtException = stateCaught_170;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 171: {
                    try {
                        nf.field_e = -50;
                        var7 = sh.b(-126, 180) + 32;
                        kh.field_y.b(74, (rf) (Object) new bf(var7, -64, var7, 12));
                        var7 = 608 + -sh.b(-128, 180);
                        statePc = 172;
                        continue stateLoop;
                    } catch (Throwable stateCaught_171) {
                        caughtException = stateCaught_171;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 172: {
                    try {
                        kh.field_y.b(56, (rf) (Object) new bf(var7, -64, var7, 12));
                        if (var12 == 0) {
                            statePc = 196;
                        } else {
                            statePc = 173;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_172) {
                        caughtException = stateCaught_172;
                        statePc = 175;
                        continue stateLoop;
                    }
                }
                case 173: {
                    try {
                        nf.field_e = -50;
                        kh.field_y.b(82, (rf) (Object) new bf(32, -64, 32, 21));
                        if (-1 == (sh.b(34, 2) ^ -1)) {
                            statePc = 179;
                        } else {
                            statePc = 174;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_173) {
                        caughtException = stateCaught_173;
                        statePc = 178;
                        continue stateLoop;
                    }
                }
                case 174: {
                    try {
                        statePc = 176;
                        continue stateLoop;
                    } catch (Throwable stateCaught_174) {
                        caughtException = stateCaught_174;
                        statePc = 178;
                        continue stateLoop;
                    }
                }
                case 175: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_175) {
                        caughtException = stateCaught_175;
                        statePc = 178;
                        continue stateLoop;
                    }
                }
                case 176: {
                    try {
                        kh.field_y.b(69, (rf) (Object) new bf(320, -96, 320, 21));
                        if (var12 == 0) {
                            statePc = 182;
                        } else {
                            statePc = 177;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_176) {
                        caughtException = stateCaught_176;
                        statePc = 181;
                        continue stateLoop;
                    }
                }
                case 177: {
                    try {
                        statePc = 179;
                        continue stateLoop;
                    } catch (Throwable stateCaught_177) {
                        caughtException = stateCaught_177;
                        statePc = 181;
                        continue stateLoop;
                    }
                }
                case 178: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_178) {
                        caughtException = stateCaught_178;
                        statePc = 181;
                        continue stateLoop;
                    }
                }
                case 179: {
                    try {
                        kh.field_y.b(91, (rf) (Object) new bf(320, -32, 320, 18));
                        kh.field_y.b(67, (rf) (Object) new bf(320, -96, 320, 18));
                        kh.field_y.b(79, (rf) (Object) new bf(320, -160, 320, 18));
                        statePc = 180;
                        continue stateLoop;
                    } catch (Throwable stateCaught_179) {
                        caughtException = stateCaught_179;
                        statePc = 181;
                        continue stateLoop;
                    }
                }
                case 180: {
                    try {
                        statePc = 182;
                        continue stateLoop;
                    } catch (Throwable stateCaught_180) {
                        caughtException = stateCaught_180;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 181: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_181) {
                        caughtException = stateCaught_181;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 182: {
                    try {
                        kh.field_y.b(106, (rf) (Object) new bf(608, -64, 608, 21));
                        if (var12 == 0) {
                            statePc = 196;
                        } else {
                            statePc = 183;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_182) {
                        caughtException = stateCaught_182;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 183: {
                    try {
                        nf.field_e = 150;
                        kh.field_y.b(76, (rf) (Object) new bf(var3, -64, var4, 3));
                        var7 = 0;
                        statePc = 184;
                        continue stateLoop;
                    } catch (Throwable stateCaught_183) {
                        caughtException = stateCaught_183;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 184: {
                    try {
                        if (2 == nf.field_l) {
                            statePc = 189;
                        } else {
                            statePc = 185;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_184) {
                        caughtException = stateCaught_184;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 185: {
                    try {
                        stackOut_185_0 = 1;
                        stackIn_186_0 = stackOut_185_0;
                        statePc = 186;
                        continue stateLoop;
                    } catch (Throwable stateCaught_185) {
                        caughtException = stateCaught_185;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 186: {
                    try {
                        stackOut_186_0 = stackIn_186_0;
                        stackIn_190_0 = stackOut_186_0;
                        stackIn_187_0 = stackOut_186_0;
                        if (var12 != 0) {
                            statePc = 190;
                        } else {
                            statePc = 187;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_186) {
                        caughtException = stateCaught_186;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 187: {
                    try {
                        stackOut_187_0 = stackIn_187_0;
                        stackIn_190_0 = stackOut_187_0;
                        statePc = 190;
                        continue stateLoop;
                    } catch (Throwable stateCaught_187) {
                        caughtException = stateCaught_187;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 188: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_188) {
                        caughtException = stateCaught_188;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 189: {
                    try {
                        stackOut_189_0 = 2;
                        stackIn_190_0 = stackOut_189_0;
                        statePc = 190;
                        continue stateLoop;
                    } catch (Throwable stateCaught_189) {
                        caughtException = stateCaught_189;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 190: {
                    try {
                        if (stackIn_190_0 <= var7) {
                            statePc = 194;
                        } else {
                            statePc = 191;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_190) {
                        caughtException = stateCaught_190;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 191: {
                    try {
                        kh.field_y.b(112, (rf) (Object) new bf(320, 64 * -var7 - 128, 320, 3));
                        var7++;
                        if (var12 == 0) {
                            statePc = 184;
                        } else {
                            statePc = 192;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_191) {
                        caughtException = stateCaught_191;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 192: {
                    try {
                        statePc = 194;
                        continue stateLoop;
                    } catch (Throwable stateCaught_192) {
                        caughtException = stateCaught_192;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 193: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_193) {
                        caughtException = stateCaught_193;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 194: {
                    try {
                        kh.field_y.b(107, (rf) (Object) new bf(-var3 + 640, -64, 640 - var4, 3));
                        if (var12 == 0) {
                            statePc = 196;
                        } else {
                            statePc = 195;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_194) {
                        caughtException = stateCaught_194;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 195: {
                    try {
                        var6 = new bf(320, -256, var4, 16);
                        kh.field_y.b(88, (rf) (Object) var6);
                        tj.field_C = var6.field_k;
                        ua.field_c = 1 + ue.field_c[rj.field_h];
                        pf.field_d = pf.field_d + 1;
                        dg.field_l = 0;
                        mj.a(255, 12, 0, 41, 100);
                        ti.field_f.a((oa) (Object) kc.field_P);
                        kc.field_P.f();
                        kc.field_P = fl.field_h;
                        ti.field_f.b((oa) (Object) kc.field_P);
                        kc.field_P.a(mc.field_b);
                        statePc = 196;
                        continue stateLoop;
                    } catch (Throwable stateCaught_195) {
                        caughtException = stateCaught_195;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 196: {
                    try {
                        if (param0 >= 79) {
                            statePc = 202;
                        } else {
                            statePc = 197;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_196) {
                        caughtException = stateCaught_196;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 197: {
                    try {
                        this.o(112);
                        statePc = 198;
                        continue stateLoop;
                    } catch (Throwable stateCaught_197) {
                        caughtException = stateCaught_197;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 198: {
                    try {
                        statePc = 202;
                        continue stateLoop;
                    } catch (Throwable stateCaught_198) {
                        caughtException = stateCaught_198;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 199: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_199) {
                        caughtException = stateCaught_199;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 201: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw sd.a((Throwable) (Object) var2, "StarCannon.S(" + param0 + 41);
                }
                case 202: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = new int[8192];
        field_C = "Menu";
        field_z = -2;
    }
}
