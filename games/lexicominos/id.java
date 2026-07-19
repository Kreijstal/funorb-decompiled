/*
 * Decompiled by CFR-JS 0.4.0.
 */
class id extends ik {
    static oj[] field_w;
    static int field_v;
    static String field_u;
    static String field_t;

    id(le param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_E, -1, 2147483647, false);
    }

    id(int param0) {
        this(ql.field_Q, param0);
    }

    public final void a(int param0, int param1, boolean param2, w param3, int param4) {
        try {
            if (!(!param2)) {
                ae.a(true, param3.field_j, param3.field_o + param0, param3.field_v, param1 - -param3.field_t);
            }
            super.a(param0, param1, param2, param3, param4);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "id.A(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final static void a(int param0, boolean param1, byte param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        String[] var5_ref_String__ = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String[] var11 = null;
        String var12 = null;
        String var13 = null;
        boolean stackIn_20_0 = false;
        int stackIn_25_0 = 0;
        boolean stackIn_30_0 = false;
        int stackIn_36_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_44_0 = 0;
        String[] stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        int stackIn_53_2 = 0;
        String[] stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        String[] stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        String[] stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        String stackIn_56_2 = null;
        String[] stackIn_58_0 = null;
        int stackIn_58_1 = 0;
        int stackIn_58_2 = 0;
        String[] stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        String[] stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        String[] stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        String[] stackIn_64_0 = null;
        int stackIn_64_1 = 0;
        String stackIn_64_2 = null;
        String[] stackIn_128_0 = null;
        String stackIn_129_0 = null;
        String stackIn_130_0 = null;
        String stackIn_131_0 = null;
        int stackIn_131_1 = 0;
        String[] stackIn_138_0 = null;
        int stackIn_141_0 = 0;
        int stackIn_141_1 = 0;
        int stackIn_146_0 = 0;
        int stackIn_146_1 = 0;
        int stackIn_148_0 = 0;
        int stackIn_148_1 = 0;
        int stackIn_152_0 = 0;
        int stackIn_152_1 = 0;
        int stackIn_155_0 = 0;
        int stackIn_155_1 = 0;
        int stackIn_156_0 = 0;
        int stackIn_157_0 = 0;
        int stackIn_158_0 = 0;
        int stackIn_158_1 = 0;
        int stackIn_160_0 = 0;
        int stackIn_160_1 = 0;
        int stackIn_163_0 = 0;
        int stackIn_163_1 = 0;
        String[] stackIn_165_0 = null;
        int stackIn_165_1 = 0;
        int stackIn_169_0 = 0;
        int stackIn_169_1 = 0;
        Throwable caughtException = null;
        boolean stackOut_19_0 = false;
        int stackOut_24_0 = 0;
        boolean stackOut_29_0 = false;
        int stackOut_35_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_43_0 = 0;
        String[] stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        int stackOut_52_2 = 0;
        String[] stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        String[] stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        String stackOut_54_2 = null;
        String[] stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        String stackOut_55_2 = null;
        String[] stackOut_57_0 = null;
        int stackOut_57_1 = 0;
        int stackOut_57_2 = 0;
        String[] stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        String[] stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        String[] stackOut_62_0 = null;
        int stackOut_62_1 = 0;
        String stackOut_62_2 = null;
        String[] stackOut_63_0 = null;
        int stackOut_63_1 = 0;
        String stackOut_63_2 = null;
        String[] stackOut_127_0 = null;
        String stackOut_128_0 = null;
        String stackOut_129_0 = null;
        int stackOut_129_1 = 0;
        String stackOut_130_0 = null;
        int stackOut_130_1 = 0;
        String[] stackOut_137_0 = null;
        int stackOut_140_0 = 0;
        int stackOut_140_1 = 0;
        int stackOut_145_0 = 0;
        int stackOut_145_1 = 0;
        int stackOut_147_0 = 0;
        int stackOut_147_1 = 0;
        int stackOut_151_0 = 0;
        int stackOut_151_1 = 0;
        int stackOut_154_0 = 0;
        int stackOut_154_1 = 0;
        int stackOut_155_0 = 0;
        int stackOut_156_0 = 0;
        int stackOut_156_1 = 0;
        int stackOut_157_0 = 0;
        int stackOut_157_1 = 0;
        int stackOut_159_0 = 0;
        int stackOut_159_1 = 0;
        int stackOut_162_0 = 0;
        int stackOut_162_1 = 0;
        String[] stackOut_164_0 = null;
        int stackOut_164_1 = 0;
        int stackOut_168_0 = 0;
        int stackOut_168_1 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    sh.field_a = param0;
                    sc.field_e = true;
                    if (sh.field_a == 0) {
                        statePc = 112;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (-2 != (sh.field_a ^ -1)) {
                        statePc = 16;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var3_int = cg.a(ug.field_r, pb.field_i, (byte) 91, pc.field_m, nb.field_x);
                    var4 = var3_int + 2;
                    ni.field_a = new int[var4];
                    ee.field_g = new String[var4];
                    var5 = 0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if ((var5 ^ -1) <= (var4 ^ -1)) {
                        statePc = 8;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    ni.field_a[var5] = -1;
                    var5++;
                    if (var10 != 0) {
                        statePc = 9;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (var10 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    ik.field_g = new int[1];
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    var5 = 0;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if (var3_int <= var5) {
                        statePc = 14;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    ee.field_g[var5] = ug.field_r[var5];
                    var5++;
                    if (var10 != 0) {
                        statePc = 15;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (var10 == 0) {
                        statePc = 10;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    ee.field_g[-2 + var4] = "";
                    ee.field_g[-1 + var4] = vk.field_d;
                    ni.field_a[-1 + var4] = 0;
                    ik.field_g[0] = 5;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if (var10 == 0) {
                        statePc = 125;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (-3 != (sh.field_a ^ -1)) {
                        statePc = 66;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var3_int = cg.a(ug.field_r, pb.field_i, (byte) 91, da.a(new String[]{"<br><%0><br>"}, pl.field_a, false), nb.field_x);
                    var4 = -1;
                    var5 = 0;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    if (var5 >= var3_int) {
                        statePc = 24;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    stackOut_19_0 = "<%0>".equals(ug.field_r[var5]);
                    stackIn_25_0 = stackOut_19_0 ? 1 : 0;
                    stackIn_20_0 = stackOut_19_0;
                    if (var10 != 0) {
                        statePc = 25;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (!stackIn_20_0) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    var4 = var5;
                    if (var10 == 0) {
                        statePc = 24;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    var5++;
                    if (var10 == 0) {
                        statePc = 18;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    stackOut_24_0 = 0;
                    stackIn_25_0 = stackOut_24_0;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    if (stackIn_25_0 != (var4 ^ -1)) {
                        statePc = 27;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    throw new IllegalStateException();
                }
                case 27: {
                    ed.field_t = new String[var4];
                    o.a(ug.field_r, 0, ed.field_t, 0, var4);
                    qc.field_e = new String[-1 + (-var4 + var3_int)];
                    o.a(ug.field_r, 1 + var4, qc.field_e, 0, -1 + var3_int + -var4);
                    var4 = -1;
                    var3_int = cg.a(ug.field_r, pb.field_i, (byte) 91, da.a(new String[]{"<br><%0><br>"}, mg.field_z, false), nb.field_x);
                    var5 = 0;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    if ((var5 ^ -1) <= (var3_int ^ -1)) {
                        statePc = 35;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    stackOut_29_0 = "<%0>".equals(ug.field_r[var5]);
                    stackIn_36_0 = stackOut_29_0 ? 1 : 0;
                    stackIn_30_0 = stackOut_29_0;
                    if (var10 != 0) {
                        statePc = 36;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if (stackIn_30_0) {
                        statePc = 32;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 32: {
                    var4 = var5;
                    if (var10 == 0) {
                        statePc = 35;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    var5++;
                    if (var10 == 0) {
                        statePc = 28;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    stackOut_35_0 = -1;
                    stackIn_36_0 = stackOut_35_0;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    if (stackIn_36_0 != var4) {
                        statePc = 38;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    throw new IllegalStateException();
                }
                case 38: {
                    hf.field_b = new String[var4];
                    o.a(ug.field_r, 0, hf.field_b, 0, var4);
                    nl.field_a = new String[-1 + (-var4 + var3_int)];
                    o.a(ug.field_r, 1 + var4, nl.field_a, 0, -1 + var3_int - var4);
                    if ((ed.field_t.length ^ -1) <= (hf.field_b.length ^ -1)) {
                        statePc = 40;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    stackOut_39_0 = hf.field_b.length;
                    stackIn_41_0 = stackOut_39_0;
                    statePc = 41;
                    continue stateLoop;
                }
                case 40: {
                    stackOut_40_0 = ed.field_t.length;
                    stackIn_41_0 = stackOut_40_0;
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    var5 = stackIn_41_0;
                    if (qc.field_e.length >= nl.field_a.length) {
                        statePc = 43;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    stackOut_42_0 = nl.field_a.length;
                    stackIn_44_0 = stackOut_42_0;
                    statePc = 44;
                    continue stateLoop;
                }
                case 43: {
                    stackOut_43_0 = qc.field_e.length;
                    stackIn_44_0 = stackOut_43_0;
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    var6 = stackIn_44_0;
                    var7 = var6 + 7 - -var5;
                    ni.field_a = new int[var7];
                    ee.field_g = new String[var7];
                    var8 = 0;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    if (var7 <= var8) {
                        statePc = 49;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    ni.field_a[var8] = -1;
                    var8++;
                    if (var10 != 0) {
                        statePc = 50;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if (var10 == 0) {
                        statePc = 45;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    ee.field_g[1] = pf.field_l;
                    ee.field_g[0] = n.field_c;
                    ik.field_g = new int[2];
                    ni.field_a[1] = 0;
                    ik.field_g[1] = 2;
                    ee.field_g[5] = "";
                    ee.field_g[3] = pa.field_c;
                    ik.field_g[0] = 5;
                    ee.field_g[4] = sb.field_b;
                    ni.field_a[3] = 1;
                    ee.field_g[2] = eg.field_F;
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    var8 = 0;
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    if (var5 <= var8) {
                        statePc = 57;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    stackOut_52_0 = ee.field_g;
                    stackOut_52_1 = 6 + var8;
                    stackOut_52_2 = -var5 + var8 - -hf.field_b.length;
                    stackIn_58_0 = stackOut_52_0;
                    stackIn_58_1 = stackOut_52_1;
                    stackIn_58_2 = stackOut_52_2;
                    stackIn_53_0 = stackOut_52_0;
                    stackIn_53_1 = stackOut_52_1;
                    stackIn_53_2 = stackOut_52_2;
                    if (var10 != 0) {
                        statePc = 58;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    stackOut_53_0 = (String[]) ((Object) stackIn_53_0);
                    stackOut_53_1 = stackIn_53_1;
                    stackIn_55_0 = stackOut_53_0;
                    stackIn_55_1 = stackOut_53_1;
                    stackIn_54_0 = stackOut_53_0;
                    stackIn_54_1 = stackOut_53_1;
                    if (stackIn_53_2 < 0) {
                        statePc = 55;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    stackOut_54_0 = (String[]) ((Object) stackIn_54_0);
                    stackOut_54_1 = stackIn_54_1;
                    stackOut_54_2 = hf.field_b[var8 + (hf.field_b.length - var5)];
                    stackIn_56_0 = stackOut_54_0;
                    stackIn_56_1 = stackOut_54_1;
                    stackIn_56_2 = stackOut_54_2;
                    statePc = 56;
                    continue stateLoop;
                }
                case 55: {
                    stackOut_55_0 = (String[]) ((Object) stackIn_55_0);
                    stackOut_55_1 = stackIn_55_1;
                    stackOut_55_2 = "";
                    stackIn_56_0 = stackOut_55_0;
                    stackIn_56_1 = stackOut_55_1;
                    stackIn_56_2 = stackOut_55_2;
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    stackIn_56_0[stackIn_56_1] = stackIn_56_2;
                    var8++;
                    if (var10 == 0) {
                        statePc = 51;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    stackOut_57_0 = ee.field_g;
                    stackOut_57_1 = 6;
                    stackOut_57_2 = -var5;
                    stackIn_58_0 = stackOut_57_0;
                    stackIn_58_1 = stackOut_57_1;
                    stackIn_58_2 = stackOut_57_2;
                    statePc = 58;
                    continue stateLoop;
                }
                case 58: {
                    stackIn_58_0[stackIn_58_1 - stackIn_58_2] = null;
                    ni.field_a[6 - -var5] = -2;
                    var8 = 0;
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    if ((var6 ^ -1) >= (var8 ^ -1)) {
                        statePc = 65;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    stackOut_60_0 = ee.field_g;
                    stackOut_60_1 = var5 + (7 - -var8);
                    stackIn_165_0 = stackOut_60_0;
                    stackIn_165_1 = stackOut_60_1;
                    stackIn_61_0 = stackOut_60_0;
                    stackIn_61_1 = stackOut_60_1;
                    if (var10 != 0) {
                        statePc = 165;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    stackOut_61_0 = (String[]) ((Object) stackIn_61_0);
                    stackOut_61_1 = stackIn_61_1;
                    stackIn_63_0 = stackOut_61_0;
                    stackIn_63_1 = stackOut_61_1;
                    stackIn_62_0 = stackOut_61_0;
                    stackIn_62_1 = stackOut_61_1;
                    if ((var8 ^ -1) <= (nl.field_a.length ^ -1)) {
                        statePc = 63;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    stackOut_62_0 = (String[]) ((Object) stackIn_62_0);
                    stackOut_62_1 = stackIn_62_1;
                    stackOut_62_2 = nl.field_a[var8];
                    stackIn_64_0 = stackOut_62_0;
                    stackIn_64_1 = stackOut_62_1;
                    stackIn_64_2 = stackOut_62_2;
                    statePc = 64;
                    continue stateLoop;
                }
                case 63: {
                    stackOut_63_0 = (String[]) ((Object) stackIn_63_0);
                    stackOut_63_1 = stackIn_63_1;
                    stackOut_63_2 = "";
                    stackIn_64_0 = stackOut_63_0;
                    stackIn_64_1 = stackOut_63_1;
                    stackIn_64_2 = stackOut_63_2;
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    stackIn_64_0[stackIn_64_1] = stackIn_64_2;
                    var8++;
                    if (var10 == 0) {
                        statePc = 59;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    ug.field_x = rf.c(0);
                    if (var10 == 0) {
                        statePc = 125;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    if (sh.field_a == 3) {
                        statePc = 96;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    if ((sh.field_a ^ -1) == -5) {
                        statePc = 83;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    if (sh.field_a != 5) {
                        statePc = 82;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    var3_int = cg.a(ug.field_r, pb.field_i, (byte) 91, qj.field_db, nb.field_x);
                    var4 = 3 - -var3_int;
                    ni.field_a = new int[var4];
                    ee.field_g = new String[var4];
                    var5 = 0;
                    statePc = 70;
                    continue stateLoop;
                }
                case 70: {
                    if ((var4 ^ -1) >= (var5 ^ -1)) {
                        statePc = 74;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    ni.field_a[var5] = -1;
                    var5++;
                    if (var10 != 0) {
                        statePc = 75;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    if (var10 == 0) {
                        statePc = 70;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    ik.field_g = new int[2];
                    statePc = 75;
                    continue stateLoop;
                }
                case 75: {
                    var5 = 0;
                    statePc = 76;
                    continue stateLoop;
                }
                case 76: {
                    if (var5 >= var3_int) {
                        statePc = 80;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    ee.field_g[var5] = ug.field_r[var5];
                    var5++;
                    if (var10 != 0) {
                        statePc = 81;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    if (var10 == 0) {
                        statePc = 76;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    ee.field_g[-3 + var4] = "";
                    ee.field_g[var4 + -2] = hl.field_p;
                    ni.field_a[-2 + var4] = 0;
                    ik.field_g[0] = 3;
                    ee.field_g[var4 + -1] = vk.field_d;
                    ni.field_a[-1 + var4] = 1;
                    ik.field_g[1] = 5;
                    statePc = 81;
                    continue stateLoop;
                }
                case 81: {
                    if (var10 == 0) {
                        statePc = 125;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    throw new IllegalArgumentException();
                }
                case 83: {
                    var3_int = cg.a(ug.field_r, pb.field_i, (byte) 91, pj.field_B, nb.field_x);
                    var4 = var3_int + 2;
                    ni.field_a = new int[var4];
                    ee.field_g = new String[var4];
                    var5 = 0;
                    statePc = 84;
                    continue stateLoop;
                }
                case 84: {
                    if ((var5 ^ -1) <= (var4 ^ -1)) {
                        statePc = 88;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    ni.field_a[var5] = -1;
                    var5++;
                    if (var10 != 0) {
                        statePc = 89;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    if (var10 == 0) {
                        statePc = 84;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    ik.field_g = new int[1];
                    statePc = 89;
                    continue stateLoop;
                }
                case 89: {
                    var5 = 0;
                    statePc = 90;
                    continue stateLoop;
                }
                case 90: {
                    if (var3_int <= var5) {
                        statePc = 94;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    ee.field_g[var5] = ug.field_r[var5];
                    var5++;
                    if (var10 != 0) {
                        statePc = 95;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    if (var10 == 0) {
                        statePc = 90;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    ee.field_g[-2 + var4] = "";
                    ee.field_g[var4 + -1] = vk.field_d;
                    ni.field_a[var4 - 1] = 0;
                    ik.field_g[0] = 5;
                    statePc = 95;
                    continue stateLoop;
                }
                case 95: {
                    if (var10 == 0) {
                        statePc = 125;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    if (jh.field_a.field_e) {
                        statePc = 98;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    var3_int = cg.a(ug.field_r, pb.field_i, (byte) 91, lb.field_a, nb.field_x);
                    if (var10 == 0) {
                        statePc = 99;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    var3_int = cg.a(ug.field_r, pb.field_i, (byte) 91, qb.field_m, nb.field_x);
                    statePc = 99;
                    continue stateLoop;
                }
                case 99: {
                    var4 = var3_int + 2;
                    ni.field_a = new int[var4];
                    ee.field_g = new String[var4];
                    var5 = 0;
                    statePc = 100;
                    continue stateLoop;
                }
                case 100: {
                    if ((var5 ^ -1) <= (var4 ^ -1)) {
                        statePc = 104;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    ni.field_a[var5] = -1;
                    var5++;
                    if (var10 != 0) {
                        statePc = 105;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    if (var10 == 0) {
                        statePc = 100;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    ik.field_g = new int[1];
                    statePc = 105;
                    continue stateLoop;
                }
                case 105: {
                    var5 = 0;
                    statePc = 106;
                    continue stateLoop;
                }
                case 106: {
                    if (var5 >= var3_int) {
                        statePc = 110;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    ee.field_g[var5] = ug.field_r[var5];
                    var5++;
                    if (var10 != 0) {
                        statePc = 111;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    if (var10 == 0) {
                        statePc = 106;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    ee.field_g[-2 + var4] = "";
                    ee.field_g[-1 + var4] = vk.field_d;
                    ni.field_a[var4 - 1] = 0;
                    ik.field_g[0] = 5;
                    statePc = 111;
                    continue stateLoop;
                }
                case 111: {
                    if (var10 == 0) {
                        statePc = 125;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 112: {
                    var3_int = cg.a(ug.field_r, pb.field_i, (byte) 91, pc.field_m, nb.field_x);
                    var4 = 3 - -var3_int;
                    ni.field_a = new int[var4];
                    ee.field_g = new String[var4];
                    var5 = 0;
                    statePc = 113;
                    continue stateLoop;
                }
                case 113: {
                    if ((var5 ^ -1) <= (var4 ^ -1)) {
                        statePc = 117;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    ni.field_a[var5] = -1;
                    var5++;
                    if (var10 != 0) {
                        statePc = 118;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    if (var10 == 0) {
                        statePc = 113;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 117: {
                    ik.field_g = new int[2];
                    statePc = 118;
                    continue stateLoop;
                }
                case 118: {
                    var5 = 0;
                    statePc = 119;
                    continue stateLoop;
                }
                case 119: {
                    if ((var5 ^ -1) <= (var3_int ^ -1)) {
                        statePc = 123;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    ee.field_g[var5] = ug.field_r[var5];
                    var5++;
                    if (var10 != 0) {
                        statePc = 124;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 121: {
                    if (var10 == 0) {
                        statePc = 119;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    ee.field_g[var4 + -3] = "";
                    ee.field_g[-2 + var4] = l.field_E;
                    ni.field_a[-2 + var4] = 0;
                    ik.field_g[0] = 4;
                    ee.field_g[var4 + -1] = vk.field_d;
                    ni.field_a[-1 + var4] = 1;
                    statePc = 124;
                    continue stateLoop;
                }
                case 124: {
                    ik.field_g[1] = 5;
                    statePc = 125;
                    continue stateLoop;
                }
                case 125: {
                    bc.field_H.field_h = ik.field_g.length;
                    var3_int = 0;
                    var4 = 114 / ((81 - param2) / 34);
                    var5 = 0;
                    statePc = 126;
                    continue stateLoop;
                }
                case 126: {
                    if ((var5 ^ -1) <= (ee.field_g.length ^ -1)) {
                        statePc = 135;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 127: {
                    stackOut_127_0 = ee.field_g;
                    stackIn_138_0 = stackOut_127_0;
                    stackIn_128_0 = stackOut_127_0;
                    if (var10 != 0) {
                        statePc = 138;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    stackOut_128_0 = stackIn_128_0[var5];
                    stackIn_130_0 = stackOut_128_0;
                    stackIn_129_0 = stackOut_128_0;
                    if (-1 < (ni.field_a[var5] ^ -1)) {
                        statePc = 130;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    stackOut_129_0 = (String) ((Object) stackIn_129_0);
                    stackOut_129_1 = 1;
                    stackIn_131_0 = stackOut_129_0;
                    stackIn_131_1 = stackOut_129_1;
                    statePc = 131;
                    continue stateLoop;
                }
                case 130: {
                    stackOut_130_0 = (String) ((Object) stackIn_130_0);
                    stackOut_130_1 = 0;
                    stackIn_131_0 = stackOut_130_0;
                    stackIn_131_1 = stackOut_130_1;
                    statePc = 131;
                    continue stateLoop;
                }
                case 131: {
                    var6 = ii.a(stackIn_131_0, stackIn_131_1 != 0, 0);
                    if ((var6 ^ -1) < (var3_int ^ -1)) {
                        statePc = 133;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 133: {
                    var3_int = var6;
                    statePc = 134;
                    continue stateLoop;
                }
                case 134: {
                    var5++;
                    if (var10 == 0) {
                        statePc = 126;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    if (sh.field_a == 2) {
                        statePc = 137;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 137: {
                    stackOut_137_0 = ed.field_t;
                    stackIn_138_0 = stackOut_137_0;
                    statePc = 138;
                    continue stateLoop;
                }
                case 138: {
                    var11 = stackIn_138_0;
                    var5_ref_String__ = var11;
                    var6 = 0;
                    statePc = 139;
                    continue stateLoop;
                }
                case 139: {
                    if ((var11.length ^ -1) >= (var6 ^ -1)) {
                        statePc = 144;
                    } else {
                        statePc = 140;
                    }
                    continue stateLoop;
                }
                case 140: {
                    var12 = var11[var6];
                    var8 = ii.a(var12, false, 0);
                    stackOut_140_0 = var8;
                    stackOut_140_1 = var3_int;
                    stackIn_146_0 = stackOut_140_0;
                    stackIn_146_1 = stackOut_140_1;
                    stackIn_141_0 = stackOut_140_0;
                    stackIn_141_1 = stackOut_140_1;
                    if (var10 != 0) {
                        statePc = 146;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 141: {
                    if (stackIn_141_0 <= stackIn_141_1) {
                        statePc = 143;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 142: {
                    var3_int = var8;
                    statePc = 143;
                    continue stateLoop;
                }
                case 143: {
                    var6++;
                    if (var10 == 0) {
                        statePc = 139;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    var5_ref_String__ = qc.field_e;
                    var6 = 0;
                    statePc = 145;
                    continue stateLoop;
                }
                case 145: {
                    stackOut_145_0 = var5_ref_String__.length ^ -1;
                    stackOut_145_1 = var6 ^ -1;
                    stackIn_146_0 = stackOut_145_0;
                    stackIn_146_1 = stackOut_145_1;
                    statePc = 146;
                    continue stateLoop;
                }
                case 146: {
                    if (stackIn_146_0 >= stackIn_146_1) {
                        statePc = 151;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    var13 = var5_ref_String__[var6];
                    var8 = ii.a(var13, false, 0);
                    stackOut_147_0 = var8;
                    stackOut_147_1 = var3_int;
                    stackIn_152_0 = stackOut_147_0;
                    stackIn_152_1 = stackOut_147_1;
                    stackIn_148_0 = stackOut_147_0;
                    stackIn_148_1 = stackOut_147_1;
                    if (var10 != 0) {
                        statePc = 152;
                    } else {
                        statePc = 148;
                    }
                    continue stateLoop;
                }
                case 148: {
                    if (stackIn_148_0 <= stackIn_148_1) {
                        statePc = 150;
                    } else {
                        statePc = 149;
                    }
                    continue stateLoop;
                }
                case 149: {
                    var3_int = var8;
                    statePc = 150;
                    continue stateLoop;
                }
                case 150: {
                    var6++;
                    if (var10 == 0) {
                        statePc = 145;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 151: {
                    me.field_v = -(var3_int >> 160953409) + uh.field_D;
                    gd.field_o = -(var3_int >> 1846636033) + uh.field_D - -var3_int;
                    stackOut_151_0 = oh.field_b + we.field_l << -1804445823;
                    stackOut_151_1 = bc.field_H.field_h;
                    stackIn_152_0 = stackOut_151_0;
                    stackIn_152_1 = stackOut_151_1;
                    statePc = 152;
                    continue stateLoop;
                }
                case 152: {
                    ph.field_b = stackIn_152_0 * stackIn_152_1;
                    var5 = 0;
                    statePc = 153;
                    continue stateLoop;
                }
                case 153: {
                    if ((var5 ^ -1) <= (ee.field_g.length ^ -1)) {
                        statePc = 159;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 154: {
                    stackOut_154_0 = ph.field_b;
                    stackOut_154_1 = ni.field_a[var5];
                    stackIn_160_0 = stackOut_154_0;
                    stackIn_160_1 = stackOut_154_1;
                    stackIn_155_0 = stackOut_154_0;
                    stackIn_155_1 = stackOut_154_1;
                    if (var10 != 0) {
                        statePc = 160;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 155: {
                    stackOut_155_0 = stackIn_155_0;
                    stackIn_157_0 = stackOut_155_0;
                    stackIn_156_0 = stackOut_155_0;
                    if (stackIn_155_1 < 0) {
                        statePc = 157;
                    } else {
                        statePc = 156;
                    }
                    continue stateLoop;
                }
                case 156: {
                    stackOut_156_0 = stackIn_156_0;
                    stackOut_156_1 = fb.field_g;
                    stackIn_158_0 = stackOut_156_0;
                    stackIn_158_1 = stackOut_156_1;
                    statePc = 158;
                    continue stateLoop;
                }
                case 157: {
                    stackOut_157_0 = stackIn_157_0;
                    stackOut_157_1 = hc.field_fb;
                    stackIn_158_0 = stackOut_157_0;
                    stackIn_158_1 = stackOut_157_1;
                    statePc = 158;
                    continue stateLoop;
                }
                case 158: {
                    ph.field_b = stackIn_158_0 + stackIn_158_1;
                    var5++;
                    if (var10 == 0) {
                        statePc = 153;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 159: {
                    stackOut_159_0 = ij.field_p;
                    stackOut_159_1 = ph.field_b >> -1073373023;
                    stackIn_160_0 = stackOut_159_0;
                    stackIn_160_1 = stackOut_159_1;
                    statePc = 160;
                    continue stateLoop;
                }
                case 160: {
                    rf.field_c = stackIn_160_0 - stackIn_160_1;
                    wd.field_a = new int[ee.field_g.length][];
                    var5 = 0;
                    var6 = rf.field_c;
                    statePc = 161;
                    continue stateLoop;
                }
                case 161: {
                    if (ee.field_g.length <= var5) {
                        statePc = 168;
                    } else {
                        statePc = 162;
                    }
                    continue stateLoop;
                }
                case 162: {
                    var7 = ni.field_a[var5];
                    stackOut_162_0 = var7 ^ -1;
                    stackOut_162_1 = -1;
                    stackIn_169_0 = stackOut_162_0;
                    stackIn_169_1 = stackOut_162_1;
                    stackIn_163_0 = stackOut_162_0;
                    stackIn_163_1 = stackOut_162_1;
                    if (var10 != 0) {
                        statePc = 169;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 163: {
                    if (stackIn_163_0 > stackIn_163_1) {
                        statePc = 166;
                    } else {
                        statePc = 164;
                    }
                    continue stateLoop;
                }
                case 164: {
                    stackOut_164_0 = ee.field_g;
                    stackOut_164_1 = var5;
                    stackIn_165_0 = stackOut_164_0;
                    stackIn_165_1 = stackOut_164_1;
                    statePc = 165;
                    continue stateLoop;
                }
                case 165: {
                    var8 = ii.a(stackIn_165_0[stackIn_165_1], true, 0);
                    var9 = -(var8 >> -449732159) + uh.field_D;
                    var6 = var6 + we.field_l;
                    wd.field_a[var5] = new int[4];
                    wd.field_a[var5][0] = -jh.field_e + var9;
                    wd.field_a[var5][1] = var6;
                    wd.field_a[var5][2] = (jh.field_e << 416478529) + var8;
                    var6 = var6 + (fb.field_g + we.field_l + (oh.field_b << 909045569));
                    wd.field_a[var5][3] = fb.field_g + (oh.field_b << -3921279);
                    if (var10 == 0) {
                        statePc = 167;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 166: {
                    var6 = var6 + hc.field_fb;
                    statePc = 167;
                    continue stateLoop;
                }
                case 167: {
                    var5++;
                    if (var10 == 0) {
                        statePc = 161;
                    } else {
                        statePc = 168;
                    }
                    continue stateLoop;
                }
                case 168: {
                    stackOut_168_0 = sh.field_a ^ -1;
                    stackOut_168_1 = -3;
                    stackIn_169_0 = stackOut_168_0;
                    stackIn_169_1 = stackOut_168_1;
                    statePc = 169;
                    continue stateLoop;
                }
                case 169: {
                    if (stackIn_169_0 == stackIn_169_1) {
                        statePc = 172;
                    } else {
                        statePc = 170;
                    }
                    continue stateLoop;
                }
                case 170: {
                    bc.field_H.a(0, param1, rc.a(bk.field_b, 29532, sh.field_e), 0);
                    if (var10 == 0) {
                        statePc = 175;
                    } else {
                        statePc = 172;
                    }
                    continue stateLoop;
                }
                case 172: {
                    bc.field_H.a(0, param1, -1, -1);
                    statePc = 175;
                    continue stateLoop;
                }
                case 175: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void c(byte param0) {
        if (param0 != 96) {
            field_w = (oj[]) null;
        }
        field_t = null;
        field_u = null;
        field_w = null;
    }

    static {
        field_u = "Please try again in a few minutes.";
        field_t = " <times>?";
    }
}
