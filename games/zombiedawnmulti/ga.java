/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ga extends k {
    static cj field_r;
    static String field_t;
    static gp field_u;
    static String field_w;
    static int[] field_s;
    private o field_p;
    static String field_q;
    static int[] field_v;
    private int field_o;

    final void a(byte param0, int[] param1) {
        try {
            int var3_int = -83 / ((26 - param0) / 43);
            this.field_p = new o(param1);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "ga.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void l(int param0) {
        if (param0 != -3093) {
          field_u = (gp) null;
          this.field_j = (7 + this.field_o) / 8;
          return;
        } else {
          this.field_j = (7 + this.field_o) / 8;
          return;
        }
    }

    final static void i(byte param0) {
        String[][] dupTemp$0 = null;
        int[][] dupTemp$1 = null;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        boolean stackIn_34_0 = false;
        int stackIn_39_0 = 0;
        int decompiledRegionSelector0 = 0;
        boolean stackOut_33_0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        vg var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        ga var13 = null;
        ga var14 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 >= 31) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ga.j(81);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var13 = s.field_e;
                        var14 = var13;
                        var2 = var14.g(31365);
                        var3 = (vg) ((Object) ag.field_i.c(116));
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var3 == null) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_11_0 = var2 ^ -1;
                        stackIn_6_0 = stackIn_11_0;
                        if (var12 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (stackIn_6_0 == (var3.field_i ^ -1)) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var3 = (vg) ((Object) ag.field_i.b(6));
                        if (var12 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var3 == null) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackIn_11_0 = -123;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        ak.a((byte) stackIn_11_0);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 12: {
                    return;
                }
                case 13: {
                    try {
                        var4 = var14.g(31365);
                        if (var4 != 0) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        kk.field_v[0] = ta.field_lb;
                        var5 = var3.field_p;
                        var6_int = 1;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var4 <= var6_int) {
                            statePc = 20;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        kk.field_v[var6_int] = var13.f((byte) -116);
                        var6_int++;
                        if (var12 != 0) {
                            statePc = 21;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var12 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        s.a(var4, (byte) 111, var5);
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var6_int = 0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var6_int >= var4) {
                            statePc = 30;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        sn.a(4050, var14);
                        stackIn_31_0 = -1;
                        stackIn_24_0 = stackIn_31_0;
                        stackIn_31_1 = var6_int ^ -1;
                        stackIn_24_1 = stackIn_31_1;
                        if (var12 != 0) {
                            statePc = 31;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (stackIn_24_0 != stackIn_24_1) {
                            statePc = 27;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var3.field_m = vn.field_e;
                        var3.field_g = jq.field_a;
                        var3.field_o = ao.field_c;
                        var3.field_l = qc.field_q;
                        k.a(1000, ao.field_c, vn.field_e, qc.field_q, var6_int, jq.field_a);
                        if (var12 == 0) {
                            statePc = 29;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        k.a(1000, ao.field_c, vn.field_e, qc.field_q, var6_int, jq.field_a);
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        k.a(1000, ao.field_c, vn.field_e, qc.field_q, var6_int, jq.field_a);
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var6_int++;
                        if (var12 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackIn_31_0 = var5;
                        stackIn_31_1 = -109;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        md.a(stackIn_31_0, stackIn_31_1);
                        dupTemp$0 = new String[2][var5];
                        var3.field_t = dupTemp$0;
                        var6 = dupTemp$0;
                        dupTemp$1 = new int[2][4 * var5];
                        var3.field_k = dupTemp$1;
                        var7 = dupTemp$1;
                        var8 = lj.field_n;
                        var9 = 0;
                        var10 = 0;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (var9 >= var8) {
                            statePc = 38;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var11 = la.field_c[var9];
                        var6[0][var10] = kk.field_v[var11];
                        var7[0][var10 * 4] = lb.field_c[var11];
                        var7[0][1 + 4 * var10] = vk.field_J[var11];
                        var7[0][2 + var10 * 4] = kj.field_p[var11];
                        var7[0][3 + 4 * var10] = ie.field_ob[var11];
                        stackOut_33_0 = sf.a(1, kk.field_v[var11]);
                        stackIn_39_0 = stackOut_33_0 ? 1 : 0;
                        stackIn_34_0 = stackOut_33_0;
                        if (var12 != 0) {
                            statePc = 39;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (!stackIn_34_0) {
                            statePc = 37;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (vk.field_J[var11] - -kj.field_p[var11] - -ie.field_ob[var11] != 0) {
                            statePc = 37;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var6[0][var10] = null;
                        var10--;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var9++;
                        var10++;
                        if (var12 == 0) {
                            statePc = 32;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var9 = 0;
                        stackIn_39_0 = 0;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var10 = stackIn_39_0;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (var9 >= var8) {
                            statePc = 48;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var11 = la.field_c[var9 + var5];
                        var6[1][var10] = kk.field_v[var11];
                        var7[1][var10 * 4] = lb.field_c[var11];
                        var7[1][4 * var10 + 1] = vk.field_J[var11];
                        var7[1][2 + 4 * var10] = kj.field_p[var11];
                        var7[1][3 + var10 * 4] = ie.field_ob[var11];
                        if (var12 != 0) {
                            statePc = 51;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (sf.a(1, kk.field_v[var11])) {
                            statePc = 44;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (0 == vk.field_J[var11] - -kj.field_p[var11] + ie.field_ob[var11]) {
                            statePc = 46;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var6[1][var10] = null;
                        var10--;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var9++;
                        var10++;
                        if (var12 == 0) {
                            statePc = 40;
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
                        var3.field_j = true;
                        var3.a(true);
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 50: {
                    var1 = (RuntimeException) ((Object) caughtException);
                    throw fa.a((Throwable) ((Object) var1), "ga.G(" + param0 + ')');
                }
                case 51: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void b(byte param0, int param1) {
        int fieldTemp$1 = 0;
        if (param0 != -35) {
          return;
        } else {
          fieldTemp$1 = this.field_j;
          this.field_j = this.field_j + 1;
          this.field_m[fieldTemp$1] = (byte)(param1 + this.field_p.a(-48));
          return;
        }
    }

    final void b(int param0, int param1, int param2, byte[] param3) {
        int fieldTemp$1 = 0;
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var5 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = param1;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param0 <= var5_int) {
                            statePc = 12;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        fieldTemp$1 = this.field_j;
                        this.field_j = this.field_j + 1;
                        param3[var5_int + param2] = (byte)(this.field_m[fieldTemp$1] + -this.field_p.a(-90));
                        var5_int++;
                        if (var6 == 0) {
                            statePc = 5;
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
                        return;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var6 == 0) {
                            statePc = 2;
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
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_10_0 = (RuntimeException) (var5);
                    stackIn_9_0 = stackIn_10_0;
                    stackIn_10_1 = new StringBuilder().append("ga.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                    stackIn_9_1 = stackIn_10_1;
                    if (param3 == null) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    stackIn_11_0 = (RuntimeException) ((Object) stackIn_9_0);
                    stackIn_11_1 = (StringBuilder) ((Object) stackIn_9_1);
                    stackIn_11_2 = "{...}";
                    statePc = 11;
                    continue stateLoop;
                }
                case 10: {
                    stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
                    stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
                    stackIn_11_2 = "null";
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    throw fa.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
                }
                case 12: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static uc a(String param0, boolean param1) {
        RuntimeException var2 = null;
        String stackIn_5_0 = null;
        String stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        uc stackIn_9_0 = null;
        uc stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!tg.field_g.d(-99)) {
                break L1;
              } else {
                if (!param0.equals(tg.field_g.a(31027))) {
                  L2: {
                    stackIn_5_0 = (String) (param0);

                    if (param1) {
                      stackIn_6_0 = (String) ((Object) stackIn_5_0);
                      stackIn_6_1 = 0;
                      break L2;
                    } else {
                      stackIn_6_0 = (String) ((Object) stackIn_5_0);
                      stackIn_6_1 = 1;
                      break L2;
                    }
                  }
                  tg.field_g = tg.a(stackIn_6_0, stackIn_6_1 != 0);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            if (!param1) {
              stackIn_11_0 = tg.field_g;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_9_0 = (uc) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var2);

            stackIn_14_1 = new StringBuilder().append("ga.K(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          return stackIn_11_0;
        }
    }

    final int h(int param0, int param1) {
        int incrementValue$1 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = ZombieDawnMulti.field_E ? 1 : 0;
                    if (param1 == 14862) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return -77;
                }
                case 2: {
                    var3 = this.field_o >> 1350894083;
                    var4 = 8 - (7 & this.field_o);
                    var5 = 0;
                    this.field_o = this.field_o + param0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (var4 < param0) {
                        statePc = 8;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (param0 == var4) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var5 = var5 + (this.field_m[var3] >> var4 - param0 & mb.field_n[param0]);
                    if (var6 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var5 = var5 + (mb.field_n[var4] & this.field_m[var3]);
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    return var5;
                }
                case 8: {
                    incrementValue$1 = var3;
                    var3++;
                    var5 = var5 + ((mb.field_n[var4] & this.field_m[incrementValue$1]) << param0 + -var4);
                    param0 = param0 - var4;
                    var4 = 8;
                    if (var6 == 0) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var5 = var5 + (mb.field_n[var4] & this.field_m[var3]);
                    return var5;
                }
                case 10: {
                    if (var6 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (param0 == var4) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var5 = var5 + (this.field_m[var3] >> var4 - param0 & mb.field_n[param0]);
                    if (var6 == 0) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var5 = var5 + (mb.field_n[var4] & this.field_m[var3]);
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    return var5;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static int a(int param0, boolean param1) {
        int var2;
        L0: {
          var2 = 0;
          if (param0 != 0) {
            break L0;
          } else {
            var2 = li.field_C;
            break L0;
          }
        }
        L1: {
          if (-2 == (param0 ^ -1)) {
            var2 = qe.field_g;
            break L1;
          } else {
            break L1;
          }
        }
        if (!param1) {
          L2: {
            field_r = (cj) null;
            if (param0 != 2) {
              break L2;
            } else {
              var2 = ba.field_q;
              break L2;
            }
          }
          return var2;
        } else {
          L3: {
            if (param0 != 2) {
              break L3;
            } else {
              var2 = ba.field_q;
              break L3;
            }
          }
          return var2;
        }
    }

    final int m(int param0) {
        int var2 = 114 % ((param0 - -34) / 50);
        int fieldTemp$0 = this.field_j;
        this.field_j = this.field_j + 1;
        return this.field_m[fieldTemp$0] + -this.field_p.a(-25) & 255;
    }

    final void k(int param0) {
        this.field_o = this.field_j * 8;
        if (param0 != -1136) {
            field_u = (gp) null;
        }
    }

    public static void j(int param0) {
        field_t = null;
        field_u = null;
        field_s = null;
        field_q = null;
        field_r = null;
        field_w = null;
        field_v = null;
        if (param0 > -34) {
            ga.a(-13, true);
        }
    }

    ga(byte[] param0) {
        super(param0);
    }

    ga(int param0) {
        super(param0);
    }

    static {
        field_t = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_q = "You have entered another game.";
        field_w = "Error connecting to server. Please try using a different server.";
        field_s = new int[]{42, 43, 38};
        field_v = new int[]{98, 214, 334, 455, 577};
    }
}
