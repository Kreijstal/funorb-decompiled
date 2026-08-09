/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cd extends cj {
    cj field_Hb;
    static String field_Kb;
    tq field_Jb;
    cj field_Gb;
    static String field_Lb;
    static String field_Fb;
    static String field_Mb;
    cj field_Ib;

    cd(long param0, cd param1, String param2, String param3) {
        this(param0, param1, param1.field_Jb.field_Jb, param1.field_Jb.field_Ib, param1.field_Gb, param2, param3);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this.field_z = param2;
        if (param0 != 0) {
          field_Mb = (String) null;
          this.field_x = param5;
          this.field_Q = param6;
          this.field_zb = param3;
          this.a(param4, (byte) -67, param1, param7);
          return;
        } else {
          this.field_x = param5;
          this.field_Q = param6;
          this.field_zb = param3;
          this.a(param4, (byte) -67, param1, param7);
          return;
        }
    }

    cd(long param0, cj param1, cj param2, hi param3, cj param4, String param5, String param6) {
        super(param0, param1);
        try {
            this.field_Ib = new cj(0L, (cj) null);
            this.field_Jb = new tq(0L, this.field_Ib, param2, param3);
            this.field_Gb = new cj(0L, param4);
            this.field_Hb = new cj(0L, param4);
            this.field_Gb.field_wb = param5;
            this.field_Hb.field_wb = param6;
            this.a((byte) 50, this.field_Jb);
            this.a((byte) 50, this.field_Gb);
            this.a((byte) 50, this.field_Hb);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "cd.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var5 = (this.field_zb + param0) / 2;
        int var6 = -param3 + this.field_z;
        this.field_Jb.a(param2, param0, this.field_zb, 0, -param0 + var6, -31465, 0);
        this.field_Gb.field_z = param3;
        int var7 = 42 % ((param1 - -27) / 39);
        this.field_Gb.field_zb = -param0 + var5;
        this.field_Gb.field_Q = var6;
        this.field_Gb.field_x = 0;
        this.field_Hb.field_Q = var6;
        this.field_Hb.field_x = var5;
        this.field_Hb.field_zb = -var5 + this.field_zb;
        this.field_Hb.field_z = param3;
    }

    final static void c(byte param0) {
        Object stackIn_25_0 = null;
        Object stackIn_34_0 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var1 = null;
        int var2_int = 0;
        Object var2 = null;
        int var3 = 0;
        int var4 = 0;
        ja var5 = null;
        ja var6 = null;
        ja var7 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        oo.a(243, 197, 369, 143, 16777215);
                        oo.e(244, 198, 367, 141, 0);
                        if (param0 <= -20) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        if (ld.field_Ub == null) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (null != gf.field_e) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        gf.field_e.a(hj.field_e, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return;
                }
                case 9: {
                    try {
                        var5 = ld.field_Ub[gf.field_g];
                        if (var5 == null) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var5.g(245, 199);
                        if (var4 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (null == gf.field_e) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        gf.field_e.a(hj.field_e, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (nf.field_a <= lb.field_a) {
                            statePc = 20;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var6 = ld.field_Ub[gf.field_j];
                        if (var6 == null) {
                            statePc = 20;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var2_int = lb.field_a * (var6.field_z + 60) / nf.field_a;
                        var3 = var2_int + -30;
                        if (qh.field_a) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        cb.a(199, false, 256 * (var6.field_z + -var3) / 30, 245, var6, -256 * var3 / 30);
                        if (var4 == 0) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        cb.a(199, false, var3 * -256 / 30, 245, var6, 256 * (-var3 + var6.field_z) / 30);
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (gf.field_e != null) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        return;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var2 = null;
                        var3 = 0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var3 >= ld.field_Ub.length) {
                            statePc = 33;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var7 = ld.field_Ub[var3];
                        stackIn_34_0 = null;
                        stackIn_25_0 = stackIn_34_0;
                        if (var4 != 0) {
                            statePc = 34;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (stackIn_25_0 == var7) {
                            statePc = 32;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (var7.field_z != 365) {
                            statePc = 29;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (139 != var7.field_u) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (var2 != null) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var2 = Integer.toString(var3);
                        if (var4 == 0) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var2 = (String) (var2) + ", " + var3;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var3++;
                        if (var4 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackIn_34_0 = null;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (stackIn_34_0 != var2) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        return;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        gf.field_e.a("Screenshot(s) " + (String) (var2) + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 37: {
                    return;
                }
                case 38: {
                    var1 = (RuntimeException) ((Object) caughtException);
                    throw fa.a((Throwable) ((Object) var1), "cd.AA(" + param0 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void d(boolean param0) {
        field_Mb = null;
        field_Fb = null;
        field_Lb = null;
        field_Kb = null;
        if (param0) {
            field_Lb = (String) null;
        }
    }

    static {
        field_Kb = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
        field_Lb = "Fullscreen";
        field_Fb = "Sound: ";
        field_Mb = "Curse";
    }
}
