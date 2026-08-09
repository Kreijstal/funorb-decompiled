/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class mf {
    private nj[] field_f;
    static int field_c;
    static dd field_g;
    int[] field_d;
    static mf field_e;
    static dd field_b;
    static fi[] field_a;

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = fleas.field_A ? 1 : 0;
                    var6 = -1 + this.field_f.length;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (-1 < (var6 ^ -1)) {
                        statePc = 10;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (var7 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    return;
                }
                case 4: {
                    if (null == this.field_f[var6]) {
                        statePc = 8;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (!this.field_f[var6].b(param3 + 4522)) {
                        statePc = 9;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    this.field_f[var6] = new nj(param2, param0, param1, param4, this.field_d);
                    if (var7 == 0) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    this.field_f[var6] = new nj(param2, param0, param1, param4, this.field_d);
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    var6--;
                    if (var7 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (param3 == -4575) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    this.a(-12, -98, -85, -78, -93);
                    return;
                }
                case 12: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 != -9) {
            return;
        }
        field_a = null;
        field_g = null;
        field_e = null;
    }

    final void a(int param0) {
        int var3 = fleas.field_A ? 1 : 0;
        int var2 = this.field_f.length - param0;
        do {
            if ((var2 ^ -1) > -1) {
                return;
            }
            if (var3 != 0) {
                return;
            }
            if (!(null == this.field_f[var2])) {
                this.field_f[var2].c(-55);
            }
            var2--;
        } while (var3 == 0);
    }

    final static Boolean a(boolean param0) {
        Boolean var1 = null;
        if (!param0) {
            field_b = (dd) null;
            var1 = bb.field_A;
            bb.field_A = null;
            return var1;
        }
        var1 = bb.field_A;
        bb.field_A = null;
        return var1;
    }

    mf(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = fleas.field_A ? 1 : 0;
                    na.field_c = new Random((long)param1);
                    this.field_f = new nj[param0];
                    this.field_d = new int[255];
                    var3 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (var3 >= 255) {
                        statePc = 5;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    this.field_d[var3] = var3 * 65793;
                    var3++;
                    if (var4 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    return;
                }
                case 4: {
                    if (var4 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_a = new fi[2];
    }
}
