/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ia extends wf {
    int field_p;
    int field_k;
    int field_m;
    static String field_l;
    int field_h;
    static String field_i;
    static int field_j;
    int field_g;
    int[] field_o;
    int field_n;

    final static void a(java.applet.Applet param0, int param1, String param2) {
        try {
            java.net.URL var3 = null;
            String var4 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            StringBuilder stackIn_11_1 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            Throwable decompiledCaughtException = null;
            Exception var3_ref = null;
            RuntimeException var3_ref2 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      if (param1 == 6) {
                        break L2;
                      } else {
                        var4 = (String) null;
                        ia.a((java.applet.Applet) null, 40, (String) null);
                        break L2;
                      }
                    }
                    var3 = new java.net.URL(param0.getCodeBase(), param2);
                    var3 = dh.a(param0, (byte) -118, var3);
                    ea.a((byte) 68, param0, true, var3.toString());
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var3_ref = (Exception) (Object) decompiledCaughtException;
                    var3_ref.printStackTrace();
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var3_ref2);

                stackIn_8_1 = new StringBuilder().append("ia.D(");

                if (param0 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L4;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L4;
                }
              }
              L5: {


                stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "null";
                  break L5;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "{...}";
                  break L5;
                }
              }
              throw ch.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int[] param7) {
        try {
            this.field_m = param2;
            this.field_o = param7;
            this.field_p = param1;
            if (param6 != 6) {
                ia.d(81);
            }
            this.field_g = param5;
            this.field_k = param3;
            this.field_n = param0;
            this.field_h = param4;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "ia.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ')');
        }
    }

    final static void d(int param0) {
        int fieldTemp$0 = 0;
        sj dupTemp$1 = null;
        sj dupTemp$2 = null;
        int stackIn_23_0 = 0;
        int stackIn_32_0 = 0;
        boolean stackIn_96_0 = false;
        int stackIn_100_0 = 0;
        int stackIn_119_0 = 0;
        j stackIn_162_0 = null;
        sj stackIn_163_0 = null;
        sj stackIn_164_0 = null;
        sj stackIn_165_0 = null;
        int stackIn_165_1 = 0;
        j stackIn_170_0 = null;
        sj stackIn_171_0 = null;
        sj stackIn_172_0 = null;
        sj stackIn_173_0 = null;
        int stackIn_173_1 = 0;
        j stackIn_175_0 = null;
        int stackIn_227_0 = 0;
        int stackIn_232_0 = 0;
        int stackIn_240_0 = 0;
        boolean stackIn_244_0 = false;
        sj stackIn_276_0 = null;
        sj stackIn_286_0 = null;
        sj stackIn_295_0 = null;
        sj stackIn_302_0 = null;
        int stackIn_312_0 = 0;
        sj stackIn_315_0 = null;
        sj stackIn_324_0 = null;
        sj stackIn_331_0 = null;
        Object stackIn_340_0 = null;
        sj stackIn_340_1 = null;
        boolean stackIn_356_0 = false;
        Object stackIn_368_0 = null;
        sj stackIn_368_1 = null;
        sj stackIn_414_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        boolean stackOut_95_0;
        int statePc = 0;
        int var1_int = 0;
        RuntimeException var1 = null;
        pl var2 = null;
        pl var3 = null;
        int var4 = 0;
        j var4_ref_j = null;
        sj var4_ref_sj = null;
        int var5 = 0;
        Object var5_ref = null;
        int var6 = 0;
        j var6_ref_j = null;
        Object var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        j var12 = null;
        sj[] var13 = null;
        sj var14 = null;
        sj[] var15 = null;
        sj var16 = null;
        sj[] var17 = null;
        sj var18 = null;
        sj[] var20 = null;
        sj var21 = null;
        sj[] var22 = null;
        sj var23 = null;
        sj var24 = null;
        sj var25 = null;
        String var26 = null;
        sj var27 = null;
        char[] var30 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    hf.field_j = hf.field_j + 1;
                    gh.field_l = gh.field_l + 1;
                    pf.field_g = eh.field_a;
                    nc.field_t = nc.field_t + jk.field_B;
                    vh.field_n = vh.field_n + 1;
                    hg.a(95);
                    if (oj.field_u.a((byte) -95) == null) {
                        statePc = 4;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    fieldTemp$0 = da.field_C + 1;
                    da.field_C = da.field_C + 1;
                    if ((fieldTemp$0 ^ -1) != -336) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    da.field_C = 0;
                    oj.field_u.c(-94);
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (mg.field_d) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    ne.a(39);
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (param0 >= 22) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    field_l = (String) null;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (n.field_a != 0) {
                        statePc = 11;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (6 > re.field_A) {
                        statePc = 16;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (n.field_a < 2) {
                        statePc = 15;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (mg.field_d) {
                        statePc = 16;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (-11 >= (n.field_a ^ -1)) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    wk.field_c = wk.field_c + 1;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    eg.field_b = eg.field_b + 1;
                    if (!mg.field_d) {
                        statePc = 19;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if ((n.field_a ^ -1) != -3) {
                        statePc = 19;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 19: {
                    dc.field_a = dc.field_a + 1;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    g.field_z = g.field_z - 1;
                    if (!rj.field_b) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    stackIn_23_0 = 1;
                    statePc = 23;
                    continue stateLoop;
                }
                case 22: {
                    stackIn_23_0 = 0;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    var1_int = stackIn_23_0;
                    if (ub.field_c == null) {
                        statePc = 27;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    if (!ub.field_c.field_c) {
                        statePc = 26;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 26: {
                    var1_int = 1;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    if (var1_int == 0) {
                        statePc = 29;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if (!mg.field_d) {
                        statePc = 31;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    stackIn_32_0 = 7;
                    statePc = 32;
                    continue stateLoop;
                }
                case 31: {
                    stackIn_32_0 = 1;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    qf.field_d = stackIn_32_0;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    return;
                }
                case 34: {
                    var2 = d.field_e;
                    if ((n.field_a ^ -1) > -4) {
                        statePc = 42;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    if ((n.field_a ^ -1) <= -7) {
                        statePc = 37;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    var3 = bd.field_u[2];
                    if (var11 == 0) {
                        statePc = 43;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    if ((n.field_a ^ -1) <= -10) {
                        statePc = 39;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    var3 = bd.field_u[3];
                    if (var11 == 0) {
                        statePc = 43;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    if (n.field_a >= 10) {
                        statePc = 41;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    var3 = bd.field_u[4];
                    if (var11 == 0) {
                        statePc = 43;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    var3 = bd.field_u[6];
                    if (var11 == 0) {
                        statePc = 43;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    var3 = bd.field_u[1];
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    if (var2 == null) {
                        statePc = 49;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    if (var2 == var3) {
                        statePc = 50;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    if (var3 == bd.field_u[6]) {
                        statePc = 50;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    if (var2 != bd.field_u[5]) {
                        statePc = 48;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 48: {
                    wd.a(17099, false, bd.field_u[5]);
                    if (var11 == 0) {
                        statePc = 50;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    wd.a(17099, true, var3);
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    if (re.field_A >= 6) {
                        statePc = 218;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    if (0 > jl.field_j) {
                        statePc = 61;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    if (-1 + n.field_a == jl.field_j) {
                        statePc = 55;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    if (!hd.field_a) {
                        statePc = 58;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    o.field_i = o.field_i + 10;
                    if (237 - -o.field_i >= 480) {
                        statePc = 57;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 57: {
                    hd.field_a = false;
                    jl.field_j = jl.field_j + 1;
                    if (var11 == 0) {
                        statePc = 61;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    if ((o.field_i ^ -1) < -1) {
                        statePc = 60;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 60: {
                    o.field_i = o.field_i - 10;
                    statePc = 61;
                    continue stateLoop;
                }
                case 61: {
                    if (-1 == (re.field_A ^ -1)) {
                        statePc = 205;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    if (-2 != (re.field_A ^ -1)) {
                        statePc = 83;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    var4 = 1;
                    var13 = wk.field_a.field_e;
                    var6 = 0;
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    if (var6 >= var13.length) {
                        statePc = 73;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    var14 = var13[var6];
                    if (var11 != 0) {
                        statePc = 75;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    if (var14 == null) {
                        statePc = 71;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    if (var14.field_p == var14.field_q) {
                        statePc = 69;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    var4 = 0;
                    if (var11 == 0) {
                        statePc = 73;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    if ((var14.field_p ^ -1) != -191) {
                        statePc = 71;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    var14.field_p = var14.field_p + wl.field_K.field_m;
                    var4 = 0;
                    if (var11 == 0) {
                        statePc = 73;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    var6++;
                    if (var11 == 0) {
                        statePc = 64;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    if (0 == n.field_a) {
                        statePc = 75;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 75: {
                    if (-51 < (dc.field_a ^ -1)) {
                        statePc = 79;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    if (var4 != 0) {
                        statePc = 78;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 78: {
                    dc.field_a = 0;
                    if (var11 == 0) {
                        statePc = 80;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    var4 = 0;
                    statePc = 80;
                    continue stateLoop;
                }
                case 80: {
                    if (var4 == 0) {
                        statePc = 82;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    re.field_A = 2;
                    statePc = 82;
                    continue stateLoop;
                }
                case 82: {
                    if (var11 == 0) {
                        statePc = 217;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    if (2 != re.field_A) {
                        statePc = 143;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    if (n.field_a == 10) {
                        statePc = 88;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    if (!mg.field_d) {
                        statePc = 121;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    if (2 != n.field_a) {
                        statePc = 121;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    var4 = 0;
                    statePc = 89;
                    continue stateLoop;
                }
                case 89: {
                    if (!pc.b(-128)) {
                        statePc = 99;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    if ((ch.field_d ^ -1) == -14) {
                        statePc = 93;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    if (84 == ch.field_d) {
                        statePc = 93;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 93: {
                    var4 = 1;
                    statePc = 94;
                    continue stateLoop;
                }
                case 94: {
                    if (13 != ch.field_d) {
                        statePc = 89;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    stackOut_95_0 = mg.field_d;
                    stackIn_100_0 = stackOut_95_0 ? 1 : 0;
                    stackIn_96_0 = stackOut_95_0;
                    if (var11 != 0) {
                        statePc = 100;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    if (!stackIn_96_0) {
                        statePc = 89;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    qf.field_d = 0;
                    statePc = 98;
                    continue stateLoop;
                }
                case 98: {
                    return;
                }
                case 99: {
                    stackIn_100_0 = 1;
                    statePc = 100;
                    continue stateLoop;
                }
                case 100: {
                    if (stackIn_100_0 != tg.field_d) {
                        statePc = 106;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    if ((ol.field_b ^ -1) > -265) {
                        statePc = 106;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    if (-429 >= (ol.field_b ^ -1)) {
                        statePc = 106;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 103: {
                    if (nk.field_c < 376) {
                        statePc = 106;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    if ((nk.field_c ^ -1) <= -408) {
                        statePc = 106;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 105: {
                    var4 = 1;
                    statePc = 106;
                    continue stateLoop;
                }
                case 106: {
                    if (1000 <= dc.field_a) {
                        statePc = 108;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 108: {
                    var4 = 1;
                    statePc = 109;
                    continue stateLoop;
                }
                case 109: {
                    if (var4 == 0) {
                        statePc = 120;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    if (!mg.field_d) {
                        statePc = 113;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    mg.field_d = false;
                    hd.field_a = true;
                    if (var11 == 0) {
                        statePc = 120;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    if (!qj.b((byte) 97)) {
                        statePc = 116;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    qf.field_d = 5;
                    if (var11 == 0) {
                        statePc = 120;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 116: {
                    if (0 != hc.field_u) {
                        statePc = 118;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 117: {
                    stackIn_119_0 = 2;
                    statePc = 119;
                    continue stateLoop;
                }
                case 118: {
                    stackIn_119_0 = 6;
                    statePc = 119;
                    continue stateLoop;
                }
                case 119: {
                    qf.field_d = stackIn_119_0;
                    statePc = 120;
                    continue stateLoop;
                }
                case 120: {
                    return;
                }
                case 121: {
                    var4 = 1;
                    var15 = od.field_g.field_e;
                    var6 = 0;
                    statePc = 122;
                    continue stateLoop;
                }
                case 122: {
                    if (var6 >= var15.length) {
                        statePc = 133;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    var16 = var15[var6];
                    if (var11 != 0) {
                        statePc = 139;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    if (var16 != null) {
                        statePc = 127;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 125: {
                    if (var11 == 0) {
                        statePc = 131;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 127: {
                    if (var16.field_q != var16.field_p) {
                        statePc = 130;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    if (-115 != (var16.field_p ^ -1)) {
                        statePc = 131;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    var4 = 0;
                    var16.field_p = 190;
                    if (var11 == 0) {
                        statePc = 133;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 130: {
                    var4 = 0;
                    if (var11 == 0) {
                        statePc = 133;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 131: {
                    var6++;
                    if (var11 == 0) {
                        statePc = 122;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 133: {
                    if (n.field_a != 0) {
                        statePc = 139;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    if ((dc.field_a ^ -1) > -51) {
                        statePc = 138;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    if (var4 != 0) {
                        statePc = 137;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 137: {
                    dc.field_a = 0;
                    if (var11 == 0) {
                        statePc = 139;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    var4 = 0;
                    statePc = 139;
                    continue stateLoop;
                }
                case 139: {
                    if (var4 != 0) {
                        statePc = 141;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 141: {
                    re.field_A = 3;
                    statePc = 142;
                    continue stateLoop;
                }
                case 142: {
                    if (var11 == 0) {
                        statePc = 217;
                    } else {
                        statePc = 143;
                    }
                    continue stateLoop;
                }
                case 143: {
                    if (3 != re.field_A) {
                        statePc = 178;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    wk.field_a.a(true);
                    si.field_i.a(true);
                    if (-11 == (n.field_a ^ -1)) {
                        statePc = 176;
                    } else {
                        statePc = 145;
                    }
                    continue stateLoop;
                }
                case 145: {
                    if (!mg.field_d) {
                        statePc = 148;
                    } else {
                        statePc = 146;
                    }
                    continue stateLoop;
                }
                case 146: {
                    if (2 == n.field_a) {
                        statePc = 176;
                    } else {
                        statePc = 148;
                    }
                    continue stateLoop;
                }
                case 148: {
                    var17 = od.field_g.field_e;
                    var5 = 0;
                    statePc = 149;
                    continue stateLoop;
                }
                case 149: {
                    if (var5 >= var17.length) {
                        statePc = 155;
                    } else {
                        statePc = 150;
                    }
                    continue stateLoop;
                }
                case 150: {
                    var18 = var17[var5];
                    if (var11 != 0) {
                        statePc = 217;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 151: {
                    if (var18 == null) {
                        statePc = 154;
                    } else {
                        statePc = 152;
                    }
                    continue stateLoop;
                }
                case 152: {
                    var18.field_x = false;
                    var18.field_l = var18.field_l + 1;
                    if (-4 >= (var18.field_h ^ -1)) {
                        statePc = 154;
                    } else {
                        statePc = 153;
                    }
                    continue stateLoop;
                }
                case 153: {
                    var18.field_h = var18.field_h + 1;
                    statePc = 154;
                    continue stateLoop;
                }
                case 154: {
                    var5++;
                    if (var11 == 0) {
                        statePc = 149;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 155: {
                    var30 = new char[8];
                    if (!mg.field_d) {
                        statePc = 159;
                    } else {
                        statePc = 156;
                    }
                    continue stateLoop;
                }
                case 156: {
                    if ((n.field_a ^ -1) != -2) {
                        statePc = 159;
                    } else {
                        statePc = 157;
                    }
                    continue stateLoop;
                }
                case 157: {
                    if (null != qi.field_c.field_n) {
                        statePc = 167;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 159: {
                    qi.field_c.a((byte) 92, var30);
                    var5 = li.a(8, o.field_o, false);
                    var6 = 0;
                    statePc = 160;
                    continue stateLoop;
                }
                case 160: {
                    if (var30.length <= var6) {
                        statePc = 166;
                    } else {
                        statePc = 161;
                    }
                    continue stateLoop;
                }
                case 161: {
                    si.field_i.field_e[var6] = w.a(si.field_i, var6, qi.field_c, (byte) 30, var30[var6]);
                    stackIn_175_0 = si.field_i;
                    stackIn_162_0 = stackIn_175_0;
                    if (var11 != 0) {
                        statePc = 175;
                    } else {
                        statePc = 162;
                    }
                    continue stateLoop;
                }
                case 162: {
                    stackIn_164_0 = stackIn_162_0.field_e[var6];
                    stackIn_163_0 = stackIn_164_0;
                    if (var5 != var6) {
                        statePc = 164;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 163: {
                    stackIn_165_0 = (sj) ((Object) stackIn_163_0);
                    stackIn_165_1 = 1;
                    statePc = 165;
                    continue stateLoop;
                }
                case 164: {
                    stackIn_165_0 = (sj) ((Object) stackIn_164_0);
                    stackIn_165_1 = 0;
                    statePc = 165;
                    continue stateLoop;
                }
                case 165: {
                    stackIn_165_0.field_x = stackIn_165_1 != 0;
                    dupTemp$1 = si.field_i.field_e[var6];
                    dupTemp$1.field_p = 247 + -wl.field_K.field_m;
                    si.field_i.field_e[var6].field_q = 247 + -wl.field_K.field_m;
                    var6++;
                    if (var11 == 0) {
                        statePc = 160;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 166: {
                    if (var11 == 0) {
                        statePc = 174;
                    } else {
                        statePc = 167;
                    }
                    continue stateLoop;
                }
                case 167: {
                    var5 = 0;
                    statePc = 168;
                    continue stateLoop;
                }
                case 168: {
                    if (var5 >= qi.field_c.field_n.length()) {
                        statePc = 174;
                    } else {
                        statePc = 169;
                    }
                    continue stateLoop;
                }
                case 169: {
                    si.field_i.field_e[var5] = w.a(si.field_i, var5, qi.field_c, (byte) 105, qi.field_c.field_n.charAt(var5));
                    stackIn_175_0 = si.field_i;
                    stackIn_170_0 = stackIn_175_0;
                    if (var11 != 0) {
                        statePc = 175;
                    } else {
                        statePc = 170;
                    }
                    continue stateLoop;
                }
                case 170: {
                    stackIn_172_0 = stackIn_170_0.field_e[var5];
                    stackIn_171_0 = stackIn_172_0;
                    if (-2 != (var5 ^ -1)) {
                        statePc = 172;
                    } else {
                        statePc = 171;
                    }
                    continue stateLoop;
                }
                case 171: {
                    stackIn_173_0 = (sj) ((Object) stackIn_171_0);
                    stackIn_173_1 = 1;
                    statePc = 173;
                    continue stateLoop;
                }
                case 172: {
                    stackIn_173_0 = (sj) ((Object) stackIn_172_0);
                    stackIn_173_1 = 0;
                    statePc = 173;
                    continue stateLoop;
                }
                case 173: {
                    stackIn_173_0.field_x = stackIn_173_1 != 0;
                    dupTemp$2 = si.field_i.field_e[var5];
                    dupTemp$2.field_p = 247 + -wl.field_K.field_m;
                    si.field_i.field_e[var5].field_q = 247 + -wl.field_K.field_m;
                    var5++;
                    if (var11 == 0) {
                        statePc = 168;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 174: {
                    wk.field_a.field_c = 114;
                    stackIn_175_0 = wk.field_a;
                    statePc = 175;
                    continue stateLoop;
                }
                case 175: {
                    stackIn_175_0.field_d = 34;
                    re.field_A = 4;
                    if (var11 == 0) {
                        statePc = 217;
                    } else {
                        statePc = 176;
                    }
                    continue stateLoop;
                }
                case 176: {
                    re.field_A = 6;
                    if (var11 == 0) {
                        statePc = 217;
                    } else {
                        statePc = 178;
                    }
                    continue stateLoop;
                }
                case 178: {
                    if (4 == re.field_A) {
                        statePc = 184;
                    } else {
                        statePc = 179;
                    }
                    continue stateLoop;
                }
                case 179: {
                    if (-6 == (re.field_A ^ -1)) {
                        statePc = 181;
                    } else {
                        statePc = 217;
                    }
                    continue stateLoop;
                }
                case 181: {
                    var12 = wk.field_a;
                    var4_ref_j = var12;
                    wk.field_a = od.field_g;
                    wk.field_a.field_d = 34;
                    od.field_g = var12;
                    wk.field_a.field_c = 190;
                    re.field_A = 6;
                    od.field_g.field_c = 114;
                    if ((jl.field_j ^ -1) != -4) {
                        statePc = 183;
                    } else {
                        statePc = 182;
                    }
                    continue stateLoop;
                }
                case 182: {
                    jl.field_j = jl.field_j + 1;
                    statePc = 183;
                    continue stateLoop;
                }
                case 183: {
                    od.field_g.field_d = 34;
                    if (var11 == 0) {
                        statePc = 217;
                    } else {
                        statePc = 184;
                    }
                    continue stateLoop;
                }
                case 184: {
                    var4 = 1;
                    var20 = si.field_i.field_e;
                    var6 = 0;
                    statePc = 185;
                    continue stateLoop;
                }
                case 185: {
                    if (var20.length <= var6) {
                        statePc = 195;
                    } else {
                        statePc = 186;
                    }
                    continue stateLoop;
                }
                case 186: {
                    var21 = var20[var6];
                    if (var11 != 0) {
                        statePc = 201;
                    } else {
                        statePc = 187;
                    }
                    continue stateLoop;
                }
                case 187: {
                    if (var21 == null) {
                        statePc = 193;
                    } else {
                        statePc = 188;
                    }
                    continue stateLoop;
                }
                case 188: {
                    if (var21.field_p == var21.field_q) {
                        statePc = 190;
                    } else {
                        statePc = 189;
                    }
                    continue stateLoop;
                }
                case 189: {
                    var4 = 0;
                    if (var11 == 0) {
                        statePc = 195;
                    } else {
                        statePc = 190;
                    }
                    continue stateLoop;
                }
                case 190: {
                    if ((var21.field_p ^ -1) != -248) {
                        statePc = 192;
                    } else {
                        statePc = 193;
                    }
                    continue stateLoop;
                }
                case 192: {
                    var21.field_p = 247;
                    var4 = 0;
                    if (var11 == 0) {
                        statePc = 195;
                    } else {
                        statePc = 193;
                    }
                    continue stateLoop;
                }
                case 193: {
                    var6++;
                    if (var11 == 0) {
                        statePc = 185;
                    } else {
                        statePc = 195;
                    }
                    continue stateLoop;
                }
                case 195: {
                    if (n.field_a != 0) {
                        statePc = 201;
                    } else {
                        statePc = 196;
                    }
                    continue stateLoop;
                }
                case 196: {
                    if ((dc.field_a ^ -1) > -51) {
                        statePc = 200;
                    } else {
                        statePc = 197;
                    }
                    continue stateLoop;
                }
                case 197: {
                    if (var4 != 0) {
                        statePc = 199;
                    } else {
                        statePc = 201;
                    }
                    continue stateLoop;
                }
                case 199: {
                    dc.field_a = 0;
                    if (var11 == 0) {
                        statePc = 201;
                    } else {
                        statePc = 200;
                    }
                    continue stateLoop;
                }
                case 200: {
                    var4 = 0;
                    statePc = 201;
                    continue stateLoop;
                }
                case 201: {
                    if (var4 != 0) {
                        statePc = 203;
                    } else {
                        statePc = 204;
                    }
                    continue stateLoop;
                }
                case 203: {
                    re.field_A = 5;
                    statePc = 204;
                    continue stateLoop;
                }
                case 204: {
                    if (var11 == 0) {
                        statePc = 217;
                    } else {
                        statePc = 205;
                    }
                    continue stateLoop;
                }
                case 205: {
                    var4 = 1;
                    var22 = si.field_i.field_e;
                    var6 = 0;
                    statePc = 206;
                    continue stateLoop;
                }
                case 206: {
                    if (var22.length <= var6) {
                        statePc = 215;
                    } else {
                        statePc = 207;
                    }
                    continue stateLoop;
                }
                case 207: {
                    var23 = var22[var6];
                    if (var11 != 0) {
                        statePc = 217;
                    } else {
                        statePc = 208;
                    }
                    continue stateLoop;
                }
                case 208: {
                    if (var23 == null) {
                        statePc = 213;
                    } else {
                        statePc = 209;
                    }
                    continue stateLoop;
                }
                case 209: {
                    if (var23.field_q != var23.field_p) {
                        statePc = 212;
                    } else {
                        statePc = 210;
                    }
                    continue stateLoop;
                }
                case 210: {
                    if (-248 != (var23.field_p ^ -1)) {
                        statePc = 213;
                    } else {
                        statePc = 211;
                    }
                    continue stateLoop;
                }
                case 211: {
                    var4 = 0;
                    var23.field_p = var23.field_p + wl.field_K.field_m;
                    if (var11 == 0) {
                        statePc = 215;
                    } else {
                        statePc = 212;
                    }
                    continue stateLoop;
                }
                case 212: {
                    var4 = 0;
                    if (var11 == 0) {
                        statePc = 215;
                    } else {
                        statePc = 213;
                    }
                    continue stateLoop;
                }
                case 213: {
                    var6++;
                    if (var11 == 0) {
                        statePc = 206;
                    } else {
                        statePc = 215;
                    }
                    continue stateLoop;
                }
                case 215: {
                    if (var4 == 0) {
                        statePc = 217;
                    } else {
                        statePc = 216;
                    }
                    continue stateLoop;
                }
                case 216: {
                    re.field_A = 1;
                    statePc = 217;
                    continue stateLoop;
                }
                case 217: {
                    return;
                }
                case 218: {
                    if (!ve.field_B[11]) {
                        statePc = 221;
                    } else {
                        statePc = 219;
                    }
                    continue stateLoop;
                }
                case 219: {
                    if (0 != ig.field_l) {
                        statePc = 221;
                    } else {
                        statePc = 220;
                    }
                    continue stateLoop;
                }
                case 220: {
                    ig.field_l = -1;
                    statePc = 221;
                    continue stateLoop;
                }
                case 221: {
                    if (!ve.field_B[1]) {
                        statePc = 228;
                    } else {
                        statePc = 222;
                    }
                    continue stateLoop;
                }
                case 222: {
                    if (va.field_j >= 2) {
                        statePc = 224;
                    } else {
                        statePc = 228;
                    }
                    continue stateLoop;
                }
                case 224: {
                    if (ll.field_S) {
                        statePc = 226;
                    } else {
                        statePc = 225;
                    }
                    continue stateLoop;
                }
                case 225: {
                    stackIn_227_0 = 1;
                    statePc = 227;
                    continue stateLoop;
                }
                case 226: {
                    stackIn_227_0 = 0;
                    statePc = 227;
                    continue stateLoop;
                }
                case 227: {
                    ll.field_S = stackIn_227_0 != 0;
                    statePc = 228;
                    continue stateLoop;
                }
                case 228: {
                    if (ve.field_B[12]) {
                        statePc = 230;
                    } else {
                        statePc = 231;
                    }
                    continue stateLoop;
                }
                case 230: {
                    ig.field_l = 0;
                    statePc = 231;
                    continue stateLoop;
                }
                case 231: {
                    stackIn_232_0 = pc.b(-122) ? 1 : 0;
                    statePc = 232;
                    continue stateLoop;
                }
                case 232: {
                    if (stackIn_232_0 == 0) {
                        statePc = 355;
                    } else {
                        statePc = 233;
                    }
                    continue stateLoop;
                }
                case 233: {
                    qf.field_e = qf.field_e ^ 1 << eh.field_a;
                    bc.field_b = bc.field_b ^ 1 << eh.field_a;
                    ud.field_b = ud.field_b - gh.field_l;
                    jk.field_B = jk.field_B - 1;
                    if (ch.field_d != 13) {
                        statePc = 242;
                    } else {
                        statePc = 234;
                    }
                    continue stateLoop;
                }
                case 234: {
                    if (!ad.field_e) {
                        statePc = 237;
                    } else {
                        statePc = 235;
                    }
                    continue stateLoop;
                }
                case 235: {
                    ad.field_e = false;
                    if (var11 == 0) {
                        statePc = 231;
                    } else {
                        statePc = 237;
                    }
                    continue stateLoop;
                }
                case 237: {
                    if (mg.field_d) {
                        statePc = 239;
                    } else {
                        statePc = 238;
                    }
                    continue stateLoop;
                }
                case 238: {
                    stackIn_240_0 = 1;
                    statePc = 240;
                    continue stateLoop;
                }
                case 239: {
                    stackIn_240_0 = 7;
                    statePc = 240;
                    continue stateLoop;
                }
                case 240: {
                    qf.field_d = stackIn_240_0;
                    statePc = 241;
                    continue stateLoop;
                }
                case 241: {
                    return;
                }
                case 242: {
                    if ((n.field_a ^ -1) == -11) {
                        statePc = 231;
                    } else {
                        statePc = 243;
                    }
                    continue stateLoop;
                }
                case 243: {
                    stackIn_356_0 = mg.field_d;
                    stackIn_244_0 = stackIn_356_0;
                    if (var11 != 0) {
                        statePc = 356;
                    } else {
                        statePc = 244;
                    }
                    continue stateLoop;
                }
                case 244: {
                    if (!stackIn_244_0) {
                        statePc = 248;
                    } else {
                        statePc = 245;
                    }
                    continue stateLoop;
                }
                case 245: {
                    if (n.field_a != 2) {
                        statePc = 248;
                    } else {
                        statePc = 246;
                    }
                    continue stateLoop;
                }
                case 246: {
                    if (var11 == 0) {
                        statePc = 231;
                    } else {
                        statePc = 248;
                    }
                    continue stateLoop;
                }
                case 248: {
                    if (ad.field_e) {
                        statePc = 348;
                    } else {
                        statePc = 249;
                    }
                    continue stateLoop;
                }
                case 249: {
                    if (84 != ch.field_d) {
                        statePc = 252;
                    } else {
                        statePc = 250;
                    }
                    continue stateLoop;
                }
                case 250: {
                    dc.a(-22991, false);
                    if (var11 == 0) {
                        statePc = 231;
                    } else {
                        statePc = 252;
                    }
                    continue stateLoop;
                }
                case 252: {
                    if (va.field_j < 2) {
                        statePc = 257;
                    } else {
                        statePc = 253;
                    }
                    continue stateLoop;
                }
                case 253: {
                    if ((ch.field_d ^ -1) != -36) {
                        statePc = 257;
                    } else {
                        statePc = 254;
                    }
                    continue stateLoop;
                }
                case 254: {
                    if (!ve.field_B[82]) {
                        statePc = 257;
                    } else {
                        statePc = 255;
                    }
                    continue stateLoop;
                }
                case 255: {
                    ue.b(31370);
                    if (var11 == 0) {
                        statePc = 231;
                    } else {
                        statePc = 257;
                    }
                    continue stateLoop;
                }
                case 257: {
                    if ((ch.field_d ^ -1) != -84) {
                        statePc = 260;
                    } else {
                        statePc = 258;
                    }
                    continue stateLoop;
                }
                case 258: {
                    vk.a((byte) 78, dg.field_d[0]);
                    wk.field_a.a(-10874);
                    si.field_i.a(-10874);
                    if (var11 == 0) {
                        statePc = 231;
                    } else {
                        statePc = 260;
                    }
                    continue stateLoop;
                }
                case 260: {
                    if (85 != ch.field_d) {
                        statePc = 264;
                    } else {
                        statePc = 261;
                    }
                    continue stateLoop;
                }
                case 261: {
                    if (od.field_g.field_e[0] == null) {
                        statePc = 264;
                    } else {
                        statePc = 262;
                    }
                    continue stateLoop;
                }
                case 262: {
                    wh.f((byte) 104);
                    if (var11 == 0) {
                        statePc = 231;
                    } else {
                        statePc = 264;
                    }
                    continue stateLoop;
                }
                case 264: {
                    if (!i.a(sg.field_n, 160)) {
                        statePc = 268;
                    } else {
                        statePc = 265;
                    }
                    continue stateLoop;
                }
                case 265: {
                    if (sg.field_n == 32) {
                        statePc = 268;
                    } else {
                        statePc = 266;
                    }
                    continue stateLoop;
                }
                case 266: {
                    if (od.field_g.field_e[11] == null) {
                        statePc = 333;
                    } else {
                        statePc = 268;
                    }
                    continue stateLoop;
                }
                case 268: {
                    if (98 != ch.field_d) {
                        statePc = 271;
                    } else {
                        statePc = 269;
                    }
                    continue stateLoop;
                }
                case 269: {
                    if ((n.field_a ^ -1) < -1) {
                        statePc = 273;
                    } else {
                        statePc = 271;
                    }
                    continue stateLoop;
                }
                case 271: {
                    if (99 == ch.field_d) {
                        statePc = 273;
                    } else {
                        statePc = 231;
                    }
                    continue stateLoop;
                }
                case 273: {
                    var4 = 0;
                    statePc = 274;
                    continue stateLoop;
                }
                case 274: {
                    if (-13 >= (var4 ^ -1)) {
                        statePc = 283;
                    } else {
                        statePc = 275;
                    }
                    continue stateLoop;
                }
                case 275: {
                    var24 = od.field_g.field_e[var4];
                    var25 = var24;
                    var27 = var25;
                    var25 = var24;
                    var5_ref = var25;
                    stackIn_414_0 = (sj) (var24);
                    stackIn_276_0 = stackIn_414_0;
                    if (var11 != 0) {
                        statePc = 414;
                    } else {
                        statePc = 276;
                    }
                    continue stateLoop;
                }
                case 276: {
                    if (stackIn_276_0 == null) {
                        statePc = 283;
                    } else {
                        statePc = 277;
                    }
                    continue stateLoop;
                }
                case 277: {
                    if (var24.field_k == null) {
                        statePc = 282;
                    } else {
                        statePc = 278;
                    }
                    continue stateLoop;
                }
                case 278: {
                    if (od.field_g == var24.field_k) {
                        statePc = 282;
                    } else {
                        statePc = 279;
                    }
                    continue stateLoop;
                }
                case 279: {
                    if (null == var24.field_k.field_e[var24.field_s]) {
                        statePc = 281;
                    } else {
                        statePc = 282;
                    }
                    continue stateLoop;
                }
                case 281: {
                    var24.a(var24.field_s, 28, var24.field_k);
                    statePc = 282;
                    continue stateLoop;
                }
                case 282: {
                    var4++;
                    if (var11 == 0) {
                        statePc = 274;
                    } else {
                        statePc = 283;
                    }
                    continue stateLoop;
                }
                case 283: {
                    var4 = 0;
                    statePc = 284;
                    continue stateLoop;
                }
                case 284: {
                    if (12 <= var4) {
                        statePc = 308;
                    } else {
                        statePc = 285;
                    }
                    continue stateLoop;
                }
                case 285: {
                    var25 = od.field_g.field_e[var4];
                    var27 = var25;
                    var27 = var25;
                    var5_ref = var25;
                    stackIn_414_0 = (sj) (var25);
                    stackIn_286_0 = stackIn_414_0;
                    if (var11 != 0) {
                        statePc = 414;
                    } else {
                        statePc = 286;
                    }
                    continue stateLoop;
                }
                case 286: {
                    if (stackIn_286_0 != null) {
                        statePc = 289;
                    } else {
                        statePc = 287;
                    }
                    continue stateLoop;
                }
                case 287: {
                    if (var11 == 0) {
                        statePc = 307;
                    } else {
                        statePc = 289;
                    }
                    continue stateLoop;
                }
                case 289: {
                    if (-1 != (var25.field_h ^ -1)) {
                        statePc = 291;
                    } else {
                        statePc = 290;
                    }
                    continue stateLoop;
                }
                case 290: {
                    var6_ref_j = si.field_i;
                    var7 = wk.field_a;
                    if (var11 == 0) {
                        statePc = 292;
                    } else {
                        statePc = 291;
                    }
                    continue stateLoop;
                }
                case 291: {
                    var7 = si.field_i;
                    var6_ref_j = wk.field_a;
                    statePc = 292;
                    continue stateLoop;
                }
                case 292: {
                    var8 = 0;
                    statePc = 293;
                    continue stateLoop;
                }
                case 293: {
                    if (var6_ref_j.field_e.length <= var8) {
                        statePc = 298;
                    } else {
                        statePc = 294;
                    }
                    continue stateLoop;
                }
                case 294: {
                    stackIn_414_0 = var6_ref_j.field_e[var8];
                    stackIn_295_0 = stackIn_414_0;
                    if (var11 != 0) {
                        statePc = 414;
                    } else {
                        statePc = 295;
                    }
                    continue stateLoop;
                }
                case 295: {
                    if (stackIn_295_0 != null) {
                        statePc = 297;
                    } else {
                        statePc = 296;
                    }
                    continue stateLoop;
                }
                case 296: {
                    var25.a(var8, 28, var6_ref_j);
                    var5_ref = null;
                    statePc = 298;
                    continue stateLoop;
                }
                case 297: {
                    var8++;
                    if (var11 == 0) {
                        statePc = 293;
                    } else {
                        statePc = 298;
                    }
                    continue stateLoop;
                }
                case 298: {
                    if (var5_ref == null) {
                        statePc = 307;
                    } else {
                        statePc = 299;
                    }
                    continue stateLoop;
                }
                case 299: {
                    var8 = 0;
                    statePc = 300;
                    continue stateLoop;
                }
                case 300: {
                    if (var8 >= ((j) (var7)).field_e.length) {
                        statePc = 307;
                    } else {
                        statePc = 301;
                    }
                    continue stateLoop;
                }
                case 301: {
                    stackIn_414_0 = ((j) (var7)).field_e[var8];
                    stackIn_302_0 = stackIn_414_0;
                    if (var11 != 0) {
                        statePc = 414;
                    } else {
                        statePc = 302;
                    }
                    continue stateLoop;
                }
                case 302: {
                    if (stackIn_302_0 == null) {
                        statePc = 304;
                    } else {
                        statePc = 305;
                    }
                    continue stateLoop;
                }
                case 304: {
                    ((sj) (var5_ref)).a(var8, 28, (j) (var7));
                    if (var11 == 0) {
                        statePc = 307;
                    } else {
                        statePc = 305;
                    }
                    continue stateLoop;
                }
                case 305: {
                    var8++;
                    if (var11 == 0) {
                        statePc = 300;
                    } else {
                        statePc = 307;
                    }
                    continue stateLoop;
                }
                case 307: {
                    var4++;
                    if (var11 == 0) {
                        statePc = 284;
                    } else {
                        statePc = 308;
                    }
                    continue stateLoop;
                }
                case 308: {
                    if (ch.field_d != 98) {
                        statePc = 231;
                    } else {
                        statePc = 309;
                    }
                    continue stateLoop;
                }
                case 309: {
                    var26 = vi.field_g[n.field_a + -1].toString();
                    var5 = 0;
                    statePc = 310;
                    continue stateLoop;
                }
                case 310: {
                    if (var26.length() <= var5) {
                        statePc = 332;
                    } else {
                        statePc = 311;
                    }
                    continue stateLoop;
                }
                case 311: {
                    var6 = var26.charAt(var5);
                    var7 = null;
                    var8 = -1;
                    var9 = -1;
                    stackIn_232_0 = 0;
                    stackIn_312_0 = stackIn_232_0;
                    if (var11 != 0) {
                        statePc = 232;
                    } else {
                        statePc = 312;
                    }
                    continue stateLoop;
                }
                case 312: {
                    var10 = stackIn_312_0;
                    statePc = 313;
                    continue stateLoop;
                }
                case 313: {
                    if (12 <= var10) {
                        statePc = 321;
                    } else {
                        statePc = 314;
                    }
                    continue stateLoop;
                }
                case 314: {
                    stackIn_331_0 = wk.field_a.field_e[var10];
                    stackIn_315_0 = stackIn_331_0;
                    if (var11 != 0) {
                        statePc = 331;
                    } else {
                        statePc = 315;
                    }
                    continue stateLoop;
                }
                case 315: {
                    if (stackIn_315_0 == null) {
                        statePc = 320;
                    } else {
                        statePc = 316;
                    }
                    continue stateLoop;
                }
                case 316: {
                    if (var6 != wk.field_a.field_e[var10].field_i) {
                        statePc = 320;
                    } else {
                        statePc = 317;
                    }
                    continue stateLoop;
                }
                case 317: {
                    if (wk.field_a.field_e[var10].field_l > var9) {
                        statePc = 319;
                    } else {
                        statePc = 320;
                    }
                    continue stateLoop;
                }
                case 319: {
                    var8 = var10;
                    var7 = wk.field_a;
                    var9 = wk.field_a.field_e[var10].field_l;
                    statePc = 320;
                    continue stateLoop;
                }
                case 320: {
                    var10++;
                    if (var11 == 0) {
                        statePc = 313;
                    } else {
                        statePc = 321;
                    }
                    continue stateLoop;
                }
                case 321: {
                    var10 = 0;
                    statePc = 322;
                    continue stateLoop;
                }
                case 322: {
                    if (var10 >= 8) {
                        statePc = 330;
                    } else {
                        statePc = 323;
                    }
                    continue stateLoop;
                }
                case 323: {
                    stackIn_331_0 = si.field_i.field_e[var10];
                    stackIn_324_0 = stackIn_331_0;
                    if (var11 != 0) {
                        statePc = 331;
                    } else {
                        statePc = 324;
                    }
                    continue stateLoop;
                }
                case 324: {
                    if (stackIn_324_0 == null) {
                        statePc = 329;
                    } else {
                        statePc = 325;
                    }
                    continue stateLoop;
                }
                case 325: {
                    if (var6 != si.field_i.field_e[var10].field_i) {
                        statePc = 329;
                    } else {
                        statePc = 326;
                    }
                    continue stateLoop;
                }
                case 326: {
                    if (var9 < si.field_i.field_e[var10].field_l) {
                        statePc = 328;
                    } else {
                        statePc = 329;
                    }
                    continue stateLoop;
                }
                case 328: {
                    var7 = si.field_i;
                    var9 = si.field_i.field_e[var10].field_l;
                    var8 = var10;
                    statePc = 329;
                    continue stateLoop;
                }
                case 329: {
                    var10++;
                    if (var11 == 0) {
                        statePc = 322;
                    } else {
                        statePc = 330;
                    }
                    continue stateLoop;
                }
                case 330: {
                    stackIn_331_0 = ((j) (var7)).field_e[var8];
                    statePc = 331;
                    continue stateLoop;
                }
                case 331: {
                    ((sj) (Object) stackIn_331_0).a(var5, 28, od.field_g);
                    var5++;
                    if (var11 == 0) {
                        statePc = 310;
                    } else {
                        statePc = 332;
                    }
                    continue stateLoop;
                }
                case 332: {
                    if (var11 == 0) {
                        statePc = 231;
                    } else {
                        statePc = 333;
                    }
                    continue stateLoop;
                }
                case 333: {
                    sg.field_n = qi.field_c.a(0, sg.field_n);
                    if (0 != ig.field_l) {
                        statePc = 335;
                    } else {
                        statePc = 336;
                    }
                    continue stateLoop;
                }
                case 335: {
                    ig.field_l = sg.field_n & 255;
                    statePc = 336;
                    continue stateLoop;
                }
                case 336: {
                    var27 = w.a((byte)sg.field_n, false);
                    if (var27 == null) {
                        statePc = 346;
                    } else {
                        statePc = 337;
                    }
                    continue stateLoop;
                }
                case 337: {
                    var5 = 0;
                    statePc = 338;
                    continue stateLoop;
                }
                case 338: {
                    if (var5 >= 12) {
                        statePc = 345;
                    } else {
                        statePc = 339;
                    }
                    continue stateLoop;
                }
                case 339: {
                    stackIn_368_0 = null;
                    stackIn_340_0 = stackIn_368_0;
                    stackIn_368_1 = od.field_g.field_e[var5];
                    stackIn_340_1 = stackIn_368_1;
                    if (var11 != 0) {
                        statePc = 368;
                    } else {
                        statePc = 340;
                    }
                    continue stateLoop;
                }
                case 340: {
                    if (stackIn_340_0 == stackIn_340_1) {
                        statePc = 342;
                    } else {
                        statePc = 343;
                    }
                    continue stateLoop;
                }
                case 342: {
                    var27.a(var5, 28, od.field_g);
                    if (var11 == 0) {
                        statePc = 345;
                    } else {
                        statePc = 343;
                    }
                    continue stateLoop;
                }
                case 343: {
                    var5++;
                    if (var11 == 0) {
                        statePc = 338;
                    } else {
                        statePc = 345;
                    }
                    continue stateLoop;
                }
                case 345: {
                    if (var11 == 0) {
                        statePc = 347;
                    } else {
                        statePc = 346;
                    }
                    continue stateLoop;
                }
                case 346: {
                    vk.a((byte) 91, dg.field_d[6]);
                    statePc = 347;
                    continue stateLoop;
                }
                case 347: {
                    if (var11 == 0) {
                        statePc = 231;
                    } else {
                        statePc = 348;
                    }
                    continue stateLoop;
                }
                case 348: {
                    a.field_S.b(false);
                    if (!a.field_S.f(-9112)) {
                        statePc = 231;
                    } else {
                        statePc = 349;
                    }
                    continue stateLoop;
                }
                case 349: {
                    if (0 == a.field_S.field_d) {
                        statePc = 351;
                    } else {
                        statePc = 352;
                    }
                    continue stateLoop;
                }
                case 351: {
                    dc.a(-22991, false);
                    statePc = 352;
                    continue stateLoop;
                }
                case 352: {
                    if (1 == a.field_S.field_d) {
                        statePc = 354;
                    } else {
                        statePc = 231;
                    }
                    continue stateLoop;
                }
                case 354: {
                    ad.field_e = false;
                    if (var11 == 0) {
                        statePc = 231;
                    } else {
                        statePc = 355;
                    }
                    continue stateLoop;
                }
                case 355: {
                    stackIn_356_0 = ad.field_e;
                    statePc = 356;
                    continue stateLoop;
                }
                case 356: {
                    if (stackIn_356_0) {
                        statePc = 358;
                    } else {
                        statePc = 364;
                    }
                    continue stateLoop;
                }
                case 358: {
                    a.field_S.a(-127, kk.a(336, ol.field_b, nk.field_c), kk.a(336, oa.field_j, bk.field_a));
                    if (!a.field_S.f(-9112)) {
                        statePc = 364;
                    } else {
                        statePc = 359;
                    }
                    continue stateLoop;
                }
                case 359: {
                    if (0 == a.field_S.field_d) {
                        statePc = 361;
                    } else {
                        statePc = 362;
                    }
                    continue stateLoop;
                }
                case 361: {
                    dc.a(-22991, true);
                    statePc = 362;
                    continue stateLoop;
                }
                case 362: {
                    if (a.field_S.field_d != 1) {
                        statePc = 364;
                    } else {
                        statePc = 363;
                    }
                    continue stateLoop;
                }
                case 363: {
                    ad.field_e = false;
                    statePc = 364;
                    continue stateLoop;
                }
                case 364: {
                    if (-2 != (tg.field_d ^ -1)) {
                        statePc = 367;
                    } else {
                        statePc = 365;
                    }
                    continue stateLoop;
                }
                case 365: {
                    if (!ad.field_e) {
                        statePc = 374;
                    } else {
                        statePc = 367;
                    }
                    continue stateLoop;
                }
                case 367: {
                    stackIn_368_0 = null;
                    stackIn_368_1 = sg.field_d;
                    statePc = 368;
                    continue stateLoop;
                }
                case 368: {
                    if (stackIn_368_0 == stackIn_368_1) {
                        statePc = 435;
                    } else {
                        statePc = 369;
                    }
                    continue stateLoop;
                }
                case 369: {
                    if (b.field_k != 0) {
                        statePc = 372;
                    } else {
                        statePc = 370;
                    }
                    continue stateLoop;
                }
                case 370: {
                    qi.a((byte) 125);
                    if (var11 == 0) {
                        statePc = 435;
                    } else {
                        statePc = 372;
                    }
                    continue stateLoop;
                }
                case 372: {
                    ua.b((byte) 69);
                    if (var11 == 0) {
                        statePc = 435;
                    } else {
                        statePc = 374;
                    }
                    continue stateLoop;
                }
                case 374: {
                    qf.field_e = qf.field_e ^ 5 << bc.field_b;
                    hf.field_j = hf.field_j + ol.field_b;
                    vh.field_n = vh.field_n + ol.field_b;
                    nc.field_t = nc.field_t + nk.field_c;
                    bc.field_b = bc.field_b ^ 5 << bc.field_b;
                    ud.field_b = ud.field_b - nk.field_c;
                    if (-265 < (oa.field_j ^ -1)) {
                        statePc = 380;
                    } else {
                        statePc = 375;
                    }
                    continue stateLoop;
                }
                case 375: {
                    if ((oa.field_j ^ -1) <= -429) {
                        statePc = 380;
                    } else {
                        statePc = 376;
                    }
                    continue stateLoop;
                }
                case 376: {
                    if (bk.field_a < 376) {
                        statePc = 380;
                    } else {
                        statePc = 377;
                    }
                    continue stateLoop;
                }
                case 377: {
                    if ((bk.field_a ^ -1) <= -408) {
                        statePc = 380;
                    } else {
                        statePc = 378;
                    }
                    continue stateLoop;
                }
                case 378: {
                    dc.a(-22991, true);
                    if (var11 == 0) {
                        statePc = 435;
                    } else {
                        statePc = 380;
                    }
                    continue stateLoop;
                }
                case 380: {
                    if (134 > oa.field_j) {
                        statePc = 385;
                    } else {
                        statePc = 381;
                    }
                    continue stateLoop;
                }
                case 381: {
                    if (-243 >= (oa.field_j ^ -1)) {
                        statePc = 385;
                    } else {
                        statePc = 382;
                    }
                    continue stateLoop;
                }
                case 382: {
                    if ((bk.field_a ^ -1) > -377) {
                        statePc = 385;
                    } else {
                        statePc = 383;
                    }
                    continue stateLoop;
                }
                case 383: {
                    if (407 > bk.field_a) {
                        statePc = 432;
                    } else {
                        statePc = 385;
                    }
                    continue stateLoop;
                }
                case 385: {
                    if (bk.field_a < 114) {
                        statePc = 389;
                    } else {
                        statePc = 386;
                    }
                    continue stateLoop;
                }
                case 386: {
                    if (bk.field_a >= 114 - -wl.field_K.field_m) {
                        statePc = 389;
                    } else {
                        statePc = 387;
                    }
                    continue stateLoop;
                }
                case 387: {
                    if (oa.field_j >= 34) {
                        statePc = 402;
                    } else {
                        statePc = 389;
                    }
                    continue stateLoop;
                }
                case 389: {
                    if (-191 < (bk.field_a ^ -1)) {
                        statePc = 393;
                    } else {
                        statePc = 390;
                    }
                    continue stateLoop;
                }
                case 390: {
                    if (bk.field_a >= 190 + wl.field_K.field_m) {
                        statePc = 393;
                    } else {
                        statePc = 391;
                    }
                    continue stateLoop;
                }
                case 391: {
                    if (oa.field_j >= 34) {
                        statePc = 399;
                    } else {
                        statePc = 393;
                    }
                    continue stateLoop;
                }
                case 393: {
                    if (bk.field_a < 247) {
                        statePc = 404;
                    } else {
                        statePc = 394;
                    }
                    continue stateLoop;
                }
                case 394: {
                    if (247 + wl.field_K.field_m <= bk.field_a) {
                        statePc = 404;
                    } else {
                        statePc = 395;
                    }
                    continue stateLoop;
                }
                case 395: {
                    if (161 > oa.field_j) {
                        statePc = 404;
                    } else {
                        statePc = 396;
                    }
                    continue stateLoop;
                }
                case 396: {
                    var4 = (-161 + oa.field_j) / wl.field_K.field_n;
                    if (var4 >= si.field_i.field_e.length) {
                        statePc = 398;
                    } else {
                        statePc = 397;
                    }
                    continue stateLoop;
                }
                case 397: {
                    rk.field_p = -(-(var4 * wl.field_K.field_n) + (oa.field_j - 161));
                    sg.field_d = si.field_i.field_e[var4];
                    ek.field_e = 247 - bk.field_a;
                    statePc = 398;
                    continue stateLoop;
                }
                case 398: {
                    if (var11 == 0) {
                        statePc = 404;
                    } else {
                        statePc = 399;
                    }
                    continue stateLoop;
                }
                case 399: {
                    var4 = (-34 + oa.field_j) / wl.field_K.field_n;
                    if (var4 >= wk.field_a.field_e.length) {
                        statePc = 401;
                    } else {
                        statePc = 400;
                    }
                    continue stateLoop;
                }
                case 400: {
                    rk.field_p = -(oa.field_j - (34 - -(wl.field_K.field_n * var4)));
                    sg.field_d = wk.field_a.field_e[var4];
                    ek.field_e = -bk.field_a + 190;
                    statePc = 401;
                    continue stateLoop;
                }
                case 401: {
                    if (var11 == 0) {
                        statePc = 404;
                    } else {
                        statePc = 402;
                    }
                    continue stateLoop;
                }
                case 402: {
                    var4 = (-34 + oa.field_j) / wl.field_K.field_n;
                    if (var4 >= od.field_g.field_e.length) {
                        statePc = 404;
                    } else {
                        statePc = 403;
                    }
                    continue stateLoop;
                }
                case 403: {
                    rk.field_p = -(-(var4 * wl.field_K.field_n) + -34 + oa.field_j);
                    sg.field_d = od.field_g.field_e[var4];
                    ek.field_e = 114 - bk.field_a;
                    statePc = 404;
                    continue stateLoop;
                }
                case 404: {
                    if ((va.field_j ^ -1) > -3) {
                        statePc = 412;
                    } else {
                        statePc = 405;
                    }
                    continue stateLoop;
                }
                case 405: {
                    if (0 >= ig.field_l) {
                        statePc = 412;
                    } else {
                        statePc = 406;
                    }
                    continue stateLoop;
                }
                case 406: {
                    if (sg.field_d != null) {
                        statePc = 408;
                    } else {
                        statePc = 412;
                    }
                    continue stateLoop;
                }
                case 408: {
                    sg.field_d.field_i = (char)ig.field_l;
                    if (!dk.field_b) {
                        statePc = 410;
                    } else {
                        statePc = 411;
                    }
                    continue stateLoop;
                }
                case 410: {
                    hf.field_j = hf.field_j + 1;
                    nc.field_t = nc.field_t + 1;
                    dk.field_b = true;
                    statePc = 411;
                    continue stateLoop;
                }
                case 411: {
                    sg.field_d.field_v = qi.field_c.field_p[255 & sg.field_d.field_i];
                    var4_ref_sj = sg.field_d;
                    sg.field_d.field_l = 0;
                    ig.field_l = -1;
                    var4_ref_sj.field_h = 0;
                    statePc = 412;
                    continue stateLoop;
                }
                case 412: {
                    if (null == sg.field_d) {
                        statePc = 435;
                    } else {
                        statePc = 413;
                    }
                    continue stateLoop;
                }
                case 413: {
                    stackIn_414_0 = nc.field_s;
                    statePc = 414;
                    continue stateLoop;
                }
                case 414: {
                    if (stackIn_414_0 != sg.field_d) {
                        statePc = 417;
                    } else {
                        statePc = 415;
                    }
                    continue stateLoop;
                }
                case 415: {
                    if (-1 > (g.field_z ^ -1)) {
                        statePc = 419;
                    } else {
                        statePc = 417;
                    }
                    continue stateLoop;
                }
                case 417: {
                    g.field_z = 10;
                    nc.field_s = sg.field_d;
                    if (var11 == 0) {
                        statePc = 435;
                    } else {
                        statePc = 419;
                    }
                    continue stateLoop;
                }
                case 419: {
                    sg.field_d = null;
                    if (od.field_g == nc.field_s.field_o) {
                        statePc = 429;
                    } else {
                        statePc = 420;
                    }
                    continue stateLoop;
                }
                case 420: {
                    var4 = 0;
                    statePc = 421;
                    continue stateLoop;
                }
                case 421: {
                    if (12 <= var4) {
                        statePc = 428;
                    } else {
                        statePc = 422;
                    }
                    continue stateLoop;
                }
                case 422: {
                    if (var11 != 0) {
                        statePc = 431;
                    } else {
                        statePc = 423;
                    }
                    continue stateLoop;
                }
                case 423: {
                    if (od.field_g.field_e[var4] == null) {
                        statePc = 425;
                    } else {
                        statePc = 426;
                    }
                    continue stateLoop;
                }
                case 425: {
                    nc.field_s.a(var4, 28, od.field_g);
                    if (var11 == 0) {
                        statePc = 428;
                    } else {
                        statePc = 426;
                    }
                    continue stateLoop;
                }
                case 426: {
                    var4++;
                    if (var11 == 0) {
                        statePc = 421;
                    } else {
                        statePc = 428;
                    }
                    continue stateLoop;
                }
                case 428: {
                    if (var11 == 0) {
                        statePc = 430;
                    } else {
                        statePc = 429;
                    }
                    continue stateLoop;
                }
                case 429: {
                    eh.a(nc.field_s, 55);
                    statePc = 430;
                    continue stateLoop;
                }
                case 430: {
                    nc.field_s = null;
                    statePc = 431;
                    continue stateLoop;
                }
                case 431: {
                    if (var11 == 0) {
                        statePc = 435;
                    } else {
                        statePc = 432;
                    }
                    continue stateLoop;
                }
                case 432: {
                    vk.a((byte) 85, dg.field_d[0]);
                    wk.field_a.a(-10874);
                    si.field_i.a(-10874);
                    statePc = 435;
                    continue stateLoop;
                }
                case 435: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(byte param0) {
        field_l = null;
        if (param0 != -4) {
            field_j = -4;
        }
        field_i = null;
    }

    ia() {
    }

    static {
        field_i = "Menu";
        field_l = "Updates will sent to the email address you've given";
    }
}
