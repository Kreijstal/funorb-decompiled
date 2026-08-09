/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pc extends we {
    static String field_t;
    static int field_q;
    static int field_s;
    private lh field_v;
    static String field_u;
    static String field_x;
    static byte[][] field_w;
    private int field_r;

    pc(int param0) {
        super(param0);
    }

    final void b(byte[] param0, int param1, int param2, int param3) {
        int fieldTemp$1 = 0;
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = Pixelate.field_H ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param3 <= var5_int) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        fieldTemp$1 = this.field_m;
                        this.field_m = this.field_m + 1;
                        param0[var5_int - -param1] = (byte)(this.field_k[fieldTemp$1] + -this.field_v.a(256));
                        var5_int++;
                        if (var6 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var6 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (param2 >= 25) {
                            statePc = 16;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        this.field_v = (lh) null;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_14_0 = (RuntimeException) (runtimeException);
                    stackIn_12_0 = stackIn_14_0;
                    stackIn_14_1 = new StringBuilder().append("pc.AB(");
                    stackIn_12_1 = stackIn_14_1;
                    if (param0 == null) {
                        statePc = 14;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    stackIn_15_0 = (RuntimeException) ((Object) stackIn_12_0);
                    stackIn_15_1 = (StringBuilder) ((Object) stackIn_12_1);
                    stackIn_15_2 = "{...}";
                    statePc = 15;
                    continue stateLoop;
                }
                case 14: {
                    stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
                    stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                    stackIn_15_2 = "null";
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    throw aa.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void g(int param0, int param1) {
        int fieldTemp$1 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param1 == 15514) {
                break L1;
              } else {
                this.f((byte) -21);
                break L1;
              }
            }
            fieldTemp$1 = this.field_m;
            this.field_m = this.field_m + 1;
            this.field_k[fieldTemp$1] = (byte)(param0 + this.field_v.a(256));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "pc.WA(" + param0 + ',' + param1 + ')');
        }
    }

    final static im a(int param0, boolean param1, byte param2) {
        gp stackIn_2_0 = null;
        boolean stackIn_2_1 = false;
        gp stackIn_4_0 = null;
        boolean stackIn_4_1 = false;
        gp stackIn_5_0 = null;
        boolean stackIn_5_1 = false;
        int stackIn_5_2 = 0;
        im stackIn_18_0 = null;
        ak stackIn_43_0 = null;
        ak stackIn_45_0 = null;
        ak stackIn_46_0 = null;
        String stackIn_46_1 = null;
        ak stackIn_47_0 = null;
        ak stackIn_49_0 = null;
        ak stackIn_50_0 = null;
        String stackIn_50_1 = null;
        int stackIn_54_0 = 0;
        Object stackIn_95_0 = null;
        im stackIn_103_0 = null;
        Object stackIn_105_0 = null;
        int decompiledRegionSelector0 = 0;
        im stackOut_17_0;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        bb var4 = null;
        Object var5 = null;
        Object var6 = null;
        im var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String var16 = null;
        wi var17 = null;
        String var18 = null;
        int var19 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = Pixelate.field_H ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        stackIn_4_0 = ma.field_z.field_Gb;
                        stackIn_2_0 = stackIn_4_0;
                        stackIn_4_1 = param1;
                        stackIn_2_1 = stackIn_4_1;
                        if (bj.field_d != ma.field_z.field_Gb) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_5_0 = (gp) ((Object) stackIn_2_0);
                        stackIn_5_1 = stackIn_2_1;
                        stackIn_5_2 = 1;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackIn_5_0 = (gp) ((Object) stackIn_4_0);
                        stackIn_5_1 = stackIn_4_1;
                        stackIn_5_2 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var3_int = ((gp) (Object) stackIn_5_0).a(stackIn_5_1, stackIn_5_2 != 0, 2, param0 * (3 * fq.field_q + 6), 0, 2 + fq.field_q) ? 1 : 0;
                        var4 = ma.field_z.field_Fb.field_L;
                        var5 = null;
                        if ((gk.field_db ^ -1) == -3) {
                            statePc = 15;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        wa.field_f.field_rb = false;
                        ak.field_E.field_cb = wd.field_b;
                        if ((gk.field_db ^ -1) == -2) {
                            statePc = 12;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        ma.field_z.field_Gb.field_Ib.field_cb = mk.field_c;
                        if (var19 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        ma.field_z.field_Gb.field_Ib.field_cb = ih.field_d;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        wd.a(ma.field_z.field_Fb, false);
                        if (var19 == 0) {
                            statePc = 101;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        wa.field_f.field_rb = true;
                        ak.field_E.field_cb = sd.a(ke.field_e, 78, new String[]{qp.field_L});
                        ma.field_z.field_Gb.field_Ib.field_cb = null;
                        var6 = null;
                        var7 = (im) ((Object) var4.c(1504642273));
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var7 == null) {
                            statePc = 94;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var8 = 0;
                        stackOut_17_0 = (im) (var7);
                        stackIn_95_0 = stackOut_17_0;
                        stackIn_18_0 = stackOut_17_0;
                        if (var19 != 0) {
                            statePc = 95;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (stackIn_18_0.field_L == null) {
                            statePc = 23;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var7.field_Pb = new ak(0L, ak.field_T);
                        var7.a(var7.field_Pb, (byte) 26);
                        var7.field_Eb = new ak(0L, of.field_i);
                        var7.a(var7.field_Eb, (byte) 26);
                        var7.field_Ob = new ak(0L, ak.field_T);
                        var7.a(var7.field_Ob, (byte) 26);
                        var7.field_Eb.field_Bb = 2;
                        var7.h(-257);
                        var8 = 1;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var7.field_K = ma.field_z.field_Fb.field_K;
                        var9 = 0;
                        if (null == var7.field_Nb) {
                            statePc = 30;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (var7.field_Nb != qp.field_L) {
                            statePc = 29;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var11 = 6750054;
                        var10 = 52224;
                        if (var19 == 0) {
                            statePc = 31;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var10 = 13421568;
                        var11 = 16777062;
                        if (var19 == 0) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var11 = 16737894;
                        var10 = 13369344;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var12 = 0;
                        if (null == var7.field_Gb) {
                            statePc = 38;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (!var7.field_Gb.equals("")) {
                            statePc = 37;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var7.field_Ob.field_y = var11;
                        var7.field_Ob.field_H = dk.field_e;
                        var7.field_Ob.a(var9, fq.field_q, 0, 256, 3 + dk.field_e.field_A);
                        var12 = 1;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var7.field_Eb.field_y = var11;
                        var7.field_Pb.field_y = var11;
                        var7.field_Eb.field_N = var10;
                        var7.field_Pb.field_N = var10;
                        var7.field_Eb.field_pb = var11;
                        var7.field_Pb.field_pb = var11;
                        var7.field_Eb.field_Cb = var11;
                        var7.field_Pb.field_Cb = var11;
                        var13 = 0;
                        var14 = var7.field_K + -82;
                        if (var12 != 0) {
                            statePc = 41;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var13 = dk.field_e.field_A - -3;
                        var14 = var14 - var13;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        stackIn_45_0 = var7.field_Pb;
                        stackIn_43_0 = stackIn_45_0;
                        if (var14 > 0) {
                            statePc = 45;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        stackIn_46_0 = (ak) ((Object) stackIn_43_0);
                        stackIn_46_1 = var7.field_Fb;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        stackIn_46_0 = (ak) ((Object) stackIn_45_0);
                        stackIn_46_1 = jl.a(var7.field_Pb.field_Db, var7.field_Fb, var14);
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        stackIn_46_0.field_cb = stackIn_46_1;
                        var7.field_Pb.a(var9, fq.field_q, var13, 256, var14);
                        stackIn_49_0 = var7.field_Eb;
                        stackIn_47_0 = stackIn_49_0;
                        if (null != var7.field_Nb) {
                            statePc = 49;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        stackIn_50_0 = (ak) ((Object) stackIn_47_0);
                        stackIn_50_1 = re.field_g;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        stackIn_50_0 = (ak) ((Object) stackIn_49_0);
                        stackIn_50_1 = var7.field_Nb;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        stackIn_50_0.field_cb = stackIn_50_1;
                        var7.field_Eb.a(var9, fq.field_q, -80 + var7.field_K, 256, 80);
                        if (var7.field_Pb.field_cb.equals(var7.field_Fb)) {
                            statePc = 53;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        stackIn_54_0 = 1;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        stackIn_54_0 = 0;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var15 = stackIn_54_0;
                        var9 = var9 + fq.field_q;
                        if (var3_int != 0) {
                            statePc = 57;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var7.field_Z = -var7.field_nb + var9;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (var8 == 0) {
                            statePc = 60;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        ma.field_z.field_Fb.a(var7, 2, -1, (ak) (var6));
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var6 = var7;
                        if (var7.field_Ob == null) {
                            statePc = 67;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (!var7.field_Ob.field_W) {
                            statePc = 67;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        up.field_o = var7.field_Gb;
                        if (var19 == 0) {
                            statePc = 93;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (0 != var7.field_P) {
                            statePc = 79;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if (!var7.field_Pb.field_W) {
                            statePc = 93;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if (var15 == 0) {
                            statePc = 93;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        up.field_o = var7.field_Fb;
                        if (var19 == 0) {
                            statePc = 93;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        var16 = var7.field_Fb;
                        em.a((String) null, 0L, var16, -1, var7, -163, ma.field_z.field_Gb, (int[]) null, -1);
                        var5 = var7;
                        if (var7.field_Nb == null) {
                            statePc = 93;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if (ul.a(75, eg.field_n.field_h)) {
                            statePc = 93;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        if (ln.field_q) {
                            statePc = 93;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        if (!lh.field_g) {
                            statePc = 91;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        var17 = eg.field_n;
                        var18 = sd.a(nf.field_e, 46, new String[]{var16});
                        var17.field_b.a(var18, (byte) -105, 8);
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        var17 = eg.field_n;
                        var18 = sd.a(ho.field_f, 101, new String[]{var16});
                        var17.field_b.a(var18, (byte) -102, 18);
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        var7 = (im) ((Object) var4.f(1504642273));
                        if (var19 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        stackIn_95_0 = ma.field_z.field_Ib;
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        if ((((ak) ((Object) stackIn_95_0)).field_P ^ -1) == -1) {
                            statePc = 98;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        he.field_f = new ve(ma.field_z.field_Ib.field_tb, ma.field_z.field_Ib.field_gb, ma.field_z.field_Ib.field_K, ma.field_z.field_Ib.field_nb, jj.field_j, po.field_c, mg.field_h, mg.field_h);
                        il.field_e = 0;
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        if ((ma.field_z.field_Hb.field_P ^ -1) == -1) {
                            statePc = 101;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        he.field_f = new ve(ma.field_z.field_Hb.field_tb, ma.field_z.field_Hb.field_gb, ma.field_z.field_Hb.field_K, ma.field_z.field_Hb.field_nb, hp.field_Fb, po.field_c, mg.field_h, mg.field_h);
                        il.field_e = 1;
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        if (param2 >= 47) {
                            statePc = 104;
                        } else {
                            statePc = 102;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        stackIn_103_0 = (im) null;
                        statePc = 103;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 103: {
                    return stackIn_103_0;
                }
                case 104: {
                    try {
                        stackIn_105_0 = var5;
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 105: {
                    return (im) ((Object) stackIn_105_0);
                }
                case 106: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    throw aa.a((Throwable) ((Object) var3), "pc.TA(" + param0 + ',' + param1 + ',' + param2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void o(int param0) {
        try {
            this.field_m = (param0 + this.field_r) / 8;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "pc.BB(" + param0 + ')');
        }
    }

    final void a(int param0, int[] param1) {
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
              if (param0 == 0) {
                break L1;
              } else {
                field_t = (String) null;
                break L1;
              }
            }
            this.field_v = new lh(param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("pc.EB(").append(param0).append(',');

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
          throw aa.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    pc(byte[] param0) {
        super(param0);
    }

    final static boolean a(String param0, byte param1, String param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -47) {
                break L1;
              } else {
                field_q = -19;
                break L1;
              }
            }
            L2: {
              L3: {
                param2 = ub.a(param2, param1 ^ -47, "", '_');
                var3 = bc.b(0, param0);
                if (0 != (param2.indexOf(param0) ^ -1)) {
                  break L3;
                } else {
                  if (param2.indexOf(var3) == -1) {
                    stackIn_10_0 = 0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackIn_10_0 = 1;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3_ref);

            stackIn_14_1 = new StringBuilder().append("pc.CB(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_15_0), stackIn_19_2 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final void n(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (param0 < -2) {
                break L1;
              } else {
                pc.a((String) null, (byte) -7, (String) null);
                break L1;
              }
            }
            this.field_r = this.field_m * 8;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "pc.VA(" + param0 + ')');
        }
    }

    final int f(byte param0) {
        int fieldTemp$1 = 0;
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > 83) {
                break L1;
              } else {
                field_q = -104;
                break L1;
              }
            }
            fieldTemp$1 = this.field_m;
            this.field_m = this.field_m + 1;
            stackIn_4_0 = 255 & this.field_k[fieldTemp$1] + -this.field_v.a(256);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "pc.UA(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final int c(int param0, byte param1) {
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_14_0 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = Pixelate.field_H ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3_int = this.field_r >> 2128391779;
                        if (param1 == -34) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = 65;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    try {
                        var4 = 8 + -(7 & this.field_r);
                        var5 = 0;
                        this.field_r = this.field_r + param0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((var4 ^ -1) <= (param0 ^ -1)) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        incrementValue$1 = var3_int;
                        var3_int++;
                        var5 = var5 + ((pk.field_a[var4] & this.field_k[incrementValue$1]) << param0 + -var4);
                        param0 = param0 - var4;
                        var4 = 8;
                        if (var6 != 0) {
                            statePc = 12;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var6 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if ((param0 ^ -1) == (var4 ^ -1)) {
                            statePc = 12;
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
                        var5 = var5 + (this.field_k[var3_int] >> -param0 + var4 & pk.field_a[param0]);
                        if (var6 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var5 = var5 + (this.field_k[var3_int] & pk.field_a[var4]);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackIn_14_0 = var5;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 14: {
                    return stackIn_14_0;
                }
                case 15: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    throw aa.a((Throwable) ((Object) var3), "pc.DB(" + param0 + ',' + param1 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void m(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              field_t = null;
              if (param0 == 25208) {
                break L1;
              } else {
                field_x = (String) null;
                break L1;
              }
            }
            field_w = (byte[][]) null;
            field_x = null;
            field_u = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "pc.SA(" + param0 + ')');
        }
    }

    static {
        field_t = "Invite only";
        field_s = 250;
        field_u = "Some players haven't unlocked the currently selected game options.<br>Please see the player list on the left for details.";
        field_x = "Loading fonts";
        field_w = new byte[50][];
    }
}
