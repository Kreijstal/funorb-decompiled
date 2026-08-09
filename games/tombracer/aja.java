/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aja extends lea {
    static String field_G;
    static int field_H;
    static String field_I;

    final fsa a(boolean param0, int param1, la param2) {
        fsa var4 = null;
        RuntimeException var4_ref = null;
        ue var5 = null;
        mfa var6 = null;
        kga var7 = null;
        fsa stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = super.a(param0, param1, param2);
            var5 = new ue(param2, param0);
            var5.a(2, false);
            var4.a((byte) 83, (nv) (var5));
            var6 = rm.field_a;
            var7 = (kga) ((Object) var6.a(12, 125));
            var7.b((byte) 123, 1);
            var4.a(var5, (byte) 124, var7);
            stackIn_1_0 = (fsa) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var4_ref);

            stackIn_4_1 = new StringBuilder().append("aja.AC(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    aja(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    final static void a(boolean param0, int param1, int param2, boolean param3, boolean param4) {
        jea stackIn_18_0 = null;
        jea stackIn_19_0 = null;
        jea stackIn_20_0 = null;
        jea stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackIn_62_0 = 0;
        int stackIn_66_0 = 0;
        boolean stackIn_74_0 = false;
        int stackIn_80_0 = 0;
        boolean stackIn_127_0 = false;
        int stackIn_145_0 = 0;
        jea stackIn_165_0 = null;
        int stackIn_165_1 = 0;
        jea stackIn_166_0 = null;
        int stackIn_166_1 = 0;
        jea stackIn_167_0 = null;
        int stackIn_167_1 = 0;
        jea stackIn_168_0 = null;
        int stackIn_168_1 = 0;
        jea stackIn_169_0 = null;
        int stackIn_169_1 = 0;
        int stackIn_169_2 = 0;
        jea stackIn_170_0 = null;
        int stackIn_170_1 = 0;
        jea stackIn_171_0 = null;
        int stackIn_171_1 = 0;
        jea stackIn_172_0 = null;
        int stackIn_172_1 = 0;
        jea stackIn_173_0 = null;
        int stackIn_173_1 = 0;
        jea stackIn_174_0 = null;
        int stackIn_174_1 = 0;
        int stackIn_174_2 = 0;
        jea stackIn_175_0 = null;
        int stackIn_175_1 = 0;
        jea stackIn_176_0 = null;
        int stackIn_176_1 = 0;
        jea stackIn_177_0 = null;
        int stackIn_177_1 = 0;
        jea stackIn_178_0 = null;
        int stackIn_178_1 = 0;
        jea stackIn_179_0 = null;
        int stackIn_179_1 = 0;
        int stackIn_179_2 = 0;
        int decompiledRegionSelector0 = 0;
        boolean stackOut_73_0;
        boolean stackOut_126_0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var5 = null;
        jea var6 = null;
        jea var7 = null;
        jea var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        String var10_ref_String = null;
        int var10 = 0;
        int var11 = 0;
        Object var11_ref = null;
        int var12 = 0;
        int[] var13_ref_int__ = null;
        int var13 = 0;
        String var13_ref_String = null;
        int var14 = 0;
        String var14_ref_String = null;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        vna var17 = null;
        Object var18 = null;
        int var18_int = 0;
        pha var18_ref = null;
        int var19 = 0;
        int[] var20 = null;
        jea var22 = null;
        int[] var23 = null;
        String var24 = null;
        int[] var25 = null;
        jea var26 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var18 = null;
                    var19 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        dga.a(fp.field_e, 199);
                        if (null != uu.field_a) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 164;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        bc.field_b.field_X = true;
                        var22 = pk.field_z;
                        var26 = var22;
                        pk.field_z.field_t = 0;
                        var26.field_G = 0;
                        var6 = hw.field_a;
                        hw.field_a.field_t = 0;
                        var6.field_G = 0;
                        var7 = dl.field_t;
                        dl.field_t.field_t = 0;
                        var7.field_G = 0;
                        if (!mka.b(param1 + 8193)) {
                            statePc = 156;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        wf.field_g.field_r = una.field_d.toUpperCase();
                        var9 = (2 + dka.field_b.field_G) / 2;
                        pk.field_z.a(-2 + var9, 40, -23776, -40 + dka.field_b.field_t, 0);
                        if ((uu.field_a.field_Mb ^ -1) > (uu.field_a.field_Jb ^ -1)) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        pk.field_z.field_r = ml.field_c.toUpperCase();
                        pk.field_z.field_X = false;
                        if (var19 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        pk.field_z.field_r = eu.field_b.toUpperCase();
                        pk.field_z.field_X = true;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        pk.field_z.field_w = hg.field_g.field_w;
                        if (so.field_K > 0) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (1 != so.field_K) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var10_ref_String = sj.field_a;
                        if (var19 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var10_ref_String = gl.a((byte) 84, ld.field_f, new String[]{Integer.toString(so.field_K)});
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (-1 != (lh.field_a & 16 ^ -1)) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (tla.field_e) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        pk.field_z.field_w = hg.field_g.field_C;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        pk.field_z.field_r = pk.field_z.field_r + "<br>" + var10_ref_String;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        hw.field_a.a(dka.field_b.field_G + -var9, 40, -23776, dka.field_b.field_t - 40, var9);
                        hw.field_a.field_r = ki.field_p.toUpperCase();
                        var8 = hw.field_a;
                        stackIn_20_0 = hw.field_a;
                        stackIn_18_0 = stackIn_20_0;
                        if (!param3) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackIn_20_0 = (jea) ((Object) stackIn_18_0);
                        stackIn_19_0 = stackIn_20_0;
                        if (uq.field_d != 0L) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackIn_21_0 = (jea) ((Object) stackIn_19_0);
                        stackIn_21_1 = 1;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackIn_21_0 = (jea) ((Object) stackIn_20_0);
                        stackIn_21_1 = 0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackIn_21_0.field_X = stackIn_21_1 != 0;
                        var10 = 2;
                        if (null != ce.field_A) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (tba.field_m != null) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        tba.field_m = new byte[fk.field_b];
                        sda.field_f = new boolean[fk.field_b];
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var11 = 0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if ((var11 ^ -1) <= (fk.field_b ^ -1)) {
                            statePc = 30;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        sda.field_f[var11] = false;
                        var11++;
                        if (var19 != 0) {
                            statePc = 31;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (var19 == 0) {
                            statePc = 26;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var10 = 0;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (-3 >= (var10 ^ -1)) {
                            statePc = 65;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var11 = 0;
                        stackIn_66_0 = 0;
                        stackIn_34_0 = stackIn_66_0;
                        if (var19 != 0) {
                            statePc = 66;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var12 = stackIn_34_0;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        stackIn_36_0 = ce.field_A.length;
                        stackIn_36_1 = var12;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (stackIn_36_0 <= stackIn_36_1) {
                            statePc = 61;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var25 = ce.field_A[var12];
                        var23 = var25;
                        var20 = var23;
                        var13_ref_int__ = var20;
                        stackIn_62_0 = 0;
                        stackIn_38_0 = stackIn_62_0;
                        if (var19 != 0) {
                            statePc = 62;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var14 = stackIn_38_0;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (var25.length <= var14) {
                            statePc = 52;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var15 = var25[var14];
                        var16 = var20[1 + var14];
                        stackIn_54_0 = 0;
                        stackIn_41_0 = stackIn_54_0;
                        stackIn_54_1 = var15 ^ -1;
                        stackIn_41_1 = stackIn_54_1;
                        if (var19 != 0) {
                            statePc = 54;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (stackIn_41_0 == stackIn_41_1) {
                            statePc = 44;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if ((var16 ^ -1) != (255 & uu.field_a.field_ac[var15] ^ -1)) {
                            statePc = 60;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (-1 != (var10 ^ -1)) {
                            statePc = 46;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        stackIn_47_0 = uu.field_a.field_Jb;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        stackIn_47_0 = uu.field_a.field_Mb;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var17_int = stackIn_47_0;
                        if ((var17_int ^ -1) == (var16 ^ -1)) {
                            statePc = 50;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (var19 == 0) {
                            statePc = 60;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var14 += 2;
                        if (var19 == 0) {
                            statePc = 39;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var11 = 1;
                        var14 = -1;
                        var15 = 0;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        stackIn_54_0 = var25.length;
                        stackIn_54_1 = var15;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (stackIn_54_0 <= stackIn_54_1) {
                            statePc = 59;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var16 = var25[var15];
                        stackIn_36_0 = var14 ^ -1;
                        stackIn_56_0 = stackIn_36_0;
                        stackIn_36_1 = var16 ^ -1;
                        stackIn_56_1 = stackIn_36_1;
                        if (var19 != 0) {
                            statePc = 36;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (stackIn_56_0 <= stackIn_56_1) {
                            statePc = 58;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        var14 = var16;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var15 += 2;
                        if (var19 == 0) {
                            statePc = 53;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        sda.field_f[var14] = true;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var12++;
                        if (var19 == 0) {
                            statePc = 35;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        stackIn_62_0 = var11;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (stackIn_62_0 != 0) {
                            statePc = 65;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        var10++;
                        if (var19 == 0) {
                            statePc = 32;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        stackIn_66_0 = 2;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (stackIn_66_0 > ld.field_e) {
                            statePc = 69;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (!oj.field_tb[12]) {
                            statePc = 69;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        var10 = 2;
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (var10 >= 2) {
                            statePc = 88;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        hw.field_a.field_X = false;
                        if (!hw.field_a.field_pb) {
                            statePc = 155;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        var11_ref = null;
                        var12 = 0;
                        var13 = 0;
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if (var13 >= fk.field_b) {
                            statePc = 79;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        stackOut_73_0 = sda.field_f[var13];
                        stackIn_80_0 = stackOut_73_0 ? 1 : 0;
                        stackIn_74_0 = stackOut_73_0;
                        if (var19 != 0) {
                            statePc = 80;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (!stackIn_74_0) {
                            statePc = 78;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        var24 = "<col=A00000>" + kma.field_e[var13] + "</col>";
                        if (var11_ref != null) {
                            statePc = 77;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        var11_ref = var24;
                        if (var19 == 0) {
                            statePc = 78;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        var11_ref = (String) (var11_ref) + ", " + var24;
                        var12 = 1;
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        var13++;
                        if (var19 == 0) {
                            statePc = 72;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        stackIn_80_0 = var10;
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if (stackIn_80_0 == 0) {
                            statePc = 84;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        var13_ref_String = lha.field_m;
                        if (var12 != 0) {
                            statePc = 83;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        var14_ref_String = gl.a((byte) 102, bl.field_b, new String[]{(String) (var11_ref)});
                        if (var19 == 0) {
                            statePc = 87;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        var14_ref_String = uda.field_w + (String) (var11_ref);
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        var13_ref_String = wqa.field_J;
                        if (var12 != 0) {
                            statePc = 86;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        var14_ref_String = gl.a((byte) 82, field_I, new String[]{(String) (var11_ref)});
                        if (var19 == 0) {
                            statePc = 87;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        var14_ref_String = v.field_j + (String) (var11_ref);
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        qda.field_b = "<col=A00000>" + var13_ref_String + "<br>" + var14_ref_String;
                        if (var19 == 0) {
                            statePc = 155;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        if (null != rl.field_u) {
                            statePc = 93;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        if (null != hp.field_a) {
                            statePc = 93;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        if (nra.field_g != null) {
                            statePc = 93;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        if (null == lga.field_z) {
                            statePc = 155;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        var11 = 0;
                        var12 = 0;
                        var13 = 0;
                        var14 = 0;
                        var15 = 0;
                        var16 = 0;
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        if (var16 >= fk.field_b) {
                            statePc = 123;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        var17_int = uu.field_a.field_ac[var16] & 255;
                        if (var19 != 0) {
                            statePc = 124;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        if (rl.field_u == null) {
                            statePc = 100;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        if (null == rl.field_u[var16]) {
                            statePc = 100;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        if (!rl.field_u[var16][var17_int]) {
                            statePc = 100;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        var11 = 1;
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        if (null == hp.field_a) {
                            statePc = 109;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        if (hp.field_a[var16] != null) {
                            statePc = 103;
                        } else {
                            statePc = 102;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        var18_int = hp.field_a[var16][var17_int];
                        if (0 == var18_int) {
                            statePc = 107;
                        } else {
                            statePc = 104;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        if (!dea.field_c) {
                            statePc = 106;
                        } else {
                            statePc = 105;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        statePc = 107;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        var11 = 1;
                        statePc = 107;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        if (var13 >= var18_int) {
                            statePc = 109;
                        } else {
                            statePc = 108;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        var13 = var18_int;
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        if (lga.field_z == null) {
                            statePc = 113;
                        } else {
                            statePc = 110;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        if (null != lga.field_z[var16]) {
                            statePc = 112;
                        } else {
                            statePc = 111;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        statePc = 113;
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        var15 = var15 | lga.field_z[var16][var17_int];
                        statePc = 113;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        if (null == nra.field_g) {
                            statePc = 122;
                        } else {
                            statePc = 114;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        if (nra.field_g[var16] == null) {
                            statePc = 122;
                        } else {
                            statePc = 115;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        var18_int = nra.field_g[var16][var17_int];
                        if (var14 < var18_int) {
                            statePc = 117;
                        } else {
                            statePc = 116;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        statePc = 118;
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        var14 = var18_int;
                        statePc = 118;
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        if (0 == var18_int) {
                            statePc = 122;
                        } else {
                            statePc = 119;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        if (!dea.field_c) {
                            statePc = 121;
                        } else {
                            statePc = 120;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        var11 = 1;
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        var16++;
                        if (var19 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 123;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        var16 = 0;
                        statePc = 124;
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        var17 = tn.field_n.field_tb.field_J;
                        var18_ref = (pha) ((Object) var17.f(param1 + -79));
                        statePc = 125;
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        if (var18_ref == null) {
                            statePc = 144;
                        } else {
                            statePc = 126;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        stackOut_126_0 = var18_ref.f(162);
                        stackIn_145_0 = stackOut_126_0 ? 1 : 0;
                        stackIn_127_0 = stackOut_126_0;
                        if (var19 != 0) {
                            statePc = 145;
                        } else {
                            statePc = 127;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        if (!stackIn_127_0) {
                            statePc = 130;
                        } else {
                            statePc = 128;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        if (var19 == 0) {
                            statePc = 143;
                        } else {
                            statePc = 129;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        if (var11 == 0) {
                            statePc = 133;
                        } else {
                            statePc = 131;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        if (var18_ref.field_tb) {
                            statePc = 133;
                        } else {
                            statePc = 132;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        var16 = 1;
                        if (var19 == 0) {
                            statePc = 144;
                        } else {
                            statePc = 133;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        if ((var18_ref.field_Jb ^ -1) > (var13 ^ -1)) {
                            statePc = 135;
                        } else {
                            statePc = 134;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        statePc = 136;
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        var16 = 1;
                        if (var19 == 0) {
                            statePc = 144;
                        } else {
                            statePc = 136;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        if (var18_ref.field_zb >= var14) {
                            statePc = 138;
                        } else {
                            statePc = 137;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        var16 = 1;
                        if (var19 == 0) {
                            statePc = 144;
                        } else {
                            statePc = 138;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        if (-1 <= ((var18_ref.field_Eb ^ -1) & var15 ^ -1)) {
                            statePc = 140;
                        } else {
                            statePc = 139;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        var16 = 1;
                        if (var19 == 0) {
                            statePc = 144;
                        } else {
                            statePc = 140;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        if (var12 != 0) {
                            statePc = 142;
                        } else {
                            statePc = 141;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        statePc = 143;
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        var16 = 1;
                        if (var19 == 0) {
                            statePc = 144;
                        } else {
                            statePc = 143;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        var18_ref = (pha) ((Object) var17.e(120));
                        if (var19 == 0) {
                            statePc = 125;
                        } else {
                            statePc = 144;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        stackIn_145_0 = -3;
                        statePc = 145;
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        if (stackIn_145_0 < (ld.field_e ^ -1)) {
                            statePc = 148;
                        } else {
                            statePc = 146;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        if (!oj.field_tb[12]) {
                            statePc = 148;
                        } else {
                            statePc = 147;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        var16 = 0;
                        statePc = 148;
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        if (var16 != 0) {
                            statePc = 150;
                        } else {
                            statePc = 149;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        statePc = 155;
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        hw.field_a.field_X = false;
                        if (!hw.field_a.field_pb) {
                            statePc = 155;
                        } else {
                            statePc = 151;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_150) {
                        caughtException = stateCaught_150;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        if ((rm.field_e.field_a.field_wb ^ -1) == -1) {
                            statePc = 154;
                        } else {
                            statePc = 152;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        qda.field_b = gl.a((byte) 126, sta.field_A, new String[]{kh.field_p});
                        if (var19 == 0) {
                            statePc = 155;
                        } else {
                            statePc = 153;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        statePc = 154;
                        continue stateLoop;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        qda.field_b = kh.field_o;
                        statePc = 155;
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        if (var19 == 0) {
                            statePc = 157;
                        } else {
                            statePc = 156;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        var9_ref_String = uu.field_a.field_tb;
                        wf.field_g.field_r = gl.a((byte) 113, jea.field_nb, new String[]{var9_ref_String}).toUpperCase();
                        dl.field_t.a(dka.field_b.field_G, 40, -23776, dka.field_b.field_t - 40, 0);
                        dl.field_t.field_r = gl.a((byte) 107, bja.field_d, new String[]{var9_ref_String});
                        var8 = dl.field_t;
                        statePc = 157;
                        continue stateLoop;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        if ((uq.field_d ^ -1L) != -1L) {
                            statePc = 159;
                        } else {
                            statePc = 158;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 158: {
                    try {
                        statePc = 163;
                        continue stateLoop;
                    } catch (Throwable stateCaught_158) {
                        caughtException = stateCaught_158;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 159: {
                    try {
                        var9 = (int)(-bva.b((byte) -107) + uq.field_d);
                        var9 = (999 + var9) / 1000;
                        if ((var9 ^ -1) > -2) {
                            statePc = 161;
                        } else {
                            statePc = 160;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_159) {
                        caughtException = stateCaught_159;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 160: {
                    try {
                        statePc = 162;
                        continue stateLoop;
                    } catch (Throwable stateCaught_160) {
                        caughtException = stateCaught_160;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 161: {
                    try {
                        var9 = 1;
                        statePc = 162;
                        continue stateLoop;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 162: {
                    try {
                        var8.field_r = gl.a((byte) 97, he.field_b, new String[]{Integer.toString(var9)});
                        statePc = 163;
                        continue stateLoop;
                    } catch (Throwable stateCaught_162) {
                        caughtException = stateCaught_162;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 163: {
                    try {
                        cea.field_a.field_r = gl.a((byte) 106, tra.field_A, new String[]{Integer.toString(uu.field_a.field_Mb), Integer.toString(uu.field_a.field_Jb)});
                        statePc = 164;
                        continue stateLoop;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 164: {
                    try {
                        stackIn_168_0 = nra.field_c;
                        stackIn_165_0 = stackIn_168_0;
                        stackIn_168_1 = -98;
                        stackIn_165_1 = stackIn_168_1;
                        if (!param4) {
                            statePc = 168;
                        } else {
                            statePc = 165;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_164) {
                        caughtException = stateCaught_164;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 165: {
                    try {
                        stackIn_168_0 = (jea) ((Object) stackIn_165_0);
                        stackIn_166_0 = stackIn_168_0;
                        stackIn_168_1 = stackIn_165_1;
                        stackIn_166_1 = stackIn_168_1;
                        if (param0) {
                            statePc = 168;
                        } else {
                            statePc = 166;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 166: {
                    try {
                        stackIn_168_0 = (jea) ((Object) stackIn_166_0);
                        stackIn_167_0 = stackIn_168_0;
                        stackIn_168_1 = stackIn_166_1;
                        stackIn_167_1 = stackIn_168_1;
                        if (tla.field_e) {
                            statePc = 168;
                        } else {
                            statePc = 167;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_166) {
                        caughtException = stateCaught_166;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 167: {
                    try {
                        stackIn_169_0 = (jea) ((Object) stackIn_167_0);
                        stackIn_169_1 = stackIn_167_1;
                        stackIn_169_2 = 1;
                        statePc = 169;
                        continue stateLoop;
                    } catch (Throwable stateCaught_167) {
                        caughtException = stateCaught_167;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 168: {
                    try {
                        stackIn_169_0 = (jea) ((Object) stackIn_168_0);
                        stackIn_169_1 = stackIn_168_1;
                        stackIn_169_2 = 0;
                        statePc = 169;
                        continue stateLoop;
                    } catch (Throwable stateCaught_168) {
                        caughtException = stateCaught_168;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 169: {
                    try {
                        ((jea) (Object) stackIn_169_0).c(stackIn_169_1, stackIn_169_2 != 0);
                        stackIn_173_0 = dka.field_b;
                        stackIn_170_0 = stackIn_173_0;
                        stackIn_173_1 = 67;
                        stackIn_170_1 = stackIn_173_1;
                        if (!param4) {
                            statePc = 173;
                        } else {
                            statePc = 170;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_169) {
                        caughtException = stateCaught_169;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 170: {
                    try {
                        stackIn_173_0 = (jea) ((Object) stackIn_170_0);
                        stackIn_171_0 = stackIn_173_0;
                        stackIn_173_1 = stackIn_170_1;
                        stackIn_171_1 = stackIn_173_1;
                        if (param0) {
                            statePc = 173;
                        } else {
                            statePc = 171;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_170) {
                        caughtException = stateCaught_170;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 171: {
                    try {
                        stackIn_173_0 = (jea) ((Object) stackIn_171_0);
                        stackIn_172_0 = stackIn_173_0;
                        stackIn_173_1 = stackIn_171_1;
                        stackIn_172_1 = stackIn_173_1;
                        if (tla.field_e) {
                            statePc = 173;
                        } else {
                            statePc = 172;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_171) {
                        caughtException = stateCaught_171;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 172: {
                    try {
                        stackIn_174_0 = (jea) ((Object) stackIn_172_0);
                        stackIn_174_1 = stackIn_172_1;
                        stackIn_174_2 = 1;
                        statePc = 174;
                        continue stateLoop;
                    } catch (Throwable stateCaught_172) {
                        caughtException = stateCaught_172;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 173: {
                    try {
                        stackIn_174_0 = (jea) ((Object) stackIn_173_0);
                        stackIn_174_1 = stackIn_173_1;
                        stackIn_174_2 = 0;
                        statePc = 174;
                        continue stateLoop;
                    } catch (Throwable stateCaught_173) {
                        caughtException = stateCaught_173;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 174: {
                    try {
                        ((jea) (Object) stackIn_174_0).c(stackIn_174_1, stackIn_174_2 != 0);
                        stackIn_178_0 = hf.field_a;
                        stackIn_175_0 = stackIn_178_0;
                        stackIn_178_1 = 36;
                        stackIn_175_1 = stackIn_178_1;
                        if (!param4) {
                            statePc = 178;
                        } else {
                            statePc = 175;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_174) {
                        caughtException = stateCaught_174;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 175: {
                    try {
                        stackIn_178_0 = (jea) ((Object) stackIn_175_0);
                        stackIn_176_0 = stackIn_178_0;
                        stackIn_178_1 = stackIn_175_1;
                        stackIn_176_1 = stackIn_178_1;
                        if (param0) {
                            statePc = 178;
                        } else {
                            statePc = 176;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_175) {
                        caughtException = stateCaught_175;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 176: {
                    try {
                        stackIn_178_0 = (jea) ((Object) stackIn_176_0);
                        stackIn_177_0 = stackIn_178_0;
                        stackIn_178_1 = stackIn_176_1;
                        stackIn_177_1 = stackIn_178_1;
                        if (!tla.field_e) {
                            statePc = 178;
                        } else {
                            statePc = 177;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_176) {
                        caughtException = stateCaught_176;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 177: {
                    try {
                        stackIn_179_0 = (jea) ((Object) stackIn_177_0);
                        stackIn_179_1 = stackIn_177_1;
                        stackIn_179_2 = 1;
                        statePc = 179;
                        continue stateLoop;
                    } catch (Throwable stateCaught_177) {
                        caughtException = stateCaught_177;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 178: {
                    try {
                        stackIn_179_0 = (jea) ((Object) stackIn_178_0);
                        stackIn_179_1 = stackIn_178_1;
                        stackIn_179_2 = 0;
                        statePc = 179;
                        continue stateLoop;
                    } catch (Throwable stateCaught_178) {
                        caughtException = stateCaught_178;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 179: {
                    try {
                        ((jea) (Object) stackIn_179_0).c(stackIn_179_1, stackIn_179_2 != 0);
                        rm.field_e.field_a.e((byte) -98);
                        if (param1 == -1) {
                            statePc = 181;
                        } else {
                            statePc = 180;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_179) {
                        caughtException = stateCaught_179;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 180: {
                    return;
                }
                case 181: {
                    try {
                        if (null == uu.field_a) {
                            statePc = 196;
                        } else {
                            statePc = 182;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_181) {
                        caughtException = stateCaught_181;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 182: {
                    try {
                        if (0 != bc.field_b.field_y) {
                            statePc = 184;
                        } else {
                            statePc = 183;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_182) {
                        caughtException = stateCaught_182;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 183: {
                    try {
                        statePc = 185;
                        continue stateLoop;
                    } catch (Throwable stateCaught_183) {
                        caughtException = stateCaught_183;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 184: {
                    try {
                        et.a(param2, 30, uu.field_a.f(0));
                        statePc = 185;
                        continue stateLoop;
                    } catch (Throwable stateCaught_184) {
                        caughtException = stateCaught_184;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 185: {
                    try {
                        if (-1 != (hw.field_a.field_y ^ -1)) {
                            statePc = 187;
                        } else {
                            statePc = 186;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_185) {
                        caughtException = stateCaught_185;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 186: {
                    try {
                        statePc = 188;
                        continue stateLoop;
                    } catch (Throwable stateCaught_186) {
                        caughtException = stateCaught_186;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 187: {
                    try {
                        hoa.field_p = true;
                        statePc = 188;
                        continue stateLoop;
                    } catch (Throwable stateCaught_187) {
                        caughtException = stateCaught_187;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 188: {
                    try {
                        if ((pk.field_z.field_y ^ -1) != -1) {
                            statePc = 190;
                        } else {
                            statePc = 189;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_188) {
                        caughtException = stateCaught_188;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 189: {
                    try {
                        statePc = 191;
                        continue stateLoop;
                    } catch (Throwable stateCaught_189) {
                        caughtException = stateCaught_189;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 190: {
                    try {
                        tla.field_e = true;
                        statePc = 191;
                        continue stateLoop;
                    } catch (Throwable stateCaught_190) {
                        caughtException = stateCaught_190;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 191: {
                    try {
                        if (-1 == (fsa.field_q.field_y ^ -1)) {
                            statePc = 193;
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
                        tla.field_e = false;
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
                        cm.a(param2, uu.field_a, param1 ^ 21289, false);
                        statePc = 196;
                        continue stateLoop;
                    } catch (Throwable stateCaught_193) {
                        caughtException = stateCaught_193;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 195: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    throw tba.a((Throwable) ((Object) var5), "aja.SB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
                }
                case 196: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void A(int param0) {
        field_I = null;
        if (param0 != 32076) {
            aja.a(false, 126, -63, false, true);
        }
        field_G = null;
    }

    aja(la param0, int param1) {
        super(param0, param1);
    }

    static {
        field_G = "Reject <%0> from this game";
        field_I = "Please select an option in the '<%0>' row.";
    }
}
