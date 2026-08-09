/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hj extends td {
    static sna field_p;

    final static cj a(byte param0, lu param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        lc stackIn_1_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = -55 % ((-47 - param0) / 55);
            stackIn_1_0 = new lc(param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var2);

            stackIn_5_1 = new StringBuilder().append("hj.C(").append(param0).append(',');

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
          throw pe.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
        return (cj) ((Object) stackIn_1_0);
    }

    final static nea b(int param0, int param1, boolean param2) {
        nea stackIn_3_0 = null;
        sga stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        sga stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        sga stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        int stackIn_8_4 = 0;
        nea stackIn_12_0 = null;
        sna stackIn_33_0 = null;
        sna stackIn_35_0 = null;
        sna stackIn_36_0 = null;
        String stackIn_36_1 = null;
        sna stackIn_37_0 = null;
        sna stackIn_39_0 = null;
        sna stackIn_40_0 = null;
        String stackIn_40_1 = null;
        int stackIn_44_0 = 0;
        Object stackIn_91_0 = null;
        Object stackIn_104_0 = null;
        int decompiledRegionSelector0 = 0;
        nea stackOut_11_0;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        eaa var4 = null;
        Object var5 = null;
        Object var6 = null;
        nea var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String var16 = null;
        ik var17 = null;
        String var18 = null;
        int var19 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = BachelorFridge.field_y;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = (nea) null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    try {
                        stackIn_7_0 = rba.field_a.field_xb;
                        stackIn_5_0 = stackIn_7_0;
                        stackIn_7_1 = rg.field_h - -2;
                        stackIn_5_1 = stackIn_7_1;
                        stackIn_7_2 = 2;
                        stackIn_5_2 = stackIn_7_2;
                        stackIn_7_3 = (rg.field_h * 3 + 6) * param1;
                        stackIn_5_3 = stackIn_7_3;
                        if (bga.field_m != rba.field_a.field_xb) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_8_0 = (sga) ((Object) stackIn_5_0);
                        stackIn_8_1 = stackIn_5_1;
                        stackIn_8_2 = stackIn_5_2;
                        stackIn_8_3 = stackIn_5_3;
                        stackIn_8_4 = 1;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackIn_8_0 = (sga) ((Object) stackIn_7_0);
                        stackIn_8_1 = stackIn_7_1;
                        stackIn_8_2 = stackIn_7_2;
                        stackIn_8_3 = stackIn_7_3;
                        stackIn_8_4 = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var3_int = ((sga) (Object) stackIn_8_0).a(stackIn_8_1, stackIn_8_2, stackIn_8_3, stackIn_8_4 != 0, param2, true) ? 1 : 0;
                        var4 = rba.field_a.field_wb.field_z;
                        var5 = null;
                        if (um.field_c != 2) {
                            statePc = 96;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        ov.field_d.field_u = true;
                        kg.field_d.field_Z = lga.a(true, new String[]{sja.field_gb}, qg.field_c);
                        rba.field_a.field_xb.field_wb.field_Z = null;
                        var6 = null;
                        var7 = (nea) ((Object) var4.b((byte) 90));
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (null == var7) {
                            statePc = 86;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var8 = 0;
                        stackOut_11_0 = (nea) (var7);
                        stackIn_91_0 = stackOut_11_0;
                        stackIn_12_0 = stackOut_11_0;
                        if (var19 != 0) {
                            statePc = 91;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (stackIn_12_0.field_z == null) {
                            statePc = 17;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var7.field_Db = new sna(0L, gi.field_c);
                        var7.a(param0 ^ -1, var7.field_Db);
                        var7.field_Eb = new sna(0L, wv.field_l);
                        var7.a(-1, var7.field_Eb);
                        var7.field_zb = new sna(0L, gi.field_c);
                        var7.a(-1, var7.field_zb);
                        var7.field_Eb.field_N = 2;
                        var8 = 1;
                        var7.d((byte) 121);
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var7.field_sb = rba.field_a.field_wb.field_sb;
                        var9 = 0;
                        if (var7.field_vb == null) {
                            statePc = 24;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var7.field_vb != sja.field_gb) {
                            statePc = 23;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var10 = 52224;
                        var11 = 6750054;
                        if (var19 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var10 = 13421568;
                        var11 = 16777062;
                        if (var19 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var10 = 13369344;
                        var11 = 16737894;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var12 = 0;
                        if (var7.field_Ab == null) {
                            statePc = 30;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (var7.field_Ab.equals("")) {
                            statePc = 30;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var7.field_zb.field_ab = var11;
                        var7.field_zb.field_v = ln.field_x;
                        var12 = 1;
                        var7.field_zb.a(rg.field_h, 31407, 3 + ln.field_x.field_n, 0, var9);
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var7.field_Eb.field_gb = var10;
                        var7.field_Db.field_gb = var10;
                        var7.field_Eb.field_w = var11;
                        var7.field_Db.field_w = var11;
                        var7.field_Eb.field_G = var11;
                        var7.field_Db.field_G = var11;
                        var7.field_Eb.field_ab = var11;
                        var7.field_Db.field_ab = var11;
                        var13 = 0;
                        var14 = -82 + var7.field_sb;
                        if (var12 == 0) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var13 = ln.field_x.field_n + 3;
                        var14 = var14 - var13;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackIn_35_0 = var7.field_Db;
                        stackIn_33_0 = stackIn_35_0;
                        if ((var14 ^ -1) < -1) {
                            statePc = 35;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackIn_36_0 = (sna) ((Object) stackIn_33_0);
                        stackIn_36_1 = var7.field_xb;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        stackIn_36_0 = (sna) ((Object) stackIn_35_0);
                        stackIn_36_1 = po.a(var7.field_Db.field_jb, var7.field_xb, var14);
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        stackIn_36_0.field_Z = stackIn_36_1;
                        var7.field_Db.a(rg.field_h, param0 + 31407, var14, var13, var9);
                        stackIn_39_0 = var7.field_Eb;
                        stackIn_37_0 = stackIn_39_0;
                        if (null != var7.field_vb) {
                            statePc = 39;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        stackIn_40_0 = (sna) ((Object) stackIn_37_0);
                        stackIn_40_1 = aka.field_y;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        stackIn_40_0 = (sna) ((Object) stackIn_39_0);
                        stackIn_40_1 = var7.field_vb;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        stackIn_40_0.field_Z = stackIn_40_1;
                        var7.field_Eb.a(rg.field_h, 31407, 80, var7.field_sb - 80, var9);
                        if (var7.field_Db.field_Z.equals(var7.field_xb)) {
                            statePc = 43;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        stackIn_44_0 = 1;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        stackIn_44_0 = 0;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var15 = stackIn_44_0;
                        var9 = var9 + rg.field_h;
                        if (var3_int != 0) {
                            statePc = 47;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var7.field_hb = var9 - var7.field_p;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (var8 != 0) {
                            statePc = 50;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        rba.field_a.field_wb.a(false, var7, (sna) (var6), 2);
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var6 = var7;
                        if (null == var7.field_zb) {
                            statePc = 58;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (!var7.field_zb.field_T) {
                            statePc = 58;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        jja.field_m = var7.field_Ab;
                        if (var19 == 0) {
                            statePc = 85;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (0 != var7.field_R) {
                            statePc = 70;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (!var7.field_Db.field_T) {
                            statePc = 85;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (var15 != 0) {
                            statePc = 69;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        jja.field_m = var7.field_xb;
                        if (var19 == 0) {
                            statePc = 85;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        var16 = var7.field_xb;
                        mna.a(-1, (int[]) null, 0L, (String) null, var16, -1, -123, rba.field_a.field_xb, var7);
                        if (var7.field_vb == null) {
                            statePc = 84;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (sha.a((byte) -24, ms.field_u.field_j)) {
                            statePc = 84;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (!hl.field_I) {
                            statePc = 79;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        if (!sea.field_j) {
                            statePc = 82;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        var17 = ms.field_u;
                        var18 = lga.a(true, new String[]{var16}, jv.field_m);
                        var17.field_a.a(var18, true, 8);
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        var17 = ms.field_u;
                        var18 = lga.a(true, new String[]{var16}, lga.field_i);
                        var17.field_a.a(var18, true, 18);
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        var5 = var7;
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        var7 = (nea) ((Object) var4.c(0));
                        if (var19 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        if (-1 != (rba.field_a.field_Ab.field_R ^ -1)) {
                            statePc = 89;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        wh.field_p = new oa(rba.field_a.field_Ab.field_D, rba.field_a.field_Ab.field_M, rba.field_a.field_Ab.field_sb, rba.field_a.field_Ab.field_p, uea.field_g, kha.field_i, qs.field_m, qs.field_m);
                        vaa.field_f = 0;
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        stackIn_91_0 = rba.field_a.field_yb;
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        if (((sna) ((Object) stackIn_91_0)).field_R != 0) {
                            statePc = 94;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        wh.field_p = new oa(rba.field_a.field_yb.field_D, rba.field_a.field_yb.field_M, rba.field_a.field_yb.field_sb, rba.field_a.field_yb.field_p, vc.field_f, kha.field_i, qs.field_m, qs.field_m);
                        vaa.field_f = 1;
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        statePc = 103;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        kg.field_d.field_Z = fo.field_b;
                        ov.field_d.field_u = false;
                        if (um.field_c != 1) {
                            statePc = 100;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        rba.field_a.field_xb.field_wb.field_Z = ek.field_m;
                        if (var19 == 0) {
                            statePc = 102;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        rba.field_a.field_xb.field_wb.field_Z = ema.field_Ab;
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        nn.a((byte) -126, rba.field_a.field_wb);
                        statePc = 103;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        stackIn_104_0 = var5;
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 104: {
                    return (nea) ((Object) stackIn_104_0);
                }
                case 105: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    throw pe.a((Throwable) ((Object) var3), "hj.B(" + param0 + ',' + param1 + ',' + param2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    hj(int param0, aga param1) {
        super(param0, param1);
    }

    final ii a(op param0, int param1) {
        aga var3 = null;
        RuntimeException var3_ref = null;
        l var4 = null;
        l stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 3) {
                break L1;
              } else {
                field_p = (sna) null;
                break L1;
              }
            }
            var3 = this.field_h.a(15, param0);
            var4 = new l(this.field_g, new nq(var3));
            stackIn_4_0 = (l) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3_ref);

            stackIn_8_1 = new StringBuilder().append("hj.A(");

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
          throw pe.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return (ii) ((Object) stackIn_4_0);
    }

    public static void c(byte param0) {
        try {
            field_p = null;
            if (param0 >= -80) {
                field_p = (sna) null;
            }
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "hj.D(" + param0 + ')');
        }
    }

    static {
    }
}
