/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class e {
    short[] field_L;
    private boolean field_z;
    int[] field_Q;
    int[] field_m;
    short[] field_s;
    short[] field_n;
    int field_k;
    short[] field_v;
    static String field_I;
    short[] field_J;
    int[] field_D;
    static String field_q;
    short field_l;
    short field_M;
    short[] field_N;
    int field_i;
    int[] field_E;
    short[] field_e;
    short[] field_B;
    short field_C;
    short[] field_d;
    int[] field_a;
    byte[] field_y;
    int field_P;
    int[] field_g;
    int[] field_j;
    short[] field_H;
    short[] field_G;
    short[] field_f;
    int[] field_p;
    short[] field_b;
    int field_t;
    short[] field_o;
    short[] field_F;
    short[] field_r;
    static String field_x;
    int[] field_c;
    int field_O;
    int field_u;
    byte field_w;
    short[] field_A;
    short[] field_h;

    final void a(int param0) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = Transmogrify.field_A ? 1 : 0;
        if (this.field_z) {
            return;
        }
        this.field_z = true;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        if (param0 != 22856) {
            return;
        }
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        do {
            if (var8 >= this.field_M) {
                this.field_P = var2;
                this.field_i = var7;
                this.field_u = var6;
                this.field_O = var3;
                this.field_t = var5;
                this.field_k = var4;
                return;
            }
            var9 = this.field_v[var8];
            var10 = this.field_d[var8];
            if (var12 != 0) {
                return;
            }
            if (!(var10 <= var6)) {
                var6 = var10;
            }
            if (var9 > var5) {
                var5 = var9;
            }
            if (var10 < var3) {
                var3 = var10;
            }
            var11 = this.field_B[var8];
            if (!(var9 >= var2)) {
                var2 = var9;
            }
            if (var11 < var4) {
                var4 = var11;
            }
            if (var7 < var11) {
                var7 = var11;
            }
            var8++;
        } while (var12 == 0);
        this.field_P = var2;
        this.field_i = var7;
        this.field_u = var6;
        this.field_O = var3;
        this.field_t = var5;
        this.field_k = var4;
    }

    final void a(int param0, int param1, int param2, byte param3) {
        int var5 = 0;
        int var6 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = Transmogrify.field_A ? 1 : 0;
                    var5 = 0;
                    if (param3 >= -126) {
                        statePc = 9;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (this.field_M > var5) {
                        statePc = 3;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    this.c(10);
                    return;
                }
                case 3: {
                    this.field_v[var5] = (short)(this.field_v[var5] + param1);
                    this.field_d[var5] = (short)(this.field_d[var5] + param2);
                    this.field_B[var5] = (short)(this.field_B[var5] + param0);
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
                    this.c(10);
                    return;
                }
                case 9: {
                    this.field_h = (short[]) null;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if (this.field_M > var5) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    this.c(10);
                    return;
                }
                case 12: {
                    this.field_v[var5] = (short)(this.field_v[var5] + param1);
                    this.field_d[var5] = (short)(this.field_d[var5] + param2);
                    this.field_B[var5] = (short)(this.field_B[var5] + param0);
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
                    this.c(10);
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static String a(long param0, byte param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        v.field_a.setTime(new Date(param0));
        var3 = v.field_a.get(7);
        var4 = v.field_a.get(5);
        var5 = v.field_a.get(2);
        var6 = v.field_a.get(1);
        var7 = v.field_a.get(11);
        if (param1 >= -76) {
          e.a(-53L, (byte) 59);
          var8 = v.field_a.get(12);
          var9 = v.field_a.get(13);
          return bh.field_b[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + jj.field_b[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        } else {
          var8 = v.field_a.get(12);
          var9 = v.field_a.get(13);
          return bh.field_b[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + jj.field_b[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        }
    }

    public static void b(int param0) {
        if (param0 <= 38) {
          field_q = (String) null;
          field_q = null;
          field_I = null;
          field_x = null;
          return;
        } else {
          field_q = null;
          field_I = null;
          field_x = null;
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = Transmogrify.field_A ? 1 : 0;
                    var6 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (var6 >= this.field_M) {
                        statePc = 5;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    this.field_v[var6] = (short)(param2 * this.field_v[var6] / param0);
                    this.field_d[var6] = (short)(param3 * this.field_d[var6] / param0);
                    this.field_B[var6] = (short)(this.field_B[var6] * param4 / param0);
                    var6++;
                    if (var7 != 0) {
                        statePc = 13;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (var7 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 5: {
                    this.c(param1 ^ -22855);
                    if (param1 == -22861) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    this.c(118);
                    return;
                }
                case 7: {
                    return;
                }
                case 9: {
                    this.c(param1 ^ -22855);
                    if (param1 == -22861) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    this.c(118);
                    return;
                }
                case 11: {
                    return;
                }
                case 13: {
                    if (param1 == -22861) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    this.c(118);
                    return;
                }
                case 15: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void c(int param0) {
        this.field_z = false;
        if (param0 == 10) {
            return;
        }
        this.c(93);
    }

    e() {
        this.field_z = false;
        this.field_w = (byte) 0;
    }

    static {
        field_q = "Login: ";
        field_x = "Unfortunately your configuration doesn't support fullscreen mode.";
    }
}
