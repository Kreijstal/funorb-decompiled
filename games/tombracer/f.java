/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class f {
    static int[] field_c;
    static BitSet field_e;
    static int field_b;
    private cva[] field_d;
    private csa[] field_f;
    private int field_a;

    final void a(csa param0, boolean param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        cva var4 = null;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (null == this.field_d) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return;
                }
                case 4: {
                    try {
                        this.field_f = new csa[this.field_d.length];
                        if (!param1) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return;
                }
                case 6: {
                    try {
                        var3_int = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var3_int >= this.field_d.length) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var4 = this.field_d[var3_int];
                        this.field_f[var3_int] = param0.a(var4.field_d, var4.field_a, 20);
                        var3_int++;
                        if (var5 != 0) {
                            statePc = 17;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var5 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        this.field_d = null;
                        this.a(0);
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_15_0 = (RuntimeException) (runtimeException);
                    stackIn_14_0 = stackIn_15_0;
                    stackIn_15_1 = new StringBuilder().append("f.A(");
                    stackIn_14_1 = stackIn_15_1;
                    if (param0 == null) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    stackIn_16_0 = (RuntimeException) ((Object) stackIn_14_0);
                    stackIn_16_1 = (StringBuilder) ((Object) stackIn_14_1);
                    stackIn_16_2 = "{...}";
                    statePc = 16;
                    continue stateLoop;
                }
                case 15: {
                    stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                    stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                    stackIn_16_2 = "null";
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    throw tba.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
                }
                case 17: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0) {
        int var2 = 0;
        int var3_int = 0;
        int var5 = 0;
        Object stackIn_11_0 = null;
        Object stackIn_17_0 = null;
        int statePc = 0;
        csa[] var3 = null;
        int var4 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = TombRacer.field_G ? 1 : 0;
                    var2 = 0;
                    var3_int = param0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (this.field_f.length <= var3_int) {
                        statePc = 8;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (null == this.field_f[var3_int]) {
                        statePc = 5;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (!this.field_f[var3_int].k((byte) -115)) {
                        statePc = 6;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 5: {
                    this.field_f[var3_int] = null;
                    var2++;
                    statePc = 7;
                    continue stateLoop;
                }
                case 6: {
                    this.field_f[var3_int] = null;
                    var2++;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    var3_int++;
                    if (var5 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var3 = new csa[-var2 + this.field_f.length];
                    var2 = 0;
                    var4 = 0;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if (this.field_f.length <= var4) {
                        statePc = 16;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    stackIn_17_0 = this;
                    stackIn_11_0 = stackIn_17_0;
                    if (var5 != 0) {
                        statePc = 17;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (((f) (this)).field_f[var4] != null) {
                        statePc = 14;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (var5 == 0) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var3[var2] = this.field_f[var4];
                    var2++;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    var4++;
                    if (var5 == 0) {
                        statePc = 9;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    stackIn_17_0 = this;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    ((f) (this)).field_f = var3;
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final lj[] a(byte param0) {
        csa[] stackIn_6_0 = null;
        Object stackIn_11_0 = null;
        csa[] stackIn_22_0 = null;
        Object stackIn_27_0 = null;
        csa[] stackOut_5_0;
        csa[] stackOut_21_0;
        int statePc = 0;
        int var2 = 0;
        int var3_int = 0;
        lj[] var3 = null;
        csa var4_ref_csa = null;
        int var4 = 0;
        csa var5 = null;
        lj var5_ref = null;
        lj var6 = null;
        int var7 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = TombRacer.field_G ? 1 : 0;
                    var2 = 0;
                    var3_int = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (this.field_f.length <= var3_int) {
                        statePc = 18;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var4_ref_csa = this.field_f[var3_int];
                    if (var7 == 0) {
                        statePc = 12;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var3 = new lj[var2];
                    var2 = 0;
                    var4 = 0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (this.field_f.length <= var4) {
                        statePc = 10;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    stackOut_5_0 = this.field_f;
                    stackIn_11_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var7 != 0) {
                        statePc = 11;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var5 = stackIn_6_0[var4];
                    if (var5 == null) {
                        statePc = 9;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var6 = var5.u(param0 + -24);
                    if (var6 == null) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var3[var2] = var6;
                    var2++;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    var4++;
                    if (var7 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    stackIn_11_0 = (lj[]) (var3);
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    return (lj[]) ((Object) stackIn_11_0);
                }
                case 12: {
                    if (var4_ref_csa == null) {
                        statePc = 17;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var5_ref = var4_ref_csa.u(-91);
                    if (var5_ref != null) {
                        statePc = 16;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (var7 == 0) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var2++;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    var3_int++;
                    if (var7 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if (param0 != -103) {
                        statePc = 28;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var3 = new lj[var2];
                    var2 = 0;
                    var4 = 0;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    if (this.field_f.length <= var4) {
                        statePc = 26;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    stackOut_21_0 = this.field_f;
                    stackIn_27_0 = stackOut_21_0;
                    stackIn_22_0 = stackOut_21_0;
                    if (var7 != 0) {
                        statePc = 27;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    var5 = stackIn_22_0[var4];
                    if (var5 == null) {
                        statePc = 25;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    var6 = var5.u(param0 + -24);
                    if (var6 == null) {
                        statePc = 25;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    var3[var2] = var6;
                    var2++;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    var4++;
                    if (var7 == 0) {
                        statePc = 20;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    stackIn_27_0 = (lj[]) (var3);
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    return (lj[]) ((Object) stackIn_27_0);
                }
                case 28: {
                    return (lj[]) null;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static String a(int param0, boolean param1, int param2, long param3, int param4) {
        StringBuilder discarded$85 = null;
        StringBuilder discarded$86 = null;
        StringBuilder discarded$87 = null;
        StringBuilder discarded$88 = null;
        StringBuilder discarded$89 = null;
        StringBuilder discarded$90 = null;
        StringBuilder discarded$91 = null;
        StringBuilder discarded$92 = null;
        StringBuilder discarded$93 = null;
        StringBuilder discarded$94 = null;
        StringBuilder discarded$95 = null;
        StringBuilder discarded$96 = null;
        StringBuilder discarded$97 = null;
        StringBuilder discarded$98 = null;
        StringBuilder discarded$99 = null;
        StringBuilder discarded$100 = null;
        StringBuilder discarded$101 = null;
        StringBuilder discarded$102 = null;
        StringBuilder discarded$103 = null;
        StringBuilder discarded$104 = null;
        StringBuilder discarded$105 = null;
        StringBuilder discarded$106 = null;
        StringBuilder discarded$107 = null;
        StringBuilder discarded$108 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = TombRacer.field_G ? 1 : 0;
                    var6 = 44;
                    var7 = 46;
                    if (0 == param2) {
                        statePc = 2;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var6 = 46;
                    var7 = 44;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (param2 == 2) {
                        statePc = 5;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var7 = 160;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    var8 = 0;
                    if (-1L >= (param3 ^ -1L)) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var8 = 1;
                    param3 = -param3;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    var9 = new StringBuilder(26);
                    if (param4 > 0) {
                        statePc = 39;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (param0 == 2843) {
                        statePc = 24;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    f.a(true);
                    var10 = 0;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    var11 = (int)param3;
                    param3 = param3 / 10L;
                    discarded$85 = var9.append((char)(-(10 * (int)param3) + (var11 + 48)));
                    if ((param3 ^ -1L) != -1L) {
                        statePc = 15;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (var12 != 0) {
                        statePc = 19;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (var12 == 0) {
                        statePc = 20;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (!param1) {
                        statePc = 19;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var10++;
                    if (0 == var10 % 3) {
                        statePc = 18;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 18: {
                    discarded$86 = var9.append((char) var7);
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if (var12 == 0) {
                        statePc = 11;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (var8 != 0) {
                        statePc = 22;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 22: {
                    discarded$87 = var9.append('-');
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    return var9.reverse().toString();
                }
                case 24: {
                    var10 = 0;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    var11 = (int)param3;
                    param3 = param3 / 10L;
                    discarded$88 = var9.append((char)(-(10 * (int)param3) + (var11 + 48)));
                    if ((param3 ^ -1L) != -1L) {
                        statePc = 29;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (var12 != 0) {
                        statePc = 33;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    if (var12 == 0) {
                        statePc = 34;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if (!param1) {
                        statePc = 33;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    var10++;
                    if (0 == var10 % 3) {
                        statePc = 32;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 32: {
                    discarded$89 = var9.append((char) var7);
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    if (var12 == 0) {
                        statePc = 25;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    if (var8 != 0) {
                        statePc = 36;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 36: {
                    discarded$90 = var9.append('-');
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    return var9.reverse().toString();
                }
                case 39: {
                    var10 = 0;
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    if (param4 <= var10) {
                        statePc = 44;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    var11 = (int)param3;
                    param3 = param3 / 10L;
                    discarded$91 = var9.append((char)(-((int)param3 * 10) + var11 + 48));
                    var10++;
                    if (var12 != 0) {
                        statePc = 91;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if (var12 == 0) {
                        statePc = 40;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 44: {
                    discarded$92 = var9.append((char) var6);
                    if (param0 == 2843) {
                        statePc = 59;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    f.a(true);
                    var10 = 0;
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    var11 = (int)param3;
                    param3 = param3 / 10L;
                    discarded$93 = var9.append((char)(-(10 * (int)param3) + (var11 + 48)));
                    if ((param3 ^ -1L) != -1L) {
                        statePc = 50;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if (var12 != 0) {
                        statePc = 54;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    if (var12 == 0) {
                        statePc = 55;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    if (!param1) {
                        statePc = 54;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    var10++;
                    if (0 == var10 % 3) {
                        statePc = 53;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 53: {
                    discarded$94 = var9.append((char) var7);
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    if (var12 == 0) {
                        statePc = 46;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    if (var8 != 0) {
                        statePc = 57;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 57: {
                    discarded$95 = var9.append('-');
                    statePc = 58;
                    continue stateLoop;
                }
                case 58: {
                    return var9.reverse().toString();
                }
                case 59: {
                    var10 = 0;
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    var11 = (int)param3;
                    param3 = param3 / 10L;
                    discarded$96 = var9.append((char)(-(10 * (int)param3) + (var11 + 48)));
                    if ((param3 ^ -1L) != -1L) {
                        statePc = 64;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    if (var12 != 0) {
                        statePc = 68;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    if (var12 == 0) {
                        statePc = 69;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    if (!param1) {
                        statePc = 68;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    var10++;
                    if (0 == var10 % 3) {
                        statePc = 67;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 67: {
                    discarded$97 = var9.append((char) var7);
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    if (var12 == 0) {
                        statePc = 60;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    if (var8 != 0) {
                        statePc = 71;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 71: {
                    discarded$98 = var9.append('-');
                    statePc = 72;
                    continue stateLoop;
                }
                case 72: {
                    return var9.reverse().toString();
                }
                case 74: {
                    discarded$99 = var9.append((char) var6);
                    if (param0 == 2843) {
                        statePc = 76;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    f.a(true);
                    statePc = 76;
                    continue stateLoop;
                }
                case 76: {
                    var10 = 0;
                    statePc = 77;
                    continue stateLoop;
                }
                case 77: {
                    var11 = (int)param3;
                    param3 = param3 / 10L;
                    discarded$100 = var9.append((char)(-(10 * (int)param3) + (var11 + 48)));
                    if ((param3 ^ -1L) != -1L) {
                        statePc = 81;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    if (var12 != 0) {
                        statePc = 85;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    if (var12 == 0) {
                        statePc = 86;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    if (!param1) {
                        statePc = 85;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    var10++;
                    if (0 == var10 % 3) {
                        statePc = 84;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 84: {
                    discarded$101 = var9.append((char) var7);
                    statePc = 85;
                    continue stateLoop;
                }
                case 85: {
                    if (var12 == 0) {
                        statePc = 77;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    if (var8 != 0) {
                        statePc = 88;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 88: {
                    discarded$102 = var9.append('-');
                    statePc = 89;
                    continue stateLoop;
                }
                case 89: {
                    return var9.reverse().toString();
                }
                case 91: {
                    if (param0 != 2843) {
                        statePc = 106;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    var10 = 0;
                    statePc = 93;
                    continue stateLoop;
                }
                case 93: {
                    var11 = (int)param3;
                    param3 = param3 / 10L;
                    discarded$103 = var9.append((char)(-(10 * (int)param3) + (var11 + 48)));
                    if ((param3 ^ -1L) != -1L) {
                        statePc = 97;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    if (var12 != 0) {
                        statePc = 101;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    if (var12 == 0) {
                        statePc = 102;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    if (!param1) {
                        statePc = 101;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    var10++;
                    if (0 == var10 % 3) {
                        statePc = 100;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 100: {
                    discarded$104 = var9.append((char) var7);
                    statePc = 101;
                    continue stateLoop;
                }
                case 101: {
                    if (var12 == 0) {
                        statePc = 93;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    if (var8 != 0) {
                        statePc = 104;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 104: {
                    discarded$105 = var9.append('-');
                    statePc = 105;
                    continue stateLoop;
                }
                case 105: {
                    return var9.reverse().toString();
                }
                case 106: {
                    f.a(true);
                    var10 = 0;
                    statePc = 107;
                    continue stateLoop;
                }
                case 107: {
                    var11 = (int)param3;
                    param3 = param3 / 10L;
                    discarded$106 = var9.append((char)(-(10 * (int)param3) + (var11 + 48)));
                    if ((param3 ^ -1L) != -1L) {
                        statePc = 111;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    if (var12 != 0) {
                        statePc = 115;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    if (var12 == 0) {
                        statePc = 116;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    if (!param1) {
                        statePc = 115;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 112: {
                    var10++;
                    if (0 == var10 % 3) {
                        statePc = 114;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 114: {
                    discarded$107 = var9.append((char) var7);
                    statePc = 115;
                    continue stateLoop;
                }
                case 115: {
                    if (var12 == 0) {
                        statePc = 107;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 116: {
                    if (var8 != 0) {
                        statePc = 118;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 118: {
                    discarded$108 = var9.append('-');
                    statePc = 119;
                    continue stateLoop;
                }
                case 119: {
                    return var9.reverse().toString();
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void b(int param0) {
        vo.field_b = false;
        if (!(kga.field_n == null)) {
            kga.field_n.a(true);
        }
        int var1 = -18 % ((-10 - param0) / 43);
        if (!(bta.field_q == 0)) {
            ufa.a(true);
        }
        wv.field_j = 0;
    }

    final static void b(byte param0) {
        int incrementValue$0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_26_0 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        double var1_double = 0.0;
        RuntimeException var1 = null;
        int var3 = 0;
        int var4 = 0;
        float var5 = 0.0f;
        float var6 = 0.0f;
        int var7 = 0;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        int var13 = 0;
        int var14 = 0;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        float var18 = 0.0f;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var23 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (null != bt.field_h) {
                            statePc = 3;
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
                        bt.field_h = new int[65536];
                        if (var23 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return;
                }
                case 4: {
                    try {
                        var1_double = Math.random() * 0.03 - 0.015 + 0.7;
                        var3 = 0;
                        var4 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_6_0 = -513;
                        stackIn_6_1 = var4 ^ -1;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (stackIn_6_0 >= stackIn_6_1) {
                            statePc = 25;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var5 = 360.0f * ((float)(var4 >> 508759011) / 64.0f + 0.0078125f);
                        var6 = 0.0625f + (float)(7 & var4) / 8.0f;
                        stackIn_26_0 = 0;
                        stackIn_8_0 = stackIn_26_0;
                        if (var23 != 0) {
                            statePc = 26;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var7 = stackIn_8_0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var7 >= 128) {
                            statePc = 24;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var8 = (float)var7 / 128.0f;
                        var9 = 0.0f;
                        var10 = 0.0f;
                        var11 = 0.0f;
                        var12 = var5 / 60.0f;
                        var13 = (int)var12;
                        var14 = var13 % 6;
                        var15 = var12 - (float)var13;
                        var16 = (-var6 + 1.0f) * var8;
                        var17 = var8 * (1.0f - var15 * var6);
                        var18 = var8 * (-(var6 * (1.0f - var15)) + 1.0f);
                        stackIn_6_0 = 0;
                        stackIn_11_0 = stackIn_6_0;
                        stackIn_6_1 = var14;
                        stackIn_11_1 = stackIn_6_1;
                        if (var23 != 0) {
                            statePc = 6;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (stackIn_11_0 != stackIn_11_1) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var9 = var8;
                        var11 = var16;
                        var10 = var18;
                        if (var23 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (-2 == (var14 ^ -1)) {
                            statePc = 22;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var14 == 2) {
                            statePc = 21;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if ((var14 ^ -1) == -4) {
                            statePc = 20;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if ((var14 ^ -1) == -5) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if ((var14 ^ -1) != -6) {
                            statePc = 23;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var11 = var17;
                        var9 = var8;
                        var10 = var16;
                        if (var23 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var11 = var8;
                        var9 = var18;
                        var10 = var16;
                        if (var23 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var10 = var17;
                        var11 = var8;
                        var9 = var16;
                        if (var23 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var9 = var16;
                        var11 = var18;
                        var10 = var8;
                        if (var23 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var9 = var17;
                        var10 = var8;
                        var11 = var16;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var9 = (float)Math.pow((double)var9, var1_double);
                        var10 = (float)Math.pow((double)var10, var1_double);
                        var11 = (float)Math.pow((double)var11, var1_double);
                        var19 = (int)(256.0f * var9);
                        var20 = (int)(256.0f * var10);
                        var21 = (int)(var11 * 256.0f);
                        var22 = var21 + ((var19 << 1215244016) + -16777216) - -(var20 << -2110225432);
                        incrementValue$0 = var3;
                        var3++;
                        bt.field_h[incrementValue$0] = var22;
                        var7++;
                        if (var23 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var4++;
                        if (var23 == 0) {
                            statePc = 5;
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
                        stackIn_26_0 = param0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (stackIn_26_0 == 58) {
                            statePc = 30;
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
                        f.b((byte) 1);
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 29: {
                    var1 = (RuntimeException) ((Object) caughtException);
                    throw tba.a((Throwable) ((Object) var1), "f.F(" + param0 + ')');
                }
                case 30: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void c(int param0) {
        field_e = null;
        field_c = null;
        if (param0 != 24641) {
            field_b = -112;
        }
    }

    final static int a(boolean param0) {
        if (!param0) {
          if (lca.a(param0)) {
            if (null == wu.field_a.a((byte) 127)) {
              return -1;
            } else {
              return wu.field_a.a((byte) -73).field_i;
            }
          } else {
            return -1;
          }
        } else {
          f.b((byte) -68);
          if (lca.a(param0)) {
            if (null == wu.field_a.a((byte) 127)) {
              return -1;
            } else {
              return wu.field_a.a((byte) -73).field_i;
            }
          } else {
            return -1;
          }
        }
    }

    f(int param0, int param1) {
        this.field_a = param0;
        this.field_f = new csa[]{};
    }

    f(int param0, int param1, int param2, kh param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        cva[] stackIn_7_0;
        int stackIn_7_1;
        cva stackIn_7_2;
        cva stackIn_7_3;
        cva[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        cva stackIn_8_2 = null;
        cva stackIn_8_3 = null;
        int stackIn_8_4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            this.field_a = param0;
            var5_int = param3.b((byte) 44, iia.d(param0, 22972));
            this.field_f = new csa[var5_int];
            this.field_d = new cva[var5_int];
            var6 = 0;
            L1: while (true) {
              L2: {
                if (var6 >= var5_int) {
                  break L2;
                } else {
                  if (var7 == 0) {
                    L3: {
                      stackIn_7_0 = this.field_d;

                      stackIn_7_1 = var6;

                      stackIn_7_2 = null;

                      stackIn_7_3 = null;

                      if (param3.b((byte) 44, 1) != 1) {
                        stackIn_8_0 = (cva[]) ((Object) stackIn_7_0);
                        stackIn_8_1 = stackIn_7_1;
                        stackIn_8_2 = null;
                        stackIn_8_3 = null;
                        stackIn_8_4 = 0;
                        break L3;
                      } else {
                        stackIn_8_0 = (cva[]) ((Object) stackIn_7_0);
                        stackIn_8_1 = stackIn_7_1;
                        stackIn_8_2 = null;
                        stackIn_8_3 = null;
                        stackIn_8_4 = 1;
                        break L3;
                      }
                    }
                    stackIn_8_0[stackIn_8_1] = new cva(stackIn_8_4 != 0, param3.b((byte) 44, 8));
                    var6++;
                    if (var7 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  } else {
                    return;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (runtimeException);

            stackIn_12_1 = new StringBuilder().append("f.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    final void a(kh param0, int param1, csa param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 > 105) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_c = (int[]) null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        this.a(0);
                        param0.a((byte) 44, this.field_f.length, iia.d(this.field_a, 22972));
                        var4_int = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (this.field_f.length <= var4_int) {
                            statePc = 20;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var5 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        return;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (param2 == this.field_f[var4_int].o((byte) -48)) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        param0.a((byte) 73, 0, 1);
                        param0.a((byte) 111, this.field_f[var4_int].n(31974).a((byte) 62), 8);
                        if (var5 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        param0.a((byte) -127, 1, 1);
                        param0.a((byte) -126, this.field_f[var4_int].i((byte) 84).a((byte) 115), 8);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var4_int++;
                        if (var5 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_15_0 = (RuntimeException) (runtimeException);
                    stackIn_14_0 = stackIn_15_0;
                    stackIn_15_1 = new StringBuilder().append("f.B(");
                    stackIn_14_1 = stackIn_15_1;
                    if (param0 == null) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    stackIn_16_0 = (RuntimeException) ((Object) stackIn_14_0);
                    stackIn_16_1 = (StringBuilder) ((Object) stackIn_14_1);
                    stackIn_16_2 = "{...}";
                    statePc = 16;
                    continue stateLoop;
                }
                case 15: {
                    stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                    stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                    stackIn_16_2 = "null";
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    stackIn_18_0 = (RuntimeException) ((Object) stackIn_16_0);
                    stackIn_17_0 = stackIn_18_0;
                    stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',');
                    stackIn_17_1 = stackIn_18_1;
                    if (param2 == null) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    stackIn_19_0 = (RuntimeException) ((Object) stackIn_17_0);
                    stackIn_19_1 = (StringBuilder) ((Object) stackIn_17_1);
                    stackIn_19_2 = "{...}";
                    statePc = 19;
                    continue stateLoop;
                }
                case 18: {
                    stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
                    stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                    stackIn_19_2 = "null";
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    throw tba.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
                }
                case 20: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
    }
}
