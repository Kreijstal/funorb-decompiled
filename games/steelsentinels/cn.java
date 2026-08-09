/*
 * Decompiled by CFR-JS 0.4.0.
 */
class cn implements qk, eg {
    int field_a;
    static boolean field_l;
    int field_h;
    int field_d;
    mi field_f;
    int field_m;
    private int field_g;
    private boolean field_i;
    int field_b;
    int field_k;
    int field_n;
    int field_j;
    int field_e;
    int field_c;

    public void a(int param0, lh param1, byte param2, boolean param3, int param4) {
        if (param2 != -30) {
            return;
        }
        if (this.field_f == null) {
            return;
        }
        try {
            this.a(param4, param0, param1, 118);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "cn.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final int d(int param0, lh param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -3) {
                break L1;
              } else {
                this.field_f = (mi) null;
                break L1;
              }
            }
            stackIn_3_0 = -this.field_h + param1.field_E + -this.field_d;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("cn.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(int param0, boolean param1, boolean param2, boolean param3, int param4) {
        gh stackIn_17_0 = null;
        gh stackIn_18_0 = null;
        gh stackIn_19_0 = null;
        gh stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_36_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_43_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_53_1 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackIn_61_0 = 0;
        int stackIn_67_0 = 0;
        boolean stackIn_76_0 = false;
        int stackIn_83_0 = 0;
        Object stackIn_99_0 = null;
        boolean stackIn_125_0 = false;
        int stackIn_141_0 = 0;
        gh stackIn_161_0 = null;
        int stackIn_161_1 = 0;
        gh stackIn_162_0 = null;
        int stackIn_162_1 = 0;
        gh stackIn_163_0 = null;
        int stackIn_163_1 = 0;
        gh stackIn_164_0 = null;
        int stackIn_164_1 = 0;
        gh stackIn_165_0 = null;
        int stackIn_165_1 = 0;
        int stackIn_165_2 = 0;
        gh stackIn_166_0 = null;
        int stackIn_166_1 = 0;
        gh stackIn_167_0 = null;
        int stackIn_167_1 = 0;
        gh stackIn_168_0 = null;
        int stackIn_168_1 = 0;
        gh stackIn_169_0 = null;
        int stackIn_169_1 = 0;
        gh stackIn_170_0 = null;
        int stackIn_170_1 = 0;
        int stackIn_170_2 = 0;
        gh stackIn_173_0 = null;
        int stackIn_173_1 = 0;
        gh stackIn_174_0 = null;
        int stackIn_174_1 = 0;
        gh stackIn_175_0 = null;
        int stackIn_175_1 = 0;
        gh stackIn_176_0 = null;
        int stackIn_176_1 = 0;
        gh stackIn_177_0 = null;
        int stackIn_177_1 = 0;
        int stackIn_177_2 = 0;
        Object stackIn_178_0 = null;
        boolean stackOut_75_0;
        boolean stackOut_124_0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var5 = null;
        gh var6 = null;
        gh var7 = null;
        gh var8 = null;
        String var9_ref_String = null;
        int var9 = 0;
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
        ul var17 = null;
        Object var18 = null;
        int var18_int = 0;
        cc var18_ref = null;
        int var19 = 0;
        int[] var20 = null;
        gh var22 = null;
        int[] var23 = null;
        String var24 = null;
        int[] var25 = null;
        gh var26 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var18 = null;
                    var19 = SteelSentinels.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        vb.a((byte) 48, fj.field_f);
                        if (null != nf.field_b) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 160;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        mn.field_E.field_T = true;
                        var22 = rn.field_C;
                        var26 = var22;
                        rn.field_C.field_Lb = 0;
                        var26.field_zb = 0;
                        fk.field_q.field_Lb = 0;
                        var6 = fk.field_q;
                        var6.field_zb = 0;
                        var7 = rh.field_w;
                        rh.field_w.field_Lb = 0;
                        var7.field_zb = 0;
                        if (kk.a(-28548)) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var9_ref_String = nf.field_b.field_Xb;
                        nm.field_q.field_S = db.a(pd.field_ab, -40, new String[]{var9_ref_String}).toUpperCase();
                        rh.field_w.a(0, gl.field_y.field_Lb + -40, 40, 0, gl.field_y.field_zb);
                        rh.field_w.field_S = db.a(jj.field_f, -108, new String[]{var9_ref_String});
                        var8 = rh.field_w;
                        if (var19 == 0) {
                            statePc = 153;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        nm.field_q.field_S = a.field_f.toUpperCase();
                        var9 = (2 + gl.field_y.field_zb) / 2;
                        rn.field_C.a(0, gl.field_y.field_Lb + -40, 40, 0, -2 + var9);
                        if (nf.field_b.field_wc >= nf.field_b.field_Ub) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        rn.field_C.field_S = he.field_j.toUpperCase();
                        rn.field_C.field_T = true;
                        if (var19 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        rn.field_C.field_S = pe.field_U.toUpperCase();
                        rn.field_C.field_T = false;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        rn.field_C.field_I = rm.field_j.field_I;
                        if (ja.field_a <= 0) {
                            statePc = 16;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (1 == ja.field_a) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var10_ref_String = db.a(sj.field_B, param0 + -83, new String[]{Integer.toString(ja.field_a)});
                        if (var19 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var10_ref_String = ih.field_o;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        rn.field_C.field_S = rn.field_C.field_S + "<br>" + var10_ref_String;
                        if ((16 & qa.field_H) != 0) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (vb.field_c) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        rn.field_C.field_I = rm.field_j.field_Ab;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        fk.field_q.a(0, -40 + gl.field_y.field_Lb, 40, var9, -var9 + gl.field_y.field_zb);
                        fk.field_q.field_S = jk.field_b.toUpperCase();
                        stackIn_19_0 = fk.field_q;
                        stackIn_17_0 = stackIn_19_0;
                        if (!param3) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackIn_19_0 = (gh) ((Object) stackIn_17_0);
                        stackIn_18_0 = stackIn_19_0;
                        if (ka.field_R != 0L) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackIn_20_0 = (gh) ((Object) stackIn_18_0);
                        stackIn_20_1 = 1;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackIn_20_0 = (gh) ((Object) stackIn_19_0);
                        stackIn_20_1 = 0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackIn_20_0.field_T = stackIn_20_1 != 0;
                        var8 = fk.field_q;
                        var10 = 2;
                        if (null == m.field_b) {
                            statePc = 71;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (null != dl.field_O) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        dl.field_O = new byte[be.field_a];
                        m.field_h = new boolean[be.field_a];
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var11 = 0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (be.field_a <= var11) {
                            statePc = 28;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        m.field_h[var11] = false;
                        var11++;
                        if (var19 != 0) {
                            statePc = 29;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (var19 == 0) {
                            statePc = 24;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var10 = 0;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if ((var10 ^ -1) <= -3) {
                            statePc = 66;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var11 = 0;
                        stackIn_67_0 = 0;
                        stackIn_32_0 = stackIn_67_0;
                        if (var19 != 0) {
                            statePc = 67;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var12 = stackIn_32_0;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackIn_34_0 = var12 ^ -1;
                        stackIn_34_1 = m.field_b.length ^ -1;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (stackIn_34_0 <= stackIn_34_1) {
                            statePc = 60;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var25 = m.field_b[var12];
                        var23 = var25;
                        var20 = var23;
                        var13_ref_int__ = var20;
                        stackIn_61_0 = 0;
                        stackIn_36_0 = stackIn_61_0;
                        if (var19 != 0) {
                            statePc = 61;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var14 = stackIn_36_0;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if ((var14 ^ -1) <= (var25.length ^ -1)) {
                            statePc = 51;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var15 = var25[var14];
                        var16 = var20[var14 + 1];
                        stackIn_53_0 = var15;
                        stackIn_39_0 = stackIn_53_0;
                        stackIn_53_1 = -1;
                        stackIn_39_1 = stackIn_53_1;
                        if (var19 != 0) {
                            statePc = 53;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (stackIn_39_0 != stackIn_39_1) {
                            statePc = 46;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (0 != var10) {
                            statePc = 42;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        stackIn_43_0 = nf.field_b.field_Ub;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        stackIn_43_0 = nf.field_b.field_wc;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var17_int = stackIn_43_0;
                        if (var16 != var17_int) {
                            statePc = 59;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (var19 == 0) {
                            statePc = 49;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if ((var16 ^ -1) == (255 & nf.field_b.field_Sb[var15] ^ -1)) {
                            statePc = 49;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (var19 == 0) {
                            statePc = 59;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var14 += 2;
                        if (var19 == 0) {
                            statePc = 37;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var11 = 1;
                        var14 = -1;
                        var15 = 0;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        stackIn_53_0 = var15 ^ -1;
                        stackIn_53_1 = var25.length ^ -1;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (stackIn_53_0 <= stackIn_53_1) {
                            statePc = 58;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var16 = var25[var15];
                        stackIn_34_0 = var16 ^ -1;
                        stackIn_55_0 = stackIn_34_0;
                        stackIn_34_1 = var14 ^ -1;
                        stackIn_55_1 = stackIn_34_1;
                        if (var19 != 0) {
                            statePc = 34;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (stackIn_55_0 >= stackIn_55_1) {
                            statePc = 57;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        var14 = var16;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        var15 += 2;
                        if (var19 == 0) {
                            statePc = 52;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        m.field_h[var14] = true;
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var12++;
                        if (var19 == 0) {
                            statePc = 33;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        stackIn_61_0 = var11;
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (stackIn_61_0 == 0) {
                            statePc = 64;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (var19 == 0) {
                            statePc = 66;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        var10++;
                        if (var19 == 0) {
                            statePc = 30;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        stackIn_67_0 = ul.field_d ^ -1;
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (stackIn_67_0 > -3) {
                            statePc = 71;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if (fc.field_e[12]) {
                            statePc = 70;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        var10 = 2;
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if ((var10 ^ -1) <= -3) {
                            statePc = 91;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        fk.field_q.field_T = false;
                        if (!fk.field_q.field_K) {
                            statePc = 153;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        var11_ref = null;
                        var12 = 0;
                        var13 = 0;
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if ((var13 ^ -1) <= (be.field_a ^ -1)) {
                            statePc = 82;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        stackOut_75_0 = m.field_h[var13];
                        stackIn_83_0 = stackOut_75_0 ? 1 : 0;
                        stackIn_76_0 = stackOut_75_0;
                        if (var19 != 0) {
                            statePc = 83;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if (stackIn_76_0) {
                            statePc = 78;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        var24 = "<col=A00000>" + al.field_a[var13] + "</col>";
                        if (var11_ref == null) {
                            statePc = 80;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        var11_ref = (String) (var11_ref) + ", " + var24;
                        var12 = 1;
                        if (var19 == 0) {
                            statePc = 81;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        var11_ref = var24;
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        var13++;
                        if (var19 == 0) {
                            statePc = 74;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        stackIn_83_0 = -1;
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        if (stackIn_83_0 == (var10 ^ -1)) {
                            statePc = 87;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        var13_ref_String = ib.field_a;
                        if (var12 == 0) {
                            statePc = 86;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        var14_ref_String = pc.field_r + (String) (var11_ref);
                        if (var19 == 0) {
                            statePc = 90;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        var14_ref_String = db.a(hf.field_f, -113, new String[]{(String) (var11_ref)});
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        var13_ref_String = jf.field_gb;
                        if (var12 == 0) {
                            statePc = 89;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        var14_ref_String = ei.field_v + (String) (var11_ref);
                        if (var19 == 0) {
                            statePc = 90;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        var14_ref_String = db.a(il.field_b, -61, new String[]{(String) (var11_ref)});
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        ll.field_i = "<col=A00000>" + var13_ref_String + "<br>" + var14_ref_String;
                        if (var19 == 0) {
                            statePc = 153;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        if (null != ad.field_d) {
                            statePc = 96;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        if (ja.field_b != null) {
                            statePc = 96;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        if (null != ol.field_cc) {
                            statePc = 96;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        if (null == fc.field_b) {
                            statePc = 153;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        var11 = 0;
                        var12 = 0;
                        var13 = 0;
                        var14 = 0;
                        var15 = 0;
                        var16 = 0;
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        if (be.field_a <= var16) {
                            statePc = 122;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        var17_int = 255 & nf.field_b.field_Sb[var16];
                        stackIn_178_0 = null;
                        stackIn_99_0 = stackIn_178_0;
                        if (var19 != 0) {
                            statePc = 178;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        if (stackIn_99_0 == ad.field_d) {
                            statePc = 103;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        if (null == ad.field_d[var16]) {
                            statePc = 103;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        if (!ad.field_d[var16][var17_int]) {
                            statePc = 103;
                        } else {
                            statePc = 102;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        var11 = 1;
                        statePc = 103;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        if (ja.field_b == null) {
                            statePc = 110;
                        } else {
                            statePc = 104;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        if (null == ja.field_b[var16]) {
                            statePc = 110;
                        } else {
                            statePc = 105;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        var18_int = ja.field_b[var16][var17_int];
                        if (var18_int == 0) {
                            statePc = 108;
                        } else {
                            statePc = 106;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        if (vg.field_a) {
                            statePc = 108;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        var11 = 1;
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        if (var13 >= var18_int) {
                            statePc = 110;
                        } else {
                            statePc = 109;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        var13 = var18_int;
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        if (null == ol.field_cc) {
                            statePc = 117;
                        } else {
                            statePc = 111;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        if (null == ol.field_cc[var16]) {
                            statePc = 117;
                        } else {
                            statePc = 112;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        var18_int = ol.field_cc[var16][var17_int];
                        if (0 == var18_int) {
                            statePc = 115;
                        } else {
                            statePc = 113;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        if (vg.field_a) {
                            statePc = 115;
                        } else {
                            statePc = 114;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        var11 = 1;
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        if (var14 >= var18_int) {
                            statePc = 117;
                        } else {
                            statePc = 116;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        var14 = var18_int;
                        statePc = 117;
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        if (fc.field_b == null) {
                            statePc = 121;
                        } else {
                            statePc = 118;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        if (fc.field_b[var16] != null) {
                            statePc = 120;
                        } else {
                            statePc = 119;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        statePc = 121;
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        var15 = var15 | fc.field_b[var16][var17_int];
                        statePc = 121;
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        var16++;
                        if (var19 == 0) {
                            statePc = 97;
                        } else {
                            statePc = 122;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        var16 = 0;
                        var17 = gl.field_t.field_Ub.field_M;
                        var18_ref = (cc) ((Object) var17.e(13058));
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        if (var18_ref == null) {
                            statePc = 140;
                        } else {
                            statePc = 124;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        stackOut_124_0 = var18_ref.d((byte) -36);
                        stackIn_141_0 = stackOut_124_0 ? 1 : 0;
                        stackIn_125_0 = stackOut_124_0;
                        if (var19 != 0) {
                            statePc = 141;
                        } else {
                            statePc = 125;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        if (stackIn_125_0) {
                            statePc = 139;
                        } else {
                            statePc = 126;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        if (var11 == 0) {
                            statePc = 130;
                        } else {
                            statePc = 127;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        if (!var18_ref.field_nc) {
                            statePc = 129;
                        } else {
                            statePc = 128;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        var16 = 1;
                        if (var19 == 0) {
                            statePc = 140;
                        } else {
                            statePc = 130;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        if (var13 <= var18_ref.field_ac) {
                            statePc = 132;
                        } else {
                            statePc = 131;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        var16 = 1;
                        if (var19 == 0) {
                            statePc = 140;
                        } else {
                            statePc = 132;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        if (var18_ref.field_dc >= var14) {
                            statePc = 134;
                        } else {
                            statePc = 133;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        var16 = 1;
                        if (var19 == 0) {
                            statePc = 140;
                        } else {
                            statePc = 134;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        if ((var15 & (var18_ref.field_qc ^ -1) ^ -1) >= -1) {
                            statePc = 136;
                        } else {
                            statePc = 135;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        var16 = 1;
                        if (var19 == 0) {
                            statePc = 140;
                        } else {
                            statePc = 136;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        if (var12 != 0) {
                            statePc = 138;
                        } else {
                            statePc = 137;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        statePc = 139;
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        var16 = 1;
                        if (var19 == 0) {
                            statePc = 140;
                        } else {
                            statePc = 139;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        var18_ref = (cc) ((Object) var17.a((byte) -12));
                        if (var19 == 0) {
                            statePc = 123;
                        } else {
                            statePc = 140;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        stackIn_141_0 = 2;
                        statePc = 141;
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        if (stackIn_141_0 > ul.field_d) {
                            statePc = 145;
                        } else {
                            statePc = 142;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        if (fc.field_e[12]) {
                            statePc = 144;
                        } else {
                            statePc = 143;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        statePc = 145;
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        var16 = 0;
                        statePc = 145;
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        if (var16 != 0) {
                            statePc = 147;
                        } else {
                            statePc = 146;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        statePc = 153;
                        continue stateLoop;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        fk.field_q.field_T = false;
                        if (fk.field_q.field_K) {
                            statePc = 149;
                        } else {
                            statePc = 148;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        statePc = 153;
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        if (fg.field_Tb.field_d.field_bc != 0) {
                            statePc = 152;
                        } else {
                            statePc = 150;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        ll.field_i = sf.field_f;
                        if (var19 == 0) {
                            statePc = 153;
                        } else {
                            statePc = 151;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_150) {
                        caughtException = stateCaught_150;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        statePc = 152;
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        ll.field_i = db.a(kf.field_r, -74, new String[]{bk.field_P});
                        statePc = 153;
                        continue stateLoop;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        if (ka.field_R != 0L) {
                            statePc = 155;
                        } else {
                            statePc = 154;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        statePc = 159;
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        var9 = (int)(-mm.a(param0 + -86) + ka.field_R);
                        var9 = (var9 - -999) / 1000;
                        if (-2 < (var9 ^ -1)) {
                            statePc = 157;
                        } else {
                            statePc = 156;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        statePc = 158;
                        continue stateLoop;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        var9 = 1;
                        statePc = 158;
                        continue stateLoop;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 158: {
                    try {
                        var8.field_S = db.a(ch.field_P, -68, new String[]{Integer.toString(var9)});
                        statePc = 159;
                        continue stateLoop;
                    } catch (Throwable stateCaught_158) {
                        caughtException = stateCaught_158;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 159: {
                    try {
                        uj.field_e.field_S = db.a(ci.field_h, -32, new String[]{Integer.toString(nf.field_b.field_wc), Integer.toString(nf.field_b.field_Ub)});
                        statePc = 160;
                        continue stateLoop;
                    } catch (Throwable stateCaught_159) {
                        caughtException = stateCaught_159;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 160: {
                    try {
                        stackIn_164_0 = ql.field_ec;
                        stackIn_161_0 = stackIn_164_0;
                        stackIn_164_1 = -99;
                        stackIn_161_1 = stackIn_164_1;
                        if (!param1) {
                            statePc = 164;
                        } else {
                            statePc = 161;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_160) {
                        caughtException = stateCaught_160;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 161: {
                    try {
                        stackIn_164_0 = (gh) ((Object) stackIn_161_0);
                        stackIn_162_0 = stackIn_164_0;
                        stackIn_164_1 = stackIn_161_1;
                        stackIn_162_1 = stackIn_164_1;
                        if (param2) {
                            statePc = 164;
                        } else {
                            statePc = 162;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 162: {
                    try {
                        stackIn_164_0 = (gh) ((Object) stackIn_162_0);
                        stackIn_163_0 = stackIn_164_0;
                        stackIn_164_1 = stackIn_162_1;
                        stackIn_163_1 = stackIn_164_1;
                        if (vb.field_c) {
                            statePc = 164;
                        } else {
                            statePc = 163;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_162) {
                        caughtException = stateCaught_162;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 163: {
                    try {
                        stackIn_165_0 = (gh) ((Object) stackIn_163_0);
                        stackIn_165_1 = stackIn_163_1;
                        stackIn_165_2 = 1;
                        statePc = 165;
                        continue stateLoop;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 164: {
                    try {
                        stackIn_165_0 = (gh) ((Object) stackIn_164_0);
                        stackIn_165_1 = stackIn_164_1;
                        stackIn_165_2 = 0;
                        statePc = 165;
                        continue stateLoop;
                    } catch (Throwable stateCaught_164) {
                        caughtException = stateCaught_164;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 165: {
                    try {
                        ((gh) (Object) stackIn_165_0).a((byte) stackIn_165_1, stackIn_165_2 != 0);
                        stackIn_169_0 = gl.field_y;
                        stackIn_166_0 = stackIn_169_0;
                        stackIn_169_1 = -88;
                        stackIn_166_1 = stackIn_169_1;
                        if (!param1) {
                            statePc = 169;
                        } else {
                            statePc = 166;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 166: {
                    try {
                        stackIn_169_0 = (gh) ((Object) stackIn_166_0);
                        stackIn_167_0 = stackIn_169_0;
                        stackIn_169_1 = stackIn_166_1;
                        stackIn_167_1 = stackIn_169_1;
                        if (param2) {
                            statePc = 169;
                        } else {
                            statePc = 167;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_166) {
                        caughtException = stateCaught_166;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 167: {
                    try {
                        stackIn_169_0 = (gh) ((Object) stackIn_167_0);
                        stackIn_168_0 = stackIn_169_0;
                        stackIn_169_1 = stackIn_167_1;
                        stackIn_168_1 = stackIn_169_1;
                        if (vb.field_c) {
                            statePc = 169;
                        } else {
                            statePc = 168;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_167) {
                        caughtException = stateCaught_167;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 168: {
                    try {
                        stackIn_170_0 = (gh) ((Object) stackIn_168_0);
                        stackIn_170_1 = stackIn_168_1;
                        stackIn_170_2 = 1;
                        statePc = 170;
                        continue stateLoop;
                    } catch (Throwable stateCaught_168) {
                        caughtException = stateCaught_168;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 169: {
                    try {
                        stackIn_170_0 = (gh) ((Object) stackIn_169_0);
                        stackIn_170_1 = stackIn_169_1;
                        stackIn_170_2 = 0;
                        statePc = 170;
                        continue stateLoop;
                    } catch (Throwable stateCaught_169) {
                        caughtException = stateCaught_169;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 170: {
                    try {
                        ((gh) (Object) stackIn_170_0).a((byte) stackIn_170_1, stackIn_170_2 != 0);
                        if (param0 == 0) {
                            statePc = 172;
                        } else {
                            statePc = 171;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_170) {
                        caughtException = stateCaught_170;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 171: {
                    try {
                        cn.a(126, false, true, true, 60);
                        statePc = 172;
                        continue stateLoop;
                    } catch (Throwable stateCaught_171) {
                        caughtException = stateCaught_171;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 172: {
                    try {
                        stackIn_176_0 = fb.field_r;
                        stackIn_173_0 = stackIn_176_0;
                        stackIn_176_1 = -5;
                        stackIn_173_1 = stackIn_176_1;
                        if (!param1) {
                            statePc = 176;
                        } else {
                            statePc = 173;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_172) {
                        caughtException = stateCaught_172;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 173: {
                    try {
                        stackIn_176_0 = (gh) ((Object) stackIn_173_0);
                        stackIn_174_0 = stackIn_176_0;
                        stackIn_176_1 = stackIn_173_1;
                        stackIn_174_1 = stackIn_176_1;
                        if (param2) {
                            statePc = 176;
                        } else {
                            statePc = 174;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_173) {
                        caughtException = stateCaught_173;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 174: {
                    try {
                        stackIn_176_0 = (gh) ((Object) stackIn_174_0);
                        stackIn_175_0 = stackIn_176_0;
                        stackIn_176_1 = stackIn_174_1;
                        stackIn_175_1 = stackIn_176_1;
                        if (!vb.field_c) {
                            statePc = 176;
                        } else {
                            statePc = 175;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_174) {
                        caughtException = stateCaught_174;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 175: {
                    try {
                        stackIn_177_0 = (gh) ((Object) stackIn_175_0);
                        stackIn_177_1 = stackIn_175_1;
                        stackIn_177_2 = 1;
                        statePc = 177;
                        continue stateLoop;
                    } catch (Throwable stateCaught_175) {
                        caughtException = stateCaught_175;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 176: {
                    try {
                        stackIn_177_0 = (gh) ((Object) stackIn_176_0);
                        stackIn_177_1 = stackIn_176_1;
                        stackIn_177_2 = 0;
                        statePc = 177;
                        continue stateLoop;
                    } catch (Throwable stateCaught_176) {
                        caughtException = stateCaught_176;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 177: {
                    try {
                        ((gh) (Object) stackIn_177_0).a((byte) stackIn_177_1, stackIn_177_2 != 0);
                        fg.field_Tb.field_d.j(param0 + 10000);
                        stackIn_178_0 = null;
                        statePc = 178;
                        continue stateLoop;
                    } catch (Throwable stateCaught_177) {
                        caughtException = stateCaught_177;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 178: {
                    try {
                        if (stackIn_178_0 == nf.field_b) {
                            statePc = 191;
                        } else {
                            statePc = 179;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_178) {
                        caughtException = stateCaught_178;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 179: {
                    try {
                        if (-1 != (mn.field_E.field_Eb ^ -1)) {
                            statePc = 181;
                        } else {
                            statePc = 180;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_179) {
                        caughtException = stateCaught_179;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 180: {
                    try {
                        statePc = 182;
                        continue stateLoop;
                    } catch (Throwable stateCaught_180) {
                        caughtException = stateCaught_180;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 181: {
                    try {
                        na.a((byte) -119, param4, nf.field_b.j(param0 ^ -33));
                        statePc = 182;
                        continue stateLoop;
                    } catch (Throwable stateCaught_181) {
                        caughtException = stateCaught_181;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 182: {
                    try {
                        if ((rn.field_C.field_Eb ^ -1) == -1) {
                            statePc = 184;
                        } else {
                            statePc = 183;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_182) {
                        caughtException = stateCaught_182;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 183: {
                    try {
                        vb.field_c = true;
                        statePc = 184;
                        continue stateLoop;
                    } catch (Throwable stateCaught_183) {
                        caughtException = stateCaught_183;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 184: {
                    try {
                        if (fk.field_q.field_Eb == 0) {
                            statePc = 186;
                        } else {
                            statePc = 185;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_184) {
                        caughtException = stateCaught_184;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 185: {
                    try {
                        qb.field_J = true;
                        statePc = 186;
                        continue stateLoop;
                    } catch (Throwable stateCaught_185) {
                        caughtException = stateCaught_185;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 186: {
                    try {
                        if ((ta.field_i.field_Eb ^ -1) == -1) {
                            statePc = 188;
                        } else {
                            statePc = 187;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_186) {
                        caughtException = stateCaught_186;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 187: {
                    try {
                        vb.field_c = false;
                        statePc = 188;
                        continue stateLoop;
                    } catch (Throwable stateCaught_187) {
                        caughtException = stateCaught_187;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 188: {
                    try {
                        cb.a(nf.field_b, (byte) -115, param4, false);
                        statePc = 191;
                        continue stateLoop;
                    } catch (Throwable stateCaught_188) {
                        caughtException = stateCaught_188;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 190: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    throw ci.a((Throwable) ((Object) var5), "cn.R(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
                }
                case 191: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final int a(int param0, int param1, int param2, lh param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == 0) {
                break L1;
              } else {
                this.a((lh) null, (byte) 118);
                break L1;
              }
            }
            stackIn_3_0 = param3.field_F + this.field_h + param1 - (-param3.field_z - param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("cn.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    String c(int param0, lh param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                this.b((byte) 115, (lh) null);
                break L1;
              }
            }
            stackIn_3_0 = param1.field_y;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("cn.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static boolean a(int param0, int param1, int param2, boolean param3) {
        if (param3) {
            return true;
        }
        if (qf.field_e != null && -14 == (ei.field_q ^ -1)) {
            qf.field_e = null;
            return true;
        }
        if (!jn.field_g) {
            if (vb.field_e || -10 == (ei.field_q ^ -1) || 10 == ei.field_q || -12 == (ei.field_q ^ -1)) {
                return ba.a(123, param0, param1);
            }
            if (ei.field_q == 80 && fa.a(38)) {
                jn.field_g = true;
                return true;
            }
            return false;
        }
        if (!fa.a(38)) {
            return false;
        }
        int var4 = he.a((byte) -125, param2, param0) ? 1 : 0;
        if (ei.field_q == 80 || 84 == ei.field_q) {
            var4 = 1;
            jn.field_g = false;
        }
        if (!((ei.field_q ^ -1) != -14)) {
            pg.d(88);
            jn.field_g = false;
            var4 = 1;
        }
        return var4 != 0;
    }

    public final int a(int param0, int param1, lh param2, byte param3, int param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.b(-1, param2);
              if (param3 == 115) {
                break L1;
              } else {
                this.field_h = -14;
                break L1;
              }
            }
            stackIn_3_0 = param2.field_s.a(0, -this.a(param0, 3, param2) + param1, param5 + -this.a((byte) -123, param2, param4));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var7);

            stackIn_6_1 = new StringBuilder().append("cn.Q(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_3_0;
    }

    public final int a(byte param0, lh param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 <= -113) {
                break L1;
              } else {
                this.a((byte) 8, (lh) null, 100);
                break L1;
              }
            }
            stackIn_3_0 = this.a(0, param2, 0, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("cn.W(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    public final int a(int param0) {
        int var2 = 26 / ((70 - param0) / 37);
        return this.field_f.field_G - -this.field_f.field_F;
    }

    private final void a(lh param0, byte param1) {
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (null == param0.field_s) {
                param0.field_s = (da) ((Object) new si());
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  L5: {
                    var3_int = this.a(5546, param0);
                    var4 = this.d(-3, param0);
                    var6 = this.field_j;
                    if (-1 == (var6 ^ -1)) {
                      break L5;
                    } else {
                      L6: {
                        if (var6 != 2) {
                          break L6;
                        } else {
                          if (var7 == 0) {
                            break L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                      if (var6 == 3) {
                        break L3;
                      } else {
                        if (-2 != (var6 ^ -1)) {
                          break L3;
                        } else {
                          if (var7 == 0) {
                            break L3;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                  }
                  var5 = this.field_f.field_G;
                  if (var7 == 0) {
                    break L2;
                  } else {
                    break L4;
                  }
                }
                var5 = var4 - this.field_f.field_F;
                if (var7 == 0) {
                  break L2;
                } else {
                  break L3;
                }
              }
              var5 = this.field_f.field_G + (-this.field_f.field_F + (-this.field_f.field_G + var4) >> -1436805919);
              break L2;
            }
            L7: {
              if (param1 > 60) {
                break L7;
              } else {
                this.a(-108, 13, (lh) null);
                break L7;
              }
            }
            L8: {
              L9: {
                L10: {
                  L11: {
                    L12: {
                      var6 = this.field_a;
                      if (0 == var6) {
                        break L12;
                      } else {
                        if (var6 == 3) {
                          break L12;
                        } else {
                          if (-2 == (var6 ^ -1)) {
                            break L11;
                          } else {
                            if (-3 != (var6 ^ -1)) {
                              break L9;
                            } else {
                              if (var7 == 0) {
                                break L10;
                              } else {
                                break L12;
                              }
                            }
                          }
                        }
                      }
                    }
                    if (param0.field_s instanceof si) {
                      ((si) ((Object) param0.field_s)).a(0, this.c(-1, param0), 97, var5, this.field_f);
                      if (var7 == 0) {
                        break L9;
                      } else {
                        break L11;
                      }
                    } else {
                      break L8;
                    }
                  }
                  if (!(param0.field_s instanceof si)) {
                    break L9;
                  } else {
                    ((si) ((Object) param0.field_s)).b(var3_int >> -1175790303, this.c(-1, param0), var5, -1385548511, this.field_f);
                    if (var7 == 0) {
                      break L9;
                    } else {
                      break L10;
                    }
                  }
                }
                if (param0.field_s instanceof si) {
                  ((si) ((Object) param0.field_s)).a(this.c(-1, param0), true, var3_int, var5, this.field_f);
                  break L9;
                } else {
                  break L8;
                }
              }
              break L8;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var3 = decompiledCaughtException;
            stackIn_35_0 = (RuntimeException) (var3);

            stackIn_35_1 = new StringBuilder().append("cn.T(");

            if (param0 == null) {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L13;
            } else {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L13;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ',' + param1 + ')');
        }
    }

    cn(mi param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    private final int a(byte param0, lh param1, int param2, int param3) {
        int discarded$1 = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 114) {
                break L1;
              } else {
                discarded$1 = this.a(37, 62, 35, (lh) null);
                break L1;
              }
            }
            stackIn_3_0 = param2 + this.field_b + (param1.field_o + param3 + param1.field_u);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("cn.M(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    final static String a(byte param0, CharSequence param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2 = hh.a(ji.a(-87, param1), (byte) -114);
              if (param0 >= 89) {
                break L1;
              } else {
                field_l = false;
                break L1;
              }
            }
            L2: {
              if (var2 != null) {
                break L2;
              } else {
                var2 = "";
                break L2;
              }
            }
            stackIn_5_0 = (String) (var2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2_ref);

            stackIn_8_1 = new StringBuilder().append("cn.AA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        return stackIn_5_0;
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, lh param6, int param7) {
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              L2: {
                fe.a(param0 - -param6.field_o, param2 + param6.field_z, 47, param6.field_x + (param6.field_o + param0), param6.field_E + param6.field_z + param2);
                var9_int = this.a(5546, param6);
                var10 = this.d(-3, param6);
                if (this.field_i) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      L5: {
                        L6: {
                          var12 = this.field_j;
                          if ((var12 ^ -1) == -1) {
                            break L6;
                          } else {
                            if (-3 == (var12 ^ -1)) {
                              break L5;
                            } else {
                              L7: {
                                if (3 != var12) {
                                  break L7;
                                } else {
                                  if (var13 == 0) {
                                    break L4;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                              if (-2 != (var12 ^ -1)) {
                                break L4;
                              } else {
                                if (var13 == 0) {
                                  break L4;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                        }
                        var11 = this.field_f.field_G;
                        if (var13 == 0) {
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                      var11 = var10 - this.field_f.field_F;
                      if (var13 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                    var11 = (-this.field_f.field_F + -this.field_f.field_G + var10 >> -490830687) + this.field_f.field_G;
                    break L3;
                  }
                  L8: {
                    L9: {
                      L10: {
                        L11: {
                          L12: {
                            var12 = this.field_a;
                            if (0 != var12) {
                              break L12;
                            } else {
                              if (var13 == 0) {
                                break L11;
                              } else {
                                break L12;
                              }
                            }
                          }
                          if ((var12 ^ -1) == -4) {
                            break L11;
                          } else {
                            if (-2 == (var12 ^ -1)) {
                              break L10;
                            } else {
                              if (var12 != 2) {
                                break L8;
                              } else {
                                if (var13 == 0) {
                                  break L9;
                                } else {
                                  break L11;
                                }
                              }
                            }
                          }
                        }
                        this.field_f.b(this.c(param1 + 11866, param6), this.a((byte) 114, param6, param5, param0), var11 + this.a(param3, param2, 0, param6), param7, param4);
                        if (var13 == 0) {
                          break L8;
                        } else {
                          break L10;
                        }
                      }
                      this.field_f.a(this.c(-1, param6), (var9_int >> -2002530687) + this.a((byte) 114, param6, param5, param0), this.a(param3, param2, 0, param6) + var11, param7, param4);
                      if (var13 == 0) {
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                    this.field_f.c(this.c(param1 ^ 11866, param6), this.a((byte) 114, param6, param5, param0) + var9_int, this.a(param3, param2, 0, param6) + var11, param7, param4);
                    break L8;
                  }
                  if (var13 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              this.field_f.a(this.c(-1, param6), this.a((byte) 114, param6, param5, param0), this.a(param3, param2, 0, param6), var9_int, var10, param7, param4, this.field_a, this.field_j, this.field_m);
              break L1;
            }
            if (param1 == -11867) {
              tk.f((byte) 117);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var9 = decompiledCaughtException;
            stackIn_34_0 = (RuntimeException) (var9);

            stackIn_34_1 = new StringBuilder().append("cn.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L13;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L13;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final da b(int param0, lh param1) {
        RuntimeException var3 = null;
        da stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                this.field_k = -75;
                break L1;
              }
            }
            L2: {
              if (null != param1.field_s) {
                break L2;
              } else {
                param1.field_s = (da) ((Object) new si());
                break L2;
              }
            }
            L3: {
              L4: {
                if (!this.field_i) {
                  break L4;
                } else {
                  ((si) ((Object) param1.field_s)).a(this.a(param0 + 5547, param1), this.field_a, this.field_m, this.c(-1, param1), this.field_j, this.field_f, this.d(param0 + -2, param1), param0 + 2);
                  if (SteelSentinels.field_G == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              this.a(param1, (byte) 125);
              break L3;
            }
            stackIn_9_0 = param1.field_s;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("cn.N(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L5;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        return stackIn_9_0;
    }

    public final int a(int param0, int param1, lh param2) {
        int discarded$1 = 0;
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 3) {
                break L1;
              } else {
                discarded$1 = this.d(-89, (lh) null);
                break L1;
              }
            }
            stackIn_3_0 = this.a((byte) 114, param2, 0, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("cn.O(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public final void a(int param0, int param1, boolean param2, int param3, lh param4, int param5) {
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        il var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        da var17 = null;
        da var18 = null;
        var16 = SteelSentinels.field_G;
        try {
          L0: {
            if ((param3 ^ -1) != (param5 ^ -1)) {
              L1: {
                if (!param2) {
                  break L1;
                } else {
                  this.a(107, -2, false, -112, (lh) null, 115);
                  break L1;
                }
              }
              L2: {
                if (param4.d(0)) {
                  L3: {
                    L4: {
                      var17 = this.b(-1, param4);
                      var18 = var17;
                      if ((param5 ^ -1) >= (param3 ^ -1)) {
                        break L4;
                      } else {
                        var8 = param3;
                        var9 = param5;
                        if (var16 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var8 = param5;
                    var9 = param3;
                    break L3;
                  }
                  var10 = var18.b(-1, var8);
                  var11 = var18.b(-1, var9);
                  fe.a(param4.field_o + param1, param4.field_z + param0, -78, param4.field_o + param1 + param4.field_x, param4.field_z + param0 - -param4.field_E);
                  var12 = var10;
                  L5: while (true) {
                    L6: {
                      L7: {
                        if ((var11 ^ -1) > (var12 ^ -1)) {
                          break L7;
                        } else {
                          var13 = var17.field_h[var12];
                          stackIn_23_0 = var10;

                          if (var16 != 0) {
                            break L6;
                          } else {
                            L8: {
                              if (stackIn_23_0 != var12) {
                                stackIn_16_0 = var13.field_f[0];
                                break L8;
                              } else {
                                stackIn_16_0 = var18.a(1, var8);
                                break L8;
                              }
                            }
                            L9: {
                              var14 = stackIn_16_0;
                              if (var12 != var11) {
                                if (var13 == null) {
                                  stackIn_21_0 = 0;
                                  break L9;
                                } else {
                                  stackIn_21_0 = var13.field_f[var13.field_f.length - 1];
                                  break L9;
                                }
                              } else {
                                stackIn_21_0 = var18.a(1, var9);
                                break L9;
                              }
                            }
                            var15 = stackIn_21_0;
                            ad.field_j.a(-var14 + var15, 5939, this.a((byte) 114, param4, var14, param1), var13.field_a, this.field_c >>> -112536968, this.field_c, param0 + param4.field_z - (-this.field_h + -param4.field_F - var13.field_h));
                            var12++;
                            if (var16 == 0) {
                              continue L5;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                      stackIn_23_0 = 113;
                      break L6;
                    }
                    tk.f((byte) stackIn_23_0);
                    break L2;
                  }
                } else {
                  break L2;
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
          L10: {
            var7 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var7);

            stackIn_27_1 = new StringBuilder().append("cn.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L10;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L10;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(cn param0, int param1) {
        try {
            param0.field_g = this.field_g;
            if (param1 != -3) {
                this.field_j = 10;
            }
            param0.field_k = this.field_k;
            param0.field_i = this.field_i;
            param0.field_e = this.field_e;
            param0.field_a = this.field_a;
            param0.field_d = this.field_d;
            param0.field_j = this.field_j;
            param0.field_c = this.field_c;
            param0.field_h = this.field_h;
            param0.field_b = this.field_b;
            param0.field_m = this.field_m;
            param0.field_f = this.field_f;
            param0.field_n = this.field_n;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "cn.K(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void a(int param0, int param1, lh param2, int param3) {
        try {
            if (param3 < 73) {
                this.a((cn) null, -48);
            }
            this.a(param1, -11867, param0, 0, this.field_g, 0, param2, this.field_k);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "cn.P(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public final int b(byte param0, lh param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = -120 / ((param0 - -67) / 59);
            this.b(-1, param1);
            stackIn_1_0 = param1.field_s.a((byte) 24) + this.field_h - -this.field_d;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3);

            stackIn_4_1 = new StringBuilder().append("cn.L(").append(param0).append(',');

            if (param1 == null) {
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
          throw ci.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    public final int a(byte param0, lh param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.b(-1, param1);
              if (param0 > 40) {
                break L1;
              } else {
                cn.a(-9, true, false, false, 56);
                break L1;
              }
            }
            stackIn_3_0 = param1.field_s.b((byte) -100) + this.field_b + this.field_n;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("cn.BA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public final int a(int param0, lh param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 5546) {
                break L1;
              } else {
                this.field_m = 61;
                break L1;
              }
            }
            stackIn_3_0 = -this.field_n + (-this.field_b + param1.field_x);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("cn.J(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public final void a(lh param0, int param1, int param2, int param3, byte param4) {
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_7_0;
        int stackIn_7_1;
        int stackIn_7_2;
        int stackIn_7_3;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        il var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        da var13 = null;
        da var14 = null;
        try {
          L0: {
            L1: {
              if (param4 > 70) {
                break L1;
              } else {
                cn.a(-106, 84, -5, false);
                break L1;
              }
            }
            L2: {
              if (param0.d(0)) {
                L3: {
                  var13 = this.b(-1, param0);
                  var14 = var13;
                  var7 = var14.b(-1, param1);
                  var8 = var13.field_h[var7];
                  var9 = var14.a(1, param1);
                  var10 = this.a((byte) 114, param0, var9, param3);
                  var11 = this.a((byte) -120, param0, param2) + Math.max(0, var8.field_h);
                  stackIn_6_0 = this.a((byte) -116, param0, param2);

                  stackIn_6_1 = this.d(-3, param0);

                  stackIn_6_2 = var8.field_a;

                  if ((var14.field_h.length ^ -1) < (1 + var7 ^ -1)) {
                    stackIn_7_0 = stackIn_6_0;
                    stackIn_7_1 = stackIn_6_1;
                    stackIn_7_2 = stackIn_6_2;
                    stackIn_7_3 = var13.field_h[var7 - -1].field_h;
                    break L3;
                  } else {
                    stackIn_7_0 = stackIn_6_0;
                    stackIn_7_1 = stackIn_6_1;
                    stackIn_7_2 = stackIn_6_2;
                    stackIn_7_3 = var8.field_a;
                    break L3;
                  }
                }
                var12 = stackIn_7_0 + Math.min(stackIn_7_1, Math.min(stackIn_7_2, stackIn_7_3));
                fe.a(param0.field_o + param3, param2 + param0.field_z, 113, param0.field_x + (param0.field_o + param3), param0.field_E + (param0.field_z + param2));
                ad.field_j.a(var11, var12, this.field_e, (byte) -121, var10, var10);
                tk.f((byte) 120);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var6);

            stackIn_11_1 = new StringBuilder().append("cn.S(");

            if (param0 == null) {
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
          throw ci.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    protected cn() {
    }

    cn(mi param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        try {
            this.field_h = param3;
            this.field_a = param7;
            this.field_g = param6;
            this.field_d = param4;
            this.field_f = param0;
            this.field_n = param2;
            this.field_c = param11;
            this.field_e = param10;
            this.field_m = param9;
            this.field_i = param12 ? true : false;
            this.field_k = param5;
            this.field_b = param1;
            this.field_j = param8;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "cn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
    }

    static {
        field_l = true;
    }
}
