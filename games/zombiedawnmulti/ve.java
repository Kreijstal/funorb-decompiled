/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ve {
    private Random field_l;
    static String field_a;
    private int[] field_c;
    private double field_h;
    int field_k;
    private double field_f;
    private double field_e;
    private int field_d;
    private int field_i;
    private double field_g;
    private double field_j;
    static ja field_b;

    final static void a(long param0, int param1, String param2, tq param3, String param4, cj param5, int param6, int[] param7, int param8) {
        try {
            vc.field_d = param3;
            if (param1 != 196) {
                ve.a((byte) 2);
            }
            pk.field_b = new jb(param5, param0, param4, param2, param8, param6, param7);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "ve.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ',' + param8 + ')');
        }
    }

    final void a(int param0, int param1, boolean param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = ZombieDawnMulti.field_E ? 1 : 0;
                    this.field_l.setSeed((long)this.field_k);
                    var8 = (65454 & param0) >> 2037672744;
                    var7 = param0 >> 789514224;
                    var9 = 255 & param0;
                    if (param5 == -1963) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return;
                }
                case 2: {
                    var10 = 0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if ((var10 ^ -1) <= -256) {
                        statePc = 33;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var11 = (int)(Math.pow((double)var10, 1.5) / 16.0);
                    this.field_c[var10] = cr.b(cr.b(var11 * var8 >> 1326367176 << -1295872824, var11 * var7 >> -1767996728 << 34601040), var9 * var11 >> -1849364120);
                    var10++;
                    if (var12 != 0) {
                        statePc = 46;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (var12 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (param2) {
                        statePc = 20;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var10 = 0;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (var10 < this.field_d) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    return;
                }
                case 10: {
                    if (var12 == 0) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    return;
                }
                case 12: {
                    if (!param2) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    oo.a(param1 << 332843588, param3 << 1236931428, this.field_i * var10 << -306831324, 254 / (var10 + 1), this.field_c);
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if (param2) {
                        statePc = 16;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 16: {
                    oo.a(param1 << 1803153860, param3 << -151686780, this.field_i * var10 << 1643550564, 196 / (1 + var10), this.field_c);
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    this.a(param2, param0, this.field_i, this.field_j + (-0.5 + this.a(true)) * this.field_h, param3, param4, param1, (byte) -69, 0);
                    var10++;
                    if (var12 == 0) {
                        statePc = 8;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    return;
                }
                case 20: {
                    oo.a(param1 << -1904160444, param3 << 899003428, this.field_i * 2 << 890753444, 254, this.field_c);
                    var10 = 0;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    if (var10 < this.field_d) {
                        statePc = 23;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    return;
                }
                case 23: {
                    if (var12 == 0) {
                        statePc = 25;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    return;
                }
                case 25: {
                    if (!param2) {
                        statePc = 27;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    oo.a(param1 << 332843588, param3 << 1236931428, this.field_i * var10 << -306831324, 254 / (var10 + 1), this.field_c);
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    if (param2) {
                        statePc = 29;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 29: {
                    oo.a(param1 << 1803153860, param3 << -151686780, this.field_i * var10 << 1643550564, 196 / (1 + var10), this.field_c);
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    this.a(param2, param0, this.field_i, this.field_j + (-0.5 + this.a(true)) * this.field_h, param3, param4, param1, (byte) -69, 0);
                    var10++;
                    if (var12 == 0) {
                        statePc = 21;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    return;
                }
                case 33: {
                    if (param2) {
                        statePc = 58;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    var10 = 0;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    if (var10 < this.field_d) {
                        statePc = 37;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    return;
                }
                case 37: {
                    if (var12 == 0) {
                        statePc = 39;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    return;
                }
                case 39: {
                    if (!param2) {
                        statePc = 41;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    oo.a(param1 << 332843588, param3 << 1236931428, this.field_i * var10 << -306831324, 254 / (var10 + 1), this.field_c);
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    if (param2) {
                        statePc = 43;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 43: {
                    oo.a(param1 << 1803153860, param3 << -151686780, this.field_i * var10 << 1643550564, 196 / (1 + var10), this.field_c);
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    this.a(param2, param0, this.field_i, this.field_j + (-0.5 + this.a(true)) * this.field_h, param3, param4, param1, (byte) -69, 0);
                    var10++;
                    if (var12 == 0) {
                        statePc = 35;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    return;
                }
                case 46: {
                    oo.a(param1 << -1904160444, param3 << 899003428, this.field_i * 2 << 890753444, 254, this.field_c);
                    var10 = 0;
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    if (var10 < this.field_d) {
                        statePc = 49;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    return;
                }
                case 49: {
                    if (var12 == 0) {
                        statePc = 51;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    return;
                }
                case 51: {
                    if (!param2) {
                        statePc = 53;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    oo.a(param1 << 332843588, param3 << 1236931428, this.field_i * var10 << -306831324, 254 / (var10 + 1), this.field_c);
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    if (param2) {
                        statePc = 55;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 55: {
                    oo.a(param1 << 1803153860, param3 << -151686780, this.field_i * var10 << 1643550564, 196 / (1 + var10), this.field_c);
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    this.a(param2, param0, this.field_i, this.field_j + (-0.5 + this.a(true)) * this.field_h, param3, param4, param1, (byte) -69, 0);
                    var10++;
                    if (var12 == 0) {
                        statePc = 47;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    return;
                }
                case 58: {
                    oo.a(param1 << -1904160444, param3 << 899003428, this.field_i * 2 << 890753444, 254, this.field_c);
                    var10 = 0;
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    if (var10 < this.field_d) {
                        statePc = 61;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    return;
                }
                case 61: {
                    if (var12 == 0) {
                        statePc = 63;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    return;
                }
                case 63: {
                    if (!param2) {
                        statePc = 65;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    oo.a(param1 << 332843588, param3 << 1236931428, this.field_i * var10 << -306831324, 254 / (var10 + 1), this.field_c);
                    statePc = 65;
                    continue stateLoop;
                }
                case 65: {
                    if (param2) {
                        statePc = 67;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 67: {
                    oo.a(param1 << 1803153860, param3 << -151686780, this.field_i * var10 << 1643550564, 196 / (1 + var10), this.field_c);
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    this.a(param2, param0, this.field_i, this.field_j + (-0.5 + this.a(true)) * this.field_h, param3, param4, param1, (byte) -69, 0);
                    var10++;
                    if (var12 == 0) {
                        statePc = 59;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final double a(boolean param0) {
        int[] var3;
        if (!param0) {
          var3 = (int[]) null;
          ve.a(-109L, -96, (String) null, (tq) null, (String) null, (cj) null, 73, (int[]) null, 6);
          return (double)hp.a((byte) 115, this.field_l, 1000) / 1000.0;
        } else {
          return (double)hp.a((byte) 115, this.field_l, 1000) / 1000.0;
        }
    }

    private final void a(boolean param0, int param1, int param2, double param3, int param4, int param5, int param6, byte param7, int param8) {
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var16 = ZombieDawnMulti.field_E ? 1 : 0;
                    if (param8 <= 5) {
                        statePc = 3;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return;
                }
                case 3: {
                    if ((param2 ^ -1) <= -2) {
                        statePc = 6;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    return;
                }
                case 6: {
                    var11 = param6 + (int)(nm.a(0, param3) * (double)param2);
                    var12 = param4 + (int)((double)param2 * gh.a(param3, (byte) 19));
                    var13 = hp.a((byte) -86, this.field_l, (int)(2.0 * this.field_g));
                    var14 = param2 * 126 / this.field_i + 60;
                    if (!param0) {
                        statePc = 27;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    oo.a(var11 << -637848540, var12 << 125549764, param2 << 356293060, var14, this.field_c);
                    oo.a(var11 << 1805620548, var12 << -1544182876, param2 << 1823212323, var14 / 2, this.field_c);
                    if (param7 == -69) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    this.field_g = 0.8709670644428569;
                    statePc = 18;
                    continue stateLoop;
                }
                case 9: {
                    oo.g(param6, param4, var11, var12, param5);
                    oo.g(param6 - -1, param4, var11, var12, param5);
                    oo.g(param6, 1 + param4, var11, var12, param5);
                    var15 = 0;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if (var15 < var13) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    return;
                }
                case 12: {
                    this.a(param0, param1, (int)((double)param2 * this.field_e), (-0.5 + this.a(true)) * this.field_f + param3, var12, param5, var11, (byte) -69, param8 + 1);
                    var15++;
                    if (var16 == 0) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    return;
                }
                case 14: {
                    if (var16 == 0) {
                        statePc = 10;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    return;
                }
                case 18: {
                    oo.g(param6, param4, var11, var12, param5);
                    oo.g(param6 - -1, param4, var11, var12, param5);
                    oo.g(param6, 1 + param4, var11, var12, param5);
                    var15 = 0;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if (var15 < var13) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    return;
                }
                case 21: {
                    this.a(param0, param1, (int)((double)param2 * this.field_e), (-0.5 + this.a(true)) * this.field_f + param3, var12, param5, var11, (byte) -69, param8 + 1);
                    var15++;
                    if (var16 == 0) {
                        statePc = 23;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    return;
                }
                case 23: {
                    if (var16 == 0) {
                        statePc = 19;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    return;
                }
                case 27: {
                    if (param7 == -69) {
                        statePc = 29;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    this.field_g = 0.8709670644428569;
                    statePc = 37;
                    continue stateLoop;
                }
                case 29: {
                    oo.g(param6, param4, var11, var12, param5);
                    oo.g(param6 - -1, param4, var11, var12, param5);
                    oo.g(param6, 1 + param4, var11, var12, param5);
                    var15 = 0;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    if (var15 >= var13) {
                        statePc = 36;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    this.a(param0, param1, (int)((double)param2 * this.field_e), (-0.5 + this.a(true)) * this.field_f + param3, var12, param5, var11, (byte) -69, param8 + 1);
                    var15++;
                    if (var16 == 0) {
                        statePc = 33;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    return;
                }
                case 33: {
                    if (var16 == 0) {
                        statePc = 30;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    return;
                }
                case 36: {
                    return;
                }
                case 37: {
                    oo.g(param6, param4, var11, var12, param5);
                    oo.g(param6 - -1, param4, var11, var12, param5);
                    oo.g(param6, 1 + param4, var11, var12, param5);
                    var15 = 0;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    if (var15 >= var13) {
                        statePc = 44;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    this.a(param0, param1, (int)((double)param2 * this.field_e), (-0.5 + this.a(true)) * this.field_f + param3, var12, param5, var11, (byte) -69, param8 + 1);
                    var15++;
                    if (var16 == 0) {
                        statePc = 41;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    return;
                }
                case 41: {
                    if (var16 == 0) {
                        statePc = 38;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    return;
                }
                case 44: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 < 61) {
            return;
        }
        field_b = null;
    }

    ve(int param0, int param1, int param2, double param3, double param4, double param5, int param6, double param7, double param8, int param9) {
        this.field_l = new Random();
        this.field_c = new int[255];
        this.field_k = param9;
        this.field_e = param8;
        this.field_h = param4;
        this.field_i = param2;
        this.field_f = param5;
        this.field_d = param6;
        this.field_g = param7;
        this.field_j = param3;
    }

    static {
        field_a = "Powerups and Modifiers";
    }
}
