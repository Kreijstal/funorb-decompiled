/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ba {
    static int field_c;
    static String field_a;
    static String field_b;

    public static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                field_c = 101;
                break L1;
              }
            }
            field_a = null;
            field_b = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1), "ba.A(" + param0 + ')');
        }
    }

    final static void a(qr param0, qr param1, int param2, qr param3, ur param4, qr param5, qr param6, qr param7, boolean param8, nq param9, qr param10, qr param11) {
        int stackIn_7_0 = 0;
        String stackIn_16_0 = null;
        int stackIn_34_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_62_2 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_66_2 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_82_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        bi var12 = null;
        RuntimeException var12_ref = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        bi[] var16 = null;
        qr var17 = null;
        int var18 = 0;
        String var19 = null;
        int var20 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var20 = ShatteredPlansClient.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ke.field_q[4] = 16711935;
                        ke.field_q[1] = 6356832;
                        ho.field_f = param9;
                        ke.field_q[0] = 16764000;
                        bh.field_k = param11;
                        je.field_e = param8;
                        ke.field_q[2] = 9474303;
                        ke.field_q[3] = 16736511;
                        hd.field_l[1] = 6356832;
                        ke.field_q[4] = 16711935;
                        ho.field_c = 8421504;
                        if (param2 > 122) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_a = (String) null;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        hd.field_l[3] = 16736511;
                        hd.field_l[0] = 16764000;
                        hd.field_l[2] = 16736352;
                        var12 = new bi(4, 4);
                        var13 = var12.field_B;
                        var14 = var12.field_B;
                        var15 = var12.field_B;
                        var12.field_B[15] = 7368816;
                        var14[5] = 7368816;
                        var15[8] = 7368816;
                        var13[2] = 7368816;
                        var16 = new bi[9];
                        var16[4] = var12;
                        tg.field_c = new qr(0L, param7);
                        ad.field_c = new qr(0L, param6);
                        tg.field_c.a(4, ad.field_c);
                        var17 = new qr(0L, (qr) null);
                        var17.field_M = new pf();
                        ji.field_I = new ub(0L, var17, param1, param4);
                        ad.field_c.a(4, ji.field_I);
                        hi.field_o = new qr(0L, param3);
                        ad.field_c.a(4, hi.field_o);
                        uq.field_j = new qr(0L, param10);
                        uq.field_j.field_nb = ho.field_f;
                        hi.field_o.a(4, uq.field_j);
                        hi.field_o.e((byte) -128);
                        cg.field_C = new qr(0L, (qr) null);
                        cg.field_C.field_F = var16;
                        hi.field_o.a(4, cg.field_C);
                        mr.field_d = new qr[5];
                        tb.field_a = new qr[5];
                        n.field_n = new qr[5];
                        oq.field_b = new qr[5];
                        var18 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((var18 ^ -1) <= -6) {
                            statePc = 33;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackIn_34_0 = -1;
                        stackIn_7_0 = stackIn_34_0;
                        if (var20 != 0) {
                            statePc = 34;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (stackIn_7_0 != (var18 ^ -1)) {
                            statePc = 17;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (!je.field_e) {
                            statePc = 15;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackIn_16_0 = ds.field_a;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackIn_16_0 = tr.field_Fb;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var19 = stackIn_16_0;
                        if (var20 == 0) {
                            statePc = 31;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if ((var18 ^ -1) != -2) {
                            statePc = 23;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (je.field_e) {
                            statePc = 30;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (2 == var18) {
                            statePc = 29;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (var20 == 0) {
                            statePc = 32;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var19 = jd.field_e;
                        if (var20 == 0) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var19 = jo.field_c;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        oq.field_b[var18] = new qr(0L, param5);
                        tb.field_a[var18] = new qr(0L, bh.field_k, var19);
                        mr.field_d[var18] = new qr(0L, (qr) null);
                        mr.field_d[var18].field_G = 1;
                        n.field_n[var18] = new qr(0L, bh.field_k);
                        n.field_n[var18].field_G = 1;
                        oq.field_b[var18].a(4, tb.field_a[var18]);
                        oq.field_b[var18].a(4, mr.field_d[var18]);
                        oq.field_b[var18].a(4, n.field_n[var18]);
                        oq.field_b[var18].e((byte) -126);
                        tg.field_c.a(4, oq.field_b[var18]);
                        gq.field_d = gq.field_d + 1;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var18++;
                        if (var20 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        pr.field_c = new qr(0L, param0);
                        pr.field_c.field_z = dk.field_c;
                        tg.field_c.a(4, pr.field_c);
                        stackIn_34_0 = cb.b((byte) -121) ? 1 : 0;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (stackIn_34_0 == 0) {
                            statePc = 40;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (bg.field_g) {
                            statePc = 40;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        wi.field_c = new eh(0, 0, 0, 0);
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 42: {
                    var12_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_45_0 = (RuntimeException) (var12_ref);
                    stackIn_43_0 = stackIn_45_0;
                    stackIn_45_1 = new StringBuilder().append("ba.B(");
                    stackIn_43_1 = stackIn_45_1;
                    if (param0 == null) {
                        statePc = 45;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    stackIn_46_0 = (RuntimeException) ((Object) stackIn_43_0);
                    stackIn_46_1 = (StringBuilder) ((Object) stackIn_43_1);
                    stackIn_46_2 = "{...}";
                    statePc = 46;
                    continue stateLoop;
                }
                case 45: {
                    stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
                    stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
                    stackIn_46_2 = "null";
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    stackIn_49_0 = (RuntimeException) ((Object) stackIn_46_0);
                    stackIn_47_0 = stackIn_49_0;
                    stackIn_49_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_46_2).append(',');
                    stackIn_47_1 = stackIn_49_1;
                    if (param1 == null) {
                        statePc = 49;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    stackIn_50_0 = (RuntimeException) ((Object) stackIn_47_0);
                    stackIn_50_1 = (StringBuilder) ((Object) stackIn_47_1);
                    stackIn_50_2 = "{...}";
                    statePc = 50;
                    continue stateLoop;
                }
                case 49: {
                    stackIn_50_0 = (RuntimeException) ((Object) stackIn_49_0);
                    stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
                    stackIn_50_2 = "null";
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    stackIn_53_0 = (RuntimeException) ((Object) stackIn_50_0);
                    stackIn_51_0 = stackIn_53_0;
                    stackIn_53_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_50_2).append(',').append(param2).append(',');
                    stackIn_51_1 = stackIn_53_1;
                    if (param3 == null) {
                        statePc = 53;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    stackIn_54_0 = (RuntimeException) ((Object) stackIn_51_0);
                    stackIn_54_1 = (StringBuilder) ((Object) stackIn_51_1);
                    stackIn_54_2 = "{...}";
                    statePc = 54;
                    continue stateLoop;
                }
                case 53: {
                    stackIn_54_0 = (RuntimeException) ((Object) stackIn_53_0);
                    stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
                    stackIn_54_2 = "null";
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    stackIn_57_0 = (RuntimeException) ((Object) stackIn_54_0);
                    stackIn_55_0 = stackIn_57_0;
                    stackIn_57_1 = ((StringBuilder) (Object) stackIn_54_1).append(stackIn_54_2).append(',');
                    stackIn_55_1 = stackIn_57_1;
                    if (param4 == null) {
                        statePc = 57;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    stackIn_58_0 = (RuntimeException) ((Object) stackIn_55_0);
                    stackIn_58_1 = (StringBuilder) ((Object) stackIn_55_1);
                    stackIn_58_2 = "{...}";
                    statePc = 58;
                    continue stateLoop;
                }
                case 57: {
                    stackIn_58_0 = (RuntimeException) ((Object) stackIn_57_0);
                    stackIn_58_1 = (StringBuilder) ((Object) stackIn_57_1);
                    stackIn_58_2 = "null";
                    statePc = 58;
                    continue stateLoop;
                }
                case 58: {
                    stackIn_61_0 = (RuntimeException) ((Object) stackIn_58_0);
                    stackIn_59_0 = stackIn_61_0;
                    stackIn_61_1 = ((StringBuilder) (Object) stackIn_58_1).append(stackIn_58_2).append(',');
                    stackIn_59_1 = stackIn_61_1;
                    if (param5 == null) {
                        statePc = 61;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    stackIn_62_0 = (RuntimeException) ((Object) stackIn_59_0);
                    stackIn_62_1 = (StringBuilder) ((Object) stackIn_59_1);
                    stackIn_62_2 = "{...}";
                    statePc = 62;
                    continue stateLoop;
                }
                case 61: {
                    stackIn_62_0 = (RuntimeException) ((Object) stackIn_61_0);
                    stackIn_62_1 = (StringBuilder) ((Object) stackIn_61_1);
                    stackIn_62_2 = "null";
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    stackIn_65_0 = (RuntimeException) ((Object) stackIn_62_0);
                    stackIn_63_0 = stackIn_65_0;
                    stackIn_65_1 = ((StringBuilder) (Object) stackIn_62_1).append(stackIn_62_2).append(',');
                    stackIn_63_1 = stackIn_65_1;
                    if (param6 == null) {
                        statePc = 65;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    stackIn_66_0 = (RuntimeException) ((Object) stackIn_63_0);
                    stackIn_66_1 = (StringBuilder) ((Object) stackIn_63_1);
                    stackIn_66_2 = "{...}";
                    statePc = 66;
                    continue stateLoop;
                }
                case 65: {
                    stackIn_66_0 = (RuntimeException) ((Object) stackIn_65_0);
                    stackIn_66_1 = (StringBuilder) ((Object) stackIn_65_1);
                    stackIn_66_2 = "null";
                    statePc = 66;
                    continue stateLoop;
                }
                case 66: {
                    stackIn_69_0 = (RuntimeException) ((Object) stackIn_66_0);
                    stackIn_67_0 = stackIn_69_0;
                    stackIn_69_1 = ((StringBuilder) (Object) stackIn_66_1).append(stackIn_66_2).append(',');
                    stackIn_67_1 = stackIn_69_1;
                    if (param7 == null) {
                        statePc = 69;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    stackIn_70_0 = (RuntimeException) ((Object) stackIn_67_0);
                    stackIn_70_1 = (StringBuilder) ((Object) stackIn_67_1);
                    stackIn_70_2 = "{...}";
                    statePc = 70;
                    continue stateLoop;
                }
                case 69: {
                    stackIn_70_0 = (RuntimeException) ((Object) stackIn_69_0);
                    stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
                    stackIn_70_2 = "null";
                    statePc = 70;
                    continue stateLoop;
                }
                case 70: {
                    stackIn_73_0 = (RuntimeException) ((Object) stackIn_70_0);
                    stackIn_71_0 = stackIn_73_0;
                    stackIn_73_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(',').append(param8).append(',');
                    stackIn_71_1 = stackIn_73_1;
                    if (param9 == null) {
                        statePc = 73;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    stackIn_74_0 = (RuntimeException) ((Object) stackIn_71_0);
                    stackIn_74_1 = (StringBuilder) ((Object) stackIn_71_1);
                    stackIn_74_2 = "{...}";
                    statePc = 74;
                    continue stateLoop;
                }
                case 73: {
                    stackIn_74_0 = (RuntimeException) ((Object) stackIn_73_0);
                    stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
                    stackIn_74_2 = "null";
                    statePc = 74;
                    continue stateLoop;
                }
                case 74: {
                    stackIn_77_0 = (RuntimeException) ((Object) stackIn_74_0);
                    stackIn_75_0 = stackIn_77_0;
                    stackIn_77_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_74_2).append(',');
                    stackIn_75_1 = stackIn_77_1;
                    if (param10 == null) {
                        statePc = 77;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    stackIn_78_0 = (RuntimeException) ((Object) stackIn_75_0);
                    stackIn_78_1 = (StringBuilder) ((Object) stackIn_75_1);
                    stackIn_78_2 = "{...}";
                    statePc = 78;
                    continue stateLoop;
                }
                case 77: {
                    stackIn_78_0 = (RuntimeException) ((Object) stackIn_77_0);
                    stackIn_78_1 = (StringBuilder) ((Object) stackIn_77_1);
                    stackIn_78_2 = "null";
                    statePc = 78;
                    continue stateLoop;
                }
                case 78: {
                    stackIn_81_0 = (RuntimeException) ((Object) stackIn_78_0);
                    stackIn_79_0 = stackIn_81_0;
                    stackIn_81_1 = ((StringBuilder) (Object) stackIn_78_1).append(stackIn_78_2).append(',');
                    stackIn_79_1 = stackIn_81_1;
                    if (param11 == null) {
                        statePc = 81;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    stackIn_82_0 = (RuntimeException) ((Object) stackIn_79_0);
                    stackIn_82_1 = (StringBuilder) ((Object) stackIn_79_1);
                    stackIn_82_2 = "{...}";
                    statePc = 82;
                    continue stateLoop;
                }
                case 81: {
                    stackIn_82_0 = (RuntimeException) ((Object) stackIn_81_0);
                    stackIn_82_1 = (StringBuilder) ((Object) stackIn_81_1);
                    stackIn_82_2 = "null";
                    statePc = 82;
                    continue stateLoop;
                }
                case 82: {
                    throw r.a((Throwable) ((Object) stackIn_82_0), stackIn_82_2 + ')');
                }
                case 83: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_b = "Username: ";
        field_a = "Fleet Info";
    }
}
