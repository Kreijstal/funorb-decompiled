/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uh {
    static o[] field_l;
    int field_E;
    short field_F;
    int[] field_M;
    static String field_r;
    short[] field_s;
    int field_Q;
    int[] field_h;
    int[] field_u;
    short[] field_n;
    byte field_j;
    int[] field_i;
    short field_y;
    short[] field_J;
    short[] field_B;
    short[] field_e;
    static String field_P;
    short field_b;
    int field_G;
    int field_m;
    short[] field_D;
    int[] field_I;
    short[] field_K;
    int[] field_x;
    private boolean field_f;
    short[] field_A;
    int field_t;
    short[] field_a;
    int[] field_p;
    short[] field_w;
    byte[] field_k;
    int field_N;
    short[] field_z;
    short[] field_v;
    short[] field_q;
    short[] field_o;
    short[] field_g;
    int[] field_L;
    short[] field_c;
    short[] field_C;
    int[] field_O;
    short[] field_H;
    static int field_d;

    private final void a(boolean param0) {
        this.field_f = param0 ? true : false;
    }

    final void b(int param0) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = SolKnight.field_L ? 1 : 0;
        if (this.field_f) {
            return;
        }
        this.field_f = true;
        int var2 = param0;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        do {
            if (this.field_y <= var8) {
                this.field_Q = var5;
                this.field_t = var3;
                this.field_m = var6;
                this.field_N = var7;
                this.field_E = var2;
                this.field_G = var4;
                return;
            }
            var9 = this.field_n[var8];
            var10 = this.field_q[var8];
            if (var12 != 0) {
                return;
            }
            if (!(var10 >= var3)) {
                var3 = var10;
            }
            var11 = this.field_z[var8];
            if (var6 < var10) {
                var6 = var10;
            }
            if (var9 > var5) {
                var5 = var9;
            }
            if (var9 < var2) {
                var2 = var9;
            }
            if (!(var7 >= var11)) {
                var7 = var11;
            }
            if (!(var4 <= var11)) {
                var4 = var11;
            }
            var8++;
        } while (var12 == 0);
        this.field_Q = var5;
        this.field_t = var3;
        this.field_m = var6;
        this.field_N = var7;
        this.field_E = var2;
        this.field_G = var4;
    }

    public static void a(int param0) {
        if (param0 != -18662) {
          field_d = -118;
          field_l = null;
          field_r = null;
          field_P = null;
          return;
        } else {
          field_l = null;
          field_r = null;
          field_P = null;
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int statePc = 0;
        int var6 = 0;
        int var7 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = SolKnight.field_L ? 1 : 0;
                    if (param0 == 8292) {
                        statePc = 10;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    this.a(false);
                    var6 = 0;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (var6 < this.field_y) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    this.a(false);
                    return;
                }
                case 4: {
                    this.field_n[var6] = (short)(param2 * this.field_n[var6] / param1);
                    this.field_q[var6] = (short)(param4 * this.field_q[var6] / param1);
                    this.field_z[var6] = (short)(param3 * this.field_z[var6] / param1);
                    var6++;
                    if (var7 == 0) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    return;
                }
                case 6: {
                    if (var7 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    this.a(false);
                    return;
                }
                case 10: {
                    var6 = 0;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    if (var6 < this.field_y) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    this.a(false);
                    return;
                }
                case 13: {
                    this.field_n[var6] = (short)(param2 * this.field_n[var6] / param1);
                    this.field_q[var6] = (short)(param4 * this.field_q[var6] / param1);
                    this.field_z[var6] = (short)(param3 * this.field_z[var6] / param1);
                    var6++;
                    if (var7 == 0) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    return;
                }
                case 15: {
                    if (var7 == 0) {
                        statePc = 11;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    this.a(false);
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = SolKnight.field_L ? 1 : 0;
                    var5 = 0;
                    if (param1 != -32768) {
                        statePc = 9;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (this.field_y > var5) {
                        statePc = 3;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    this.a(false);
                    return;
                }
                case 3: {
                    this.field_n[var5] = (short)(this.field_n[var5] + param0);
                    this.field_q[var5] = (short)(this.field_q[var5] + param2);
                    this.field_z[var5] = (short)(this.field_z[var5] + param3);
                    var5++;
                    if (var6 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    return;
                }
                case 5: {
                    if (var6 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    this.a(false);
                    return;
                }
                case 9: {
                    this.a(56, -36, 64, 112, -90);
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if (this.field_y > var5) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    this.a(false);
                    return;
                }
                case 12: {
                    this.field_n[var5] = (short)(this.field_n[var5] + param0);
                    this.field_q[var5] = (short)(this.field_q[var5] + param2);
                    this.field_z[var5] = (short)(this.field_z[var5] + param3);
                    var5++;
                    if (var6 == 0) {
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
                    if (var6 == 0) {
                        statePc = 10;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    this.a(false);
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    uh() {
        this.field_f = false;
        this.field_j = (byte) 0;
    }

    static {
        field_P = "This password contains repeated characters, and would be easy to guess";
    }
}
